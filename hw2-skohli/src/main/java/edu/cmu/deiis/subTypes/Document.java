

/* First created by JCasGen Thu Sep 19 20:00:53 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringList;
import edu.cmu.deiis.types.Annotation;


import org.apache.uima.jcas.cas.StringArray;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Document extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Document.class);
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
  protected Document() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Document(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Document(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Document(JCas jcas, int begin, int end) {
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
  //* Feature: question

  /** getter for question - gets 
   * @generated */
  public AnnotatedQuestion getQuestion() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.deiis.subTypes.Document");
    return (AnnotatedQuestion)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets  
   * @generated */
  public void setQuestion(AnnotatedQuestion v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.deiis.subTypes.Document");
    jcasType.ll_cas.ll_setRefValue(addr, ((Document_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets 
   * @generated */
  public FSArray getAnswers() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.subTypes.Document");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets  
   * @generated */
  public void setAnswers(FSArray v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.subTypes.Document");
    jcasType.ll_cas.ll_setRefValue(addr, ((Document_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - 
   * @generated */
  public AnnotatedAnswer getAnswers(int i) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.subTypes.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_answers), i);
    return (AnnotatedAnswer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - 
   * @generated */
  public void setAnswers(int i, AnnotatedAnswer v) { 
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.deiis.subTypes.Document");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Document_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: threshold

  /** getter for threshold - gets 
   * @generated */
  public double getThreshold() {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_threshold == null)
      jcasType.jcas.throwFeatMissing("threshold", "edu.cmu.deiis.subTypes.Document");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Document_Type)jcasType).casFeatCode_threshold);}
    
  /** setter for threshold - sets  
   * @generated */
  public void setThreshold(double v) {
    if (Document_Type.featOkTst && ((Document_Type)jcasType).casFeat_threshold == null)
      jcasType.jcas.throwFeatMissing("threshold", "edu.cmu.deiis.subTypes.Document");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Document_Type)jcasType).casFeatCode_threshold, v);}    
  }

    