/*Author:Sukrity

Objectives:Click on any of the trip card from homepage->Click on share button->Verify the title->Click on 
submit button->Verify the error message->Click on close button

 */
package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TRP_TC_33 extends BaseTest {

	@Test(description = "Step 1:  Open browser,Navigate to the RS URL")
	public void Step01_HOMEPAGE_URL() throws Exception {
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver, homePageUrl, driver_Name);
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	@Test(description = "Step 2:  Click on PopUp's close icon ")
	public void Step02_Close_PopUp() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage = new HomePage(driver);
		homePage.ClickOnModal();
		log.info("Successfully clicked on close icon \n");
		Reporter.log("<p>Successfully clicked on close icon");
		System.out.println("step 2 end");
	}

	@Test(description = "Step 3:  Click on  any trip card")
	public void Step03_clickOnTripcard() throws Exception {
		System.out.println("step 3 begin");
		HomePage homePage = new HomePage(driver);
		homePage.clickOnTripCard();
		log.info("Successfully clicked on any trip card \n");
		Reporter.log("<p>Successfully clicked on any trip card");
		System.out.println("step 3 end");
	}

	@Test(description = "Step 4:  Click on  share link")
	public void Step04_clickOnShareLink() throws Exception {
		System.out.println("step 4 begin");
		TripDetailPage tdp = new TripDetailPage(driver);
		tdp.clickOnShareLink();
		log.info("Successfully clicked on share link \n");
		Reporter.log("<p>Successfully clicked on share link");
		System.out.println("step 4 end");
	}

	@Test(description = "Step 5:  verify Share Modal Title")
	public void Step05_verifyShareModalTitle() throws Exception {
		System.out.println("step 5 begin");
		TripDetailPage tdp = new TripDetailPage(driver);
		tdp.verifyShareModalTitle();
		log.info("Successfully Verified Share Modal Title \n");
		Reporter.log("<p>Successfully Verified Share Modal Title ");
		System.out.println("step 5 end");
	}

	@Test(description = "Step 6:  Click on  submit btn")
	public void Step06_clickOnSubmitBtn() throws Exception {
		System.out.println("step 6 begin");
		TripDetailPage tdp = new TripDetailPage(driver);
		tdp.clickOnSubmitBtn();
		log.info("Successfully clicked on submit btn \n");
		Reporter.log("<p>Successfully clicked on submit btn");
		System.out.println("step 6 end");
	}

	@Test(description = "Step 7:  verify Share Modal Error Message")
	public void Step07_verifyShareModalErrorMessage() throws Exception {
		System.out.println("step 7 begin");
		TripDetailPage tdp = new TripDetailPage(driver);
		tdp.verifyShareModalErrorMessage();
		log.info("Successfully Verified Share Modal Error Message\n");
		Reporter.log("<p>Successfully Verified Share Modal Error Message ");
		System.out.println("step 7 end");
	}

	@Test(description = "Step 8:  click On ShareModal Close Icon")
	public void Step08_clickOnShareModalCloseIcon() throws Exception {
		System.out.println("step 8 begin");
		TripDetailPage tdp = new TripDetailPage(driver);
		tdp.clickOnShareModalCloseIcon();
		log.info("Successfully clicked on ShareModal Close Icon\n");
		Reporter.log("<p>Successfully clicked on ShareModal Close Icon");
		System.out.println("step 8 end");
	}
}
