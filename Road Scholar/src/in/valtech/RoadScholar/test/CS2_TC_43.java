/*Author:Sravani
Objectives:Navigate to checkout step-2 page->
Click on close button displayed in your prefrences section->
Click on add house hold member button->Click on submit button->
Verify the error message displayed->Enter FN,LN,Select any option from No diet prefrence & No Airline seating dropdown->
Click on submit button->Verify newly created member in your prefrence section
 */
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CS2_TC_43 extends BaseTest
{
	static  HomePage homePage ;
	
	@Test(priority=1,description = "Enter the trip id into search text field of home page")
	public void Step01_EnterTripIdIntoSearchField() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage hop=new HomePage(driver);
		hop.enterTripIdIntoSearchTextBox();
		log.info("Successfully entered trip id into search text field\n");
		Reporter.log("<p>Successfully entered trip id into search text field");
		System.out.println("step 1 end");
		GUIFunctions.normalWait();
	}

	//Click on search button  
	@Test(priority=2,description = "click on search button")
	public void Step02_clickOnSearchButton() throws Exception 
	{
		System.out.println("step 2 begin");
		HomePage hop=new HomePage(driver);
		hop.clickOnSearchButton();
		String program_name=driver.getTitle();
		System.out.println(program_name);
		log.info("Successfully clicked on search button\n");
		Reporter.log("<p>Successfully clicked on search button");
		System.out.println("step 2 end");
		GUIFunctions.normalWait();
	}

	//Click on dates and prices tab.
	@Test(priority =3,description = "step 3:Click on dates and prices tab")
	public void step03_clickOnDateAndPriceTab() throws Exception 
	{
		System.out.println("step 3 begin");
		TripDetailPage trp=new TripDetailPage(driver);
		trp.clickOnDateAndpriceTab();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on dates and prices tab \n");
		Reporter.log("<p>Successfully Clicked on dates and prices tab");
		System.out.println("step 3 end");
	}

	//Click on select date button
	@Test(priority =4,description = "step 4:  Click on select date button")
	public void step04_clickOnSelectDateButton() throws Exception 
	{
		System.out.println("step 4 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.clickOnSelectDateBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Select Date button \n");
		Reporter.log("<p>Successfully clicked on Select Date button");
		System.out.println("step 4 end");	
	}

	//Click on Two People Lodging button
	@Test(priority =5,description = "step 5 Click on Two People Lodging button")
	public void step5_clickTwoPeopleLodgingButton() throws Exception 
	{
		System.out.println("step 5 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.clickOnTwoPerson();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Two People Lodging button \n");
		Reporter.log("<p>Successfully clicked on Two People Lodging button");
		System.out.println("step 5 end");
	}

	//Click on double Radio Button
	@Test(priority =6,description = "step 6 Click on double Radio Button")
	public void step6_clickOnDoubleRadioButton() throws Exception 
	{
		System.out.println("step 6 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.clickOnDouble();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on  double Radio Button \n");
		Reporter.log("<p>Successfully clicked on double Radio Button");
		System.out.println("step 6 end");
	}

	//Click on NoAirfare Radio Button
	@Test(priority =7,description = "step 7 Click on NoAirfare  Radio Button")
	public void step7_clickOnNoAirfareRadioButton() throws Exception 
	{
		System.out.println("step 7 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.selectNoAirfareRadioBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on NoAirfare  Radio Button \n");
		Reporter.log("<p>Successfully clicked on NoAirfare  Radio Button");
		System.out.println("step 7 end");
	}

	//Click on continue button
	@Test(priority =8,description = "step 8:Click on continue button")
	public void step8_clickOnContinue() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.ClickContinue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 8 end");	
	}

	//Click on AddHousehold member button
	@Test(priority =9,description = "step 9:Click on AddHousehold member button")
	public void step9_clickOnAddHouseHoldMemberButton() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.AddHouseHoldMember();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on AddHousehold member Button \n");
		Reporter.log("<p>Successfully clicked on AddHousehold member Button");
		System.out.println("step 9 end");	
	}

	//enter value in First name field
	@Test(priority =10,description = "step 10:enter value in First name field")
	public void step10_enterValueInFirstNameField() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.FirstHouseHold();
		GUIFunctions.normalWait();
		log.info("Successfully entered value in First name field \n");
		Reporter.log("<p>Successfully entered value in First name field");
		System.out.println("step 10 end");
	}

	//enter value in last name field
	@Test(priority =11,description = "step 11:enter value in last name field")
	public void step11_enterValueInLastNameField() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.LastHouseHold();
		GUIFunctions.normalWait();
		log.info("Successfully entered value in last name field \n");
		Reporter.log("<p>Successfully entered value in last name field");
		System.out.println("step 11 end");
	}

	//Click Submit Button
	@Test(priority =12,description = "step 12:Click Submit Button")
	public void step12_clickOnSubmitButton() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clickSubmit();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Submit Button \n");
		Reporter.log("<p>Successfully Clicked on Submit Button");
		System.out.println("step 12 end");
		

	}
}
