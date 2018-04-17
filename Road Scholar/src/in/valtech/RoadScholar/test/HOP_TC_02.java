/*Author:Sravani
Objectives:Click on the primary navigation tab->Verify the page
 */
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.Community;
import in.valtech.RoadScholar.pages.Destinations;
import in.valtech.RoadScholar.pages.FindAnAdventure;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.PersonalInformationPage;
import in.valtech.RoadScholar.pages.PracticalInformation;
import in.valtech.RoadScholar.pages.RoadScholarExperience;
import in.valtech.RoadScholar.pages.SpecialOffersPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HOP_TC_02 extends BaseTest
{
	static  HomePage homePage ;

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

	//Click on RoadScholar Experience navigation Tab
	@Test(priority =3, description ="step 3:Click on RoadScholar Experience navigation Tab")
	public void step03_clickonRSETab() throws Exception 
	{
		System.out.println("step 3 Begin");
		HomePage hop= new HomePage(driver);
		System.out.println("Click on RoadScholar Experience navigation Tab");
		hop.clickOnRSE();
		GUIFunctions.normalWait();
		log.info("Successfully clicked Road scholar Experience Tab \n");
		Reporter.log("<p>Successfully clicked Road scholar Experience Tab");
		System.out.println("step 3 end");
	}

	//Verify the  RoadScholar Experience navigation page
	@Test(priority =4, description ="step 4:Verify the  RoadScholar Experience navigation page")
	public void step04_verifyRSEPage() throws Exception 
	{
		System.out.println("step 4 Begin");
		RoadScholarExperience RSE= new RoadScholarExperience(driver);
		System.out.println("Verify the  RoadScholar Experience navigation Page");
		RSE.VeirfyPage();
		GUIFunctions.normalWait();
		log.info("Successfully Verified Road scholar Experience Page \n");
		Reporter.log("<p>Successfully verified Road scholar Experience Page");
		System.out.println("step 4 end");
	}

	//Click on Find an An adventure navigation Tab
	@Test(priority =5,description = "step 5:Click on Find an An adventure navigation Tab")
	public void step05_clickOnFAATab() throws Exception
	{
		System.out.println("step 5 Begin");
		System.out.println("Click on Find an An adventure navigation Tab");
		HomePage hop= new HomePage(driver);
		hop.clickOnFAA();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on Find an An adventure navigation Tab \n");
		Reporter.log("<p>Successfully Clicked on Find an An adventure navigation Tab");
		System.out.println("step 5 End");
	}

	//Verify the  Find an An adventure navigation page
	@Test(priority =6, description ="step 6:Verify the   Find an An adventure  navigation page")
	public void step06_verifyFAAPage() throws Exception 
	{
		System.out.println("step 6 Begin");
		FindAnAdventure faa= new FindAnAdventure(driver);
		System.out.println("Verify the   Find an An adventure  navigation Page");
		faa.VeirfyPage();
		GUIFunctions.normalWait();
		log.info("Successfully Verified  Find an An adventure  Page \n");
		Reporter.log("<p>Successfully verified  Find an An adventure  Page");
		System.out.println("step 6 end");
	}

	//Click on Special Offers Navigation Tab
	@Test(priority =7,description = "step 7:Click on Special Offers Navigation Tab")
	public void step07_clickOnSOPTab() throws Exception {
		System.out.println("step 7 begin");
		System.out.println("Click on Special Offers Navigation Tab");
		HomePage hop= new HomePage(driver);
		hop.clickOnSOP();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on Special Offers Navigation Tab \n");
		Reporter.log("<p>Successfully Clicked on Special Offers Navigation Tab");
		System.out.println("step 7 end");
	}

	//Verify the Special Offers navigation page
	@Test(priority =8, description ="step 8:Verify the Special Offers  navigation page")
	public void step08_verifySOPPage() throws Exception 
	{
		System.out.println("step 8 Begin");
		SpecialOffersPage RSE= new SpecialOffersPage(driver);
		System.out.println("Verify the   Find an An adventure  navigation Page");
		RSE.VeirfyPage();
		GUIFunctions.normalWait();
		log.info("Successfully Verified  Find an An adventure  Page \n");
		Reporter.log("<p>Successfully verified  Find an An adventure  Page");
		System.out.println("step 8 end");
	}



	//Click on Destination navigation Tab
	@Test(priority =9,description = "step 9:Click on Destination navigation Tab")
	public void step09_clickOnDESTab() throws Exception {
		System.out.println("step 9 Begin");
		System.out.println("Click on Destination navigation Tab");
		HomePage hop= new HomePage(driver);
		hop.clickOnDES();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on Destination navigation Tab \n");
		Reporter.log("<p>Successfully Clicked on Destination navigation Tab");
		System.out.println("step 9 End");
	}

	//Verify the Destination navigation page
	@Test(priority =10, description ="step 10:Verify the Destination  navigation page")
	public void step10_verifyDESPage() throws Exception 
	{
		System.out.println("step 10 Begin");
		Destinations RSE= new Destinations(driver);
		System.out.println("Verify the Destination  navigation Page");
		RSE.VeirfyPage();
		GUIFunctions.normalWait();
		log.info("Successfully Verified Destination Page \n");
		Reporter.log("<p>Successfully verified Destination  Page");
		System.out.println("step 10 end");
	}

	//Click on Community navigation Tab
	@Test(priority =11,description = "step 11:Click on Community navigation Tab")
	public void step11_clickOnCOMTab() throws Exception {
		System.out.println("step 11 Begin");
		System.out.println("Click on Community navigation Tab");
		HomePage hop= new HomePage(driver);
		hop.clickOnCOM();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on Community navigation Tab \n");
		Reporter.log("<p>Successfully Clicked on Community navigation Tab");
		System.out.println("step 11 end");
	}

	//Verify the  Community navigation page
	@Test(priority =12, description ="step 12:Verify the Destination  navigation page")
	public void step12_verifyCOMPage() throws Exception 
	{
		System.out.println("step 12 Begin");
		Community RSE= new Community(driver);
		System.out.println("Verify the Community Page");
		RSE.VeirfyPage();
		GUIFunctions.normalWait();
		log.info("Successfully Verified  Community Page \n");
		Reporter.log("<p>Successfully verified  Community  Page");
		System.out.println("step 12 end");
	}

	//Click on Personal Information navigation Tab
	@Test(priority =13,description = "step 13:Click on Personal Information navigation Tab")
	public void step08_ClickonPRITab() throws Exception
	{
		System.out.println("step 13 Begin");
		System.out.println("Click on Personal Information navigation Tab");
		HomePage hop= new HomePage(driver);
		hop.clickOnPRI();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on Personal Information navigation Tab \n");
		Reporter.log("<p>Successfully Clicked on Personal Information navigation Tab");
		System.out.println("step 13 End");
	}
	//Verify the  Personal Information page
	@Test(priority =14, description ="step 14:Verify the Personal Information  navigation page")
	public void step14_verifyCOMPage() throws Exception 
	{
		System.out.println("step 14 Begin");
		PracticalInformation RSE= new PracticalInformation(driver);
		System.out.println("Verify the Personal Information Page");
		RSE.VeirfyPage();
		GUIFunctions.normalWait();
		log.info("Successfully Verified  Personal Information Page \n");
		Reporter.log("<p>Successfully verified  Personal Information  Page");
		System.out.println("step 14 end");
	}


}