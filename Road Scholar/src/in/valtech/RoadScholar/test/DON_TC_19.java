/*@ Kavya
 * Objective:Select gift amount->Select any value from my donation drop down->
 * Select any radio btn under "gift in" section->enter value for FN,LN under "in memory of" section
 * ->Select send a mail notification radio btn->Perform field validation  
 */
package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.DonatePage;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.config.BaseTest;

public class DON_TC_19 extends BaseTest {
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
	public void step5_SelectValueFromPleaseDirectMyDonationDropDown()throws InterruptedException {
		System.out.println("step 5 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.selectValueFromPleaseDirectMyDonationDropDown();
		log.info("Successfully selected value from Please direct my donation to: drop down \n");
		Reporter.log("<p>Successfully selected value from Please direct my donation to: drop down  ");
		System.out.println("step 5 end");
	}

	@Test(priority = 6, description = "Step 6:Select any radio button under Make this gift in section")
	public void step6_SelectRadioButtonForMakeThisGiftIn()throws InterruptedException {
		System.out.println("step 6 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.selectAnyMakeThisGiftRadioButton();
		log.info("Successfully selected radio button under Make this gift in section \n");
		Reporter.log("<p>Successfully selected radio button under Make this gift in section  ");
		System.out.println("step 6 end");
	}

	@Test(priority = 7, description = "Step 7:Enter details under selected radio button of Make this gift in section ")
	public void step7_EnterDetailsUnderSelectedRadioButtonOfMakeThisGiftIn()throws InterruptedException {
		System.out.println("step 7 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.enterDetailsUnderSelectedRadioButtonOfMakeThisGiftIn();
		log.info("Successfully entered details under selectedradio button of Make this gift in section\n");
		Reporter.log("<p>Successfully entered details under selectedradio button of Make this gift in section ");
		System.out.println("step 7 end");
	}

	@Test(priority = 8, description = "Step 8:Select Send my mail notification radio button ")
	public void step8_SelectSendMyMailNotificationRadioButton()throws InterruptedException {
		System.out.println("step 8 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.selectSendMyMailNotificationRadioButton();
		log.info("Successfully selected Send my mail notification radio button\n");
		Reporter.log("<p>Successfully selected Send my mail notification radio button ");
		System.out.println("step 8 end");
	}

	@Test(priority = 9, description = "Step 9:Perform First Name field validation ")
	public void step10_FirstNameFieldValidation() throws InterruptedException {
		System.out.println("step 9 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.firstNameFieldValidation();
		log.info("Successfully validated First Name field\n");
		Reporter.log("<p>Successfully validated First Name field ");
		System.out.println("step 9 end");
	}

	@Test(priority = 10, description = "Step 10:Perform Last Name field validation ")
	public void step10_LastNameFieldValidation() throws InterruptedException {
		System.out.println("step 10 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.lastNameFieldValidation();
		log.info("Successfully validated Last Name field\n");
		Reporter.log("<p>Successfully validated Last Name field ");
		System.out.println("step 10 end");
	}
	@Test(priority = 11, description = "Step 11:Perform Address field validation ")
	public void step11_AddressFieldValidation() throws InterruptedException {
		System.out.println("step 11 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.addressFieldValidation();
		log.info("Successfully validated Address field\n");
		Reporter.log("<p>Successfully validated Address field ");
		System.out.println("step 11 end");
	}

	@Test(priority = 12, description = "Step 12:Perform City field validation ")
	public void step12_CityFieldValidation() throws InterruptedException {
		System.out.println("step 12 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.cityFieldValidation();
		log.info("Successfully validated City field\n");
		Reporter.log("<p>Successfully validated City field ");
		System.out.println("step 12 end");
	}

}
