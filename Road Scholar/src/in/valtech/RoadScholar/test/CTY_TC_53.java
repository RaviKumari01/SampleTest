/**Author:Sravani
 * Objective:Navigate to order confirmation page->Click on View cancelation policy link
 * ->Close the pop up->Click on Learn more link ->Verify the page
 **/
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

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CTY_TC_53 extends BaseTest
{
	
	//enter Text Into Search TextBox field 
	@Test(priority =1,description = "step 1: enter Text Into Search TextBox field ")
	public void step01_enterTextIntoSearchTextBox() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage hop =new HomePage(driver);
		Thread.sleep(10000);
		hop.enterTextIntoSearchTextBox();
		log.info("Successfully entered Text Into Search TextBox field \n");
		Reporter.log("<p>Successfully entered Text Into Search TextBox field");
		System.out.println("step 1 end");

	}

	//click On Search Button
	@Test(priority =2,description = "step 2: click On Search Button ")
	public void step02_clickOnSearchButton() throws Exception 
	{
		System.out.println("step 2 begin");
		HomePage hop =new HomePage(driver);
		hop.clickOnSearchButton();
		Thread.sleep(1000);
		log.info("Successfully clicked On Search Button \n");
		Reporter.log("<p>Successfully clicked On Search Button");
		System.out.println("step 2 end");

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

	//Click on NoAirfare Radio Button
	@Test(priority =7,description = "step 7: Click on NoAirfare  Radio Button")
	public void step07_clickOnNoAirfareRadioButton() throws Exception 
	{
		System.out.println("step 7 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		cs1.selectNoAirfareRadioBtn();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on NoAirfare  Radio Button \n");
		Reporter.log("<p>Successfully clicked on NoAirfare  Radio Button");
		System.out.println("step 7 end");
	}


	//Click on continue button
	@Test(priority =8,description = "step 8:Click on continue button")
	public void step08_clickOnContinueButton() throws Exception 
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
	public void step09_clickOnContinue() throws Exception 
	{
		System.out.println("step 9 begin");
		CheckOutStep2 cs2=new CheckOutStep2(driver);
		cs2.Continue();
		log.info("Successfully clicked on continue Button \n");
		Reporter.log("<p>Successfully clicked on continue Button");
		System.out.println("step 9 end");
		GUIFunctions.normalWait();

	}

	//Click on Terms and Conditions link
	@Test(priority =10,description = "step 10:Click on Terms and Conditions Link")
	public void step10_clickOnTermsAndConditionsLink() throws Exception 
	{
		System.out.println("step 10 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.TermsAndCondition();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on Terms and Conditions Link \n");
		Reporter.log("<p>Successfully clicked on Terms and Conditions Link");
		System.out.println("step 10 end");
	}

	//Click on okay Button
	@Test(priority =11,description = "step 11:Click on okay Button")
	public void step11_clickOnOkayButton() throws Exception 
	{
		System.out.println("step 11 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Okay();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on okay Button \n");
		Reporter.log("<p>Successfully clicked on okay Button");
		System.out.println("step 11 end");	
	}

	//Click on I Accept CheckBox
	@Test(priority =12,description = "step 12:Click on I Accept CheckBox")
	public void step12_clickOnIAcceptCheckBox() throws Exception 
	{
		System.out.println("step 12 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.Accept();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on I Accept CheckBox \n");
		Reporter.log("<p>Successfully clicked on I Accept CheckBox");
		System.out.println("step 12 end");
	}

	//Click on credit card Radio Button
	@Test(priority =13,description = "step 13:Click on creditcard Radio Button")
	public void step13_clickOnCreditcardRadioButton() throws Exception 
	{
		System.out.println("step 13 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.CreditCard();
		GUIFunctions.normalWait();
		log.info("Successfully clicked on creditcard Radio Button \n");
		Reporter.log("<p>Successfully clicked on creditcard Radio Button");
		System.out.println("step 13 end");

	}


	//Enter Values in credit card fields and click on Continue Button.
	@Test(priority =14,description = "step 14:Enter Values in credit card fields and click on Continue Button")
	public void step14_enterValuesInCreditCardFieldsAndClickOnContinue() throws Exception 
	{
		System.out.println("step 14 begin");
		CheckOutStep3 cs3=new CheckOutStep3(driver);
		cs3.enterPayByCreditCardDetails();
		GUIFunctions.normalWait();
		log.info("Successfully Entered Values in credit card fields and clicked on Continue Button \n");
		Reporter.log("<p>Successfully Entered Values in credit card fields and clicked on Continue Button");
		System.out.println("step 14 end");	
	}

	//click On Cancellation Policy Link.
	@Test(priority =15,description = "step 15:click On Cancellation Policy Link")
	public void step15_clickOnCancellationPolicyLink() throws Exception 
	{
		System.out.println("step 15 begin");
		CheckOutThankYou cty=new CheckOutThankYou(driver);
		cty.CancellationPolicy();
		GUIFunctions.normalWait();
		log.info("Successfully clicked On Cancellation Policy Link \n");
		Reporter.log("<p>Successfully clicked On Cancellation Policy Link");
		System.out.println("step 15 end");	
	}

	//click On Learn More Link.
	@Test(priority =16,description = "step 16:click On Learn More Link")
	public void step16_clickOnLearnMoreLink() throws Exception 
	{
		System.out.println("step 16 begin");
		CheckOutThankYou cty=new CheckOutThankYou(driver);
		cty.LearnMore();
		GUIFunctions.normalWait();
		GUIFunctions.navigateBack(driver);
		log.info("Successfully clicked On Learn More Link \n");
		Reporter.log("<p>Successfully clicked On Learn More Link");
		System.out.println("step 16 end");	
	}

}
