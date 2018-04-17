/* @ Anupriya
Click on sign in link from header->Enter email&pwd->
Click on sign in button
 * 
 */
package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.config.BaseTest;

public class HOP_TC_05  extends BaseTest  {




	@Test(description = "Precondition::  Open browser,Navigate to the RS URL")

	public void Step01_HOMEPAGE_URL() throws Exception 
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
		HomePage hp=new HomePage(driver);
		hp.ClickOnModal();
		log.info("Successfully closed the modal \n");
		Reporter.log("<p>Successfully closed the modal ");
		System.out.println("step 2 end");
	}
	@Test(priority=3,description="Click on Sign in from header")
	public void Step03_clickOnSignINHeader() throws Exception 
	{
		System.out.println("step 3 begin");
		HomePage homePage=new HomePage(driver);
		homePage.clickOnSignINHeader();
		log.info("Successfully Clicked on Sign in from header\n");
		Reporter.log("<p>Successfully Clicked on Sign in from headers ");
		System.out.println("step 3 end");
	}
	@Test( priority=3,description="Step 3: Enter email address")
	public void Step04_EnterEmailAddress() throws InterruptedException 
	{
		System.out.println("step 4 begin");
		Login login=new Login(driver);
		System.out.println("Inside mail");	
		login.EnterEmail(UserName);
		log.info("Successfully Entered email address\n");
		Reporter.log("<p>Successfully Entered email address");
		System.out.println("step 4 end");

	} 
	@Test(priority=4,description="Step 4: Enter password")
	public void Step05_EnterPassword() throws InterruptedException
	{
		System.out.println("step 5 begin");
		Login login=new Login(driver);
		login.EnterPassword(Password);
		log.info("Successfully Entered password\n");
		Reporter.log("<p>Successfully Entered password");
		System.out.println("  Inside    "+Password);
		System.out.println("step 5 end");
	}
	@Test(priority=5,description="Step 4: Click on SignIn Btn")
	public void Step06_ClickOnSignInButton() throws InterruptedException
	{
		System.out.println("step 6 begin");
		Login login=new Login(driver);
		login.clickOnSignBtn();
		log.info("Successfully Clicked on SignIn Btn\n");
		Reporter.log("<p>Successfully Clicked on SignIn Btn");
		System.out.println("step 6 end");


	}

	
  
}
