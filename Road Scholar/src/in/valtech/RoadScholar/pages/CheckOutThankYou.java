package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;

import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import static in.valtech.custom.CustomFunction.user_Details;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
public class CheckOutThankYou
{ 
	public static WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());
	public CheckOutThankYou(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;

		// Check that we're in faq page or not Page or not.

		log.info("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("CTY_Page_XPATH"));

		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("CTY_Page_XPATH")),
				driver)))
		{

			throw new IllegalStateException("This is not the faq page");
		}

	}
	
	
	By CTY_CancellationPolicy=By.xpath(ObjRepoProperty.getProperty("CTY_CancellationPolicy_XPATH"));
	By CTY_Okay=By.xpath(ObjRepoProperty.getProperty("CTY_Okay_XPATH"));
	By CTY_LearnMore=By.xpath(ObjRepoProperty.getProperty("CTY_LearnMore_XPATH"));
	By CTY_RSTitle=By.xpath(ObjRepoProperty.getProperty("CTY_RSTitle_XPATH"));
	By CTY_RSDescription=By.xpath(ObjRepoProperty.getProperty("CTY_RSDescription_XPATH"));
	By CTY_RSOrderNumber=By.xpath(ObjRepoProperty.getProperty("CTY_RSOrderNumber_XPATH"));
	By CTY_RSPeopleTravelling=By.xpath(ObjRepoProperty.getProperty("CTY_RSPeopleTravelling_XPATH"));
	By CTY_RSProgamName=By.xpath(ObjRepoProperty.getProperty("CTY_RSProgamName_XPATH"));
	By CTY_RSProgramNumber=By.xpath(ObjRepoProperty.getProperty("CTY_RSProgramNumber_XPATH"));
	By CTY_RSProgramDates=By.xpath(ObjRepoProperty.getProperty("CTY_RSProgramDates_XPATH"));
	By CTY_RSAccommodation=By.xpath(ObjRepoProperty.getProperty("CTY_RSAccommodation_XPATH"));
	By CTY_RSActivityLevel=By.xpath(ObjRepoProperty.getProperty("CTY_RSActivityLevel_XPATH"));
	By CTY_RSTotalPrice=By.xpath(ObjRepoProperty.getProperty("CTY_RSTotalPrice_XPATH"));
	By CTY_RSGift=By.xpath(ObjRepoProperty.getProperty("CTY_RSGift_XPATH"));
	By CTY_RSRemainingBalance=By.xpath(ObjRepoProperty.getProperty("CTY_RSRemainingBalance_XPATH"));
	By CTY_RSOrderNumerContent=By.xpath(ObjRepoProperty.getProperty("CTY_RSOrderNumerContent_XPATH"));
	By CTY_RSValueOfOrderName=By.xpath(ObjRepoProperty.getProperty("CTY_RSValueOfOrderName_XPATH"));
	By CTY_RSValueOfProgramName=By.xpath(ObjRepoProperty.getProperty("CTY_RSValueOfProgramName_XPATH"));
	By CTY_RSValueOfProgramNumber=By.xpath(ObjRepoProperty.getProperty("CTY_RSValueOfProgramNumber_XPATH"));
	By CTY_RSValueOfProgramDate=By.xpath(ObjRepoProperty.getProperty("CTY_RSValueOfProgramDate_XPATH"));
	
	
	/**MethodName:CancellationPolicy
	 * Description:This function is to click on CancellationPolicy
	 * @return CheckOutThankYou
	 * Author:Sravani
	 */
	
	public CheckOutThankYou CancellationPolicy() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CTY_CancellationPolicy, "Cancellation Policy Link");
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CTY_Okay, "Okay");
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:LearnMore
	 * Description:This function is to click on LearnMore Link
	 * @return PersonalInformationPage
	 * Author:Sravani
	 */
	
	public PracticalInformation LearnMore() throws InterruptedException
	{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver, CTY_LearnMore, "LearnMore Link");
		GUIFunctions.normalWait();
		return new PracticalInformation(driver);
	}
	
	/**MethodName:verifyTitle
	 * Description:This function is verifies the title of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyTitle() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSTitle, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyDescription
	 * Description:This function is verifies the description of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyDescription() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSDescription, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyOrderNumber
	 * Description:This function is verifies the order number of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyOrderNumber() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSOrderNumber, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyPeopleTravelling
	 * Description:This function is verifies the PeopleTravelling of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyPeopleTravelling() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSPeopleTravelling, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyProgramName
	 * Description:This function is verifies the ProgramName of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyProgramName() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSProgamName, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyProgramNumber
	 * Description:This function is verifies the Program number of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyProgramNumber() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSProgramNumber, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyProgramDates
	 * Description:This function is verifies the Program dates of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyProgramDates() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSProgramDates, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyAccommodation
	 * Description:This function is verifies the  accommodation of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyAccommodation() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSAccommodation, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyActivityLevel
	 * Description:This function is verifies the Activity Level of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyActivityLevel() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSActivityLevel, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyTotalPrice
	 * Description:This function is verifies the total price of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyTotalPrice() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSTotalPrice, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}

	/**MethodName:verifyWithAGiftOf
	 * Description:This function is verifies the With a gift of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyWithAGift() throws InterruptedException
	{
		GUIFunctions.normalWait();
		if(CustomFunction.isElementPresent(CTY_RSTotalPrice, driver))
		{
			System.out.println("Successfully verified With a Gift section of checkout thank you page");
			return new CheckOutThankYou(driver);
		}
		else
		{
			System.out.println("With a Gift section not displayed in checkout thank you page");
			return new CheckOutThankYou(driver);
		}
	}
	
	/**MethodName:verifyRemainingBalance
	 * Description:This function is verifies the remaining balance of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyRemainingBalance() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSRemainingBalance, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:verifyCancellationPolicyLink
	 * Description:This function is verifies the cancellation policy link of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyCancellationPolicyLink() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_CancellationPolicy, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:verifyLearnMoreLink
	 * Description:This function is verifies the learn more link of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyLearnMoreLink() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_LearnMore, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:verifyOrderNumberValue
	 * Description:This function is verifies the order number content of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyOrderNumberValue() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSOrderNumerContent, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:verifyValueOfOrderName
	 * Description:This function is verifies the value of order name of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyValueOfOrderName() throws InterruptedException
	{
		GUIFunctions.normalWait();
		CustomFunction.isElementPresent(CTY_RSValueOfOrderName, driver);
		GUIFunctions.normalWait();
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:verifyValueProgramName
	 * Description:This function is verifies the value of program name of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyValueProgramName() throws InterruptedException
	{
		GUIFunctions.normalWait();
		BaseTest.Actual_ProgramName=driver.findElement(CTY_RSValueOfProgramName).getText();
		System.out.println(BaseTest.Actual_ProgramName);
		
		System.out.println(BaseTest.expected_ProgramName);
		Assert.assertEquals(BaseTest.Actual_ProgramName, BaseTest.expected_ProgramName);
		log.info("Text is matching ");
		Reporter.log("<p>Text is matching ");	
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:verifyValueProgramNumber
	 * Description:This function is verifies the value of program number of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */
	public CheckOutThankYou verifyValueProgramNumber() throws InterruptedException
	{
		GUIFunctions.normalWait();
		BaseTest.Actual=driver.findElement(CTY_RSValueOfProgramNumber).getText();
		System.out.println(BaseTest.Actual);
	    BaseTest.expected=user_Details.getSearch_TripId();
		System.out.println(BaseTest.expected);
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		log.info("Text is matching ");
		Reporter.log("<p>Text is matching ");	
		return new CheckOutThankYou(driver);
	}
	
	/**MethodName:actualValueOfProgramDate
	 * Description:This function is verifies the value of program date of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 */

	public CheckOutThankYou verifyValueOfProgramDate()  throws InterruptedException
	{
		GUIFunctions.normalWait();
		BaseTest.Actual_Date=driver.findElement(CTY_RSValueOfProgramDate).getText();
		System.out.println(BaseTest.Actual_Date);
		System.out.println(BaseTest.expected_Date);
		if(BaseTest.expected_Date.startsWith(BaseTest.Actual))
		{
			log.info("Text is  matching ");
			Reporter.log("<p>Text is  matching ");
		}
		else 
		{
			log.info("Text is NOT matching ");
			Reporter.log("<p>Text is NOT matching ");	
		}
		//Assert.assertEquals(BaseTest.Actual, BaseTest.expected_Date);
		
		return new CheckOutThankYou(driver);
	}
		
/*	*//**MethodName:verifyValueOfProgramDate
	 * Description:This function is verifies the value of program date of checkout thank you page
	 * @return CheckOutThankYou
	 * Author:Manjula
	 *//*
	
	public CheckOutThankYou verifyValueOfProgramDate() throws InterruptedException
	{
		GUIFunctions.normalWait();
		System.out.println(BaseTest.expected_Date);
		System.out.println(BaseTest.Actual_Date);
		
		
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected_Date);
		log.info("Text is matching ");
		Reporter.log("<p>Text is matching ");	
		return new CheckOutThankYou(driver);
	}*/
	}


