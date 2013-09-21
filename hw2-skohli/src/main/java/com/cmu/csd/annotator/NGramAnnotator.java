package com.cmu.csd.annotator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;

import edu.cmu.deiis.subTypes.AnnotatedNGram;
import edu.cmu.deiis.subTypes.AnnotatedToken;
import edu.cmu.deiis.subTypes.Document;
import edu.cmu.deiis.subTypes.TokenizedDocument;
import edu.cmu.deiis.subTypes.TokenizedSentence;

public class NGramAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub

		FSIndex<Annotation> tokenizedDocIndex = jCas
				.getAnnotationIndex(TokenizedDocument.type);

	}

	FSArray nGramTokens(TokenizedSentence tokenizedSentence, int nGram,JCas jCas) {
		FSArray tokenArray = tokenizedSentence.getAnnotatedTokens();
		FSArray nGramSentence=new FSArray(jCas, tokenArray.size()-(nGram-1)); 
		for (int i = 0; i < tokenArray.size() - 1 - (nGram - 1); i++) {
			String text = "";
			for (int j = 0; j < nGram; j++) {
				AnnotatedToken t=(AnnotatedToken)tokenArray.get(i + j);
			
			text+=t.getTokenText();
			}
			AnnotatedNGram annotatedNGram=new AnnotatedNGram(jCas);
			annotatedNGram.setNGramToken(text);
			nGramSentence.set(i,annotatedNGram );
		}
		return nGramSentence;
	}
}
