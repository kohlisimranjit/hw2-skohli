

/* First created by JCasGen Thu Sep 19 19:03:54 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.NGram;


/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class AnnotatedNGram extends NGram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotatedNGram.class);
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
  protected AnnotatedNGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotatedNGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotatedNGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnnotatedNGram(JCas jcas, int begin, int end) {
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
  //* Feature: nGramToken

  /** getter for nGramToken - gets 
   * @generated */
  public String getNGramToken() {
    if (AnnotatedNGram_Type.featOkTst && ((AnnotatedNGram_Type)jcasType).casFeat_nGramToken == null)
      jcasType.jcas.throwFeatMissing("nGramToken", "edu.cmu.deiis.subTypes.AnnotatedNGram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatedNGram_Type)jcasType).casFeatCode_nGramToken);}
    
  /** setter for nGramToken - sets  
   * @generated */
  public void setNGramToken(String v) {
    if (AnnotatedNGram_Type.featOkTst && ((AnnotatedNGram_Type)jcasType).casFeat_nGramToken == null)
      jcasType.jcas.throwFeatMissing("nGramToken", "edu.cmu.deiis.subTypes.AnnotatedNGram");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatedNGram_Type)jcasType).casFeatCode_nGramToken, v);}    
  }

    