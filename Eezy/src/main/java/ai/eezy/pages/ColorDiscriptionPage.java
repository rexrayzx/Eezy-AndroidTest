package ai.eezy.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * @author Rajiv
 *
 */
public class ColorDiscriptionPage {
	@AndroidFindBy(id="com.eezy.ai.dev:id/colorDetailsPersonalityImageView")
	private MobileElement personalityImage;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/colorDetailsColorDescriptionTextView")
	private MobileElement colorDiscriptionText;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/colorDetailsPaintItButton")
	private MobileElement acceptColorBtn;
	
	@AndroidFindBy(id="com.eezy.ai.dev:id/centerContainer")
	private MobileElement centerColorNametxt;
	
	

	public ColorDiscriptionPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public MobileElement getPersonalityImage() {
		return personalityImage;
	}

	public MobileElement getColorDiscriptionText() {
		return colorDiscriptionText;
	}

	public MobileElement getAcceptColorBtn() {
		return acceptColorBtn;
	}

	public MobileElement getCenterColorNametxt() {
		return centerColorNametxt;
	}
	
	
}
