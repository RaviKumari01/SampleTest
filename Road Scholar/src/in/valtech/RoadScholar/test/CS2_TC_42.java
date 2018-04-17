//Author:Manjula
//Verify your details tab at the top->
//Verify your prefrences section,contact information,Price over view & order summary section
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CatalogRequest;
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


public class CS2_TC_42 extends BaseTest
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

	//verify the Your Details Tab at the top of checkout step2 page
	@Test(priority =9,description = "Step 9: verifying the Your Details Tab at the top of checkout step2 page")
	public void step09_verifyYourDetailsTab() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyYourDetailTab();
		log.info("Successfully verified the Your Details Tab at the top of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the Your Details Tab at the top of checkout step2 page");
		System.out.println("step 9 end");
		GUIFunctions.normalWait();
	}

	//verify the your preference section of checkout step3 page
	@Test(priority =10,description = "Step 10: verifying the your preference section of checkout step2 page")
	public void step10_verifypreference() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyPreference();
		log.info("Successfully verified the your preference section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the your preference section of checkout step2 page");
		System.out.println("step 10 end");
		GUIFunctions.normalWait();
	}

	//Verify the contact information section of checkout step2 page
	@Test(priority =11,description = "Step 11: verifying the contact information section of checkout step2 page")
	public void step11_verifyContactInformationSection() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyPreference();
		log.info("Successfully verified the the contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the contact information section of checkout step2 page");
		System.out.println("step 11 end");
		GUIFunctions.normalWait();
	}

	//Verify the first name field under contact information section
	@Test(priority =12,description = "Step 12: verifying the first name field under contact information section of checkout step2 page")
	public void step12_verifyFirstNameTextField() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2. verifyFirstName();
		log.info("Successfully verified the first name field under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the first name field under contact information section of checkout step2 page");
		System.out.println("step 12 end");
		GUIFunctions.normalWait();
	}

	//Verify the last name field under contact information section
	@Test(priority =13,description = "Step 13: verifying  the last name field under contact information section of checkout step2 page")
	public void step13_verifyLastNameTextField() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyLastName();
		log.info("Successfully verified the last name field under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the last name field under contact information section of checkout step2 page");
		System.out.println("step 13 end");
		GUIFunctions.normalWait();
	}

	//Verify the address field under contact information section
	@Test(priority =14,description = "Step 14: verifying the address field under contact information section of checkout step2 page")
	public void step14_verifyAddressTextField() throws Exception 
	{
		System.out.println("step 14 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyAddress();
		log.info("Successfully verified the address field under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the address field under contact information section of checkout step2 page");
		System.out.println("step 14 end");
		GUIFunctions.normalWait();
	}

	//Verify the city field under contact information section
	@Test(priority =15,description = "Step 15: verifying the city field under contact information section of checkout step2 page")
	public void step15_verifyCityField() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyCity();
		log.info("Successfully verified the city field under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the city field under contact information section of checkout step2 page");
		System.out.println("step 15 end");
		GUIFunctions.normalWait();
	}

	//Verify the zip code field under contact information section
	@Test(priority =16,description = "Step 20: verifying the zip code field under contact information section of checkout step2 page")
	public void step16_verifyZipCodeField() throws Exception 
	{
		System.out.println("step 16 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyZipCode();
		log.info("Successfully verified the zip code field under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the zip code field under contact information section of checkout step2 page");
		System.out.println("step 16 end");
		GUIFunctions.normalWait();
	}

	//Verify the phone number field under contact information section
	@Test(priority =17,description = "Step 17: verifying the phone number field under contact information section of checkout step2 page")
	public void step17_verifyPhoneNumberField() throws Exception 
	{
		System.out.println("step 17 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyPhoneNumber();
		log.info("Successfully verified the phone number field under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the phone number field under contact information section of checkout step2 page");
		System.out.println("step 17 end");
		GUIFunctions.normalWait();
	}

	//Verify the country drop down under contact information section
	@Test(priority =18,description = "Step 18: verifying the country drop down under contact information section of checkout step2 page")
	public void step18_verifyCountryDropDowwn() throws Exception 
	{
		System.out.println("step 18 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyCountryDropDown();
		log.info("Successfully verified the country drop down under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the country drop down under contact information section of checkout step2 page");
		System.out.println("step 18 end");
		GUIFunctions.normalWait();
	}

	//Verify the state drop down under contact information section
	@Test(priority =19,description = "Step 19: verifying the state drop down under contact information section of checkout step2 page")
	public void step19_verifyStateDropDowwn() throws Exception 
	{
		System.out.println("step 19 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyStateDropDown();
		log.info("Successfully verified the state drop down under contact information section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the state drop down under contact information section of checkout step2 page");
		System.out.println("step 19 end");
		GUIFunctions.normalWait();
	}

	//verify the order summary section of checkout step2 page
	@Test(priority =20,description = "Step 20: verifying the order summary section of checkout step2 page")
	public void step20_verifyOrderSummarySection() throws Exception 
	{
		System.out.println("step 20 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyStateDropDown();
		log.info("Successfully verified the order summary section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the order summary section of checkout step2 page");
		System.out.println("step 20 end");
		GUIFunctions.normalWait();
	}

	//verify the continue button displayed under the order summary section of checkout step2 page
	@Test(priority =21,description = "Step 21: verifying the continue button displayed under the order summary section of checkout step2 page")
	public void step21_verifyOrderSummaryContinueBtn() throws Exception 
	{
		System.out.println("step 21 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyStateDropDown();
		log.info("Successfully verified the continue button displayed under the order summary section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the continue button displayed under the order summary section of checkout step2 page");
		System.out.println("step 21 end");
		GUIFunctions.normalWait();
	}

	//verify talk to section is displayed under order summary section of checkout step2 page
	@Test(priority =22,description = "Step 22: verifying talk to section is displayed under order summary section of checkout step2 page")
	public void step22_verifyTalkToUsSection() throws Exception 
	{
		System.out.println("step 22 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyStateDropDown();
		log.info("Successfully verified the  talk to section is displayed under order summary section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified talk to section is displayed under order summary section of checkout step2 page");
		System.out.println("step 22 end");
		GUIFunctions.normalWait();
	}

	//verify price overview section of checkout step2 page
	@Test(priority =23,description = "Step 23: verifying price overview section of checkout step2 page")
	public void step23_verifyPriceOverviewSection() throws Exception 
	{
		System.out.println("step 23 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyPriceOverviewSection();
		log.info("Successfully verified the price overview section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified price overview section of checkout step2 page");
		System.out.println("step 24 end");
		GUIFunctions.normalWait();
	}

	//verify back button is displayed under price overview section of checkout step2 page
	@Test(priority =24,description = "Step 24: verifying back button is displayed under price overview section of checkout step2 page")
	public void step24_verifyBackButton() throws Exception 
	{
		System.out.println("step 24 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyBackButton();
		log.info("Successfully verified the back button is displayed under price overview section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified the back button is displayed under price overview section of checkout step2 page");
		System.out.println("step 24 end");
		GUIFunctions.normalWait();
	}

	//verify continue button is displayed under price overview section of checkout step2 page
	@Test(priority =25,description = "Step 25: verifying continue button is displayed under price overview section of checkout step2 page")
	public void step25_verifyContinueButton() throws Exception 
	{
		System.out.println("step 25 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.verifyContinueButton();
		log.info("Successfully verified continue button is displayed under price overview section of checkout step2 page \n");
		Reporter.log("<p>Successfully verified continue button is displayed under price overview section of checkout step2 page");
		System.out.println("step 25 end");
		GUIFunctions.normalWait();
	}

}
