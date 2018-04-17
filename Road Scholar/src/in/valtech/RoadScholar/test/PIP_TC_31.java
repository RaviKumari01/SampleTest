/*Author:Sravani
 * Objective:Navigate to PI page->Change the email address displayed->
 * Click on Change password button->Click on save and continue button->
 * Verify whether user is redirected back to PI page->Again click on change password button->
 * Enter password in pwd and RTP password field->click on save button->
 * Verify the success msg

 */
package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.ChangePassword;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.PersonalInformationPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PIP_TC_31 extends BaseTest 
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

	//change email address 
	@Test(priority=8,description="step 8:change email address ")
	public void step08_changeEmailAddressandClickOnChangepasswordLink() throws Exception 
	{
		System.out.println("step 8 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.ChangeEmailAndSave();
		
		log.info("Successfully changed the email address  \n");
		Reporter.log("<p>Successfully changed the email address");
		System.out.println("step 8 end");
	}

	//click on Change Password Link
	@Test(priority=9,description="step 9:click on Change Password Link ")
	public void step09_clickOnChangePasswordlink() throws Exception
	{
		System.out.println("step 9 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.ClickOnChangePwd();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on change password Link \n");
		Reporter.log("<p>Successfully Clicked on change password Link");
		System.out.println("step 9 end");
	}


	//Enter new Value in password field.
	@Test(priority=10,description="step 10:Enter new Value in  password field ")
	public void step10_enterValueInPasswordField() throws Exception
	{
		System.out.println("step 10 begin");
		ChangePassword cpw = new ChangePassword(driver);
		cpw.EnterPwd();
		log.info("Successfully entered new  password in  password field \n");
		Reporter.log("<p>Successfully entered new password in  password field");
		System.out.println("step 10 end");
	}

	//Enter new Value in re-type password field.
	@Test(priority=11,description="step 11:Enter new Value in re-type password field. ")
	public void step11_EnterValueInReTypePasswordField() throws Exception
	{
		System.out.println("step 11 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.EnterReTypeCorrectPwd();
		log.info("Successfully entered new value  in re type Password field \n");
		Reporter.log("<p>Successfully entered new value  in re type Password field");
		System.out.println("step 11 end");
	}

	//click on Change Save Button
	@Test(priority=12,description="step 12:click on save Button ")
	public void step12_ClickOnSaveButton() throws Exception 
	{
		System.out.println("step 12 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.ClickOnSave();
		log.info("Successfully Clicked on save Button \n");
		Reporter.log("<p>Successfully Clicked on save Button");
		System.out.println("step 12 end");
	}

	//Verify the Success Message 
	@Test(priority=13,description="step 13:Verify the Success Message")
	public void step13_VerifySuccesssMessage() throws Exception
	{
		System.out.println("step 13 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.PasswordSucess();
		log.info("Successfully verified success message \n");
		Reporter.log("<p>Successfully verified success message");
		System.out.println("step 13 end");
	}



}
