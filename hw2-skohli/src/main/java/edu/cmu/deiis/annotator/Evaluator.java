package edu.cmu.deiis.annotator;
/**This annotator class will display sorted answers based upon confidence
* It will display answertext the assigned confidence, score and actual score.
*/
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

import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.Document;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.utils.AnswerComparator;

public class Evaluator extends JCasAnnotator_ImplBase {
	/**
	   * This function o/p's the sorted answers based upon their confidence in descending order 
	   * @param jcas JCas object that provides access to the CAS.
	   */
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
		
		int correct=0;
		int N=0;
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
			Answer answer=AnnotatedAnswerrray[i].getAnswer();
			
			if(AnnotatedAnswerrray[i].getScore()==1)
			{N++;
			
			if(answer.getIsCorrect())
			correct++;
			}
	System.out.println(AnnotatedAnswerrray[i].getText()+" "+AnnotatedAnswerrray[i].getConfidence()+" "+AnnotatedAnswerrray[i].getScore()+" "+answer.getIsCorrect());
		
		}
		//AnnotatedAnswer ArrayAnnotated []=new AnnotatedAnswer[10];  	
		
		System.out.println("Precision->"+(double)correct/N);
		
		
		
		
		
		
		
		
	}
}
