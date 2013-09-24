
/* First created by JCasGen Fri Sep 20 02:17:09 EDT 2013 */
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
public class TokenizedDocument_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenizedDocument_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenizedDocument_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenizedDocument(addr, TokenizedDocument_Type.this);
  			   TokenizedDocument_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenizedDocument(addr, TokenizedDocument_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenizedDocument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.TokenizedDocument");



  /** @generated */
  final Feature casFeat_tokenizedQuestion;
  /** @generated */
  final int     casFeatCode_tokenizedQuestion;
  /** @generated */ 
  public int getTokenizedQuestion(int addr) {
        if (featOkTst && casFeat_tokenizedQuestion == null)
      jcas.throwFeatMissing("tokenizedQuestion", "edu.cmu.deiis.subTypes.TokenizedDocument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedQuestion);
  }
  /** @generated */    
  public void setTokenizedQuestion(int addr, int v) {
        if (featOkTst && casFeat_tokenizedQuestion == null)
      jcas.throwFeatMissing("tokenizedQuestion", "edu.cmu.deiis.subTypes.TokenizedDocument");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenizedQuestion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenizedAnswers;
  /** @generated */
  final int     casFeatCode_tokenizedAnswers;
  /** @generated */ 
  public int getTokenizedAnswers(int addr) {
        if (featOkTst && casFeat_tokenizedAnswers == null)
      jcas.throwFeatMissing("tokenizedAnswers", "edu.cmu.deiis.subTypes.TokenizedDocument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers);
  }
  /** @generated */    
  public void setTokenizedAnswers(int addr, int v) {
        if (featOkTst && casFeat_tokenizedAnswers == null)
      jcas.throwFeatMissing("tokenizedAnswers", "edu.cmu.deiis.subTypes.TokenizedDocument");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenizedAnswers, v);}
    
   /** @generated */
  public int getTokenizedAnswers(int addr, int i) {
        if (featOkTst && casFeat_tokenizedAnswers == null)
      jcas.throwFeatMissing("tokenizedAnswers", "edu.cmu.deiis.subTypes.TokenizedDocument");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers), i);
  }
   
  /** @generated */ 
  public void setTokenizedAnswers(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenizedAnswers == null)
      jcas.throwFeatMissing("tokenizedAnswers", "edu.cmu.deiis.subTypes.TokenizedDocument");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswers), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenizedDocument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenizedQuestion = jcas.getRequiredFeatureDE(casType, "tokenizedQuestion", "edu.cmu.deiis.subTypes.TokenizedSentence", featOkTst);
    casFeatCode_tokenizedQuestion  = (null == casFeat_tokenizedQuestion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizedQuestion).getCode();

 
    casFeat_tokenizedAnswers = jcas.getRequiredFeatureDE(casType, "tokenizedAnswers", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenizedAnswers  = (null == casFeat_tokenizedAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizedAnswers).getCode();

  }
}



    