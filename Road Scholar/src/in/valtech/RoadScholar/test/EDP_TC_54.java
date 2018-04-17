/*Author:Sukrity


Objectives:Mouse hover on my account->Click on edit profile link->Verify the page title->Verify the 
profile picture displayed->Click on remove btn->Verify the text displayed->verify the image (profile pic) 
again->Clcik on save btn->Verify the success message

 */
package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.EditProfile;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EDP_TC_54 extends BaseTest {

	@Test(description = "Step 1:  Click on MyAccount Link after login ")
	public void Step01_AfterLogInMyAccountLink() throws Exception {
		System.out.println("step 1 begin");
		HomePage homePage = new HomePage(driver);
		homePage.AfterLogInclickOnMyAccountLink();
		log.info("Successfully Clicked on MyAccount Link after login \n");
		Reporter.log("<p>Successfully Clicked on MyAccount Link after login");
		System.out.println("step 1 end");
	}

	@Test(description = "Step 2:  Click on Edit Profile Link ")
	public void Step02_ClickOnEditProfileLink() throws Exception {
		System.out.println("step 2 begin");
		HomePage homePage = new HomePage(driver);
		homePage.ClickOnEditProfileLink();
		log.info("Successfully Clicked on Edit Profile Link \n");
		Reporter.log("<p>Successfully Clicked on Edit Profile Link");
		System.out.println("step 2 end");
	}

	@Test(description = "Step 3:  Verify EditProfile page title")
	public void Step03_VerifyEditProfilePageTitle() throws Exception {
		System.out.println("step 3 begin");
		EditProfile edp = new EditProfile(driver);
		edp.verifyEditProfilePageTitle();
		log.info("Successfully EditProfile page title is Verified \n");
		Reporter.log("<p>Successfully EditProfile page title is Verified ");
		System.out.println("step 3 end");
	}

	@Test(description = "Step 4:  Verify EditProfile Image")
	public void Step04_VerifyEditProfileImage() throws Exception {
		System.out.println("step 4 begin");
		EditProfile edp = new EditProfile(driver);
		edp.verifyEditProfileImage();
		log.info("Successfully EditProfile Image is Verified \n");
		Reporter.log("<p>Successfully EditProfile Image is Verified ");
		System.out.println("step 4 end");
	}

	@Test(description = "Step 5:  Click on Remove Link ")
	public void Step05_ClickOnRemoveLink() throws Exception {
		System.out.println("step 5 begin");
		EditProfile edp = new EditProfile(driver);
		edp.ClickOnRemoveLink();
		log.info("Successfully Clicked on Remove Link \n");
		Reporter.log("<p>Successfully Clicked on Remove Link");
		System.out.println("step 5 end");
	}

	@Test(description = "Step 6:  Verify EditProfile's By default Image")
	public void Step06_VerifyEditProfileDefaultImage() throws Exception {
		System.out.println("step 6 begin");
		EditProfile edp = new EditProfile(driver);
		edp.verifyEditProfileDefaultImage();
		log.info("Successfully EditProfile's By default Image is Verified \n");
		Reporter.log("<p>Successfully EditProfile's By default Image is Verified ");
		System.out.println("step 6 end");
	}

	@Test(description = "Step 7: Click on Save Btn")
	public void Step07_ClickOnSaveButton() throws InterruptedException {
		System.out.println("step 7 begin");
		EditProfile edp = new EditProfile(driver);
		edp.ClickOnSaveButton();
		log.info("Successfully Clicked on Save Btn \n");
		Reporter.log("<p>Successfully Clicked on Save Btn");
		System.out.println("step 7 end");
	}

	@Test(description = "Step 8:  Verify EditProfile success message")
	public void Step08_VerifyEditProfileSuccessMessage() throws Exception {
		System.out.println("step 8 begin");
		EditProfile edp = new EditProfile(driver);
		edp.verifyEditProfileSuccessMessage();
		log.info("Successfully EditProfile success message is Verified \n");
		Reporter.log("<p>Successfully EditProfile success message is Verified ");
		System.out.println("step 8 end");
	}
}
