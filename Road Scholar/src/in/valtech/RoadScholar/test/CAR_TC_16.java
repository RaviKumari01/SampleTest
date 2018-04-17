//Author:Manjula
//


package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.pages.CatalogRequest;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class CAR_TC_16 extends BaseTest{
	
	
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
		
		//Click on close button from sign in pop up 
		@Test(priority =2,description = "Step 2:  clicking on close button")
		public void Step02_ClickingOnCLOSE() throws Exception 
		{ 
			System.out.println("step 2 begin");
			HomePage hop =new HomePage(driver);
			hop.ClickOnModal();
			log.info("Successdully clicked on close button");
			System.out.println("step 2 end");
			GUIFunctions.normalWait();
		}
		
		//click on catalog request button
		@Test(priority =3,description = "Step 3:  CLICK ON CATALOG REQUEST BUTTON")
		public void Step3_clickOnCatalogRequest() throws Exception 
		{
			System.out.println("step 3 begin");
			HomePage hop =new HomePage(driver);
			hop.clickOnCatalogRequest();
			log.info("Successdully clicked on catalog request page button");
			GUIFunctions.normalWait();
			System.out.println("step 3 end");
		}
		
		//select the country from Country drop down
		@Test(priority =4,description = "Step 4:  select country as USA ")
		public void Step4_SelectCountry() throws Exception 
		{
			System.out.println("step 4 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.SelectUSFromDropDown();
			log.info("Successdully selected country");
			GUIFunctions.normalWait();
			System.out.println("step 4 end");
		}
		
		//select the country Canada from Country drop down
		@Test(priority =5,description = "Step 5:  select country as Canada")
		public void Step5_SelectCountryCanada() throws Exception 
		{
			System.out.println("step 5 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.SelectCanadaFromDropDown();
			log.info("Successdully selected country");
			GUIFunctions.normalWait();
			System.out.println("step 5 end");
		}
		
		//select the north america radio button
		@Test(priority =6,description = "Step 6:  Select any radio button under  SELECT CATALOGS YOU WOULD LIKE section Ex:North america")
		public void Step4_clickOnRadioBtn() throws Exception 
		{
			System.out.println("step 6 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.SelectNorthAmericaRadiobtn();
			log.info("Successdully selected the radio button");
			GUIFunctions.normalWait();
			System.out.println("step 6 end");
		}
		
		//enter the text into The first name text field
		@Test(priority =7,description = "Step 7:  Enter the text into the first name text field")
		public void Step7_EnterValueFirstName() throws Exception 
		{
			System.out.println("step 7 begin");
			CatalogRequest car = new CatalogRequest(driver);
			car.enterTextIntoFirstNameField();
			log.info("Successdully entered text into first name text field");
			GUIFunctions.normalWait();
			System.out.println("step 7 end");
		}
		
		//enter the text into the last name field
		@Test(priority =8,description = "Step 8:  Enter the text into the last name text field")
		public void Step8_enterValueLastName() throws Exception 
		{
			System.out.println("step 8 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.enterTextIntoLastNameField();
			log.info("Successdully entered text into last name text field");
			GUIFunctions.normalWait();
			System.out.println("step 8 end");
		}
		
		//enter the text into the address field
		@Test(priority =9,description = "Step 9:  Enter the text into the Address  text field")
		public void Step9_enterValueAddress() throws Exception 
		{
			System.out.println("step 9 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.enterTextIntoAddressField();
			log.info("Successdully entered text into Address text field");
			GUIFunctions.normalWait();
			System.out.println("step 9 end");
		}
		
		//enter the text into the city field
		@Test(priority =10,description = "Step 10:  Enter the text into the City text field")
		public void Step10_enterCity() throws Exception 
		{
			System.out.println("step 10 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.enterTextIntoCityField();
			log.info("Successdully entered text into City text field");
			GUIFunctions.normalWait();
			System.out.println("step 10 end");
		}
		
		//enter the value into the phone number field
		@Test(priority =11,description = "Step 11:  Enter the text into the phone number text field")
		public void Step11_enterPhoneNumber() throws Exception 
		{
			System.out.println("step 11 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.enterTextIntoPhoneNumberField();
			log.info("Successdully entered text into phone number text field");
			GUIFunctions.normalWait();
			System.out.println("step 11 end");
		}
		
		//enter the text into the email address field
		@Test(priority =12,description = "Step 12:  Enter the text into the Email Address text field")
		public void Step12_enterEmailAddress() throws Exception 
		{
			System.out.println("step 12 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.enterTextIntoEmailAddressField();
			log.info("Successdully entered text into Email Address text field");
			GUIFunctions.normalWait();
			System.out.println("step 12 end");
		}
		
		//select the state drop down
		@Test(priority =13,description = "Step 13: select state drop down")
		public void Step13_selectStateDropDown() throws Exception 
		{
			System.out.println("step 13 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.Selectstate();
			log.info("Successfully selected state drop down");
			GUIFunctions.normalWait();
			System.out.println("step 13 end");
		}
		
		//eneter the value into the zip code field
		@Test(priority =14,description = "Step 14: select state drop down")
		public void Step14_eneterValueIntoZipcode() throws Exception 
		{
			System.out.println("step 14 begin");
			CatalogRequest car =new CatalogRequest(driver);
			car.enterValueIntoZipCodeField();
			log.info("Successfully selected state drop down");
		    GUIFunctions.normalWait();
			System.out.println("step 14 end");
				}
		
		
		
		//Click on submit button 
		@Test(priority =15,description= "Step 15:  Click on submit button")
		public void Step15_clickOnSubmitBtn() throws InterruptedException
		{
			System.out.println("step 15 begin");
			CatalogRequest car=new CatalogRequest(driver);
			car.ClickOnSubmitBtn();
			log.info("Successfully clicked on submit button");
			System.out.println("Successfully clicked on submit button");
			System.out.println("step 15 end");
		}
		
		
		
		//Verify the Thank you text
		@Test(priority =16,description= "Step 16: Verifying Thank you text from pop up")
		public void Step16_clickOnSubmitBtn() throws Exception
		{
			System.out.println("step 16 begin");
			CatalogRequest car=new CatalogRequest(driver);
			car.verifyThankYouText();
			log.info("Successfully verified the Thank you text from pop up");
			System.out.println("Successfully verified the Thank you text from pop up");
			System.out.println("step 16 end");
		}
		
		//Click on okay button
		@Test(priority =17,description= "Step 17: click on okay button")
		public void Step17_clickOnOkayBtn() throws InterruptedException
		{
			System.out.println("step 17 begin");
			CatalogRequest car=new CatalogRequest(driver);
			car.clickOnOkayBtn();
			log.info("Successfully clicked on okay button");
			System.out.println("Successfully clicked on okay button");
			System.out.println("step 17 end");
		}
		
	}


