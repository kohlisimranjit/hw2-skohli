package com.cmu.csd.annotator;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;

import com.cmu.csd.constants.AnnotatorConstants;

import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.AnnotatedNGram;
import edu.cmu.deiis.subTypes.AnnotatedQuestion;
import edu.cmu.deiis.subTypes.AnnotatedToken;
import edu.cmu.deiis.subTypes.Document;
import edu.cmu.deiis.subTypes.TokenizedDocument;
import edu.cmu.deiis.subTypes.TokenizedSentence;

public class NGramAnnotator extends JCasAnnotator_ImplBase {
	static int intC = 0;

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		TokenizedDocument tokenizedDocument = null;
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
		 AnnotatedQuestion annotatedQuestion=document.getQuestion();
		 FSArray documentAnswerArray=document.getAnswers();
		//AnnotatedToken annotatedToken = new AnnotatedToken(jCas);
		
		System.out
				.println("-----------------------------------------------------------------------");
		for (int i = 0; i < tokenizedDocument.getTokenizedAnswers().size(); i++) {
			TokenizedSentence tokenizedAnswerInstance = tokenizedDocument
					.getTokenizedAnswers(i);

			
			
			
			double sentenceConfidence=0;
			double nGramConfidence=0;
			int equalizer=0;
			
			for (int j = 1; j <= AnnotatorConstants.MAX_GRAM; j++) {
				equalizer+=j*j;
				FSArray nGramSentence = nGramTokens(tokenizedAnswerInstance, j,jCas);
				double currConfidence=getNGramConfidence(annotatedQuestion, nGramSentence);
				//System.out.println("recieved->"+currConfidence);
				nGramConfidence+=j*j*currConfidence;
				//System.out.println("nGramConfidence"+nGramConfidence+"\t equalizer"+equalizer);
				}
			sentenceConfidence=nGramConfidence/equalizer;
			AnnotatedAnswer annotatedAnswer=(AnnotatedAnswer)documentAnswerArray.get(i);
			annotatedAnswer.setScore(sentenceConfidence); 
			System.out.println(sentenceConfidence);}
		
		}
	//	System.out.println("Fin");
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
			// System.out.println(text);
			nGramSentence.set(i, annotatedNGram);
		}
		return nGramSentence;
	}
	
	
	
	double getNGramConfidence( AnnotatedQuestion annotatedQuestion,FSArray  nGramSentence)
	{
	String questionText=	annotatedQuestion.getText();
double confidence=0;		
		for (int k = 0; k < nGramSentence.size(); k++) {
			AnnotatedNGram annotatedNGram = (AnnotatedNGram) nGramSentence.get(k);
			String nGramString=annotatedNGram.getNGramToken();
			
			
			if(questionText.indexOf(nGramString)>-1)
				confidence++;
		//	System.out.println(annotatedNGram.getNGramToken());

		}
	//	nGramSentence.get
		confidence/=nGramSentence.size();
//		System.out.println("returned Conf"+confidence);
return confidence;
		
		
		
	}
	
	
}
