/** @author Anupriya
 * 
 */

package in.valtech.RoadScholar.common.asserts.page.Assertions;

import static in.valtech.util.PropertyFileReader. ObjRepoProperty;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.custom.CustomFunction;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class HomePageAssertions {
	public final  WebDriver driver;

	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	//home Page Constructor
	public  HomePageAssertions(WebDriver driver)
	{

		this.driver = driver;

		log.info("RS Home Page title" + driver.getTitle());
		System.out.println("Home Page title= "+driver.getTitle());
	}

	// For logging

	// verify the sign up pop-up
	public HomePage verifySignupPopup()throws InterruptedException

	{

		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("signUpPop_XPATH")), driver),
				"Sign up pop up is not displayed");
		log.info("Successfully verified  sign up pop");
		Reporter.log("<p>Successfully verified sign up pop ");
		Thread.sleep(5000);
		return  new HomePage(driver);

	}
	//Verify the dismissible alert
	public void verifyDismissibleAlert()

	{			

		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("dismissibleAlert_XPATH")), driver),
				"dismissibleAlert is not displayed");
		log.info("Successfully verified  dismissibleAlert");
		Reporter.log("<p>Successfully verified dismissibleAlert ");

	}
	// verify the search tool bar
	public  void verifySearchToolBar()

	{				
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("searchtoolbar_XPATH")), driver),
				"searchtoolbar is not displayed");
		log.info("Successfully verified  searchtoolbar");
		Reporter.log("<p>Successfully verified searchtoolbar");
	}

	// verify the Roadscholar logo
	public  void verifyRoadscholarlogo()

	{

		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("roadscholarLogo_XPATH")), driver),
				"Roadscholarlogo is not displayed");
		log.info("Successfully verified  Roadscholarlogo");
		Reporter.log("<p>Successfully verified Roadscholarlogo ");
	}
	// verify the header links
	public  void verifyHeaderlinks()

	{
		// verify the CatalogRequest links
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("catalogRequesLlink_XPATH")), driver),
				"CatalogRequestlinks is not displayed");
		log.info("Successfully verified  CatalogRequestlinks");
		Reporter.log("<p>Successfully verified CatalogRequestlinks ");

		// verify the Signin links
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("signInLink_XPATH")), driver),
				" Signinlink is not displayed");
		log.info("Successfully verified  Signinlink");
		Reporter.log("<p>Successfully verified Signinlink ");
		
		// verify the MyAccount links
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("myAccountLink_XPATH")), driver),
				" MyAccount link is not displayed");
		log.info("Successfully verified  MyAccount link ");
		Reporter.log("<p>Successfully verified MyAccount link  ");
		
		
		// verify the Chat now links
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("chatNowLink_XPATH")), driver),
				" Chat now links is not displayed");
		log.info("Successfully verified Chat now links ");
		Reporter.log("<p>Successfully verified Chat now links  ");
		
		
		// verify Donate  links
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("donateLink_XPATH")), driver),
				"Donate  links  is not displayed");
		log.info("Successfully verified Donate  links ");
		Reporter.log("<p>Successfully verified Donate  links  ");

	}
	// verify Search icon
	public  void verifySearchIcon()
	{
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("searchIcon_XPATH")), driver),
				"SearchIcon  is not displayed");	
		log.info("Successfully verified SearchIcon  ");
		Reporter.log("<p>Successfully verified SearchIcon   ");
	}
	
	// verify the footer links
	public  void verifyfooterlinks()
	{
		// verify the About RoadScholar link
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("aboutRoadscholarLink_XPATH")), driver),
				" About RoadScholar link is not displayed");	

		log.info("Successfully verified About RoadScholar link ");
		Reporter.log("<p>Successfully verified About RoadScholar link ");
		// verify the Contact us link
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("contactUsLink_XPATH")), driver),
				"Contact us link is not displayed");
		log.info("Successfully verified Contact us link");
		Reporter.log("<p>Successfully verified Contact us link ");

		// verify the Store link
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("storeLink_XPATH")), driver),
				" Store link is not displayed");
		log.info("Successfully verified Store link");
		Reporter.log("<p>Successfully verified Store link ");

		// verify the Refer a friend
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("referFriend_XPATH")), driver),
				"Refer a friend is not displayed");
		log.info("Successfully verified Refer a friend");
		Reporter.log("<p>Successfully verified Refer a friend ");
		//verify the Road scholar logo
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("footerRoadscholarLogo_XPATH")), driver),
				" Roadscholarlogo is not displayed");
		log.info("Successfully verified Roadscholarlogo");
		Reporter.log("<p>Successfully verified Roadscholarlogo ");
		//verify the Sign up title
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("signUpTitle_XPATH")), driver),
				" The Signup title is not displayed");
		log.info("Successfully verified The Signup title");
		Reporter.log("<p>Successfully verifiedThe Signup title ");
		//verify email address btn
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("emailAddressBtn_XPATH")), driver),
				" Email address btn is not displayed");
		log.info("Successfully verified emailAddressBtn");
		Reporter.log("<p>Successfully verified emailAddressBtn ");
		//verify the Sign up btn
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("signUpBtn_XPATH")), driver),
				" The Signupbtn is not displayed");
		log.info("Successfully verified The Signupbtn");
		Reporter.log("<p>Successfully verified The Signupbtn ");

	}

	// verify the Social buttons
	public  void verifySocialbuttons()
	{
		// verify the Fb button
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("FacebookBtn_XPATH")), driver),
				" Fb button is not displayed");
		log.info("Successfully verified Fb button");
		Reporter.log("<p>Successfully verified Fb button ");
		//verify the twitter button
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("twitterBtn_XPATH")), driver),
				" Twitter button is not displayed");

		log.info("Successfully verified Twitter button");
		Reporter.log("<p>Successfully verified Twitter button ");
		//verify the Instragram button
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("InstragramBtn_XPATH")), driver),
				"  Instragram button is not displayed");
		log.info("Successfully verified Instragram button");
		Reporter.log("<p>Successfully verified Instragram button ");
		// verify the pin interest button
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("pinInterestBtn_XPATH")), driver),
				"pin interest button is not displayed");
		log.info("Successfully verified pin interest button");
		Reporter.log("<p>Successfully verified pin interest button ");
		// verify the youtube button
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("youtubeBtn_XPATH")), driver),
				"youtube button is not displayed");
		log.info("Successfully verifiedyoutube button ");
		Reporter.log("<p>Successfully verified youtube button  ");
	}
	// verify the address Label
	public  void verifyAddressLabel()
	{
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("addressLabel_XPATH")), driver),
				"Address Label is not displayed");
		log.info("Successfully verified Address Label ");
		Reporter.log("<p>Successfully verified Address Label  ");
	}
	// verify the Privacy link
	public  void verifyPrivacylink()
	{
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("privacyLink_XPATH")), driver),
				"Privacylink is not displayed");
		log.info("Successfully verified Privacylink ");
		Reporter.log("<p>Successfully verified Privacylink ");
	}
	// verify the Terms of use link
	public  void verifyTermsofuselink()
	{
		Assert.assertTrue(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty
				.getProperty("TermsofuseLink_XPATH")), driver),
				"TermsofuseLink is not displayed");
		log.info("Successfully verified TermsofuseLink ");
		Reporter.log("<p>Successfully verified TermsofuseLink ");
	}

}



