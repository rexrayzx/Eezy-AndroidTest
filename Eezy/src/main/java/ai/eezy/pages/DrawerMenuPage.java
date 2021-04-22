package ai.eezy.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DrawerMenuPage {
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuClose")
	private MobileElement menuCloseBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuAvatar")
	private MobileElement userProfileImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuPersonality")
	private MobileElement usersPetImg;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuName")
	private MobileElement nameTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuCity")
	private MobileElement usersLocationTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuNewPlan")
	private MobileElement newPlanMenu;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuMyPlans")
	private MobileElement planMenu;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuMyFriends")
	private MobileElement friendsMenu;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuMyCities")
	private MobileElement citiesMenu;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuSettings")
	private MobileElement settingsMenu;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuLogout")
	private MobileElement logoutMenu;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/textView6")
	private MobileElement earnPointTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/menuShareAppButton")
	private MobileElement shareAppBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/yesBtn")
	private MobileElement yesLogoutBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/noBtn")
	private MobileElement noLogOutBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/bodyTextView")
	private MobileElement logoutTxt;
	
	public DrawerMenuPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getMenuCloseBtn() {
		return menuCloseBtn;
	}

	public MobileElement getUserProfileImg() {
		return userProfileImg;
	}

	public MobileElement getUsersPetImg() {
		return usersPetImg;
	}

	public MobileElement getNameTxt() {
		return nameTxt;
	}

	public MobileElement getUsersLocationTxt() {
		return usersLocationTxt;
	}

	public MobileElement getNewPlanMenu() {
		return newPlanMenu;
	}

	public MobileElement getPlanMenu() {
		return planMenu;
	}

	public MobileElement getFriendsMenu() {
		return friendsMenu;
	}

	public MobileElement getCitiesMenu() {
		return citiesMenu;
	}

	public MobileElement getSettingsMenu() {
		return settingsMenu;
	}

	public MobileElement getLogoutMenu() {
		return logoutMenu;
	}

	public MobileElement getEarnPointTxt() {
		return earnPointTxt;
	}

	public MobileElement getShareAppBtn() {
		return shareAppBtn;
	}

	public MobileElement getYesLogoutBtn() {
		return yesLogoutBtn;
	}

	public MobileElement getNoLogOutBtn() {
		return noLogOutBtn;
	}

	public MobileElement getLogoutTxt() {
		return logoutTxt;
	}
	
	
}
