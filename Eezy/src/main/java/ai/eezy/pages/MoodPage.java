package ai.eezy.pages;

import org.openqa.selenium.WebElement;
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
public class MoodPage {
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.eezy.ai.dev:id/moodImage'])[1]")
	private MobileElement stressedMood;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.eezy.ai.dev:id/moodImage'])[2]")
	private MobileElement downMood;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.eezy.ai.dev:id/moodImage'])[3]")
	private MobileElement alrightMood;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.eezy.ai.dev:id/moodImage'])[4]")
	private MobileElement happyMood;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.eezy.ai.dev:id/moodImage'])[5]")
	private MobileElement awsomeMood;
	
	@AndroidFindBy(xpath="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard1']")
	private MobileElement mostlyIFeelCard;
	
	@AndroidFindBy(xpath="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard2']")
	private MobileElement sometimesIFeelCard;
	
	@AndroidFindBy(xpath="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard3']")
	private MobileElement rarelyIFeelCard;
	
	@AndroidFindBy(xpath="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard1']//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/titleTextView']")
	private MobileElement cardTitleTxt;
	
	
	public MoodPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getStressedMood() {
		return stressedMood;
	}

	public MobileElement getDownMood() {
		return downMood;
	}

	public MobileElement getAlrightMood() {
		return alrightMood;
	}

	public MobileElement getHappyMood() {
		return happyMood;
	}

	public MobileElement getAwsomeMood() {
		return awsomeMood;
	}

	public MobileElement getMostlyIFeelCard() {
		return mostlyIFeelCard;
	}

	public MobileElement getSometimesIFeelCard() {
		return sometimesIFeelCard;
	}

	public MobileElement getRarelyIFeelCard() {
		return rarelyIFeelCard;
	}
	/**
	 * To get the title of the card
	 * @param driver
	 * @param card
	 * @return 
	 * @return
	 */
	public WebElement getTitleofCard(AndroidDriver driver, String card) {
		return driver.findElementByXPath(card+"//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/titleTextView']");
		
	}
	/**
	 * To get The moodTxt
	 * @param driver
	 * @param card
	 * @return
	 */
	public WebElement getMoodTextofCard(AndroidDriver driver, String card) {
		return driver.findElementByXPath(card+"//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/moodTexTView']");
		 
	}
	/**
	 * To get the progress bar
	 * @param driver
	 * @param card
	 * @return
	 */
	public WebElement progressBarOfCard(AndroidDriver driver, String card) {
		return driver.findElementByXPath(card+"//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/progressBar']");
		
	}
	/**
	 * To get the percentage text
	 * @param driver
	 * @param card
	 * @return
	 */
	public WebElement getPercentageTextOfCard(AndroidDriver driver, String card) {
		return driver.findElementByXPath(card+"//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/percentTextView']");
		
	}
	/**
	 * To get the Mood Image
	 * @param driver
	 * @param card
	 * @return
	 */
	public WebElement moodImageOfCard(AndroidDriver driver, String card) {
		return driver.findElementByXPath(card+"//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/moodImage']");
		
	}
}
