/* @Author: Anupriya
 * 
 * Click on my account link from header->click on new customer link->
 * enter values into all the fields->
 * click on create an Account button->Verify whether user has been created 
 */

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.CreateAccount;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;


import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HOP_TC_04 extends BaseTest{

	CustomFunction custom;



	@Test(priority=1 ,description = "Step 1:  Open browser,Navigate to the RS URL")

	public void step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");

		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);

		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");

	}

	@Test(priority=2,description = "Step 2:  Click on PopUp's close icon ")
	public void step02_Close_PopUp() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage =new HomePage(driver);
		homePage.ClickOnModal();
		log.info("Successfully closed popup \n");
		Reporter.log("<p>Successfully closed popup");
		System.out.println("step 2 end");

	}

	@Test(priority=3,  description = "Step 3:  Click on  MyAccount Link")
	public void step03_ClickOnMyAccountLink() throws Exception {
		System.out.println("step 3 begin");
		HomePage homePage =new HomePage(driver);
		homePage.ClickOnMyAccountLink();
		log.info("Successfully Click on  MyAccount Link \n");
		Reporter.log("<p>Successfully Click on  MyAccount Link");
		System.out.println("step 3 end");
	}
	@Test(priority=4,description = "Step 4:  Click on  start here Link")
	public void step04_ClickOnStartHereLink() throws Exception {
		System.out.println("step 4 begin");
		HomePage homePage =new HomePage(driver);
		homePage.ClickOnStartHereLink();
		log.info("Successfully Navigate To CreateAccount \n");
		Reporter.log("<p>Successfully Navigate To CreateAccount");
		System.out.println("step 4 end");
	}

	@Test(priority=5,description = "Step 5:  Enter value in FirstName Textbox")
	public void step05_EnterValueIntoFirstNameTextBox() throws Exception {
		System.out.println("step 5 begin");

		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.EnterValueIntoFirstNameTextBox();
		log.info("Successfully Entered Value Into FirstName TextBox \n");
		Reporter.log("<p>Successfully Entered Value Into FirstName TextBox");
		System.out.println("step 5 end");

	}
	@Test(priority=6,description = "Step 6:  Enter value in LastName Textbox")
	public void step06_EnterValueIntoLastNameTextBox() throws Exception {
		System.out.println("step 6 begin");
		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.EnterValueIntolastNameTextBox();
		log.info("Successfully Entered Value Into LastNamee TextBox \n");
		Reporter.log("<p>Successfully Entered Value Into  LastName TextBox");
		System.out.println("step 6 end");

	}
	@Test(priority=7,description = "Step 7:  Enter value in Email Textbox")
	public void step07_EnterValueIntoEmailTextBox() throws Exception {
		System.out.println("step 7 begin");
		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.EnterValueIntoEmailTextBox();
		log.info("Successfully Entered Value Into EmailTextBox \n");
		Reporter.log("<p>Successfully Entered Value Into EmailTextBox");
		System.out.println("step 7 end");

	}

	@Test(priority=8,description = "Step 8:  Enter value in Password Textbox")
	public void step08_EnterValueIntoPasswordTextBox() throws Exception {
		System.out.println("step 8 begin");
		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.EnterValueIntoPasswordTextBox();
		log.info("Successfully Entered Value Into Password \n");
		Reporter.log("<p>Successfully Entered Value Into Password TextBox");
		System.out.println("step 8 end");

	}
	@Test(priority=9,description = "Step 9:  Enter value in confirm  Password Textbox")
	public void step09_EnterValueIntoConfirmPasswordTextBox() throws Exception {
		System.out.println("step 9 begin");
		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.EnterValueIntoConfirmPasswordTextBox();
		log.info("Successfully Entered Value Int oconfirm  Password Textbox \n");
		Reporter.log("<p>Successfully Entered Value Into confirm  Password Textbox");
		System.out.println("step 9 end");

	}
	@Test(priority=10,description = "Step 10:  Click on Create Button ")
	public void step10_ClickOnCreateButton() throws Exception {
		System.out.println("step 10 begin");
		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.clickOnSubmitBtn();
		log.info("Successfully Clicked on Create Button\n");
		Reporter.log("<p>Successfully Clicked on Create Button");
		System.out.println("step 10 end");

	}
	@Test(priority=11,description = "Step 11:  Click on Thank you close Button ")
	public void step11_ClickOnThankyoucloseButton() throws Exception {
		System.out.println("step 11 begin");
		CreateAccount createAccount= new CreateAccount(driver);
		createAccount.clickOnCloseIcon();
		log.info("Successfully Clicked on Thank you close Button\n");
		Reporter.log("<p>Successfully Clicked on Thank you close Button");
		System.out.println("step 11 end");

	}
	@Test(priority=12,description = "Step 12:  VerifyLogedInUser ")
	public void step12_VerifyLogedInUser() throws Exception {
		System.out.println("step 12 begin");
		GUIFunctions.normalWait();
		HomePage Hop= new HomePage(driver);
		GUIFunctions.normalWait();
		Hop.verifyLogedInUser();
		log.info("Successfully  VerifyLogedInUser\n");
		Reporter.log("<p>Successfully VerifyLogedInUser");
		System.out.println("step 12 end");

	}
}

