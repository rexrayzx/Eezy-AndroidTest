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
public class SettingsPage {
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpUploadImageView")
	private MobileElement uploadImgIcon;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/phoneValue")
	private MobileElement phoneNumberTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/editProfileNameEditText")
	private MobileElement firstNameTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/editProfileUsernameEditTextt")
	private MobileElement usernameTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/et_dob")
	private MobileElement dobTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/editProfileAboutMeEditText")
	private MobileElement aboutMeTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/sw_enable_matching")
	private MobileElement enableMatchingBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SECURITY']")
	private MobileElement securityTab;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/securityCurrentPasswordEditText")
	private MobileElement currentPasswordTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/securityNewPasswordEditText")
	private MobileElement newPasswordTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/securityConfirmPasswordEditText")
	private MobileElement confirmNewPasswordTxb;
	
	@AndroidFindBy(xpath="com.eezy.ai.dev:id/securityUpdatePasswordButton")
	private MobileElement updatePasswordBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='PROFILE']")
	private MobileElement profileTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='COLOR']")
	private MobileElement colorTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='eezy blue']")
	private MobileElement eezyBlueColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Orange']")
	private MobileElement orangeColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Blue']")
	private MobileElement blueColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Yellow']")
	private MobileElement yellowColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Red']")
	private MobileElement redColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Green']")
	private MobileElement greenColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Violet']")
	private MobileElement violetColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Magenta']")
	private MobileElement magentaColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Black']")
	private MobileElement blackColor;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='PRIVACY']")
	private MobileElement privicyTab;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/deleteAccount")
	private MobileElement deleteAccountBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/message")
	private MobileElement deleteAccountTxt;
	
	public SettingsPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getUploadImgIcon() {
		return uploadImgIcon;
	}

	public MobileElement getPhoneNumberTxb() {
		return phoneNumberTxb;
	}

	public MobileElement getFirstNameTxb() {
		return firstNameTxb;
	}

	public MobileElement getUsernameTxb() {
		return usernameTxb;
	}

	public MobileElement getDobTxb() {
		return dobTxb;
	}

	public MobileElement getAboutMeTxb() {
		return aboutMeTxb;
	}

	public MobileElement getEnableMatchingBtn() {
		return enableMatchingBtn;
	}

	public MobileElement getSecurityTab() {
		return securityTab;
	}

	public MobileElement getProfileTab() {
		return profileTab;
	}

	public MobileElement getColorTab() {
		return colorTab;
	}

	public MobileElement getPrivicyTab() {
		return privicyTab;
	}

	public MobileElement getCurrentPasswordTxb() {
		return currentPasswordTxb;
	}

	public MobileElement getNewPasswordTxb() {
		return newPasswordTxb;
	}

	public MobileElement getConfirmNewPasswordTxb() {
		return confirmNewPasswordTxb;
	}

	public MobileElement getUpdatePasswordBtn() {
		return updatePasswordBtn;
	}

	public MobileElement getEezyBlueColor() {
		return eezyBlueColor;
	}

	public MobileElement getOrangeColor() {
		return orangeColor;
	}

	public MobileElement getBlueColor() {
		return blueColor;
	}

	public MobileElement getYellowColor() {
		return yellowColor;
	}

	public MobileElement getRedColor() {
		return redColor;
	}

	public MobileElement getGreenColor() {
		return greenColor;
	}

	public MobileElement getVioletColor() {
		return violetColor;
	}

	public MobileElement getMagentaColor() {
		return magentaColor;
	}

	public MobileElement getBlackColor() {
		return blackColor;
	}
	
	
}
