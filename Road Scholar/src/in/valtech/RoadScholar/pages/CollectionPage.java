package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import java.util.ArrayList;
import java.util.List;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class CollectionPage 
{
	
	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());

	public CollectionPage(WebDriver driver)
	{

		this.driver = driver;

		log.info("RS Collection title" + driver.getTitle());
		
		System.out.println("Collection title= "+driver.getTitle());
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("COL_Page_XPATH"));

		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("COL_Page_XPATH")),
				driver))) {

			throw new IllegalStateException("This is not the RS Collection page");
		}


	}
	 
	/**MethodName:verifyCollectionTitle
	 * Description:This function verifies collection title
	 * @return CollectionPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public CollectionPage verifyCollectionTitle() throws InterruptedException
	{
		System.out.println("before loading ");
		BaseTest.Actual =driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[2]")).getText();
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		Reporter.log("User is landed to same pages as the selected Collection Page.");
		System.out.println("User is landed to same pages as the selected Collection Page.");
		
		return new CollectionPage(driver);
	}
	
	/**MethodName:verifyCountofTrips
	 * Description:This function verifies Count no ofTrips
	 * @return CollectionPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
    public CollectionPage verifyCountofTrips()
	{
		
    	BaseTest.Actual= driver.findElement(By.xpath("//div[@class='ccc-trips-count']")).getText();
		Assert.assertEquals(BaseTest.Actual, HomePage.tripExpected);
		Reporter.log("Successfully verified CountofTrips.");
		System.out.println("Successfully verified CountofTrips.");
		return new CollectionPage( driver);
	}
	
    /**MethodName:verifydescription
	 * Description:This function  the verifies description
	 * @return CollectionPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
    public CollectionPage verifydescription()
    {
    	System.out.println("inside description methods");
    	BaseTest.Actual=driver.findElement(By.xpath("//div[@class='ccc-description']")).getText();
    	String expected=TextProperty.getProperty("CollectionText");
    	Assert.assertEquals(expected, BaseTest.Actual);
    	System.out.println("Expected description"+expected);
    	System.out.println("Actual description "+ BaseTest.Actual);
    	Reporter.log("Successfully verified description.");
		System.out.println("Successfully verified description.");
		return new CollectionPage( driver);
    	
    }
	
}
