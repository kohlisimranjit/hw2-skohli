
/* First created by JCasGen Thu Sep 19 18:23:47 EDT 2013 */
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
 * Updated by JCasGen Thu Sep 19 19:23:57 EDT 2013
 * @generated */
public class ScoredAnswer_Type extends AnswerScore_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ScoredAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ScoredAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ScoredAnswer(addr, ScoredAnswer_Type.this);
  			   ScoredAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ScoredAnswer(addr, ScoredAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScoredAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.ScoredAnswer");
 
  /** @generated */
  final Feature casFeat_answerText;
  /** @generated */
  final int     casFeatCode_answerText;
  /** @generated */ 
  public String getAnswerText(int addr) {
        if (featOkTst && casFeat_answerText == null)
      jcas.throwFeatMissing("answerText", "edu.cmu.deiis.subTypes.ScoredAnswer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_answerText);
  }
  /** @generated */    
  public void setAnswerText(int addr, String v) {
        if (featOkTst && casFeat_answerText == null)
      jcas.throwFeatMissing("answerText", "edu.cmu.deiis.subTypes.ScoredAnswer");
    ll_cas.ll_setStringValue(addr, casFeatCode_answerText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ScoredAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerText = jcas.getRequiredFeatureDE(casType, "answerText", "uima.cas.String", featOkTst);
    casFeatCode_answerText  = (null == casFeat_answerText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerText).getCode();

  }
}



    