

/* First created by JCasGen Fri Sep 20 02:17:09 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Sep 20 02:49:03 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class TokenizedDocument extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenizedDocument.class);
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
  protected TokenizedDocument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenizedDocument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenizedDocument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenizedDocument(JCas jcas, int begin, int end) {
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
  //* Feature: tokenizedQuestion

  /** getter for tokenizedQuestion - gets 
   * @generated */
  public TokenizedSentence getTokenizedQuestion() {
    if (TokenizedDocument_Type.featOkTst && ((TokenizedDocument_Type)jcasType).casFeat_tokenizedQuestion == null)
      jcasType.jcas.throwFeatMissing("tokenizedQuestion", "edu.cmu.deiis.subTypes.TokenizedDocument");
    return (TokenizedSentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedDocument_Type)jcasType).casFeatCode_tokenizedQuestion)));}
    
  /** setter for tokenizedQuestion - sets  
   * @generated */
  public void setTokenizedQuestion(TokenizedSentence v) {
    if (TokenizedDocument_Type.featOkTst && ((TokenizedDocument_Type)jcasType).casFeat_tokenizedQuestion == null)
      jcasType.jcas.throwFeatMissing("tokenizedQuestion", "edu.cmu.deiis.subTypes.TokenizedDocument");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenizedDocument_Type)jcasType).casFeatCode_tokenizedQuestion, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    