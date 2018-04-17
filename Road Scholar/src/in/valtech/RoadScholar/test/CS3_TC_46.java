//Author:Manjula
//Verify all the components of this page Checkout step-3

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

public class CS3_TC_46 extends BaseTest
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

	//verify the title of the checkout step3 page
	@Test(priority =18, description = "Step 18:  verifying Title of the checkout step3 page")
	public void Step18_VerifyTitle() throws Exception 
	{   
		System.out.println("step 18 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyTitle();
		log.info("Verified title of the checkout step3 page \n");
		Reporter.log("<p>Verified title of the checkout step3 page");
		System.out.println("step 18 end");
	}

	//verify the title description of the checkout step3 page
	@Test(priority =19, description = "Step 19:  verifying title description of the checkout step3 page")
	public void Step19_VerifyTitleDescription() throws Exception 
	{   
		System.out.println("step 19 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyTitleDescription();
		log.info("Verified title description of the checkout step3 page \n");
		Reporter.log("<p>Verified title description of the checkout step3 page");
		System.out.println("step 19 end");
	}

	//verify the todays payment section of checkout step3 page
	@Test(priority =20, description = "Step 20:  verifying todays payment section of checkout step3 page")
	public void Step20_VerifyTodayspaymentsection() throws Exception 
	{   
		System.out.println("step 20 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyTodayspaymentsectio();
		log.info("Verified todays payment section of checkout step3 page \n");
		Reporter.log("<p>Verified todays payment section of checkout step3 page");
		System.out.println("step 20 end");
	}

	//verify the Pay full amount radio button
	@Test(priority =21, description = "Step 21: verifying pay full amount radio button")
	public void Step21_VerifyPayFullAmtRadioBtn() throws Exception 
	{   
		System.out.println("step 21 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyTodayspaymentsectio();
		log.info(" Successfully Verified pay full amount radio button \n");
		Reporter.log("<p>Successfully Verified pay full amount radio button");
		System.out.println("step 21 end");
	}

	//verify the make donation title of checkout step3 page
	@Test(priority =22, description = "Step 22:  verifying make donation title of checkout step3 page")
	public void Step22_VerifyMakeDonationTitle() throws Exception 
	{   
		System.out.println("step 22 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyMakeDonationTitle();
		log.info("Successfully Verified make donation title of checkout step3 page\n");
		Reporter.log("<p>Successfully Verified make donation title of checkout step3 page");
		System.out.println("step 22 end");
	}

	//verify the make donation title description
	@Test(priority =23, description = "Step 23:  verifying make donation title description")
	public void Step23_VerifyMakeDonationDescription() throws Exception 
	{   
		System.out.println("step 23 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyMakeDonationTitle();
		log.info("Successfully Verified make donation description section \n");
		Reporter.log("<p>Successfully Verified make donation description section");
		System.out.println("step 23 end");
	}

	//verify the No Thank you radio button
	@Test(priority =24, description = "Step 24: verifying the No Thank you radio button")
	public void Step24_VerifyNoThankYouRadioButton() throws Exception 
	{   
		System.out.println("step 24 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyNoThankYouRadioBtn();
		log.info("Successfully Verified No Thank you radio button \n");
		Reporter.log("<p>Successfully Verified No Thank you radio button");
		System.out.println("step 24 end");
	}

	//verify the $10 radio button
	@Test(priority =25, description = "Step 25: verifying the $10 radio button")
	public void step25_Verify$10RadioButton() throws Exception 
	{   
		System.out.println("step 25 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verify$10RadioBtn();
		log.info("Successfully Verified the $10 radio button \n");
		Reporter.log("<p>Successfully Verified the $10 radio button");
		System.out.println("step 25 end");
	}

	//verify the $25 radio button
	@Test(priority =26, description = "Step 26: verifying the $25 radio button")
	public void step26_Verify$25RadioButton() throws Exception 
	{   
		System.out.println("step 26 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verify$25RadioBtn();
		log.info("Successfully Verified the $25 radio button \n");
		Reporter.log("<p>Successfully Verified the $25 radio button");
		System.out.println("step 26 end");
	}

	//verify the $35 radio button
	@Test(priority =27, description = "Step 27: verifying the $35 radio button")
	public void step27_Verify$25RadioButton() throws Exception 
	{   
		System.out.println("step 27 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verify$35RadioBtn();
		log.info("Successfully Verified the $35 radio button \n");
		Reporter.log("<p>Successfully Verified the $35 radio button");
		System.out.println("step 27 end");
	}

	//verify the custom amount radio button
	@Test(priority =28, description = "Step 28: verifying the custom amount radio button")
	public void step28_VerifyCustomAmountRadioButton() throws Exception 
	{   
		System.out.println("step 28 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyCustomAmountRadioBtn();
		log.info("Successfully Verified the custom amount radio button \n");
		Reporter.log("<p>Successfully Verified the custom amount radio button");
		System.out.println("step 28 end");
	}

	//verify the custom amount text box
	@Test(priority =29, description = "Step 29: verifying the custom amount text box")
	public void step29_VerifyCustomAmountTextBox() throws Exception 
	{   
		System.out.println("step 29 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyCustomAmountTextBox();
		log.info("Successfully Verified the custom amount text box \n");
		Reporter.log("<p>Successfully Verified the custom amount text box");
		System.out.println("step 29 end");
	}

	//verify the price overview section title text
	@Test(priority =30, description = "Step 30: verifying the price overview section title text")
	public void step30_VerifyPriceOverviewTitleText() throws Exception 
	{   
		System.out.println("step 30 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyCustomAmountTextBox();
		log.info("Successfully Verified the price overview section title text \n");
		Reporter.log("<p>Successfully Verified the price overview section title text");
		System.out.println("step 30 end");
	}

	//verify the terms and condition section title of checkout step3 page
	@Test(priority =31, description = "Step 31: verifying the terms and condition section title")
	public void step31_VerifyTermsAndConditionTitle() throws Exception 
	{   
		System.out.println("step 31 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyTermsAndConditionSectionTitle();
		log.info("Successfully Verified the terms and condition section title \n");
		Reporter.log("<p>Successfully Verified the terms and condition section titlel");
		System.out.println("step 31 end");
	}

	//verify the terms and condition description of checkout step3 page
	@Test(priority =32, description = "Step 32: verifying the terms and condition description")
	public void step32_VerifyTermsAndConditionDescription() throws Exception 
	{   
		System.out.println("step 32 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyTermsAndConditionSectionDescription();
		log.info("Successfully Verified the  terms and condition description \n");
		Reporter.log("<p>Successfully Verified the  terms and condition description");
		System.out.println("step 32 end");
	}

	//verify the view terms and condition link of checkout step3 page
	@Test(priority =33, description = "Step 33: verifying the view terms and condition link")
	public void step33_VerifyViewTermsAndConditionLink() throws Exception 
	{   
		System.out.println("step 33 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyViewTermsAndConditionLink();
		log.info("Successfully Verified the view terms and condition link \n");
		Reporter.log("<p>Successfully Verified the view terms and condition link");
		System.out.println("step 33 end");
	}

	//verify the I Accept Radio button of checkout step3 page
	@Test(priority =34, description = "Step 34: verifying the I Accept Radio button under terms and condition section")
	public void step34_VerifyIAcceptRadioButton() throws Exception 
	{   
		System.out.println("step 34 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyIAcceptRadioButton();
		log.info("Successfully Verified the I Accept Radio button under terms and condition section \n");
		Reporter.log("<p>Successfully Verified the I Accept Radio button under terms and condition section");
		System.out.println("step 34 end");
	}

	//verify the payment type section title of checkout step3 page
	@Test(priority =35, description = "Step 35: verifying the payment type section")
	public void step35_VerifyPaymentTypeSectionTitle() throws Exception 
	{   
		System.out.println("step 35 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyPaymentTypeSectionTitle();
		log.info("Successfully Verified the payment type section \n");
		Reporter.log("<p>Successfully Verified the payment type section");
		System.out.println("step 35 end");
	}

	//verify the Pay By Check Radio Button under Payment type section of chekout step3 page
	@Test(priority =36, description = "Step 36: verifying the Pay By Check Radio Button under Payment type section of chekout step3 page")
	public void step36_VerifyPayByCheckRadioButton() throws Exception 
	{   
		System.out.println("step 36 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyPayByCheckRadioButton();
		log.info("Successfully Verified the Pay By Check Radio Button under Payment type section of chekout step3 page \n");
		Reporter.log("<p>Successfully Verified the Pay By Check Radio Button under Payment type section of chekout step3 page");
		System.out.println("step 36 end");
	}

	//verify the Pay By credit card Radio Button under Payment type section of chekout step3 page
	@Test(priority =37, description = "Step 37: verifying the Pay By credit card Radio Button under Payment type section of chekout step3 page")
	public void step37_VerifyPayByCreditCardRadioButton() throws Exception 
	{   
		System.out.println("step 37 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyPayByCheckRadioButton();
		log.info("Successfully Verified the Pay By credit card Radio Button under Payment type section of chekout step3 page \n");
		Reporter.log("<p>Successfully Verified the Pay By credit card Radio Button under Payment type section of chekout step3 page");
		System.out.println("step 37 end");
	}

	//verify the item subtitle under price overview section of chekout step3 page
	@Test(priority =38, description = "Step 38: verifying the item subtitle under price overview section")
	public void step38_VerifyItemSubTitle() throws Exception 
	{   
		System.out.println("step 38 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyItemSubTitle();
		log.info("Successfully Verified the item subtitle under price overview section \n");
		Reporter.log("<p>Successfully Verified the item subtitle under price overview section");
		System.out.println("step 38 end");
	}

	//verify the subtotal section under price overview section of chekout step3 page
	@Test(priority =39, description = "Step 39: verifying the subtotal section under price overview section")
	public void step39_VerifySubTotalSection() throws Exception 
	{   
		System.out.println("step 39 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifySubTotal();
		log.info("Successfully Verified the subtotal section under price overview section \n");
		Reporter.log("<p>Successfully Verified the subtotal section under price overview section");
		System.out.println("step 39 end");
	}

	//verify the order summary  section under price overview section of chekout step3 page
	@Test(priority =40, description = "Step 40: verifying the order summary  section under price overview section")
	public void step40_VerifyOrderSummarySection() throws Exception 
	{   
		System.out.println("step 40 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyOrderSummarySection();
		log.info("Successfully Verified the  order summary  section under price overview section \n");
		Reporter.log("<p>Successfully Verified the  order summary  section under price overview section");
		System.out.println("step 40 end");
	}

	//verify the Talk To Us section under price overview section of chekout step3 page
	@Test(priority =41, description = "Step 41: verifying the talk to us section under price overview section")
	public void step41_VerifyTalkToUsSection() throws Exception 
	{   
		System.out.println("step 41 begin");
		CheckOutStep3 cs3 =new CheckOutStep3(driver);
		cs3.verifyOrderSummarySection();
		log.info("Successfully Verified the Talk To Us section under price overview section \n");
		Reporter.log("<p>Successfully Verified the Talk To Us section under price overview section");
		System.out.println("step 40 end");
	}

}
