/*Author:Sukrity

Objectives:Navigate to payment page (checkout step-3)->Verify the order summary section
 
*/
package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.CheckOutStep3;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class CS3_TC_48 extends BaseTest{

	@Test(priority =1,description = "Step 1: Enter Trip Id Into SearchTextBox")
	public void Step01_EnterTripIdIntoSearchTextBox() throws Exception {
		System.out.println("step 1 begin");
		HomePage homePage =new HomePage(driver);
		homePage.enterTripIdIntoSearchTextBox();
		log.info("Successfully Entered Trip ID Into SearchTextBox\n");
		Reporter.log("<p>Successfully Entered Trip ID Into SearchTextBox");
		System.out.println("step 1 end");
	}

	@Test(priority =2,description = "Step 2:Click On Textbox SearchIcon and navigate To Trip Detail Page")
	public void Step02_clickOnTextboxSearchIcon() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage =new HomePage(driver);
		homePage.clickOnTextboxSearchIcon();
		log.info("Successfully clicked On Textbox SearchIcon\n");
		Reporter.log("<p>Successfully clicked On Textbox SearchIcon");
		System.out.println("step 2 end");
	}

	@Test(priority =3,description = "Step 3:  Click on Date And price Tab")
	public void Step03_clickOnDateAndPrice() throws Exception {
		System.out.println("step 3 begin");
		TripDetailPage TRP=new TripDetailPage(driver);
		TRP.clickOnDateAndpriceTab();
		Reporter.log("<p>Successfully clicked on trip card");
		log.info("Successfully clicked on trip card");
		GUIFunctions.normalWait();
		System.out.println("step 3 end");
	}

	@Test(priority =4,description = "Step 4:  Click on select date button")
	public void Step04_clickOnSelectDate() throws Exception {
		System.out.println("step 4 begin");
		TripDatesAndPrices TDP=new TripDatesAndPrices(driver);
		TDP.clickOnSelectDateBtn();
		Reporter.log("<p>Successfully clicked on Select Date");
		log.info("Successfully clicked on Select Date");
		GUIFunctions.normalWait();
		System.out.println("step 4 end");
	}

	@Test(priority =5,description = "Step 5: click On One Person Option")
	public void Step05_clickOnOnePerson() throws Exception {
		System.out.println("step 5 begin");
		CheckOutStep1 CS1=new CheckOutStep1(driver);
		CS1.clickOnOnePerson();
		Reporter.log("<p>Successfully clicked on TwoPerson Option");
		log.info("Successfully clicked on TwoPerson Option");
		System.out.println("step 5 end");
	}

	@Test(priority =6,description = "Step 6: click On Single Lodging Option")
	public void Step06_clickOnSingleLodgingOption() throws Exception {
		System.out.println("step 6 begin");
		CheckOutStep1 CS1=new CheckOutStep1(driver);
		CS1.selectRadioBtn();
		Reporter.log("<p>Successfully clicked on Single Lodging Option Radio Button");
		log.info("Successfully clicked on Single Lodging Option Radio Button");
		System.out.println("step 6 end");
	}

	@Test(priority =7,description = "Step 7 :Click on NoAirfare")
	public void Step07_clickOnNoAirfare() throws Exception {
		System.out.println("step 7 begin");
		CheckOutStep1 CS1=new CheckOutStep1(driver);
		CS1.selectNoAirfareRadioBtn();
		Reporter.log("<p>Successfully clicked on NOAITFARE option");
		log.info("Successfully clicked on NOAITFARE option");
		GUIFunctions.normalWait();
		System.out.println("step 7 end");
	}

	@Test(priority =8,description = "Step 8:Click on continue button")
	public void Step08_clickOnContinue() throws Exception {
		System.out.println("step 8 begin");
		CheckOutStep1 CS1=new CheckOutStep1(driver);
		CS1.ClickContinue();
		log.info("Successfully clicked on continue Button");
		Reporter.log("<p>Successfully clicked on continue");
		GUIFunctions.normalWait();
		System.out.println("step 8 end");
	}

	@Test(priority =9,description = "Step 9:Click on CS2 continue button")
	public void Step09_clickOnContinue() throws Exception {
		System.out.println("step 9 begin");
		CheckOutStep2 CS2=new CheckOutStep2(driver);
		CS2.Continue();
		log.info("Successfully clicked on continue Button");
		Reporter.log("<p>Successfully clicked on continue");
		GUIFunctions.normalWait();
		System.out.println("step 9 end");
	}

	@Test(priority =10,description = "Step 10:verify Order Summary Triptitle")
	public void Step10_verifyOSTriptitle() throws Exception {
		System.out.println("step 10 begin");
		CheckOutStep3 CS3=new CheckOutStep3(driver);
		CS3.verifyOSTriptitle();
		log.info("Successfully Order Summary Triptitle verified");
		Reporter.log("<p>Successfully Order Summary Triptitle verified");
		GUIFunctions.normalWait();
		System.out.println("step 10 end");	
	}

	@Test(priority =11,description = "Step 11:verify Order Summary PersonCount")
	public void Step11_verifyOSPersonCount() throws Exception {
		System.out.println("step 11 begin");
		CheckOutStep3 CS3=new CheckOutStep3(driver);
		CS3.verifyOSPersonCount();
		log.info("Successfully Order Summary PersonCount verified");
		Reporter.log("<p>Successfully Order Summary PersonCount verified");
		GUIFunctions.normalWait();
		System.out.println("step 11 end");	
	}

	@Test(priority =12,description = "Step 12:verify Order Summary ItemPrice")
	public void Step12_verifyOSItemPrice() throws Exception {
		System.out.println("step 12 begin");
		CheckOutStep3 CS3=new CheckOutStep3(driver);
		CS3.verifyOSItemPrice();
		log.info("Successfully Order Summary ItemPrice verified");
		Reporter.log("<p>Successfully Order Summary ItemPrice verified");
		GUIFunctions.normalWait();
		System.out.println("step 12 end");
	}

	@Test(priority =13,description = "Step 13:verify Order Summary FlightText")
	public void Step13_verifyOSFlightText() throws Exception {
		System.out.println("step 13 begin");
		CheckOutStep3 CS3=new CheckOutStep3(driver);
		CS3.verifyOSFlightText();
		log.info("Successfully Order Summary FlightText verified");
		Reporter.log("<p>Successfully Order Summary FlightText verified");
		GUIFunctions.normalWait();
		System.out.println("step 13 end");	
	}

	@Test(priority =14,description = "Step 14:verify Order Summary TotalPrice")
	public void Step14_verifyOSTotalPrice() throws Exception {
		System.out.println("step 14 begin");
		CheckOutStep3 CS3=new CheckOutStep3(driver);
		CS3.verifyOSTotalPrice();
		log.info("Successfully Order Summary TotalPrice verified");
		Reporter.log("<p>Successfully Order Summary TotalPrice verified");
		GUIFunctions.normalWait();
		System.out.println("step 14 end");
	}
}
