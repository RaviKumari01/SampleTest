/*	Kavya/Anupriya
 * Click on any of the tabs displayed under Feature Adventure->
 * Click on the small card->Verify whether user is redirected to respective trip page 

 */

package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;

public class HOP_TC_08 extends BaseTest {

	

	@Test(description = "Precondition::  Open browser,Navigate to the RS URL")
	public void step01_HOMEPAGE_URL() throws Exception {
		System.out.println("step 1 begin");

		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl, driver_Name);

		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");

	}

	@Test(priority = 2, description = "Precondition: Close the modal")
	public void step02_ClickonCloseModal() throws Exception {
		System.out.println("step 2 begin");
		HomePage hp = new HomePage(driver);
		hp.ClickOnModal();
		log.info("Successfully closed the modal \n");
		Reporter.log("<p>Successfully closed the modal ");
		System.out.println("step 2 end");
	}

	@Test(priority = 3, description = "Click on any cards under Feature adventure tabs")
	public void step03_ClickOnInternationalTabUnderFA() throws Exception {
		System.out.println("step 3 begin");
		HomePage tripPage = new HomePage(driver);
		tripPage.clickOnFAAInternationalTab();

		log.info("Successfully clicked on International tab under feature adventure tabs \n");
		Reporter.log("<p>Successfully clicked on International tab under feature adventure tabs ");
		System.out.println("step 3 end");
	}

	@Test(priority = 4, description = "Click on any cards under Feature adventure tabs")
	public void step04_ClickOnTripCardsUnderFA() throws Exception {
		System.out.println("step 4 begin");
		HomePage tripPage = new HomePage(driver);
		tripPage.clickOnTripsBelowFA();

		log.info("Successfully clicked on any card displayed under feature adventure tabs \n");
		Reporter.log("<p>Successfully clicked on any card displayed under feature adventure tabs ");
		System.out.println("step 4 end");
	}

	@Test(priority = 5, description = "Verify the title of the Trip Page")
	public void step05_verifyTripPageTitle() throws Exception {
		System.out.println("step 5 begin");
		TripDetailPage tripPage = new TripDetailPage(driver);
		tripPage.verifyTripTitleOfFAAInternationalTab();
		log.info("Successfully user is navigated to proper trip detail page \n");
		Reporter.log("<p>Successfully user is navigated to proper trip detail page");
		System.out.println("step 5 end");
	}

}
