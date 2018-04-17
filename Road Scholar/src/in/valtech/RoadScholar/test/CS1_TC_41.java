//Author:Manjula
//Navigate to checkout step-1 page->Verify & Click on change date button->
//User should be navigated to trip page->Click on enroll now button->
//Select any date->select travelling & lodging option-> 
//Select any flight option->Click on continue button

package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import  in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class CS1_TC_41 extends BaseTest
{
	static  HomePage homePage ;
	
	//Enter the trip id into search text field of home page
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

	@Test(priority = 3, description = "Step 3: Click on the Date&Price tab ")
	public void step03_ClickOnDatePriceTab() throws InterruptedException {
		System.out.println("step 3 begin");
		TripDetailPage enroll=new TripDetailPage(driver);
		enroll.clickOnEnrollNowBtn();
		log.info("Successfully clicked on the Date&Price tab \n");
		Reporter.log("<p>Successfully Clicked on the Date&Price tab  ");
		System.out.println("step 3 end");
	}

	@Test(priority = 4, description = "Step 4: Select date from Dates & Price tab ")
	public void step04_SelectDateFromDatesAndPriceTab() throws Exception {
		System.out.println("step 4 begin");
		TripDatesAndPrices dates= new TripDatesAndPrices(driver);
		dates.clickOnSelectDateBtn();
		log.info("Successfully selected date from Dates & Price tab \n");
		Reporter.log("<p>Successfully selected date from Dates & Price tab  ");
		System.out.println("step 4 end");
	}

	//Verify the change date button in checkout step 1 page
	@Test(priority =5,description = "Step 5: verify change date button")
	public void Step05_verifyChangeDateBtn() throws Exception 
	{
		System.out.println("step 5 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.verifyChangeDateBtn();
		log.info("Successdully verified change date button");
		System.out.println("step 5 end");
		GUIFunctions.normalWait();
	}

	//click on change date button
	@Test(priority =6,description = "Step 6: click on changae date button")
	public void Step06_clickChangeDateBtn() throws Exception 
	{
		System.out.println("step 6 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.clickOnChangeDateBtn();
		log.info("Successdully clicked on change date button");
		System.out.println("step 6 end");
		GUIFunctions.normalWait();
	}

	//click on Enroll now button
	@Test(priority =7,description = "Step 7: click on enroll now button")
	public void Step07_clickEnrollNow() throws Exception 
	{
		System.out.println("step 7 begin");
		TripDetailPage trp =new TripDetailPage(driver);
		trp.clickOnEnrollNowBtn();
		Thread.sleep(5000);
		log.info("Successdully clicked on enroll now button");
		System.out.println("step 7 end");
	}

	//click on select date button
	@Test(priority = 8, description = "Step 8: Select date from Dates & Price tab ")
	public void step08_SelectDateFromDatesAndPriceTab() throws Exception {
		System.out.println("step 8 begin");
		TripDatesAndPrices dates= new TripDatesAndPrices(driver);
		dates.clickOnSelectDateBtn();
		log.info("Successfully selected date from Dates & Price tab \n");
		Reporter.log("<p>Successfully selected date from Dates & Price tab  ");
		System.out.println("step 8 end");
	}

	//Select the number of people enrolling from your household
	@Test(priority =9,description = "Step 9: click on single person")
	public void Step09_click() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.clickOnOnePerson();
		log.info("Successdully selected one person");
		System.out.println("step 9 end");
		GUIFunctions.normalWait();
	}

	@Test(priority =10,description = "Step 10: select flight option")
	public void Step10_SelectDoubleRadioBtn() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.selectRadioBtn();
		log.info("Successdully selected  button");
		System.out.println("Successdully selected button");
		System.out.println("step 10 end");
		GUIFunctions.normalWait();
	}

	@Test(priority =11,description = "Step 11: select no interface radio button ")
	public void Step11_selectNoInterfaceRadioBtn() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.selectNoAirfareRadioBtn();
		log.info("Successfully selected no interface radio button \n ");
		Reporter.log("<p>Successfully selected no interface radio button");
		System.out.println("step 11 end");
		GUIFunctions.normalWait();
	}

	@Test(priority =12,description = "Step 12: click on continue button")
	public void Step12_clickOnContinueBtn() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.ClickContinue();
		Thread.sleep(5000);
		log.info("Successdully clicked on continue button");
		System.out.println("Successdully clicked on continue button");
		System.out.println("step 12 end");
	}


}

