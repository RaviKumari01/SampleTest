package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import static in.valtech.custom.CustomFunction.payment_CheckDetails;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class CheckOutStep3 
{
	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());
	public CheckOutStep3(WebDriver driver)
	  {

	   this.driver = driver; 
	   log.info("checkout Step3 page title="+ driver.getTitle());
	   
	   //check that we are on the right page or not
	   
	   if(driver.getTitle().contains("Checkout"))
	   {
		   System.out.println("user is in 3 step of checkout page"); 
	   }
	   else
	   {
		   System.out.println("user is not in 3 step of checkout page"); 
	   }
	  /* Assert.assertTrue(driver.findElement(
	     By.xpath("//div[@class='co-nav-container']/div[contains(@class,'co-nav-')][3]"))
	     .getAttribute("class").contains("active"));*/
	   
	    
	  // System.out.println("user is in 3 step of checkout page");

	  }
	
	By CS3_Step3=By.xpath(ObjRepoProperty.getProperty("CS3_Step3_XPATH"));

	By CS3_TermsAndCondition=By.xpath(ObjRepoProperty.getProperty("CS3_TermsAndCondition_XPATH"));
	By CS3_Okay=By.xpath(ObjRepoProperty.getProperty("CS3_Okay_XPATH"));
	By CS3_Accept=By.xpath(ObjRepoProperty.getProperty("CS3_Accept_XPATH"));
	By CS3_CreditCard=By.xpath(ObjRepoProperty.getProperty("CS3_CreditCard_XPATH"));
	By CS3_Continue=By.xpath(ObjRepoProperty.getProperty("CS3_Continue_XPATH"));
	By CS3_BlankContinue=By.xpath(ObjRepoProperty.getProperty("CS3_BlankContinue_XPATH"));
	By CS3_RSTitle=By.xpath(ObjRepoProperty.getProperty("CS3_RSTitle_XPATH"));
	By CS3_RSTitleDescription=By.xpath(ObjRepoProperty.getProperty("CS3_RSTitleDescription_XPATH"));
	By CS3_RSTodaysPayment=By.xpath(ObjRepoProperty.getProperty("CS3_RSTodaysPayment_XPATH"));
	By CS3_RSPayFullAmountRadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RSPayFullAmountRadioBtn_XPATH"));
	By CS3_RSMakeDonationTitle=By.xpath(ObjRepoProperty.getProperty("CS3_RSMakeDonationTitle_XPATH"));
	By CS3_RSMakeDonationDescription=By.xpath(ObjRepoProperty.getProperty("CS3_RSMakeDonationDescription_XPATH"));
	By CS3_RSNoThankYouRadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RSNoThankYouRadioBtn_XPATH"));
	By CS3_RS$10RadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RS$10RadioBtn_XPATH"));
	By CS3_RS$25RadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RS$25RadioBtn_XPATH"));
	By CS3_RS$35RadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RS$35RadioBtn_XPATH"));
	By CS3_RSCustomAmountRadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RSCustomAmountRadioBtn_XPATH"));
	By CS3_RSCustomAmountTextBox=By.xpath(ObjRepoProperty.getProperty("CS3_RSCustomAmountTextBox_XPATH"));
	By CS3_RSPriceOverviewTitleText=By.xpath(ObjRepoProperty.getProperty("CS3_RSPriceOverviewTitleText_XPATH"));
	By CS3_RSTermsAndCodition=By.xpath(ObjRepoProperty.getProperty("CS3_RSTermsAndCodition_XPATH"));
	By CS3_RSTermsAndConditionDescription=By.xpath(ObjRepoProperty.getProperty("CS3_RSTermsAndConditionDescription_XPATH"));
	By CS3_RSViewTermsAndConditionLink=By.xpath(ObjRepoProperty.getProperty("CS3_RSViewTermsAndConditionLink_XPATH"));
	By CS3_RSIAcceptRadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RSIAcceptRadioBtn_XPATH"));
	By CS3_RSPaymentTypeSectionTitle=By.xpath(ObjRepoProperty.getProperty("CS3_RSPaymentTypeSectionTitle_XPATH"));
	By CS3_RSPayByCheckRadioBtn=By.xpath(ObjRepoProperty.getProperty("CS3_RSPayByCheckRadioBtn_XPATH"));
	By CS3_RSItem=By.xpath(ObjRepoProperty.getProperty("CS3_RSItem_XPATH"));
	By CS3_RSSubTotal=By.xpath(ObjRepoProperty.getProperty("CS3_RSItem_XPATH"));
	By CS3_RSOrderSummary=By.xpath(ObjRepoProperty.getProperty("CS3_RSOrderSummary_XPATH"));
	By CS3_RSTalkToUs=By.xpath(ObjRepoProperty.getProperty("CS3_RSTalkToUs_XPATH"));
        By CS3_OSTripTitle=By.xpath(ObjRepoProperty.getProperty("CS3_OSTripTitle_XPATH"));
	By CS3_OSPersonCount=By.xpath(ObjRepoProperty.getProperty("CS3_OSPersonCount_XPATH"));
	By CS3_OSItemPrice=By.xpath(ObjRepoProperty.getProperty("CS3_OSItemPrice_XPATH"));
	By CS3_OSFlightText=By.xpath(ObjRepoProperty.getProperty("CS3_OSFlightText_XPATH"));
	By CS3_OSTotalPrice=By.xpath(ObjRepoProperty.getProperty("CS3_OSTotalPrice_XPATH"));
	By CS3_CreditName=By.xpath(ObjRepoProperty.getProperty("CS3_CreditName_XPATH"));
	By CS3_CreditCardNumber=By.xpath(ObjRepoProperty.getProperty("CS3_CreditCardNumber_XPATH"));
	By CS3_CreditCVCNumber=By.xpath(ObjRepoProperty.getProperty("CS3_CreditCVCNumber_XPATH"));
	By CS3_CreditCardType=By.xpath(ObjRepoProperty.getProperty("CS3_CreditCardType_XPATH"));
	By CS3_CreditExpiryMonth=By.xpath(ObjRepoProperty.getProperty("CS3_CreditExpiryMonth_XPATH"));
	By CS3_CreditExpiryYear=By.xpath(ObjRepoProperty.getProperty("CS3_CreditExpiryYear_XPATH"));
	By CS3_RSNameOnAccountText=By.xpath(ObjRepoProperty.getProperty("CS3_RSNameOnAccountText_XPATH"));
	By CS3_RSAccountTypeTextBox=By.xpath(ObjRepoProperty.getProperty("CS3_RSAccountTypeTextBox_XPATH"));
	By CS3_RSRoutingNumberTextBox=By.xpath(ObjRepoProperty.getProperty("CS3_RSRoutingNumberTextBox_XPATH"));
	By CS3_RSAccountNumberTextBox=By.xpath(ObjRepoProperty.getProperty("CS3_RSAccountNumberTextBox_XPATH"));
	By CS3_RSBankName=By.xpath(ObjRepoProperty.getProperty("CS3_RSBankName_XPATH"));
	By CS3_RSAmount=By.xpath(ObjRepoProperty.getProperty("CS3_RSAmount_XPATH"));
	By CS3_RSCompleteButton=By.xpath(ObjRepoProperty.getProperty("CS3_RSCompleteButton_XPATH"));
	By CS2_Step2=By.xpath(ObjRepoProperty.getProperty("CS2_Step2_XPATH"));


	/**MethodName:Step3
	 * Description:This function is to click on Step3
	 * @return CheckOutStep3
	 * Author:Sravani
	 */
	public CheckOutStep3 Step3()
	{

		CustomFunction.isElementPresent(CS3_Step3,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:Step2
	 * Description:This function is to click on Step2
	 * @return CheckOutStep2
	 * Author:Sravani
	 */

	public CheckOutStep2 Step2()
	{
		GUIFunctions.clickElement(driver, CS2_Step2, "step2");
		return new CheckOutStep2(driver) ;
	}

	/**MethodName:TermsAndCondition
	 * Description:This function is to click on TermsAndCondition
	 * @return CheckOutStep3
	 * Author:Sravani
	 */
	public CheckOutStep3 TermsAndCondition()
	{
		GUIFunctions.clickElement(driver, CS3_TermsAndCondition, "Terms and Conditions");
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:Okay
	 * Description:This function is to click on Okay
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */

	public CheckOutStep3 Okay() throws InterruptedException
	{

		GUIFunctions.clickElement(driver, CS3_Okay, "okay");
		GUIFunctions.normalWait();
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:Accept
	 * Description:This function is to click on Accept
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 Accept() throws InterruptedException
	{
		GUIFunctions.normalWait();
		//driver.navigate().refresh();
		GUIFunctions.clickElement(driver,CS3_Accept,"Accept");
		GUIFunctions.normalWait();
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:CreditCard
	 * Description:This function is to click on CreditCard
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 CreditCard() throws InterruptedException
	{
		GUIFunctions.selectRaidoButton(driver,CS3_CreditCard,"Creditcard");
		GUIFunctions.normalWait();
		GUIFunctions.normalWait();
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:Continue
	 * Description:This function is to click on Continue
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 Continue() throws InterruptedException
	{

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		System.out.println("Entering method");
		//WebElement iframe = driver.findElement(By.tagName("iframe"));
		//System.out.println(iframe.getSize());
		driver.switchTo().frame(0);
		System.out.println("Complete buttton should be clicked");
		GUIFunctions.clickElement(driver, CS3_Continue, "continue");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
		
	}

	/**MethodName:Continue
	 * Description:This function is to verifyError
	 * @return CheckOutStep3
	 * Author:Sravani
	 */
	public CheckOutStep3 verifyError()throws InterruptedException
	{
	
		Thread.sleep(10000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-200)", "");
		String s=driver.findElement(CS3_BlankContinue).getText();
		System.out.println("actual Text is"+s);
		Thread.sleep(10000);
		String expected=TextProperty.getProperty("CS3_ContinueError");
		System.out.println("expected is"+expected);
		Assert.assertEquals(s, expected, "Text  is not matching");
		//Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		Reporter.log("an error message of"+TextProperty.getProperty("CS3_ContinueError")+ "has been displayed");
		System.out.println("an error message of"+TextProperty.getProperty("CS3_ContinueError")+ "has been displayed");
		return new CheckOutStep3( driver);

	}


	/**MethodName:verifyTitle
	 * Description:This function verify the title of the page
	 * @return CheckOutStep3
	 * Author:Manjula 
	 */
	public CheckOutStep3 verifyTitle()
	{
		CustomFunction.isElementPresent(CS3_RSTitle,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyTitleDescription()
	 * Description:This function verify the description below  title of the page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyTitleDescription()
	{
		CustomFunction.isElementPresent(CS3_RSTitleDescription,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyTodayspaymentsectio()
	 * Description:This function verify the todays payment section
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyTodayspaymentsectio()
	{
		CustomFunction.isElementPresent(CS3_RSTodaysPayment,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyPayFullAmtRadioBtn()
	 * Description:This function verify THE Pay full amount radio button
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyPayFullAmtRadioBtn()
	{
		CustomFunction.isElementPresent(CS3_RSPayFullAmountRadioBtn,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyMakeDonationTitle()
	 * Description:This function verify the make donation title of checkout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyMakeDonationTitle()
	{
		CustomFunction.isElementPresent(CS3_RSMakeDonationTitle,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyMakeDonationDescription()
	 * Description:This function verify the make donation title description of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyMakeDonationDescription()
	{
		CustomFunction.isElementPresent(CS3_RSMakeDonationDescription,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyNoThankYouRadioBtn()
	 * Description:This function verify the No Thank You Radio button
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyNoThankYouRadioBtn()
	{
		CustomFunction.isElementPresent(CS3_RSNoThankYouRadioBtn,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verify$10RadioBtn()
	 * Description:This function verify the $10 Radio Button of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verify$10RadioBtn()
	{
		CustomFunction.isElementPresent(CS3_RSNoThankYouRadioBtn,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verify$25RadioBtn()
	 * Description:This function verify the $25 Radio Button of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verify$25RadioBtn()
	{
		CustomFunction.isElementPresent(CS3_RS$25RadioBtn,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verify$35RadioBtn()
	 * Description:This function verify the $35 Radio Button of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verify$35RadioBtn()
	{
		CustomFunction.isElementPresent(CS3_RS$35RadioBtn,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyCustomAmountRadioBtn()
	 * Description:This function verify the custom amount  Radio Button of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyCustomAmountRadioBtn()
	{
		CustomFunction.isElementPresent(CS3_RSCustomAmountRadioBtn,driver);
		return new CheckOutStep3(driver) ;
	}
	
	 /**MethodName:verifyCustomAmountTextBox()
	  * Description:This function verify the custom amount text box of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyCustomAmountTextBox()
	 {
	  CustomFunction.isElementPresent(CS3_RSCustomAmountTextBox,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyPriceOverviewTitleText()
	  * Description:This function verify the price overview section title text of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyPriceOverviewTitleText()
	 {
	  CustomFunction.isElementPresent(CS3_RSPriceOverviewTitleText,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyTermsAndConditionSectionTitle()
	  * Description:This function verify the terms and condition section title of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyTermsAndConditionSectionTitle()
	 {
	  CustomFunction.isElementPresent(CS3_RSTermsAndCodition,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyTermsAndConditionSectionDescription()
	  * Description:This function verify the terms and condition description of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyTermsAndConditionSectionDescription()
	 {
	  CustomFunction.isElementPresent(CS3_RSTermsAndConditionDescription,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyViewTermsAndConditionLink()
	  * Description:This function verify the View terms and condition link of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyViewTermsAndConditionLink()
	 {
	  CustomFunction.isElementPresent(CS3_RSViewTermsAndConditionLink,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyIAcceptRadioButton()
	  * Description:This function verify the I Accept Radio button of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyIAcceptRadioButton()
	 {
	  CustomFunction.isElementPresent(CS3_RSIAcceptRadioBtn,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyPaymentTypeSectionTitle()
	  * Description:This function verify the Payment type section title of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyPaymentTypeSectionTitle()
	 {
	  CustomFunction.isElementPresent(CS3_RSPaymentTypeSectionTitle,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyPayByCheckRadioButton()
	  * Description:This function verify the Pay By Check Radio Button under Payment type section of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyPayByCheckRadioButton()
	 {
	  CustomFunction.isElementPresent(CS3_RSPayByCheckRadioBtn,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyPayByCreditCardRadioButton()
	  * Description:This function verify the Pay By credit card Radio Button under Payment type section of chekout step3 page
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyPayByCreditCardRadioButton()
	 {
	  CustomFunction.isElementPresent(CS3_CreditCard,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyItem()
	  * Description:This function verify the item subtitle under price overview section
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyItemSubTitle()
	 {
	  CustomFunction.isElementPresent(CS3_RSItem,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifySubTotal()
	  * Description:This function verify the subtotal section under price overview section
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifySubTotal()
	 {
	  CustomFunction.isElementPresent(CS3_RSSubTotal,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyOrderSummarySection()
	  * Description:This function verify the order summary section under price overview section
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyOrderSummarySection()
	 {
	  CustomFunction.isElementPresent(CS3_RSOrderSummary,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyTalkToUsSection()
	  * Description:This function verify Talk To Us section under price overview section
	  * @return CheckOutStep3
	  * Author:Manjula
	  */
	 public CheckOutStep3 verifyTalkToUsSection()
	 {
	  CustomFunction.isElementPresent(CS3_RSTalkToUs,driver);
	  return new CheckOutStep3(driver) ;
	 }
         /**MethodName:verifyOSTriptitle
		 * @return CheckOutStep3
	 * @throws InterruptedException 
		 * Author:Sukrity
		 */
	 public CheckOutStep3 verifyOSTriptitle() throws InterruptedException
	 {
		 GUIFunctions.normalWait();
	  CustomFunction.isElementPresent(CS3_OSTripTitle,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyOSPersonCount
		 * @return CheckOutStep3
	 * @throws InterruptedException 
		 * Author:Sukrity
		 */
	 public CheckOutStep3 verifyOSPersonCount() throws InterruptedException
	 {
		 Thread.sleep(1000);
	  CustomFunction.isElementPresent(CS3_OSPersonCount,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyOSItemPrice
		 * @return CheckOutStep3
	 * @throws InterruptedException 
		 * Author:Sukrity
		 */
	 public CheckOutStep3 verifyOSItemPrice() throws InterruptedException
	 {
		 Thread.sleep(1000);
	  CustomFunction.isElementPresent(CS3_OSItemPrice,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 /**MethodName:verifyOSFlightText
		 * @return CheckOutStep3
	 * @throws InterruptedException 
		 * Author:Sukrity
		 */
	 public CheckOutStep3 verifyOSFlightText() throws InterruptedException
	 {
		 Thread.sleep(1000);
	  CustomFunction.isElementPresent(CS3_OSFlightText,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 
	 /**MethodName:verifyOSTotalPrice
		 * @return CheckOutStep3
	 * @throws InterruptedException 
		 * Author:Sukrity
		 */
	 public CheckOutStep3 verifyOSTotalPrice() throws InterruptedException
	 {
		 Thread.sleep(1000);
	  CustomFunction.isElementPresent(CS3_OSTotalPrice,driver);
	  return new CheckOutStep3(driver) ;
	 }
	 	/**MethodName:enterPayByCreditCardDetails
	 * Description:This function is to enter Pay By CreditCard Details
	 * @return CheckOutThankYou
	 * Author:Sravani
	 */
	public CheckOutThankYou enterPayByCreditCardDetails()throws InterruptedException {

		//To enter Payment details <Pay By Credit card details>
		System.out.println("Entering method");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		String creditCardNumber = CustomFunction.payment_CreditDetails.getCard_Number();
		System.out.println("Credit number" + creditCardNumber);
		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver, CS3_CreditCardNumber,creditCardNumber);
		GUIFunctions.normalWait();
		String CVCNumber = CustomFunction.payment_CreditDetails.getCVC_Number();
		GUIFunctions.normalWait();
		GUIFunctions.enterValueIntoTextBox(driver, CS3_CreditCVCNumber, CVCNumber);
		// select card type
		GUIFunctions.normalWait();
		String CardType = CustomFunction.payment_CreditDetails.getCard_Type();
		GUIFunctions.normalWait();
		Select sel = new Select(driver.findElement(CS3_CreditCardType));
		GUIFunctions.normalWait();
		sel.selectByVisibleText(CardType);
		Thread.sleep(1000);
		GUIFunctions.normalWait();
		String Month=CustomFunction.payment_CreditDetails.getExpiry_Month();
		Select sel1 = new Select(driver.findElement(CS3_CreditExpiryMonth));
		sel1.selectByValue(Month);
		Thread.sleep(1000);
		GUIFunctions.normalWait();
		String Year=CustomFunction.payment_CreditDetails.getExpiry_Year();
		GUIFunctions.normalWait();
		Select sel2 = new Select(driver.findElement(CS3_CreditExpiryYear));
		sel2.selectByValue(Year);
		Thread.sleep(5000);
		System.out.println("Complete buttton should be clicked");
		Thread.sleep(5000);
		GUIFunctions.clickElement(driver, CS3_Continue, "continue");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutThankYou(driver);
	}

	/**MethodName:VerifyFirstName
	 * Description:This function is to VerifyFirstName
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 VerifyFirstName() throws InterruptedException
	{
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CS3_CreditName,driver);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
	}


	/**MethodName:VerifyCreditCardNumber
	 * Description:This function is to Verify CreditCard Number
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 VerifyCreditCardNumber() throws InterruptedException
	{
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CS3_CreditCardNumber,driver);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:VerifyCreditCVCNumber
	 * Description:This function is to Verify CreditCard Number
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 VerifyCreditCVCNumber() throws InterruptedException
	{
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CS3_CreditCVCNumber,driver);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
	}


	/**MethodName:VerifyCreditCardType
	 * Description:This function is to Verify CreditCardType
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 VerifyCreditCardType() throws InterruptedException
	{
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CS3_CreditCardType,driver);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:VerifyCreditExpiryMonth
	 * Description:This function is to Verify CreditExpiryMonth
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 VerifyCreditExpiryMonth() throws InterruptedException
	{	
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CS3_CreditExpiryMonth,driver);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
	}


	/**MethodName:VerifyCreditExpiryYear
	 * Description:This function is to Verify CreditExpiryYear
	 * @return CheckOutStep3
	 * Author:Sravani
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 CS3_CreditExpiryYear() throws InterruptedException
	{
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CS3_CreditExpiryMonth,driver);
		driver.switchTo().defaultContent();
		System.out.println("Successfully navigated to default window");
		return new CheckOutStep3(driver) ;
	}

/**MethodName:clickOn$10RadioButton()
	 * Description:This function clicks on $10 Radio button under make a donation section
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 clickOn$10RadioButton()
	{
		GUIFunctions.clickElement(driver, CS3_RS$10RadioBtn, "$10");
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:clickOnViewTermsAndConditionLink()
	 * Description:This function clicks on the View terms and condition link of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 clickOnViewTermsAndConditionLink()
	{
		GUIFunctions.clickElement(driver, CS3_RSViewTermsAndConditionLink, "view terms and condition link");
		return new CheckOutStep3(driver) ;
	}



	/**MethodName:clickOnPayByCheckRadioButton()
	 * Description:This function click on the Pay By Check Radio Button under Payment type section of chekout step3 page
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 clickOnPayByCheckRadioButton()
	{
		GUIFunctions.clickElement(driver, CS3_RSPayByCheckRadioBtn, "Pay By Check");
		return new CheckOutStep3(driver) ;
	}

	//verify all the element
	/**MethodName:verifyNameOnAccountTextBox()
	 * Description:This function verify name on account text box of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyNameOnAccountTextBox()
	{
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		CustomFunction.isElementPresent(CS3_RSNameOnAccountText,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyAccountTypeTextBox()
	 * Description:This function verify  account type text box of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyAccountTypeTextBox()
	{
		CustomFunction.isElementPresent(CS3_RSAccountTypeTextBox,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyRoutingNumberTextBox()
	 * Description:This function verify  routing number text box of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyRoutingNumberTextBox()
	{
		CustomFunction.isElementPresent(CS3_RSRoutingNumberTextBox,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyAccountNumberTextBox()
	 * Description:This function verify account number text box of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyAccountNumberTextBox()
	{
		CustomFunction.isElementPresent(CS3_RSAccountNumberTextBox,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyBankNameTextBox()
	 * Description:This function verify bank name text box of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyBankNameTextBox()
	{
		CustomFunction.isElementPresent(CS3_RSBankName,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName:verifyAmountTextBox()
	 * Description:This function verify amount text box of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyAmountTextBox()
	{
		CustomFunction.isElementPresent(CS3_RSAmount,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName: verifyCompleteButton()
	 * Description:This function verify complete button of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 */
	public CheckOutStep3 verifyCompleteButton()
	{
		CustomFunction.isElementPresent(CS3_RSCompleteButton,driver);
		return new CheckOutStep3(driver) ;
	}

	/**MethodName: clickOnCompleteButton()
	 * Description:This function click on complete button of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 clickOnCompleteButton() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CS3_RSCompleteButton, "complete button");
		driver.switchTo().defaultContent();
		GUIFunctions.normalWait();
		GUIFunctions.normalWait();
		return new CheckOutStep3(driver) ;
	}


	/**MethodName: enterAllMandatoryFields()
	 * Description:This function enters text into all mandatory fields of pay by check pop up
	 * @return CheckOutStep3
	 * Author:Manjula
	 * @throws InterruptedException 
	 */
	public CheckOutStep3 enterAllMandatoryFields() throws InterruptedException
	{
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);

		String Routing_Number=payment_CheckDetails.getRouting_Number();
	//	int rn=Integer.parseInt(Routing_Number);
		System.out.println( Routing_Number);
		GUIFunctions.enterValueIntoTextBox(driver, CS3_RSRoutingNumberTextBox,Routing_Number);
		log.info("Successfully entered routing number into routing number field of pay by check pop up\n");
		Reporter.log("<p>Successfully entered routing number into routing number field of pay by check pop up");
		GUIFunctions.normalWait();

		String Account_Number=payment_CheckDetails.getAccount_Number();
		System.out.println( Account_Number);
		GUIFunctions.enterValueIntoTextBox(driver, CS3_RSAccountNumberTextBox,Account_Number);
		log.info("Successfully entered account number into account number field of pay by check pop up\n");
		Reporter.log("<p>Successfully entered account number into account number field of pay by check pop up");
		GUIFunctions.normalWait();

		String Bank_Name=payment_CheckDetails.getBank_Name();
		System.out.println( Bank_Name);
		GUIFunctions.enterValueIntoTextBox(driver, CS3_RSBankName, Bank_Name);
		log.info("Successfully entered bank name into bank name field of pay by check pop up\n");
		Reporter.log("<p>Successfully entered account number into bank name field of pay by check pop up");
		GUIFunctions.normalWait();
		GUIFunctions.normalWait();
		return new CheckOutStep3(driver) ;
	}




}
