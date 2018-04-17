package in.valtech.RoadScholar.pages;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RoadScholarExperience extends BaseTest
{
   private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());

	public RoadScholarExperience(WebDriver driver)
	{
		this.driver=driver;
		
		log.info("RS RoadScholarExperience title" + driver.getTitle());
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("HOP_RoadScholarExperience_XPATH"));
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("HOP_RoadScholarExperience_XPATH")),
				driver))){
			throw new IllegalStateException("This is not the RoadScholarExperience page");
		}
	}
	
	/**MethodName:VerifyPage
	 * Description:This function is to verify the page
	 * @return Community
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public RoadScholarExperience VeirfyPage() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), TextProperty.getProperty("RoadScholarExperienceTittle"), 
				"It is not RoadScholarExperience Page");
		return new RoadScholarExperience(driver) ;
	}

}
