
/* First created by JCasGen Thu Sep 19 18:08:30 EDT 2013 */
package edu.cmu.deiis.extendedTypes;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.deiis.types.Question_Type;

/** 
 * Updated by JCasGen Thu Sep 19 18:09:15 EDT 2013
 * @generated */
public class QuestionText_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionText_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionText_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionText(addr, QuestionText_Type.this);
  			   QuestionText_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionText(addr, QuestionText_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionText.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.extendedTypes.QuestionText");



  /** @generated */
  final Feature casFeat_questionText;
  /** @generated */
  final int     casFeatCode_questionText;
  /** @generated */ 
  public String getQuestionText(int addr) {
        if (featOkTst && casFeat_questionText == null)
      jcas.throwFeatMissing("questionText", "edu.cmu.deiis.extendedTypes.QuestionText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_questionText);
  }
  /** @generated */    
  public void setQuestionText(int addr, String v) {
        if (featOkTst && casFeat_questionText == null)
      jcas.throwFeatMissing("questionText", "edu.cmu.deiis.extendedTypes.QuestionText");
    ll_cas.ll_setStringValue(addr, casFeatCode_questionText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QuestionText_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionText = jcas.getRequiredFeatureDE(casType, "questionText", "uima.cas.String", featOkTst);
    casFeatCode_questionText  = (null == casFeat_questionText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionText).getCode();

  }
}



    