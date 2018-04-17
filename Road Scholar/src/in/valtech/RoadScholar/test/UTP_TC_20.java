/*Author:Sukrity

Objectives:Mouse hover on my account->click on upcoming trips->Verify the page->Click on right arrow->
Click on make a payment button->Verify the title of the pop up->Click on any of the payment type->
Verify the error message->Click on cancel button

 */
package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.UpcommingTripsPage;
import in.valtech.config.BaseTest;

public class UTP_TC_20 extends BaseTest{

	@Test(description = "Step 1:  Click on MyAccount Link after login ")
	public void Step01_AfterLogInMyAccountLink() throws Exception {
		System.out.println("step 1 begin");
		HomePage homePage =new HomePage(driver);
		homePage.AfterLogInclickOnMyAccountLink();
		log.info("Successfully Clicked on MyAccount Link after login\n");
		Reporter.log("<p>Successfully Clicked on MyAccount Link after login");
		System.out.println("step 1 end");
	}
	
	@Test(description = "Step 2:  Click on Upcoming Trip Link ")
	public void Step02_ClickOnUpcomingTripLink() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage =new HomePage(driver);
		homePage.ClickOnUpcomingTripLink();
		log.info("Successfully Clicked on Upcoming Trip Link \n");
		Reporter.log("<p>Successfully Clicked on Upcoming Trip Link");
		System.out.println("step 2 end");
	}
	
	@Test(description = "Step 3:  Click on Right Arrow ")
	public void Step03_clickOnRightArrow() throws Exception {
		System.out.println("step 3 begin");
		UpcommingTripsPage up=new UpcommingTripsPage(driver);
		up.ClickOnArrow();
		log.info("Successfully Clicked on Right Arrow \n");
		Reporter.log("<p>Successfully Clicked on Right Arrow ");
		System.out.println("step 3 end");
	}
	@Test(description = "Step 4:  Click on Make A Payment Button ")
	public void Step04_clickOnmakeAPaymentButton() throws Exception {
		System.out.println("step 4 begin");
		UpcommingTripsPage up=new UpcommingTripsPage(driver);
		up.ClickOnMakeAPaymentButton();
		log.info("Successfully Clicked on Make A Payment Button\n");
		Reporter.log("<p>Successfully Clicked on Make A Payment Button ");
		System.out.println("step 4 end");
	}
	
	@Test(description = "Step 5:  Select PayByCreditCard Option")
	public void Step05_SelectPayByCreditCardOption() throws Exception {
		System.out.println("step 5 begin");
		UpcommingTripsPage up=new UpcommingTripsPage(driver);
		up.SelectPayByCreditCardOption();
		log.info("Successfully Selected PayByCreditCard Option\n");
		Reporter.log("<p>Successfully Selected PayByCreditCard Option ");
		System.out.println("step 5 end");
	}
	
	@Test(description = "Step 6:  Verify error message")
	public void Step06_VerifyErrorMessage() throws Exception {
		System.out.println("step 6 begin");
		UpcommingTripsPage up=new UpcommingTripsPage(driver);
		up.VerifyErrorMessage();
		log.info("Successfully Verified error message \n");
		Reporter.log("<p>Successfully Verified error message ");
		System.out.println("step 6 end");
	}

	@Test(description = "Step 7:  Click On Cancel Button")
	public void Step07_ClickOnCancelButton() throws Exception {
		System.out.println("step 7 begin");
		UpcommingTripsPage up=new UpcommingTripsPage(driver);
		up.ClickOnCancelButton();
		log.info("Successfully Clicked on Cancel Button\n");
		Reporter.log("<p>Successfully Clicked on Cancel Button ");
		System.out.println("step 7 end");
	}
}
