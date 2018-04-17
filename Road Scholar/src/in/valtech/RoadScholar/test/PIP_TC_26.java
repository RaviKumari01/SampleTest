/*Author:Sravani
Objective:Navigate to PI page->Click on change your password link->Click on save button->
Verify the error message->Click on back button->Verify the page title
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

public class PIP_TC_26 extends BaseTest
{

	

	//Click on personal Information Page
	@Test(priority=7,description="Step 7:Click on Personal Information link")
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
		GUIFunctions.normalWait();
		System.out.println("step 8 begin");
		PersonalInformationPage PIP= new PersonalInformationPage(driver);
		PIP.ClickOnChangePwd();
		log.info("Successfully clicked on change password link \n");
		Reporter.log("<p>Successfully Clicked on change password link");
		System.out.println("step 8 end");
	}

	//click on Change Save Button
	@Test(priority=9,description="step 9:click on save Button ")
	public void step09_clickOnSaveButton() throws Exception
	{
		System.out.println("step 9 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.ClickOnSave();
		log.info("Successfully Clicked on save button \n");
		Reporter.log("<p>Successfully Clicked on save button");
		System.out.println("step 9 end");
	}

	//Verify Error Message
	@Test(priority=10,description="step 10:Verify Error Message")
	public void step10_verifyErrorMessage() throws Exception 
	{
		System.out.println("step 10 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.VerifyErrorMsg();
		log.info("Successfully verified error message \n");
		Reporter.log("<p>Successfully verified error message");
		System.out.println("step 10 end");
	}

	//navigate Back and verify page

	@Test(priority=11,description="step 11:navigate Back and verify page")
	public void step11_navigateBackAndVerifyPage() throws Exception 
	{
		System.out.println("step 11 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.NavigateBack();
		log.info("Successfully naviagated back and Verified the page \n");
		Reporter.log("<p>Successfully naviagated back and Verified the page");
		System.out.println("step 11 end");
	}
}
