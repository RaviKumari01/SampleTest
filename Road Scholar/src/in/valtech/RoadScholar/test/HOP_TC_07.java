
/*Author:Sravani
Objectives:Click on sign in button from promo block->Verify the error ->Enter valid id ->Click on sign up button->Verify the thank you text in pop up->click on close button->Verify promo block text



 */

package in.valtech.RoadScholar.test;

import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HOP_TC_07 extends BaseTest
{
	static  HomePage homePage ;
	//Open browser,Navigate to the RS URL
	@Test(priority=1, description = "step 1: Open browser,Navigate to the RS URL")
	public void step01_HomePage_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);	
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	//Close Singup PopUp
	@Test(priority=2,description = "step 2: Close Singup PopUp")
	public void step02_closeSinUpPopUp() throws Exception 
	{
		System.out.println("step 2 begin");	
		GUIFunctions.normalWait();
		HomePage hop = new HomePage(driver);
		hop.ClickOnModal();
		log.info("Successfully clicked on close Button \n");
		Reporter.log("<p>Successfully clicked on close Button");
		System.out.println("step 2 end");
	}

	//Verify Error Message from promo block
	@Test(priority=3,description ="step 3:Verify Error Message from promo block")
	public void step03_verifyErrorMessageFromPromoBlock() throws Exception 
	{
		System.out.println("step 3 Begin");
		HomePage hop= new HomePage(driver);
		hop.VerifyErrorInPromoBlock();
		log.info("Successfully verified Error Message from promo block \n");
		Reporter.log("<p>Successfully verified Error Message from promo block");
		System.out.println("step 3 End");
	}

	//Verify Sucess Message from promo block
	@Test(priority=4,description ="step 4:Verify Sucess Message from promo block")
	public void step04_verifySuccessMessageFrompromoBlock() throws Exception
	{
		System.out.println("step 4 Begin");
		HomePage hop= new HomePage(driver);
		hop.CheckPromoBlockText();
		log.info("Successfully verified the Success message from promo block \n");
		Reporter.log("<p>Successfully verified the Success message from promo block");
		System.out.println("step 4 End");
	}

}
