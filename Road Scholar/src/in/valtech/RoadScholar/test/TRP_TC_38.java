/* Author: Anupriya
 * 
Navigate to trip page->Click on dates & Prices tab->
Select any airport option->Select single from room type dropdown-
>Click on select date button->Verify the option displayed under gateway airport dropdown

*/
package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TRP_TC_38 extends BaseTest 
{
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
		HomePage hop = new HomePage(driver);
		hop.ClickOnModal();
		log.info("Successfully closed the modal \n");
		Reporter.log("<p>Successfully closed the modal ");
		System.out.println("step 2 end");
	} 
	
	@Test(priority = 3, description = "enterTripIdIntoSearchTextBox")
	public void step03_enterTripIdIntoSearchTextBox() throws Exception {
		System.out.println("step 3 begin");
		HomePage hop = new HomePage(driver);
		hop.enterTripIdIntoSearchTextBox();
		log.info("Successfully entered trip card id \n");
		Reporter.log("<p>Successfully entered trip card id ");
		System.out.println("step 3 end");		
	}
	
	@Test(priority = 4, description = "clickOnTextboxSearchIcon")
	public void step04_clickOnTextboxSearchIcon() throws Exception {
		System.out.println("step 4 begin");
		HomePage hop = new HomePage(driver);
		hop.clickOnTextboxSearchIcon();
		log.info("Successfully Clicked on search icon \n");
		Reporter.log("<p>Successfully Clicked on search icon ");
		System.out.println("step 4 end");		
	}
	
	@Test(priority = 5, description = "click on dates and prices tab")
	public void step05_ClickonDatesPricesTab() throws Exception {
		GUIFunctions.normalWait();
		System.out.println("step 5 begin");
		TripDetailPage TRP = new TripDetailPage (driver);
		GUIFunctions.normalWait();
		TRP.clickOnDateAndpriceTab();
		log.info("Successfully Clicked on dates and prices tab\n");
		Reporter.log("<p>Successfully Clicked on dates and prices tab");
		System.out.println("step 5 end");
		
	}
	
	@Test(priority = 6, description = "SelectAirportdropdown")
	public void step06_SelectAirportdropdown() throws Exception {
		GUIFunctions.normalWait();
		System.out.println("step 6 begin");
		TripDatesAndPrices Trips = new TripDatesAndPrices(driver);
		Trips.selectAirportDropdown();
		log.info("Successfully Selected Airportdropdown\n");
		Reporter.log("<p>Successfully Selected Airportdropdown");
		System.out.println("step 6 end");
		
	}
	
	@Test(priority = 7, description = "SelectRoomDropdown")
	public void step07_SelectRoomDropdown() throws Exception {
		System.out.println("step 7 begin");
		TripDatesAndPrices Trips = new TripDatesAndPrices(driver);
		Trips.selectroomdropdown();
		log.info("Successfully Selected single RoomDropdown\n");
		Reporter.log("<p>Successfully Selected single RoomDropdown");
		System.out.println("step 7 end");
		
	}
	
	@Test(priority = 8, description = "Selectdatebtn")
	public void step08_Selectdatebtn() throws Exception {
		System.out.println("step 8 begin");
		TripDatesAndPrices Trips = new TripDatesAndPrices(driver);
		Trips.clickOnSelectDateBtn();
		log.info("Successfully Selected datebtn\n");
		Reporter.log("<p>Successfully Selected datebtn");
		System.out.println("step 8 end");
		
	}
	@Test(priority = 9, description = "verifyGateWayDropdownOption")
	public void step09_verifyGateWayDropdownOption() throws Exception {
		System.out.println("step 9 begin");
		CheckOutStep1 cs1=new CheckOutStep1(driver);
		//cs1.verifyGateWayDropdownOption();
		log.info("Successfully verified GateWayDropdownOption\n");
		Reporter.log("<p>Successfully verified GateWayDropdownOption");
		System.out.println("step 9 end");
		
	}
}