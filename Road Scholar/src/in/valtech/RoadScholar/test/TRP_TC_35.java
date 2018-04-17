/*Author:Sukrity
Objectives:Verify the tabs displayed in trip page and click on that->The clicked tabs should be selected

 */
package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TRP_TC_35 extends BaseTest{

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

	@Test(description = "Step 3:  Click on  any trip card")
	public void Step03_clickOnTripcard() throws Exception {
		System.out.println("step 3 begin");
		HomePage homePage =new HomePage(driver);
		homePage.clickOnTripCard();
		log.info("Successfully clicked on any trip card \n");
		Reporter.log("<p>Successfully clicked on any trip card ");
		System.out.println("step 3 end");
	}

	@Test(description = "Step 4: Verify Overview Tab Is Selected")
	public void Step04_OverviewTabIsSelected() throws Exception {
		System.out.println("step 4 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.OverviewTabIsSelected();
		log.info("Successfully Verified Overview Tab Is Selected \n");
		Reporter.log("<p>Successfully Verified Overview Tab Is Selected ");
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

	@Test(description = "Step 6: Verify DateAndprice Tab Is Selected")
	public void Step06_DateAndpriceTabIsSelected() throws Exception {
		System.out.println("step 6 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.DateAndpriceTabIsSelected();
		log.info("Successfully Verified DateAndprice Tab Is Selected \n");
		Reporter.log("<p>Successfully Verified DateAndprice Tab Is Selected ");
		System.out.println("step 6 end");
	}

	@Test(description = "Step 7:  click On ItineraryAndMap Tab")
	public void Step07_clickOnItineraryAndMapTab() throws Exception {
		System.out.println("step 7 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.clickOnItineraryAndMapTab();
		log.info("Successfully clicked on ItineraryAndMap Tab \n");
		Reporter.log("<p>Successfully clicked on ItineraryAndMap Tab ");
		System.out.println("step 7 end");
	}

	@Test(description = "Step 8: Verify ItineraryAndMap Tab Is Selected")
	public void Step08_ItineraryAndMapTabIsSelected() throws Exception {
		System.out.println("step 8 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.ItineraryAndMapTabIsSelected();
		log.info("Successfully Verified ItineraryAndMap Tab Is Selected \n");
		Reporter.log("<p>Successfully Verified ItineraryAndMap Tab Is Selected ");
		System.out.println("step 8 end");
	}

	@Test(description = "Step 9:  click On LodgingAndMeals Tab")
	public void Step09_clickOnLodgingAndMealsTab() throws Exception {
		System.out.println("step 9 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.clickOnLodgingAndMealsTab();
		log.info("Successfully clicked on LodgingAndMeals Tab \n");
		Reporter.log("<p>Successfully clicked on LodgingAndMeals Tab ");
		System.out.println("step 9 end");
	}

	@Test(description = "Step 10: Verify LodgingAndMeals Tab Is Selected")
	public void Step10_LodgingAndMealsTabIsSelected() throws Exception {
		System.out.println("step 10 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.LodgingAndMealsTabIsSelected();
		log.info("Successfully Verified LodgingAndMeals Tab Is Selected \n");
		Reporter.log("<p>Successfully Verified LodgingAndMeals Tab Is Selected ");
		System.out.println("step 10 end");
	}

	@Test(description = "Step 11:  click On Reviews Tab")
	public void Step11_clickOnReviewsTab() throws Exception {
		System.out.println("step 11 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.clickOnReviewsTab();
		log.info("Successfully clicked on Reviews Tab \n");
		Reporter.log("<p>Successfully clicked on Reviews Tab ");
		System.out.println("step 11 end");
	}

	@Test(description = "Step 12: Verify Reviews Tab Is Selected")
	public void Step12_ReviewsTabIsSelected() throws Exception {
		System.out.println("step 12 begin");
		TripDetailPage tdp=new TripDetailPage(driver);
		tdp.ReviewsTabIsSelected();
		log.info("Successfully Verified Reviews Tab Is Selected \n");
		Reporter.log("<p>Successfully Verified Reviews Tab Is Selected ");
		System.out.println("step 12 end");
	}
}
