package ai.eezy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
public class BotHomePage extends GenericUtil{
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/tv_login_to_eezy']")
	private MobileElement welcomchat;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/tv_login_to_eezy']")
	private List<MobileElement> welcomchats;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/textView']")
	private MobileElement userInput;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/textView']")
	private List<MobileElement> userInputs;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/fantasticButton")
	private MobileElement leftBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/coolButton")
	private MobileElement rightBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chatBubble")
	private MobileElement botQues;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Pick an answer :']")
	private MobileElement pickanstxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chat_menu_header_action")
	private MobileElement sendResponsebtn;

	@AndroidFindBy(id="com.eezy.ai.dev:id/left_answer")
	private MobileElement leftAnswer;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/right_answer")
	private MobileElement rightAnswer;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/answer_5")
	private MobileElement rightoption;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/answer_4")
	private MobileElement right2ndoption;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/answer_3")
	private MobileElement centerOption;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/answer_2")
	private MobileElement left2ndoption;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/answer_1")
	private MobileElement leftoption;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/title")
	private MobileElement petTitle;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/pet_icon")
	private MobileElement petIcon;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/pet_name")
	private MobileElement petName;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/match_percentage")
	private MobileElement matchedPercentage;
	
	@AndroidFindBy(id="//android.widget.Button[@text='Cool!']")
	private MobileElement finalbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/giphy")
	private MobileElement giphy;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/search_input")
	private MobileElement searchInput;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/country_name")
	private MobileElement countryName;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='₹']")
	private MobileElement lowBudgeticon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='₹₹']")
	private MobileElement midBudgeticon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='₹₹₹']")
	private MobileElement highBudgeticon;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/shareBtn]")
	private MobileElement likeBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/favoriteBtn")
	private MobileElement favoriteBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/dislikeBtn")
	private MobileElement dislikeBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip for now']")
	private MobileElement skipBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/nameTextView")
	private MobileElement nameOnCard;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private MobileElement permissionAllowbtn;
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
	private MobileElement permissionDenybtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chat_menu_action_positive")
	private MobileElement positiveActionBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chat_menu_action_negativen")
	private MobileElement nagativeActionBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Awesome!']")
	private MobileElement finalSetupBtn;
	
	public BotHomePage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public MobileElement getWelcomchat() {
		return welcomchat;
	}


	public MobileElement getLeftBtn() {
		return leftBtn;
	}

	public MobileElement getRightBtn() {
		return rightBtn;
	}

	public List<MobileElement> getWelcomchats() {
		return welcomchats;
	}

	public MobileElement getUserInput(AndroidDriver driver) {
		waitToDisplay(driver, userInput);
		return userInput;
	}

	public List<MobileElement> getUserInputs(AndroidDriver driver) {
		return userInputs;
	}

	public MobileElement getGiphy() {
		return giphy;
	}

	public MobileElement getBotQues() {
		return botQues;
	}

	public MobileElement getPickanstxt() {
		return pickanstxt;
	}

	public MobileElement getSendResponsebtn() {
		return sendResponsebtn;
	}

	public MobileElement getLeftAnswer() {
		return leftAnswer;
	}

	public MobileElement getRightAnswer() {
		return rightAnswer;
	}

	public MobileElement getRightoption() {
		return rightoption;
	}

	public MobileElement getRight2ndoption() {
		return right2ndoption;
	}

	public MobileElement getCenterOption() {
		return centerOption;
	}

	public MobileElement getLeft2ndoption() {
		return left2ndoption;
	}

	public MobileElement getLeftoption() {
		return leftoption;
	}

	public MobileElement getPetTitle() {
		return petTitle;
	}

	public MobileElement getPetIcon() {
		return petIcon;
	}

	public MobileElement getPetName() {
		return petName;
	}

	public MobileElement getMatchedPercentage() {
		return matchedPercentage;
	}
	
	public MobileElement getCountryName() {
		return countryName;
	}
	
	public MobileElement getFinalbtn() {
		return finalbtn;
	}
	
	public MobileElement getLowBudgeticon() {
		return lowBudgeticon;
	}

	public MobileElement getMidBudgeticon() {
		return midBudgeticon;
	}

	public MobileElement getHighBudgeticon() {
		return highBudgeticon;
	}

	public MobileElement getLikeBtn() {
		return likeBtn;
	}

	public MobileElement getFavoriteBtn() {
		return favoriteBtn;
	}

	public MobileElement getDislikeBtn() {
		return dislikeBtn;
	}

	public MobileElement getSkipBtn() {
		return skipBtn;
	}

	public MobileElement getNameOnCard() {
		return nameOnCard;
	}

	public MobileElement getPermissionAllowbtn() {
		return permissionAllowbtn;
	}

	public MobileElement getPermissionDenybtn() {
		return permissionDenybtn;
	}

	public MobileElement getPositiveActionBtn() {
		return positiveActionBtn;
	}

	public MobileElement getNagativeActionBtn() {
		return nagativeActionBtn;
	}

	public MobileElement getFinalSetupBtn() {
		return finalSetupBtn;
	}

	/**
	 * To answer On-boarding Questions 
	 * @param driver
	 * @throws InterruptedException
	 */
	public void OnboardingSetup(AndroidDriver driver) throws InterruptedException {
		waitToDisplay(driver, getGiphy());
		boolean giphy = getGiphy().isDisplayed();
		Assert.assertTrue(giphy);
		waitToDisplay(driver, getLeftBtn());
		getLeftBtn().click();
		Thread.sleep(2000);
		waitToDisplay(driver, getLeftBtn());
		getLeftBtn().click();
		waitToDisplay(driver, getRightoption());
		getRightoption().click();
		getSendResponsebtn().click();
		Assert.assertTrue(getGiphy().isDisplayed());
		waitToDisplay(driver, getLeftoption());
		getLeftoption().click();
		getSendResponsebtn().click();
		waitToDisplay(driver, getCenterOption());
		getCenterOption().click();
		getSendResponsebtn().click();
		waitToDisplay(driver, getGiphy());
		Assert.assertTrue(getGiphy().isDisplayed());
		waitToDisplay(driver, getLeft2ndoption());
		getLeft2ndoption().click();
		getSendResponsebtn().click();
		waitToDisplay(driver, getRight2ndoption());
		getRight2ndoption().click();
		getSendResponsebtn().click();
		waitToDisplay(driver, getGiphy());
		Assert.assertTrue(getGiphy().isDisplayed());
		waitToDisplay(driver, getMatchedPercentage());
		Assert.assertTrue(getMatchedPercentage().isDisplayed());
		Assert.assertTrue(getPetName().isDisplayed());
	}
	
	/**
	 * To select city
	 * @param driver
	 * @param cityName
	 */
	public void selectCity(AndroidDriver driver, String cityName) {
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+cityName+"']"));
	}
	/**
	 * To Select Area
	 * @param driver
	 * @param areaName
	 */
	public void selectPreferredArea(AndroidDriver driver, String areaName) {
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+areaName+"']"));
	}
	/**
	 * To select Movie Genre
	 * @param driver
	 * @param movieGenre
	 */
	public void selectMovieGenre(AndroidDriver driver, String movieGenre) {
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+movieGenre+"']"));
	}
	/**
	 * To select Music Genre
	 * @param driver
	 * @param musicGenre
	 */
	public void selectMusicGenre(AndroidDriver driver, String musicGenre) {
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+musicGenre+"']"));
	}
}
