package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import static in.valtech.custom.CustomFunction.user_Details;
import static in.valtech.util.PropertyFileReader.TextProperty;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SocialSite_TwiterPage 
{

	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());

	public SocialSite_TwiterPage(WebDriver driver) 
	{
		this.driver = driver;
		
		log.info("RS Twitter title" + driver.getTitle());
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("TW_Page_XPATH"));
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("TW_Page_XPATH")),
				driver)))
		{
			throw new IllegalStateException("This is not the RS Twitter page");
		}
	}

	// ===============================Locators===================================
	By TW_Login=By.xpath(ObjRepoProperty.getProperty("TW_LogIn_XPATH"));
	By TW_User=By.xpath(ObjRepoProperty.getProperty("TW_Email_XPATH"));
	By TW_pswd=By.xpath(ObjRepoProperty.getProperty("TW_Pswd_XPATH"));
	By TW_SignIn=By.xpath(ObjRepoProperty.getProperty("TW_submitbtn_XPATH"));
	By TW_Account=By.xpath(ObjRepoProperty.getProperty("TW_ClickonAccount_XPATH"));
	By TW_VerifyTitle=By.xpath(ObjRepoProperty.getProperty("TW_RSTitle_XPATH"));

	/**MethodName= clickOnLogIn
	 * Description:This function Clicks onLog In
	 * @return SocialSite_TwiterPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public SocialSite_TwiterPage clickOnLogInbtn() throws InterruptedException {
		GUIFunctions.clickElement(driver, TW_Login, "login");
		GUIFunctions.normalWait();
		log.info("Successfully clicked on login \n");
		return new SocialSite_TwiterPage(this.driver );
	}

	/**MethodName= EnterEmail
	 *  Description:This function enters Email
	 *  @return SocialSite_TwiterPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public SocialSite_TwiterPage EnterEmail() throws InterruptedException {
		Thread.sleep(5000);	
		String user=user_Details.getEmail_Address();
		GUIFunctions.enterValueIntoTextBox(driver, TW_User, user);
		Thread.sleep(5000);
		log.info("Successfully Entered email \n");
		return new SocialSite_TwiterPage(driver );
	}

	/**MethodName= EnterPassword
	 *  Description:This function enters Password
	 *  @return SocialSite_TwiterPage
	 * @throws InterruptedException 
	 **Author:Anupriya
	 */
	public SocialSite_TwiterPage EnterPassword() throws InterruptedException {
		Thread.sleep(5000);
		String pswd=user_Details.getPassword();
		System.out.println(" password"+ pswd);
		GUIFunctions.enterValueIntoTextBox(driver,TW_pswd, pswd);
		log.info("Successfully Entered password \n");
		return new SocialSite_TwiterPage( this.driver);
	}

	/**MethodName= ClickOnSubmitButton
	 * Description:This function Clicks OnSubmitButton
	 * @return SocialSite_TwiterPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public SocialSite_TwiterPage ClickOnSubmitButton() throws InterruptedException{
		Thread.sleep(5000);	 
		GUIFunctions.clickElement(driver,TW_SignIn ,"Sign in");
		Thread.sleep(5000);
		log.info("Successfully clicked on SubmitButton \n");
		return  new SocialSite_TwiterPage (this.driver);
	}

	/**MethodName:verifyRSTitle
	 * Description:This function verifies the redirect to rs site
	 * @return  SocialSite_TwiterPage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public SocialSite_TwiterPage verifyRSTitle() throws InterruptedException {
		BaseTest.Actual=driver.findElement(TW_VerifyTitle).getText();
		Assert.assertEquals(TextProperty.getProperty("Twitter_RS"), BaseTest.Actual);
		System.out.println("Successfully verified redirected to rs site");
		return new SocialSite_TwiterPage (this.driver);
	}

}





