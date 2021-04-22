package ai.eezy.plantest;

import java.util.List;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
import io.appium.java_client.MobileElement;

public class CountryTest extends BaseTest{
	@Test
	public void country() throws Throwable {
		int index = excelLib.getRowCount("CountryList");
		index++;
		boolean flag=false;
		TreeSet<String> set=new TreeSet<String>();
		TreeSet<String> excelset=new TreeSet<String>();
		WelcomeToeezyPage welcome=new WelcomeToeezyPage(driver);
		welcome.getLocationAllowbtn(driver).click();
		welcome.getGetStartedbtn(driver).click();
		SignUpForeezyPage signup=new SignUpForeezyPage(driver);
		signup.getEnterphoneNumbertxb().click();
		signup.getCountryDropDown().click();
		signup.getSearchCountrytxb(driver).sendKeys("Afghanistan");
		signup.getCountrylist(driver).click();
		signup.getCountryDropDown().click();
		do {
			List<MobileElement> list = signup.getCountrieslist();
			for(MobileElement x:list) {
				String actualCountry = x.getText();
				set.add(actualCountry);
				if(actualCountry.equals("Zimbabwe (+263)")) {
					flag=true;
					break;
				}
			}
			pageutil.scroll(driver, .5, .5, .6, .4);
		}while(!flag);
		
		for(int i=1;i<index;i++) {
			String expectedCountry=excelLib.getExcelData("CountryList", i, 0);
			excelset.add(expectedCountry);
		}
		
		Assert.assertEquals(set, excelset);
	}

}
