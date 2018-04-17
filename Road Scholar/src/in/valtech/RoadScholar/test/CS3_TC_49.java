/*Author: sravani
 * objective:Navigate to payment page (checkout step-3)->select pay full amout radio btn from todays payment->
 * Click on terms and condition link->Verify the title of the pop up
 * ->Scroll down the page & Click on ok button->Select I accept radio btn->Click on any of the payment type
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

public class CS3_TC_49 extends BaseTest {


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
	@Test(priority =7,description = "step 7: Click on continue button")
	public void step7_clickOnContinueButton() throws Exception 
	{
		System.out.println("step 7 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.ClickContinue();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 7 end");
	}
	
	//Click on continue button
	@Test(priority =8,description = "step 8:Click on continue button")
	public void step8_clickOnContinue() throws Exception 
	{
		System.out.println("step 8 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 8 end");
		GUIFunctions.normalWait();

	}

	//Click on Terms and Conditions link
	@Test(priority =9,description = "step 9:Click on Terms and Conditions Link")
	public void step9_clickOnTermsAndConditionsLink() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.TermsAndCondition();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Terms and Conditions Link \n");
		Reporter.log("<p>Successfully clicked on Terms and Conditions Link");
		System.out.println("step 9 end");
	}

	//Click on okay Button
	@Test(priority =10,description = "step 10:Click on okay Button")
	public void step10_clickOnOkayButton() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Okay();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on okay Button \n");
		Reporter.log("<p>Successfully clicked on okay Button");
		System.out.println("step 10 end");	
	}

	//Click on I Accept CheckBox
	@Test(priority =11,description = "step 11:Click on I Accept CheckBox")
	public void step11_clickOnIAcceptCheckBox() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Accept();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on I Accept CheckBox \n");
		Reporter.log("<p>Successfully clicked on I Accept CheckBox");
		System.out.println("step 11 end");
	}

	//Click on credit card Radio Button
	@Test(priority =12,description = "step 12:Click on creditcard Radio Button")
	public void step9_clickOnCreditcardRadioButton() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.CreditCard();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on creditcard Radio Button \n");
		Reporter.log("<p>Successfully clicked on creditcard Radio Button");
		System.out.println("step 12 end");

	}

}
