/* Author:Sravani
 * Objective:Navigate to PI page->Click on change your email link-Enter password into password field->
 * Enter same password in Re-Type password field->Click on save button->
 * Sign out from the header->Login with new password
 */
package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.ChangePassword;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.PersonalInformationPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class PIP_TC_28 extends BaseTest 
{
	

	//Click on personal Information Page
	@Test(priority=7,description="step 7:Click on Personal Information link")
	public void step07_clickOnPersonalInformationLink() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePage hop=new HomePage(driver);
		hop.clickOnPIP();
		log.info("Successfully clicked on Personal Information link \n");
		Reporter.log("<p>Successfully Clicked on personal information link");
		System.out.println("step 7 end");
	}

	//click on Change Password Link

	@Test(priority=8,description="step 8:click on Change Password Link ")
	public void step08_clickOnChangePasswordLink() throws Exception
	{
		System.out.println("step 8 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.ClickOnChangePwd();
		log.info("Successfully Clicked on change password link \n");
		Reporter.log("<p>Successfully Clicked on change password Link");
		System.out.println("step 8 end");
	}


	//Enter Value in password field.
	@Test(priority=9,description="step 9:Enter Value in  password field ")
	public void step09_enterValueInpasswordField() throws Exception
	{
		System.out.println("step 9 begin");
		ChangePassword cp = new ChangePassword(driver);
		cp.EnterPwd();
		log.info("Successfully entered password in password field \n");
		Reporter.log("<p>Successfully entered password in password field");
		System.out.println("step 9 end");
	}

	//Enter Value in re-type password field.
	@Test(priority=10,description="step 10:Enter Value in re-type password field. ")
	public void step10_enterValueInReTypePasswordField() throws Exception 
	{
		System.out.println("step 10 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.EnterReTypeCorrectPwd();
		log.info("Successfully entered password in  Retype password field \n");
		Reporter.log("<p>Successfully entered password in  Retype password field");
		System.out.println("step 10 end");
	}

	//click on Change Save Button
	@Test(priority=11,description="step 11:click on save Button ")
	public void step11_clickOnSaveButton() throws Exception
	{
		System.out.println("step 11 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.ClickOnSave();
		log.info("Successfully Clicke on save button \n");
		Reporter.log("<p>Successfully Clicke on save button");
		System.out.println("step 11 end");
	}

	//click on signout button
	@Test(priority=12,description="step 12:click on signout button ")
	public void step12_clickOnSignOutButton() throws Exception 
	{
		System.out.println("step 12 begin");
		ChangePassword cp=new ChangePassword(driver);	
		cp.SignOut();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on sign out button \n");
		Reporter.log("<p>Successfully Clicked on sign out Button");
		System.out.println("step 12 end");
	}

	//click on Click on sign in Link from Header
	@Test(priority=13,description = "step 13:Click on sign in Link from Header")
	public void step13_clickOnSignInLinkFromheader() throws Exception 
	{
		System.out.println("step 13 begin");
		HomePage HOP=new HomePage(driver);
		HOP.clickOnSignINHeader();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on sign in Link from Header \n");
		Reporter.log("<p>Successfully Clicked on sign in Link from Header");
		System.out.println("step 13 end");
	}

	//entering mail id
	@Test(priority=14,description = "step 14:entering mail id into email field")
	public void step14_enterValueInEmailField() throws Exception 
	{
		System.out.println("step 14 begin");
		Login login=new Login(driver);
		GUIFunctions.normalWait();
		login.EnterEmail(UserName);
		GUIFunctions.normalWait();
		log.info("Successfully entered mail id into email field \n");
		Reporter.log("<p>Successfully entered entering mail id into email field");
		System.out.println("step 14 end");
	}

	//entering New Password
	@Test(priority=15,description = "step 15:entering New Password in Password Field")
	public void step15_EnteringNewPasswordInPasswordField() throws Exception 
	{
		System.out.println("step 15 begin");
		Login login=new Login(driver);
		GUIFunctions.normalWait();
		login.EnterPassword(Password);
		log.info("Successfully entered the New password  in Password Field \n");
		Reporter.log("<p>Successfully entered the New password  in Password Field");
		System.out.println("step 15 end");
		GUIFunctions.normalWait();
	}

	//Click on Sign up Button
	@Test(priority=16,description = "step 16:Click on Sign up Button")
	public void step16_SignUpBUtton() throws Exception 
	{
		System.out.println("step 16 begin");
		Login login=new Login(driver);
		GUIFunctions.normalWait();
		login.clickOnSignBtn();
		log.info("Successfully Clicked on signup button \n");
		Reporter.log("<p>Successfully Clicked on signup button ");
		System.out.println("step 16 end");
	}

}
