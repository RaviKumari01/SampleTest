package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ThankYouPageForUpcomingTrip 
{

	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());

	public ThankYouPageForUpcomingTrip(WebDriver driver)
	{
		this.driver = driver;
		log.info("Page title" + driver.getTitle());
		
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("UTP_ThankYouTitle_XPATH")),
				driver))) {
			throw new IllegalStateException("This is not the upcoming trip thankyou page");
		}
	}

	By UTP_ThankYouTitle=By.xpath(ObjRepoProperty.getProperty("UTP_ThankYouTitle_XPATH"));

	/**MethodName:verifyThankYouPageTitle
	 * @return ThankYouPageForUpcomingTrip
	 * @throws Exception 
	 * Author:Sukrity
	 */	
	public  ThankYouPageForUpcomingTrip verifyThankYouPageTitle() throws Exception {
		Thread.sleep(5000);
		BaseTest.Actual=driver.findElement(UTP_ThankYouTitle).getText();					
		BaseTest.expected=TextProperty.getProperty("UTP_ThankYouPage_Title");
		Assert.assertEquals( BaseTest.Actual, BaseTest.expected);
		log.info("Successfully Navigated to ThankYou Page");
		return new ThankYouPageForUpcomingTrip(driver);
	}
}

