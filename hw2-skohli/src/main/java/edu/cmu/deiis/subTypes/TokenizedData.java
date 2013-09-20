

/* First created by JCasGen Thu Sep 19 18:34:42 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.Token;


/** 
 * Updated by JCasGen Thu Sep 19 18:50:52 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class TokenizedData extends Token {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenizedData.class);
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
  protected TokenizedData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenizedData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenizedData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenizedData(JCas jcas, int begin, int end) {
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
  //* Feature: tokenText

  /** getter for tokenText - gets 
   * @generated */
  public String getTokenText() {
    if (TokenizedData_Type.featOkTst && ((TokenizedData_Type)jcasType).casFeat_tokenText == null)
      jcasType.jcas.throwFeatMissing("tokenText", "edu.cmu.deiis.subTypes.TokenizedData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TokenizedData_Type)jcasType).casFeatCode_tokenText);}
    
  /** setter for tokenText - sets  
   * @generated */
  public void setTokenText(String v) {
    if (TokenizedData_Type.featOkTst && ((TokenizedData_Type)jcasType).casFeat_tokenText == null)
      jcasType.jcas.throwFeatMissing("tokenText", "edu.cmu.deiis.subTypes.TokenizedData");
    jcasType.ll_cas.ll_setStringValue(addr, ((TokenizedData_Type)jcasType).casFeatCode_tokenText, v);}    
  }

    