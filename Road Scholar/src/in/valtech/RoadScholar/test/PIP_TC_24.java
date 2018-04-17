/*Author:Sravani
Objective:Mouse hover on my account->Click on PI link->verify the page title->
Verify the users name->Edit the already filled fields->Click on save button->
Verify the success message.
 */

package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.PersonalInformationPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;


public class PIP_TC_24 extends BaseTest
{
	
	//Click on personal Information Page
	@Test(priority=7,description="Step 7:Click on Personal Information link")
	public void step07_ClickOnPersonalInformationLink() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePage hop=new HomePage(driver);
		hop.clickOnPIP();
		log.info("Successfully clicked on Personal Information link \n");
		Reporter.log("<p>Successfully Clicked on personal information link");
		System.out.println("step 7 end");
	}

	//verify the user name
	@Test(priority=8,description="Step 8:Verify the user Name in personal information page")
	public void step08_VerifyDefaultUserName() throws Exception 
	{
		System.out.println("step 8 begin");
		PersonalInformationPage pip=new PersonalInformationPage(driver);
		pip.VerifyUsername();
		log.info("Successfully verified user name in Personal Info Page \n");
		Reporter.log("<p>Successfully verified user name in Personal Info Page ");
		System.out.println("step 8 end");
	}

	//Clear Middle Name Field
	@Test(priority=9,description = "Step9: Clear Middle name field")
	public void step09_ClearMiddleNameField() throws Exception 
	{
		System.out.println("step 9 begin");
		PersonalInformationPage pip=new PersonalInformationPage(driver);
		pip.ClearMiddleName();
		log.info("Successfully cleared middle name field \n");
		Reporter.log("<p>Successfully Cleared middle name field");
		System.out.println("step 9 end");
	}

	//enter value in middle name field
	@Test(priority=10,description = "Step 10:enter value in middle name field ")
	public void step10_enteringValueToMiddleNameField() throws Exception
	{
		System.out.println("step 10 begin");
		PersonalInformationPage pip=new PersonalInformationPage(driver);
		pip.EditMiddleName();
		log.info("Successfully entered value in middle name field \n");
		Reporter.log("<p>Successfully entered value in middle name field ");
		System.out.println("step 10 end");
	}

	//Click on save

	@Test(priority=11,description = "Step 11:Click on Save button")
	public void step11_ClcikOnSaveButton() throws Exception 
	{
		System.out.println("step 11 begin");
		PersonalInformationPage pip=new PersonalInformationPage(driver);
		pip.ClickSave();
		log.info("Successfully clicked on Save Button \n");
		Reporter.log("<p>Successfully Clicked on Save Button");
		System.out.println("step 11 end");
	}

	//Verify Success Message
	@Test(priority=12,description = "Step 12: Verify Success Message")
	public void step12_verifySuccessMessage() throws Exception
	{
		System.out.println("step 12 begin");
		PersonalInformationPage pip=new PersonalInformationPage(driver);
		pip.VerifySucessMsg();
		log.info("Successfully Successfully verified success message \n");
		Reporter.log("<p>Successfully verified success message");
		System.out.println("step 12 end");
	}

}
