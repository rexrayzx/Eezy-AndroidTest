package ai.eezy.generics;
/**
 * 
 * @author Rajiv
 * All the paths necessary in project
 */
public interface PathConstant {
	String currentpath=System.getProperty("user.dir");
	String AppiumLogpath=currentpath+"/Logs";
	String filePath=currentpath+"/TestData/Data.properties";
	String excelPath=currentpath+"/TestData/Eezy.xlsx";
	String screenshotpath=currentpath+"/Screenshot/";
	String reportPath=currentpath+"/Reports/";
	String videopath=currentpath+"/Video/";
	String mostlyfeel="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard1']";
	String sometimefeels="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard2']";
	String rarelyfeel="//androidx.cardview.widget.CardView[@resource-id='com.eezy.ai.dev:id/moodCard3']";
}
