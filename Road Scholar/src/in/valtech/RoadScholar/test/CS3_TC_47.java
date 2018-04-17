/*Author: sravani
 * objective:Navigate to payment page (checkout step-3)->Verify the payment navigation tab ->
 * Click on step-2 navigation tab->Click on continue button->
 * W/o selecting anything click on any of the payment type->Verify the error message

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

public class CS3_TC_47 extends BaseTest {


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

	//Click on dates and prices tab.
	@Test(priority =3,description = "step 3: Click on dates and prices tab")
	public void step03_clickOnDateAndPriceTab() throws Exception 
	{
		System.out.println("step 3 begin");
		GUIFunctions.normalWait();
		TripDetailPage TRP=new TripDetailPage(driver);
		TRP.clickOnDateAndpriceTab();
		log.info("Successfully clicked on dates and prices tab \n");
		Reporter.log("<p>Successfully clicked on dates and prices tab");
		System.out.println("step 3 end");
	}

	//Click on select date button
	@Test(priority =4,description = "step 4:  Click on select date button")
	public void step04_clickOnSelectDateButton() throws Exception 
	{
		System.out.println("step 4 begin");
		TripDatesAndPrices TDP=new TripDatesAndPrices(driver);
		TDP.clickOnSelectDateBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Select Date Button \n");
		Reporter.log("<p>Successfully clicked on Select Date Button");
		System.out.println("step 4 end");
	}

	//Click on one person Lodging button
	@Test(priority =5,description = "step 5: Click on one Person Lodging button")
	public void step5_clickOnePeopleLodgingButton() throws Exception 
	{
		System.out.println("step 5 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.clickOnOnePerson();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on single People Lodging button \n ");
		Reporter.log("<p>Successfully clicked single People Lodging button");
		System.out.println("step 5 end");
	}

	//Click on single Radio Button
	@Test(priority =6,description = "step 6: Click on single Radio Button")
	public void step6_clickonSingleRadioButton() throws Exception 
	{
		System.out.println("step 6 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.selectRadioBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on single Radio Button \n");
		Reporter.log("<p>Successfully clicked on single Radio Button");
		System.out.println("step 6 end");
	}

	//Click on continue button
	@Test(priority =8,description = "step 8:Click on continue button")
	public void step8_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.ClickContinue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 8 end");
	}

	//Click on continue button
	@Test(priority =9,description = "step 9:Click on continue button")
	public void step9_clickOnContinue() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 9 end");
		GUIFunctions.normalWait();
	}

	//Verify Payment Tab
	@Test(priority =10,description = "step 10:Verify Payment Tab ")
	public void step10_verifyPaymentTab() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Step3();
		log.info("Successfully verified Payment Tab \n");
		Reporter.log("<p>Successfully Payment Tab");
		System.out.println("step 10 end");
		GUIFunctions.normalWait();
	}

	//click on step2 Button
	@Test(priority =11,description = "step 11:click on step2 Button")
	public void step11_clickOnstep2Button() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Step2();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on step2 Button \n");
		Reporter.log("<p>Successfully clicked on step2 Button");
		System.out.println("step 11 end");
	}

	//Click on continue button
	@Test(priority =12,description = "step 12:Click on continue button")
	public void step12_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue");
		System.out.println("step 12 end");
	}

	//Click on Terms and Conditions Link
	@Test(priority =13,description = "step 13:Click on Terms and Conditions Link")
	public void step13_clickOnTermsAndConditionsLink() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.TermsAndCondition();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Terms and Conditions Link \n");
		Reporter.log("<p>Successfully clicked on Terms and Conditions Link");
		System.out.println("step 13 end");

	}

	//Click on okay Button
	@Test(priority =14,description = "step 14:Click on okay Button")
	public void step14_clickOnOkayButton() throws Exception 
	{
		System.out.println("step 14 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Okay();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on okay Button \n");
		Reporter.log("<p>Successfully clicked on okay Button");
		System.out.println("step 14 end");	
	}

	//Click on I Accept CheckBox
	@Test(priority =15,description = "step 15:Click on I Accept CheckBox")
	public void step15_clickOnIAcceptCheckBox() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Accept();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on I Accept CheckBox \n");
		Reporter.log("<p>Successfully clicked on I Accept CheckBox");
		System.out.println("step 15 end");
	}

	//Click on credit card Radio Button
	@Test(priority =16,description = "step 16:Click on creditcard Radio Button")
	public void step16_clickOnCreditcardRadioButton() throws Exception 
	{
		System.out.println("step 16 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.CreditCard();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on creditcard Radio Button \n");
		Reporter.log("<p>Successfully clicked on creditcard Radio Button");
		System.out.println("step 16 end");
	}

	//Click on continue Button
	@Test(priority =17,description = "step 17:Click on continue Button")
	public void step17_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 17 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Continue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 17 end");
	}

	//Verify Error Message
	@Test(priority =18,description = "step 18:Verify Error Message")
	public void step18_verifyErrorMessage() throws Exception 
	{
		System.out.println("step 18 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.verifyError();
		GUIFunctions.normalWait();
		log.info("Successfully Verified Error Message\n");
		Reporter.log("<p>Successfully Verified Error Message");
		System.out.println("step 18 end");	
	}



}
