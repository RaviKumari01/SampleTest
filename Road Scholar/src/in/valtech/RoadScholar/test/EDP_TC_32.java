/**Author:Sravani
 * Objective:Mouse hover on my account->Click on edit profile link->Verify the image displayed (image should not be saved)
 *  ->Click on change btn->upload any image->Verify the profile pic added message->Select privacy settings radio btn
 *  ->Click on save btn->Verify the success message->Mouse hover on my account->Click on sign out btn
 **/
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.EditProfile;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EDP_TC_32 extends BaseTest
{
	static  HomePage homePage ;

	//Open browser,Navigate to the RS URL
	@Test(priority=1, description = "step 1: Open browser,Navigate to the RS URL")
	public void step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);	
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	//Close Signup PopUp
	@Test(priority=2,description = "step 2: Close Signup PopUp")
	public void step02_CloseSignUpPopUp() throws Exception 
	{
		System.out.println("step 2 begin");	
		GUIFunctions.normalWait();
		HomePage hop = new HomePage(driver);
		hop.ClickOnModal();
		log.info("Successfully clicked on close Button \n");
		Reporter.log("<p>Successfully clicked on close Button");
		System.out.println("step 2 end");
	}

	//Click on sign in Link from header
	@Test(priority=3,description = "step 3:Click on sign in Link from header")
	public void step03_ClickOnSignInLink() throws Exception 
	{
		System.out.println("step 3 begin");
		HomePage hop=new HomePage(driver);
		hop.clickOnSignINHeader();
		log.info("Successfully clicked on sign in Link from header \n");
		Reporter.log("<p>Successfully Clicked sign in Link from header");
		System.out.println("step 3 end");
	}

	//entering mail id
	@Test(priority=4,description = "step 4:entering mail id into email field")
	public void step04_enterEmailInToEmailField() throws Exception 
	{
		System.out.println("step 4 begin");
		Login login=new Login(driver);
		login.EnterEmail(UserName);
		log.info("Successfully entered email into email field \n");
		Reporter.log("<p>Successfully entered email into email field");	
		System.out.println("step 4 end");
	}

	//entering Password
	@Test(priority=5,description = "step 5:entering Password into password field")
	public void step05_enterPasswordIntoPasswordField() throws Exception 
	{
		System.out.println("step 5 begin");
		Login login=new Login(driver);
		login.EnterPassword(Password);
		log.info("Successfully entered Password into password field \n");
		Reporter.log("<p>Successfully entered Password into password field");
		System.out.println("step 5 end");
		GUIFunctions.normalWait();
	}

	//Click on Sign in Button
	@Test(priority=6,description = "step 6:Click on Sign in Button")
	public void step06_clickOnSignInButton() throws Exception 
	{
		System.out.println("step 6 begin");
		Login login=new Login(driver);
		login.clickOnSignBtn();
		Thread.sleep(2000);
		log.info("Successfully clicked on Sign in Button \n");
		Reporter.log("<p>Successfully clicked on Signin Button");
		System.out.println("step 6 end");
	}

	//Click on My Account From header
	@Test(priority=7,description = "step 7:Click on My Account From header")
	public void step07_ClickOnMyAccoountFromHeader() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePage hop=new HomePage(driver);
		hop.ClickOnMyAccountLink();
		log.info("Successfully clicked on  My Account From header\n");
		Reporter.log("<p>Successfully clicked on My Account From header");
		System.out.println("step 7 end");
	}

	//Click on Edit Profile Link
	@Test(priority=8,description = "step 8:Click on Edit Profile Link")
	public void step08_clickOnEditProfileLink() throws Exception 
	{
		System.out.println("step 8 begin");
		HomePage hop=new HomePage(driver);
		hop.ClickOnEditProfileLink();
		log.info("Successfully clicked on Edit Profile Link \n");
		Reporter.log("<p>Successfully clicked on Edit Profile Link");
		System.out.println("step 8 end");
	}

	//Verify Edit ProfilePage
	@Test(priority=9,description = "step 9:Verify Edit ProfilePage")
	public void step09_VerifyEditProfilePage() throws Exception 
	{
		System.out.println("step 9 begin");
		EditProfile edp=new EditProfile(driver);
		edp.verifyEditProfileDefaultImage();
		log.info("Successfully Verified Edit ProfilePage \n");
		Reporter.log("<p>Successfully Verified Edit ProfilePage");
		System.out.println("step 9 end");
	}

	//Click On Change Link
	@Test(priority=10,description = "step 10:Click On Change Link")
	public void step10_ClickOnChangeLink() throws Exception 
	{
		System.out.println("step 10 begin");
		EditProfile edp=new EditProfile(driver);
		edp.UploadImage();
		log.info("Successfully Verified Edit ProfilePage \n");
		Reporter.log("<p>Successfully Verified Edit ProfilePage");
		System.out.println("step 10 end");
	}

	//Verify Profile Success
	@Test(priority=11,description = "step 11:Verify Profile Success")
	public void step11_VerifyProfileSuccess() throws Exception 
	{
		System.out.println("step 11 begin");
		EditProfile edp=new EditProfile(driver);
		edp.verifyProfileSucess();
		log.info("Successfully Verified Success message for Profile Change \n");
		Reporter.log("<p>Successfully Verified Success message for Profile Change");
		System.out.println("step 11 end");
	}

	//Check Private Radio button
	@Test(priority=12,description = "step 12:Check Private Radio button")
	public void step12_CheckPrivateRadiobutton() throws Exception 
	{
		System.out.println("step 12 begin");
		EditProfile edp=new EditProfile(driver);
		edp.SelectPrivateRadioButton();
		log.info("Successfully Checked Private Radio button \n");
		Reporter.log("<p>Successfully Checked Private Radio button");
		System.out.println("step 12 end");
	}

	//Click On Save Button
	@Test(priority=13,description = "step 13:Click On Save Button")
	public void step13_ClickOnSaveButton() throws Exception 
	{
		System.out.println("step 13 begin");
		EditProfile edp=new EditProfile(driver);
		edp.ClickOnSaveButton();
		log.info("Successfully Clicked On Save Button \n");
		Reporter.log("<p>Successfully Clicked On Save Button");
		System.out.println("step 13 end");
	}

	//click on signout button
	@Test(priority=14,description="step 14:click on signout button ")
	public void step14_clickOnSignOutButton() throws Exception 
	{
		System.out.println("step 12 begin");
		EditProfile edp=new EditProfile(driver);
		edp.SignOut();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on sign out button \n");
		Reporter.log("<p>Successfully Clicked on sign out Button");
		System.out.println("step 12 end");
	}







}
