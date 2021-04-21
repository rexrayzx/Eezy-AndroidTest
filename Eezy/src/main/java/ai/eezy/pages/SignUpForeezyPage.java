package ai.eezy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
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
public class SignUpForeezyPage extends GenericUtil{
	@AndroidFindBy(id="com.eezy.ai.dev:id/phoneNumber")
	private MobileElement enterphoneNumbertxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/selectedCountry")
	private MobileElement countryDropDown;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/searchText")
	private MobileElement searchCountrytxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/view4")
	private MobileElement btn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/iv_next")
	private MobileElement nextbtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/countryName']")
	private MobileElement countrylist;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/countryName']")
	private List <MobileElement> countrieslist;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/agreeTermsTextView")
	private MobileElement termConditionLink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/moreLoginOptions")
	private MobileElement moreSignUpoptnLink;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpMessage")
	private MobileElement signUpMessage;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/backArrow")
	private MobileElement backArrow;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/countryCode")
	private MobileElement countryCode;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/eezyImage")
	private MobileElement eezyLogo;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/errorMessage")
	private MobileElement errorMsg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/selectedCountry")
	private MobileElement flag;
	
	public SignUpForeezyPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public MoreSignUpoptionPage moreOption(AndroidDriver driver) {
		tapOnElement(driver, moreSignUpoptnLink);
		return new MoreSignUpoptionPage(driver);
	}
	
	/**
	 * To Select a Country
	 * @param driver
	 * @param selecyedCountry
	 */
	public void selectCountry(AndroidDriver driver, String selecyedCountry) {
		boolean flag=false;
		do {
			waitToDisplay(driver, getCountrylist(driver));
			List<MobileElement> county = getCountrieslist();
			for(MobileElement x:county) {
			String countryName = x.getText();
				if(countryName.equals(selecyedCountry)) {
					x.click();
					flag=true;
					break;
				}
			}
			scroll(driver, .5, .5, .7, .4);
		}while(!flag);
	}
	/**
	 * To check image present or not
	 * @param driver
	 * @param countryNameWithISDcode
	 * @return webElement
	 */
	public WebElement checkFlag(AndroidDriver driver,String countryNameWithISDcode) {
		String country="\""+countryNameWithISDcode+"\"";
		 WebElement flag = driver.findElementByXPath("//android.widget.TextView[contains(@text,"+country+")]/preceding-sibling::android.widget.ImageView");
		 return flag;
	}
	
	public MobileElement getEnterphoneNumbertxb() {
		return enterphoneNumbertxb;
	}

	public MobileElement getCountryDropDown() {
		return countryDropDown;
	}

	public MobileElement getSearchCountrytxb(AndroidDriver driver) {
		waitToDisplay(driver, searchCountrytxb);
		return searchCountrytxb;
	}

	public MobileElement getBtn(AndroidDriver driver) {
		waitToDisplay(driver, btn);
		return btn;
	}

	public MobileElement getCountrylist(AndroidDriver driver) {
		waitToDisplay(driver, countrylist);
		return countrylist;
	}

	public MobileElement getTermConditionLink(AndroidDriver driver) {
		waitToDisplay(driver, termConditionLink);
		return termConditionLink;
	}

	public MobileElement getMoreSignUpoptnLink(AndroidDriver driver) {
		waitToDisplay(driver, moreSignUpoptnLink);
		return moreSignUpoptnLink;
	}

	public MobileElement getNextbtn(AndroidDriver driver) {
		waitToDisplay(driver, nextbtn);
		return nextbtn;
	}

	public MobileElement getSignUpMessage(AndroidDriver driver) {
		waitToDisplay(driver, signUpMessage);
		return signUpMessage;
	}

	public MobileElement getBackArrow(AndroidDriver driver) {
		waitToDisplay(driver, backArrow);
		return backArrow;
	}

	public MobileElement getCountryCode() {
		return countryCode;
	}

	public MobileElement getEezyLogo() {
		return eezyLogo;
	}

	public MobileElement getErrorMsg() {
		return errorMsg;
	}

	public List<MobileElement> getCountrieslist() {
		return countrieslist;
	}

	public MobileElement getFlag() {
		return flag;
	}
	
}
