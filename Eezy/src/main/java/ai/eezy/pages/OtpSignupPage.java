package ai.eezy.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * @author Rajiv
 *
 */
public class OtpSignupPage {
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/iv_eezy_logo_signup")
	private MobileElement eezyImage;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/tv_signup_header")
	private MobileElement eezySignupTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/tv_upload_image")
	private MobileElement uploadImgTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/iv_sign_up_camera")
	private MobileElement cameraImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpNameEditText")
	private MobileElement firstNameTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpEmailEditText")
	private MobileElement emailTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpContinueButton")
	private MobileElement cntinueBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpAlreadyHaveAccountTextView")
	private MobileElement alreadyUserLoginLink;
	
	public OtpSignupPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getEezyImage() {
		return eezyImage;
	}

	public MobileElement getEezySignupTxt() {
		return eezySignupTxt;
	}

	public MobileElement getUploadImgTxt() {
		return uploadImgTxt;
	}

	public MobileElement getCameraImg() {
		return cameraImg;
	}

	public MobileElement getFirstNameTxb() {
		return firstNameTxb;
	}

	public MobileElement getEmailTxb() {
		return emailTxb;
	}

	public MobileElement getCntinueBtn() {
		return cntinueBtn;
	}

	public MobileElement getAlreadyUserLoginLink() {
		return alreadyUserLoginLink;
	}
	
}
