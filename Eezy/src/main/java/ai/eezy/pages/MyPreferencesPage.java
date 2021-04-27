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
public class MyPreferencesPage {
	@AndroidFindBy(xpath="//android.widget.TextView[@text='CUISINES']")
	private MobileElement cuisinesTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='ACTIVITIES']")
	private MobileElement activitiesTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TAGS']")
	private MobileElement tagsTab;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/editPrefrencesText")
	private MobileElement editPreferenceTxt;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='EDIT ATMOSPHERE']")
	private MobileElement editATMOSPHERETxt;
	
	public MyPreferencesPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getCuisinesTab() {
		return cuisinesTab;
	}

	public MobileElement getActivitiesTab() {
		return activitiesTab;
	}

	public MobileElement getTagsTab() {
		return tagsTab;
	}

	public MobileElement getEditPreferenceTxt() {
		return editPreferenceTxt;
	}
	/**
	 * To select like
	 * @param driver
	 * @param cuisinesType
	 */
	public void likebutton(AndroidDriver driver, String cuisines_or_activity) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+cuisines_or_activity+"']/following-sibling::android.widget.ImageView[@content-desc='Like']")
		.click();
	}
	/**
	 * To select dislike
	 * @param driver
	 * @param cuisinesType
	 */
	public void disLikebutton(AndroidDriver driver, String cuisines_or_activity) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+cuisines_or_activity+"']/following-sibling::android.widget.ImageView[@content-desc='Dislike']")
		.click();
	}
	/**
	 * To select Favorite 
	 * @param driver
	 * @param cuisinesType
	 */
	public void favoritebutton(AndroidDriver driver, String cuisines_or_activity) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+cuisines_or_activity+"']/following-sibling::android.widget.ImageView[@content-desc='Favorite']")
		.click();
	}
	/**
	 * To Select Atmosphere
	 * @param driver
	 * @param atmosphere
	 */
	public void selectAtmosphere(AndroidDriver driver, String atmosphere) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+atmosphere+"']")
		.click();
	}
	/**
	 * To Select Movie Genre
	 * @param driver
	 * @param atmosphere
	 */
	public void selectMovieGenre(AndroidDriver driver, String movieGenre) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+movieGenre+"']")
		.click();
	}
	/**
	 * To Select Music Genre
	 * @param driver
	 * @param atmosphere
	 */
	public void selectMusicGenre(AndroidDriver driver, String musicGenre) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+musicGenre+"']")
		.click();
	}
	/**
	 * To Select Sporting Event
	 * @param driver
	 * @param sportingEvent
	 */
	public void selectSportingEvent(AndroidDriver driver, String sportingEvent) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+sportingEvent+"']")
		.click();
	}
	/**
	 * To Select Theatre Categories
	 * @param driver
	 * @param sportingEvent
	 */
	public void selectTheatreCategories(AndroidDriver driver, String theatreCategories) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+theatreCategories+"']")
		.click();
	}
}
