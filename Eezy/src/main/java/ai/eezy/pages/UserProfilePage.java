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
public class UserProfilePage {
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileCityImageView")
	private MobileElement userProfileCityImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/matchCard")
	private MobileElement matchCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfilePersonalityImageView")
	private MobileElement petImage;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileAvatarImageView")
	private MobileElement userProfileImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileFullNameTextView")
	private MobileElement name;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileUsernameTextView")
	private MobileElement userName;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileFeelingTextView")
	private MobileElement feelinLocationTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/match_tags")
	private MobileElement matchTags;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfilePlansView")
	private MobileElement plansCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileFriendsView")
	private MobileElement friendsCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfilePreferencesView")
	private MobileElement preferences;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileMoodActivityView")
	private MobileElement moodActivityCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileFavoritesView")
	private MobileElement favoritesCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileCityView")
	private MobileElement cityCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfilePersonalityView")
	private MobileElement personalityCard;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/myProfileFeedbackView")
	private MobileElement feedbackCard;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Edit Profile']")
	private MobileElement editProfileBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Log Out']")
	private MobileElement logOutBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Choose an option']")
	private MobileElement chooseOptionTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/bottomDialogCancelButton")
	private MobileElement dialogCancelButton;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/yesBtn")
	private MobileElement yesBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/noBtn")
	private MobileElement noBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='View Photo']")
	private MobileElement viewPhotoBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Delete Photo']")
	private MobileElement deletePhotoBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Take Photo']")
	private MobileElement takePhotoBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Select Photo']")
	private MobileElement selectPhotoBtn;
	
	
	public UserProfilePage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getUserProfileCityImg() {
		return userProfileCityImg;
	}

	public MobileElement getMatchCard() {
		return matchCard;
	}

	public MobileElement getPetImage() {
		return petImage;
	}

	public MobileElement getUserProfileImg() {
		return userProfileImg;
	}

	public MobileElement getName() {
		return name;
	}

	public MobileElement getUserName() {
		return userName;
	}

	public MobileElement getFeelinLocationTxt() {
		return feelinLocationTxt;
	}

	public MobileElement getMatchTags() {
		return matchTags;
	}

	public MobileElement getPlansCard() {
		return plansCard;
	}

	public MobileElement getFriendsCard() {
		return friendsCard;
	}

	public MobileElement getPreferences() {
		return preferences;
	}

	public MobileElement getMoodActivityCard() {
		return moodActivityCard;
	}

	public MobileElement getFavoritesCard() {
		return favoritesCard;
	}

	public MobileElement getCityCard() {
		return cityCard;
	}

	public MobileElement getPersonalityCard() {
		return personalityCard;
	}

	public MobileElement getFeedbackCard() {
		return feedbackCard;
	}

	public MobileElement getEditProfileBtn() {
		return editProfileBtn;
	}

	public MobileElement getLogOutBtn() {
		return logOutBtn;
	}

	public MobileElement getChooseOptionTxt() {
		return chooseOptionTxt;
	}

	public MobileElement getDialogCancelButton() {
		return dialogCancelButton;
	}

	public MobileElement getYesBtn() {
		return yesBtn;
	}

	public MobileElement getNoBtn() {
		return noBtn;
	}

	public MobileElement getViewPhotoBtn() {
		return viewPhotoBtn;
	}

	public MobileElement getDeletePhotoBtn() {
		return deletePhotoBtn;
	}

	public MobileElement getTakePhotoBtn() {
		return takePhotoBtn;
	}

	public MobileElement getSelectPhotoBtn() {
		return selectPhotoBtn;
	}

}
