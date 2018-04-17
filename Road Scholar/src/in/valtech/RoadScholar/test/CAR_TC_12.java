/*Author:Manjula
Objectives:Verify all the components of the catalog request page

*/


package in.valtech.RoadScholar.test;


	import in.valtech.RoadScholar.pages.CatalogRequest;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

	import org.testng.Reporter;
import org.testng.annotations.Test;


		public class CAR_TC_12 extends BaseTest
		{
			static  HomePage homePage ;
			
			@Test(priority =1, description = "Step 1:  Open browser,Navigate to the RS URL")
			
			public void Step01_HOMEPAGE_URL() throws Exception 
			{
				System.out.println("step 1 begin");
				
				// Navigates to RS application URL
				homePage.navigateToApplication_URL(driver, homePageUrl,driver_Name);
				
				log.info("Successfully navigated to application URL \n");
				Reporter.log("<p>Successfully navigated to application URL");
				System.out.println("step 1 end");

			}
			@Test(priority =2,description = "Step 2:  clicking on close button")
			public void Step02_ClickingOnCLOSE() throws Exception 
			{   
				System.out.println("step 2 begin");
				HomePage hop =new HomePage(driver);
			    hop.ClickOnModal() ;
				log.info("Successdully clicked on close button");
				System.out.println("step 2 end");
				GUIFunctions.normalWait();
			}
			@Test(priority =3,description = "Step 3:  CLICK ON CATALOG REQUEST BUTTON")
			public void Step3_clickOnCatalogRequest() throws Exception 
			{
				System.out.println("step 3 begin");
				HomePage car =new HomePage(driver);
				car.clickOnCatalogRequest();
				log.info("Successdully clicked on catalog request page button");
				GUIFunctions.normalWait();
				System.out.println("step 3 end");
			}
			@Test(priority =4, description = "Step 4:  verifying Title")
			public void Step4_VerifyTitle() throws Exception 
			{   
				System.out.println("step 4 begin");
				CatalogRequest car =new CatalogRequest(driver);
			  
			    car.title();
			    log.info("Verified title");
			    System.out.println("step 4 end");
			}
			@Test(priority =5, description = "Step 5:  verifying sign in")
			public void Step5_VerifySignIn() throws Exception 
			{   
				System.out.println("step 5 begin");
				CatalogRequest car =new CatalogRequest(driver);
			 
			    car.signIn();
			    log.info("Verified sign in");
			    System.out.println("step 5 end");
				
			}
			@Test(priority =6, description = "Step 6:  verifying subtext")
			public void Step6_Verifysubtext() throws Exception 
			{   
				System.out.println("step 6 begin");
				CatalogRequest car =new CatalogRequest(driver);
			  
			    car.subText();
			    log.info("Verified subtext");
			    System.out.println("step 6 end");
				
			}
			@Test(priority =7, description = "Step 7:  verifying selectCatalogSection")
			public void Step7_VerifyselectCatalogSection() throws Exception 
			{   
				System.out.println("step 7 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.selectCatalogSection();
			    log.info("Verified selectCatalogSection");
			    System.out.println("step 7 end");
				
			}
			@Test(priority =8, description = "Step 8:  verifying northAmerica")
			public void Step8_VerifynorthAmerica() throws Exception 
			{  
				System.out.println("step 8 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.northAmerica();
			    log.info("Verified northAmerica");
			    System.out.println("step 8 end");
				
			}
			@Test(priority =9, description = "Step 9:  verifying AdvantureAfloat")
			public void Step9_VerifyAdvantureAfloat() throws Exception 
			{   
				System.out.println("step 9 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.AdvantureAfloat();
			    log.info("Verified AdvantureAfloat");
			    System.out.println("step 9 end");
				
			}
			@Test(priority =10, description = "Step 10:  verifying International")
			public void Step10_VerifyInternational() throws Exception 
			{   
				System.out.println("step 10 begin");
				CatalogRequest car =new CatalogRequest(driver);
			    
			    car.International();
			    log.info("Verified International"); 
			    System.out.println("step 10 end");
				
			}
			@Test(priority =11, description = "Step 11:  verifying Enteryourcontactinformationsection")
			public void Step11_VerifyEnteryourcontactinformationsection() throws Exception 
			{   
				System.out.println("step 11 begin");
				CatalogRequest car =new CatalogRequest(driver);
			    
			     car.Enteryourcontactinformationsection();
			     log.info("Verified Enteryourcontactinformationsection"); 
			     System.out.println("step 11 end");
				
			}
			@Test(priority =12, description = "Step 12:  verifying FirstName")
			public void Step12_VerifyFirstName() throws Exception 
			{  
				System.out.println("step 12 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.FirstName();
			    log.info("Verified  FirstName");
			    System.out.println("step 12 end");
				
			}
			@Test(priority =13, description = "Step 13:  verifying LastName")
			public void Step13_VerifyLastName() throws Exception 
			{  
				System.out.println("step 13 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.LastName();
			    log.info("Verified  LastName");
			    System.out.println("step 13 end");
				
			}
			@Test(priority =14, description = "Step 14:  verifying AddressField")
			public void Step14_VerifyAddressField() throws Exception 
			{   
				System.out.println("step 14 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.AddressField();
			    log.info("Verified  AddressField");
			    System.out.println("step 14 end");
				
			}
			@Test(priority =15, description = "Step 15:  verifying CityField")
			public void Step15_VerifyCityField() throws Exception 
			{  
				System.out.println("step 15 begin");
				CatalogRequest car =new CatalogRequest(driver);
			    
			    car.CityField();
			    log.info("Verified  CityField");
			    System.out.println("step 15 end");
				
			}
			@Test(priority =16, description = "Step 16:  verifying StateDropDown")
			public void Step16_VerifyStateDropDown() throws Exception 
			{ 
				System.out.println("step 16 begin");
				CatalogRequest car =new CatalogRequest(driver);
			    
	            car.StateDropDown();
	            log.info("Verified  StateDropDown");
	            System.out.println("step 16 end");
				
			}	
			@Test(priority =17, description = "Step 17:  verifying PhoneNumberField")
			public void Step17_VerifyPhoneNumberField() throws Exception 
			{   
				System.out.println("step 17 begin");
				CatalogRequest car =new CatalogRequest(driver);
			   
			    car.PhoneNumberField();
			    log.info("Verified   PhoneNumberField"); 
			    System.out.println("step 17 end");
				
			}	
			@Test(priority =18, description = "Step 18:  verifying EmailAddressField")
			public void Step18_VerifyEmailAddressField() throws Exception 
			{  
				System.out.println("step 18 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			   car.EmailAddressField();
			   log.info("Verified   EmailAddressField"); 
			   System.out.println("step 18 end");
				
			}
			@Test(priority =19, description = "Step 19:  verifying SignMeUpText")
			public void Step19_VerifySignMeUpText() throws Exception 
			{   
				System.out.println("step 19 begin");
				CatalogRequest car =new CatalogRequest(driver);
			   
			    car.SignMeUpText();
			    log.info("Verified   SignMeUpText");
			    System.out.println("step 19 end");
				
			}
			@Test(priority =20, description = "Step 20:  verifying SignMeUpcheckbox")
			public void Step20_VerifySignMeUpCheckBox() throws Exception 
			{   
				System.out.println("step 20 begin");
				CatalogRequest car =new CatalogRequest(driver);
			     
			    car.SignMeUpCheckBox();
			    log.info("Verified   SignMeUpcheckbox");
			    System.out.println("step 20 end");
			}
			@Test(priority =21, description = "Step 21:  verifying SubmitBtn")
			public void Step21_VerifySubmitBtn() throws Exception 
			{  
				System.out.println("step 21 begin");
				CatalogRequest car =new CatalogRequest(driver);
			   
			    car.SubmitBtn();
			    log.info("Verified   SubmitBtn");
			    System.out.println("step 21 end");
			}
	}

