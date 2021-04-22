package ai.eezy.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.eezy.generics.GenericUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * @author Rajiv
 *
 */
public class WelcomeToeezyPage extends GenericUtil{
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private MobileElement locationAllowbtn;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
	private MobileElement locationDenybtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/wizardPetImageView")
	private MobileElement petImage;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/wizardTitle")
	private MobileElement wizardtitleText;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/wizardArticle")
	private MobileElement wizardText;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/wizardBottomButton")
	private MobileElement getStartedbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/wizardLoginTextView")
	private MobileElement loginBtn;
	
	public WelcomeToeezyPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getLocationAllowbtn(AndroidDriver driver) {
		waitToDisplay(driver, locationAllowbtn);
		return locationAllowbtn;
	}

	public MobileElement getLocationDenybtn(AndroidDriver driver) {
		waitToDisplay(driver, locationDenybtn);
		return locationDenybtn;
	}

	public MobileElement getPetImage(AndroidDriver driver) {
		waitToDisplay(driver, petImage);
		return petImage;
	}

	public MobileElement getWizardtitleText(AndroidDriver driver) {
		waitToDisplay(driver, wizardtitleText);
		return wizardtitleText;
	}

	public MobileElement getWizardText(AndroidDriver driver) {
		waitToDisplay(driver, wizardText);
		return wizardText;
	}

	public MobileElement getGetStartedbtn(AndroidDriver driver) {
		waitToDisplay(driver, getStartedbtn);
		return getStartedbtn;
	}
	/**
	 * To Swipe welcome cards
	 * @param driver
	 * @param IterationNum
	 * @param startX
	 * @param startY
	 * @param endX
	 * @param endY
	 */
	public void getWelcomeText(AndroidDriver driver, int IterationNum, double startX, double startY, double endX, double endY) {
		for(int i=0;i<IterationNum;i++) {
			
			scroll(driver,  startX, startY, endX, endY);
		}
	}

	public MobileElement getLoginBtn(AndroidDriver driver) {
		waitToDisplay(driver, loginBtn);
		return loginBtn;
	}
	
}
