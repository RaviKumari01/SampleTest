package in.valtech.RoadScholar.pages;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;

import java.util.List;

import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import static in.valtech.custom.CustomFunction.user_Details;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static in.valtech.util.PropertyFileReader.TextProperty;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PersonalInformationPage  
{
	private final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	public PersonalInformationPage(WebDriver driver)
	 {
	  this.driver = driver;
	
	  System.out.println("PersonalInformaion Page title= " + driver.getTitle());
	  
	  System.out.println("ObjRepoProperty.getProperty=="+ ObjRepoProperty.getProperty("PIP_PersonalInfoPage_XPATH"));
	  if (!(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("PIP_PersonalInfoPage_XPATH")), driver)))
	  {
	   throw new IllegalStateException("This is not the RS PersonalInformaion  page");
	  }
	  
	 }

	By PIP_PersonalInfoPage =By.xpath(ObjRepoProperty.getProperty("PIP_PersonalInfoPage_XPATH"));
	By PIP_UserName=By.xpath(ObjRepoProperty.getProperty("PIP_UserName_XPATH"));
	By PIP_Sucess_Uname=By.xpath(ObjRepoProperty.getProperty("PIP_Sucess_Uname_XPATH")); 
	By PIP_MiddleName=By.xpath(ObjRepoProperty.getProperty("PIP_MiddleName_XPATH"));
	By PIP_Save=By.xpath(ObjRepoProperty.getProperty("PIP_Save_XPATH"));
	By PIP_ChangeYourPassword=By.xpath(ObjRepoProperty.getProperty("PIP_ChangeYourPassword_XPATH"));
	By PIP_Error_Change_PWD=By.xpath(ObjRepoProperty.getProperty("PIP_Error_Change_PWD_XPATH"));
	By PIP_ChangePWd_Save=By.xpath(ObjRepoProperty.getProperty("PIP_ChangePWd_Save_XPATH"));
	By PIP_Email=By.xpath(ObjRepoProperty.getProperty("PIP_Email_XPATH"));
	By PIP_StayOnPage=By.xpath(ObjRepoProperty.getProperty("PIP_StayOnPage_XPATH"));
	By PIP_AddAHouseHolder=By.xpath(ObjRepoProperty.getProperty("PIP_AddAHouseHolder_XPATH"));
	By PIP_FirstName=By.xpath(ObjRepoProperty.getProperty("PIP_FirstName_XPATH"));
	By PIP_LastNmae=By.xpath(ObjRepoProperty.getProperty("PIP_LastNmae_XPATH"));
	By PIP_Month=By.xpath(ObjRepoProperty.getProperty("PIP_Month_XPATH"));
	By PIP_MonthDropDown=By.xpath(ObjRepoProperty.getProperty("PIP_MonthDropDown_XPATH"));
	By PIP_Day=By.xpath(ObjRepoProperty.getProperty("PIP_Day_XPATH"));
	By PIP_DayDropDown=By.xpath(ObjRepoProperty.getProperty("PIP_DayDropDown_XPATH"));
	By PIP_Year=By.xpath(ObjRepoProperty.getProperty("PIP_Year_XPATH"));
	By PIP_YearDropDown=By.xpath(ObjRepoProperty.getProperty("PIP_YearDropDown_XPATH"));
	By PIP_AddHouseHold=By.xpath(ObjRepoProperty.getProperty("PIP_AddHouseHold_XPATH"));
	By PIP_Address=By.xpath(ObjRepoProperty.getProperty("PIP_HouseHoldSucess_XPATH"));
	By PIP_City=By.xpath(ObjRepoProperty.getProperty("PIP_City_XPATH"));
	By PIP_Country=By.xpath(ObjRepoProperty.getProperty("PIP_Country_XPATH"));
	By PIP_CountryDropDown=By.xpath(ObjRepoProperty.getProperty("PIP_CountryDropDown_XPATH"));
	By PIP_HouseHoldSucess=By.xpath(ObjRepoProperty.getProperty("PIP_HouseHoldSucess_XPATH"));
	By PIP_AddHouseHold_Error=By.xpath(ObjRepoProperty.getProperty("PIP_AddHouseHold_Error_XPATH"));
	By PIP_SaveAndContinue=By.xpath(ObjRepoProperty.getProperty("PIP_SaveAndContinue_XPATH"));


	
	/**MethodName:VerifyPage
	 * Description:This function is to Verify User Page
	 * @return PersonalInformationPage
	 * @throws Exception 
	 * Author:Sravani
	 */
	public PersonalInformationPage VerifyPage()
	{
		 if ((CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("PIP_PersonalInfoPage_XPATH")), driver)))
		  {
			 System.out.println("Personal Information page has been verified");
		  }
		 else
		 {
			 System.out.println("user is not in personal information page");
		 }
		return new PersonalInformationPage(driver);
	}
	
	/**MethodName:VerifyUsername
	 * Description:This function is to Verify User name
	 * @return PersonalInformationPage
	 * @throws Exception 
	 * Author:Sravani
	 */
	public PersonalInformationPage VerifyUsername() throws Exception
	{
		String FirstName=driver.findElement(PIP_UserName).getAttribute("value");
		System.out.println("User name before editing is"+FirstName);
		log.info("User name before editing is"+FirstName);
		String UserName= user_Details.getFirst_Name();
		System.out.println("user id is"+UserName);
		if(UserName.startsWith(FirstName))
		{
			System.out.println("user name is validated");
			log.info("user name is validated");
		}
		else
		{
			System.out.println("Invalid User");
			log.info("Invalid User");
		}
		return new PersonalInformationPage(driver);
	}


	/**MethodName:VerifyUsername
	 * Description:This function is to Verify User name
	 * @return PersonalInformationPage
	 * @throws Exception 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClearMiddleName()
	{
		GUIFunctions.clear(driver,PIP_MiddleName);
		return new PersonalInformationPage(driver);
	}


	/**MethodName:ClickOnChangePwd
	 * Description:This function is to click on change password Link
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClickOnChangePwd1() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		GUIFunctions.clickElement(driver,PIP_ChangeYourPassword,"ChangePassword");
		Thread.sleep(5000);
		System.out.println("Verifing page");
		return new PersonalInformationPage(driver);
	}

	/**MethodName:EditMiddleName
	 * Description:This function is to Verify EditMiddleName
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage EditMiddleName() throws InterruptedException
	{
		String Name= user_Details.getLast_Name();
		GUIFunctions.enterValueIntoTextBox(driver,PIP_MiddleName,Name);
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:ClickSave
	 * Description:This function is to ClickSave
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClickSave() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,PIP_Save,"SaveButton");
		GUIFunctions.normalWait();
		System.out.println("verifing page");
		return new PersonalInformationPage(driver);
	}

	/**MethodName:VerifySucessMsg
	 * Description:This function is to Verify SucessMsg 
	 * @return PersonalInformationPage
	 * @throws Exception 
	 * Author:Sravani
	 */
	public PersonalInformationPage VerifySucessMsg() throws Exception
	{
		GUIFunctions.normalWait();
		GUIFunctions.assertVerify(driver,PIP_Sucess_Uname,"Updated account information has been saved.");
		return new PersonalInformationPage(driver);
	}

	/**MethodName:ClickOnChangePwd
	 * Description:This function is to click on change password Link
	 * @return ChangePassword
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public ChangePassword ClickOnChangePwd() throws InterruptedException
	{
		GUIFunctions.normalWait();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver,PIP_ChangeYourPassword,"ChangePassword");
		System.out.println("Verifing page");
		return new ChangePassword(driver);
	}

	/**MethodName:ChangeEmail
	 * Description:This function is to Change the Email address
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ChangeEmail() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		GUIFunctions.normalWait();
		String Email= user_Details.getEmail_Address();
		GUIFunctions.enterValueIntoTextBox(driver,PIP_Email,Email);	
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:ChangeEmailandsave
	 * Description:This function is to Change the Email address
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	
		public PersonalInformationPage ChangeEmailAndSave() throws InterruptedException
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)", "");
			GUIFunctions.normalWait();
			String Email= user_Details.getEmail_Address();
			GUIFunctions.enterValueIntoTextBox(driver,PIP_Email,Email);	
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver,PIP_ChangeYourPassword,"ChangePassword");
			GUIFunctions.normalWait();
			GUIFunctions.clickElement(driver,PIP_SaveAndContinue,"Save and Continue");
			return new PersonalInformationPage(driver);
		
	}


	/**MethodName:ClickOnStayOnPage
	 * Description:This function is to click on StayOnPage Button
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClickOnStayOnPage() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,PIP_StayOnPage,"Stay On Page");
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:ClickOnAddHouseHolder
	 * Description:This function is to Click On Add HouseHolder Button
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClickOnAddHouseHolder() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,PIP_AddAHouseHolder,"Add A HouseHolder");
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:FirstName
	 * Description:This function is to enter value in first name field
	 * @return PersonalInformationPage
	 * @throws Exception 
	 */
	public PersonalInformationPage FirstName() throws Exception
	{
		String Name=user_Details.getFirst_Name();
		GUIFunctions.enterValueIntoTextBox(driver,PIP_FirstName,Name);
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:LastName
	 * Description:This function is to enter value in Middle name field
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage LastName() throws InterruptedException
	{
		String LastName=user_Details.getLast_Name();
		System.out.println("last name is "+LastName);
		log.info("last name is "+LastName);
		GUIFunctions.enterValueIntoTextBox(driver,PIP_LastNmae,LastName);
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	/**MethodName:Month
	 * Description:This function is to enter value in Month
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage Month() throws InterruptedException
	{
		String Month=user_Details.getDOB_Month();
		System.out.println("month value is"+Month);
		log.info("month value is"+Month);
		GUIFunctions.clickElement(driver,PIP_Month,Month);
		GUIFunctions.normalWait();
		java.util.List<WebElement> lst=driver.findElements(PIP_MonthDropDown);
		System.out.println("size of month field is "+lst.size());
		for(WebElement a:lst)
		{
			GUIFunctions.normalWait();
			if(a.getText().equalsIgnoreCase(Month))
			{
				a.click();
			}
		}
		return new PersonalInformationPage(driver);
	}

	/**MethodName:Day
	 * Description:This function is to enter value in Day
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage Day() throws InterruptedException
	{
		String Day=user_Details.getDOB_Day();
		System.out.println("Day is "+Day);
		log.info("Day is "+Day);
		GUIFunctions.clickElement(driver,PIP_Day,Day);
		GUIFunctions.normalWait();
		java.util.List<WebElement> lst=driver.findElements(PIP_DayDropDown);
		System.out.println("size of Day field is "+lst.size());
		for(WebElement b:lst)
		{
			System.out.println(b.getText());
			GUIFunctions.normalWait();
			if(b.getText().equals(Day))
			{
				System.out.println("clciking on day");
				b.click();
				break;
			}
		}
		return new PersonalInformationPage(driver);
	}

	/**MethodName:Year
	 * Description:This function is to enter value in Year
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage Year() throws InterruptedException
	{
		String Year=user_Details.getDOB_Year();
		System.out.println("Year is "+Year);
		log.info("Year is "+Year);
		GUIFunctions.clickElement(driver,PIP_Year,Year);
		GUIFunctions.normalWait();
		java.util.List<WebElement> lst=driver.findElements(PIP_YearDropDown);
		System.out.println("size of Year field is "+lst.size());
		for(WebElement c:lst)
		{
			GUIFunctions.normalWait();
			if(c.getText().contentEquals(Year))
			{
				System.out.println("clicking on year");
				c.click();
				break;
			}
			else
			{
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,50)", "");
			}
		}
		return new PersonalInformationPage(driver);
	}

	/**MethodName:ClickOnAddHouse
	 * Description:This function is to click on StayOnPage Button
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClickOnAddHouse() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		GUIFunctions.clickElement(driver,PIP_AddHouseHold,"Add HouseHolder Member");
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}


	/**MethodName:verifySucessHouseHoldMem
	 * Description:This function is to verifySucessHouseHoldMem
	 * @return PersonalInformationPage
	 * @throws Exception 
	 * Author:Sravani
	 */
	public PersonalInformationPage verifySucessHouseHoldMem() throws Exception
	{
		String sucessString =driver.findElement(PIP_HouseHoldSucess).getText();
		System.out.println("value of string is "+sucessString);
		GUIFunctions.normalWait();
		if(sucessString.equalsIgnoreCase(TextProperty.getProperty("PIP_SucessAddHouseMember")))
		{
			System.out.println("A Message of "+TextProperty.getProperty("PIP_SucessAddHouseMember")+" has been displayed ");
			log.info("A Message of "+TextProperty.getProperty("PIP_SucessAddHouseMember")+" has been displayed ");
		}
		else
		{
			System.out.println("A Message of "+TextProperty.getProperty("PIP_SucessAddHouseMember")+" has not been displayed ");
			log.info("A Message of "+TextProperty.getProperty("PIP_SucessAddHouseMember")+" has not been displayed ");
		}

		return new PersonalInformationPage(driver);
	}


	/**MethodName:Address	 
	 * Description:This function is to enter value in Address field
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage Address() throws InterruptedException
	{
		String Address=user_Details.getAddress();
		System.out.println("Address is "+Address);
		log.info("Address is "+Address);
		GUIFunctions.enterValueIntoTextBox(driver,PIP_Address,Address);
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}


	/**MethodName:City
	 * Description:This function is to enter value in City field
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage City() throws InterruptedException
	{
		String City=user_Details.getCity();
		System.out.println("City is "+City);
		log.info("City is "+City);
		GUIFunctions.enterValueIntoTextBox(driver,PIP_City,City);
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}

	
	/**MethodName:Country
	 * Description:This function is to enter value in country
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage Country() throws InterruptedException
	{
		String Country=user_Details.getCountry();
		System.out.println("Country is "+Country);
		GUIFunctions.clickElement(driver,PIP_Country,Country);
		GUIFunctions.normalWait();
		java.util.List<WebElement> lst=driver.findElements(PIP_CountryDropDown);
		System.out.println("size of Year field is "+lst.size());
		for(WebElement c:lst)
		{
			System.out.println(c.getText());
			if(c.getText().equalsIgnoreCase(Country))
			{
				System.out.println("clicking on Country");
				c.click();
			}
		}
		return new PersonalInformationPage(driver);
	}


	/**MethodName:verifyHouseHoldError
	 * Description:This function is to verifyHouseHoldError
	 * @return PersonalInformationPage
	 * @throws Exception 
	 * Author:Sravani
	 */
	public PersonalInformationPage verifyHouseHoldError() throws Exception
	{

		GUIFunctions.normalWait();
		if(CustomFunction.isElementPresent(PIP_AddHouseHold_Error,driver))
		{
			System.out.println("A Message of "+TextProperty.getProperty("PIP_HouseHold_Error")+" has been displayed ");
			log.info("A Message of "+TextProperty.getProperty("PIP_HouseHold_Error")+" has been displayed" );
		}
		else{
			System.out.println("A Message of "+TextProperty.getProperty("PIP_HouseHold_Error")+" has not been displayed ");
			log.info("A Message of "+TextProperty.getProperty("PIP_HouseHold_Error")+" has not been displayed ");
		}
		return new PersonalInformationPage(driver);
	}


	/**MethodName:ClickOnSaveAndContinue
	 * Description:This function is to click on StayOnPage Button
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public PersonalInformationPage ClickOnSaveAndContinue() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver,PIP_SaveAndContinue,"Save and Continue");
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}
	
	
	/**MethodName:VerifytheaddedHouseHoldMember
	 * Description:This function is to click on StayOnPage Button
	 * @return PersonalInformationPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	/*public PersonalInformationPage VerifytheaddedHouseHoldMember() throws InterruptedException
	{
		GUIFunctions.normalWait();
		String FirstName=user_Details.getFirst_Name();
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='api-profile-avatar icon-uniE8F5']"));
		List<WebElement> all_Links = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
	     int cnt = all_Links.size();
	     for(int i=0;i<cnt;i++)
	     {
	      String text =all_Links.get(i).getText();
	     Reporter.log(text,true);
	      
	     }
		for(WebElement a:lst)
		{
			System.out.println(a.getText());
			if(a.getText().startsWith(FirstName))
			{
				System.out.println("sucessfully verified the household member");
			}
		}
	
		GUIFunctions.normalWait();
		return new PersonalInformationPage(driver);
	}*/
}