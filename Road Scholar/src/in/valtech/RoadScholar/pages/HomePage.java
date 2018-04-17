package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import static in.valtech.custom.CustomFunction.user_Details;

import java.util.List;
import java.util.Random;
import java.util.Set;

import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage 
{


	public static String tripExpected;
	private final WebDriver driver;
	//private final WebDriver driver;

	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	//home Page Constructor
	public HomePage(WebDriver driver)
	{

		this.driver = driver;

		log.info("RS Home Page title" + driver.getTitle());
		System.out.println("Home Page title= "+driver.getTitle());



		// Check that we're on the right page-RS home page

		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("HOP_RSHomePageType_XPATH"));

		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("HOP_RSHomePageType_XPATH")),
				driver))) {

			throw new IllegalStateException("This is not the RS home page");
		}
	}
	By HOP_RSSearchBtn = By.xpath(ObjRepoProperty.getProperty("HOP_RSSearchBtn_XPATH"));
	By HOP_RSSubmitBtn = By.xpath(ObjRepoProperty.getProperty("HOP_RSSubmitBtn_XPATH"));
	By HOP_RSCloseBtn = By.xpath(ObjRepoProperty.getProperty("HOP_RSCloseBtn_XPATH"));
	By HOP_RSHighlightedEmailAddress = By.xpath(ObjRepoProperty.getProperty("HOP_RSHighlightedEmailAddress_XPATH"));
	By HOP_RSEmailAddress = By.xpath(ObjRepoProperty.getProperty("HOP_RSEmailAddress_XPATH"));
	By HOP_RSSearchTextBox = By.xpath(ObjRepoProperty.getProperty("HOP_RSSearchTextBox_XPATH"));
	By HOP_TwiterIcon = By.xpath(ObjRepoProperty.getProperty("HOP_TwiterIcon_XPATH"));
	By CAR_RSCatalogRequestPage = By.xpath(ObjRepoProperty.getProperty("CAR_RSCatalogRequestPage_XPATH"));
	By HOP_signInHeader =By.xpath(ObjRepoProperty.getProperty("signInLink_XPATH"));
	By HOP_SpecialOffer=By.xpath(ObjRepoProperty.getProperty("specialOffer_Component_XPATH"));
	By HOP_RoadScholarExperience= By.xpath(ObjRepoProperty.getProperty("HOP_RoadScholarExperience_XPATH"));
	By HOP_FindAnAdventure= By.xpath(ObjRepoProperty.getProperty("HOP_FindAnAdventure_XPATH"));
	By HOP_SpecialOffers= By.xpath(ObjRepoProperty.getProperty("HOP_SpecialOffers_XPATH"));
	By HOP_Destinations= By.xpath(ObjRepoProperty.getProperty("HOP_Destinations_XPATH"));
	By HOP_Community= By.xpath(ObjRepoProperty.getProperty("HOP_Community_XPATH"));
	By HOP_PracticalInformation= By.xpath(ObjRepoProperty.getProperty("HOP_PracticalInformation_XPATH"));
	By Hop_myAccountLink = By.xpath(ObjRepoProperty.getProperty("HOP_RSMyAccountLink_XPATH"));
	By HOP_StartHereLink=By.xpath(ObjRepoProperty.getProperty("HOP_RSStartHereLink_XPATH"));
	By HOP_SignUP=By.xpath(ObjRepoProperty.getProperty("HOP_SignUP_XPATH"));
	By HOP_EmailAddress_Error=By.xpath(ObjRepoProperty.getProperty("HOP_EmailAddress_Error_XPATH"));
	By HOP_EmailAddress=By.xpath(ObjRepoProperty.getProperty("HOP_EmailAddress_XPATH"));
	By HOP_ThankYou_PopUp=By.xpath(ObjRepoProperty.getProperty("HOP_ThankYou_PopUp_XPATH"));
	By HOP_ThankYou_Close_PopUp=By.xpath(ObjRepoProperty.getProperty("HOP_ThankYou_Close_PopUp_XPATH"));
	By HOP_PromoText=By.xpath(ObjRepoProperty.getProperty("HOP_PromoText_XPATH"));
	By HOP_Empty_EmailAddress=By.xpath(ObjRepoProperty.getProperty("HOP_Empty_EmailAddress_XPATH"));
	By HOP_MyAccount=By.xpath(ObjRepoProperty.getProperty("HOP_MyAccount_XPATH"));
	By HOP_PersonalInfo=By.xpath(ObjRepoProperty.getProperty("HOP_PersonalInfo_XPATH"));
	By HOP_DonateLink =By.xpath(ObjRepoProperty.getProperty("HOP_DonateLink_XPATH"));
	By HOP_FAAInternationalTab=By.xpath(ObjRepoProperty.getProperty("HOP_FAAInternationalTab_Xpath")); 
	By HOP_TripsUnderFA=By.xpath(ObjRepoProperty.getProperty("HOP_TripsUnderFA_Xpath")); 
	By CAR_CatalogRequest=By.xpath(ObjRepoProperty.getProperty("CAR_CatalogRequest_XPATH"));
	By HOP_InterestCollection=By.xpath(ObjRepoProperty.getProperty("HOP_InterestCollection_Xpath")); 
	By HOP_Flyout=By.xpath(ObjRepoProperty.getProperty("HOP_RsSearchFlyout_Xpath"));
	By HOP_AfterLogInMyAccountLink =By.xpath(ObjRepoProperty.getProperty("HOP_AfterLogInMyAccountLink_XPATH"));
	By HOP_Signout=By.xpath(ObjRepoProperty.getProperty("HOP_SignoutLink_XPATH"));
	By HOP_TripArrow=By.xpath(ObjRepoProperty.getProperty("HOP_TripArrow_XPATH"));
	By HOP_EditProfile =By.xpath(ObjRepoProperty.getProperty("HOP_RSEditProfileLink_XPATH"));
	By HOP_Wishlist=By.xpath(ObjRepoProperty.getProperty("HOP_WishlistLink_XPATH"));
	By LogedInUserName=By.xpath(ObjRepoProperty.getProperty("HOP_LogedInUserName_XPATH"));
	By HOP_TextBoxSearchIcon=By.xpath(ObjRepoProperty.getProperty("HOP_TextBoxSearchIcon_XPATH"));
	By HOP_UpcomingTrip =By.xpath(ObjRepoProperty.getProperty("HOP_UpcomingTripLink_XPATH"));

	/**MethodName:navigateToApplication_URL
	 * Description:This function navigates To the Application URL
	 * @return Home page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	
	public static HomePage navigateToApplication_URL(WebDriver driver, String homeUrl, String driverName) throws InterruptedException
	{
		System.out.println("before loading url");
		GUIFunctions.DeleteCookies(driver);
		driver.get(homeUrl);
		Reporter.log("Page Title:" + driver.getTitle());
		System.out.println("Page Title:" + driver.getTitle());
		return new HomePage(driver);
	}
	/**MethodName:clickOnSubmit
	 * Description:This function clicks On Submit btn
	 * @return Home page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */

	public HomePage clickOnSubmit() throws InterruptedException
	{
		String color=driver.findElement(By.xpath("//div[@class='hsm-email']")).getCssValue("color");
		System.out.println("color=" + color); 

		//Click on Submit button without entering data
		GUIFunctions.clickElement(driver, HOP_RSSubmitBtn, "submit");
		Thread.sleep(1000);

		String color1 = driver.findElement(By.xpath("//input[@class='error']")).getCssValue("color");
		System.out.println("color=" + color1);

		//Verify the Highlighted field
		Thread.sleep(1000);
		if(color1.equals(color))
		{
			System.out.println("Email  address field not highlighted in red");

		}
		else
		{
			System.out.println("Email  address field get highlighted in red");
		}

		
		GUIFunctions.clickElement(driver, HOP_RSCloseBtn, "close");

		return new HomePage(driver);

	}

	/**MethodName:clickOnSearch
	 * Description:This function clicks On Search
	 * @return Home page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public FindAnAdventure clickOnSearch() throws Exception
	{
		//Clicking on faq link
		GUIFunctions.clickElement(driver, HOP_RSSearchTextBox, "SEARCH");
		log.info("clicking on SEARCH  is done successfully");
		return new FindAnAdventure(driver);
	}

	/**MethodName:Click on sign up Modal
	 * Description:This function Click on sign up Modal
	 * @return Home page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */

	public  HomePage ClickOnModal() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, HOP_RSCloseBtn, "Closebutton");
		Thread.sleep(5000);
		return new HomePage(driver);
	}
	
	/**MethodName:Click on Sign in from header
	 * Description:This function Click on Sign in from header 
	 * * @return Login
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */

	public  Login clickOnSignINHeader() throws InterruptedException
	{

		GUIFunctions.clickElement(driver, HOP_signInHeader, "Signin");
		Thread.sleep(5000);
		return new  Login( driver);	

	}

	/**MethodName:ClickOnSpecialOffer()
	 * Description:This function Clicks on Special offer component & navigates to trip detail page 
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */

	public   TripDetailPage ClickOnSpecialOffer() throws InterruptedException
	{
		BaseTest.Actual=	driver.findElement(By.xpath("//div[@class='hso-title']")).getText();
		GUIFunctions.clickElement(driver, HOP_SpecialOffer, "Trip Page");
		Thread.sleep(3000);
		System.out.println("sting   "+BaseTest.Actual);
		return new TripDetailPage(driver);
	}

	/**MethodName= SocialSite_TwiterPage clickOnTwitter
	 * Description:This function Clicking on Twitter Icon and navigating to SocialSite_TwiterPage
	 *@return SocialSite_TwiterPage
	 **Author:Kavya
	 */

	public  SocialSite_TwiterPage clickOnTwitter() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000)", "");
		System.out.println(" Twitter");
		Thread.sleep(10000);
		GUIFunctions.clickElement(driver, HOP_TwiterIcon, "Twiter icon");
		Thread.sleep(1000);
		Set<String> handles = driver.getWindowHandles();
		String 	secondWinHandle;
		String firstWinHandle = driver.getWindowHandle(); handles.remove(firstWinHandle);
		String winHandle= handles.iterator().next();
		if (winHandle!=firstWinHandle)
		{
			//To retrieve the handle of second window, extracting the handle which does not match to first window handle
			secondWinHandle=winHandle; //Storing handle of second window handle
			//Switch control to new window
			driver.switchTo().window(secondWinHandle);
		}
		return new SocialSite_TwiterPage(driver);
	}
	
	/**MethodName:Click on RoadScholar Experience
	 * Description:This function Click on RoadScholar Experience
	 * @return RoadScholarExperience
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
	public  RoadScholarExperience clickOnRSE() throws InterruptedException
	{    
		System.out.println("clcikng on roadscholar");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_RoadScholarExperience, "RoadScholar");
		GUIFunctions.normalWait();
		return new RoadScholarExperience(driver);
	}
	
	/**MethodName:Click on FindAnAdventure
	 * Description:This function Click on FindAnAdventure
	 * @return FindAnAdventure
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
	public FindAnAdventure clickOnFAA() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_FindAnAdventure, "Find An Adventure");
		GUIFunctions.normalWait();
		return new FindAnAdventure(driver);
	}
	
	/**MethodName:Click on SpecialOffersPage
	 * Description:This function Click on SpecialOffersPage
	 * @return SpecialOffersPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public SpecialOffersPage clickOnSOP() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_SpecialOffers, "SpecialOffers");
		GUIFunctions.normalWait();
		return new SpecialOffersPage(driver);
	}
	
	/**MethodName:Click on Destinations
	 * Description:This function Click on Destinations
	 * @return Destinations
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public Destinations clickOnDES() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_Destinations, "Destinations");
		GUIFunctions.normalWait();
		return new Destinations(driver);
	}
	
	/**MethodName:Click on Community
	 * Description:This function Click on Community
	 * @return Community
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
	public Community clickOnCOM() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_Community, "Community");
		GUIFunctions.normalWait();
		return new Community(driver);
	}
	
	/**MethodName:Click on PracticalInformation
	 * Description:This function clickOn PracticalInformation
	 * @return PracticalInformation
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
	public PracticalInformation clickOnPRI() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_PracticalInformation, "Practical Information");
		GUIFunctions.normalWait();
		return new PracticalInformation(driver);
	}
	
	/**MethodName:Click on My account link from Header
	* Description:This function click On MyAccountLink
	 * @return HomePage
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */

	public HomePage ClickOnMyAccountLink() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,Hop_myAccountLink , "myAccountLink");
		Thread.sleep(5000);
		return new HomePage(driver);
	}

	/**MethodName:Click on Start Here link from My Account 
	 * Description:This function click On Start Here link
	 * @return Create An Account Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */

	public CreateAccount ClickOnStartHereLink() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, HOP_StartHereLink , "StartHereLink");
		Thread.sleep(1000);
		return new CreateAccount(driver);
	}
	
	/**MethodName:VerifyErrorInPromoBlock
	 * Description:Verify the error while clicking submit button with out entering email id
	 * @return HomePage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
	public HomePage VerifyErrorInPromoBlock() throws InterruptedException
	{
		String Intitalcolor=driver.findElement(HOP_Empty_EmailAddress).getCssValue("color");
		System.out.println("Promo Block Dfault color in email Address field is =" + Intitalcolor);
		log.info("Promo Block Dfault color in email Address field is =" + Intitalcolor);
		System.out.println("Clicking on Sign up Button With out entering Mail  id");
		log.info("Clicking on Sign up Button With out entering Mail  id");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_SignUP, "SignUp Button");
		GUIFunctions.normalWait();
		String AfterColor=driver.findElement(HOP_EmailAddress_Error).getCssValue("color");
		log.info("After Clicking on Signup Button Color is"+AfterColor);
		System.out.println("After Clicking on Signup Button Color is"+AfterColor);
		if(Intitalcolor.equals(AfterColor))
		{
			System.out.println("Email  address field  highlighted in red");
			log.info("Email  address field  highlighted in red");
		}
		else
		{
			System.out.println("Email  address field  is not getting highlighted in red");
			log.info("Email  address field is not getting  highlighted in red");
		}
		return new HomePage(driver);

	}
	
	/**MethodName:CheckPromoBlockText
	 * Description:This function Click on CheckPromoBlockText
	 * @return HomePage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */

	public HomePage CheckPromoBlockText() throws Exception
	{
		CustomFunction.refreshPage(driver);
		GUIFunctions.normalWait();
		System.out.println("Refreshing the page");
		log.info("Refreshing the page");
		GUIFunctions.enterValueIntoTextBox(driver, HOP_EmailAddress, "safgs@gmail.com");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_SignUP, "Signup_Button");
		GUIFunctions.normalWait();
		if(CustomFunction.isElementVisible(HOP_ThankYou_PopUp, driver))
		{
			System.out.println("Thank you popup is displyaed.");
			log.info("Thank you popup is displyaed.");
		}
		else
		{
			System.out.println("Thank you popup is not displyaed.");
			log.info("Thank you popup is not displyaed."); 
		}
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_ThankYou_Close_PopUp, "Thank You PopUP Close Icon");
		GUIFunctions.normalWait();
		if(CustomFunction.isElementVisible(HOP_PromoText, driver))
		{
			System.out.println("PromoText is displyaed.");
			log.info("PromoText is displyaed.");
		}
		else
		{
			System.out.println("PromoText is not displyaed.");
			log.info("PromoText is not displyaed."); 
		}


		return new HomePage(driver);
	}
	
	/**MethodName:clickOnCatalogRequest
	 * Description:This function  click On CatalogRequest
	 * @return CatalogRequest
	 * @throws InterruptedException 
	 * Author:Sravani
	 */

	public CatalogRequest clickOnCatalogRequest() throws InterruptedException
	{ 
		GUIFunctions.clickElement(driver, CAR_CatalogRequest, "CatalogRequest");
		Thread.sleep(1000);
		return new CatalogRequest(driver);
	}

	/**MethodName:clickOnPIP
	 * Description:This function Click on Personal Information Page from My Account
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
	public PersonalInformationPage clickOnPIP() throws InterruptedException
	{ 
		 AfterLogInclickOnMyAccountLink();
		 GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, HOP_PersonalInfo, "Personal Information");
		Thread.sleep(1000);
		return new PersonalInformationPage(driver);
	}
	
	/**MethodName:ClickOnUpcomingTripLink
	 *	Description:This function Click on upcomingTrip link
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */

	public UpcommingTripsPage ClickOnUpcomingTripLink() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, HOP_UpcomingTrip , "UpcomingTrip");
		Thread.sleep(1000);
		return new UpcommingTripsPage(driver);
	}

	
	/**MethodName:clickOnDonateLink
	 * Description:This function Click on DonateLink
	 * @return HomePage
	 * @throws InterruptedException 
	 **Author:Kavya
	 */

	public HomePage clickOnDonateLink() throws InterruptedException 
	{
		Thread.sleep(1000);
		GUIFunctions.clickElement(driver,HOP_DonateLink, "Donate Link");
		Thread.sleep(1000);
		return new HomePage(driver);
	}
	
	/**MethodName:clickOnFAAInternationalTab
	 *  Description:This function clicks on FAA InternationalTab
	 * @return HomePage
	 * @throws InterruptedException 
	 **Author:Kavya
	 */

	public HomePage clickOnFAAInternationalTab() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("FAA--->iNTERNATIONAL TAB");
		GUIFunctions.clickElement(driver, HOP_FAAInternationalTab, "FAAInternationalTab");
		Thread.sleep(5000);
		return  new HomePage(driver);
	}	
	
	/**MethodName= clickOnTripsBelowFA
	 ** Description:This function clicks on trips below FAA InternationalTab
	 * @return TripDetailPage
	 * @throws InterruptedException 
	 **Author:Kavya
	 */
	
	public TripDetailPage clickOnTripsBelowFA() throws InterruptedException
	{
		BaseTest.expected=driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/div/a/div[2]/div[2]")).getText();
		System.out.println("Trips  --->Trip Detail Page");
		Thread.sleep(5000);	
		System.out.println(" 	tripExpected "+ 	BaseTest.expected);
		GUIFunctions.clickElement(driver,HOP_TripsUnderFA, "FA Trips");
		Thread.sleep(5000);
		return  new TripDetailPage(driver);
	}

	/**MethodName= clickOnCollectionUnderExploreYourInterest
	 * Description:This function clicks on trips below FAA InternationalTab
	 * * @return CollectionPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	
	public CollectionPage clickOnCollectionUnderExploreYourInterest() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)", "");
		System.out.println("EXPLORE YOUR INTEREST--->");
		BaseTest.expected=driver.findElement(By.xpath("(//div[@class='hpc-interest-title'])[2]")).getText();
		tripExpected=driver.findElement(By.xpath("(//div[@class='hpc-trips'])[2]")).getText();
		Thread.sleep(5000);
		System.out.println("count expected"+tripExpected);
		System.out.println("expected "+BaseTest.expected);
		GUIFunctions.clickElement(driver,HOP_InterestCollection, "InterestCollection");
		Thread.sleep(5000);
		return  new CollectionPage(driver);
	}	

	/**MethodName:enterTextIntoSearchTextBox
	 * Description:This function Enter value into search text box
	 * @return  HomePage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */

	public HomePage enterTextIntoSearchTextBox()throws  Exception
	{

		boolean t=CustomFunction.isElementVisible(HOP_RSSearchTextBox, driver);
		String searchText=user_Details.getSearch_Text();
		System.out.println(" Search text in homepage"+searchText);
		
		GUIFunctions.enterValueIntoTextBox(driver, HOP_RSSearchTextBox,searchText);
		Thread.sleep(5000);
		return  new HomePage(this.driver); 		
	}
	/**MethodName:ClickonFlyout
	 * Description:This function ClickonFlyout
	 * @return  HomePage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public TripDetailPage ClickonFlyout() throws InterruptedException
	{	 
		Thread.sleep(5000);
		BaseTest.Actual=driver.findElement(HOP_Flyout).getText();
		GUIFunctions.clickElement(driver, HOP_Flyout, "flyout value");
		Thread.sleep(5000);
		return new TripDetailPage(driver);
	}
	
	/**MethodName:AfterLogInclickOnMyAccountLink
	 * Description:This function click on My acc after login
	 * @return  HomePage
	 * @throws InterruptedException 
	 * Author:sukrity
	 */

	public HomePage AfterLogInclickOnMyAccountLink() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, HOP_AfterLogInMyAccountLink, "AfterLogInMyAccountLink");
		Thread.sleep(5000);

		return new  HomePage( driver); 
	}
	
	/**MethodName:clickOnSignOutLink
	 * Description:This function Click on sign out link from Header
	 * @return HomePage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public HomePage clickOnSignOutLink() throws InterruptedException
	{

		GUIFunctions.clickElement(driver, HOP_Signout , "Sign out");
		Thread.sleep(5000);
		return new HomePage(driver);
	}

	/**MethodName:clickOnTripcard()
	 * Description:This function Clicks on any trip card 
	 * @return TripDetailPage
	 * @throws Exception 
	 * Author:Anupriya
	 */
	public TripDetailPage clickOnTripCard() throws Exception
	{

		System.out.println("Challenges Starting..................");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)", "");
		List<WebElement> Programnumber=driver.findElements(By.xpath("//div[@class='component-trip-card-small']"));
		System.out.println(Programnumber.size());
		Random rand=new Random();
		int min=1;
		int randnum=rand.nextInt(Programnumber.size()-min+1)+min;
		//int randnum=2;
		System.out.println(randnum);
		By Trip=(By.xpath("(//div[@class='component-trip-card-small'])["+randnum+"]"));
		System.out.println("(//div[@class='component-trip-card-small'])["+randnum+"]");
		if(randnum>3&& randnum<7)
		{
			System.out.println(" 3 to 7");
			//System.out.println("CustomFunction"+CustomFunction.isElementVisible(Trip, driver));
			GUIFunctions.clickElement(driver, HOP_TripArrow, "Arrow");	
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver, Trip, "tripcard");

		}
		else if(randnum>=7&& randnum<=9)
		{

			System.out.println(" 7 to 9");
			GUIFunctions.clickElement(driver, HOP_TripArrow, "Arrow");	
			GUIFunctions.clickElement(driver, HOP_TripArrow, "Arrow");	
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver, Trip, "tripcard");
		}
		else if(randnum>10 && randnum<=12)
		{
			System.out.println(" 9 to 12");
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver, HOP_TripArrow, "Arrow");	
			GUIFunctions.clickElement(driver, HOP_TripArrow, "Arrow");	
			GUIFunctions.clickElement(driver, HOP_TripArrow, "Arrow");	
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver, Trip, "tripcard");
		}

		else
		{
			System.out.println("INSIDE else ");
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver, Trip, "tripcard");


		}

		return new TripDetailPage(driver);
	}
	
	/**MethodName:Click on editprofile link
	 * Description:This function click on editprofile link
	 * @return EditProfile
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public EditProfile ClickOnEditProfileLink() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, HOP_EditProfile , "EditProfile");
		Thread.sleep(1000);
		return new EditProfile(driver);
	}

	/**MethodName:ClickOnwishlist()
	 * Description:This function Clicks On wishlist from account drop down
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public WishlistPage clickOnWishList() throws InterruptedException
	{
		 AfterLogInclickOnMyAccountLink();
		Thread.sleep(5000);
		GUIFunctions.clickElement(driver, HOP_Wishlist, "Wish list link");
		GUIFunctions.normalWait();

		return  new WishlistPage(driver);
	}
	
	/**MethodName:verifyLogedInUser
	 *  * Description:This function verifies logged in user
	 * @return HomePage
	 * @throws Exception 
	 * Author:Sukrity
	 */

	public  HomePage verifyLogedInUser() throws InterruptedException
	{
		Thread.sleep(5000);

		String Actual=driver.findElement(LogedInUserName).getText();
		System.out.println("Actual"+Actual);
		System.out.println("Random"+ CreateAccount.randomstring);
		int n=CreateAccount.randomstring.indexOf( '@' );
		System.out.println("n value"+n);
		String expected =CreateAccount.randomstring.substring(0, n).toLowerCase();
		System.out.println("expected"+expected);
		Assert.assertEquals( Actual, expected);
		System.out.println("Successfully logged in");
		return new HomePage(driver);
	}

	
	/**MethodName:clickOnTextboxSearchIcon
	 * Description:This function to click On Textbox SearchIcon
	 * @return  HomePage
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public TripDetailPage clickOnTextboxSearchIcon()throws  Exception
	{
		GUIFunctions.clickElement(driver, HOP_TextBoxSearchIcon, "HOP_TextBoxSearchIcon");
		Thread.sleep(5000);
		Thread.sleep(5000);
		return  new TripDetailPage(driver); 		
	}
	
	/**MethodName:enterTripIdIntoSearchTextBox
	 * Description:This function to enter TripId Into SearchTextBox
	 * @return  HomePage
	 * @throws InterruptedException 
	 * Author:Manjula
	 */
	public HomePage enterTripIdIntoSearchTextBox()throws  Exception
	{
		boolean t=CustomFunction.isElementVisible(HOP_RSSearchTextBox, driver);
		String searchText=user_Details.getSearch_TripId();
		System.out.println(" Search text in homepage"+searchText);
		GUIFunctions.enterValueIntoTextBox(driver, HOP_RSSearchTextBox,searchText);
		return  new HomePage(this.driver);   
	}

	/**MethodName:clickOnSearchButton
	 * Description:This function to click on search button
	 * @return  HomePage
	 * @throws InterruptedException 
	 * Author:Manjula
	 */
	public HomePage clickOnSearchButton()throws  Exception
    {
     GUIFunctions.clickElement(driver, HOP_RSSearchBtn, "Search Button");
     GUIFunctions.normalWait();
     GUIFunctions.normalWait();
     return  new HomePage(driver);   
    }
}



























