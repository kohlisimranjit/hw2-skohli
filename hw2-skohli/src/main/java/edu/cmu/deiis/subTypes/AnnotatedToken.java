

/* First created by JCasGen Thu Sep 19 18:54:00 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


import edu.cmu.deiis.types.Token;


/** 
 * Updated by JCasGen Fri Sep 20 12:26:16 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class AnnotatedToken extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotatedToken.class);
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
  protected AnnotatedToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotatedToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotatedToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenText

  /** getter for tokenText - gets 
   * @generated */
  public String getTokenText() {
    if (AnnotatedToken_Type.featOkTst && ((AnnotatedToken_Type)jcasType).casFeat_tokenText == null)
      jcasType.jcas.throwFeatMissing("tokenText", "edu.cmu.deiis.subTypes.AnnotatedToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatedToken_Type)jcasType).casFeatCode_tokenText);}
    
  /** setter for tokenText - sets  
   * @generated */
  public void setTokenText(String v) {
    if (AnnotatedToken_Type.featOkTst && ((AnnotatedToken_Type)jcasType).casFeat_tokenText == null)
      jcasType.jcas.throwFeatMissing("tokenText", "edu.cmu.deiis.subTypes.AnnotatedToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatedToken_Type)jcasType).casFeatCode_tokenText, v);}    
  }

    