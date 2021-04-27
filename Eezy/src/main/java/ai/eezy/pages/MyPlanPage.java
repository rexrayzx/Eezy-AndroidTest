package ai.eezy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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
public class MyPlanPage extends GenericUtil{
	@AndroidFindBy(id="com.eezy.ai.dev:id/first")
	private MobileElement firstDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/second")
	private MobileElement secondDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/third")
	private MobileElement thirdDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/fourth")
	private MobileElement fourthDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/fifth")
	private MobileElement fifthDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/sixth")
	private MobileElement sixthDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/seventh")
	private MobileElement seventhDate;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/dateTextView")
	private MobileElement dateTxt;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/currentCityButton")
	private MobileElement cityBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Morning']")
	private MobileElement morning;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Noon']")
	private MobileElement noon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Afternoon']")
	private MobileElement afternoon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Evening']")
	private MobileElement evening;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Night']")
	private MobileElement night;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/inspireMeBtn")
	private MobileElement inspireMeBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/createPlanMeBtn")
	private MobileElement createPlanMeBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/chatBubble")
	private MobileElement noPlanTxt;
	
	public MyPlanPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getFirstDate() {
		return firstDate;
	}

	public MobileElement getSecondDate() {
		return secondDate;
	}

	public MobileElement getThirdDate() {
		return thirdDate;
	}

	public MobileElement getFourthDate() {
		return fourthDate;
	}

	public MobileElement getFifthDate() {
		return fifthDate;
	}

	public MobileElement getSixthDate() {
		return sixthDate;
	}

	public MobileElement getSeventhDate() {
		return seventhDate;
	}

	public MobileElement getDateTxt() {
		return dateTxt;
	}

	public MobileElement getCityBtn() {
		return cityBtn;
	}

	public MobileElement getMorning() {
		return morning;
	}

	public MobileElement getNoon() {
		return noon;
	}

	public MobileElement getAfternoon() {
		return afternoon;
	}

	public MobileElement getEvening() {
		return evening;
	}

	public MobileElement getNight() {
		return night;
	}
	
	public MobileElement getInspireMeBtn() {
		return inspireMeBtn;
	}

	public MobileElement getCreatePlanMeBtn() {
		return createPlanMeBtn;
	}

	public MobileElement getNoPlanTxt() {
		return noPlanTxt;
	}

	/**
	 * To select Time for Plan
	 * @param driver
	 * @param time
	 */
	public void selectTimeForPlan(AndroidDriver driver, String time) {
		driver.findElementByXPath("//android.widget.TextView[@text='"+time+"']/following-sibling::android.widget.ImageView")
		.click();
	}
	/**
	 * To select date for plan
	 * @param driver
	 * @param date
	 */
	public void selectDateForPlan(AndroidDriver driver, String date) {
		boolean flag=false;
		do {
		try {
			driver.findElementByXPath("//android.widget.TextView[@text='"+date+"']").click();
			flag=true;
		}
		catch (Exception e) {
			scroll(driver, .8, .2, .2, .2);
		}
		}while(!flag);
	}
}
