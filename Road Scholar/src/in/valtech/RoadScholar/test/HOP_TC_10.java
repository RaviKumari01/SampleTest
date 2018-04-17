/* Author: Anupriya
 * Click on the components displayed in special offer block
 *  ->Verify the page after clicking on component
 * 
 * 
 */

package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;

public class HOP_TC_10 extends BaseTest {
	
	
	@Test(priority=1,description="  Open browser,Navigate to the RS URL")
	public void Step01_NavigeteToURL() throws Exception 
	{
		System.out.println("step 1 begin");

		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);

		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}
	@Test(priority=2,description=" Close the modal")
	public void Step02_ClickonCloseModal() throws Exception 
	{
		System.out.println("step 2 begin");
		HomePage homePage =new HomePage(driver);
		homePage.ClickOnModal();
		log.info("Successfully closed popup \n");
		Reporter.log("<p>Successfully closed popup");
		System.out.println("step 2 end");
	}
	@Test(priority=3,description="Step03_ClickonSpecialOfferComponent")
	public void Step03_ClickonSpecialOfferComponent() throws Exception 
	{
		System.out.println("step 3 begin");
		HomePage hm=new HomePage(driver);
		hm.ClickOnSpecialOffer();
		log.info("Successfully ClickedonSpecialOfferComponent \n");
		Reporter.log("<p>Successfully ClickedonSpecialOfferComponent");
		System.out.println("step 3 end");
	
	}
	@Test(priority=4,description="Step04_verifyTripTitle")
	public void Step04_verifyTripTitle() throws Exception 
	{
		System.out.println("step 4 begin");
		TripDetailPage tp=new TripDetailPage(driver);
		tp.verifyTripTitle();
		log.info("Successfully verifiedTripTitle \n");
		Reporter.log("<p>Successfully verifiedTripTitle");
		
}
}

