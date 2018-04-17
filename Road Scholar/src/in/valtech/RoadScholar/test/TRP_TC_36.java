/* Author: Anupriya
 * 
 * Navigate to trip page->Click on enroll now button->Verify the departure airport text->
 * Verify departure airport drop down is displayed->Verify the text displayed below airport dropdown->
 * Verify the type of room text->
 * Verify the room type dropdown is displayed->Verify the text displayed below room type dropdown
 */
package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;

public class TRP_TC_36  extends BaseTest {
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
	@Test(priority = 4, description = "click on enroll btn")
	public void step04_ClickonEnrollbtn() throws Exception {
		System.out.println("step 4 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.clickonEnrollbtn();
		log.info("Successfully Clicked on enroll btn \n");
		Reporter.log("<p>Successfully Clicked on enroll btn ");
		System.out.println("step 4 end");
	} 
	@Test(priority = 5, description = "verifyDepartureAirportText ")
	public void step05_VerifyDepartureAirportText () throws Exception {
		System.out.println("step 5 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyDepartureAirportText();
		
		System.out.println("step 5 end");
	} 
	@Test(priority = 6, description = " verifyDepartureAirportDropdown ")
	public void step06_VerifyDepartureAirportDropdown() throws Exception {
		System.out.println("step 6 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyDepartureAirportDropdown();
		System.out.println("step 6 end");
	} 
	
	@Test(priority = 7, description = " verifyDepartureAirportBelowText ")
	public void step06_VerifyDepartureAirportBelowText() throws Exception {
		System.out.println("step 7 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyDepartureAirportBelowText();
		System.out.println("step 7 end");
	} 
	
	@Test(priority = 8, description = " verifyRoomAboveText ")
	public void step08_verifyRoomAboveText() throws Exception {
		System.out.println("step 8 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyRoomAboveText();
		log.info("Successfully verified Room above Text  \n");
		Reporter.log("<p>Successfully verified Room above Text ");
		System.out.println("step 8 end");
	} 
	@Test(priority = 9, description = " verifyRoomDropdown ")
	public void step09_verifyRoomDropdown() throws Exception {
		System.out.println("step 9 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifyRoomDropdown();
		log.info("Successfully verified RoomDropDown  \n");
		Reporter.log("<p>Successfully verified RoomDropDown ");
		System.out.println("step 9 end");
	} 
	
	@Test(priority = 10, description = " verifRoomBelowText ")
	public void step10_verifRoomBelowText() throws Exception {
		System.out.println("step 10 begin");
		TripDetailPage trip=new TripDetailPage(driver);
		trip.verifRoomBelowText();
		log.info("Successfully verified the Room drop down below text  \n");
		Reporter.log("<p>Successfully verified the Room drop down below text ");
		System.out.println("step 10 end");
	} 
}
