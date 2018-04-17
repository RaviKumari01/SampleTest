/*
 * Author: Kavya
 */
package in.valtech.RoadScholar.pages;

import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;

public class ThankYouPageForDonation 
{
	private final WebDriver driver;
	
		public Logger log = Logger.getLogger(this.getClass().getName());
		
		
		public ThankYouPageForDonation(WebDriver driver)
		{
			this.driver = driver;

			System.out.println("Thank you page title for Donation= " + driver.getTitle());
		 
			System.out.println("ObjRepoProperty.getProperty=="+ ObjRepoProperty.getProperty("TYFD_ThankYouTitle_XPATH"));
			if (!(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("TYFD_ThankYouTitle_XPATH")), driver)))
			{
			throw new IllegalStateException("This is not Thank you page for Donation");
			}
		}
		

	By TYFD_ThankYouMessage = By.xpath(ObjRepoProperty.getProperty("TYFD_ThankYouMessage_XPATH"));
	
	public ThankYouPageForDonation verifyThankYouMessage() throws InterruptedException {
		Thread.sleep(10000);
		String expectedTitle = TextProperty.getProperty("TYFD_ExpectedThankYouMessage");
		String actuaTitle = driver.findElement(TYFD_ThankYouMessage).getText();
		System.out.println("actual = " + actuaTitle);
		System.out.println("expected = " + expectedTitle);
		Assert.assertEquals(actuaTitle, expectedTitle,"Text  is matching");
		return new ThankYouPageForDonation(driver);	
		}					
   }

	
	












