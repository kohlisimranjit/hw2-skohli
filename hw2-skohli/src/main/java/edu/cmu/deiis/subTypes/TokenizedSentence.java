

/* First created by JCasGen Thu Sep 19 18:50:53 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class TokenizedSentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenizedSentence.class);
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
  protected TokenizedSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenizedSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenizedSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenizedSentence(JCas jcas, int begin, int end) {
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
  //* Feature: annotatedTokens

  /** getter for annotatedTokens - gets 
   * @generated */
  public FSArray getAnnotatedTokens() {
    if (TokenizedSentence_Type.featOkTst && ((TokenizedSentence_Type)jcasType).casFeat_annotatedTokens == null)
      jcasType.jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedSentence_Type)jcasType).casFeatCode_annotatedTokens)));}
    
  /** setter for annotatedTokens - sets  
   * @generated */
  public void setAnnotatedTokens(FSArray v) {
    if (TokenizedSentence_Type.featOkTst && ((TokenizedSentence_Type)jcasType).casFeat_annotatedTokens == null)
      jcasType.jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenizedSentence_Type)jcasType).casFeatCode_annotatedTokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for annotatedTokens - gets an indexed value - 
   * @generated */
  public AnnotatedToken getAnnotatedTokens(int i) {
    if (TokenizedSentence_Type.featOkTst && ((TokenizedSentence_Type)jcasType).casFeat_annotatedTokens == null)
      jcasType.jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedSentence_Type)jcasType).casFeatCode_annotatedTokens), i);
    return (AnnotatedToken)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedSentence_Type)jcasType).casFeatCode_annotatedTokens), i)));}

  /** indexed setter for annotatedTokens - sets an indexed value - 
   * @generated */
  public void setAnnotatedTokens(int i, AnnotatedToken v) { 
    if (TokenizedSentence_Type.featOkTst && ((TokenizedSentence_Type)jcasType).casFeat_annotatedTokens == null)
      jcasType.jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedSentence_Type)jcasType).casFeatCode_annotatedTokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedSentence_Type)jcasType).casFeatCode_annotatedTokens), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    