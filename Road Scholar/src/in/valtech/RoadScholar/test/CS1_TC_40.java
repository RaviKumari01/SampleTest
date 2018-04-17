/**Author:Sravani
 * Objective:Navigate to trip page->Click on dates & Prices tab->
 * Click on select date button->Select double from room type dropdown->
 * User should be navigated to checkout step 1 page->Click on continue button->
 * Verify the error message displayed
 **/
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class CS1_TC_40 extends BaseTest
{
	static  HomePage homePage ;
	
	@Test(priority=1, description = "step 1: Open browser,Navigate to the RS URL")
	public void step01_HomePage_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);	
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	//Close Signup PopUp
	@Test(priority=2,description = "step 2: Close Signup PopUp")
	public void step02_closeSignUpPopUp() throws Exception 
	{
		System.out.println("step 2 begin");	
		GUIFunctions.normalWait();
		HomePage hop = new HomePage(driver);
		hop.ClickOnModal();
		log.info("Successfully clicked on close Button \n");
		Reporter.log("<p>Successfully clicked on close Button");
		System.out.println("step 2 end");
	}

	//click on trip card from home page
	@Test(priority =3,description = "Step 3: Enter Text Into SearchTextBox")
	public void Step03_EnterTextIntoSearchTextBox() throws Exception {
		System.out.println("step 3 begin");
		HomePage homePage =new HomePage(driver);
		homePage.enterTextIntoSearchTextBox();
		log.info("Successfully Entered Text Into SearchTextBox\n");
		Reporter.log("<p>Successfully Entered Text Into SearchTextBox");
		System.out.println("step 3 end");
	}

	@Test(priority =4,description = "Step 4:Click On Textbox SearchIcon and navigate To Trip Detail Page")
	public void Step04_clickOnTextboxSearchIcon() throws Exception {
		System.out.println("step 4 begin");
		HomePage homePage =new HomePage(driver);
		homePage.clickOnTextboxSearchIcon();
		log.info("Successfully clicked On Textbox SearchIcon\n");
		Reporter.log("<p>Successfully clicked On Textbox SearchIcon");
		System.out.println("step 4 end");
	}
	

	//Click on dates and prices tab.
	@Test(priority =5,description = "Step 5:Click on  dates and prices tab")
	public void step05_clickOnDateAndPriceTab() throws Exception 
	{
		System.out.println("step 5 begin");
		TripDetailPage trp=new TripDetailPage(driver);
		trp.clickOnDateAndpriceTab();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on  dates and prices tab \n");
		Reporter.log("<p>Successfully clicked on  dates and prices tab");
		System.out.println("step 5 end");
	}

	//Click on select date button
	@Test(priority =6,description = "Step 6:Click on select date button")
	public void step06_clickOnSelectDateButton() throws Exception 
	{
		System.out.println("step 6 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.clickOnSelectDateBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Select Date Button \n");
		Reporter.log("<p>Successfully clicked on Select Date Button");
		System.out.println("step 6 end");

	}

	//Click on continue button
	@Test(priority =7,description = "Step 7:Click on continue button")
	public void step07_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 7  begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.ClickContinue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 7 end");
	}

	//verify error message
	@Test(priority =8,description = "Step 8:verify error message")
	public void step08_VerifyErrorMessage() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.verifyError();
		log.info("Successfully Verified Error Message \n");
		Reporter.log("<p>Successfully Verified Error Message");
		System.out.println("step 8 end");
	}

}