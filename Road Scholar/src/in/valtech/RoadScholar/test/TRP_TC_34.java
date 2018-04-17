/* Author: Anupriya
 * 
 * Click on any of the trip card from homepage->Click on share button->Enter all the details->
 * Click on submit button->Verify the thank you text and subtext->Click on close button
 */

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class TRP_TC_34 extends BaseTest {

	

	@Test(description = "  Open browser,Navigate to the RS URL")
	public void step01_HOMEPAGE_URL() throws Exception {
		System.out.println("step 1 begin");

		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl, driver_Name);

		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");

	}

	@Test(priority = 2, description = " Close the modal")
	public void step02_ClickonCloseModal() throws Exception {
		System.out.println("step 2 begin");
		HomePage hp = new HomePage(driver);
		hp.ClickOnModal();
		log.info("Successfully closed the modal \n");
		Reporter.log("<p>Successfully closed the modal ");
		System.out.println("step 2 end");
	} 
	
	@Test(priority = 3, description = "click on any trip card")
	public void step03_ClickonTripCard() throws Exception {
		System.out.println("step 3 begin");
		HomePage hp = new HomePage(driver);
		hp.clickOnTripCard();
		log.info("Successfully Clicked on trip card \n");
		Reporter.log("<p>Successfully Clicked on trip card ");
		System.out.println("step 3 end");
	} 
	
	@Test(priority = 4, description = "click on share btn")
	public void step04_ClickonSharebtn() throws Exception {
		System.out.println("step 4 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.clickOnShareLink();
		log.info("Successfully Clicked on share btn\n");
		Reporter.log("<p>Successfully Clicked on share btn");
		System.out.println("step 4 end");
	} 
	
	@Test(priority = 5, description = "Enter First name")
	public void step05_EnterFN() throws Exception {
		System.out.println("step 5 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.enterFirstName();
		log.info("Successfully entered firstName\n");
		Reporter.log("<p>Successfully entered firstName");
		System.out.println("step 5 end");
	} 
	@Test(priority = 6, description = "Enter Last name")
	public void step06_EnterLN() throws Exception {
		System.out.println("step 6 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.enterLastName();
		log.info("Successfully entered LastName\n");
		Reporter.log("<p>Successfully entered LastName");
		System.out.println("step 6 end");
	} 
	
	@Test(priority = 7, description = "Enter  frnd's First name")
	public void step07_EnterFrndFN() throws Exception {
		System.out.println("step 7 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.enterfrndFirstName();
		log.info("Successfully entered firstName\n");
		Reporter.log("<p>Successfully entered firstName");
		System.out.println("step 7 end");
	} 
	
	@Test(priority = 8, description = "Enter  frnd's last name")
	public void step08_EnterFrndLN() throws Exception {
		System.out.println("step 8 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.enterfrnddLastName();
		log.info("Successfully entered LastName\n");
		Reporter.log("<p>Successfully entered LastName");
		System.out.println("step 8 end");
	} 
	
	@Test(priority = 9, description = "Enter  frnd's email")
	public void step09_EnterFrndEmail() throws Exception {
		System.out.println("step 9 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.enterfrndEmail();
		log.info("Successfully entered email\n");
		Reporter.log("<p>Successfully entered email");
		System.out.println("step 9 end");
	} 
	
	
	@Test(priority = 10, description = "ClickOnSubmitButton")
	public void step10_clickOnSubmitButton() throws Exception {
		System.out.println("step 10 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.clickOnSubmitBtn();
		log.info("Successfully Clicked OnSubmitButton\n");
		Reporter.log("<p>Successfully Clicked OnSubmitButton");
		System.out.println("step 10 end");
	} 
	
	@Test(priority = 11, description = "verifies Thank you title ")
	public void step11_VerifiesThankyoutitle () throws Exception {
		System.out.println("step 11 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyThankyoutitle();
		log.info("Successfully verified Thank you title\n");
		Reporter.log("<p>Successfully verified Thank you title");
		System.out.println("step 11 end");
	} 
	@Test(priority = 12, description = "verifies ThankYouSubtext ")
	public void step12_VerifiesThankYouSubtext () throws Exception {
		System.out.println("step 12 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyThankyouSubText();
		log.info("Successfully verified Thank you Subtext\n");
		Reporter.log("<p>Successfully verified Thank you Subtext");
		System.out.println("step 12 end");
	} 
	
	@Test(priority = 13, description = "clicks OnCloseButton")
	public void step13_clickOnCloseButton () throws Exception {
		System.out.println("step 13 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.clickOnShareModalCloseIcon();
		log.info("Successfully clicked On Close Button\n");
		Reporter.log("<p>Successfully clicked On Close Button");
		System.out.println("step 13 end");
	} 
}
