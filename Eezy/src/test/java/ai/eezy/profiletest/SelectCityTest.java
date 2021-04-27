package ai.eezy.profiletest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.LoginHomePage;
import ai.eezy.pages.MyCitiesPage;
import ai.eezy.pages.UserProfilePage;
import io.appium.java_client.MobileElement;

public class SelectCityTest extends BaseTest{
	@Test
	public void selectCity() throws Throwable {
		String cityToSelect="Mumbai";
		int count=0;
		boolean flag=false;
		loginToApp(file.getDataFromPropertFile("email"), file.getDataFromPropertFile("password"));
		LoginHomePage loginHome=new LoginHomePage(driver);
		pageutil.waitToDisplay(driver, loginHome.getSkipbtn());
		pageutil.tap(driver, .9, .1);
		UserProfilePage userprofile=new UserProfilePage(driver);
		pageutil.waitforVisiblility(driver, userprofile.getPlansCard());
		do {
		try {
			userprofile.getCityCard().click();
			flag=true;
			break;
		}catch (Exception e) {
			pageutil.scroll(driver, .5, .5, .6, .4);
			count++;
		}
		}while(count<4&&!flag);
		MyCitiesPage cities=new MyCitiesPage(driver);
		cities.selectCity(driver, cityToSelect);
		String selectedCity = cities.getSelectedCityframe().getText();
		Assert.assertEquals(selectedCity, cityToSelect);
	}

}
