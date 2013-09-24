
/* First created by JCasGen Mon Sep 23 18:53:21 EDT 2013 */
package edu.cmu.deiis.subTypes;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * @generated */
public class NGramMatrix_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramMatrix_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramMatrix_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramMatrix(addr, NGramMatrix_Type.this);
  			   NGramMatrix_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramMatrix(addr, NGramMatrix_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramMatrix.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.NGramMatrix");
 
  /** @generated */
  final Feature casFeat_matrix;
  /** @generated */
  final int     casFeatCode_matrix;
  /** @generated */ 
  public int getMatrix(int addr) {
        if (featOkTst && casFeat_matrix == null)
      jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    return ll_cas.ll_getRefValue(addr, casFeatCode_matrix);
  }
  /** @generated */    
  public void setMatrix(int addr, int v) {
        if (featOkTst && casFeat_matrix == null)
      jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    ll_cas.ll_setRefValue(addr, casFeatCode_matrix, v);}
    
   /** @generated */
  public int getMatrix(int addr, int i) {
        if (featOkTst && casFeat_matrix == null)
      jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matrix), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matrix), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matrix), i);
  }
   
  /** @generated */ 
  public void setMatrix(int addr, int i, int v) {
        if (featOkTst && casFeat_matrix == null)
      jcas.throwFeatMissing("matrix", "edu.cmu.deiis.subTypes.NGramMatrix");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matrix), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matrix), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matrix), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramMatrix_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_matrix = jcas.getRequiredFeatureDE(casType, "matrix", "uima.cas.FSArray", featOkTst);
    casFeatCode_matrix  = (null == casFeat_matrix) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matrix).getCode();

  }
}



    