//Author:Manjula
//Enter all mandatory details except zip code & state->select Country as US/Canada->Click on submit button->verify the error message

package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.CatalogRequest;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class CAR_TC_15 extends BaseTest
{
	static  HomePage homePage ;
	@Test(priority =1, description = "step 1:  Open browser,Navigate to the RS URL")
	public void step01_HOMEPAGE_URL() throws Exception 
	{
		System.out.println("step 1 begin");
		// Navigates to RS application URL
		homePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}

	// click on close button for sign in pop up window
	@Test(priority =2,description = "step 2:  clicking on close button for sign in pop up window")
	public void step02_ClickingOnClose() throws Exception 
	{ 
		System.out.println("step 2 begin");
		HomePage hop =new HomePage(driver);
		hop.ClickOnModal() ;
		log.info("Successfully clicked on close button for sign in pop up window");
		Reporter.log("<p>Successfully clicked on close button for sign in pop up window");
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
		log.info("Successfully clicked on catalog request link from header \n");
		Reporter.log("<p> Successfully clicked on catalog request link from header");
		System.out.println("step 3 end");
	}

	//select the country USA from Country drop down
	@Test(priority =4,description = "step 4:  select country as USA ")
	public void step04_SelectCountry() throws Exception 
	{
		System.out.println("step 4 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.SelectUSFromDropDown();
		log.info("Successfully selected country");
		Reporter.log("<p> Successfully selected country");
		GUIFunctions.normalWait();
		System.out.println("step 4 end");
	}

	//select the north america radio button
	@Test(priority =5,description = "step 5:  Select north america radio button under SELECT CATALOGS YOU WOULD LIKE section")
	public void step05_clickOnRadioBtn() throws Exception 
	{
		System.out.println("step 5 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.SelectNorthAmericaRadiobtn();
		log.info("Successfully selected the noth america radio button from country drop down\n");
		Reporter.log("<p> Successfully selected the noth america radio button from country drop down");
		GUIFunctions.normalWait();
		System.out.println("step 5 end");
	}

	//enter the text into the first name text field
	@Test(priority =6,description = "step 6:  Enter the text into the first name text field")
	public void step06_EnterValueFirstName() throws Exception 
	{
		System.out.println("step 6 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.enterTextIntoFirstNameField();
		log.info("Successfully entered text into first name text field\n");
		Reporter.log("<p> Successfully entered text into first name text field");
		GUIFunctions.normalWait();
		System.out.println("step 6 end");
	}

	//enter the text into the last name field
	@Test(priority =7,description = "step 7:  Enter the text into the last name text field")
	public void step07_enterValueLastName() throws Exception 
	{
		System.out.println("step 7 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.enterTextIntoLastNameField();
		log.info("Successfully entered text into last name text field/n");
		Reporter.log("<p> Successfully entered text into last name text field");
		GUIFunctions.normalWait();
		System.out.println("step 7 end");
	}

	//enter the text into the address field
	@Test(priority =8,description = "step 8:  Enter the text into the Address  text field")
	public void step08_enterValueAddress() throws Exception 
	{
		System.out.println("step 8 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.enterTextIntoAddressField();
		log.info("Successfully entered text into Address text field\n");
		Reporter.log("<p> Successfully entered text into Address text field");
		GUIFunctions.normalWait();
		System.out.println("step 8 end");
	}

	//enter the text into the city field
	@Test(priority =9,description = "step 9:  Enter the text into the City text field")
	public void step09_enterCity() throws Exception 
	{
		System.out.println("step 9 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.enterTextIntoCityField();
		log.info("Successfully entered text into City text field \n");
		Reporter.log("<p> Successfully entered text into City text field");
		GUIFunctions.normalWait();
		System.out.println("step 9 end");
	}

	//enter the value into the phone number field
	@Test(priority =10,description = "step 10:  Enter the value into the phone number text field")
	public void step10_enterPhoneNumber() throws Exception 
	{
		System.out.println("step 10 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.enterTextIntoPhoneNumberField();
		log.info("Successfully entered value into phone number text field \n");
		Reporter.log("<p> Successfully entered value into phone number text field");
		GUIFunctions.normalWait();
		System.out.println("step 10 end");
	}

	//enter the text into the email address field
	@Test(priority =11,description = "step 11:  Enter the text into the Email Address text field")
	public void step11_enterEmailAddress() throws Exception 
	{
		System.out.println("step 11 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.enterTextIntoEmailAddressField();
		log.info("Successfully entered text into Email Address text field \n");
		Reporter.log("<p> Successfully entered text into Email Address text field");
		GUIFunctions.normalWait();
		System.out.println("step 11 end");
	}

	//Click on submit button 
	@Test(priority =12,description= "step 12:  Click on submit button")
	public void step12_clickOnSubmitBtn() throws InterruptedException
	{
		System.out.println("step 12 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.ClickOnSubmitBtn();
		log.info("Successfully clicked on submit button \n");
		Reporter.log("<p> Successfully clicked on submit button");
		System.out.println("step 12 end");
	}

	//verify error message
	@Test(priority =13,description= "step 13: Verify the error message")
	public void step13_VerifyError() throws Exception
	{
		System.out.println("step 13 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.verifyError();
		log.info("Successfully Verified error message i.e.Error Please enter valid information \n");
		Reporter.log("<p> Successfully Verified error message i.e.Error Please enter valid information");
		System.out.println("step 13 end");
	}

	//select the country Canada from Country drop down
	@Test(priority =14,description = "step 14:  select country as Canada from country drop down")
	public void step14_SelectCountryCanada() throws Exception 
	{
		System.out.println("step 14 begin");
		CatalogRequest car =new CatalogRequest(driver);
		car.SelectCanadaFromDropDown();
		log.info("Successfully selected Canada from country drop down \n");
		Reporter.log("<p> Successfully selected Canada from country drop down");
		GUIFunctions.normalWait();
		System.out.println("step 14 end");
	}

	//Click on submit button 
	@Test(priority =15,description= "step 15:  Click on submit button")
	public void step15_clickOnSubmitBtn() throws InterruptedException
	{
		System.out.println("step 15 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.ClickOnSubmitBtn();
		log.info("Successfully clicked on submit button \n");
		Reporter.log("<p> Successfully clicked on submit button");
		System.out.println("step 15 end");
	}

	//verify error message
	@Test(priority =16,description= "step 16: Verify the error message")
	public void step14_VerifyError() throws Exception
	{
		System.out.println("step 16 begin");
		CatalogRequest car=new CatalogRequest(driver);
		car.verifyError();
		log.info("Successfully Verified error message i.e.Error Please enter valid information");
		Reporter.log("<p> Successfully Verified error message i.e.Error Please enter valid information");
		System.out.println("step 16 end");
	}


}
