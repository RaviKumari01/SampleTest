/*Author:ANUPRIYA
Enter any search term in search box
->Select destination/interests/Adventures from flyout 
->verify the page
 */

package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.TripDetailPage;
import in.valtech.config.BaseTest;


public class HOP_TC_06 extends BaseTest
{


	@Test(priority=1,description = "Step 1:  Open browser,Navigate to the RS URL")

	public void Step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");

	}

	@Test(priority=2,description = "Step 2:  clicking on close button")
	public void Step02_ClickingOnCLOSE() throws Exception 
	{   HomePage hop =new HomePage(driver);
	hop.ClickOnModal();
	log.info("Successdully clicked on close button");
	Reporter.log("<p>Successdully clicked on close button");
	System.out.println("step 2 end");
	Thread.sleep(1000);
	}

	@Test(priority=3,description = "Step 3: Enter search text into search textbox")
	public void Step03_enterTextIntoSearchTextBox() throws Exception 
	{  
		log.info("step 3 begin");
		HomePage hop =new HomePage(driver);
		System.out.println("step 3 begin");
		hop.enterTextIntoSearchTextBox();
		log.info("Successfully entered TextIntoSearchTextBox");
		Reporter.log("<p>Successfully entered TextIntoSearchTextBox");
		System.out.println("step 3 end");
	}
	@Test(priority=4,description = "Step 4: ClickonFlyout")
	public void Step04_ClickonFlyout() throws Exception 
	{ log.info("step 4 begin");
	HomePage hop =new HomePage(driver);
	hop.ClickonFlyout();
	log.info("Successdully Clicked onFlyout");
	Reporter.log("<p>Successdully Clicked onFlyout");
	System.out.println("step 4 end");

	}
	@Test(priority=5,description="Step5_verifyTripTitle")
	public void Step05_verifyTripTitle() throws Exception 
	{
		System.out.println("step 5 begin");
		TripDetailPage tp=new TripDetailPage(driver);
		tp.verifyTripTitle();
		log.info("Successfully verifiedTripTitle \n");
		Reporter.log("<p>Successfully verifiedTripTitle");
		System.out.println("step 5 end");
}






}

