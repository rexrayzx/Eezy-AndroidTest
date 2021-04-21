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
public class OTPPage extends GenericUtil{
	@AndroidFindBy(id="com.eezy.ai.dev:id/eezyImage")
	private MobileElement eezyImage;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/header")
	private MobileElement enterOTPtext;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/resendTimerText")
	private MobileElement resendTimerText;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/didntGet")
	private MobileElement didntGetOtpTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/iv_nex")
	private MobileElement nextbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/OTPinput")
	private MobileElement otpInputTxb;
	
	public OTPPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getEezyImage() {
		return eezyImage;
	}

	public MobileElement getEnterOTPtext() {
		return enterOTPtext;
	}

	public MobileElement getResendTimerText() {
		return resendTimerText;
	}

	public MobileElement getDidntGetOtpTxt() {
		return didntGetOtpTxt;
	}

	public MobileElement getNextbtn() {
		return nextbtn;
	}

	public MobileElement getOtpInputTxb() {
		return otpInputTxb;
	}
	
	
}
