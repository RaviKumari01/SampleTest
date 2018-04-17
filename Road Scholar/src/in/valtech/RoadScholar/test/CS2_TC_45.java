/*//Author:Manjula
Navigate to checkout step-2 page as a new user->
Select country as USA ->fill reamining fields except state->
Click on continue button->Verify the error message->
Now select country as canada and click on continue button and verify the error message->
Select state dropdown->Click on continue button
 */

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CS2_TC_45 extends BaseTest
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

	//click on date and prices tab from trip detail page
	@Test(priority =3,description = "Step 3:  click on date and prices tab from trip detail page")
	public void step03_clickOnDateAndPricesTab() throws Exception 
	{
		System.out.println("step 3 begin");
		GUIFunctions.normalWait();
		TripDetailPage trp =new TripDetailPage(driver);
		trp.clickOnDateAndpriceTab();;
		log.info("Successfully clicked on date and prices tab \n");
		Reporter.log("<p>Successfully clicked on date and prices tab");
		System.out.println("step 3 end");
		GUIFunctions.normalWait();
	}

	//click on select date button from trip date and prices pages
	@Test(priority =4,description = "Step 4:  click on select date button from trip date and prices pages")
	public void step04_clickOnSelectBtn() throws Exception 
	{
		System.out.println("step 4 begin");
		TripDatesAndPrices tdp =new TripDatesAndPrices(driver);
		tdp.clickOnSelectDateBtn();
		log.info("Successfully clicked on select button \n");
		Reporter.log("<p>Successfully clicked on select button");
		System.out.println("step 4 end");
		GUIFunctions.normalWait();
	}

	//Select the number of people enrolling from your household
	@Test(priority =5,description = "Step 5: click on single person under number of people enrolling from your household section")
	public void step05_click() throws Exception 
	{
		System.out.println("step 5 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.clickOnOnePerson();
		log.info("Successfully selected single person under number of people enrolling from your household section \n");
		Reporter.log("<p>Successfully selected single person under number of people enrolling from your household section ");
		System.out.println("step 5 end");
		GUIFunctions.normalWait();
	}

	//select lodging option 
	@Test(priority =6,description = "Step 6: select single radio button ")
	public void step06_SelectDoubleRadioBtn() throws Exception 
	{
		System.out.println("step 6 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.selectRadioBtn();
		log.info("Successfully selected  button");
		System.out.println("Successfully selected single radio button \n ");
		Reporter.log("<p>Successfully selected single radio button");
		System.out.println("step 6 end");
		GUIFunctions.normalWait();
	}

	//select no airface radio button
	@Test(priority =7,description = "Step 7: select no airface radio button ")
	public void Step07_selectNoInterfaceRadioBtn() throws Exception 
	{
		System.out.println("step 7 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.selectNoAirfareRadioBtn();
		log.info("Successfully selected no interface radio button \n ");
		Reporter.log("<p>Successfully selected no interface radio button");
		System.out.println("step 7 end");
		GUIFunctions.normalWait();
	}

	//click on continue button
	@Test(priority =8,description = "Step 8: click on continue button")
	public void step08_clickOnContinueBtn() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		GUIFunctions.normalWait();
		cs1.ClickContinue();
		log.info("Successfully clicked on continue button \n");
		System.out.println("Successfully clicked on continue button");
		Reporter.log("<p>Successfully clicked on continue button");
		System.out.println("step 8 end");
	}

	//enter the text into the first name text field
	@Test(priority =9,description = "Step 9:  Enter the text into the first name text field")
	public void Step09_EnterValueFirstName() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.enterTextIntoFirstNameField();
		log.info("Successfully entered text into first name text field \n");
		Reporter.log("<p>Successfully entered text into first name text field");
		GUIFunctions.normalWait();
		System.out.println("step 9 end");
	}

	//enter the text into the last name field
	@Test(priority =10,description = "Step 10:  Enter the text into the last name text field")
	public void Step10_enterValueLastName() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.enterTextIntoLastNameField();
		log.info("Successfully entered text into last name text field \n");
		Reporter.log("<p>Successfully entered text into last name text field");
		GUIFunctions.normalWait();
		System.out.println("step 10 end");
	}

	//enter the text into the address field
	@Test(priority =11,description = "Step 11:  Enter the text into the Address  text field")
	public void Step11_enterValueAddress() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.enterTextIntoAddressField();
		log.info("Successfully entered text into Address text field \n");
		Reporter.log("<p>Successfully entered text into Address text field");
		GUIFunctions.normalWait();
		System.out.println("step 11 end");
	}

	//enter the text into the city field
	@Test(priority =12,description = "Step 12:  Enter the text into the City text field")
	public void Step12_enterCity() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.enterTextIntoCityField();
		log.info("Successfully entered text into City text field \n");
		Reporter.log("<p>Successfully entered text into City text field");
		GUIFunctions.normalWait();
		System.out.println("step 12 end");
	}

	//enter the value into the phone number field
	@Test(priority =13,description = "Step 13:  Enter the text into the phone number text field")
	public void Step13_enterPhoneNumber() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.enterTextIntoPhoneNumberField();
		log.info("Successfully entered text into phone number text field \n");
		Reporter.log("<p>Successfully entered text into phone number text field");
		GUIFunctions.normalWait();
		System.out.println("step 13 end");
	}

	//enter the value into the Zip Code field
	@Test(priority =14,description = "Step 14:  Enter the text into the zip code text field")
	public void Step14_enterZipCode() throws Exception 
	{
		System.out.println("step 14 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.enterValueIntoZipCodeField();
		log.info("Successfully entered text zip code field \n");
		Reporter.log("<p>Successfully entered text zip code field ");
		GUIFunctions.normalWait();
		System.out.println("step 14 end");
	}

	//select the country value
	@Test(priority =15,description = "Step 15: select the country from drop down")
	public void Step15_selectCountry1() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.selectCountry();
		log.info("Successfully country selected from country drop down \n");
		Reporter.log("<p>Successfully country selected from country drop down");
		System.out.println("step 15 end");
	}

	//select the state drop down
	@Test(priority =16,description = "Step 16: select state drop down")
	public void Step16_selectStateDropDown() throws Exception 
	{
		System.out.println("step 17 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.Selectstate();
		log.info("Successfully selected state drop down \n");
		Reporter.log("<p>Successfully selected state drop down");
		GUIFunctions.normalWait();
		System.out.println("step 17 end");
	}

	//Click on continue button 
	@Test(priority =18,description= "Step 18:  Click on continue button")
	public void Step18_clickOnContinueBtn() throws InterruptedException
	{
		System.out.println("step 18 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.clickOnContinueBtn();
		log.info("Successfully clicked on continue button");
		Reporter.log("<p>Successfully clicked on continue button");
		System.out.println("Successfully clicked on continue button");
		System.out.println("step 18 end");
	}



}
