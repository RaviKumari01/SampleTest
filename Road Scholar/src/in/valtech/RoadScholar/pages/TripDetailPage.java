package in.valtech.RoadScholar.pages;

import static in.valtech.custom.CustomFunction.user_Details;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.custom.CustomFunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class TripDetailPage {

	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());

	public TripDetailPage(WebDriver driver) {
		this.driver=driver;
		BaseTest.expected_ProgramName=driver.getTitle();
		log.info("TripDetailPage"+ driver.getTitle());
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("TRP_Page_XPATH"));
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("TRP_Page_XPATH")),
				driver))) {
			throw new IllegalStateException("This is not the RS TripDetailPage page");
		}
	}

	// ===============================Locators===================================
	By TRP_sharelink=By.xpath(ObjRepoProperty.getProperty("TRP_ShareLink_XPATH"));
	By TRP_shareModalTitle=By.xpath(ObjRepoProperty.getProperty("TRP_ShareTitle_XPATH"));
	By TRP_submitButton=By.xpath(ObjRepoProperty.getProperty("TRP_SubmitBtn_XPATH"));
	By TRP_shareModalError=By.xpath(ObjRepoProperty.getProperty("TRP_ShareModalErrorMessage_XPATH"));
	By TRP_shareModalCloseIcon=By.xpath(ObjRepoProperty.getProperty("TRP_ShareModalCrossIcon_XPATH"));
	By TRP_ClickOnDateAndPrize=By.xpath(ObjRepoProperty.getProperty("TRP_ClickOnDateAndPrize_XPATH"));
	By TRP_EnterFN=By.xpath(ObjRepoProperty.getProperty("TRP_FirstName_XPATH"));
	By TRP_EnterLN=By.xpath(ObjRepoProperty.getProperty("TRP_LastName_XPATH"));
	By TRP_EnterFrndsFN=By.xpath(ObjRepoProperty.getProperty("TRP_FrndsFN_XPATH"));
	By TRP_EnterFrndsLN=By.xpath(ObjRepoProperty.getProperty("TRP_FrndsLN_XPATH"));
	By TRP_EnterFrndsEmail=By.xpath(ObjRepoProperty.getProperty("TRP_FrndsEmail_XPATH"));
	By TRP_ThankyouTitle=By.xpath(ObjRepoProperty.getProperty("TRP_Thankyou_XPATH"));
	By TRP_ThankYouSubText=By.xpath(ObjRepoProperty.getProperty("TRP_ThankyouSubText_XPATH"));
	By TRP_EnrollNowBtn=By.xpath(ObjRepoProperty.getProperty("TRP_EnrollBtn_XPATH"));
	By TRP_DepText=By.xpath(ObjRepoProperty.getProperty("TRP_DepText_XPATH"));
	By TRP_DepDropdown=By.xpath(ObjRepoProperty.getProperty("TRP_DepDropDown_XPATH"));
	By TRP_DepBelowtext=By.xpath(ObjRepoProperty.getProperty("TRP_BelowDepText_XPATH"));
	By TRP_Roomtext=By.xpath(ObjRepoProperty.getProperty("TRP_RoomText_XPATH"));
	By TRP_RoomDropDown= By.xpath(ObjRepoProperty.getProperty("TRP_RoomDropDown_XPATH"));
	By TRP_RoomBelowText= By.xpath(ObjRepoProperty.getProperty("TRP_BelowRoomText_XPATH"));
	By TRP_overviewTab =By.xpath(ObjRepoProperty.getProperty("TRP_OverviewTab_XPATH"));
	By TRP_dateAndpriceTab=By.xpath(ObjRepoProperty.getProperty("TRP_DateAndpriceTab_XPATH"));
	By TRP_ItineraryAndMap =By.xpath(ObjRepoProperty.getProperty("TRP_ItineraryAndMap_XPATH"));
	By TRP_LodgingAndMeals =By.xpath(ObjRepoProperty.getProperty("TRP_LodgingAndMeals_XPATH"));
	By TRP_Reviews =By.xpath(ObjRepoProperty.getProperty("TRP_Reviews_XPATH")); 
	By TRP_SelectDateBtn=By.xpath(ObjRepoProperty.getProperty("TRP_SelectDateBtn_XPATH")); 
	By TRP_AirportIcon=By.xpath(ObjRepoProperty.getProperty("TRP_AirportICon_XPATH"));
	//By TRP_TripTitle=By.xpath(ObjRepoProperty.getProperty("TRP_TripTitle_XPATH"));
	By TRP_TripTitleOfFAAInternationalTab=By.xpath(ObjRepoProperty.getProperty("TRP_TripTitleOfFAAInternationalTab_XPATH"));

	/**MethodName= verifyTripTitle 
	 *Description:This function verifies trip title
	 *@return TripDetailPage
	 *@throws InterruptedException 
	 *Author:Anupriya
	 */
	public TripDetailPage verifyTripTitle()throws InterruptedException {
		BaseTest.expected=driver.findElement(By.xpath("//div[@class='tps-title']")).getText();
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		System.out.println("User is landed to same pages as the selected Special offer Trip Page.");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyTripTitleOfFAAInternationalTab
	 *Description:This function verifies trip title of FAA International Tab
	 *@return TripDetailPage
	 *@throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage verifyTripTitleOfFAAInternationalTab()throws InterruptedException
	{

		BaseTest.Actual=driver.findElement(By.xpath("//div[2][@class='tps-title']")).getText();
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		Reporter.log("User is landed to same pages as the selected  Trip Page.");
		System.out.println("User is landed to same pages as the selected  Trip Page.");
		return new TripDetailPage( driver);

	}

	/**MethodName= clickOnShareLink
	 *  @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Sukrity
	 */
	public TripDetailPage clickOnShareLink()throws InterruptedException{
		Thread.sleep(1000);
		GUIFunctions.clickElement(driver, TRP_sharelink , "sharelink");
		Thread.sleep(1000);
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyShareModalTitle
	 *  @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Sukrity
	 */
	public TripDetailPage verifyShareModalTitle()throws InterruptedException {
		BaseTest.Actual=driver.findElement(TRP_shareModalTitle).getText();	
		BaseTest.expected=TextProperty.getProperty("TRP_shareModalTitle");
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		log.info("share title is displayed as expected");
		return new TripDetailPage( driver);
	}

	/**MethodName= enterFirstName
	 * Description:This function enters first name in the Modal
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage enterFirstName()throws InterruptedException {
		GUIFunctions.normalWait();
		String firstName=user_Details.getFirst_Name();
		GUIFunctions.enterValueIntoTextBox(driver,TRP_EnterFN,firstName);
		log.info("Successfully entered firstName\n");
		return new TripDetailPage(driver);
	}

	/**MethodName= enterLastName
	 * Description:This function enters Last name in the Modal
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage enterLastName()throws InterruptedException {
		GUIFunctions.normalWait();
		String LastName=user_Details.getLast_Name();
		GUIFunctions.enterValueIntoTextBox(driver,TRP_EnterLN,LastName);
		log.info("Successfully entered LastName\n");
		return new TripDetailPage(driver);
	}

	/**MethodName= enterfrndFirstName
	 * Description:This function enters First name in the Modal
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage enterfrndFirstName()throws InterruptedException {
		GUIFunctions.normalWait();
		String frndFirstName=user_Details.getFirst_Name();
		GUIFunctions.enterValueIntoTextBox(driver,TRP_EnterFrndsFN,frndFirstName);
		log.info("Successfully entered firstName\n");
		return new TripDetailPage(driver);
	}

	/**MethodName= enterfrnddLastName
	 * Description:This function enters Last name in the Modal
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage enterfrnddLastName()throws InterruptedException {
		GUIFunctions.normalWait();
		String frndLastName=user_Details.getLast_Name();
		GUIFunctions.enterValueIntoTextBox(driver,TRP_EnterFrndsLN,frndLastName);
		log.info("Successfully entered LastName\n");
		return new TripDetailPage(driver);
	}

	/**MethodName= enterfrndEmail
	 * Description:This function enters Last name in the Modal
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage enterfrndEmail()throws InterruptedException {
		GUIFunctions.normalWait();
		String frndEmail=user_Details.getEmail_Address();
		GUIFunctions.enterValueIntoTextBox(driver, TRP_EnterFrndsEmail,frndEmail);
		log.info("Successfully entered email\n");
		return new TripDetailPage(driver);
	}

	/**MethodName= clickOnSubmitBtn
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Sukrity
	 */
	public TripDetailPage clickOnSubmitBtn()throws InterruptedException{
		GUIFunctions.clickElement(driver, TRP_submitButton , "submitButton");
		Thread.sleep(1000);
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyThankyoutitle 
	 * Description:This function verifies Thank you title 
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage verifyThankyoutitle()throws InterruptedException {
		GUIFunctions.normalWait();
		BaseTest.expected=driver.findElement(TRP_ThankyouTitle).getText();
		Assert.assertEquals(TextProperty.getProperty("TRP_Thankyou"), BaseTest.expected);
		System.out.println("Successfully verified Thank you title");
		log.info("Successfully verified Thank you title\n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyThankyouSubText 
	 * Description:This function verifies  Thankyou Sub Text
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage verifyThankyouSubText()throws InterruptedException {
		GUIFunctions.normalWait();
		BaseTest.expected=driver.findElement(TRP_ThankYouSubText).getText();
		Assert.assertEquals(TextProperty.getProperty("TRP_ThankYouSubtext"), BaseTest.expected);
		System.out.println("Successfully verified Thank you Subtext");
		log.info("Successfully verified Thank you Subtext\n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyShareModalErrorMessage
	 *  @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Sukrity
	 */
	public TripDetailPage verifyShareModalErrorMessage()throws InterruptedException {
		BaseTest.Actual=driver.findElement(TRP_shareModalError).getText();	
		BaseTest.expected=TextProperty.getProperty("TRP_shareModalErrorMessage");
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		log.info("Share Error Message is displayed as expected");
		return new TripDetailPage( driver);
	}

	/**MethodName= clickOnShareModalCloseIcon
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Sukrity
	 */
	public TripDetailPage clickOnShareModalCloseIcon()throws InterruptedException{
		GUIFunctions.clickElement(driver,TRP_shareModalCloseIcon , "shareModalCloseIcon");
		Thread.sleep(1000);
		return new TripDetailPage( driver);
	}

	/**MethodName= clickonEnrollbtn
	 * Description:This function clicks on Enroll btn
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage clickonEnrollbtn()throws InterruptedException {
		GUIFunctions.normalWait();
		System.out.println("before clicks on Enroll btn");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver,TRP_EnrollNowBtn , "EnrollBtn");
		log.info("Successfully Clicked on enroll btn \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyDepartureAirportText
	 * Description:This function verifies  the departure airport text
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage verifyDepartureAirportText()throws InterruptedException {
		GUIFunctions.normalWait();
		if(CustomFunction.isElementPresent(TRP_AirportIcon, driver)){
			GUIFunctions.normalWait();
			BaseTest.expected=driver.findElement(TRP_DepText).getText();
			Assert.assertEquals(TextProperty.getProperty("TRP_DepText"), BaseTest.expected);
			System.out.println("Successfully verified DepartureAirportText");
			log.info("Successfully verified DepartureAirportText \n");
		}
		log.info("DepartureAirportText is not present for this trip \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyDepartureAirportDropdown
	 * Description:This function verifies  the departure airport Drop down
	 * @return TripDetailPage
	 * @throws Exception 
	 * **Author:Anupriya
	 */
	public TripDetailPage verifyDepartureAirportDropdown()throws Exception {
		GUIFunctions.normalWait();
		if(CustomFunction.isElementPresent(TRP_DepDropdown, driver)){
			GUIFunctions.normalWait();
			System.out.println("Successfully verified DepartureAirportDropdown");
			log.info("Successfully verified DepartureDropdown \n");
		}
		log.info("DepartureAirportText is not present for this trip \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyDepartureAirportBelowText
	 * Description:This function verifies  the departure airport BelowText
	 * @return TripDetailPage
	 * @throws Exception 
	 * **Author:Anupriya
	 */
	public TripDetailPage  verifyDepartureAirportBelowText()throws Exception {
		if(CustomFunction.isElementPresent(TRP_DepDropdown, driver)){
			GUIFunctions.normalWait();
			BaseTest.expected=driver.findElement(TRP_DepBelowtext).getText();
			Assert.assertEquals(TextProperty.getProperty("TRP_DepBelowText"), BaseTest.expected);
			System.out.println("Successfully verified DepartureAirportDropdown BelowText ");
			log.info("Successfully verified DepartureDropdownBelowText \n");
		}
		log.info("DepartureAirportText is not present for this trip \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyRoomText
	 * Description:This function verifies  the Roomdrop down above  Text
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public TripDetailPage  verifyRoomAboveText()throws Exception{
		GUIFunctions.normalWait();
		BaseTest.expected=driver.findElement(TRP_Roomtext).getText();
		Assert.assertEquals(TextProperty.getProperty("TRP_RoomaboveText"), BaseTest.expected);
		System.out.println("Successfully verified Room above Text ");
		log.info("Successfully verified Room above Text  \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifyRoomDropdown
	 * Description:This function verifies  Room Drop down is displayed or not
	 * @return TripDetailPage
	 * @throws Exception 
	 * **Author:Anupriya
	 */
	public TripDetailPage verifyRoomDropdown()throws Exception {
		GUIFunctions.normalWait();
		Assert.assertTrue(CustomFunction.isElementVisible(TRP_RoomDropDown, driver),"Dropdown not displayed");
		System.out.println("Successfully verified RoomDropDown");
		log.info("Successfully verified RoomDropDown  \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= verifRoomBelowText
	 * Description:This function verifies  theRoom drop down below text
	 * @return TripDetailPage
	 * @throws Exception 
	 * **Author:Anupriya
	 */
	public TripDetailPage verifRoomBelowText()throws Exception {
		GUIFunctions.normalWait();
		BaseTest.expected=driver.findElement(TRP_RoomBelowText).getText();
		Assert.assertEquals(TextProperty.getProperty("TRP_RoomBelowText"), BaseTest.expected);
		System.out.println("Successfully verified the Room drop down below text ");
		log.info("Successfully verified the Room drop down below text  \n");
		return new TripDetailPage( driver);
	}

	/**MethodName= clickOnDateAndpriceTab
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripDatesAndPrices clickOnDateAndpriceTab()throws Exception{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		GUIFunctions.clickElement(driver, TRP_dateAndpriceTab , "dateAndpriceTab");
		Thread.sleep(5000);
		return new TripDatesAndPrices(driver);
	}

	/**MethodName= OverviewTabIsSelected
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripOverview OverviewTabIsSelected()throws Exception{
		CustomFunction.isElementSelected(TRP_overviewTab ,driver);
		Thread.sleep(1000);
		return new TripOverview( driver);
	}

	/**MethodName= DateAndpriceTabIsSelected
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripDatesAndPrices DateAndpriceTabIsSelected()throws Exception{
		CustomFunction.isElementSelected(TRP_dateAndpriceTab ,driver);
		Thread.sleep(1000);
		return new TripDatesAndPrices( driver);
	}

	/**MethodName= clickOnItineraryAndMapTab
	 * @return TripDetailPage
	 * @throws Exception 
	 * Author:Sukrity
	 */
	public TripIterneryAndMap clickOnItineraryAndMapTab()throws Exception{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		GUIFunctions.clickElement(driver, TRP_ItineraryAndMap , "ItineraryAndMap");
		Thread.sleep(1000);
		return new TripIterneryAndMap( driver);
	}

	/**MethodName= ItineraryAndMapTabIsSelected
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripIterneryAndMap ItineraryAndMapTabIsSelected()throws Exception{
		CustomFunction.isElementSelected(TRP_ItineraryAndMap ,driver);
		Thread.sleep(1000);
		return new TripIterneryAndMap( driver);
	}

	/**MethodName= clickOnLodgingAndMealsTab
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripLodgingAndMeals clickOnLodgingAndMealsTab()throws Exception{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		GUIFunctions.clickElement(driver, TRP_LodgingAndMeals , "LodgingAndMeals");
		Thread.sleep(1000);
		return new TripLodgingAndMeals( driver);
	}

	/**MethodName= LodgingAndMealsTabIsSelected
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripLodgingAndMeals LodgingAndMealsTabIsSelected()throws Exception{
		CustomFunction.isElementSelected(TRP_LodgingAndMeals ,driver);
		Thread.sleep(1000);
		return new TripLodgingAndMeals( driver);
	}

	/**MethodName= clickOnReviewsTab
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
public TripReviews clickOnReviewsTab()throws Exception{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		GUIFunctions.clickElement(driver, TRP_Reviews , "Reviews");
		Thread.sleep(1000);
		return new TripReviews( driver);
	}

	/**MethodName=  ReviewsTabIsSelected
	 * @return TripDetailPage
	 * @throws Exception 
	 **Author:Sukrity
	 */
	public TripReviews ReviewsTabIsSelected()throws Exception{
		CustomFunction.isElementSelected(TRP_Reviews ,driver);
		Thread.sleep(1000);
		return new TripReviews( driver);
	}

	/**MethodName= clickOnEnrollNowBtn
	 * Description:This function click on Enroll Now button
	 * @return TripDetailPage
	 * Author:Manjula
	 * @throws InterruptedException 
	 */
	public TripDetailPage clickOnEnrollNowBtn() throws InterruptedException {
		GUIFunctions.clickElement(driver, TRP_EnrollNowBtn, "Enroll Now");
		System.out.println("User is navigated to TripDetail page ");
		return new TripDetailPage(driver);
	}

	/**MethodName= clickOnSelectDateBtn
	 * Description:This function click on select date button
	 * @return TripDetailPage
	 **Author:Manjula
	 */
	public CheckOutStep1 clickOnSelectDateBtn() {
		GUIFunctions.clickElement(driver, TRP_SelectDateBtn, "select date");
		System.out.println("User is navigated to check out step1 page  ");
		return new CheckOutStep1(driver);
	}
}
