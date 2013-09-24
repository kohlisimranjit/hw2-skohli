
/* First created by JCasGen Thu Sep 19 19:31:34 EDT 2013 */
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
import edu.cmu.deiis.types.AnswerScore_Type;

/** 
 * Updated by JCasGen Mon Sep 23 23:29:52 EDT 2013
 * @generated */
public class AnnotatedAnswer_Type extends AnswerScore_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnnotatedAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnnotatedAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnnotatedAnswer(addr, AnnotatedAnswer_Type.this);
  			   AnnotatedAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnnotatedAnswer(addr, AnnotatedAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotatedAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.AnnotatedAnswer");
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerId;
  /** @generated */
  final int     casFeatCode_answerId;
  /** @generated */ 
  public String getAnswerId(int addr) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_answerId);
  }
  /** @generated */    
  public void setAnswerId(int addr, String v) {
        if (featOkTst && casFeat_answerId == null)
      jcas.throwFeatMissing("answerId", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    ll_cas.ll_setStringValue(addr, casFeatCode_answerId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentiment;
  /** @generated */
  final int     casFeatCode_sentiment;
  /** @generated */ 
  public int getSentiment(int addr) {
        if (featOkTst && casFeat_sentiment == null)
      jcas.throwFeatMissing("sentiment", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentiment);
  }
  /** @generated */    
  public void setSentiment(int addr, int v) {
        if (featOkTst && casFeat_sentiment == null)
      jcas.throwFeatMissing("sentiment", "edu.cmu.deiis.subTypes.AnnotatedAnswer");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentiment, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnnotatedAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_answerId = jcas.getRequiredFeatureDE(casType, "answerId", "uima.cas.String", featOkTst);
    casFeatCode_answerId  = (null == casFeat_answerId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerId).getCode();

 
    casFeat_sentiment = jcas.getRequiredFeatureDE(casType, "sentiment", "uima.cas.Integer", featOkTst);
    casFeatCode_sentiment  = (null == casFeat_sentiment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentiment).getCode();

  }
}



    