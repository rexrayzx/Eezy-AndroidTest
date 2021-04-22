package ai.eezy.plantest;

import org.testng.annotations.Test;

import ai.eezy.generics.BaseTest;
import ai.eezy.generics.JavaUtil;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Testing extends BaseTest{
	@Test
	public void testString() {
		System.out.println(driver.getCapabilities().getCapability("deviceName"));
		System.out.println(driver.getCapabilities().getCapability("platformVersion").toString());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
