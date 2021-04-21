package ai.eezy.generics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.codec.binary.Base64;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.screenrecording.CanRecordScreen;
/**
 * 
 * @author Rajiv
 *
 */
public class ListnerImp implements ITestListener{
	FileUtil file=new FileUtil();
	public ExtentReports report;
	public ExtentTest test;
	String date=new JavaUtil().currentdate().replace(" ", "_").replace(":", "_");
	/**
	 * To Configure Extend Report
	 */
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter(PathConstant.reportPath+"Report"+date+".html");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Eezy");
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		try {
			report.setSystemInfo("OS", file.getDataFromPropertFile("platformVersion"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			report.setSystemInfo("Plateform", file.getDataFromPropertFile("platformName"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
		report.setSystemInfo("Reporter", "Rajiv");
	}
	/**
	 * To generate Extend Report
	 */
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	/**
	 * To Start Recording
	 */
	@Override
	public void onTestStart(ITestResult result) {
		 test = report.createTest(result.getMethod().getMethodName());
		 ((CanRecordScreen)BaseTest.staticDriver).startRecordingScreen();
	}
	/**
	 * To Stop Recording on TestSuccess
	 */
	@Override
	public void onTestSuccess(ITestResult result) {
		((CanRecordScreen)BaseTest.staticDriver).stopRecordingScreen();
		test.log(Status.PASS, result.getMethod().getMethodName()+" Passed");
	}
	/**
	 * To stop Recording on TestSkipped
	 */
	@Override
	public void onTestSkipped(ITestResult result) {
		((CanRecordScreen)BaseTest.staticDriver).stopRecordingScreen();
		test.log(Status.SKIP, result.getMethod().getMethodName()+" Skipped");
		
	}
	/**
	 * To attach screenshot on Extend Report on TestFailure
	 * To Stop Recording and create video file on TestFailure
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" Failed");
		test.log(Status.FAIL, result.getThrowable());
		String date=new JavaUtil().currentdate().replace(" ", "_").replace(":", "_");
		
		try {
			GenericUtil utils=new GenericUtil();
			String Path = utils.takeScreenShot(result.getMethod().getMethodName()+date);
			test.addScreenCaptureFromPath(Path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*Stop Recording create video File*/
		String base64String = ((CanRecordScreen)BaseTest.staticDriver).stopRecordingScreen();
		byte[] data = Base64.decodeBase64(base64String);
		String destinationPath=PathConstant.videopath+result.getMethod().getMethodName()+date+".mp4";
		Path path = Paths.get(destinationPath);
		try {
			Files.write(path, data);
			test.addScreenCaptureFromBase64String(base64String);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
