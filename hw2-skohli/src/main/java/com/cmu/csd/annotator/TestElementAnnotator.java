package com.cmu.csd.annotator;



import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.AnnotatedQuestion;
import edu.cmu.deiis.subTypes.Document;


public class TestElementAnnotator extends   JCasAnnotator_ImplBase{

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		String text=jCas.getDocumentText();
		String lines[]=text.split("\n");
		String question=lines[0];
		Document document=new Document(jCas);
		//jCas.a
		//annotatedQuestion
		AnnotatedQuestion annotatedQuestion=new AnnotatedQuestion(jCas);
		//annotatedQuestion.setBegin(v);
		annotatedQuestion.setText(question);
		FSArray answers = new FSArray(jCas,lines.length-1);
		AnnotatedQuestion aq=new AnnotatedQuestion(jCas);
		aq.setText(question);
		document.setQuestion(aq);
		
		document.addToIndexes();
		//String answers[]=new String[lines.length-1];
		
		for(int i=0;i<lines.length-1;i++)
		{
			AnnotatedAnswer annotatedAnswer=	new AnnotatedAnswer(jCas);
			annotatedAnswer.setText(lines[i+1]);
			answers.set(i,  annotatedAnswer);
			}
		document.setAnswers(answers);
		document.addToIndexes();
	
	
	}

}
