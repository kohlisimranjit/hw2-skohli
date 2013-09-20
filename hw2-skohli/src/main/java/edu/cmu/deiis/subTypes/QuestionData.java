

/* First created by JCasGen Thu Sep 19 18:23:47 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.Question;


/** 
 * Updated by JCasGen Thu Sep 19 19:23:57 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class QuestionData extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionData.class);
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
  protected QuestionData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QuestionData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QuestionData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public QuestionData(JCas jcas, int begin, int end) {
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
  //* Feature: questionText

  /** getter for questionText - gets 
   * @generated */
  public String getQuestionText() {
    if (QuestionData_Type.featOkTst && ((QuestionData_Type)jcasType).casFeat_questionText == null)
      jcasType.jcas.throwFeatMissing("questionText", "edu.cmu.deiis.subTypes.QuestionData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionData_Type)jcasType).casFeatCode_questionText);}
    
  /** setter for questionText - sets  
   * @generated */
  public void setQuestionText(String v) {
    if (QuestionData_Type.featOkTst && ((QuestionData_Type)jcasType).casFeat_questionText == null)
      jcasType.jcas.throwFeatMissing("questionText", "edu.cmu.deiis.subTypes.QuestionData");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionData_Type)jcasType).casFeatCode_questionText, v);}    
  }

    