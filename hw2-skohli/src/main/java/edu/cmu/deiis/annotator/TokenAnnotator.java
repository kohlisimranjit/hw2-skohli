package edu.cmu.deiis.annotator;
/**This annotator class generates tokens for each answer.
* It will assign other metadata to token as well.
*/
import java.io.StringReader;
import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


//import edu.stanford.nlp.ling.Word;
//import edu.stanford.nlp.process.Tokenizer;
//import edu.stanford.nlp.process.TokenizerFactory;
//import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;

import org.apache.uima.cas.FSIndex;

import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.AnnotatedQuestion;
import edu.cmu.deiis.subTypes.AnnotatedToken;
import edu.cmu.deiis.subTypes.Document;
import edu.cmu.deiis.subTypes.TokenizedDocument;
import edu.cmu.deiis.subTypes.TokenizedSentence;

public class TokenAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		TokenizedDocument tokenizedDocument = new TokenizedDocument(jCas);
		FSIndex<Annotation> docIndex = jCas.getAnnotationIndex(Document.type);
		// FSIndex<Annotation> docIndex =
		// jCas.getAnnotationIndex(Document.type);
		//TokenizerFactory<Word> factory =		 PTBTokenizerFactory.newTokenizerFactory();
				
		
		Iterator<Annotation> docIterator = docIndex.iterator();
		AnnotatedToken annotatedToken = new AnnotatedToken(jCas);
		Document document = (Document) docIterator.next();

		AnnotatedQuestion annotatedQuestion = document.getQuestion();

		FSArray answerArray = document.getAnswers();

		String qText = annotatedQuestion.getText();
		TokenizedSentence tokenizedSentence = new TokenizedSentence(jCas);
		
		String qTokens[] = qText.split(" ");
		FSArray fsQuestiontokenArray = new FSArray(jCas, qTokens.length);
		// FSList fsList=new FSList(jCas);

		for (int i = 0; i < fsQuestiontokenArray.size(); i++) {
			annotatedToken = new AnnotatedToken(jCas);
			annotatedToken.setTokenText(qTokens[i]);
			fsQuestiontokenArray.set(i, annotatedToken);

		}
		tokenizedSentence.setAnnotatedTokens(fsQuestiontokenArray);
		tokenizedDocument.setTokenizedQuestion(tokenizedSentence);
		//tokenizedDocument.setTokenizedQuestion(tokenizedSentence);
		FSArray fsAnswertokenMultiArray=new FSArray(jCas, answerArray.size());
		
		for (int i = 0; i < answerArray.size(); i++) {
			AnnotatedAnswer annotatedAnswer = (AnnotatedAnswer) answerArray
					.get(i);
			String answerText = annotatedAnswer.getText();
			/*Tokenizer<Word> tokenizer =
					 factory.getTokenizer(answerText);*/
					
			String answerTokenText[] =answerText.split(" ");
			tokenizedSentence = new TokenizedSentence(jCas);
			FSArray fsAnswertokenSentenceArray = new FSArray(jCas, answerTokenText.length);
		
//			aaaaaaaaa
			int begin=annotatedAnswer.getBegin(); 
			for (int j = 0; j < answerTokenText.length; j++) {
				annotatedToken = new AnnotatedToken(jCas);
				annotatedToken.setTokenText(answerTokenText[j]);
				
				annotatedToken.setBegin(begin);
				annotatedToken.setEnd(annotatedToken.getBegin()+annotatedToken.getTokenText().length());
				begin=annotatedToken.getEnd()+1;
		//	System.out.println(answerTokenText[j]);
				fsAnswertokenSentenceArray.set(j, annotatedToken);
			}
			tokenizedSentence.setAnnotatedTokens(fsAnswertokenSentenceArray);
			//fsAnswertokenArray.set(i, tokenizedSentence);
			fsAnswertokenMultiArray.set(i,tokenizedSentence);
		}
		//fsAnswertokenMultiArray.
		tokenizedDocument.setTokenizedAnswers(fsAnswertokenMultiArray);
		tokenizedDocument.addToIndexes();
	}

}
