/*	Kavya/anupriya
 * Click on any of the collection under Explore your interests->Verify user is navigated to appropriate page->
 * Verify the number of trips displayed->Verify the title&Description->
 * 
 */

package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.CollectionPage;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.config.BaseTest;

public class HOP_TC_09 extends BaseTest {

	
	
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

	@Test(priority = 3, description = "Click on any collection displayed under Explore Your Interest Card")
	public void step03_ClickOnCollectionUnderExploreYourInterest() throws Exception {
		System.out.println("step 3 begin");
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCollectionUnderExploreYourInterest();
		
		
		log.info("Successfully clicked on Collection under Explore Your Interest \n");
		Reporter.log("<p>Successfully clicked on Collection under Explore Your Interest  ");
		System.out.println("step 3 end");
	}
	
	@Test(priority =4, description = "Verify whether user navigated correct collection page")
	public void step04_VerifyNavigatedCollectionPageTitle() throws Exception {
		System.out.println("step 4 begin");
		CollectionPage collectionPage = new CollectionPage(driver);
		collectionPage.verifyCollectionTitle();
		
		log.info("Successfully verified the navigated collection Page \n");
		Reporter.log("<p>Successfully verified the navigated collection Page");
		System.out.println("step 4 end");
	}
	
	
	@Test(priority =5, description = "Verify No of Trips Displayed")
	public void step05_VerifyNoOfTripsDisplayedInCollectionPage() throws Exception {
		System.out.println("step 5 begin");
		CollectionPage collectionPage = new CollectionPage(driver);
		collectionPage.verifyCountofTrips();
		log.info("Successfully displayed the number of trips in collection Page \n");
		Reporter.log("<p>Successfully displayed the number of trips in collection Page ");
		System.out.println("step 5 end");
	}
	
	

	@Test(priority =6, description = "Verify description displayed ")
	public void step06_VerifyCollectionDescription() throws Exception {
		System.out.println("step 6 begin");
		CollectionPage collectionPage = new CollectionPage(driver);
		collectionPage.verifydescription();
		log.info("Successfully verified the description displayed \n");
		Reporter.log("<p>Successfully verified the description displayed");
	
	
		System.out.println("step 6 end");
	}
	
	
}

	
	
	
	

