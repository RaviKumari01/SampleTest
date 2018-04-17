
package in.valtech.RoadScholar.pages;
import static in.valtech.custom.CustomFunction.user_Details;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount
 {
	private final WebDriver driver;
	
	public  static String randomstring="" ;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());
	public CreateAccount(WebDriver driver) 
	{

		this.driver = driver;
			
		System.out.println("Create an Account Pagee= "+driver.getTitle());
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("CAA_Page_XPATH"));

		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("CAA_Page_XPATH")),
				driver))) 
				{

			throw new IllegalStateException("This is not the RS Create an Account Page");
				}
	}
	
	
	By firstNameLink=By.xpath(ObjRepoProperty.getProperty("CAA_RSFirstName_XPATH"));
	By lastNameLink=By.xpath(ObjRepoProperty.getProperty("CAA_RSLastName_XPATH"));
	By emailLink=By.xpath(ObjRepoProperty.getProperty("CAA_RSEmail_XPATH"));
	By passwordLink=By.xpath(ObjRepoProperty.getProperty("CAA_RSPassword_XPATH"));
	By confirmpasswordLink=By.xpath(ObjRepoProperty.getProperty("CAA_RSConfirmPassword_XPATH"));
	By submitBtn=By.xpath(ObjRepoProperty.getProperty("CAA_RSSubmitBtn_XPATH"));
	By closeIcon=By.xpath(ObjRepoProperty.getProperty("CAA_RSCloseIcon_XPATH"));
	
	
	/**MethodName:Enter value into  FirstName TextBox
	 * @return CreateAccount page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public CreateAccount EnterValueIntoFirstNameTextBox( ) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println(" inside create acc page");
		String firstName= user_Details.getFirst_Name();
		System.out.println("first Name"+firstName );
		GUIFunctions. enterValueIntoTextBox(driver, firstNameLink ,firstName);
		Thread.sleep(1000);
		return new CreateAccount(driver);
	}

	/**MethodName:EnterValueIntolastNameTextBox
	 * * Description:This function enters lastname
	 * @return CreateAccount page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public CreateAccount EnterValueIntolastNameTextBox() throws InterruptedException
	{
		Thread.sleep(1000);
		String lastName= user_Details.getLast_Name();
		GUIFunctions. enterValueIntoTextBox(driver, lastNameLink , lastName);
		Thread.sleep(1000);
		return new CreateAccount(driver);
	}

	/**MethodName:Enter value into  Email TextBox
	 ** Description:This function enters  Email
	 * @return CreateAccount page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public CreateAccount EnterValueIntoEmailTextBox() throws InterruptedException
	{
		Thread.sleep(1000);
		
		String allowedChars = "abcdefghiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int stringLength = 8;
		for (int i=0; i<stringLength; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			System.out.println("num"+rnum);
			randomstring += allowedChars.substring(rnum,rnum+1);
			System.out.println(allowedChars.substring(rnum,rnum+1));
		}
		randomstring += "@gmail.com";
		System.out.println("Random email"+    randomstring);
		GUIFunctions. enterValueIntoTextBox(driver, emailLink ,   randomstring);
		Thread.sleep(1000);
		return new CreateAccount(driver);
	}

	/**MethodName:Enter value into  Password TextBox
	 ** Description:This function enters  Password
	 * @return CreateAccount page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public CreateAccount EnterValueIntoPasswordTextBox() throws InterruptedException
	{
		Thread.sleep(1000);
		String password= user_Details.getPassword();
		GUIFunctions. enterValueIntoTextBox(driver, passwordLink , password);
		Thread.sleep(1000);
		return new CreateAccount(driver);
	}
	
	/**MethodName:Enter value into  ConfirmPassword TextBox
	 ** Description:This function enters  Password
	 * @return CreateAccount page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public CreateAccount EnterValueIntoConfirmPasswordTextBox() throws InterruptedException
	{
		Thread.sleep(1000);
		String password= user_Details.getPassword();
		GUIFunctions. enterValueIntoTextBox(driver, confirmpasswordLink , password);
		Thread.sleep(1000);
		return new CreateAccount(driver);
	}

	/**MethodName:Click on Submit button
	 *Description:This function Click on  Submit button
	 * @return CreateAccount page
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */
	public  CreateAccount clickOnSubmitBtn() throws InterruptedException
	{
		Thread.sleep(5000);
		GUIFunctions.clickElement(driver, submitBtn, "submitButton");
		Thread.sleep(5000);
		System.out.println(" submit button clicked");
		return new CreateAccount(driver);
	}

	/**MethodName:Click on close Icon
	 *Description:This function Click on  close Icon
	 * @return HomePage
	 * @throws InterruptedException 
	 * Author:Anupriya
	 */

	public  HomePage clickOnCloseIcon() throws InterruptedException
	{
		Thread.sleep(5000);
		GUIFunctions.clickElement(driver, closeIcon, "closeIcon");
		Thread.sleep(5000);
		System.out.println(" close icon clicked");
		return new HomePage(driver);
	}

	







}


