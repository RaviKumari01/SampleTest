/* @ Anupriya
 * To verify all  the elements of web page
 * */


package in.valtech.RoadScholar.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import in.valtech.RoadScholar.common.asserts.page.Assertions.HomePageAssertions;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.config.BaseTest;

public class HOP_TC_01 extends BaseTest {
	
	
	
	@Test(priority=1,description="Precondition:  Open browser,Navigate to the RS URL")
	public void Step01_NavigeteToURL() throws Exception 
	{
		System.out.println("step 1 begin");
		HomePage.navigateToApplication_URL(driver,homePageUrl, driver_Name);
		log.info("Successfully navigated to application URL \n");
		Reporter.log("<p>Successfully navigated to application URL");
		System.out.println("step 1 end");
	}
	
	@Test(priority=2,description=" Close the modal")
	public void Step02_ClickonCloseModal() throws Exception 
	{
		System.out.println("step 2 begin");
		HomePage home=new HomePage(driver);
		home.ClickOnModal();
		log.info("Successfully closed the modal \n");
		Reporter.log("<p>Successfully closed the modal ");
		System.out.println("step 2 end");
	}
	
	@Test(priority=3,description="Step 03:  verify the sign up pop-up ")
	public void Step03_verifySignupPopup()throws InterruptedException
	{
		System.out.println("step 3 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifySignupPopup();
		log.info("Successfully verified the navigated sign up pop-up  \n");
		Reporter.log("<p>Successfully verified the navigated sign up pop-up ");
		System.out.println("step 3 end");
		
	}
	
	
	@Test(priority=4,description="Step 04: verifyDismissibleAlert")
	public void Step04_verifyDismissibleAlert() throws Exception 
	{
		System.out.println("step 4 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyDismissibleAlert();
		log.info("Successfully verified the DismissibleAlert  \n");
		Reporter.log("<p>Successfully verified theDismissibleAlert ");
		System.out.println("step 4 end");
		
    }
	@Test(priority=5,description="Step 05: verifySearchToolBar")
	public void Step05_verifySearchToolBar() throws Exception 

	{
		System.out.println("step 5 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifySearchToolBar();
		log.info("Successfully verified SearchToolBar  \n");
		Reporter.log("<p>Successfully verified SearchToolBar ");
		System.out.println("step 5 end");
	}	
	
	@Test(priority=6,description="Step 06: verifyRoadscholarlogo")
	public void Step06_verifyRoadscholarlogo() throws Exception 
	{
		System.out.println("step 6 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyRoadscholarlogo();
		log.info("Successfully verified Roadscholarlogo \n");
		Reporter.log("<p>Successfully verified Roadscholarlogo ");
		System.out.println("step 6 end");
	}	
		
	
	@Test(priority=7,description="Step 07: verifyHeaderlinks")
	public void Step07_verifyHeaderlinks() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyHeaderlinks();
		log.info("Successfully verified Headerlinks \n");
		Reporter.log("<p>Successfully verified Headerlinks ");
		System.out.println("step 7 end");
	}
	@Test(priority=8,description="Step 08: verifySearchIcon")
	public void Step08_verifySearchIcon() throws Exception 
	{
		System.out.println("step 8 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifySearchIcon();
		log.info("Successfully verified SearchIcon \n");
		Reporter.log("<p>Successfully verified SearchIcon");
		System.out.println("step 8 end");
	}
	@Test(priority=9,description="Step 09: verifyfooterlinks")
	public void Step09_verifyfooterlinks() throws Exception 
	{
		System.out.println("step 9 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyfooterlinks();
		log.info("Successfully verified footerlinks \n");
		Reporter.log("<p>Successfully verified footerlinks");
		System.out.println("step 9 end");
	}
	@Test(priority=10,description="Step 10: verifySocialbuttons")
	public void Step10_verifySocialbuttons() throws Exception 
	{
		System.out.println("step 10 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifySocialbuttons();
		log.info("Successfully verified Socialbuttons\n");
		Reporter.log("<p>Successfully verified Socialbuttons");
		System.out.println("step 10 end");
	}
		
	
	@Test(priority=11,description="Step 11: verifyAddressLabel")
	public void Step11_verifyAddressLabel() throws Exception 
	{
		System.out.println("step 11 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyAddressLabel();
		log.info("Successfully verified AddressLabel\n");
		Reporter.log("<p>Successfully verified AddressLabel");
		System.out.println("step 11 end");
		
	}
	@Test(priority=12,description="Step 12: verifyPrivacylink")
	public void Step12_verifyPrivacylink() throws Exception 
	{
		System.out.println("step 12 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyPrivacylink();
		log.info("Successfully verified Privacylink\n");
		Reporter.log("<p>Successfully verified Privacylink");
		System.out.println("step 12 end");
		
	}
		
	
	@Test(priority=13,description="Step 13: verifyTermsofuselink")
	public void Step13_verifyTermsofuselink() throws Exception 
	{
		System.out.println("step 13 begin");
		HomePageAssertions hp=new HomePageAssertions(driver);
		hp.verifyTermsofuselink();
		log.info("Successfully verified Termsofuselink\n");
		Reporter.log("<p>Successfully verified Termsofuselink");
		System.out.println("step 13 end");
		
	}
	
}
