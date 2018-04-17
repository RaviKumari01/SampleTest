/*Author:Sukrity

Objectives:Mouse hover on my account->click on upcoming trips->Verify the payment displayed->Click on payment 
btn ->Click on make a payment of radio btn->Enter value into payment field->Click on any of the radio btn->Verify
 the amount displayed under Amount field->Enter card details->Click on complete btn->verify teh thank you message

 */

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.ThankYouPageForUpcomingTrip;
import in.valtech.RoadScholar.pages.UpcommingTripsPage;
import in.valtech.config.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UTP_TC_21 extends BaseTest {

	@Test(description = "Step 1:  Click on MyAccount Link after login ")
	public void Step01_AfterLogInMyAccountLink() throws Exception {
		System.out.println("step 1 begin");
		HomePage hop = new HomePage(driver);
		hop.AfterLogInclickOnMyAccountLink();
		log.info("Successfully Clicked on MyAccount Link after login \n");
		Reporter.log("<p>Successfully Clicked on MyAccount Link after login");
		System.out.println("step 1 end");
	}

	@Test(description = "Step 2:  Click on Upcoming Trip Link ")
	public void Step02_ClickOnUpcomingTripLink() throws Exception {
		System.out.println("step 2 begin");
		HomePage hop = new HomePage(driver);
		hop.ClickOnUpcomingTripLink();
		log.info("Successfully Clicked on Upcoming Trip Link \n");
		Reporter.log("<p>Successfully Clicked on Upcoming Trip Link");
		System.out.println("step 2 end");
	}

	@Test(description = "Step 3:  Click on Farward Arrow ")
	public void Step03_ClickOnArrow() throws Exception {
		System.out.println("step 3 begin");
		UpcommingTripsPage utp = new UpcommingTripsPage(driver);
		utp.ClickOnArrow();
		log.info("Successfully Clicked on Farward Arrow \n");
		Reporter.log("<p>Successfully Clicked on Farward Arrow");
		System.out.println("step 3 end");
	}

	@Test(description = "Step 4:  Click on Make A Payment Button ")
	public void Step04_ClickOnMakeAPaymentButton() throws Exception {
		System.out.println("step 4 begin");
		UpcommingTripsPage utp = new UpcommingTripsPage(driver);
		utp.ClickOnMakeAPaymentButton();
		log.info("Successfully Clicked on Make A Payment Button  \n");
		Reporter.log("<p>Successfully Clicked on Make A Payment Button ");
		System.out.println("step 4 end");
	}

	@Test(description = "Step 5:  Select Make Payment Option")
	public void Step05_SelectMakePaymentOption() throws Exception {
		System.out.println("step 5 begin");
		UpcommingTripsPage utp = new UpcommingTripsPage(driver);
		utp.SelectMakePaymentOption();
		log.info("Successfully Make Payment Option Is Selected \n");
		Reporter.log("<p>Successfully Make Payment Option Is Selected ");
		System.out.println("step 5 end");
	}

	@Test(description = "Step 6:  Enter amount in Make Payment TextBox")
	public void Step06_EnterValueIntoMakePaymentTextBox() throws Exception {
		System.out.println("step 6 begin");
		UpcommingTripsPage utp = new UpcommingTripsPage(driver);
		utp.EnterValueIntoMakePaymentTextBox();
		log.info("Successfully Entered amount in Make Payment TextBox \n");
		Reporter.log("<p>Successfully Entered amount in Make Payment TextBox");
		System.out.println("step 6 end");
	}

	@Test(description = "Step 7:  Select PayByCreditCard Option")
	public void Step07_SelectPayByCreditCardOption() throws Exception {
		System.out.println("step 7 begin");
		UpcommingTripsPage utp = new UpcommingTripsPage(driver);
		utp.SelectPayByCreditCardOption();
		log.info("Successfully PayByCreditCard Option Is Selected \n");
		Reporter.log("<p>Successfully PayByCreditCard Option Is Selected ");
		System.out.println("step 7 end");
	}

	@Test(description = "Step 8:  Enter Value Into PaymentForms TextBox")
	public void Step08_EnterValueIntoPaymentFormsTextBox() throws Exception {
		System.out.println("step 8 begin");
		UpcommingTripsPage utp = new UpcommingTripsPage(driver);
		utp.EnterValueIntoPaymentFormsTextBox();
		log.info("Successfully Entered Value Into PaymentForms TextBox\n");
		Reporter.log("<p>Successfully Entered Value Into PaymentForms TextBox");
		System.out.println("step 8 end");
	}

	@Test(description = "Step 9:  Verify Thankyou page title")
	public void Step09_VerifyThankYouPageTitle() throws Exception {
		System.out.println("step 9 begin");
		ThankYouPageForUpcomingTrip ty = new ThankYouPageForUpcomingTrip(driver);
		ty.verifyThankYouPageTitle();
		log.info("Successfully Thankyou page title is Verified \n");
		Reporter.log("<p>Successfully Thankyou page title is Verified ");
		System.out.println("step 9 end");
	}

}
