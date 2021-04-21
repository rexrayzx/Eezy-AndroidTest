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
public class MoreSignUpoptionPage extends GenericUtil{
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/emailSignUp")
	private MobileElement emailSignUpoptnLink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/fbSignUp")
	private MobileElement fbSignUpoptnLink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/googleSignUp")
	private MobileElement googleSignUplink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/backToNumber")
	private MobileElement backtophonesignuplink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/backArrow")
	private MobileElement backarrowbtn;
	
	public MoreSignUpoptionPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getEmailSignUpoptnLink(AndroidDriver driver) {
		waitToDisplay(driver, emailSignUpoptnLink);
		return emailSignUpoptnLink;
	}

	public MobileElement getFbSignUpoptnLink(AndroidDriver driver) {
		waitToDisplay(driver, fbSignUpoptnLink);
		return fbSignUpoptnLink;
	}

	public MobileElement getGoogleSignUplink(AndroidDriver driver) {
		waitToDisplay(driver, googleSignUplink);
		return googleSignUplink;
	}

	public MobileElement getBacktophonesignuplink(AndroidDriver driver) {
		waitToDisplay(driver, backtophonesignuplink);
		return backtophonesignuplink;
	}

	public MobileElement getBackarrowbtn(AndroidDriver driver) {
		waitToDisplay(driver, backarrowbtn);
		return backarrowbtn;
	}
	
}
