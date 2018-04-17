package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SpecialOffersPage 
{

	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());

	public SpecialOffersPage(WebDriver driver) throws InterruptedException 
	{
		this.driver=driver;
		
		log.info("RS SpecialOffers Page title" + driver.getTitle());
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("RS_SpecialOffersTittle_XPATH"));
		
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("RS_SpecialOffersTittle_XPATH")),
				driver)))
		{
			throw new IllegalStateException("This is not the RS SpecialOffers page");

		}
	}
	
	/**MethodName:VerifyPage
	 * Description:This function is to verify the page
	 * @return Community
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public SpecialOffersPage VeirfyPage() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), TextProperty.getProperty("SpecialOffersTittle"),
				"User is not in PracticalInformation Page");
		return new SpecialOffersPage(driver);
	}
}