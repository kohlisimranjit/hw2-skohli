

/* First created by JCasGen Thu Sep 19 19:48:24 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.FSList;


/** 
 * Updated by JCasGen Mon Sep 23 23:16:49 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class AnswersList extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswersList.class);
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
  protected AnswersList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswersList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswersList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets 
   * @generated */
  public FSList getAnswer() {
    if (AnswersList_Type.featOkTst && ((AnswersList_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.deiis.subTypes.AnswersList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswersList_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets  
   * @generated */
  public void setAnswer(FSList v) {
    if (AnswersList_Type.featOkTst && ((AnswersList_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "edu.cmu.deiis.subTypes.AnswersList");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswersList_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    