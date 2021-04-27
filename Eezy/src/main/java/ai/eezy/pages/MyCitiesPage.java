package ai.eezy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ai.eezy.generics.GenericUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyCitiesPage extends GenericUtil{
	@AndroidFindBy(id="com.eezy.ai.dev:id/citiesFavoriteTextView")
	private MobileElement favoriteAreaTxt;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id='com.eezy.ai.dev:id/layout']")
	private MobileElement favoriteArea;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/searchCityEditText")
	private MobileElement searchCityTxb;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/iv_search_clear")
	private MobileElement clearSeachBtn;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='com.eezy.ai.dev:id/citySelectedFrame']/following-sibling::android.widget.TextView[@resource-id='com.eezy.ai.dev:id/cityNameTextView']")
	private MobileElement selectedCityframe;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.eezy.ai.dev:id/cityImageView']")
	private MobileElement cityFrame;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Unexplored Cities']/following-sibling::androidx.cardview.widget.CardView")
	private List<MobileElement> unexploredCities;
	
	public MyCitiesPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getFavoriteAreaTxt() {
		return favoriteAreaTxt;
	}

	public MobileElement getFavoriteArea() {
		return favoriteArea;
	}

	public MobileElement getSearchCityTxb() {
		return searchCityTxb;
	}

	public MobileElement getClearSeachBtn() {
		return clearSeachBtn;
	}

	public MobileElement getSelectedCityframe() {
		return selectedCityframe;
	}

	public MobileElement getCityFrame() {
		return cityFrame;
	}

	public List<MobileElement> getUnexploredCities() {
		return unexploredCities;
	}
	
	public void selectCity(AndroidDriver driver, String cityToBeSelected) {
		int count=0;
		boolean flag=false;
		String xpath="//android.widget.TextView[@text='Unexplored Cities']/following-sibling::androidx.cardview.widget.CardView/android.view.ViewGroup//android.widget.TextView[@resource-id='com.eezy.ai.dev:id/cityNameTextView']";
		do {
		 List<WebElement> cities = driver.findElementsByXPath(xpath);
				for(WebElement x: cities) {
				String cityName = x.getText();
				if(cityName.contains(cityToBeSelected)) {
					System.out.println(cityName);
					x.click();
					flag=true;
					break;
				}
			}
			scroll(driver, .5, .5, .6, .4);
			count++;
		}while(count<10&&!flag);
	}

}
