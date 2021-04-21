package ai.eezy.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginHomePage {
	@AndroidFindBy(id="com.eezy.ai.dev:id/later")
	private MobileElement laterBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/yesBtnr")
	private MobileElement updateProfileBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/weatherImager")
	private MobileElement weatherImager;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/temperatureTextView")
	private MobileElement temperatureTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/cityTextView")
	private MobileElement cityTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/subWeatherTextView")
	private MobileElement weatherText;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/rightContainer")
	private MobileElement rightContainer;
	
	public LoginHomePage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getLaterBtn() {
		return laterBtn;
	}

	public MobileElement getUpdateProfileBtn() {
		return updateProfileBtn;
	}

	public MobileElement getWeatherImager() {
		return weatherImager;
	}

	public MobileElement getTemperatureTxt() {
		return temperatureTxt;
	}

	public MobileElement getCityTxt() {
		return cityTxt;
	}

	public MobileElement getWeatherText() {
		return weatherText;
	}

	public MobileElement getRightContainer() {
		return rightContainer;
	}
	
}
