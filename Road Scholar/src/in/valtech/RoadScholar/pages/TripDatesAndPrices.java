package in.valtech.RoadScholar.pages;

import java.util.List;
import java.util.Random;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;

public class TripDatesAndPrices{

	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());

	 public TripDatesAndPrices(WebDriver driver) throws Exception
	 {
	        this.driver=driver;
	        BaseTest.expected_Date=driver.findElement(By.xpath("(//div[@class='table-row-date'])[1]")).getText();
	    
	        if (!(CustomFunction.isElementSelected(
	            By.xpath(ObjRepoProperty.getProperty("TRP_ClickOnDateAndPrize_XPATH")), driver)))
	          {  
	        	throw new IllegalStateException("This is not the RS TripDetailPage page");
	          }
	    }

	/***************************locators********************/
	By TDP_POOText =By.xpath(ObjRepoProperty.getProperty("TDP_POOText_XPATH"));
	By TDP_AirportDropdownArrow =By.xpath(ObjRepoProperty.getProperty("TDP_AirportDropdownArrow_XPATH"));
	By TDP_AirportDropdown =By.xpath(ObjRepoProperty.getProperty("TDP_AirportDropdown_XPATH"));
	By TRP_ClickOnSelectDateBtn=By.xpath(ObjRepoProperty.getProperty("TRP_ClickOnSelectDateBtn_XPATH"));
	By TDP_SelectRoom=By.xpath(ObjRepoProperty.getProperty("TDP_SelectRoom_XPATH"));
	By TDP_RoomArrow=By.xpath(ObjRepoProperty.getProperty("TDP_RoomArrowIcon_XPATH"));
	By TDP_FlightArrow=By.xpath(ObjRepoProperty.getProperty("TDP_FlightArrowUcon_XPATH"));
	By TRP_DepText=By.xpath(ObjRepoProperty.getProperty("TRP_DepText_XPATH"));

	/**MethodName= clickOnSelectDateBtn
	 *  Description:This function click on select date button
	 *  @return TripDatesAndPrices
	 * @throws InterruptedException 
	 **Author:Manjula
	 */
	public CheckOutStep1 clickOnSelectDateBtn() throws InterruptedException{
		//Click on select date button
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		GUIFunctions.clickElement(driver, TRP_ClickOnSelectDateBtn, "SelectDate");
		GUIFunctions.normalWait();
		GUIFunctions.normalWait();
		return new CheckOutStep1(driver);
	}

	/**MethodName= VerifyAirportDropdownPOOMessage
	 *  @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripDatesAndPrices VerifyAirportDropdownPOOMessage()throws Exception{
		BaseTest.Actual=driver.findElement(TDP_POOText).getText();
		BaseTest.expected= TextProperty.getProperty("TDP_AirportDropdownPOOMessage");
		if(BaseTest.Actual.equalsIgnoreCase(BaseTest.expected))
			System.out.println("Program Only Option displayed");
		else
			System.out.println("Program Only Option not displayed");

		return new TripDatesAndPrices( driver);
	}

	/**MethodName= ClickOnAirportDropDownArrow
	 *  @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripDatesAndPrices ClickOnAirportDropDownArrow()throws Exception{
		Thread.sleep(1000);
		GUIFunctions.clickElement(driver, TDP_AirportDropdownArrow , "AirportArrowIcon");
		Thread.sleep(1000);

		return new TripDatesAndPrices( driver);
	}

	/**MethodName= SelectOptionsFromAirportDropDown
	 *  @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripDatesAndPrices SelectOptionsFromAirportDropDown(int i)throws Exception{
		Thread.sleep(1000);
		List <WebElement> list = driver.findElements(By.xpath("AirportDropdown"));
		Thread.sleep(1000);
		list.get(i).click();
		Thread.sleep(2000);
		return new TripDatesAndPrices( driver);
	}

	/**MethodName= ClickOnAirportDropDownArrow
	 *  @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripDatesAndPrices NavigateToTripDetailPage()throws Exception{
		Thread.sleep(1000);
		HomePage homePage =new HomePage(driver);
		homePage.enterTextIntoSearchTextBox();
		homePage.clickOnTextboxSearchIcon();
		Thread.sleep(2000);
		return new TripDatesAndPrices( driver);
	}

	/**MethodName= SelectAirportdropdown
	 *  Description:This function Selects any Airport dropdown
	 *  @return TripDatesAndPrices
	 * @throws Exception 
	 */
	public TripDatesAndPrices selectAirportDropdown()throws Exception{
		if(CustomFunction.isElementPresent(TRP_DepText, driver))
		{
			GUIFunctions.clickElement(driver, TDP_FlightArrow, "arrow");
			List<WebElement> Programnumber=driver.findElements(By.xpath("//div[@class='selectbox component ddb-container ddb-open']/ul/li"));
			System.out.println("size"+Programnumber.size());
			Random rand=new Random();
			int randnum=rand.nextInt(Programnumber.size());
			System.out.println("Inside random"+ randnum);
			By airport=By.xpath("//div[@id='dates']/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/ul/li["+randnum+"]");
			BaseTest.expected =driver.findElement(By.xpath("//div[@id='dates']/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div[3]/ul/li["+randnum+"]")).getText();
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver,airport, "tripcard");
			return new TripDatesAndPrices(driver);
		}												
		else
			return new TripDatesAndPrices(driver);	
	}

	/**MethodName= Selectroomdropdown
	 *  Description:This function Selects any roomdropdown
	 *  @return TripDatesAndPrices
	 * @throws Exception 
	 */
	public TripDatesAndPrices selectroomdropdown()throws Exception{
		GUIFunctions.clickElement(driver, TDP_RoomArrow, "arrow");
		GUIFunctions.clickElement(driver,TDP_SelectRoom, "Room dropdown");
		return new TripDatesAndPrices(driver);
	}
}