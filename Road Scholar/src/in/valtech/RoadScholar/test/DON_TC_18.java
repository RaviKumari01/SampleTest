/*@ Kavya
 * Objective:Without entering any fields click on any of the payment type radio
 *  btn ->Verify the error message->Select any gift amount->Select any value from "Please direct my donation to" 
 *  ->Select any radio btn under "Make this gift in" section->Enter personal details->Click on payment type
 *  ->verify the thank you message->Close the pop up
 */
 package in.valtech.RoadScholar.test;
 import org.testng.Reporter;
 import org.testng.annotations.Test;
 import in.valtech.RoadScholar.pages.DonatePage;
 import in.valtech.RoadScholar.pages.HomePage;
 import in.valtech.RoadScholar.pages.Login;
 import in.valtech.RoadScholar.pages.ThankYouPageForDonation;
 import in.valtech.config.BaseTest;
 
public class DON_TC_18 extends BaseTest {
	static Login login;

	@Test(priority = 1, description = "Step 1: Click on Donates Btn")
	public void step01_ClickOnDonateLink() throws InterruptedException {
		System.out.println("step 1 begin");
		HomePage homePage = new HomePage(driver);
		homePage.clickOnDonateLink();
		log.info("Successfully clicked on Donate button \n");
		Reporter.log("<p>Successfully clicked on Donate link");
		System.out.println("step 1 end");
		}
	
	@Test(priority = 2, description = "Step 2:Without enterring any  details click on Payment mtype radio button")
	public void step02_ClickOnPaymentRadioButton() throws InterruptedException {
		System.out.println("step 2 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.clickOnPaymentRadioButton();
		log.info("Successfully clicked on Payment radio button\n");
		Reporter.log("<p>Successfully clicked on Payment radio button");
		System.out.println("Error message is displayed");
		System.out.println("step 2 end");
		}
		
	@Test(priority = 3, description = "Step 3:Without enterring any  details click on Payment mtype radio button")
	public void step03_verifyErrorMesaage() throws InterruptedException {
		System.out.println("step 3 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyErrorMesaageForDirectClickOnPaymentRadioButton();
		log.info("Successfully error message is displayed\n");
		Reporter.log("<p>Successfully error message is displayed");
		System.out.println("step 3 end");
		}

	@Test(priority = 4, description = "Step 4:Select any gift amount")
	public void step4_SelectGiftAmount() throws InterruptedException {
		System.out.println("step 4 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.selectGiftAmount();
		log.info("Successfully selected the gift amount \n");
		Reporter.log("<p>Successfully selected the gift amount ");
		System.out.println("step 4 end");
		}
	
	@Test(priority = 5, description = "Step 5:Select any value from Please direct my donation to: drop down ")
	public void step5_SelectValueFromPleaseDirectMyDonationDropDown() throws InterruptedException {
		System.out.println("step 5 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.selectValueFromPleaseDirectMyDonationDropDown();
		log.info("Successfully selected value from Please direct my donation to: drop down \n");
		Reporter.log("<p>Successfully selected value from Please direct my donation to: drop down  ");
		System.out.println("step 5 end");
		}
		
	@Test(priority = 6, description = "Step 6:Select any radio button under Make this gift in section")
	public void step6_SelectRadioButtonForMakeThisGiftIn() throws InterruptedException {
		System.out.println("step 6 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.selectAnyMakeThisGiftRadioButton();
		log.info("Successfully selected radio button under Make this gift in section \n");
		Reporter.log("<p>Successfully selected radio button under Make this gift in section  ");
		System.out.println("step 6 end");
		}
		
	@Test(priority = 7, description = "Step 7:Enter details under selected radio button of Make this gift in section ")
	public void step7_EnterDetailsUnderSelectedRadioButtonOfMakeThisGiftIn() throws InterruptedException {
		System.out.println("step 7 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.enterDetailsUnderSelectedRadioButtonOfMakeThisGiftIn();
		log.info("Successfully entered details under selectedradio button of Make this gift in section\n");
		Reporter.log("<p>Successfully entered details under selectedradio button of Make this gift in section ");
		System.out.println("step 7 end");
		}
		
	@Test(priority = 8, description = "Step 8:Enter Personal details ")
	public void step8_EnterPersonalDetails() throws InterruptedException {
		System.out.println("step 8 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.enterPersonalDetails();
		log.info("Successfully entered Personal details\n");
		Reporter.log("<p>Successfully entered Personal details");
		System.out.println("step 8 end");
		}
	
	@Test(priority = 9, description = "Step 9:Click on Payment type radio button ")
	public void step9_ClickOnPaymentRadioButton() throws InterruptedException {
		System.out.println("step 9 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.clickOnPaymentRadioButton();
		Thread.sleep(4000);
		log.info("Successfully clicked on Payment radio button\n");
		Reporter.log("<p>Successfully clicked on Payment radio button");
		System.out.println("step 9 end");
		}
	
	@Test(priority = 10, description = "Step 10:Enter Payment details ")
	public void step10_EnterPaymentDetails() throws InterruptedException {
		System.out.println("step 10 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.enterPayByCreditCardDetails();
		log.info("Successfully entered the payment details\n");
		Reporter.log("<p>Successfully entered the payment details");
		System.out.println("step 10 end");
		}
	
	@Test(priority = 11, description = "Step 11:Verify Thank you Message ")
	public void step11_VerifyThankYouMessage() throws InterruptedException {
	    System.out.println("step 11 begin");
		ThankYouPageForDonation thankYou= new ThankYouPageForDonation(driver);
		thankYou.verifyThankYouMessage();
		log.info("Successfully Thank you Message \n");
		Reporter.log("<p>Successfully Thank you Message");
		System.out.println("step 11 end");
		}

}
