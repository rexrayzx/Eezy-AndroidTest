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
public class ProfilePage {
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
	
	public ProfilePage(AndroidDriver driver) {
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
	
	
}
