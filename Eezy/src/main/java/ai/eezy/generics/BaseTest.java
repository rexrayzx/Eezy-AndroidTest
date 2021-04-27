package ai.eezy.generics;

import java.io.File;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ai.eezy.pages.LogInToeezyPage;
import ai.eezy.pages.MoreSignUpoptionPage;
import ai.eezy.pages.SignUpForeezyPage;
import ai.eezy.pages.WelcomeToeezyPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.service.local.AppiumDriverLocalService;
/**
 * 
 * @author Rajiv
 *
 */
public class BaseTest {
	//object creation of utility classes
	public AndroidDriver driver;
	public static AndroidDriver staticDriver;
	public AppiumDriverLocalService service;
	public FileUtil file=new FileUtil();
	public JavaUtil util=new JavaUtil();
	public ExcelLibrary excelLib=new ExcelLibrary();
	public GenericUtil pageutil=new GenericUtil();
	String date=new JavaUtil().currentdate().replace(" ", "_").replace(":", "_");
	
	
	
	/*@BeforeSuite
	public void configBS() {
		String date=new JavaUtil().currentdate().replace(" ", "_").replace(":", "_");
		service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
				.usingPort(4723)
				.withAppiumJS(new File("C:\\Users\\Rajiv\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withLogFile(new File(PathConstant.AppiumLogpath+"/appiumlog.txt"+date)));
		service.start();
	}*/
	
	/**
	 * To start the Appium server
	 */
	@BeforeSuite(groups = {"Smoke","Regression"})
	public void configBS() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	
	/**
	 * To launch the application
	 * @throws Throwable
	 */
	@BeforeMethod(groups = {"Smoke","Regression"})
	public void beforeMethod() throws Throwable {
		/*String deviceName=System.getProperty("deviceName");
		String platformVersion=System.getProperty("platformVersion");
		String UDID=System.getProperty("UDID");*/
		
		if(file.getDataFromPropertFile("enviroment").equalsIgnoreCase("realDevice")) {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("app", "./App//eezy-uat-2.apk");
		cap.setCapability("appActivity", file.getDataFromPropertFile("appActivity"));
		cap.setCapability("automationName", file.getDataFromPropertFile("automationName"));
		cap.setCapability("appPackage", file.getDataFromPropertFile("appPackage"));
		
		
		//cap.setCapability("noReset", true);
		URL url=new URL(file.getDataFromPropertFile("url"));
		
		driver=new AndroidDriver (url,cap);
		staticDriver=driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}else{
			DesiredCapabilities caps = new DesiredCapabilities();
		        driver = new AndroidDriver(
		            new URL(file.getDataFromPropertFile("url")), caps);
		        staticDriver=driver;
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
	}
	
	/**
	 * To close the application
	 * @throws Exception
	 */
	@AfterMethod(groups = {"Smoke","Regression"})
	public void afterMethod() throws Exception {
		driver.quit();
	}
	
	/**
	 * To Stop the server
	 */
	@AfterSuite(groups = {"Smoke","Regression"})
	public void configAS() {
		service.stop();
	}
	
	public void loginToApp(String email,String password) {
		WelcomeToeezyPage setup=new WelcomeToeezyPage(driver);
		setup.getLocationAllowbtn(driver).click();
		setup.getLoginBtn(driver).click();
		SignUpForeezyPage singin=new SignUpForeezyPage(driver);
		singin.getMoreSignUpoptnLink(driver).click();
		MoreSignUpoptionPage option=new MoreSignUpoptionPage(driver);
		option.getEmailSignUpoptnLink(driver).click();
		LogInToeezyPage login=new LogInToeezyPage(driver);
		login.getLoginEmailtxb().sendKeys(email);
		login.getLoginPasswordtxb().sendKeys(password);
		login.getContinueBtn().click();
	}
}
