

/* First created by JCasGen Mon Sep 23 18:53:21 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * XML source: /home/richie/git/hw2-skohli/hw2-skohli/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class NGramMatrix extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramMatrix.class);
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
  protected NGramMatrix() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramMatrix(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramMatrix(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramMatrix(JCas jcas, int begin, int end) {
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
  //* Feature: matrix

  /** getter for matrix - gets 
   * @generated */
  public FSArray getMatrix() {
    if (NGramMatrix_Type.featOkTst && ((NGramMatrix_Type)jcasType).casFeat_matrix == null)
      jcasType.jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramMatrix_Type)jcasType).casFeatCode_matrix)));}
    
  /** setter for matrix - sets  
   * @generated */
  public void setMatrix(FSArray v) {
    if (NGramMatrix_Type.featOkTst && ((NGramMatrix_Type)jcasType).casFeat_matrix == null)
      jcasType.jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramMatrix_Type)jcasType).casFeatCode_matrix, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for matrix - gets an indexed value - 
   * @generated */
  public FSArray getMatrix(int i) {
    if (NGramMatrix_Type.featOkTst && ((NGramMatrix_Type)jcasType).casFeat_matrix == null)
      jcasType.jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramMatrix_Type)jcasType).casFeatCode_matrix), i);
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramMatrix_Type)jcasType).casFeatCode_matrix), i)));}

  /** indexed setter for matrix - sets an indexed value - 
   * @generated */
  public void setMatrix(int i, FSArray v) { 
    if (NGramMatrix_Type.featOkTst && ((NGramMatrix_Type)jcasType).casFeat_matrix == null)
      jcasType.jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramMatrix_Type)jcasType).casFeatCode_matrix), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramMatrix_Type)jcasType).casFeatCode_matrix), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    