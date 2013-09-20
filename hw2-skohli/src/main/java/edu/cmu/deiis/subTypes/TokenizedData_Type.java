
/* First created by JCasGen Thu Sep 19 18:34:42 EDT 2013 */
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
import edu.cmu.deiis.types.Token_Type;

/** 
 * Updated by JCasGen Thu Sep 19 18:50:53 EDT 2013
 * @generated */
public class TokenizedData_Type extends Token_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenizedData_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenizedData_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenizedData(addr, TokenizedData_Type.this);
  			   TokenizedData_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenizedData(addr, TokenizedData_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenizedData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.subTypes.TokenizedData");



  /** @generated */
  final Feature casFeat_tokenText;
  /** @generated */
  final int     casFeatCode_tokenText;
  /** @generated */ 
  public String getTokenText(int addr) {
        if (featOkTst && casFeat_tokenText == null)
      jcas.throwFeatMissing("tokenText", "edu.cmu.deiis.subTypes.TokenizedData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tokenText);
  }
  /** @generated */    
  public void setTokenText(int addr, String v) {
        if (featOkTst && casFeat_tokenText == null)
      jcas.throwFeatMissing("tokenText", "edu.cmu.deiis.subTypes.TokenizedData");
    ll_cas.ll_setStringValue(addr, casFeatCode_tokenText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenizedData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenText = jcas.getRequiredFeatureDE(casType, "tokenText", "uima.cas.String", featOkTst);
    casFeatCode_tokenText  = (null == casFeat_tokenText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenText).getCode();

  }
}



    