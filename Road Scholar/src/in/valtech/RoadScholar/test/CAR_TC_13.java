/*Author:Manjula
Objectives:Without entering any value click on submit button and verify the error->Select any of the checkbox under "select Catalogs you would like" section->Verify the error displayed


 */

package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CatalogRequest;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CAR_TC_13 extends BaseTest
{
	static  HomePage homePage ;

	@Test(priority =1, description = "Step 1:  Open browser,Navigate to the RS URL")

	public void Step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		// Navigates to RS application URL
		HomePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	//Click on close buttton of sign in up modal
	@Test(priority =2, description = "step 2:Click on close buttton of sign in up modal")
	public void step02_clickingOnCloseModal() throws Exception 
	{   
		System.out.println("step 2 begin");
		HomePage hop =new HomePage(driver);
		hop.ClickOnModal() ;
		log.info("Successdully clicked on close button of sign up modal \n");
		Reporter.log("<p> Successdully clicked on close button of sign up modal");
		System.out.println("step 2 end");
	}

	//click on catalog request link from header
	@Test(priority =3, description = "step 3:  click on catalog request link from header")
	public void step03_clickOnCatalogRequestLink() throws Exception 
	{
		System.out.println("step 3 begin");
		GUIFunctions.normalWait();
		HomePage car =new HomePage(driver);
		car.clickOnCatalogRequest();
		log.info("Successdully clicked on catalog request link from header \n");
		Reporter.log("<p> Successdully clicked on catalog request link from header");
		System.out.println("step 3 end");
	}

	//Click on submit button without entering any value into the text field
	@Test(priority =4,description= "Step 4: Click on submit button without entering any value into the text field")
	public void step04_clickOnSubmitBtn() throws InterruptedException
	{
		System.out.println("step 4 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.ClickOnSubmitBtn();
		log.info("Successfully clicked on submit button without entering any value into the text field \n");
		Reporter.log("<p>Successfully clicked on submit button without entering any value into the text field");
		System.out.println("step 4 end");
	}

	//Verify the error message after clicks on submit button without entering any value into fields
	@Test(priority =5,description= "Step 5: Verify the error message")
	public void step05_verifyError() throws Exception
	{
		System.out.println("step 5 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.VerifyError();
		log.info("Verified error message i.e.Please review and fix the highlighted fields \n");
		Reporter.log("<p>Successfully Verified error message i.e.Please review and fix the highlighted fields");
		System.out.println("Successfully Verified error message i.e.Please review and fix the highlighted fields");
		System.out.println("step 5 end");
	}

	//Select any checkbox under select would you like section
	@Test(priority =6,description= "Step : Select any checkbox under select would you like section")
	public void step06_selectNorthAmericaCheckBox() throws Exception
	{
		System.out.println("step 6 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.SelectNorthAmericaRadioBtn();
		log.info("Successfully clicked on North America ChecK Box under select would you like section \n");
		Reporter.log("<p>Successfully clicked on North America ChecK Box under select would you like section");
		System.out.println("step 6 end");
		driver.navigate().refresh();
	}

	//Click on submit button without entering any value into the text field
	@Test(priority =7,description= "Step 7:  Click on submit button")
	public void step07_clickOnSubmitBtn() throws InterruptedException
	{
		System.out.println("step 7 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.ClickOnSubmitBtn();
		log.info("Successfully clicked on submit button \n");
		Reporter.log("<p>Successfully clicked on submit button");
		System.out.println("step 7 end");
	}

	//verify error message
	@Test(priority =8,description= "Step 8: Verify the error message")
	public void step08_verifyError() throws Exception
	{
		System.out.println("step 8 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.VerifyError();
		log.info("Successfully Verified error message i.e.Please review and fix the highlighted fields \n");
		Reporter.log("<p>Successfully Verified error message i.e.Please review and fix the highlighted fieldsL");
		System.out.println("step 8 end");
	}

}
