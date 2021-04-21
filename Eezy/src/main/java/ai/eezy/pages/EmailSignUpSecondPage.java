package ai.eezy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
public class EmailSignUpSecondPage extends GenericUtil{
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/dob")
	private MobileElement dobtxb;
	
	@AndroidFindBy(id="android:id/date_picker_header_year")
	private MobileElement year;
	
	@AndroidFindBy(id="android:id/date_picker_header_date")
	private MobileElement datePicker;
	
	@AndroidFindBy(accessibility="Previous month")
	private MobileElement previousMonthbtn;
	
	@AndroidFindBy(accessibility="Next month")
	private MobileElement nextMonthbtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/signUpContinueButton")
	private MobileElement cntinuebtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/validationError")
	private MobileElement validationErrorMsg;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement okbtn;
	
	@AndroidFindBy(id="android:id/button2")
	private MobileElement canclebtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Student']")
	private MobileElement studentoption;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Employed']")
	private MobileElement employedOption;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text='Other'])[2]")
	private MobileElement otherOccupation;
	
	@AndroidFindBy(xpath="//android.view.View")
	private List<MobileElement> years;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='2002']")
	private MobileElement yearsText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Male']")
	private MobileElement malebtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Female']")
	private MobileElement femalebtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Other']")
	private MobileElement otherGenderbtn;
	
	
	public EmailSignUpSecondPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/**
	 * To choose a date in calendar
	 * @param driver
	 * @param date
	 */
	public void selectDate(AndroidDriver driver,String date) {
		driver.findElementByXPath("//android.view.View[@text='"+date+"']").click();
	}
	
	/**
	 * To select a year 
	 * @param driver
	 * @param year
	 */
	public void selectYear(AndroidDriver driver, String year) {
		boolean flag=false;
		do {
		 List<MobileElement> years = driver.findElementsByXPath("//android.view.View");
		 for(MobileElement x:years) {
			String yeartext= x.getAttribute("text");
			if(yeartext.equals(year)) {
				x.click();
				flag=true;
				break;
			}
		 }	 
		 scroll(driver, .5, .5, .4, .6);
		}while(!flag);
	}
	
	/**
	 * To Choose gender
	 * @param driver
	 * @param gender
	 */
	public void selectGender(AndroidDriver driver,String gender) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));
		if(gender.equalsIgnoreCase("Male")) {
			malebtn.click();
		}else if (gender.equalsIgnoreCase("Female")) {
			femalebtn.click();
		}else if (gender.equalsIgnoreCase("Other")) {
			otherGenderbtn.click();
		}else {
			System.out.println("Invalid Option");
		}
	}
	/**
	 * To select Occupation
	 * @param driver
	 * @param Occupation
	 */
	public void selectOccupation(AndroidDriver driver,String Occupation) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));
		if(Occupation.equalsIgnoreCase("Student")) {
			studentoption.click();
		}else if (Occupation.equalsIgnoreCase("Employed")) {
			employedOption.click();
		}else if (Occupation.equalsIgnoreCase("Other")) {
			otherOccupation.click();
		}else {
			System.out.println("Invalid Option");
		}
	}

	public MobileElement getDobtxb(AndroidDriver driver) {
		waitToDisplay(driver, dobtxb);
		return dobtxb;
	}

	public MobileElement getYear(AndroidDriver driver) {
		waitToDisplay(driver, year);
		return year;
	}

	public MobileElement getDatePicker(AndroidDriver driver) {
		waitToDisplay(driver, datePicker);
		return datePicker;
	}

	public MobileElement getPreviousMonthbtn(AndroidDriver driver) {
		waitToDisplay(driver, previousMonthbtn);
		return previousMonthbtn;
	}

	public MobileElement getNextMonthbtn(AndroidDriver driver) {
		waitToDisplay(driver, nextMonthbtn);
		return nextMonthbtn;
	}

	public MobileElement getCntinuebtn(AndroidDriver driver) {
		waitToDisplay(driver, cntinuebtn);
		return cntinuebtn;
	}

	public MobileElement getValidationErrorMsg(AndroidDriver driver) {
		waitToDisplay(driver, validationErrorMsg);
		return validationErrorMsg;
	}

	public MobileElement getOkbtn(AndroidDriver driver) {
		waitToDisplay(driver, okbtn);
		return okbtn;
	}

	public MobileElement getCanclebtn(AndroidDriver driver) {
		waitToDisplay(driver, canclebtn);
		return canclebtn;
	}

	public MobileElement getStudentoption(AndroidDriver driver) {
		waitToDisplay(driver, studentoption);
		return studentoption;
	}

	public MobileElement getEmployedOption(AndroidDriver driver) {
		waitToDisplay(driver, employedOption);
		return employedOption;
	}

	public MobileElement getOtherOccupation(AndroidDriver driver) {
		waitToDisplay(driver, otherOccupation);
		return otherOccupation;
	}

	public List<MobileElement> getYears(AndroidDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.TextView")));
		return years;
	}

	public MobileElement getYearsText(AndroidDriver driver) {
		waitToDisplay(driver, yearsText);
		return yearsText;
	}

	public MobileElement getMalebtn(AndroidDriver driver) {
		waitToDisplay(driver, malebtn);
		return malebtn;
	}

	public MobileElement getFemalebtn(AndroidDriver driver) {
		waitToDisplay(driver, femalebtn);
		return femalebtn;
	}

	public MobileElement getOtherGenderbtn(AndroidDriver driver) {
		waitToDisplay(driver, otherGenderbtn);
		return otherGenderbtn;
	}

	
	
}
