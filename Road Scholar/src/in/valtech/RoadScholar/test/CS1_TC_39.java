/*@ Kavya

 * Objective:Verify the navigation tabs displayed at the top->Verify the date select text is displayed->
 * Verify the title,subtitle->Verify your trip date component section->
 * Verify Need Airfare and price overview section
 * 
 */
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CheckOutStep1;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDatesAndPrices;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CS1_TC_39 extends BaseTest{
	static Login login;
	
	@Test(priority =1,description = "Step 1: Enter Text Into SearchTextBox")
	public void Step01_EnterTextIntoSearchTextBox() throws Exception {
		System.out.println("step 1 begin");
		HomePage homePage =new HomePage(driver);
		homePage.enterTextIntoSearchTextBox();
		log.info("Successfully Entered Text Into SearchTextBox\n");
		Reporter.log("<p>Successfully Entered Text Into SearchTextBox");
		System.out.println("step 1 end");
	}

	@Test(priority =2,description = "Step 2:Click On Textbox SearchIcon and navigate To Trip Detail Page")
	public void Step02_clickOnTextboxSearchIcon() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage =new HomePage(driver);
		homePage.clickOnTextboxSearchIcon();
		log.info("Successfully clicked On Textbox SearchIcon\n");
		Reporter.log("<p>Successfully clicked On Textbox SearchIcon");
		System.out.println("step 2 end");
	}
	
	
	@Test(priority = 3, description = "Step 3: Click on the Date&Price tab ")
	public void step3_ClickOnDatePriceTab() throws InterruptedException {
		System.out.println("step 3 begin");
		TripDetailPage enroll=new TripDetailPage(driver);
		enroll.clickOnEnrollNowBtn();
		log.info("Successfully clicked on the Date&Price tab \n");
		Reporter.log("<p>Successfully Clicked on the Date&Price tab  ");
		System.out.println("step 1 end");
	}
	
	@Test(priority = 4, description = "Step 4: Select date from Dates & Price tab ")
	public void step4_SelectDateFromDatesAndPriceTab() throws Exception {
		System.out.println("step 4 begin");
		TripDatesAndPrices dates= new TripDatesAndPrices(driver);
		dates.clickOnSelectDateBtn();
		log.info("Successfully selected date from Dates & Price tab \n");
		Reporter.log("<p>Successfully selected date from Dates & Price tab  ");
		System.out.println("step 4 end");
	}
	
	@Test(priority = 5, description = "Step 5: Verify the navigation tabs displayed at the top ")
	public void step5_VerifyTheNavigationTabs() throws Exception {
		System.out.println("step 5 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifyNavigationTabs();
		log.info("Successfully verified the navigation tabs displayed at the top \n");
		Reporter.log("<p>Successfully verified the navigation tabs displayed at the top  ");
		System.out.println("step 5 end");
	}
	
	@Test(priority = 6, description = "Step 6: Verify the date selected text ")
	public void step6_VerifyTheDateSelectedText() throws Exception {
		System.out.println("step 6 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifyDateSelectedText();
		log.info("Successfully verified the date selected text \n");
		Reporter.log("<p>Successfully verified the date selected text  ");
		System.out.println("step 6 end");
	}
	
	@Test(priority = 7, description = "Step 7: Verify the Title ")
	public void step7_VerifyTheTitle() throws Exception {
		System.out.println("step 7 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifyTitle();
		log.info("Successfully verified the Title \n");
		Reporter.log("<p>Successfully verified the Title ");
		System.out.println("step 7 end");
	}
	
	@Test(priority = 8, description = "Step 8: Verify the subtitle ")
	public void step8_VerifyTheSubtitle() throws Exception {
		System.out.println("step 8 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifySubTitle();	
		log.info("Successfully verified the subtitle \n");
		Reporter.log("<p>Successfully verified the subtitle ");
		System.out.println("step 8 end");
	}
	
	@Test(priority = 9, description = "Step 9: Verify the trip date component section ")
	public void step9_VerifyTheTripDateComponentSection() throws Exception {
		System.out.println("step 9 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifyTripComponentSection();
		log.info("Successfully verified the trip date component section \n");
		Reporter.log("<p>Successfully verified the trip date component section ");
		System.out.println("step 9 end");
	}
	
	@Test(priority = 10, description = "Step 10: Verify the Need Airfare section ")
	public void step10_VerifyTheNeedAirfareSection() throws Exception {
		System.out.println("step 10 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifyNeedAirfareSection();
		log.info("Successfully verified the Need Airfare section \n");
		Reporter.log("<p>Successfully verified the Need Airfare section ");
		System.out.println("step 10 end");
	}
	
	@Test(priority = 11, description = "Step 11: Verify the Price overview section ")
	public void step11_VerifyThePriceOverviewSection() throws Exception {
		System.out.println("step 11 begin");
		CheckOutStep1 chekOutStep1= new CheckOutStep1(driver);
		chekOutStep1.verifyPriceOverviewSection();
		log.info("Successfully verified the Price overview section \n");
		Reporter.log("<p>Successfully verified the Price overview section ");
		System.out.println("step 11 end");
	}

}
	


