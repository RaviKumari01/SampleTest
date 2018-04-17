//Author:Manjula
//Navigate to payment page (checkout step-3)->
//Select all the mandatory fields->
//Click on pay by check payment type radio btn->
//Verify All the fields displayed->
//Click on complete button->
//Verify the error message->Enter all the details ->Click on complete button

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.CheckOutStep3;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CS3_TC_51 extends BaseTest
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

	//verify name on account text box of pay by check pop up
	@Test(priority =23, description = "Step 23: verify name on account text box of pay by check pop up")
	public void step23_nameOnAccountTextBox() throws Exception 
	{   
		System.out.println("step 23 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyNameOnAccountTextBox();
		log.info("Successfully verified name on account text box of pay by check pop up \n");
		Reporter.log("<p>Successfully verified name on account text box of pay by check pop up ");
		System.out.println("step 23 end");
	}

	//verify account type text box of pay by check pop up
	@Test(priority =24, description = "Step 24: verify account type text box of pay by check pop up")
	public void step24_AccountTypeTextBox() throws Exception 
	{   
		System.out.println("step 24 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyAccountTypeTextBox();
		log.info("Successfully verified account type text box of pay by check pop up \n");
		Reporter.log("<p>Successfully verified account type text box of pay by check pop up");
		System.out.println("step 24 end");
	}

	//verify ROUTING NUMBER text box of pay by check pop up
	@Test(priority =25, description = "Step 25: verify routing number text box of pay by check pop up")
	public void step25_routingNumberTextBox() throws Exception 
	{   
		System.out.println("step 25 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyRoutingNumberTextBox();
		log.info("Successfully verified routing number text box of pay by check pop up \n");
		Reporter.log("<p>Successfully verified routing number text box of pay by check pop up");
		System.out.println("step 25 end");
	}

	//verify Account number text box of pay by check pop up
	@Test(priority =26, description = "Step 26: verify Account number text box of pay by check pop up")
	public void step26_AccountNumberTextBox() throws Exception 
	{   
		System.out.println("step 26 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyAccountNumberTextBox();
		log.info("Successfully verified  Account number text box of pay by check pop up \n");
		Reporter.log("<p>Successfully verified  Account number text box of pay by check pop up");
		System.out.println("step 26 end");
	}

	//verify Bank name text box of pay by check pop up
	@Test(priority =27, description = "Step 27: verify Bank name text box of pay by check pop up")
	public void step27_BankNameTextBox() throws Exception 
	{   
		System.out.println("step 27 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyAccountNumberTextBox();
		log.info("Successfully verified Bank name text box of pay by check pop up \n");
		Reporter.log("<p>Successfully verified  Bank name text box of pay by check pop up");
		System.out.println("step 27 end");
	}

	//verify amount text box of pay by check pop up
	@Test(priority =28, description = "Step 28: verify amount text box of pay by check pop up")
	public void step28_AmountTextBox() throws Exception 
	{   
		System.out.println("step 28 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyAmountTextBox();
		log.info("Successfully verified amount text box of pay by check pop up \n");
		Reporter.log("<p>Successfully verified  amount text box of pay by check pop up");
		System.out.println("step 28 end");
	}

	//verify complete button of pay by check pop up
	@Test(priority =29, description = "Step 29: verify complete button of pay by check pop up")
	public void step29_completeButton() throws Exception 
	{   
		System.out.println("step 29 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyCompleteButton();
		log.info("Successfully verified complete button of pay by check pop up \n");
		Reporter.log("<p>Successfully verified  complete button of pay by check pop up");
		System.out.println("step 35 end");
	}

	//click on complete button of pay by check pop up
	@Test(priority =30, description = "Step 30: click on complete button of pay by check pop up")
	public void step30_clcickOnCompleteButton() throws Exception 
	{   
		System.out.println("step 30 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.clickOnCompleteButton();
		log.info("Successfully clicked on complete button of pay by check pop up\n");
		Reporter.log("<p>Successfully clicked on complete button of pay by check pop up");
		System.out.println("step 30 end");
	}

	//verify the error message without entering details into all field and click on complete button of pay by check pop up
	@Test(priority =31, description = "Step 31:verify the error message")
	public void step31_verifyErrorMessage() throws Exception 
	{   
		System.out.println("step 31 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyError();
		log.info("Successfully verified error message of pay by check pop up\n");
		Reporter.log("<p>Successfully verified error message of pay by check pop up");
		System.out.println("step 31 end");
	}

	//enter text into all mandatory fields of pay by check pop up
	@Test(priority =32, description = "Step 32:enter text into all mandatory fields of pay by check pop up")
	public void step32_enterTextIntoAllMandatoryFields() throws Exception 
	{   
		System.out.println("step 32 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3. enterAllMandatoryFields();
		log.info("Successfully entered text into all mandatory fields of pay by check pop up\n");
		Reporter.log("<p>Successfully entered text into all mandatory fields of pay by check pop up");
		System.out.println("step 32 end");
	}

	//click on complete button of pay by check pop up
	@Test(priority =33, description = "Step 33: click on complete button of pay by check pop up")
	public void step33_clcickOnCompleteButton() throws Exception 
	{   
		System.out.println("step 33 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.clickOnCompleteButton();
		log.info("Successfully clicked on complete button of pay by check pop up\n");
		Reporter.log("<p>Successfully clicked on complete button of pay by check pop up");
		System.out.println("step 33 end");
	}
}
