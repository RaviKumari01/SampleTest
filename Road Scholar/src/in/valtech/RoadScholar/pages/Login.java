package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Login {

	final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());
	public Login(WebDriver driver) {
		this.driver=driver;
		log.info("Login page"+ driver.getTitle());
		System.out.println("page title  "+driver.getTitle());
		if(!CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("Log_SignInPage_XPATH")), driver))
		{
			throw new  IllegalStateException("This is not the RS login page");
		}

	}

	
	By rsLoginEmailaddress=By.xpath(ObjRepoProperty.getProperty("Log_UsernameTxtBox_XPATH"));
	By rsLoginPswd=By.xpath(ObjRepoProperty.getProperty("Log_PasswordTxtBox_XPATH"));
	By rssignbtn=By.xpath(ObjRepoProperty.getProperty("Log_SignInBtn_XPATH"));
	
	/**MethodName=Navigate to App URL
	 *Description:
	 **Author: Anupriya
	 */
	public Login navigateToApplication_URL(WebDriver driver, String homeURL, String driverName) throws InterruptedException
	{
		System.out.println("before loading url --->Login url");
		// navigate to RS URL
		driver.get(homeURL);
		Reporter.log("Page Title:" + driver.getTitle());
		System.out.println("Page Title:" + driver.getTitle());
		return new Login(driver);
	}

	/**MethodName=EnterEmail
	 *Description:This function enters Email
	 **Author: Anupriya
	 */
	
	public  Login EnterEmail(String emailaddress) throws InterruptedException
	{
		System.out.println("inside login page **********************");
		Thread.sleep(5000);	
		GUIFunctions.enterValueIntoTextBox(driver, rsLoginEmailaddress, emailaddress);
		Thread.sleep(5000);
		return new Login( driver);
	}


	/**MethodName=EnterPassword
	 *Description:This function enters Password
	 **Author: Anupriya
	 */
	
	public  Login EnterPassword(String password) throws InterruptedException
	{
		GUIFunctions.enterValueIntoTextBox(driver,rsLoginPswd, password);
		Thread.sleep(5000);
		return new Login(driver);
	}

	/**MethodName=click on Sign in Btn
	 *Description:This function Clicks On Sign inButton
	 **Author: Anupriya
	 */
	
	public  HomePage clickOnSignBtn() throws InterruptedException
	{
		Thread.sleep(5000);
		GUIFunctions.clickElement(driver, rssignbtn, "SignIn");
		Thread.sleep(5000);
		System.out.println(" sign in button clicked");
		return new HomePage(driver);
	}

}
