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
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/addBtn")
	private MobileElement addToCalenderBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/actionBtn")
	private MobileElement actionBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/favoriteBtn")
	private MobileElement favoriteBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/dislikeBtn")
	private MobileElement dislikeBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/skipDemo")
	private MobileElement skipbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/venueImage")
	private MobileElement cardImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/nowBtn")
	private MobileElement nowBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chat_menu_action_positive")
	private MobileElement inspireMeBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chat_menu_action_negative")
	private MobileElement browseBtn;
	
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

	public MobileElement getAddToCalenderBtn() {
		return addToCalenderBtn;
	}

	public MobileElement getActionBtn() {
		return actionBtn;
	}

	public MobileElement getFavoriteBtn() {
		return favoriteBtn;
	}

	public MobileElement getDislikeBtn() {
		return dislikeBtn;
	}

	public MobileElement getSkipbtn() {
		return skipbtn;
	}

	public MobileElement getCardImg() {
		return cardImg;
	}

	public MobileElement getNowBtn() {
		return nowBtn;
	}

	public MobileElement getInspireMeBtn() {
		return inspireMeBtn;
	}

	public MobileElement getBrowseBtn() {
		return browseBtn;
	}
	
}
