
/* First created by JCasGen Thu Sep 19 18:50:53 EDT 2013 */
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
public class TokenizedSentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenizedSentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenizedSentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenizedSentence(addr, TokenizedSentence_Type.this);
  			   TokenizedSentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenizedSentence(addr, TokenizedSentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenizedSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.TokenizedSentence");



  /** @generated */
  final Feature casFeat_annotatedTokens;
  /** @generated */
  final int     casFeatCode_annotatedTokens;
  /** @generated */ 
  public int getAnnotatedTokens(int addr) {
        if (featOkTst && casFeat_annotatedTokens == null)
      jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens);
  }
  /** @generated */    
  public void setAnnotatedTokens(int addr, int v) {
        if (featOkTst && casFeat_annotatedTokens == null)
      jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_annotatedTokens, v);}
    
   /** @generated */
  public int getAnnotatedTokens(int addr, int i) {
        if (featOkTst && casFeat_annotatedTokens == null)
      jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens), i);
  }
   
  /** @generated */ 
  public void setAnnotatedTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_annotatedTokens == null)
      jcas.throwFeatMissing("annotatedTokens", "edu.cmu.deiis.subTypes.TokenizedSentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_annotatedTokens), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenizedSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_annotatedTokens = jcas.getRequiredFeatureDE(casType, "annotatedTokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_annotatedTokens  = (null == casFeat_annotatedTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotatedTokens).getCode();

  }
}



    