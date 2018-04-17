package in.valtech.RoadScholar.pages;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.custom.CustomFunction;
import static in.valtech.custom.CustomFunction.user_Details;
import in.valtech.uiFunctions.GUIFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class DonatePage 
{
	public final WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());
	public String[] enter = (CustomFunction.user_Details.getFirst_Name()).split(",");
	public String validEnterFirst = enter[0];
	public String specialCharFirst = enter[1];
    public String[] enterlastName = (CustomFunction.user_Details.getLast_Name()).split(",");
    public String validEnterlast = enterlastName[0];
    public String specialCharlast = enterlastName[1];
    public String[] enterAddress = (CustomFunction.user_Details.getAddress()).split(",");
    public String validEnterAddress = enterAddress[0];
    public String specialCharAddress = enterAddress[1];
    public String[] enterCity = (CustomFunction.user_Details.getCity()).split(",");
    public String validEnterCity = enterCity[0];
    public String specialCharCity = enterCity[1];


	public DonatePage(WebDriver driver)
	{

		this.driver = driver;
		log.info("RS Donate Page title" + driver.getTitle());
		System.out.println("Donate Page title= " + driver.getTitle());
		System.out.println("ObjRepoProperty.getProperty=="+ ObjRepoProperty.getProperty("DON_DonateTitle_XPATH"));

		if (!(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("DON_DonateTitle_XPATH")), driver)))
		{
			throw new IllegalStateException("This is not theRS Donate page");
		}
	}

	By DON_ActualSubText = By.xpath(ObjRepoProperty.getProperty("DON_ActualSubText_XPATH"));
	By DON_TitleGift = By.xpath(ObjRepoProperty.getProperty("DON_TitleGift_XPATH"));
	By DON_OneTimeGiftRadioButton = By.xpath(ObjRepoProperty.getProperty("DON_OneTimeGiftRadioButton_XPATH"));
	By DON_$25Option = By.xpath(ObjRepoProperty.getProperty("DON_$25Option_XPATH"));
	By DON_$35Option = By.xpath(ObjRepoProperty.getProperty("DON_$35Option_XPATH"));
	By DON_$50ption = By.xpath(ObjRepoProperty.getProperty("DON_$50ption_XPATH"));
	By DON_$100Option = By.xpath(ObjRepoProperty.getProperty("DON_$100Option_XPATH"));
	By DON_CustomAmountOption = By.xpath(ObjRepoProperty.getProperty("DON_CustomAmountOption_XPATH"));
	By DON_CustomAmountTextbox = By.xpath(ObjRepoProperty.getProperty("DON_CustomAmountTextbox_XPATH"));
	By DON_PleaseDirectMyDonationDropDown = By.xpath(ObjRepoProperty.getProperty("DON_PleaseDirectMyDonationDropDown_XPATH"));
	By DON_HonourOfSomeOneSpecialDropDown = By.xpath(ObjRepoProperty.getProperty("DON_HonourOfSomeOneSpecialDropDown_XPATH"));
	By DON_MemoryOfSomeOneSpecialDropDown = By.xpath(ObjRepoProperty.getProperty("DON_MemoryOfSomeOneSpecialDropDown_XPATH"));
	By DON_PersonalDetails = By.xpath(ObjRepoProperty.getProperty("DON_PersonalDetails_XPATH"));
	By DON_FirstName = By.xpath(ObjRepoProperty.getProperty("DON_FirstName_XPATH"));
	By DON_LastName = By.xpath(ObjRepoProperty.getProperty("DON_LastName_XPATH"));
	By DON_Address = By.xpath(ObjRepoProperty.getProperty("DON_Address_XPATH"));
	By DON_Zipcode = By.xpath(ObjRepoProperty.getProperty("DON_Zipcode_XPATH"));
	By DON_City = By.xpath(ObjRepoProperty.getProperty("DON_City_XPATH"));
	By DON_PhoneNumber = By.xpath(ObjRepoProperty.getProperty("DON_PhoneNumber_XPATH"));
	By DON_Email = By.xpath(ObjRepoProperty.getProperty("DON_Email_XPATH"));
	By DON_Country = By.xpath(ObjRepoProperty.getProperty("DON_Country_XPATH"));
	By DON_State = By.xpath(ObjRepoProperty.getProperty("DON_State_XPATH"));
	By DON_IWouldLikeToReceiveReceipt = By.xpath(ObjRepoProperty.getProperty("DON_IWouldLikeToReceiveReceipt_XPATH"));
	By DON_ReceiptViaEmail = By.xpath(ObjRepoProperty.getProperty("DON_ReceiptViaEmail_XPATH"));
	By DON_ReceiptViaMail = By.xpath(ObjRepoProperty.getProperty("DON_ReceiptViaMail_XPATH"));
	By DON_PayByCheckButton = By.xpath(ObjRepoProperty.getProperty("DON_PayByCheckButton_XPATH"));
	By DON_PayByCreditCardButton = By.xpath(ObjRepoProperty.getProperty("DON_PayByCreditCardButton_XPATH"));
	By DON_ErrorMessage = By.xpath(ObjRepoProperty.getProperty("DON_ErrorMessage_XPATH"));
	By DON_ValueFromPleaseDiectMyDonationToDropDown = By.xpath(ObjRepoProperty.getProperty("DON_ValueFromPleaseDiectMyDonationToDropDown_XPATH"));
	By DON_FirstNameOfHonourSomeOneSpecial = By.xpath(ObjRepoProperty.getProperty("DON_FirstNameOfHonourSomeOneSpecial_XPATH"));
	By DON_LastNameOfHonourSomeOneSpecial = By.xpath(ObjRepoProperty.getProperty("DON_LastNameOfHonourSomeOneSpecial_XPATH"));
	By DON_AZState = By.xpath(ObjRepoProperty.getProperty("DON_AZState_XPATH"));
	By DON_AfghanistanCountry = By.xpath(ObjRepoProperty.getProperty("DON_AfghanistanCountry_XPATH"));
	By DON_CreditCardTextBox = By.xpath(ObjRepoProperty.getProperty("UTP_CreditCardTextBox_XPATH"));
	By DON_CVCNumberTextBox = By.xpath(ObjRepoProperty.getProperty("UTP_CVCNumber_XPATH"));
	By DON_CardTypeDropDown = By.xpath(ObjRepoProperty.getProperty("UTP_CardTypeDropDown_XPATH"));
	By DON_ExpirationDateMonth = By.xpath(ObjRepoProperty.getProperty("UTP_ExpirationDateMonth_XPATH"));
	By DON_ExpirationDateYear = By.xpath(ObjRepoProperty.getProperty("UTP_ExpirationDateYear_XPATH"));
	By DON_CompleteBtn = By.xpath(ObjRepoProperty.getProperty("UTP_CompleteBtn_XPATH"));
	By DON_SendMyMailNotificationRadioButton = By.xpath(ObjRepoProperty.getProperty("DON_SendMyMailNotificationRadioButton_XPATH"));
	By DON_ErrMsgForFirstName = By.xpath(ObjRepoProperty.getProperty("DON_ErrMsgForFirstName_XPATH"));

	/**@MethodName= verifySubText
	 * @Description:To verify SubText displayed below the title
	 * @return:DonatePage
	 **Author:Kavya
	 */
	String expectedValue = TextProperty.getProperty("DON_ExpectedSubText");
	public DonatePage verifySubText() throws Exception
	{
		try
		{
			String actualValue = driver.findElement(DON_ActualSubText).getText();
			System.out.println("actual = " + actualValue);
			System.out.println("expected = " + expectedValue);
			Assert.assertEquals(actualValue, expectedValue,	"Text is not matching");
		} 
		catch (NoSuchElementException e)
		{

		}
		return new DonatePage(driver);
	}

	/**@MethodName= verifyGiftBlock
	 * @Description:To verify GiftBlock 
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage verifyGiftBlock() throws Exception
	{
		String expectedGiftTitle = TextProperty.getProperty("DON_GiftBoxTitle");
		String actuaTitle = driver.findElement(DON_TitleGift).getText();
		System.out.println("actual = " + actuaTitle);
		System.out.println("expected = " + expectedGiftTitle);
		Assert.assertEquals(actuaTitle, expectedGiftTitle,"Title  is not matching");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_OneTimeGiftRadioButton, driver),"One Time radio button is not  displayed");
		System.out.println("One Time radio button is displayed");
		Assert.assertTrue(CustomFunction.isElementSelected(DON_OneTimeGiftRadioButton, driver),"One Time radio button is selected by default");
		System.out.println("One Time radio button is selected by default");	
		Assert.assertTrue(CustomFunction.isElementPresent(DON_$25Option, driver),"$ 25 radio button is not  displayed");
		System.out.println("$ 25 radio button is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_$35Option, driver),"$ 35 radio button is not  displayed");
		System.out.println("$ 35 radio button is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_$50ption, driver),"$ 50 radio button is not  displayed");
		System.out.println("$ 50 radio button is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_$100Option, driver),	"$ 100 radio button is not  displayed");
		System.out.println("$ 100 radio button is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_CustomAmountOption, driver),"Custom Amount radio button is not  displayed");
		System.out.println("Custom Amount radio button is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_CustomAmountTextbox, driver),	"Custom Amount TextBox is not  displayed");
		System.out.println("Custom Amount TextBox is displayed");
		return new DonatePage(driver);
	}

	/**@MethodName=verifyPleaseDirectMyDonationDropDown()
	 * @Description:To verify Please Direct My Donation drop down
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage verifyPleaseDirectMyDonationDropDown() 
	{
		Assert.assertTrue(CustomFunction.isElementPresent(DON_PleaseDirectMyDonationDropDown, driver),"Please Direct My Donation Drop Down is not  displayed");
		System.out.println("Please Direct My Donation Drop Down is displayed");
		return new DonatePage(driver);
	}

	/**@MethodName=verifyMakeThisGiftDropDowns()
	 * @Description:To verify drop down displayed below Make this Gift section
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage verifyMakeThisGiftDropDowns()
	{
		Assert.assertTrue(CustomFunction.isElementPresent(DON_HonourOfSomeOneSpecialDropDown, driver),"Honour Of Some one special Drop Down is not  displayed");
		System.out.println("Honour Of Some one special  Drop Down is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_MemoryOfSomeOneSpecialDropDown, driver),"Memory of Some one Drop Down is not  displayed");
		System.out.println("Memory of Some one Drop Down is displayed");
		return new DonatePage(driver);
	}

	/**@MethodName=verifyPersonalDetailssection
	 * @Description:To verify all the fields displayed below Personal Details section
	 * @return:DonatePage
	 **Author:Kavya
	 */

	public DonatePage verifyPersonalDetailssection()
	{

		String expectedPDTitle = TextProperty.getProperty("DON_PersonalDetailsTitle");
		String actuaTitle = driver.findElement(DON_PersonalDetails).getText();
		System.out.println("actual = " + actuaTitle);
		System.out.println("expected = " + expectedPDTitle);
		Assert.assertEquals(actuaTitle, expectedPDTitle,"Title  is not matching");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_FirstName, driver),"First Name field is not  displayed");
		System.out.println("First Name field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_LastName, driver),"Last Name field is not  displayed");
		System.out.println("Last Name field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_Address, driver),"Address field is not  displayed");
		System.out.println("Address field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_City, driver),"City field is not  displayed");
		System.out.println("City field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_Zipcode, driver),"Zipcode field is not  displayed");
		System.out.println("Zipcode field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_Email, driver),"Email field is not  displayed");
		System.out.println("Email field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_PhoneNumber, driver),"Phone number field is not  displayed");
		System.out.println("Phone number field is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_Country, driver),"Country drop down is not  displayed");
		System.out.println("Country drop down is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_State, driver),"State drop down is not  displayed");
		System.out.println("State drop down is displayed");
		return new DonatePage(driver);
	}

	/**@MethodName=verifyIwouldLikeToReceiveReceiptOptions
	 * @Description:To verify all the options displayed below I would Like To Receive Receipt section
	 * @return:DonatePage
	 **Author:Kavya
	 */


	public DonatePage verifyIwouldLikeToReceiveReceiptOptions() 
	{
		String expectedText = TextProperty.getProperty("DON_IWouldLikeToReceiveReceiptText");
		String actuaTitle = driver.findElement(DON_IWouldLikeToReceiveReceipt).getText();
		System.out.println("actual = " + actuaTitle);
		System.out.println("expected = " + expectedText);
		Assert.assertEquals(actuaTitle, expectedText, "Text  is not matching");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_ReceiptViaEmail, driver),"Receipt through Email radio button is not  displayed");
		System.out.println("Receipt through Email radio button  is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_ReceiptViaMail, driver),"Receipt through Mail radio button is not  displayed");
		System.out.println("Receipt through Mail radio button  is displayed");
		return new DonatePage(driver);

	}


	/**@MethodName=verifyPaymentModule
	 * @Description:To verify all the fields displayed in Payment Module
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage verifyPaymentModule() 
	{
		Assert.assertTrue(CustomFunction.isElementPresent(DON_PayByCheckButton, driver),"Pay by Check radio button is not  displayed");
		System.out.println("Pay by Check radio button  is displayed");
		Assert.assertTrue(CustomFunction.isElementPresent(DON_PayByCreditCardButton, driver),"Pay by Credit Card radio button is not  displayed");
		System.out.println("Pay by Credit Card radio button  is displayed");

		return new DonatePage(driver);

	}
	/**@MethodName=clickOnPaymentRadioButton
	 * @Description:To click on the Payment radio button
	 * @return:DonatePage
	 **Author:Kavya
	 * @throws InterruptedException 
	 */
	public DonatePage clickOnPaymentRadioButton() throws InterruptedException
	{
		GUIFunctions.normalWait();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)", "");
		GUIFunctions.clickElement(driver,DON_PayByCreditCardButton,"Pay by Credit Card");
		GUIFunctions.normalWait();
		return new DonatePage(driver);
	}

	/**@MethodName= verifyErrorMesaageForDirectClickOnPaymentRadioButton
	 * @Description:To verify error message  displayed when user clicks on Payment radio button without selecting any donate option
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage verifyErrorMesaageForDirectClickOnPaymentRadioButton()throws InterruptedException 
	{
		Thread.sleep(5000);
		String expectedErrorMessage = TextProperty.getProperty("DON_ErrorMessageForPaymentModule");
		String actualErrorMessage = driver.findElement(DON_ErrorMessage).getText();
		System.out.println("actual = " + actualErrorMessage);
		System.out.println("expected = " + expectedErrorMessage);
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Error message displayed is not matching with the expected");
		return new DonatePage(driver);
	}

	/**@MethodName= selectGiftAmount
	 * @Description:To select any GiftAmount
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage selectGiftAmount()
	{
		GUIFunctions.selectRaidoButton(driver, DON_$25Option,"$ 25 Radio button");
		return new DonatePage(driver);
	}

	/**@MethodName= selectValueFromPleaseDirectMyDonationDropDown
	 * @Description:To select value from Please Direct My Donation DropDown
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage selectValueFromPleaseDirectMyDonationDropDown()throws InterruptedException
	{

		GUIFunctions.clickElement(driver, DON_PleaseDirectMyDonationDropDown,"Drop down");
		System.out.println("check");
		Thread.sleep(10000);
		GUIFunctions.clickElement(driver,DON_ValueFromPleaseDiectMyDonationToDropDown,"General program development");
		GUIFunctions.normalWait();
		System.out.println("checkpoint");
		return new DonatePage(driver);
	}

	/**@MethodName= selectAnyMakeThisGiftRadioButton
	 * @Description:To select amount for making Gift radio button
	 * @return:DonatePage
	 **Author:Kavya
	 */

	public DonatePage selectAnyMakeThisGiftRadioButton()throws InterruptedException 
	{

		GUIFunctions.clickElement(driver, DON_HonourOfSomeOneSpecialDropDown,"Honour Of Some One Special DropDown");
		GUIFunctions.normalWait();
		return new DonatePage(driver);
	}

	/**@MethodName= enterDetailsUnderSelectedRadioButtonOfMakeThisGiftIn
	 * @Description:To enter the user info in the fields displayed under selected radio button
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage enterDetailsUnderSelectedRadioButtonOfMakeThisGiftIn()throws InterruptedException
	{

		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver,DON_FirstNameOfHonourSomeOneSpecial, validEnterFirst);
		System.out.println("Successfully entered the first name");
		GUIFunctions.enterValueIntoTextBox(driver,DON_LastNameOfHonourSomeOneSpecial, validEnterlast);
		System.out.println("Successfully entered the last name");
		return new DonatePage(driver);
	}

	/**@MethodName= enterPersonalDetails
	 * @Description:To enter the user personal details in the fields displayed Personal details section
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage enterPersonalDetails() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver, DON_FirstName, validEnterFirst);
		System.out.println("Successfully entered the first name in Personal Details section");
		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver, DON_LastName, validEnterlast);
		System.out.println("Successfully entered the last name in Personal Details section");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver,DON_Address, validEnterAddress);
		System.out.println("Successfully entered the address in Personal Details section");
		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver, DON_City, validEnterCity);
		System.out.println("Successfully entered city in Personal Details section");
		GUIFunctions.normalWait();
		String zipcode = user_Details.getZipCode();
		GUIFunctions.enterValueIntoTextBox(driver, DON_Zipcode, zipcode);
		System.out.println("Successfully entered zipcode in Personal Details section");
		System.out.println("Successfully entered Phone number in Personal Details section");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, DON_State, "state");
		String selState = user_Details.getState();
		GUIFunctions.clickElement(driver, DON_AZState, selState);
		System.out.println("Successfully state from Sate drop down in Personal Details section");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, DON_Country, "state");
		String selCountry = user_Details.getCountry();
		GUIFunctions.clickElement(driver, DON_AfghanistanCountry, selCountry);
		System.out.println("Successfully Country from Country drop down in Personal Details section");
		return new DonatePage(driver);

	}

	/**@MethodName= enterPayByCreditCardDetails
	 * @Description:To enter the enter the payment details under Pay by credit card option
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public ThankYouPageForDonation enterPayByCreditCardDetails()throws InterruptedException 
	{
		System.out.println("Entering method");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		String creditCardNumber = CustomFunction.payment_CreditDetails.getCard_Number();
		System.out.println("Credit number" + creditCardNumber);
		GUIFunctions.enterValueIntoTextBox(driver, DON_CreditCardTextBox,creditCardNumber);
		String CVCNumber = CustomFunction.payment_CreditDetails.getCVC_Number();
		GUIFunctions.enterValueIntoTextBox(driver, DON_CVCNumberTextBox, CVCNumber);
		String CardType = CustomFunction.payment_CreditDetails.getCard_Type();
		Select sel = new Select(driver.findElement(DON_CardTypeDropDown));
	    sel.selectByVisibleText(CardType);
		Thread.sleep(1000);
		GUIFunctions.normalWait();
		String Month=CustomFunction.payment_CreditDetails.getExpiry_Month();
		Select sel1 = new Select(driver.findElement(DON_ExpirationDateMonth));
		sel1.selectByValue(Month);
		Thread.sleep(1000);
	    // select ExpirationDate Year from Dropdown
		GUIFunctions.normalWait();
		String Year=CustomFunction.payment_CreditDetails.getExpiry_Year();
		GUIFunctions.normalWait();
		Select sel2 = new Select(driver.findElement(DON_ExpirationDateYear));
		sel2.selectByValue(Year);
		Thread.sleep(1000);
		System.out.println("Complete buttton should be clicked");
		GUIFunctions.clickElement(driver, DON_CompleteBtn, "CompleteBtn");
		System.out.println("Complete buttton is clicked");
		Thread.sleep(5000);
		System.out.println("Successfully navigated to default window");
		Thread.sleep(10000);
		return new ThankYouPageForDonation(driver);
	}
	
	
	/**@MethodName= selectSendMyMailNotificationRadioButton
	 * @Description:To select send my mail notification radio button
	 * @return:DonatePage
	 **Author:Kavya
	 */
	public DonatePage selectSendMyMailNotificationRadioButton()throws InterruptedException 
	{
		GUIFunctions.clickElement(driver, DON_SendMyMailNotificationRadioButton,"SendMyMailNotification");
		GUIFunctions.clickElement(driver, DON_SendMyMailNotificationRadioButton,"SendMyMailNotification");
		return new DonatePage(driver);
	}

	
	/**@MethodName= firstNameFieldValidation
	 * @Description:To validate first name field
	 * @return:DonatePage
	 **Author:Kavya
	 */
	
	public DonatePage firstNameFieldValidation() throws InterruptedException 
	{
		
		GUIFunctions.enterValueIntoTextBox(driver, DON_FirstName,specialCharFirst);
		GUIFunctions.clickElement(driver, DON_PayByCreditCardButton,"Payment radio button");
		Thread.sleep(5000);
		String expectedErrMsg = TextProperty.getProperty("DON_ExpectedErrMsgForFirstName");
		Thread.sleep(10000);
		String actualErrMsg = driver.findElement(DON_ErrMsgForFirstName).getText();
		System.out.println("actualErrMsg" + actualErrMsg);
		System.out.println("expected = " + expectedErrMsg);
		Assert.assertEquals(actualErrMsg, expectedErrMsg,"Error message is not matching");
		System.out.println("Error message displayed is :-" + actualErrMsg);
		return new DonatePage(driver);
	}

	/**@MethodName= lastNameFieldValidation
	 * @Description:To validate last name field
	 * @return:DonatePage
	 **Author:Kavya
	 */
	
	public DonatePage lastNameFieldValidation() throws InterruptedException 
	{

		GUIFunctions.enterValueIntoTextBox(driver, DON_FirstName,validEnterFirst);
		String[] enterlastName = (CustomFunction.user_Details.getLast_Name()).split(",");
		System.out.println("enterLasttName = " + enterlastName);
		GUIFunctions.enterValueIntoTextBox(driver, DON_LastName,specialCharlast);
		GUIFunctions.clickElement(driver, DON_PayByCreditCardButton,"Payment radio button");
		String expectedErrMsg = TextProperty.getProperty("DON_ExpectedErrMsgForLastName");
		Thread.sleep(5000);
		String actualErrMsg = driver.findElement(DON_ErrMsgForFirstName).getText();
		System.out.println("actual = " + actualErrMsg);
		System.out.println("expected = " + expectedErrMsg);
		Assert.assertEquals(actualErrMsg, expectedErrMsg,"Error message  is not matching");
		System.out.println("Error message displayed is :-" + actualErrMsg);
		return new DonatePage(driver);

	}

	/**@MethodName= addressFieldValidation
	 * @Description:To validate address field
	 * @return:DonatePage
	 **Author:Kavya
	 */

	public DonatePage addressFieldValidation() throws InterruptedException 
	{

		GUIFunctions.enterValueIntoTextBox(driver, DON_FirstName,validEnterFirst);
		GUIFunctions.enterValueIntoTextBox(driver, DON_LastName, validEnterlast);
		Thread.sleep(10000);
		GUIFunctions.enterValueIntoTextBox(driver,DON_Address,specialCharAddress);
		Thread.sleep(10000);
		GUIFunctions.clickElement(driver, DON_PayByCreditCardButton,"Payment radio button");
		String expectedErrMsg = TextProperty.getProperty("DON_ExpectedAddress");
		Thread.sleep(10000);
		String actualErrMsg = driver.findElement(DON_ErrMsgForFirstName).getText();
		System.out.println("actual = " + actualErrMsg);
		System.out.println("expected = " + expectedErrMsg);
		Assert.assertEquals(actualErrMsg, expectedErrMsg,"Error message  is not matching");
		System.out.println("Error message displayed is :-" + actualErrMsg);
		return new DonatePage(driver);

	}

	/**@MethodName= cityFieldValidation
	 * @Description:To validate city field
	 * @return:DonatePage
	 **Author:Kavya
	 */

	
	public DonatePage cityFieldValidation() throws InterruptedException 
	{

		GUIFunctions.enterValueIntoTextBox(driver, DON_FirstName,validEnterFirst);
		GUIFunctions.enterValueIntoTextBox(driver, DON_LastName, validEnterlast);
		GUIFunctions.enterValueIntoTextBox(driver, DON_Address,validEnterAddress);
		GUIFunctions.enterValueIntoTextBox(driver, DON_City, specialCharCity);
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, DON_PayByCreditCardButton,"Payment radio button");
		String expectedErrMsg = TextProperty.getProperty("DON_ExpectedErrMsgForCity");
		Thread.sleep(5000);
		String actualErrMsg = driver.findElement(DON_ErrMsgForFirstName).getText();
		System.out.println("actual = " + actualErrMsg);
		System.out.println("expected = " + expectedErrMsg);
		Assert.assertEquals(actualErrMsg, expectedErrMsg,"Error message  is not matching");
		System.out.println("Error message displayed is :-" + actualErrMsg);
		return new DonatePage(driver);

	}

}
