package ai.eezy.pages;

import org.openqa.selenium.support.PageFactory;

import ai.eezy.generics.GenericUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * @author Rajiv
 *
 */
public class EmailSignupFirstPage extends GenericUtil{
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpNameEditText")
	private MobileElement firstnametxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpEmailEditText")
	private MobileElement emailtxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpPasswordEditText")
	private MobileElement passwordtxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpContinueButton")
	private MobileElement continuebtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpAlreadyHaveAccountTextView")
	private MobileElement alreadyHaveAnAccountbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpBackButton")
	private MobileElement backbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/validationError")
	private MobileElement validationErrormsg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpUsernameTitle")
	private MobileElement taptochangeusernamelink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpSuggestedUsernameTextView")
	private MobileElement suggestedUsername;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/clearUserName")
	private MobileElement clearBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpSuggestedNameEditText")
	private MobileElement userNametxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpTipTextView")
	private MobileElement signUpTipText;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpAlreadyHaveAccountTextView")
	private MobileElement alreadyHaveAccountLoginLink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/yesBtn")
	private MobileElement alreadyuserLoginbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/noBtn")
	private MobileElement alreadyuserCanclebtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/bodyTextView")
	private MobileElement alreadyusermsgtxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/header")
	private MobileElement alreadyusermsg;
	
	public EmailSignupFirstPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getFirstnametxb(AndroidDriver driver) {
		waitToDisplay(driver, firstnametxb);
		return firstnametxb;
	}

	public MobileElement getEmailtxb(AndroidDriver driver) {
		waitToDisplay(driver, emailtxb);
		return emailtxb;
	}

	public MobileElement getPasswordtxb(AndroidDriver driver) {
		waitToDisplay(driver, passwordtxb);
		return passwordtxb;
	}

	public MobileElement getContinuebtn(AndroidDriver driver) {
		waitToDisplay(driver, continuebtn);
		return continuebtn;
	}

	public MobileElement getAlreadyHaveAnAccountbtn(AndroidDriver driver) {
		waitToDisplay(driver, alreadyHaveAnAccountbtn);
		return alreadyHaveAnAccountbtn;
	}

	public MobileElement getBackbtn(AndroidDriver driver) {
		waitToDisplay(driver, backbtn);
		return backbtn;
	}

	public MobileElement getValidationErrormsg(AndroidDriver driver) {
		waitToDisplay(driver, validationErrormsg);
		return validationErrormsg;
	}

	public MobileElement getTaptochangeusernamelink(AndroidDriver driver) {
		waitToDisplay(driver, taptochangeusernamelink);
		return taptochangeusernamelink;
	}

	public MobileElement getSuggestedUsername(AndroidDriver driver) {
		waitToDisplay(driver, suggestedUsername);
		return suggestedUsername;
	}

	public MobileElement getClearBtn(AndroidDriver driver) {
		waitToDisplay(driver, clearBtn);
		return clearBtn;
	}

	public MobileElement getUserNametxb(AndroidDriver driver) {
		waitToDisplay(driver, userNametxb);
		return userNametxb;
	}

	public MobileElement getSignUpTipText(AndroidDriver driver) {
		waitToDisplay(driver, signUpTipText);
		return signUpTipText;
	}

	public MobileElement getAlreadyHaveAccountLoginLink(AndroidDriver driver) {
		waitToDisplay(driver, signUpTipText);
		return alreadyHaveAccountLoginLink;
	}

	public MobileElement getAlreadyuserLoginbtn(AndroidDriver driver) {
		waitToDisplay(driver, alreadyuserLoginbtn);
		return alreadyuserLoginbtn;
	}

	public MobileElement getAlreadyuserCanclebtn(AndroidDriver driver) {
		waitToDisplay(driver, alreadyuserCanclebtn);
		return alreadyuserCanclebtn;
	}

	public MobileElement getAlreadyusermsgtxt(AndroidDriver driver) {
		waitToDisplay(driver, alreadyusermsgtxt);
		return alreadyusermsgtxt;
	}

	public MobileElement getAlreadyusermsg(AndroidDriver driver) {
		waitToDisplay(driver, alreadyusermsg);
		return alreadyusermsg;
	}
	
}
