/*Author:Manjula
Click on submit button without entering email->Verify the error->Click on close button



*/


package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;



import in.valtech.RoadScholar.pages.HomePage;

import in.valtech.config.BaseTest;


public class HOP_TC_03 extends BaseTest
{
	static  HomePage homePage ;
	
	@Test(description = "Step 1:  Open browser,Navigate to the RS URL")
	
	public void Step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		
		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);
		
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");

	}
	
	@Test(description = "Step 2:  clicking on submit button")
	public void Step02_ClickingOnSubmitBtn() throws Exception 
	{ 
		HomePage hop =new HomePage(driver);
		System.out.println("step 2 begin");
		hop.clickOnSubmit();
		log.info("Successdully clicked on submit button");
		System.out.println("step 2 end");
	}
	
	
}
