package com.cmu.csd.evaluator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;

import com.cmu.csd.utils.AnswerComparator;

import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.Document;

public class Evaluator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		System.out.println("entered"+this.getClass().getName());
		Document document = null;
		FSIndex<Annotation> docIndex = jCas.getAnnotationIndex(Document.type);
		// FSIndex<Annotation> docIndex =
		// jCas.getAnnotationIndex(Document.type);

		Iterator<Annotation> docIterator = docIndex.iterator();

		document = (Document) docIterator.next();
		
		List<AnnotatedAnswer> AnnotatedAnswerList=new ArrayList<AnnotatedAnswer>();
		FSArray documentAnswerArray = document.getAnswers();
		
		for(int i=0;i<documentAnswerArray.size();i++)
		{
			AnnotatedAnswerList.add((AnnotatedAnswer)documentAnswerArray.get(i));
		}
		
		
		Object		AnnotatedAnswerPbjectrray[]=AnnotatedAnswerList.toArray();
		
		AnnotatedAnswer AnnotatedAnswerrray[]=new AnnotatedAnswer[AnnotatedAnswerPbjectrray.length];
		for(int i=0;i<AnnotatedAnswerrray.length;i++)
		{AnnotatedAnswerrray[i]=(AnnotatedAnswer)AnnotatedAnswerPbjectrray[i];
			
			
		}
		
		Arrays.sort(AnnotatedAnswerrray,AnswerComparator.getInstance());
		
		for(int i=0;i<documentAnswerArray.size();i++){		
			documentAnswerArray.set(i, AnnotatedAnswerrray[i]);
	System.out.println(AnnotatedAnswerrray[i].getText()+" "+AnnotatedAnswerrray[i].getScore());
		
		}
		//AnnotatedAnswer ArrayAnnotated []=new AnnotatedAnswer[10];  	
		
		
		
		
		
		
		
		
		
	}
}
