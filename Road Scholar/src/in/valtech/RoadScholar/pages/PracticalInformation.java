package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.custom.CustomFunction;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class PracticalInformation
{
	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	public PracticalInformation(WebDriver driver) 
	{
		this.driver=driver;
		
		log.info("RS PracticalInformationPage title" + driver.getTitle());
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("HOP_PracticalInformation_XPATH"));
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("HOP_PracticalInformation_XPATH")),
				driver))){
			throw new IllegalStateException("This is not the PracticalInformation page");
	}
	}
	
	/**MethodName:VerifyPage
	 * Description:This function is to verify the page
	 * @return Community
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public PracticalInformation VeirfyPage() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), TextProperty.getProperty("PracticalInformationPageTittle"),
				"User is not in PracticalInformation Page");
		return new PracticalInformation(driver);
	}

}
