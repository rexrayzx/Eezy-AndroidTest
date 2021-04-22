package ai.eezy.generics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import ai.eezy.generics.PathConstant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
/**
 * 
 * @author Rajiv
 *
 */
public class GenericUtil {	
	/**
	 * to tap on MobileElement element
	 * @param noOfFingures
	 * @param element
	 * @param duration
	 */
	public void tapOnElement(AndroidDriver driver,MobileElement element) {
		TouchAction toucha=new TouchAction(driver);
		toucha.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
	}
	/**
	 * to perform long press Action
	 * @param driver
	 * @param element
	 * @param duration
	 */
	public void longPress(AndroidDriver driver,WebElement element,long duration) {
		TouchAction toucha=new TouchAction(driver);
		toucha.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).release().perform();
	}
	
	/**
	 * To scroll element into view
	 * @param driver
	 * @param attributeName
	 * @param value
	 */
	public void scrollintoView(AndroidDriver driver,String attributeName, String value) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+value+"\"))");
	}
	
	/**
	 * to scroll
	 * @param driver
	 * @param StartpointX
	 * @param EndpointX
	 * @param StartpointY
	 * @param EndpointY
	 */
	public void scroll(AndroidDriver driver, double StartpointX, double EndpointX,double StartpointY, double EndpointY) {
		Dimension d=driver.manage().window().getSize();
		int hight = d.getHeight();
		int width = d.getWidth();
		int startX=(int) (width*StartpointX);
		int endX=(int)(width*EndpointX);
		int startY=(int) (hight*StartpointY); 
		int endY=(int) (hight*EndpointY); 
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startX,startY))
		.waitAction(new WaitOptions().withDuration(Duration.ofMillis(300)))
		.moveTo(PointOption.point(endX, endY))
		.release()
		.perform();
		
	}
	/**
	 * To wait till element is intractable
	 * @param driver
	 * @param element
	 */
	public void waitToDisplay(AndroidDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * To take Screenshot
	 * @param methodName
	 * @return String
	 * @throws IOException
	 */
	public String takeScreenShot(String methodName) throws IOException {
		EventFiringWebDriver event=new EventFiringWebDriver(BaseTest.staticDriver);
		File src=event.getScreenshotAs(OutputType.FILE);
		String path=PathConstant.screenshotpath+methodName+".PNG";
		File dest=new File(path);
		Files.copy(src, dest);
		return path;
	}
	/**
	 * to wait till text appears in element
	 * @param driver
	 * @param element
	 * @param name
	 */
	public void waitToInteractable(AndroidDriver driver,WebElement element,String name) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(element, name));
	}
	/**
	 * To Flick
	 * @param driver
	 * @param xOffSet
	 * @param yOffSet
	 */
	public void toFlick(AndroidDriver driver, double xOffSet,double yOffSet) {
		Dimension d=driver.manage().window().getSize();
		int hight = d.getHeight();
		int width = d.getWidth();
		int x=(int) (width*xOffSet);
		int y=(int) (hight*yOffSet); 
		TouchActions action = new TouchActions(driver);
		action.flick(x, y).perform();
	}
	
	/**
	 * To press back button
	 * @param driver
	 */
	public void back(AndroidDriver driver) {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void tap(AndroidDriver driver, double xOffSet,double yOffSet) {
		Dimension d=driver.manage().window().getSize();
		int hight = d.getHeight();
		int width = d.getWidth();
		int x=(int) (width*xOffSet);
		int y=(int) (hight*yOffSet); 
		TouchAction toucha=new TouchAction(driver);
		toucha.tap(TapOptions.tapOptions()
				.withPosition(PointOption.point(x, y))).perform();
	}
}
