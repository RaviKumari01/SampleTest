

package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import static in.valtech.custom.CustomFunction.user_Details;
import java.util.Iterator;
import java.util.List;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class CatalogRequest {

	private final WebDriver driver;

	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	//catalog page constructor
	 public CatalogRequest(WebDriver driver)
	 {
	  this.driver = driver;
	  
	  log.info("RS CatalogRequest Page title" + driver.getTitle());
	  System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("CAR_RSTitle_XPATH"));

	  if(!(CustomFunction
	    .isElementPresent(
	      By.xpath(ObjRepoProperty.getProperty("CAR_RSTitle_XPATH")),
	      driver))) 
	  {

	   throw new IllegalStateException("This is not the catalog request page");
	  }
	  
	}
	 
	By CAR_RSCatalogRequestPage = By.xpath(ObjRepoProperty.getProperty("CAR_RSCatalogRequestPage_XPATH"));
	By CAR_RSTitle = By.xpath(ObjRepoProperty.getProperty("CAR_RSTitle_XPATH"));
	By CAR_RSSignInBtn = By.xpath(ObjRepoProperty.getProperty("CAR_RSSignInBtn_XPATH"));
	By CAR_RSSubTextBtn = By.xpath(ObjRepoProperty.getProperty("CAR_RSSubTextBtn_XPATH"));
	By CAR_RSSelectCatalogSection = By.xpath(ObjRepoProperty.getProperty("CAR_RSSelectCatalogSection_XPATH"));
	By CAR_RSNorthAmerica = By.xpath(ObjRepoProperty.getProperty("CAR_RSNorthAmerica_XPATH"));
	By CAR_RSAdvantureAfloat = By.xpath(ObjRepoProperty.getProperty("CAR_RSAdvantureAfloat_XPATH"));
	By CAR_RSInternational = By.xpath(ObjRepoProperty.getProperty("CAR_RSInternational_XPATH"));
	By CAR_RSEnteryourcontactinformationsection = By.xpath(ObjRepoProperty.getProperty("CAR_RSEnteryourcontactinformationsection_XPATH"));
	By CAR_RSFirstName = By.xpath(ObjRepoProperty.getProperty("CAR_RSFirstName_XPATH"));
	By CAR_RSLastName = By.xpath(ObjRepoProperty.getProperty("CAR_RSLastName_XPATH"));
	By CAR_RSAddressField = By.xpath(ObjRepoProperty.getProperty("CAR_RSAddressField_XPATH"));
	By CAR_RSCityField = By.xpath(ObjRepoProperty.getProperty("CAR_RSCityField_XPATH"));
	By CAR_RSStateDropDown = By.xpath(ObjRepoProperty.getProperty("CAR_RSStateDropDown_XPATH"));
	By CAR_RSZipCode = By.xpath(ObjRepoProperty.getProperty("CAR_RSZipCode_XPATH"));
	By CAR_RSCountryDropDown = By.xpath(ObjRepoProperty.getProperty("CAR_RSCountryDropDown_XPATH"));
	By CAR_RSPhoneNumberField = By.xpath(ObjRepoProperty.getProperty("CAR_RSPhoneNumberField_XPATH"));
	By CAR_RSEmailAddressField = By.xpath(ObjRepoProperty.getProperty("CAR_RSEmailAddressField_XPATH"));
	By CAR_RSSignMeUpText = By.xpath(ObjRepoProperty.getProperty("CAR_RSSignMeUpText_XPATH"));
	By CAR_RSSignMeUpCheckBox = By.xpath(ObjRepoProperty.getProperty("CAR_RSSignMeUpCheckBox_XPATH"));
	By CAR_RSSubmitBtn = By.xpath(ObjRepoProperty.getProperty("CAR_RSSubmitBtn_XPATH"));
	By CAR_RSCatalogRequestError = By.xpath(ObjRepoProperty.getProperty("CAR_RSCatalogRequestError_XPATH"));
	By CAR_FirstName = By.xpath(ObjRepoProperty.getProperty("CAR_FirstName_XPATH"));
	By CAR_LastName = By.xpath(ObjRepoProperty.getProperty("CAR_LastName_XPATH"));
	By CAR_City = By.xpath(ObjRepoProperty.getProperty("CAR_City_XPATH"));
	By CAR_PhoneNumber = By.xpath(ObjRepoProperty.getProperty("CAR_PhoneNumber_XPATH"));
	By CAR_ZipCode = By.xpath(ObjRepoProperty.getProperty("CAR_ZipCode_XPATH"));
	By CAR_Address = By.xpath(ObjRepoProperty.getProperty("CAR_Address_XPATH"));
	By CAR_EmailAddress = By.xpath(ObjRepoProperty.getProperty("CAR_EmailAddress_XPATH"));
	By CAR_Submit = By.xpath(ObjRepoProperty.getProperty("CAR_Submit_XPATH"));	
	By CAR_RSCountryDropDownList = By.xpath(ObjRepoProperty.getProperty("CAR_RSCountryDropDownList_XPATH"));
	By CAR_RSUSA = By.xpath(ObjRepoProperty.getProperty("CAR_RSUSA_XPATH"));
	By CAR_Canada = By.xpath(ObjRepoProperty.getProperty("CAR_Canada_XPATH"));
	By CAR_RSError = By.xpath(ObjRepoProperty.getProperty("CAR_RSError_XPATH"));
	By CAR_RSThankYouTextPopUp = By.xpath(ObjRepoProperty.getProperty("CAR_RSThankYouTextPopUp_XPATH"));
	By CAR_RSOkayBtn = By.xpath(ObjRepoProperty.getProperty("CAR_RSOkayBtn_XPATH"));
	By CAR_RSSelectState = By.xpath(ObjRepoProperty.getProperty("CAR_RSSelectState_XPATH"));


	/**MethodName:title()
	 * Description:This function verify the title  
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest title() throws Exception
	{
		CustomFunction.isElementVisible(CAR_RSTitle, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:signIn()
	 * Description:This function verify the signIn button
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest signIn() throws Exception 
	{
		CustomFunction.isElementVisible(CAR_RSSignInBtn, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:subText()
	 * Description:This function verify the subText  
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest subText() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSSubTextBtn, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:selectCatalogSection()
	 * Description:This function verify the selectCatalogSection  
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest selectCatalogSection() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSSelectCatalogSection, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:northAmerica
	 * Description:This function verify the north america radio button 
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest northAmerica() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSNorthAmerica, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: AdvantureAfloat()
	 * Description:This function verify  Advanture Afloat radio button
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest AdvantureAfloat() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSAdvantureAfloat, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:  International()
	 * Description:This function verify   International radio button
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest International() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSInternational, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:  Enteryourcontactinformationsection()
	 * Description:This function verify  Enteryourcontactinformation section
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest Enteryourcontactinformationsection() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSEnteryourcontactinformationsection, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName:  FirstName()
	 * Description:This function verify FirstName text field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest FirstName() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSFirstName, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: LastName()
	 * Description:This function verify LastName field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest LastName() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSFirstName, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: AddressField
	 * Description:This function verify Address Field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest AddressField() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSAddressField, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: CityField
	 * Description:This function verify City Field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest CityField() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSAddressField, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: StateDropDown
	 * Description:This function verify State DropDown
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest StateDropDown() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSStateDropDown, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: PhoneNumberField
	 * Description:This function verify Phone Number  Field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest PhoneNumberField() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSPhoneNumberField, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: EmailAddressField
	 * Description:This function verify EmailAddressField
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest EmailAddressField() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSEmailAddressField, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: SignMeUpText
	 * Description:This function verify SignMeUpText
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest SignMeUpText() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSSignMeUpText, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: SignMeUpCheckBox
	 * Description:This function verify SignMe Up CheckBox
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest SignMeUpCheckBox() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSSignMeUpCheckBox, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: SubmitBtn
	 * Description:This function verify Submit Btn
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest SubmitBtn() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_RSSubmitBtn, driver);
		return new CatalogRequest(driver);
	}


	/**MethodName: ClickOnSubmitBtn
	 * Description:This function click on submit button
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest ClickOnSubmitBtn() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, CAR_RSSubmitBtn, "submit");
		System.out.println("successfully clicked on submit button"); 
		return new CatalogRequest(driver);	
	}


	/**MethodName: VerifyError
	 * Description:This function verify Error
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest VerifyError() throws Exception
	{

		GUIFunctions.assertVerify(driver, CAR_RSCatalogRequestError, TextProperty.getProperty("catalogRequestEmptyError"));
		return new CatalogRequest(driver);
	}


	/**MethodName: SelectNorthAmericaRadioBtn
	 * Description:This function Select NorthAmerica RadioBtn
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest SelectNorthAmericaRadioBtn()
	{
		GUIFunctions.selectRaidoButton(driver,CAR_RSNorthAmerica,"North America");
		return new CatalogRequest(driver);
	}


	/**MethodName: FirstNameLength
	 * Description:This function verify the maximum length of first name field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest FirstNameLength() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_FirstName, driver);
		GUIFunctions.normalWait();
		int i=GUIFunctions.assertVerifyLength(driver, CAR_FirstName, "24");
		GUIFunctions.normalWait();
		System.out.println("Maximum value for first name text field is  ="+ i);
		log.info("Maximum value for first name text field is  ="+i );
		return new CatalogRequest(driver);
	}	


	/**MethodName:  LastNameLength
	 * Description:This function verify the maximum length of last name field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest LastNameLength() throws Exception  
	{

		CustomFunction.isElementVisible(CAR_LastName, driver);
		GUIFunctions.normalWait();
		int i=GUIFunctions.assertVerifyLength(driver, CAR_LastName, "24");
		System.out.println("Maximum value for Last name text field is  ="+i);
		log.info("Maximum value for Last name text field is  ="+i);
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName: AddressFieldLength
	 * Description:This function verify the maximum length ofAddressField
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest AddressFieldLength() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_Address, driver);
		GUIFunctions.normalWait();
		int i=GUIFunctions.assertVerifyLength(driver, CAR_Address, "200"); 
		System.out.println("Maximum value for Address name text field is  ="+i);
		log.info("Maximum value for Address name text field is  ="+i);
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:CityFieldLength
	 * Description:This function verify the maximum length of CityField
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest CityFieldLength() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_City, driver);
		GUIFunctions.normalWait();
		int i=GUIFunctions.assertVerifyLength(driver, CAR_City, "50");
		System.out.println("Maximum value for City name text field is  ="+i);
		log.info("Maximum value for City name text field is  ="+i);
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:PhoneNumberFieldLength
	 * Description:This function verify the maximum length of PhoneNumberField
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest PhoneNumberFieldLength() throws Exception  
	{

		CustomFunction.isElementVisible(CAR_PhoneNumber, driver);
		GUIFunctions.normalWait();
		int i =GUIFunctions.assertVerifyLength(driver, CAR_PhoneNumber, "40");
		System.out.println("Maximum value for PhoneNumber  text field is  ="+i);
		log.info("Maximum value for PhoneNumber text field is  ="+i);
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:ZipcodeLength
	 * Description:This function verify the maximum length of Zipcode
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest ZipcodeLength() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_ZipCode, driver);
		GUIFunctions.normalWait();
		int i= GUIFunctions.assertVerifyLength(driver, CAR_ZipCode, "30");
		System.out.println("Maximum value for first name text field is  ="+i);
		log.info("Maximum value for first name text field is  ="+i);
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:EmailAddressFieldLength
	 * Description:This function verify the maximum length of EmailAddressField
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest EmailAddressFieldLength() throws Exception  
	{
		CustomFunction.isElementVisible(CAR_EmailAddress, driver);
		GUIFunctions.normalWait();
		int i= GUIFunctions.assertVerifyLength(driver, CAR_EmailAddress, "100");
		System.out.println("Maximum value for Email  text field is  ="+i);
		log.info("Maximum value for Email text field is  ="+i);
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:enterSplCharacter
	 * Description:This function enters the spl character into all fields
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterSplCharacter() throws InterruptedException
	{
		String First_Name = user_Details.getFirst_Name();
		System.out.println("First_Name"+First_Name);
		String Last_Name=user_Details.getLast_Name();
		String Address=user_Details.getAddress();
		String City=CustomFunction.user_Details.getCity();
		String PhoneNumber=CustomFunction.user_Details.getPhone_Number();
		String ZipCode=CustomFunction.user_Details.getZipCode();
		String EmailAddress=CustomFunction.user_Details.getEmail_Address();   
		GUIFunctions.enterValueIntoTextBox(driver, CAR_FirstName , First_Name);
		System.out.println("Value entered into the first name text box");
		log.info("Value entered into the first name text box");
		GUIFunctions.normalWait();

		//enter the special character into last name field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_LastName , Last_Name);
		System.out.println("Value entered into the last name text box");
		log.info("Value entered into the last name text box");
		GUIFunctions.normalWait();

		//enter the special character into city field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_City , City);
		System.out.println("Value entered into the city text box");
		log.info("Value entered into the city text box");
		GUIFunctions.normalWait();

		//enter the special character into phone number field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_PhoneNumber , PhoneNumber);
		System.out.println("Value entered into the phone number text box");
		log.info("Value entered into the phone number text box");
		GUIFunctions.normalWait();

		//enter the special character into zip code field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_ZipCode , ZipCode);
		System.out.println("Value entered into the zip code text box");
		log.info("Value entered into the zip code text box");
		GUIFunctions.normalWait();

		//enter the special character into address field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_Address , EmailAddress);
		System.out.println("Value entered into the address text box");
		log.info("Value entered into the address text box");
		GUIFunctions.normalWait();

		//enter the special character into email address field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_EmailAddress , Address);
		System.out.println("Value entered into the email address text box");
		log.info("Value entered into the email address text box");
		GUIFunctions.normalWait();   
		return new CatalogRequest(driver);
	}

	/**MethodName:SelectNorthAmericaRadiobtn
	 * Description:To Select North America Radio Btn
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest SelectNorthAmericaRadiobtn()
	{
		GUIFunctions.selectRaidoButton(driver,CAR_RSNorthAmerica,"North America");
		return new CatalogRequest(driver);
	}


	/**MethodName:enterTextIntoFirstNameField
	 * Description:This function enters the data into first name field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterTextIntoFirstNameField() throws InterruptedException
	{
		Thread.sleep(1000);
		//get the value from excell sheet
		String FirstName=user_Details.getFirst_Name();
		System.out.println("First_Name"+FirstName);
		//enter the value into first name text field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_FirstName , FirstName);
		System.out.println("Value entered into the first name text box");
		log.info("Value entered into the first name text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:enterTextIntoLastNameField
	 * Description:This function enters the data into last name field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterTextIntoLastNameField() throws InterruptedException
	{
		//get the value from excell sheet
		String LastName=user_Details.getLast_Name();
		System.out.println("Last Name"+LastName);
		//enter the value into last name text field
		GUIFunctions.enterValueIntoTextBox(driver,CAR_LastName , LastName);
		System.out.println("Value entered into the last name text box");
		log.info("Value entered into the last name text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:enterTextIntoAddressField
	 * Description:This function enters the data into Address field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterTextIntoAddressField() throws InterruptedException
	{
		//get the value from excell sheet
		String Address=user_Details.getAddress();
		System.out.println("Address"+Address);

		//enter the text into email address field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_Address , Address);
		System.out.println("Value entered into the email address text box");
		log.info("Value entered into the email address text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}

	/**MethodName:enterTextIntoCityField
	 * Description:This function enters the data into city field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterTextIntoCityField() throws InterruptedException
	{
		//get the value from excel sheet
		String City=user_Details.getCity();
		System.out.println("City"+City);
		//enter the text into city field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_City , City);
		System.out.println("Value entered into the city text box");
		log.info("Value entered into the city text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:enterTextIntoPhoneNumberField
	 * Description:This function enters the data into phone number field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterTextIntoPhoneNumberField() throws InterruptedException
	{
		//get the value from excel sheet
		String PhoneNumber=user_Details.getPhone_Number();
		System.out.println("Phone number"+PhoneNumber);			
		//enter the value into phone number field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_PhoneNumber ,PhoneNumber);
		System.out.println("Value entered into the phone number text box");
		log.info("Value entered into the phone number text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:enterTextIntoEmailAddressField
	 * Description:This function enters the data into email addree field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterTextIntoEmailAddressField() throws InterruptedException
	{
		//get the value from excel sheet
		String EmailAddress=user_Details.getEmail_Address();
		System.out.println("Email Address"+EmailAddress);
		//enter the text into email address field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_EmailAddress , EmailAddress);
		System.out.println("Value entered into the email address text box");
		log.info("Value entered into the email address text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:SelectUSFromDropDown
	 * Description:This function select the US from drop down
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */

	public CatalogRequest SelectUSFromDropDown() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, CAR_RSCountryDropDown, "Country");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CAR_RSUSA, "Country");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:SelectCanadaFromDropDown
	 * Description:This function select the canada from drop down
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest SelectCanadaFromDropDown() throws InterruptedException
	{
		//click on country drop down
		GUIFunctions.clickElement(driver, CAR_RSCountryDropDown, "Country");
		GUIFunctions.normalWait();
		//select canada from drop down
		GUIFunctions.clickElement(driver, CAR_Canada, "country");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:verifyError
	 * Description:This function verify the error
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest verifyError() throws Exception
	{
		GUIFunctions.assertVerify(driver, CAR_RSError, TextProperty.getProperty("catalogRequestError_15"));
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}


	/**MethodName:enterValueIntoZipCodeField
	 * Description:This function enters the data into zip code field
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */
	public CatalogRequest enterValueIntoZipCodeField() throws InterruptedException
	{
		//get the data from excel sheet
		String ZipCode=user_Details.getZipCode();
		System.out.println(ZipCode);
		//Enter the data into the Zip Code field
		GUIFunctions.enterValueIntoTextBox(driver, CAR_ZipCode , ZipCode);
		System.out.println("Value entered into the Zip Code text box");
		GUIFunctions.normalWait();
		return new CatalogRequest(driver);
	}

	/**MethodName:Selectstate
	 * Description:This function select the state from state drop down
	 * @return CatalogRequest
	 * @throws Exception 
	 * Author:Manjula
	 */ 
	public CatalogRequest Selectstate() throws InterruptedException
	{
		GUIFunctions.clickElement(driver,CAR_RSStateDropDown, "State");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver,CAR_RSSelectState, "State");
		return new CatalogRequest(driver);
	}


	/**MethodName:verifyThankYouText
	 * Description:This function verify the thank you text
	 * @return CatalogRequest 
	 * Author:Manjula
	 */
	public CatalogRequest verifyThankYouText() throws Exception
	{
		GUIFunctions.assertVerify(driver, CAR_RSCatalogRequestError, TextProperty.getProperty("catalogThankYouTextPopUp"));
		return new CatalogRequest(driver);
	}


	/**MethodName:clickOnOkayBtn
	 * Description:This function click on okay button
	 * @return HomePage
	 * Author:Manjula
	 */
	public HomePage clickOnOkayBtn()
	{
		GUIFunctions.clickElement(driver, CAR_RSOkayBtn, "Button");
		System.out.println("Successfully clicked on okay button");
		return new HomePage(driver);
	}
}















