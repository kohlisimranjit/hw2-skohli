

/* First created by JCasGen Thu Sep 19 19:31:34 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.AnswerScore;


/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class AnnotatedAnswer extends AnswerScore {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotatedAnswer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotatedAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotatedAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotatedAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnnotatedAnswer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated */
  public String getText() {
    if (AnnotatedAnswer_Type.featOkTst && ((AnnotatedAnswer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatedAnswer_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated */
  public void setText(String v) {
    if (AnnotatedAnswer_Type.featOkTst && ((AnnotatedAnswer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatedAnswer_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: answerId

  /** getter for answerId - gets 
   * @generated */
  public String getAnswerId() {
    if (AnnotatedAnswer_Type.featOkTst && ((AnnotatedAnswer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatedAnswer_Type)jcasType).casFeatCode_answerId);}
    
  /** setter for answerId - sets  
   * @generated */
  public void setAnswerId(String v) {
    if (AnnotatedAnswer_Type.featOkTst && ((AnnotatedAnswer_Type)jcasType).casFeat_answerId == null)
      jcasType.jcas.throwFeatMissing("answerId", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatedAnswer_Type)jcasType).casFeatCode_answerId, v);}    
   
    
  //*--------------*
  //* Feature: sentiment

  /** getter for sentiment - gets 
   * @generated */
  public int getSentiment() {
    if (AnnotatedAnswer_Type.featOkTst && ((AnnotatedAnswer_Type)jcasType).casFeat_sentiment == null)
      jcasType.jcas.throwFeatMissing("sentiment", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnnotatedAnswer_Type)jcasType).casFeatCode_sentiment);}
    
  /** setter for sentiment - sets  
   * @generated */
  public void setSentiment(int v) {
    if (AnnotatedAnswer_Type.featOkTst && ((AnnotatedAnswer_Type)jcasType).casFeat_sentiment == null)
      jcasType.jcas.throwFeatMissing("sentiment", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnnotatedAnswer_Type)jcasType).casFeatCode_sentiment, v);}    
  }

    