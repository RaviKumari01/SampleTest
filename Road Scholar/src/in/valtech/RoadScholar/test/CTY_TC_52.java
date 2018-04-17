package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.CheckOutStep3;
import in.valtech.RoadScholar.pages.CheckOutThankYou;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CTY_TC_52 extends BaseTest
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
		log.info("Successfully clicked on search button\n");
		Reporter.log("<p>Successfully clicked on search button");
		System.out.println("step 2 end");
		GUIFunctions.normalWait();
	}

	//click on date and prices tab from trip detail page
	@Test(priority =3,description = "Step 3: click on date and prices tab from trip detail page")
	public void Step03_clickOnDateAndPricesTab() throws Exception 
	{
		System.out.println("step 3 begin");
		GUIFunctions.normalWait();
		TripDetailPage trp =new TripDetailPage(driver);
		trp. clickOnDateAndpriceTab();
		log.info("Successfully clicked on date and prices tab from trip detail page \n");
		Reporter.log("<p>Successfully clicked on date and prices tab from trip detail page");
		System.out.println("step 3 end");
		GUIFunctions.normalWait();
	}

	//click on select date button from trip date and prices pages
	@Test(priority =4,description = "Step 4:  click on select date button from trip date and prices pages")
	public void Step04_clickOnSelectBtn() throws Exception 
	{
		System.out.println("step 10 begin");
		TripDatesAndPrices tdp =new TripDatesAndPrices(driver);
		tdp.clickOnSelectDateBtn();
		log.info("Successfully clicked on select button");
		Reporter.log("<p>Successfully clicked on date and prices tab from trip detail page");
		System.out.println("step 10 end");
		GUIFunctions.normalWait();
	}

	//Select the number of people enrolling from your household
	@Test(priority =5,description = "Step 5: click on single person under number of people enrolling from your household section")
	public void Step05_click() throws Exception 
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
	@Test(priority =6,description = "Step 6: select no interface radio button ")
	public void Step06_selectNoInterfaceRadioBtn() throws Exception 
	{
		System.out.println("step 6 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.selectNoAirfareRadioBtn();
		log.info("Successfully selected  button");
		System.out.println("Successfully selected no interface radio button \n ");
		Reporter.log("<p>Successfully selected no interface radio button");
		System.out.println("step 6 end");
		GUIFunctions.normalWait();
	}

	//select single radio button under one person section 
	@Test(priority =7,description = "Step 7: select single radio button ")
	public void Step07_SelectDoubleRadioBtn() throws Exception 
	{
		System.out.println("step 07 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.selectRadioBtn();
		log.info("Successfully selected  button");
		System.out.println("Successfully selected single radio button \n ");
		Reporter.log("<p>Successfully selected single radio button");
		System.out.println("step 07 end");
		GUIFunctions.normalWait();
	}

	//click on continue button
	@Test(priority =8,description = "Step 8: click on continue button")
	public void Step08_clickOnContinueBtn() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep1 cs1 =new CheckOutStep1(driver);
		cs1.ClickContinue();
		log.info("Successfully clicked on continue button \n");
		System.out.println("Successfully clicked on continue button");
		Reporter.log("<p>Successfully clicked on continue button");
		System.out.println("step 8 end");
		GUIFunctions.normalWait();
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
	public void Step19_enterPhoneNumber() throws Exception 
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
	public void Step21_selectCountry1() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.SelectUSFromDropDown();
		log.info("Successfully country selected from country drop down \n");
		Reporter.log("<p>Successfully country selected from country drop down");
		System.out.println("step 15 end");
	}

	//select the state drop down
	@Test(priority =16,description = "Step 16: select state drop down")
	public void Step16_selectStateDropDown() throws Exception 
	{
		System.out.println("step 16 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.Selectstate();
		log.info("Successfully selected state drop down \n");
		Reporter.log("<p>Successfully selected state drop down");
		GUIFunctions.normalWait();
		System.out.println("step 16 end");
	}

	//Click on continue button 
	@Test(priority =17,description= "Step 17:  Click on continue button")
	public void Step17_clickOnContinueBtn() throws InterruptedException
	{
		System.out.println("step 17 begin");
		CheckOutStep2 cs2 =new CheckOutStep2(driver);
		cs2.clickOnContinueBtn();
		log.info("Successfully clicked on continue button");
		Reporter.log("<p>Successfully clicked on continue button");
		System.out.println("Successfully clicked on continue button");
		System.out.println("step 17 end");
	}

	//Click on the $10 radio button
	@Test(priority =18, description = "Step 18: click on $10 Radio button under make a donation section")
	public void step18_clickOn$10RadioButton() throws Exception 
	{   
		System.out.println("step 18 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.clickOn$10RadioButton();
		log.info("Successfully clicked on $10 Radio button under make a donation section \n");
		Reporter.log("<p>Successfully clicked on $10 Radio button under make a donation section");
		System.out.println("step 18 end");
	}

	//clicks on the View terms and condition link of chekout step3 page
	@Test(priority =19, description = "Step 19: clicks on the View terms and condition link of chekout step3 page")
	public void step19_clickOn$10RadioButton() throws Exception 
	{   
		System.out.println("step 19 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.clickOnViewTermsAndConditionLink();
		log.info("Successfully clicked on the View terms and condition link of chekout step3 page \n");
		Reporter.log("<p>Successfully clicked on the View terms and condition link of chekout step3 page");
		System.out.println("step 19 end");
	}

	//clicks on okay button
	@Test(priority =20, description = "Step 20: clicks on okay button from pop up")
	public void step20_clickOnOkayButton() throws Exception 
	{   
		System.out.println("step 20 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.Okay();
		log.info("Successfully clicked on the okay button \n");
		Reporter.log("<p>Successfully clicked on the okay button");
		System.out.println("step 20 end");
	}

	//clicks on i accept radio button
	@Test(priority =21, description = "Step 21: clicks on i accept radio button under terms and condition section")
	public void step21_clickIAcceptButton() throws Exception 
	{   
		System.out.println("step 21 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.Accept();
		log.info("Successfully clicked on i accept button \n");
		Reporter.log("<p>Successfully clicked on i accept button");
		System.out.println("step 21 end");
	}

	//clicks on pay by check radio button
	@Test(priority =22, description = "Step 22: clicks on pay by check radio button")
	public void step22_clickPayByCheckRadioButton() throws Exception 
	{   
		System.out.println("step 22 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.clickOnPayByCheckRadioButton();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on pay by check radio button \n");
		Reporter.log("<p>Successfully clicked on pay by check radio button");
		System.out.println("step 22 end");
	}

	//enter text into all mandatory fields of pay by check pop up
	@Test(priority =23, description = "Step 23:enter text into all mandatory fields of pay by check pop up")
	public void step23_enterTextIntoAllMandatoryFields() throws Exception 
	{   
		System.out.println("step 23 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.enterAllMandatoryFields();
		GUIFunctions.normalWait();
		log.info("Successfully entered text into all mandatory fields of pay by check pop up\n");
		Reporter.log("<p>Successfully entered text into all mandatory fields of pay by check pop up");
		System.out.println("step 23 end");
	}

	//click on complete button of pay by check pop up
	@Test(priority =24, description = "Step 24: click on complete button of pay by check pop up")
	public void step24_clcickOnCompleteButton() throws Exception 
	{   
		Thread.sleep(5000);
		System.out.println("step 24 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.clickOnCompleteButton();
		Thread.sleep(5000);
		log.info("Successfully clicked on complete button of pay by check pop up\n");
		Reporter.log("<p>Successfully clicked on complete button of pay by check pop up");
		System.out.println("step 24 end");
	}

	//verify the title of checkout thank you page 
	@Test(priority =25, description = "Step 25:verify the title of checkout thank you page ")
	public void step25_verifyTitle() throws Exception 
	{   
		System.out.println("step 25 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyTitle();
		log.info("Successfully verified the title of checkout thank you page\n");
		Reporter.log("<p>Successfully verified the title of checkout thank you page");
		System.out.println("step 25 end");
	}

	//verify the description of checkout thank you page 
	@Test(priority =26, description = "Step 26:verify the description of checkout thank you page  ")
	public void step26_verifyDescription() throws Exception 
	{   
		System.out.println("step 26 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyDescription();
		log.info("Successfully verified the description of checkout thank you page\n");
		Reporter.log("<p>Successfully verified the description of checkout thank you page");
		System.out.println("step 26 end");
	}

	//verifies the PeopleTravelling of checkout thank you page
	@Test(priority =27, description = "Step 27:verify the PeopleTravelling of checkout thank you page  ")
	public void step27_verifyPeopleTravelling() throws Exception 
	{   
		System.out.println("step 27 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyPeopleTravelling();
		log.info("Successfully verified the PeopleTravelling of checkout thank you page\n");
		Reporter.log("<p>Successfully verified the PeopleTravelling of checkout thank you page");
		System.out.println("step 27 end");
	}

	//verifies the order number of checkout thank you page
	@Test(priority =28, description = "Step 28:verify the order number of checkout thank you page  ")
	public void step28_verifyordernumber() throws Exception 
	{   
		System.out.println("step 28 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyOrderNumber();
		log.info("Successfully verified the order number of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the order number of checkout thank you page ");
		System.out.println("step 28 end");
	}

	//verifies the program name of checkout thank you page
	@Test(priority =29, description = "Step 29:verify the program name of checkout thank you page  ")
	public void step29_verifyProgramName() throws Exception 
	{   
		System.out.println("step 29 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyProgramName();
		log.info("Successfully verified the program name of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the program name of checkout thank you page ");
		System.out.println("step 29 end");
	}

	//verifies the program number of checkout thank you page
	@Test(priority =30, description = "Step 30:verify the program number of checkout thank you page  ")
	public void step30_verifyProgramNumber() throws Exception 
	{   
		System.out.println("step 30 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyProgramNumber();
		log.info("Successfully verified the program number of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the program number of checkout thank you page ");
		System.out.println("step 30 end");
	}

	//verifies the program dates of checkout thank you page
	@Test(priority =31, description = "Step 31:verify the program dates of checkout thank you page  ")
	public void step31_verifyProgramDates() throws Exception 
	{   
		System.out.println("step 31 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyProgramDates();
		log.info("Successfully verified the program date of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the program date of checkout thank you page ");
		System.out.println("step 31 end");
	}

	//verifies the Accommodation of checkout thank you page
	@Test(priority =32, description = "Step 32:verify the accommodation of checkout thank you page  ")
	public void step32_verifyAccommodation() throws Exception 
	{   
		System.out.println("step 32 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyAccommodation();
		log.info("Successfully verified the accommodation of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the accommodation date of checkout thank you page ");
		System.out.println("step 32 end");
	}

	//verifies the Activity level of checkout thank you page
	@Test(priority =33, description = "Step 33:verify the activity level of checkout thank you page  ")
	public void step33_verifyActivityLevel() throws Exception 
	{   
		System.out.println("step 33 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyActivityLevel();
		log.info("Successfully verified the activity level of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the activity level of checkout thank you page ");
		System.out.println("step 33 end");
	}

	//verifies the total price of checkout thank you page
	@Test(priority =34, description = "Step 34:verify the total price of checkout thank you page  ")
	public void step34_verifyTotalPrice() throws Exception 
	{   
		System.out.println("step 34 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyTotalPrice();
		log.info("Successfully verified the total price of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the total price of checkout thank you page ");
		System.out.println("step 34 end");
	}

	//verifies the with a gift section of checkout thank you page
	@Test(priority =35, description = "Step 35:verify the with a gift section of checkout thank you page  ")
	public void step35_verifyWithAGift() throws Exception 
	{   
		System.out.println("step 35 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyWithAGift();
		log.info("Successfully verified the with a gift section of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the with a gift section of checkout thank you page ");
		System.out.println("step 35 end");
	}

	//verifies the remaining balance of checkout thank you page
	@Test(priority =36, description = "Step 36:verifies the remaining balance of checkout thank you page ")
	public void step36_verifyRemainingBalance() throws Exception 
	{   
		System.out.println("step 36 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyRemainingBalance();
		log.info("Successfully verified the remaining balance of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the remaining balance of checkout thank you page ");
		System.out.println("step 36 end");
	}

	//verifies the cancellation policy link of checkout thank you page
	@Test(priority =37, description = "Step 37:verifies the cancellation policy link of checkout thank you page ")
	public void step37_verifyCancellationPolicyLink() throws Exception 
	{   
		System.out.println("step 37 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyCancellationPolicyLink();
		log.info("Successfully verified the cancellation policy link of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the cancellation policy link of checkout thank you page ");
		System.out.println("step 37 end");
	}

	//verifies the learn more link of checkout thank you page
	@Test(priority =38, description = "Step 38:verifies the learn more link of checkout thank you page ")
	public void step38_verifyLearnMoreLink() throws Exception 
	{   
		System.out.println("step 38 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyCancellationPolicyLink();
		log.info("Successfully verified the learn more link of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the learn more link of checkout thank you page ");
		System.out.println("step 38 end");
	}

	//verifies the order number  of checkout thank you page
	@Test(priority =39, description = "Step 39:verifies the value of order number of checkout thank you page ")
	public void step39_verifyValueOfOrderNumber() throws Exception 
	{   
		System.out.println("step 39 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyOrderNumberValue();
		log.info("Successfully verified the value of order number of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the value of order number of checkout thank you page ");
		System.out.println("step 39 end");
	}

	//verifies the value of order name  of checkout thank you page
	@Test(priority =40, description = "Step 40:verifies the value of order name of checkout thank you page ")
	public void step40_verifyValueOfOrderName() throws Exception 
	{   
		System.out.println("step 40 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyValueOfOrderName();
		log.info("Successfully verified the value of order name of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the value of order name of checkout thank you page ");
		System.out.println("step 40 end");
	}

	//verifies the value of Program name  of checkout thank you page
	@Test(priority =41, description = "Step 41:verifies the value of program name of checkout thank you page ")
	public void step41_verifyValueOfProgramName() throws Exception 
	{   
		System.out.println("step 41 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyValueProgramName();
		log.info("Successfully verified the value of program name of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the value of program name of checkout thank you page ");
		System.out.println("step 41 end");
	}

	//verifies the value of Program number  of checkout thank you page
	@Test(priority =42, description = "Step 42:verifies the value of program number of checkout thank you page ")
	public void step42_verifyValueOfProgramNumber() throws Exception 
	{   
		System.out.println("step 42 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyValueProgramNumber();
		log.info("Successfully verified the value of program number of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the value of program number of checkout thank you page ");
		System.out.println("step 42 end");
	}

	//verifies the value of Program date  of checkout thank you page
	@Test(priority =43, description = "Step 43:verifies the value of program date of checkout thank you page ")
	public void step43_verifyValueOfProgramDate() throws Exception 
	{   
		System.out.println("step 43 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyValueOfProgramDate();
		GUIFunctions.normalWait();
		/*TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.expectedValueOfDate();*/
		log.info("Successfully verified the value of program date of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the value of program date of checkout thank you page ");
		System.out.println("step 43 end");
	}

	/*//verifies the value of Program date  of checkout thank you page
	@Test(priority =51, description = "Step 51:verifies the value of program date of checkout thank you page ")
	public void step51_verifyValueOfProgramDate() throws Exception 
	{   
		System.out.println("step 51 begin");
		CheckOutThankYou cty =new CheckOutThankYou(driver);
		cty.verifyValueOfProgramDate();
		GUIFunctions.normalWait();
		log.info("Successfully verified the value of program date of checkout thank you page \n");
		Reporter.log("<p>Successfully verified the value of program date of checkout thank you page ");
		System.out.println("step 50 end");
	}
	 */
}


