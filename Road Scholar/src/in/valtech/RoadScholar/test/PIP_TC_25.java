/*Author:Sravani
Objectives:Navigate to PI page->Click on Add a house hold member->
Click on add a household member button->Verify the error message displayed->
Enter all the mandatory fields->Click on add a household member button->
Verify the success message->Verify whether the user has been created
 */

package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.PersonalInformationPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class PIP_TC_25 extends BaseTest 
{
	
	//Click on personal Information link
	@Test(priority=7,description="step 7:Click on Personal Information link")
	public void step07_ClickOnPersonalInformationLink() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePage hop=new HomePage(driver);
		hop.clickOnPIP();
		log.info("Successfully clicked on Personal Information link \n");
		Reporter.log("<p>Successfully Clicked on personal information link");
		System.out.println("step 7 end");
	}

	//Click on Add A House Hold member Button from PI page
	@Test(priority=8,description="step 8:Click on Add A House Hold member Button from PI page")
	public void step08_ClickOnAddAHouseHoldMemberBtn() throws Exception
	{
		System.out.println("step 8 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.ClickOnAddHouseHolder();
		log.info("Successfully Clicked on add a house hold member button from PI page \n");
		Reporter.log("<p>Successfully Clicked on add a house hold member button from PI page");
		System.out.println("step 8 end");
	}

	//Clcik on add a household member
	@Test(priority=9,description="step 9:Clcik on add a household member")
	public void step09_AddHouseHolder() throws Exception {
		System.out.println("step 9 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.ClickOnAddHouse();
		log.info("Successfully Clicked on add householder Button \n");
		Reporter.log("<p>Successfully Clicked on add householder Button");
		System.out.println("step 9 end");
	}

	//Verify Error message
	@Test(priority=10,description="step 10:Verify Error message")
	public void step10_Error() throws Exception 
	{
		System.out.println("step 10 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.verifyHouseHoldError();
		log.info("Successfully verified error message \n");
		Reporter.log("<p>Successfully verified error message");
		System.out.println("step 10 end");	
	}

	//enter value in first name field
	@Test(priority=11,description="step 11:enter value into first name field ")
	public void step11_FirstNameField() throws Exception
	{
		System.out.println("step 11 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.FirstName();
		log.info("Successfully entered first name in FN field \n");
		Reporter.log("<p>Successfully entered first name in FN field");
		System.out.println("step 11 end");
	}

	//enter value in Last  name field
	@Test(priority=12,description="step 12:enter value in Last name field ")
	public void step12_LastNameField() throws Exception 
	{
		System.out.println("step 12 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.LastName();
		log.info("Successfully entered value in last name field \n");
		Reporter.log("<p>Successfully entered value in last name field");
		System.out.println("step 12 end");
	}

	//select value from month dropdown
	@Test(priority=13,description="step 13: select value from month dropdown")
	public void step13_SelectValueFromMonthDropdown() throws Exception 
	{
		System.out.println("step 13 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.Month();
		log.info("Successfully selected value from month dropdown \n");
		Reporter.log("<p>Successfully selected value from month dropdown");
		System.out.println("step 13 end");
	}

	//select value from day dropdown
	@Test(priority=14,description="step 14:select value from day dropdown")
	public void step14_SelectDayFromDropdown() throws Exception 
	{
		System.out.println("step 14 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.Day();
		log.info("Successfully selected value from day dropdown \n");
		Reporter.log("<p>Successfully selected value from day dropdown");
		System.out.println("step 14 end");			
	}

	//select value from month dropdown
	@Test(priority=15,description="step 15:select value from year dropdown")
	public void step15_SelectYearFromDropdown() throws Exception 
	{
		System.out.println("step 15 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.Year();
		log.info("Successfully selected value from year dropdown  \n");
		Reporter.log("<p>Successfully selected value from year dropdown");
		System.out.println("step 15 end");
	}

	//Clcik on add a household member button
	@Test(priority=16,description="step 16:Clcik on add a household member button")
	public void step16_AddHouseHolder() throws Exception {
		System.out.println("step 16 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.ClickOnAddHouse();
		log.info("Successfully Clciked on add a household member button \n");
		Reporter.log("<p>Successfully Clciked on add a household member button");
		System.out.println("step 16 end");
	}

	//Verify Success message
	@Test(priority=17,description="step 17:Verify Success message")
	public void step15_VerifySuccessMessage() throws Exception {
		System.out.println("step 17 begin");
		PersonalInformationPage pip= new PersonalInformationPage(driver);
		pip.verifySucessHouseHoldMem();
		log.info("Successfully verified success message  \n");
		Reporter.log("<p>Successfully verified success message");
		System.out.println("step 17 end");
	}
}

