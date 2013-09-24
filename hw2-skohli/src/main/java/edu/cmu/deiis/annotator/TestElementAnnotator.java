package edu.cmu.deiis.annotator;
/**This annotator class splits a given document into question and answer
* It will also assign assign  sentiment to each sentence
*/
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

import edu.cmu.deiis.subTypes.AnnotatedAnswer;
import edu.cmu.deiis.subTypes.AnnotatedQuestion;
import edu.cmu.deiis.subTypes.Document;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.AnswerScore;

public class TestElementAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		String text = jCas.getDocumentText();
		// System.out.println(text);
		String lines[] = text.split("\n");
		String question = null;
		if (lines.length > 1)
			question = lines[0];
		Document document = new Document(jCas);

		FSArray answers = new FSArray(jCas, lines.length - 1);
		AnnotatedQuestion aq = new AnnotatedQuestion(jCas);

		aq.setText(question.substring(question.indexOf('Q')).trim());
		aq.setSentiment(getSentiment(aq.getText()));
		document.setQuestion(aq);

		document.addToIndexes();
		// String answers[]=new String[lines.length-1];

		for (int i = 0; i < lines.length - 1; i++) {
			AnnotatedAnswer annotatedAnswer = new AnnotatedAnswer(jCas);
			Boolean isCorrect = null;
			String line = lines[i + 1];
			annotatedAnswer.setAnswerId((i+1)+"");
			int sentenceStart = lines[i + 1].indexOf("A 0 ");

			if (sentenceStart == 0) {
				isCorrect = false;
			}
			if (isCorrect == null || !isCorrect) {
				sentenceStart = lines[i + 1].indexOf("A 1 ");
				if (sentenceStart == 0) {
					isCorrect = true;
				}
			}

			if (lines[i + 1].indexOf("A 0 ") == 0
					|| lines[i + 1].indexOf("A 1 ") == 0)
				sentenceStart = "A X ".length();
			else
				sentenceStart = 0;

			lines[i + 1] = lines[i + 1].substring(0,
					lines[i + 1].lastIndexOf("."));
			annotatedAnswer.setText(lines[i + 1].substring(sentenceStart));
			annotatedAnswer.setBegin(sentenceStart);
			annotatedAnswer.setEnd(lines[i + 1].length() - 1);
			AnswerScore answerScore = new AnswerScore(jCas);
			annotatedAnswer
					.setSentiment(getSentiment(annotatedAnswer.getText()));
			Answer answerType = new Answer(jCas);
			if (isCorrect != null)
				{///System.out.println(isCorrect);
				answerType.setIsCorrect(isCorrect.booleanValue());}
			answerScore.setAnswer(answerType);

			 annotatedAnswer.setAnswer(answerType);
			answers.set(i, annotatedAnswer);
		}
		document.setAnswers(answers);
		document.addToIndexes();

	}

	static int getSentiment(String sentence) {

		int sent = 1;
		int ptr = 0;

		// sentence=

		if ((ptr = sentence.substring(ptr, sentence.length()).indexOf(" not")) > -1) {
			sent *= -1;

		}
		ptr = 0;
		if ((ptr = sentence.substring(ptr, sentence.length()).indexOf("n't")) > -1) {
			sent *= -1;

		}

		// System.out.println("returned "+sent);
		return sent;

	}
}
