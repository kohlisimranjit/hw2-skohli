package edu.cmu.deiis.annotator;
/**This annotator class generate NGram for each answer.
These NGrams will be filled in the NGramMatrix
*/
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

public class NGramAnnotator extends JCasAnnotator_ImplBase {
	static int intC = 0;

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		NGramMatrix nGramMatrix=new NGramMatrix(jCas);
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
		
		
		
		outer=new FSArray(jCas,tokenizedDocument.getTokenizedAnswers().size());
		
		for (int i = 0; i < tokenizedDocument.getTokenizedAnswers().size(); i++) {
			TokenizedSentence tokenizedAnswerInstance = tokenizedDocument
					.getTokenizedAnswers(i);

			double sentenceConfidence = 0;
			double nGramConfidence = 0;
			int equalizer = 0;
			AnnotatedAnswer annotatedAnswer = (AnnotatedAnswer) documentAnswerArray
					.get(i);
			
			inner =new FSArray(jCas,AnnotatorConstants.MAX_GRAM);
			for (int j = 1; j <= AnnotatorConstants.MAX_GRAM; j++) {
				int weight = 1;//j;
				equalizer += weight;
				FSArray nGramSentence = nGramTokens(tokenizedAnswerInstance, j,
						jCas);
				inner.set(j-1, nGramSentence);
			//	double currConfidence = getNGramConfidence(annotatedQuestion,nGramSentence, annotatedAnswer);
				
			//	nGramConfidence += weight * currConfidence;
				// System.out.println("nGramConfidence"+nGramConfidence+"\t equalizer"+equalizer);
			}
			
			outer.set(i, inner);
			sentenceConfidence = nGramConfidence / equalizer;

			annotatedAnswer.setConfidence(sentenceConfidence);//Score(sentenceConfidence);
			//System.out.println(sentenceConfidence);
		}
		nGramMatrix.setMatrix(outer);
		nGramMatrix.addToIndexes();

	}

	// System.out.println("Fin");

	static FSArray nGramTokens(TokenizedSentence tokenizedSentence, int nGram,
			JCas jCas) {
		FSArray tokenArray = tokenizedSentence.getAnnotatedTokens();
		FSArray nGramSentence = new FSArray(jCas, tokenArray.size()
				- (nGram - 1));
		for (int i = 0; i < tokenArray.size() - (nGram - 1); i++) {
			String text = "";
			int begin = -1;
			for (int j = 0; j < nGram; j++) {
				AnnotatedToken t = (AnnotatedToken) tokenArray.get(i + j);

				if (j == 0) {
					begin = t.getBegin();
				}
				text += t.getTokenText() + " ";
			}
			AnnotatedNGram annotatedNGram = new AnnotatedNGram(jCas);
			annotatedNGram.setNGramToken(text.trim());
			annotatedNGram.setBegin(begin);
			annotatedNGram.setEnd(annotatedNGram.getBegin() + text.length());
			
			nGramSentence.set(i, annotatedNGram);
		}
		return nGramSentence;
	}

	

}
