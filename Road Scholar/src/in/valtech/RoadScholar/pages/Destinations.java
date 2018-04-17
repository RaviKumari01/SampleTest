package in.valtech.RoadScholar.pages;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;

public class Destinations extends BaseTest
{
	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	public Destinations(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
		log.info("RS Destinations title" + driver.getTitle());
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("HOP_Destinations_XPATH"));
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("HOP_Destinations_XPATH")),
				driver))){
			throw new IllegalStateException("This is not the Destinations page");
		}
	}
	
	/**MethodName:VerifyPage
	 * Description:This function is to verify the page
	 * @return Community
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public Destinations VeirfyPage() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), TextProperty.getProperty("DestinationPageTittle"),
				"User is not in Destinations Page");
		return new Destinations(driver);
	}

}



