/*Author:Sukrity

Objectives:Navigate to trip page->Click on dates & Prces tab->Verify the default text displayed in airport 
departure dropdown->Verify the poo message->Change the dropdown option->Verify the poo message ->Again change 
the dropdown option back to poo and very again the poo message
 */

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TRP_TC_37 extends BaseTest{

	@Test(description = "Step 1:  Open browser,Navigate to the RS URL")
	public void Step01_HOMEPAGE_URL() throws Exception {
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	@Test(description = "Step 2:  Click on PopUp's close icon ")
	public void Step02_Close_PopUp() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage =new HomePage(driver);
		homePage.ClickOnModal();
		log.info("Successfully clicked on close icon \n");
		Reporter.log("<p>Successfully clicked on close icon");
		System.out.println("step 2 end");
	}


	@Test(description = "Step 3: Enter Text Into SearchTextBox")
	public void Step03_EnterTextIntoSearchTextBox() throws Exception {
		System.out.println("step 3 begin");
		HomePage homePage =new HomePage(driver);
		homePage.enterTextIntoSearchTextBox();
		log.info("Successfully Entered Text Into SearchTextBox\n");
		Reporter.log("<p>Successfully Entered Text Into SearchTextBox");
		System.out.println("step 3 end");
	}

	@Test(description = "Step 4:Click On Textbox SearchIcon and navigate To Trip Detail Page")
	public void Step04_clickOnTextboxSearchIcon() throws Exception {
		System.out.println("step 4 begin");
		HomePage homePage =new HomePage(driver);
		homePage.clickOnTextboxSearchIcon();
		log.info("Successfully clicked On Textbox SearchIcon\n");
		Reporter.log("<p>Successfully clicked On Textbox SearchIcon");
		System.out.println("step 4 end");
	}

	@Test(description = "Step 5:  click On DateAndprice Tab")
	public void Step05_clickOnDateAndpriceTab() throws Exception {
		System.out.println("step 5 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.clickOnDateAndpriceTab();
		log.info("Successfully clicked on DateAndprice Tab \n");
		Reporter.log("<p>Successfully clicked on DateAndprice Tab ");
		System.out.println("step 5 end");
	}

	@Test(description = "Step 6:  Verify Airport Dropdown POOMessage")
	public void Step06_VerifyAirportDropdownPOOMessage() throws Exception {
		System.out.println("step 6 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.VerifyAirportDropdownPOOMessage();
		log.info("Successfully Verified Airport Dropdown POOMessage\n");
		Reporter.log("<p>Successfully Verified Airport Dropdown POOMessage ");
		System.out.println("step 6 end");
	}

	@Test(description = "Step 7:  Click On Airport DropDown Arrow")
	public void Step07_ClickOnAirportDropDownArrow() throws Exception {
		System.out.println("step 7 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.ClickOnAirportDropDownArrow();
		log.info("Successfully Clicked On Airport DropDown Arrow\n");
		Reporter.log("<p>Successfully Clicked On Airport DropDown Arrow");
		System.out.println("step 7 end");
	}

	@Test(description = "Step 8:  Select Option From Airport DropDown")
	public void Step08_SelectOptionsFromAirportDropDown() throws Exception {
		System.out.println("step 8 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.SelectOptionsFromAirportDropDown(3);
		log.info("Successfully Option selected From Airport DropDown\n");
		Reporter.log("<p>Successfully Option selected From Airport DropDown ");
		System.out.println("step 8 end");
	}

	@Test(description = "Step 9:  Verify Airport Dropdown POOMessage")
	public void Step09_VerifyAirportDropdownPOOMessage() throws Exception {
		System.out.println("step 9 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.VerifyAirportDropdownPOOMessage();
		log.info("Successfully Verified Airport Dropdown POOMessage\n");
		Reporter.log("<p>Successfully Verified Airport Dropdown POOMessage ");
		System.out.println("step 9 end");
	}
	@Test(description = "Step 10:  Click On Airport DropDown Arrow")
	public void Step10_ClickOnAirportDropDownArrow() throws Exception {
		System.out.println("step 10 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.ClickOnAirportDropDownArrow();
		log.info("Successfully Clicked On Airport DropDown Arrow\n");
		Reporter.log("<p>Successfully Clicked On Airport DropDown Arrow");
		System.out.println("step 10 end");
	}

	@Test(description = "Step 11:  Select Option From Airport DropDown")
	public void Step11_SelectOptionsFromAirportDropDown() throws Exception {
		System.out.println("step 11 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.SelectOptionsFromAirportDropDown(0);
		log.info("Successfully Option selected From Airport DropDown\n");
		Reporter.log("<p>Successfully Option selected From Airport DropDown ");
		System.out.println("step 11 end");
	}

	@Test(description = "Step 12:  Verify Airport Dropdown POOMessage")
	public void Step12_VerifyAirportDropdownPOOMessage() throws Exception {
		System.out.println("step 12 begin");
		TripDatesAndPrices tdp=new TripDatesAndPrices(driver);
		tdp.VerifyAirportDropdownPOOMessage();
		log.info("Successfully Verified Airport Dropdown POOMessage\n");
		Reporter.log("<p>Successfully Verified Airport Dropdown POOMessage ");
		System.out.println("step 12 end");
	}
}
