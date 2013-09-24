
/* First created by JCasGen Thu Sep 19 19:03:54 EDT 2013 */
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
import edu.cmu.deiis.types.NGram_Type;

/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * @generated */
public class AnnotatedNGram_Type extends NGram_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnnotatedNGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnnotatedNGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnnotatedNGram(addr, AnnotatedNGram_Type.this);
  			   AnnotatedNGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnnotatedNGram(addr, AnnotatedNGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotatedNGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.AnnotatedNGram");
 
  /** @generated */
  final Feature casFeat_nGramToken;
  /** @generated */
  final int     casFeatCode_nGramToken;
  /** @generated */ 
  public String getNGramToken(int addr) {
        if (featOkTst && casFeat_nGramToken == null)
      jcas.throwFeatMissing("nGramToken", "edu.cmu.deiis.subTypes.AnnotatedNGram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nGramToken);
  }
  /** @generated */    
  public void setNGramToken(int addr, String v) {
        if (featOkTst && casFeat_nGramToken == null)
      jcas.throwFeatMissing("nGramToken", "edu.cmu.deiis.subTypes.AnnotatedNGram");
    ll_cas.ll_setStringValue(addr, casFeatCode_nGramToken, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnnotatedNGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_nGramToken = jcas.getRequiredFeatureDE(casType, "nGramToken", "uima.cas.String", featOkTst);
    casFeatCode_nGramToken  = (null == casFeat_nGramToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGramToken).getCode();

  }
}



    