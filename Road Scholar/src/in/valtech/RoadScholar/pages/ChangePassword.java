package in.valtech.RoadScholar.pages;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import static in.valtech.custom.CustomFunction.user_Details;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ChangePassword 
{
	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	public ChangePassword(WebDriver driver)
	{
		this.driver = driver;
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("CP_Rs_ChangePwd_XPATH"));

		if(!(CustomFunction
				.isElementPresent(
						By.xpath(ObjRepoProperty.getProperty("CP_Rs_ChangePwd_XPATH")),
						driver))) 
		{

			throw new IllegalStateException("user is not in Change Paswword Page Page");
		}

	}

	By CP_Rs_ChangePwd =By.xpath(ObjRepoProperty.getProperty("CP_Rs_ChangePwd_XPATH"));
	By CP_Error_Change_PWD=By.xpath(ObjRepoProperty.getProperty("CP_Error_Change_PWD_XPATH"));
	By CP_ChangePWd_Save=By.xpath(ObjRepoProperty.getProperty("CP_ChangePWd_Save_XPATH"));
	By CP_Password=By.xpath(ObjRepoProperty.getProperty("CP_Password_XPATH"));
	By CP_ReTypePwd=By.xpath(ObjRepoProperty.getProperty("CP_ReTypePwd_XPATH"));
	By CP_PwdMissMatch_Error=By.xpath(ObjRepoProperty.getProperty("CP_PwdMissMatch_Error_XPATH"));
	By CP_MyAccount=By.xpath(ObjRepoProperty.getProperty("CP_MyAccount_XPATH"));
	By CP_Signout=By.xpath(ObjRepoProperty.getProperty("CP_Signout_XPATH"));
	By CP_PasswordSucess=By.xpath(ObjRepoProperty.getProperty("CP_PasswordSucess_XPATH"));


	/**MethodName:ClickonSave
	 * Description:This function is to Click on save
	 * @return ChangePassword
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public ChangePassword ClickOnSave() throws InterruptedException
	{
		System.out.println("entered click on save");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver,CP_ChangePWd_Save,"Save");
		GUIFunctions.normalWait();
		return new ChangePassword(driver);
	}

	/**MethodName:VerifyErrorMsg
	 * Description:This function is to Verify ErrorMsg 
	 * @return ChangePassword
	 * @throws Exception 
	 * Author:Sravani
	 */
	public ChangePassword VerifyErrorMsg() throws Exception
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CP_Error_Change_PWD,driver);
		if(driver.findElement(CP_Error_Change_PWD).isDisplayed())
		{
			System.out.println("An Error message of  Please review and fix the highlighted fields. is displayed.");
			log.info("An Error message of  Please review and fix the highlighted fields. is displayed.");
		}
		else{
			System.out.println("An Error message of  Please review and fix the highlighted fields. is not displayed.");
			log.info("An Error message of  Please review and fix the highlighted fields. is not displayed.");
		}
		GUIFunctions.normalWait();
		return new ChangePassword(driver);
	}

	/**MethodName:NavigateBack
	 * Description:This function is to click on navigate Back
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage NavigateBack() throws InterruptedException
	{
		GUIFunctions.navigateBack(driver);
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:EnterPwd
	 * Description:This function is to enter the password.
	 * @return ChangePassword
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public ChangePassword EnterPwd() throws InterruptedException
	{
		System.out.println("getting value from excel");
		String Passsword = user_Details.getPassword();
		System.out.println("PASSWORD value is ="+Passsword);
		GUIFunctions.enterValueIntoTextBox(driver,CP_Password, Passsword);
		System.out.println("Value is passed");
		GUIFunctions.normalWait();
		return new ChangePassword(driver);
	}

	/**MethodName:EnterReTypePwd
	 * Description:This function is to enter the password in Re enter password field.
	 * @return ChangePassword
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public ChangePassword EnterReTypePwd() throws InterruptedException
	{
		System.out.println("Entered in re enter password method");
		String Passsword = user_Details.getFirst_Name();
		System.out.println("Re Type Password value  value is "+Passsword);
		GUIFunctions.enterValueIntoTextBox(driver,CP_ReTypePwd,Passsword);
		GUIFunctions.normalWait();
		return new ChangePassword(driver);
	}

	/**MethodName:VerifyPwdMisssMatchError
	 * Description:This function is to Verify ErrorMsg 
	 * @return ChangePassword
	 * @throws Exception 
	 * Author:Sravani
	 */
	public ChangePassword VerifyPwdMisssMatchError() throws Exception
	{
		GUIFunctions.normalWait();
		if(driver.findElement(CP_PwdMissMatch_Error).isDisplayed())
		{
			System.out.println("An Error message of  This password does not match the one you originally created. Please try again.. is displayed.");
			log.info("An Error message of  This password does not match the one you originally created. Please try again. is displayed.");
		}
		else
		{
			System.out.println("An Error message of  This password does not match the one you originally created. Please try again. is not displayed.");
			log.info("An Error message of This password does not match the one you originally created. Please try again.. is not displayed.");
		}
		GUIFunctions.normalWait();
		return new ChangePassword(driver);
	}


	/**MethodName:EnterReTypeCorrectPwd
	 * Description:This function is to enter the password in Re enter password field.

	 * @return ChangePassword
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public ChangePassword EnterReTypeCorrectPwd() throws InterruptedException
	{
		System.out.println("Entered in re enter password method");
		String Passsword = user_Details.getPassword();
		System.out.println("Passord value  value is "+Passsword);
		GUIFunctions.enterValueIntoTextBox(driver,CP_ReTypePwd,Passsword);
		GUIFunctions.normalWait();
		return new ChangePassword(driver);
	}

	/**MethodName:Signout
	 * Description:This function is to click sign out button
	 * @return HomePage
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public HomePage SignOut() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,CP_MyAccount,"MyAccount");
		GUIFunctions.clickElement(driver,CP_Signout,"Signout");
		GUIFunctions.normalWait();
		return new HomePage(driver);
	}

	/**MethodName:PasswordSucess
	 * Description:This function is to enter the password in Re enter password field.
	 * @return ChangePassword
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public ChangePassword PasswordSucess() throws InterruptedException
	{
		String sucessString =driver.findElement(CP_PasswordSucess).getText();
		System.out.println("value of string is "+sucessString);
		GUIFunctions.normalWait();
		if(sucessString.equalsIgnoreCase(TextProperty.getProperty("CP_PasswordSucess")))
		{
			System.out.println("A Message of "+TextProperty.getProperty("CP_PasswordSucess")+" has been displayed ");
		}
		else
		{
			System.out.println("A Message of "+TextProperty.getProperty("CP_PasswordSucess")+" has not been displayed ");
		}
		return new ChangePassword(driver);
	}
}
