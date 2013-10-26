package edu.cmu.deiis.annotator;
/**
33    * This class consists exclusively of static methods that operate on or return
34    * collections.  It contains polymorphic algorithms that operate on
35    * collections, "wrappers", which return a new collection backed by a
36    * specified collection, and a few other odds and ends.
37    *
38    * <p>The methods of this class all throw a <tt>NullPointerException</tt>
39    * if the collections or class objects provided to them are null.
40    *
41    * <p>The documentation for the polymorphic algorithms contained in this class
42    * generally includes a brief description of the <i>implementation</i>.  Such
43    * descriptions should be regarded as <i>implementation notes</i>, rather than
44    * parts of the <i>specification</i>.  Implementors should feel free to
45    * substitute other algorithms, so long as the specification itself is adhered
46    * to.  (For example, the algorithm used by <tt>sort</tt> does not have to be
47    * a mergesort, but it does have to be <i>stable</i>.)
48    *
49    * <p>The "destructive" algorithms contained in this class, that is, the
50    * algorithms that modify the collection on which they operate, are specified
51    * to throw <tt>UnsupportedOperationException</tt> if the collection does not
52    * support the appropriate mutation primitive(s), such as the <tt>set</tt>
53    * method.  These algorithms may, but are not required to, throw this
54    * exception if an invocation would have no effect on the collection.  For
55    * example, invoking the <tt>sort</tt> method on an unmodifiable list that is
56    * already sorted may or may not throw <tt>UnsupportedOperationException</tt>.
57    *
58    * <p>This class is a member of the
59    * <a href="{@docRoot}/../technotes/guides/collections/index.html">
60    * Java Collections Framework</a>.
61    *
62    * @author  Josh Bloch
63    * @author  Neal Gafter
64    * @see     Collection
65    * @see     Set
66    * @see     List
67    * @see     Map
68    * @since   1.2
69    */
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;

import edu.cmu.deiis.constants.AnnotatorConstants;
import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.AnnotatedNGram;
import edu.cmu.deiis.subTypes.AnnotatedQuestion;
import edu.cmu.deiis.subTypes.AnnotatedToken;
import edu.cmu.deiis.subTypes.Document;
import edu.cmu.deiis.subTypes.NGramMatrix;
import edu.cmu.deiis.subTypes.TokenizedDocument;
import edu.cmu.deiis.subTypes.TokenizedSentence;

public class AnswerScorer extends JCasAnnotator_ImplBase {
	static int intC = 0;

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		
		FSIndex<Annotation> nGramIndex = jCas
				.getAnnotationIndex(NGramMatrix.type);
		
		Iterator<Annotation> nGramIndexIterator = nGramIndex.iterator();
		
		NGramMatrix nGramMatrix=(NGramMatrix)nGramIndexIterator.next();
		
		TokenizedDocument tokenizedDocument = null;
		FSArray outer=null;
		FSArray inner=null;
		
		FSIndex<Annotation> tokDocIndex = jCas
				.getAnnotationIndex(TokenizedDocument.type);
		Iterator<Annotation> tokDocIterator = tokDocIndex.iterator();
		AnnotatedToken annotatedToken = new AnnotatedToken(jCas);
		tokenizedDocument = (TokenizedDocument) tokDocIterator.next();

		Document document = null;
		FSIndex<Annotation> docIndex = jCas.getAnnotationIndex(Document.type);
		// FSIndex<Annotation> docIndex =
		// jCas.getAnnotationIndex(Document.type);

		Iterator<Annotation> docIterator = docIndex.iterator();

		document = (Document) docIterator.next();
		AnnotatedQuestion annotatedQuestion = document.getQuestion();
		FSArray documentAnswerArray = document.getAnswers();
		// AnnotatedToken annotatedToken = new AnnotatedToken(jCas);

		//System.out.println("-----------------------------------------------------------------------");
		
		
		
		outer=nGramMatrix.getMatrix();
		double meanScore=0;
		for (int i = 0; i < tokenizedDocument.getTokenizedAnswers().size(); i++) {
			TokenizedSentence tokenizedAnswerInstance = tokenizedDocument
					.getTokenizedAnswers(i);

			double sentenceConfidence = 0;
			double nGramConfidence = 0;
			int equalizer = 0;
			AnnotatedAnswer annotatedAnswer = (AnnotatedAnswer) documentAnswerArray
					.get(i);
			
			inner =(FSArray)outer.get(i);
			//System.out.println("annotatedAnswer.getSentiment()"+annotatedAnswer.getSentiment()+"\t annotatedQuestion.getConfidence()"+annotatedQuestion.getConfidence());
			if(annotatedAnswer.getSentiment()==annotatedQuestion.getSentiment()){
			for (int j = 1; j <= AnnotatorConstants.MAX_GRAM; j++) {
				int weight = 1;
				equalizer += weight;
				//equalizer=1;	
				FSArray nGramSentence = (FSArray)inner.get(j-1);
		//		inner.set(j, nGramSentence);
				double currConfidence =0;
				currConfidence=getNGramConfidence(annotatedQuestion,nGramSentence, annotatedAnswer);
				
				nGramConfidence += weight * currConfidence;
				// System.out.println("nGramConfidence"+nGramConfidence+"\t equalizer"+equalizer);
			}
			
			//outer.set(i, inner);
			sentenceConfidence = nGramConfidence / equalizer;}
			
			if(sentenceConfidence<1&& sentenceConfidence>0)
			meanScore+=sentenceConfidence;
			annotatedAnswer.setConfidence(sentenceConfidence);//Score(sentenceConfidence);
			//System.out.println(sentenceConfidence);
		}
		//meanScore=Math.sqrt(meanScore);
		meanScore/=tokenizedDocument.getTokenizedAnswers().size();
	document.setThreshold(meanScore);	
	
	
	
	for (int i = 0; i < tokenizedDocument.getTokenizedAnswers().size(); i++) 
		{	
		AnnotatedAnswer annotatedAnswer = (AnnotatedAnswer) documentAnswerArray
				.get(i);
		if(annotatedAnswer.getConfidence()>=document.getThreshold())
		
		{annotatedAnswer.setScore(1);}
		}
	
	
	
//System.out.println("meanScore"+meanScore);
	}

	
	

	double getNGramConfidence(AnnotatedQuestion annotatedQuestion,
			FSArray nGramSentence, AnnotatedAnswer annotatedAnswer) {
		String questionText = annotatedQuestion.getText();
		String answerText = annotatedAnswer.getText();
		// System.out.println(questionText+"\t"+answerText);
		double confidence = 0;
		for (int k = 0; k < nGramSentence.size(); k++) {
			AnnotatedNGram annotatedNGram = (AnnotatedNGram) nGramSentence
					.get(k);
			String nGramString = annotatedNGram.getNGramToken();

			if (questionText.indexOf(nGramString) > -1)
				confidence++;
			// System.out.println(annotatedNGram.getNGramToken());

		}
		// nGramSentence.get
		confidence /= nGramSentence.size();

		double fluffFacor = ((double) answerText.split(" ").length)
				/ (questionText.split(" ").length - 1);
		if (fluffFacor > 1) {


			confidence = confidence * fluffFacor;
		}
		
		return confidence;

	}

}
