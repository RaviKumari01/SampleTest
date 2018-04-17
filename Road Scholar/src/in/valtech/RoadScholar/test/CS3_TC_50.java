/*Author: sravani
 * objective:Navigate to payment page (checkout step-3)->Select all the mandatory fields->
 * Click on pay by credit card payment type radio btn->
 * Verify All the fields displayed->Click on complete button->Verify the error message->
 * Enter all the details ->Click on complete button
 */
package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.CheckOutStep2;
import in.valtech.RoadScholar.pages.CheckOutStep3;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class CS3_TC_50 extends BaseTest {

	//enter Text Into Search TextBox field 
	@Test(priority =7,description = "step 7: enter Text Into Search TextBox field ")
	public void step07_enterTextIntoSearchTextBox() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePage hop =new HomePage(driver);
		Thread.sleep(10000);
		hop.enterTextIntoSearchTextBox();
		log.info("Successfully entered Text Into Search TextBox field \n");
		Reporter.log("<p>Successfully entered Text Into Search TextBox field");
		System.out.println("step 7 end");

	}

	//click On Search Button
	@Test(priority =8,description = "step 8: click On Search Button ")
	public void step08_clickOnSearchButton() throws Exception 
	{
		System.out.println("step 8 begin");
		HomePage hop =new HomePage(driver);
		hop.clickOnSearchButton();
		Thread.sleep(1000);
		log.info("Successfully clicked On Search Button \n");
		Reporter.log("<p>Successfully clicked On Search Button");
		System.out.println("step 8 end");

	}

	//Click on dates and prices tab.
	@Test(priority =9,description = "step 9: Click on dates and prices tab")
	public void step09_clickOnDateAndPriceTab() throws Exception 
	{
		System.out.println("step 9 begin");
		GUIFunctions.normalWait();
		TripDetailPage TRP=new TripDetailPage(driver);
		TRP.clickOnDateAndpriceTab();
		log.info("Successfully clicked on dates and prices tab \n");
		Reporter.log("<p>Successfully clicked on dates and prices tab");
		System.out.println("step 9 end");

	}

	//Click on select date button
	@Test(priority =10,description = "step 10:  Click on select date button")
	public void step10_clickOnSelectDateButton() throws Exception 
	{
		System.out.println("step 10 begin");
		TripDatesAndPrices TDP=new TripDatesAndPrices(driver);
		TDP.clickOnSelectDateBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Select Date Button \n");
		Reporter.log("<p>Successfully clicked on Select Date Button");
		System.out.println("step 10 end");
	}

	//Click on one person Lodging button
	@Test(priority =11,description = "step 11: Click on one Person Lodging button")
	public void step11_clickOnePeopleLodgingButton() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.clickOnOnePerson();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on single People Lodging button \n ");
		Reporter.log("<p>Successfully clicked single People Lodging button");
		System.out.println("step 11 end");
	}

	//Click on single Radio Button
	@Test(priority =12,description = "step 12: Click on single Radio Button")
	public void step12_clickonSingleRadioButton() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.selectRadioBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on single Radio Button \n");
		Reporter.log("<p>Successfully clicked on single Radio Button");
		System.out.println("step 12 end");
	}

	//Click on NoAirfare Radio Button
	@Test(priority =13,description = "step 13: Click on NoAirfare  Radio Button")
	public void step13_clickOnNoAirfareRadioButton() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.selectNoAirfareRadioBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on NoAirfare  Radio Button \n");
		Reporter.log("<p>Successfully clicked on NoAirfare  Radio Button");
		System.out.println("step 13 end");
	}


	//Click on continue button
	@Test(priority =1,description = "step 1:Click on continue button")
	public void step1_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 1 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.ClickContinue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 1 end");
	}

	//Click on continue button
	@Test(priority =2,description = "step 2:Click on continue button")
	public void step2_clickOnContinue() throws Exception 
	{
		System.out.println("step 2 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 2 end");
		GUIFunctions.normalWait();

	}

	//Click on Terms and Conditions link
	@Test(priority =3,description = "step 3:Click on Terms and Conditions Link")
	public void step16_clickOnTermsAndConditionsLink() throws Exception 
	{
		System.out.println("step 3 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.TermsAndCondition();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Terms and Conditions Link \n");
		Reporter.log("<p>Successfully clicked on Terms and Conditions Link");
		System.out.println("step 3 end");
	}

	//Click on okay Button
	@Test(priority =4,description = "step 4:Click on okay Button")
	public void step17_clickOnOkayButton() throws Exception 
	{
		System.out.println("step 4 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Okay();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on okay Button \n");
		Reporter.log("<p>Successfully clicked on okay Button");
		System.out.println("step 4 end");	
	}

	//Click on I Accept CheckBox
	@Test(priority =5,description = "step 5:Click on I Accept CheckBox")
	public void step18_clickOnIAcceptCheckBox() throws Exception 
	{
		System.out.println("step 5 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Accept();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on I Accept CheckBox \n");
		Reporter.log("<p>Successfully clicked on I Accept CheckBox");
		System.out.println("step 5 end");
	}

	//Click on credit card Radio Button
	@Test(priority =6,description = "step 6:Click on creditcard Radio Button")
	public void step6_clickOnCreditcardRadioButton() throws Exception 
	{
		System.out.println("step 6 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.CreditCard();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on creditcard Radio Button \n");
		Reporter.log("<p>Successfully clicked on creditcard Radio Button");
		System.out.println("step 6 end");

	}

	//Verify the FirstName field in Creditcard Section
	@Test(priority =7,description = "step 7:Verify the FirstName field in Creditcard Section")
	public void step7_VerifyTheFirstNameFieldInCreditcardSection() throws Exception 
	{
		System.out.println("step 7 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.VerifyFirstName();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the FirstName field in Creditcard Section \n");
		Reporter.log("<p>Successfully Verified the FirstName field in Creditcard Section");
		System.out.println("step 7 end");

	}

	//Verify the CredicardNumber field in Creditcard Section
	@Test(priority =8,description = "step 8:Verify the Credicard Number field in Creditcard Section")
	public void step8_VerifyTheCredicardNumberFieldInCreditcardSection() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.VerifyCreditCardNumber();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the CredicardNumber field in Creditcard Section \n");
		Reporter.log("<p>Successfully Verified the CredicardNumber field in Creditcard Section");
		System.out.println("step 8 end");

	}

	//Verify the CVCNumber field in Creditcard Section
	@Test(priority =9,description = "step 9:Verify the CVC Number field in Creditcard Section")
	public void step9_VerifyTheCVCNumberFieldInCreditcardSection() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.VerifyCreditCVCNumber();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the CVCNumber field in Creditcard Section \n");
		Reporter.log("<p>Successfully Verified the CVCNumber field in Creditcard Section");
		System.out.println("step 9 end");

	}

	//Verify the CardType field in Creditcard Section
	@Test(priority =10,description = "step 10:Verify the CardType field in Creditcard Section")
	public void step10_VerifyTheCardTypeFieldInCreditcardSection() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.VerifyCreditCardType();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the CardType field in Creditcard Section \n");
		Reporter.log("<p>Successfully Verified the CardType field in Creditcard Section");
		System.out.println("step 10 end");

	}

	//Verify the ExpirationMonth field in Creditcard Section
	@Test(priority =11,description = "step 11:Verify the ExpirationMonth field in Creditcard Section")
	public void step11_VerifyTheExpirationMonthFieldInCreditcardSection() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.VerifyCreditExpiryMonth();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the ExpirationMonth field in Creditcard Section \n");
		Reporter.log("<p>Successfully Verified the ExpirationMonth field in Creditcard Section");
		System.out.println("step 11 end");

	}

	//Verify the ExpirationYear field in Creditcard Section
	@Test(priority =12,description = "step 12:Verify the ExpirationMonth field in Creditcard Section")
	public void step12_VerifyTheExpirationYearFieldInCreditcardSection() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.CS3_CreditExpiryYear();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the ExpirationYear field in Creditcard Section \n");
		Reporter.log("<p>Successfully Verified the ExpirationYear field in Creditcard Section");
		System.out.println("step 12 end");

	}


	//Click on Continue Button
	@Test(priority =13,description = "step 13:Click on Continue Button")
	public void step13_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Continue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Continue Button \n");
		Reporter.log("<p>Successfully clicked on Continue Button");
		System.out.println("step 13 end");	
	}

	//Click on Verify Error Message
	@Test(priority =14,description = "step 14:Verify Error Message")
	public void step14_VerifyErrorMessage() throws Exception 
	{
		System.out.println("step 14 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.verifyError();
		GUIFunctions.normalWait();
		log.info("Successfully Verified the  Error Message \n");
		Reporter.log("<p>Successfully Verified the  Error Message");
		System.out.println("step 14 end");	
	}

	//Enter Values in credit card fields.
	@Test(priority =15,description = "step 15:Enter Values in credit card fields")
	public void step15_enterValuesInCreditCardFields() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.enterPayByCreditCardDetails();
		GUIFunctions.normalWait();
		log.info("Successfully Entered Values in credit card fields \n");
		Reporter.log("<p>Successfully Entered Values in credit card fields");
		System.out.println("step 15 end");	
	}	
}



