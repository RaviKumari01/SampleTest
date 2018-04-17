/**Author:Sravani
 * Objective:Navigate to checkout step-2 page->
 * Remove alread filled details from contact information secton->
 * Click on continue button->Verify the error message in all the three places->
 * Enter special characters and verify the error message for all the fields
 **/

package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
public class CS2_TC_44 extends BaseTest
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

	//Clear value in First name field
	@Test(priority =9,description = "Step 9:Clear value in First name field")
	public void step9_clearValueInFirstNmaeField() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clearFirstName();
		GUIFunctions.normalWait();
		log.info("Successfully cleared value in First name field \n");
		Reporter.log("<p>Successfully cleared value in First name field");
		System.out.println("step 9 end");
	}

	//Clear value in Last name field
	@Test(priority =10,description = "Step 10:Clear value in Last name field")
	public void step10_clearValueInFirstNameField() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clearLastName();
		GUIFunctions.normalWait();
		log.info("Successfully cleared value in Last name field\n");
		Reporter.log("<p>Successfully cleared value in Last name field");
		System.out.println("step 10 end");	
	}

	//Clear value in Address field
	@Test(priority =11,description = "Step 11:Clear value in Address field")
	public void step11_clearValueInAddressField() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clearAddressField();
		GUIFunctions.normalWait();
		log.info("Successfully cleared value in Address field \n");
		Reporter.log("<p>Successfully cleared value in Address field");
		System.out.println("step 11 end");
	}

	//Clear value in city field
	@Test(priority =12,description = "Step 12:Clear value in city field")
	public void step12_clearValueIncityField() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clearCity();
		GUIFunctions.normalWait();
		log.info("Successfully cleared value in city field \n");
		Reporter.log("<p>Successfully cleared value in city field");
		System.out.println("step 12 end");	
	}

	//Clear value in PhoneNumber field
	@Test(priority =13,description = "Step 13:Clear value in PhoneNumber field")
	public void step13_clearValueInPhoneNumberField() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clearPhoneNumber();
		GUIFunctions.normalWait();
		log.info("Successfully cleared value in PhoneNumber field \n");
		Reporter.log("<p>Successfully cleared value in PhoneNumber field");
		System.out.println("step 13 end");
	}

	//Clear value in ZipCode field
	@Test(priority =14,description = "Step 14:Clear value in ZipCode field")
	public void step14_clearValueInZipCodeField() throws Exception 
	{
		System.out.println("step 14 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.clearZipCode();
		GUIFunctions.normalWait();
		log.info("Successfully cleared value in ZipCode field \n");
		Reporter.log("<p>Successfully cleared value in ZipCode field");
		System.out.println("step 14 end");
	}

	//Click On Continue Button
	@Test(priority =15,description = "Step 15:Click On Continue Button")
	public void step15_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 15 end");	
	}

	//Verify Error Message
	@Test(priority =16,description = "Step 16:Verify Error Message")
	public void step16_verifyErrorMessage() throws Exception 
	{
		System.out.println("step 16 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.ClearError();
		GUIFunctions.normalWait();
		log.info("Successfully verfied error Message \n");
		Reporter.log("<p>Successfully verfied error Message");
		System.out.println("step 16 end");	
	}

	//Enter Special Charector in First name field
	@Test(priority =17,description = "Step 17:Enter Special Charector in First name field")
	public void step17_enterSpecialCharectorInFirstNameField() throws Exception 
	{
		System.out.println("step 17 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.SpecialFirstName();
		GUIFunctions.normalWait();
		log.info("Successfully entered special charector in  first name field \n");
		Reporter.log("<p>Successfully entered special charector in  first name field");
		System.out.println("step 17 end");
	}

	//Enter Special Charector in last name field
	@Test(priority =18,description = "Step 18:Enter Special Charector in last name field")
	public void step18_enterSpecialCharectorInLastnameField() throws Exception 
	{
		System.out.println("step 18 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.SpecialLastName();
		GUIFunctions.normalWait();
		log.info("Successfully entered special charector in  last name field \n");
		Reporter.log("<p>Successfully entered special charector in  last name field");
		System.out.println("step 18 end");
	}
	
	//Enter Special Charector in Address field
	@Test(priority =19,description = "Step 19:Enter Special Charector in Address field")
	public void step19_enterSpecialCharectorInAddresSField() throws Exception 
	{
		System.out.println("step 19 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.SpecialAddressField();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully entered special charector in  Address field");
		System.out.println("step 19 end");
	}
	
	//Enter Special Charector in City Field
	@Test(priority =20,description = "Step 20:Enter Special Charector in City Field")
	public void step20_EnterSpecialCharectorInCityField() throws Exception 
	{
		System.out.println("step 20 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.SplCityField();
		GUIFunctions.normalWait();
		log.info("Successfully Entered Special Charector in City Field \n");
		Reporter.log("<p>Successfully Entered Special Charector in City Field");
		System.out.println("step 20 end");
	}
	
	//Enter Special Charector In PhoneNumber Field
	@Test(priority =21,description = "Step 21:Enter Special Charector in PhoneNumberfield")
	public void step21_EnterSpecialCharectorInPhoneNumberField() throws Exception 
	{
		System.out.println("step 21 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.SplPhoneNumber();
		GUIFunctions.normalWait();
		log.info("Successfully Entered Special Charector in PhoneNumber field \n");
		Reporter.log("<p>Successfully Entered Special Charector in PhoneNumber field");
		System.out.println("step 21 end");
	}
	
	//Enter Special Charector In Zipcode Field
	@Test(priority =22,description = "Step 22:Enter Special Charector In Zipcode Field")
	public void step22_EnterSpecialCharectorInZipcodeField() throws Exception 
	{
		System.out.println("step 22 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.SplZipCode();
		GUIFunctions.normalWait();
		log.info("Successfully Entered Special Charector In Zipcode Field \n");
		Reporter.log("<p>Successfully Entered Special Charector In Zipcode Field");
		System.out.println("step 22 end");
	}

	//Click On Continue Button
	@Test(priority =23,description = "Step 23:Click On Continue Button")
	public void step23_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 23 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked continue Button");
		System.out.println("step 23 end");
	}

	//Verify Error Message
	@Test(priority =24,description = "Step 24:Verify Error Message")
	public void step24_verifyErrorMessage() throws Exception 
	{
		System.out.println("step 24 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.ClearError();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the Error Message \n");
		Reporter.log("<p>Successfully Verified the Error Message");
		System.out.println("step 24 end");
	}




}


