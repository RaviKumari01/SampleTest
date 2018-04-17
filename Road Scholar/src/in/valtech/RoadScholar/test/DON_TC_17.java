/*@ Kavya
 * Objective:To verify all the components of the page
 * 
 */
package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.DonatePage;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.config.BaseTest;

public class DON_TC_17 extends BaseTest {
	static HomePage homePage;
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

	@Test(priority = 2, description = "Step 2: Verification of SubText")
	public void step02_verifySubText() throws Exception {
		System.out.println("step 2 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifySubText();
		log.info("Successfully  verified subtext\n");
		Reporter.log("<p>Successfully verified subtext");
		System.out.println("step 2 end");
	}

	@Test(priority = 3, description = "Step 3: Verification of Gift Block")
	public void step03_verifygiftBlock() throws Exception {
		System.out.println("step 3 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyGiftBlock();
		log.info("Successfully  verified Gift Block \n");
		Reporter.log("<p>Successfully verified Gift Block");
		System.out.println("step 3 end");
	}

	@Test(priority = 4, description = "Step 4: Verification of Please direct my donation to: drop down and label")
	public void step4_verifyPleaseDirectMyDonationDropDown() throws Exception {
		System.out.println("step 4 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyPleaseDirectMyDonationDropDown();
		log.info("Successfully  verified Please direct my donation to: drop down and label\n");
		Reporter.log("<p>Successfully verified Please direct my donation to:drop down and label");
		System.out.println("step 4 end");
	}

	@Test(priority = 5, description = "Step 5: Verification of Make This Gift  drop downs ")
	public void step5_MakeThisGiftDropDowns() throws Exception {
		System.out.println("step 5 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyMakeThisGiftDropDowns();
		log.info("Successfully  verified PMake This Gift  drop downs \n");
		Reporter.log("<p>Successfully verified Make This Gift  drop downs ");
		System.out.println("step 5 end");
	}

	@Test(priority = 6, description = "Step 6: Verification of Personal Details section ")
	public void step6_verifyPersonalDetailssection() throws Exception {
		System.out.println("step 6 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyPersonalDetailssection();
		log.info("Successfully  verified Personal Details section\n");
		Reporter.log("<p>Successfully verified Personal Details section");
		System.out.println("step 6 end");
	}

	@Test(priority = 7, description = "Step 7: Verification of Receive receipt options ")
	public void step7_verifyIwouldLikeToReceiveReceiptOptions()throws Exception {
		System.out.println("step 7 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyIwouldLikeToReceiveReceiptOptions();
		log.info("Successfully  verified Receive receipt options section\n");
		Reporter.log("<p>Successfully verified Receive receipt options section");
		System.out.println("step 7 end");
	}

	@Test(priority = 8, description = "Step 8: Verification of Payment module ")
	public void step8_verifyPaymentModule() throws Exception {
		System.out.println("step 8 begin");
		DonatePage donatePage = new DonatePage(driver);
		donatePage.verifyPaymentModule();
		log.info("Successfully  verified Payment module\n");
		Reporter.log("<p>Successfully verified Payment module");
		System.out.println("step 8 end");
	}
	
}
