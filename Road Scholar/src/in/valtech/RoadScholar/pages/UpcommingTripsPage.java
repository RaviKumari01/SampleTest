package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import static in.valtech.custom.CustomFunction.payment_CreditDetails;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UpcommingTripsPage {

	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());

	public UpcommingTripsPage(WebDriver driver) {
		this.driver=driver;
		log.info("UpcomingTrip Page title" + driver.getTitle());
		
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("UTP_UpcomingTripsPage_XPATH"));
		
		if (!(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("UTP_UpcomingTripsPage_XPATH")),
				driver))) {
			throw new IllegalStateException("This is not the UpcomingTrip page");
		}
	}

	// ===============================Locators===================================	
	By UTP_RightArrow= By.xpath(ObjRepoProperty.getProperty("UTP_RightArrow_XPATH"));
	By UTP_MakeAPaymentButton= By.xpath(ObjRepoProperty.getProperty("UTP_MakeAPaymentButton_XPATH"));
	By UTP_PayByCreditCard= By.xpath(ObjRepoProperty.getProperty("UTP_PayByCreditCardRadioButton_XPATH"));
	By UTP_CancelButton= By.xpath(ObjRepoProperty.getProperty("UTP_CancelButton_XPATH")); 
	By UTP_Error= By.xpath(ObjRepoProperty.getProperty("UTP_ErrorMessage_XPATH"));
	By UTP_MakePaymentRadioBtn= By.xpath(ObjRepoProperty.getProperty("UTP_MakePaymentRadioButton_XPATH"));
	By UTP_makePaymentTextBox=By.xpath(ObjRepoProperty.getProperty("UTP_MakePaymentTextBox_XPATH"));
	By UTP_CreditCardTextBox=By.xpath(ObjRepoProperty.getProperty("UTP_CreditCardTextBox_XPATH"));
	By UTP_CVCNumberTextBox=By.xpath(ObjRepoProperty.getProperty("UTP_CVCNumber_XPATH"));
	By UTP_CardTypeDropDown=By.xpath(ObjRepoProperty.getProperty("UTP_CardTypeDropDown_XPATH"));
	By UTP_ExpirationDateMonth=By.xpath(ObjRepoProperty.getProperty("UTP_ExpirationDateMonth_XPATH"));
	By UTP_ExpirationDateYear=By.xpath(ObjRepoProperty.getProperty("UTP_ExpirationDateYear_XPATH")); 
	By UTP_CompleteBtn=By.xpath(ObjRepoProperty.getProperty("UTP_CompleteBtn_XPATH"));

	
	/**MethodName:ClickOnArrow
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage ClickOnArrow() throws InterruptedException{
		Thread.sleep(1000);
		while (!CustomFunction.isElementPresent(UTP_MakeAPaymentButton,driver)) {
			Thread.sleep(1000);
			GUIFunctions.clickElement(driver, UTP_RightArrow , "UTP_RightArrow");
		}
		return new UpcommingTripsPage(driver);
	}

	/**MethodName:ClickOnMakeAPaymentButton
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage ClickOnMakeAPaymentButton() throws InterruptedException{
		GUIFunctions.clickElement(driver, UTP_MakeAPaymentButton , "MakeAPaymentButton");
		Thread.sleep(1000);
		return new UpcommingTripsPage(driver);
	}

	/**MethodName:SelectMakePaymentOption
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage SelectMakePaymentOption() throws InterruptedException{
		GUIFunctions.clickElement(driver,UTP_MakePaymentRadioBtn , "MakePayment");
		Thread.sleep(1000);
		return new UpcommingTripsPage(driver);
	}

	/**MethodName:EnterValueIntoMakePaymentTextBox
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage EnterValueIntoMakePaymentTextBox() throws InterruptedException {
		String amount=payment_CreditDetails.getAmount();
		log.info("amount"+amount);
		GUIFunctions. enterValueIntoTextBox(driver, UTP_makePaymentTextBox , amount);
		Thread.sleep(1000);
		return new UpcommingTripsPage(driver);
	}

	/**MethodName:Select PayByCreditCard option
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage SelectPayByCreditCardOption() throws InterruptedException{
		GUIFunctions.clickElement(driver, UTP_PayByCreditCard , "PayByCreditCard");
		Thread.sleep(1000);
		return new UpcommingTripsPage(driver);
	}

	/**MethodName:EnterValueIntoPaymentFormsTextBox
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public ThankYouPageForUpcomingTrip EnterValueIntoPaymentFormsTextBox() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("Navigate to Payment module");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		// Enter value in CreditCard Number textbox
		String CreditCardNumber=payment_CreditDetails.getCard_Number();
		GUIFunctions. enterValueIntoTextBox(driver, UTP_CreditCardTextBox , CreditCardNumber);
		// Enter value in CVC Number textbox
		String CVCNumber=payment_CreditDetails.getCVC_Number();
		GUIFunctions. enterValueIntoTextBox(driver, UTP_CVCNumberTextBox , CVCNumber);
		// select card type from Dropdown
		String CardType=payment_CreditDetails.getCard_Type();
		GUIFunctions.SelectDropdownValue(driver,UTP_CardTypeDropDown,CardType);
		Thread.sleep(1000);
		// select ExpirationDate Month from Dropdown
		GUIFunctions.SelectDropdownValueByIndex(driver,UTP_ExpirationDateMonth, 4);
		Thread.sleep(1000);
		// select ExpirationDate Year from Dropdown
		GUIFunctions.SelectDropdownValueByIndex(driver,UTP_ExpirationDateYear, 5);
		Thread.sleep(1000);
		//CLICK on complete btn
		GUIFunctions.clickElement(driver, UTP_CompleteBtn , "CompleteBtn");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		return new ThankYouPageForUpcomingTrip(driver);
	}

	/**MethodName:Verify error message
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage VerifyErrorMessage() throws Exception{
		BaseTest.Actual=driver.findElement(UTP_Error).getText();					
		BaseTest.expected=TextProperty.getProperty("UTP_ErrorMessage");
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		log.info("Error message Successfully Verified");
		return new UpcommingTripsPage(driver);
	}

	/**MethodName:Click on cancel button
	 * @return UpcommingTrips Page
	 * @throws InterruptedException 
	 * Author:Sukrity
	 */
	public UpcommingTripsPage ClickOnCancelButton() throws InterruptedException{
		GUIFunctions.clickElement(driver, UTP_CancelButton , "CancelButton");
		Thread.sleep(1000);
		return new UpcommingTripsPage(driver);
	}
}

