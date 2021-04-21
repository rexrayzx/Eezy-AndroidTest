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
public class LogInToeezyPage {
	@AndroidFindBy(id="com.eezy.ai.dev:id/loginEmailEditText")
	private MobileElement loginEmailtxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/loginPasswordEditText")
	private MobileElement loginPasswordtxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/loginNowButton")
	private MobileElement continueBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/forgotPasswordTextView")
	private MobileElement forgotPasswordlink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/loginRegisterTextView")
	private MobileElement registerLink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/tv_login_to_eezy")
	private MobileElement logineezytxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/loginBackButton")
	private MobileElement backbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/iv_eezy_logo_login")
	private MobileElement eezyLogo;
	
	public LogInToeezyPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getLoginEmailtxb() {
		return loginEmailtxb;
	}

	public MobileElement getLoginPasswordtxb() {
		return loginPasswordtxb;
	}

	public MobileElement getContinueBtn() {
		return continueBtn;
	}

	public MobileElement getForgotPasswordlink() {
		return forgotPasswordlink;
	}

	public MobileElement getRegisterLink() {
		return registerLink;
	}

	public MobileElement getLogineezytxt() {
		return logineezytxt;
	}

	public MobileElement getBackbtn() {
		return backbtn;
	}

	public MobileElement getEezyLogo() {
		return eezyLogo;
	}
	
	
}
