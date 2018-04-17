/** Author:Anupriya
 * Click on Social sharing link->enter email & password->
 * Click on submit button->Share the page->
Click on the shared link and verify (Should redirect to roadscholar site)
 */


package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.SocialSite_TwiterPage;
import in.valtech.config.BaseTest;


import org.testng.Reporter;
import org.testng.annotations.Test;


public class HOP_TC_11 extends BaseTest
{


	@Test(description = "Step 1:  Open browser,Navigate to the RS URL")

	public void step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");

		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);

		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");

	}

	@Test(description = "Step 2: Close Sign Up window ")

	public static void step02_closingSignUpWindow() throws Exception 
	{
		System.out.println("step 2 begin");
		HomePage hm=new HomePage(driver);
		hm.ClickOnModal();
		log.info("Successfully closed the Sign Up window\n");
		Reporter.log("<p>Successfully closed the Sign Up window ");
		System.out.println("step 2 end");

	}
	@Test(description = "Step 3 : Navigate to Social link site ")

	public static void step03_NavigateToTwiterPage() throws Exception 
	{
		System.out.println("step 3 begin");

		// Navigates to RS application URL
		HomePage hm=new HomePage(driver);
		hm.clickOnTwitter();

		log.info("Successfully navigated to Social link site \n");
		Reporter.log("<p>Successfully navigated to Social link site");
		System.out.println("step 3 end");

	}	
	@Test(description = "Step 4 : Click on login ")

	public static void step04_NavigateToTwiterPage() throws Exception 
	{

		//	 GUIFunctions.normalWait();
		System.out.println("step 4 begin");
		SocialSite_TwiterPage twitter= new SocialSite_TwiterPage(driver);
		twitter.clickOnLogInbtn();
		log.info("Successfully clicked on login \n");
		Reporter.log("<p>Successfully clicked on login ");
		System.out.println("step 4 end");

	}
	@Test(description = "Step 5 : Enter email ")  
	public static void step05_EnterEmail() throws Exception 
	{
		System.out.println("step 5 begin");
		SocialSite_TwiterPage twitter=new SocialSite_TwiterPage(driver);
		twitter.EnterEmail();
		log.info("Successfully Entered email \n");
		Reporter.log("<p>Successfully Entered email ");
		System.out.println("step 5 end");
	}
	@Test(description = "Step 6 : Enter password ")  
	public static void step06_EnterPassword() throws Exception 
	{
		System.out.println("step 6 begin");
		SocialSite_TwiterPage twitter=new SocialSite_TwiterPage(driver);
		twitter.EnterPassword();
		log.info("Successfully Entered password \n");
		Reporter.log("<p>Successfully Entered password ");
		System.out.println("step 6 end");
	}
	@Test(description = "Step 7 :Click on login ")  
	public static void step07_ClickonloginBtn() throws Exception 
	{
		System.out.println("step 7 begin");
		SocialSite_TwiterPage twitter=new SocialSite_TwiterPage(driver);
		twitter.ClickOnSubmitButton();
		log.info("Successfully clicked on login \n");
		Reporter.log("<p>Successfully clicked on login ");
		System.out.println("step 7 end");
	}
	@Test(description = "Step 8 :Verifies it redirect to rs site ")  
	public static void step08_VerifiesRstitle() throws Exception 
	{
		System.out.println("step 8 begin");
		SocialSite_TwiterPage twitter=new SocialSite_TwiterPage(driver);
		twitter.verifyRSTitle();
		log.info("Successfully verified redirected to rs site \n");
		Reporter.log("<p>Successfully verified redirected to rs site ");
		System.out.println("step 8 end");
	}
}
