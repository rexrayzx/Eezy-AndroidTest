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
public class FriendsPage {
	@AndroidFindBy(xpath="//android.widget.TextView[@text='FRIENDS']")
	private MobileElement friendsTab;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/search")
	private MobileElement searchFriendTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/search_text")
	private MobileElement contactPermissionTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/searchContactsBtn")
	private MobileElement searchContactsBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/header")
	private MobileElement friendsSuggetionTxt;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invite to']")
	private MobileElement inviteBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Friend']")
	private MobileElement addFriendsBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TOP MATCHES']")
	private MobileElement topMatchesTab;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/textView11")
	private MobileElement leftToresponseTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/user_avatar")
	private MobileElement matchedUsrAvtarImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/userNameAge")
	private MobileElement matchedUsrNameandAge;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/user_Personality")
	private MobileElement matchedUsrPetImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/user_city")
	private MobileElement matchedUsrcity;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/match_tags")
	private MobileElement matchedUsrTags;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/match_percentage_container")
	private MobileElement matchedUsrPercentage;
	
	
	public FriendsPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getFriendsTab() {
		return friendsTab;
	}

	public MobileElement getSearchFriendTxb() {
		return searchFriendTxb;
	}

	public MobileElement getContactPermissionTxt() {
		return contactPermissionTxt;
	}

	public MobileElement getSearchContactsBtn() {
		return searchContactsBtn;
	}

	public MobileElement getFriendsSuggetionTxt() {
		return friendsSuggetionTxt;
	}

	public MobileElement getInviteBtn() {
		return inviteBtn;
	}

	public MobileElement getAddFriendsBtn() {
		return addFriendsBtn;
	}

	public MobileElement getTopMatchesTab() {
		return topMatchesTab;
	}

	public MobileElement getLeftToresponseTxt() {
		return leftToresponseTxt;
	}

	public MobileElement getMatchedUsrAvtarImg() {
		return matchedUsrAvtarImg;
	}

	public MobileElement getMatchedUsrNameandAge() {
		return matchedUsrNameandAge;
	}

	public MobileElement getMatchedUsrPetImg() {
		return matchedUsrPetImg;
	}

	public MobileElement getMatchedUsrcity() {
		return matchedUsrcity;
	}

	public MobileElement getMatchedUsrTags() {
		return matchedUsrTags;
	}

	public MobileElement getMatchedUsrPercentage() {
		return matchedUsrPercentage;
	}

/**
 * To invite a contact
 * @param driver
 * @param name
 */
	public void addOrInviteRriends(AndroidDriver driver, String name) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+name+"']/ancestor::android.view.ViewGroup[@resource-id='com.eezy.ai.dev:id/cl_user_item_container']//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/actionBtn1']")
		.click();
	}
}
