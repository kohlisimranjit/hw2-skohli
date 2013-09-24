package edu.cmu.deiis.utils;

import java.util.Comparator;

import edu.cmu.deiis.subTypes.AnnotatedAnswer;

public class AnswerComparator implements Comparator<AnnotatedAnswer> {
static int ORDER_MULTIPLIER=-1;
	
private static AnswerComparator answerComparator=null;
	@Override
	public int compare(AnnotatedAnswer o1, AnnotatedAnswer o2) {
		double diff=o1.getConfidence()-o2.getConfidence();
		
		if(diff<0)
			return -1*ORDER_MULTIPLIER;
		if (diff>0)
			return 1*ORDER_MULTIPLIER;
		return 0;
	}
	public static AnswerComparator getInstance()
	{
	if(answerComparator==null)
	{
		answerComparator=new AnswerComparator();
	}
	return answerComparator;
	}
}
