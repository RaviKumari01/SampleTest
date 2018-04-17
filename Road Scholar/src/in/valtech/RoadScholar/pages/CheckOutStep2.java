package in.valtech.RoadScholar.pages;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;

import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import static in.valtech.custom.CustomFunction.user_Details;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckOutStep2 
{
	public static WebDriver driver;

	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	//CheckOut step2 Page Constructor
	public CheckOutStep2(WebDriver driver)
	
	{
		this.driver=driver;
		log.info("RS CheckOut step2 Page title" + driver.getTitle());
		// Check that we're on the right page-RS Checkout step2 page
		if(driver.getTitle().contentEquals(TextProperty.getProperty("checkOutPageTitle")))

		{
			log.info("user is in checkout STEP2  page");
			System.out.println("user is in checkout step2  Page ");
		}
		else
		{
			log.info("user is not in checkout Step2 Page");
			System.out.println("user is not in checkout step2 Page ");
		}
	}

	By CS2_FirstName=By.xpath(ObjRepoProperty.getProperty("CS2_FirstName_XPATH"));
	By CS2_LastName=By.xpath(ObjRepoProperty.getProperty("CS2_LastName_XPATH"));
	By CS2_Address=By.xpath(ObjRepoProperty.getProperty("CS2_Address_XPATH"));
	By CS2_City=By.xpath(ObjRepoProperty.getProperty("CS2_City_XPATH"));
	By CS2_ZipCode=By.xpath(ObjRepoProperty.getProperty("CS2_ZipCode_XPATH"));
	By CS2_PhoneNumber=By.xpath(ObjRepoProperty.getProperty("CS2_PhoneNumber_XPATH"));
	By CS2_RSContinueBtn=By.xpath(ObjRepoProperty.getProperty("CS2_RSContinueBtn_XPATH"));
	By CS2_ClearError=By.xpath(ObjRepoProperty.getProperty("CS2_ClearError_XPATH"));
	By CS2_AddHouseHoldMenmber=By.xpath(ObjRepoProperty.getProperty("CS2_AddHouseHoldMenmber_XPATH"));
	By CS2_FirstHouseHold=By.xpath(ObjRepoProperty.getProperty("CS2_FirstHouseHold_XPATH"));
	By CS2_LastHouseHold=By.xpath(ObjRepoProperty.getProperty("CS2_LastHouseHold_XPATH"));
	By CS2_HouseHoldSubmit=By.xpath(ObjRepoProperty.getProperty("CS2_HouseHoldSubmit_XPATH"));
        By CS2_RSYourPreferences=By.xpath(ObjRepoProperty.getProperty("CS2_RSYourPreferences_XPATH"));
	By CS2_RSContactInformation=By.xpath(ObjRepoProperty.getProperty("CS2_RSContactInformation_XPATH"));
	By CS2_RSAddres=By.xpath(ObjRepoProperty.getProperty("CS2_RSAddress_XPATH"));
	By CS2_RSFirstName=By.xpath(ObjRepoProperty.getProperty("CS2_RSFirstName_XPATH"));
	By CS2_RSLastName=By.xpath(ObjRepoProperty.getProperty("CS2_RSLastName_XPATH"));
	By CS2_RSCity=By.xpath(ObjRepoProperty.getProperty("CS2_RSCity_XPATH"));
	By CS2_RSZipCode=By.xpath(ObjRepoProperty.getProperty("CS2_RSZipCode_XPATH"));
	By CS2_RSStateDropDown=By.xpath(ObjRepoProperty.getProperty("CS2_RSStateDropDown_XPATH"));
	By CS2_RSCountryDropDown=By.xpath(ObjRepoProperty.getProperty("CS2_RSCountryDropDown_XPATH"));
	By CS2_RSPhoneNumber=By.xpath(ObjRepoProperty.getProperty("CS2_RSPhoneNumber_XPATH"));
	By CS2_RSAddess=By.xpath(ObjRepoProperty.getProperty("CS2_RSAddess_XPATH"));
	By CS2_RSSelectUSA=By.xpath(ObjRepoProperty.getProperty("CS2_RSSelectUSA_XPATH"));
	
	By CS2_RSStateError=By.xpath(ObjRepoProperty.getProperty("CS2_RSStateError_XPATH"));		
	By CS2_RSSelectState=By.xpath(ObjRepoProperty.getProperty("CS2_RSSelectState_XPATH"));
	By CS2_RSYourDetail=By.xpath(ObjRepoProperty.getProperty("CS2_RSYourDetail_XPATH"));
	By CS2_RSOrderSummary=By.xpath(ObjRepoProperty.getProperty("CS2_RSOrderSummary_XPATH"));
	By CS2_RSOrderSummaryContinueBtn=By.xpath(ObjRepoProperty.getProperty("CS2_RSOrderSummaryContinueBtn_XPATH"));
	By CS2_RSTalkToUs=By.xpath(ObjRepoProperty.getProperty("CS2_RSTalkToUs_XPATH"));
	By CS2_RSPriceOverviewSection=By.xpath(ObjRepoProperty.getProperty("CS2_RSPriceOverviewSection_XPATH"));
	By CS2_RSBackButton=By.xpath(ObjRepoProperty.getProperty("CS2_RSBackButton_XPATH"));

	/**MethodName:clearFirstName
	 * Description:This function is to Clear First Name Field
	 * @return CheckOutStep1
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep2 clearFirstName()
	{
		GUIFunctions.clear(driver, CS2_FirstName);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:SpecialFirstName
	 * Description:This function is to enter special charector in first name field.
	 * @return CheckOutStep2
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep2 SpecialFirstName()
	{
		String FirstName= user_Details.getFirst_Name();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_FirstName, FirstName);
		return new CheckOutStep2(driver) ;
	}


	/**MethodName:clearLastName
	 * Description:This function is to Clear Last Name Field.
	 * @return CheckOutStep2
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep2 clearLastName()
	{
		GUIFunctions.clear(driver, CS2_LastName);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:SpecialLastName
	 * Description:This function is to enter special charector in address field.
	 * @return CheckOutStep2
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep2 SpecialLastName()
	{
		String LastName= user_Details.getLast_Name();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_LastName, LastName);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:clearAddressField
	 * Description:This function is to Clear Address Field.
	 * @return CheckOutStep2
	 * Author:Sravani
	 */

	public CheckOutStep2 clearAddressField()
	{
		GUIFunctions.clear(driver, CS2_Address);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:SpecialAddressField
	 * Description:This function is to enter special charector in address field.
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 SpecialAddressField()
	{
		String Address= user_Details.getEmail_Address();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_Address, Address);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:clearCity
	 * Description:This function is to Clear City Field.
	 * @return CheckOutStep2
	 * Author:Sravani
	 */

	public CheckOutStep2 clearCity()
	{
		GUIFunctions.clear(driver, CS2_City);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:SplCityField
	 * Description:This function is to enter special charector in City field.
	 * @return CheckOutStep2
	 * Author:Sravani
	 */

	public CheckOutStep2 SplCityField()
	{
		String City= user_Details.getCity();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_City, City);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:clearZipCode
	 * Description:This function is to Clear ZipCode.
	 * @return CheckOutStep1 
	 * Author:Sravani
	 */
	public CheckOutStep2 clearZipCode()
	{
		GUIFunctions.clear(driver, CS2_ZipCode);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:SplZipCode
	 * Description:This function is to enter special charector in ZipCode field.
	 * @return CheckOutStep1
	 * @throws InterruptedException 
	 * Author:Sravani
	 */

	public CheckOutStep2 SplZipCode()
	{
		String Zipcode= user_Details.getFirst_Name();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_ZipCode, Zipcode);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:clearPhoneNumber
	 * Description:This function is to clear PhoneNumber 
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 clearPhoneNumber()
	{
		GUIFunctions.clear(driver, CS2_PhoneNumber);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:SplPhoneNumber
	 * Description:This function is to enter special charector in Phone Number field
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 SplPhoneNumber()
	{
		String PhoneNumber= user_Details.getPhone_Number();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_PhoneNumber, PhoneNumber);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:Continue
	 * Description:This function is to click on Continue
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 Continue() throws InterruptedException
	{
		Thread.sleep(1000);
		GUIFunctions.clickElement(driver, CS2_RSContinueBtn, "Continue");
		return new CheckOutStep3(driver) ;
	}



	/**MethodName:ClearError
	 * Description:This function is to find the error message when we clear all the data
	 * @return CheckOutStep2
	 * Author:Sravani
	 */

	public CheckOutStep2 ClearError() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1000)", "");
		String ErrorString =driver.findElement(CS2_ClearError).getText();
		System.out.println("value of string is "+ErrorString);
		GUIFunctions.normalWait();
		if(ErrorString.equalsIgnoreCase(TextProperty.getProperty("ClearError")))
		{

			System.out.println("A Message of "+TextProperty.getProperty("ClearError")+" has been displayed ");

		}
		else
		{
			System.out.println("A Message of "+TextProperty.getProperty("CP_PasswordSucess")+" has not been displayed ");

		}
		return new CheckOutStep2(driver);
	}

	/**MethodName:SpecialError
	 * Description:This function is to verify SpecialError
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 SpecialError() throws InterruptedException
	{
		String ErrorString =driver.findElement(CS2_ClearError).getText();
		System.out.println("value of string is "+ErrorString);
		GUIFunctions.normalWait();
		if(ErrorString.equalsIgnoreCase(TextProperty.getProperty("ClearError")))
		{

			System.out.println("A Message of "+TextProperty.getProperty("ClearError")+" has been displayed ");

		}
		else
		{
			System.out.println("A Message of "+TextProperty.getProperty("CP_PasswordSucess")+" has not been displayed ");

		}
		return new CheckOutStep2(driver);
	}

	/**MethodName:AddHouseHoldMember
	 * Description:This function is to click on AddHouseHoldMember
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 AddHouseHoldMember()
	{

		GUIFunctions.clickElement(driver, CS2_AddHouseHoldMenmber, "HouseHoldMember");
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:FirstHouseHold
	 * Description:This function is to enter special charector in first name field
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 FirstHouseHold()
	{
		String FirstName= user_Details.getFirst_Name();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_FirstHouseHold, FirstName);
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:LastHouseHold
	 * Description:This function is to enter special charector in Last name field
	 * @return CheckOutStep2
	 * Author:Sravani
	 */
	public CheckOutStep2 LastHouseHold()
	{
		String FirstName= user_Details.getLast_Name();
		GUIFunctions.enterValueIntoTextBox(driver, CS2_LastHouseHold, FirstName);
		return new CheckOutStep2(driver) ;
	}



	/**MethodName:clickSubmit
	 * Description:This function is to clickSubmit.
	 * @return CheckOutStep2
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep2 clickSubmit()
	{
		GUIFunctions.clickElement(driver, CS2_HouseHoldSubmit, "submit");
		return new CheckOutStep2(driver) ;
	}


	
	/**MethodName:verifyYourDetailTab()
	 * Description:This function verify the Your Details Tab at the top of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyYourDetailTab() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSYourDetail, driver);
		return new CheckOutStep2(driver);
	}
	
	/**MethodName:verifyPreference()
	 * Description:This function verify the preference section of checkout step3 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyPreference() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSYourPreferences, driver);
		return new CheckOutStep2(driver);
	}

	
	/**MethodName:verifyContactInformation()
	 * Description:This function Verify the contact information section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyContactInformation() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSContactInformation, driver);
		return new CheckOutStep2(driver);
	}

	/**MethodName:verifyAddress()
	 * Description:This function Verify the address field under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyAddress() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSAddres, driver);
		return new CheckOutStep2(driver);
	}

	/**MethodName:verifyFirstName()
	 * Description:This function Verify the first name field under contact information section 
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyFirstName() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSFirstName, driver);
		return new CheckOutStep2(driver);
	}

	/**MethodName:verifyLastName()
	 * Description:This function Verify the last name field under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyLastName() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSLastName, driver);
		return new CheckOutStep2(driver);
	}

 
	/**MethodName:verifyCity()
	 * Description:This function Verify the city field under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyCity() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSCity, driver);
		return new CheckOutStep2(driver);
	}

	
	/**MethodName:verifyZipCode()
	 * Description:This function Verify the zip code field under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyZipCode() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSZipCode, driver);
		return new CheckOutStep2(driver);
	}

	/**MethodName:verifyStateDropDown()
	 * Description:This function Verify the state drop down under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyStateDropDown() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSStateDropDown, driver);
		return new CheckOutStep2(driver);
	}

	
	/**MethodName:verifyCountryDropDown()
	 * Description:This function Verify the country drop down under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyCountryDropDown() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSCountryDropDown, driver);
		return new CheckOutStep2(driver);
	}

	
	/**MethodName:verifyPhoneNumber()
	 * Description:This function Verify the phone number field  under contact information section
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyPhoneNumber() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSPhoneNumber, driver);
		return new CheckOutStep2(driver);
	}
	
	/**MethodName:enterTextIntoFirstNameField
	 * Description:This function enters the data into first name field
	 * @return CheckOutStep 2
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 enterTextIntoFirstNameField() throws InterruptedException
	{
		Thread.sleep(1000);
		//get the value from excell sheet
		String FirstName=user_Details.getFirst_Name();
     	System.out.println("First_Name"+FirstName);
		//enter the value into first name text field
		GUIFunctions.enterValueIntoTextBox(driver, CS2_RSFirstName , FirstName);
		System.out.println("Value entered into the first name text box");
		log.info("Value entered into the first name text box");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:enterTextIntoLastNameField
	 * Description:This function enters the data into last name field
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException 
	 * Author:Manjula
	 */
	public CheckOutStep2 enterTextIntoLastNameField() throws InterruptedException
	{
		//get the value from excell sheet
		String LastName=user_Details.getLast_Name();
		System.out.println("Last Name"+LastName);
		//enter the value into last name text field
		GUIFunctions.enterValueIntoTextBox(driver,CS2_RSLastName , LastName);
		System.out.println("Value entered into the last name text box");
		log.info("Value entered into the last name text box");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:enterTextIntoAddressField
	 * Description:This function enters the data into Address field
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 enterTextIntoAddressField() throws InterruptedException
	{
		//get the value from excell sheet
		String Address=user_Details.getAddress();
		System.out.println("Address"+Address);

		//enter the text into email address field
		GUIFunctions.enterValueIntoTextBox(driver, CS2_RSAddess , Address);
		System.out.println("Value entered into the email address text box");
		log.info("Value entered into the email address text box");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:enterTextIntoCityField
	 * Description:This function enters the data into city field
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 enterTextIntoCityField() throws InterruptedException
	{

		String City=user_Details.getCity();
		System.out.println("City"+City);
		GUIFunctions.enterValueIntoTextBox(driver, CS2_RSCity , City);
		System.out.println("Value entered into the city text box");
		log.info("Value entered into the city text box");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:enterTextIntoPhoneNumberField
	 * Description:This function enters the data into phone number field
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 enterTextIntoPhoneNumberField() throws InterruptedException
	{

		String PhoneNumber=user_Details.getPhone_Number();
		System.out.println("Phone number"+PhoneNumber);
		GUIFunctions.enterValueIntoTextBox(driver, CS2_RSPhoneNumber ,PhoneNumber);
		System.out.println("Value entered into the phone number text box");
		log.info("Value entered into the phone number text box");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:enterValueIntoZipCodeField
	 * Description:This function enters the data into zip code field
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 enterValueIntoZipCodeField() throws InterruptedException
	{
	
		String ZipCode=user_Details.getZipCode();
		System.out.println(ZipCode);
		GUIFunctions.enterValueIntoTextBox(driver, CS2_RSZipCode , ZipCode);
		System.out.println("Value entered into the Zip Code text box");
		log.info("Value entered into the Zip Code text box");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);

	}

	/**MethodName:SelectUSFromDropDown
	 * Description:This function select the US from drop down
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 SelectUSFromDropDown() throws InterruptedException
	{

		GUIFunctions.clickElement(driver, CS2_RSCountryDropDown, "Country");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CS2_RSSelectUSA, "Country");
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:clickOnContinueBtn()
	 * Description:This function click on continue button
	 * @return CheckOutStep 2 page
	 * @throws InterruptedException
	 * Author:Manjula
	 */
	public CheckOutStep2 clickOnContinueBtn() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CS2_RSContinueBtn, "Country");
		GUIFunctions.normalWait();
		GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:SelectCountry
	 * Description:This function select the country from country drop down and 
	 *                   click on continue button and verify the error message.
	 * @return CheckOutStep 2 page
	 * @throws Exception 
	 */ 
	public CheckOutStep2 selectCountry() throws Exception
	{

		String[] CountryName= (user_Details.getCountry().split(","));     
		String country1=CountryName[0];
		System.out.println(country1);
		String country2=CountryName[1];
		System.out.println(country2);
        GUIFunctions.clickElement(driver, CS2_RSCountryDropDown, "country"); 
		Thread.sleep(3000);
        driver.findElement(By.xpath("//li[text()='Canada']")).click();
        GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CS2_RSContinueBtn, "Continuebutton");
		GUIFunctions.normalWait();
		GUIFunctions.assertVerify(driver, CS2_RSStateError, TextProperty.getProperty("stateError"));
		GUIFunctions.normalWait();
		driver.findElement(By.xpath("//li[text()='USA']")).click();
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CS2_RSContinueBtn, "Country");
		GUIFunctions.normalWait();
		GUIFunctions.assertVerify(driver, CS2_RSStateError, TextProperty.getProperty("stateError"));
		GUIFunctions.normalWait();
        return new CheckOutStep2(driver);
     }


	/**MethodName:verifyError
	 * Description:This function verify the error
	 * @return CheckOutStep2
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyError() throws Exception
	{
		GUIFunctions.assertVerify(driver, CS2_RSStateError, TextProperty.getProperty("stateError"));
        GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}

	/**MethodName:Selectstate
	 * Description:This function Select state 
	 * @return CheckOutStep2
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CheckOutStep2 Selectstate() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,CS2_RSStateDropDown, "State");
		GUIFunctions.normalWait();
        GUIFunctions.clickElement(driver,CS2_RSSelectState, "State");
		return new CheckOutStep2(driver);
	}
	
	/**MethodName:verifyOrderSummarySection()
	 * Description:This function verify the order summary section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyOrderSummarySection() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSOrderSummary, driver);
		return new CheckOutStep2(driver);
	}
	
	/**MethodName:verifyOrderSummaryContinueButton()
	 * Description:This function verify the continue button displayed under the order summary section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyOrderSummaryContinueButton() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSYourDetail, driver);
		return new CheckOutStep2(driver);
	}

	/**MethodName:verifyTalkToUsSection()
	 * Description:This function verify talk to section is displayed under order summary section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyTalkToUsSection() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSTalkToUs, driver);
		return new CheckOutStep2(driver);
	}

	/**MethodName:verifyPriceOverviewSection()
	 * Description:This function verify price overview section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyPriceOverviewSection() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSPriceOverviewSection, driver);
		return new CheckOutStep2(driver);
	}
	
	/**MethodName:verifyBackButton()
	 * Description:This function verify back button is displayed under price overview section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyBackButton() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSBackButton, driver);
		return new CheckOutStep2(driver);
	}
	
	/**MethodName:verifyContinueButton()
	 * Description:This function verify continue button is displayed under price overview section of checkout step2 page
	 * @return CheckOutStep 2
	 * @throws Exception
	 * Author:Manjula
	 */
	public CheckOutStep2 verifyContinueButton() throws Exception
	{
		CustomFunction.isElementVisible(CS2_RSContinueBtn, driver);
		return new CheckOutStep2(driver);
	}

}