//Author:Manjula
//Verify the fields displayed under "contact information" verify 
//the length of the each field->Enter special character and 
//click on submit button and verify the error message

package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CatalogRequest;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CAR_TC_14 extends BaseTest
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

	// click on close button for sign in pop up window
	@Test(priority =2,description = "Step 2:  clicking on close button for sign in pop up window")
	public void Step02_ClickingOnClose() throws Exception 
	{ 
		System.out.println("step 2 begin");
		HomePage hop =new HomePage(driver);
		hop.ClickOnModal() ;
		log.info("Successdully clicked on close button for sign in pop up window");
		Reporter.log("<p>Successdully clicked on close button for sign in pop up window");
		System.out.println("step 2 end");
	}

	//click on catalog Request link from header
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

	//Verify the maximum length of First Name text field
	@Test(priority =4,description = "Step 4:  Verifying the maximum length of first name field")
	public void step04_VerifyTheMaximumLengthOfFirstNameTextField() throws Exception 
	{   
		System.out.println("step 4 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.FirstNameLength();
		log.info("Successdully Verified the maximum length of First Name text Field \n");
		Reporter.log("<p> Successdully Verified the maximum length of First Name text Field ");
		System.out.println("step 4 end");
		GUIFunctions.normalWait();
	}

	//Verify the maximum length of Last Name text field
	@Test(priority =5,description = "Step 5:  Verifying the maximum length of last name field")
	public void step04_VerifyTheMaximumLengthOfLastNameTextField() throws Exception 
	{  
		System.out.println("step 5 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.LastNameLength();
		log.info("Successdully Verified the maximum length of Last Name text Field \n");
		Reporter.log("<p> Successdully Verified the maximum length of Last Name text Field ");
		System.out.println("step 5 end");
		GUIFunctions.normalWait();
	}

	//Verify the maximum length of Address text field
	@Test(priority =6,description = "Step 6:  Verifying the maximum length of Address text field")
	public void step06_VerifyTheMaximumLengthOfAddresstextField() throws Exception 
	{  
		System.out.println("step 6 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.AddressFieldLength();
		log.info("Successdully Verified the maximum length of Address  text Fiel\n");
		Reporter.log("<p> Successdully Verified the maximum length of Address  text Field ");
		System.out.println("step 6 end");
		GUIFunctions.normalWait();
	}

	//Verify the maximum length of City text field
	@Test(priority =7,description = "Step 7:  Verifying the maximum length of City text field")
	public void step07_VerifyTheMaximumLengthOfCitytextField() throws Exception 
	{ 
		System.out.println("step 7 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.CityFieldLength();
		log.info("Successdully Verified the maximum length of City text Field \n");
		Reporter.log("<p> Successdully Verified the maximum length of City text Field ");
		System.out.println("step 7 end");
		GUIFunctions.normalWait();
	}

	//Verify the maximum length of PhoneNumber field
	@Test(priority =8,description = "Step 8:  Verifying the maximum length of PhoneNumber field")
	public void step08_VerifyTheMaximumLengthOfPhoneNumberField() throws Exception 
	{   
		System.out.println("step 8 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.PhoneNumberFieldLength();
		log.info("Successdully Verified the maximum length of PhoneNumber Field \n");
		Reporter.log("<p> Successdully Verified the maximum length of PhoneNumber Field ");
		System.out.println("step 8 end");
		GUIFunctions.normalWait();
	}

	//Verify the maximum length of Zipcode field
	@Test(priority =9,description = "Step 9:  Verifying the maximum length of Zipcode field")
	public void step09_VerifyTheMaximumLengthOfZipcodeField() throws Exception 
	{ 
		System.out.println("step 9 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.ZipcodeLength();
		log.info("Successdully Verified the maximum length of Zipcode Field \n");
		Reporter.log("<p> Successdully Verified the maximum length of Zipcode Field ");
		System.out.println("step 9 end");
		GUIFunctions.normalWait();
	}

	//Verify the maximum length of EmailAddress field
	@Test(priority =10,description = "Step 10:  Verifying the maximum length of EmailAddress field")
	public void step10_VerifyTheMaximumLengthOfEmailAddressField() throws Exception 
	{  
		System.out.println("step 10 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.EmailAddressFieldLength();
		log.info("Successdully Verified the maximum length of EmailAddress Field \n");
		Reporter.log("<p> Successdully Verified the maximum length of EmailAddress Field ");
		System.out.println("step 10 end");
		GUIFunctions.normalWait();
	}

	//Enter the special character into all fields and click on submit button
	@Test(priority =11,description = "Step 11:  Enter the Spl Character in First Name field")
	public void step11_EnterSplCharacterIntoFields() throws Exception 
	{  
		System.out.println("step 11 begin");
		CatalogRequest car = new CatalogRequest(driver);
		car.enterSplCharacter(); 
		log.info("Successdully entered Spl character into first name text field\n");
		Reporter.log("<p> Successdully entered Spl character into first name text field ");
		System.out.println("step 11 end");
		GUIFunctions.normalWait();
	}

	//Click on Submit button
	@Test(priority =12,description= "Step 12: Click on submit button")
	public void step12_clickOnSubmitBtn() throws InterruptedException
	{
		System.out.println("step 12 end");
		CatalogRequest car=new CatalogRequest(driver);
		car.ClickOnSubmitBtn();
		log.info("Successfully clicked on submit button\n");
		Reporter.log("<p> Successfully clicked on submit button ");
		System.out.println("step 12 end");
	}

	//Verify the error message
	@Test(priority =13,description= "Step 13: Verify the error message")
	public void step13_VerifyError() throws Exception
	{
		System.out.println("step 13 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.VerifyError();
		log.info("Successdully Verified error message i.e.Please review and fix the highlighted fields\n");
		Reporter.log("<p> Successdully Verified error message i.e.Please review and fix the highlighted fields ");
		System.out.println("step 13 end");
	}


}

