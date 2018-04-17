/*Author:Sravani
Objective:Navigate to PI page->Click on change your Password link-Enter password into password field->
Enter diff password in Re-type password field->Click on save button
->Verify the error message
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

public class PIP_TC_27 extends BaseTest
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
		GUIFunctions.normalWait();
		System.out.println("step 8 begin");
		PersonalInformationPage PIP= new PersonalInformationPage(driver);
		PIP.ClickOnChangePwd();
		log.info("Successfully clicked on change password link \n");
		Reporter.log("<p>Successfully Clicked on change password link");
		System.out.println("step 8 end");
	}

	//Enter Value in  password field.
	@Test(priority=9,description="step 9:Enter Value in  password field ")
	public void step09_enterValueInPasswordField() throws Exception
	{
		System.out.println("step 9 begin");
		ChangePassword cpw = new ChangePassword(driver);
		cpw.EnterPwd();
		log.info("Successfully entered password in password Field \n");
		Reporter.log("<p>Successfully entered password in password Field");
		System.out.println("step 9 end");
	}

	//Enter Value in re-type password field.
	@Test(priority=10,description="step 10:Enter Value in re-type password field. ")
	public void step10_enterValueInReTypePasswordField() throws Exception
	{
		System.out.println("step 10 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.EnterReTypePwd();
		log.info("Successfully entered password in retype password Field \n");
		Reporter.log("<p>Successfully entered in retype password field");
		System.out.println("step 10 end");
	}

	//click on  Save Button
	@Test(priority=11,description="step 11:click on save Button ")
	public void step11_ClickOnSaveButton() throws Exception
	{
		System.out.println("step 11 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.ClickOnSave();
		log.info("Successfully Clicked on save Button \n");
		Reporter.log("<p>Successfully Clicked on save Button");
		System.out.println("step 11 end");
	}

	//verify Error Message
	@Test(priority=12,description="step 12:verify Error Message ")
	public void step12_VerifyErrorMessage() throws Exception 
	{
		System.out.println("step 12 begin");
		ChangePassword cp=new ChangePassword(driver);
		cp.VerifyPwdMisssMatchError();
		log.info("Successfully verifed error message \n");
		Reporter.log("<p>Successfully verifed error message");
		System.out.println("step 12 end");
	}

}
