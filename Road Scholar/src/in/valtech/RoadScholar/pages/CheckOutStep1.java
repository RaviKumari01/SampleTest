package in.valtech.RoadScholar.pages;
import static in.valtech.util.PropertyFileReader.TextProperty;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import static in.valtech.util.PropertyFileReader.ObjRepoProperty;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class CheckOutStep1
{
	public final WebDriver driver;

	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());


	public CheckOutStep1(WebDriver driver)
	
	{
		this.driver=driver;
		log.info("RS CheckOut step1 Page title" + driver.getTitle());
		// Check that we're on the right page-RS Checkout step2 page
		if(driver.getTitle().contentEquals(TextProperty.getProperty("checkOutPageTitle")))

		{
			log.info("user is in checkout STEP1  page");
			System.out.println("user is in checkout step1  Page ");
		}
		else
		{
			log.info("user is not in checkout Step1 Page");
			System.out.println("user is not in checkout step1 Page ");
		}
	}
		

	By CS1_ClickOnOnePerson=By.xpath(ObjRepoProperty.getProperty("CS1_ClickOnOnePerson_XPATH"));
	By CS1_SelectRadioBtn=By.xpath(ObjRepoProperty.getProperty("CS1_SelectRadioBtn_XPATH"));
	By CS1_Continue=By.xpath(ObjRepoProperty.getProperty("CS1_Continue_XPATH"));
	By CS1_ContinueErrorMsg=By.xpath(ObjRepoProperty.getProperty("CS1_ContinueErrorMsg_XPATH"));
	By CS1_TwoPeopleLodging=By.xpath(ObjRepoProperty.getProperty("CS1_TwoPeopleLodging_XPATH"));
	By CS1_Double=By.xpath(ObjRepoProperty.getProperty("CS1_Double_XPATH"));
	By CS1_Single=By.xpath(ObjRepoProperty.getProperty("CS1_Single_XPATH"));
	By CS1_ChangeDateBtn=By.xpath(ObjRepoProperty.getProperty("CS1_ChangeDateBtn_XPATH"));
	By CS1_RSNoInterfaceRadioButton=By.xpath(ObjRepoProperty.getProperty("CS1_RSNoInterfaceRadioButton_XPATH"));
	By step1YourTripNavigationBar =By.xpath(ObjRepoProperty.getProperty("CS1_step1YourTripNavigationBar_XPATH"));
	 By step2YourDetailsNavigationBar =By.xpath(ObjRepoProperty.getProperty("CS1_step2YourDetailsNavigationBar_XPATH"));
	 By step3PaymentNavigationBar =By.xpath(ObjRepoProperty.getProperty("CS1_step3PaymentNavigationBar_XPATH"));
	 By dateSelectedText =By.xpath(ObjRepoProperty.getProperty("CS1_dateSelectedText_XPATH"));
	 By step1PageTitle =By.xpath(ObjRepoProperty.getProperty("CS1_Step1PageTitle_XPATH"));
	 By step1PageSubTitle =By.xpath(ObjRepoProperty.getProperty("CS1_step1PageSubTitle_XPATH"));
	 By tripComponentSection =By.xpath(ObjRepoProperty.getProperty("CS1_tripComponentSection_XPATH"));
	 By step1PageYourTripDatesTitle =By.xpath(ObjRepoProperty.getProperty("CS1_step1PageYourTripDatesTitle_XPATH"));
	 By programImage =By.xpath(ObjRepoProperty.getProperty("CS1_programImage_XPATH"));
	 By programNumber =By.xpath(ObjRepoProperty.getProperty("CS1_programNumber_XPATH"));
	 By programTitle =By.xpath(ObjRepoProperty.getProperty("CS1_programTitle_XPATH"));
	 By programSelectedDate =By.xpath(ObjRepoProperty.getProperty("CS1_programSelectedDate_XPATH"));
	 By programDuration =By.xpath(ObjRepoProperty.getProperty("CS1_programDuration_XPATH"));
	 By changeButton =By.xpath(ObjRepoProperty.getProperty("CS1_changeButton_XPATH"));
	 By needAirfareSection =By.xpath(ObjRepoProperty.getProperty("CS1_needAirfareSection_XPATH"));
	 By priceOverviewSection =By.xpath(ObjRepoProperty.getProperty("CS1_priceOverviewSection_XPATH"));
	 By itemColumnInPriceOverviewSection =By.xpath(ObjRepoProperty.getProperty("CS1_itemColumnInPriceOverviewSection_XPATH"));
	 By subtotalColumnInPriceOverviewSection =By.xpath(ObjRepoProperty.getProperty("CS1_subtotalColumnInPriceOverviewSection_XPATH"));
	 By programTitleInPriceOverviewSection =By.xpath(ObjRepoProperty.getProperty("CS1_programTitleInPriceOverviewSection_XPATH"));
	 By overAllQuantityInPriceOverviewSection=By.xpath(ObjRepoProperty.getProperty("CS1_OverAllQuantityInPriceOverviewSection_XPATH"));
	 By subTotalValueInPriceOverviewSection =By.xpath(ObjRepoProperty.getProperty("CS1_SubTotalValueInPriceOverviewSection_XPATH"));
	 By CS1_VerifyGatewayOption=By.xpath(ObjRepoProperty.getProperty("CS1_VerifyGatewayOption_XPATH"));
	 By DepDropdown=By.xpath(ObjRepoProperty.getProperty("TRP_DepDropDown_XPATH"));
	
	/**MethodName:clickOnOnePerson
	 * Description:This function is to clickOnOnePerson
	 * @return CheckOutStep1
	 * Author:Sravani
	 */
	
	//Click on one person under Number of Travelers & Lodging section
	public CheckOutStep1 clickOnOnePerson()
	{
		GUIFunctions.clickElement(driver, CS1_ClickOnOnePerson, "One Person");
		return new CheckOutStep1(driver) ;
	}
	
	 /**MethodName:selectNoAirfareRadioBtn
	   * Description:This function is to select No AirfareRadio Button
	   * @return CheckOutStep1
	   * Author:Sravani
	   */
	  //select the No Air fare radio button
	  public CheckOutStep1 selectNoAirfareRadioBtn()
	  {
	   if(CustomFunction.isElementPresent(CS1_RSNoInterfaceRadioButton, driver))
	   {
	   GUIFunctions.selectRaidoButton(driver, CS1_RSNoInterfaceRadioButton, "NoAirfare");
	   return new CheckOutStep1(driver);
	   }
	   else
	   {
	    return new CheckOutStep1(driver);
	   }
	  }


	/**MethodName:ClickContinue
	 * Description:This function is to Click on continue Button
	 * @return CheckOutStep1
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep2 ClickContinue() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, CS1_Continue, "Continue Button");
	    GUIFunctions.normalWait();
		return new CheckOutStep2(driver);
	}


	/**MethodName:VerifyError
	 * Description:This function is to verify error message when user click on continue button with out filling the details.
	 * @return CheckOutStep1
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public CheckOutStep1 verifyError()throws InterruptedException
	{

		BaseTest.Actual=driver.findElement(CS1_ContinueErrorMsg).getText();
		System.out.println("Actual valus is"+BaseTest.Actual);
		BaseTest.expected=TextProperty.getProperty("CS1_Error");
		System.out.println("Expected Value is "+BaseTest.expected);
		Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
		Reporter.log("an error message of"+TextProperty.getProperty("CS1_Error")+ "has been displayed");
		System.out.println("an error message of"+TextProperty.getProperty("CS1_Error")+ "has been displayed");
		return new CheckOutStep1( driver);

	}
	
	/**MethodName:clickOnTwoPerson
	 * Description:This function is to clickOnTwoPerson
	 * @return CheckOutStep1
	 * @throws InterruptedException 
	 * Author:Sravani
	 */

	//Click on tWO person under Number of Travelers & Lodging section
	public CheckOutStep1 clickOnTwoPerson()
	{
		GUIFunctions.clickElement(driver, CS1_TwoPeopleLodging, "Two Person");
		return new CheckOutStep1(driver) ;
	}

	/**MethodName:clickOnDouble
	 * Description:This function is to Click on tWO person under Number of Travelers & Lodging section under Double
	 * Author:Sravani
	 */


	//Click on tWO person under Number of Travelers & Lodging section under Double
	public CheckOutStep1 clickOnDouble()

	{
		GUIFunctions.clickElement(driver, CS1_Double, "Double");
		return new CheckOutStep1(driver) ;
	}
	
	/**MethodName:selectsingleRadioBtn
	 * Description:This function is to selectsingleRadioBtn
	 * Author:Sravani
	 */
	public CheckOutStep1 selectsingleRadioBtn()
	{
		GUIFunctions.selectRaidoButton(driver, CS1_Single, "Single");
		return new CheckOutStep1(driver);
	}
	
	
	/**MethodName:selectRadioBtn
     * Description:This function select the radio button
     
     * @return CheckOutStep1
    * @throws InterruptedException 
     * Author:Manjula
     */
   public CheckOutStep1 selectRadioBtn() throws InterruptedException
   {
	
    GUIFunctions.clickElement(driver, CS1_SelectRadioBtn, "single");
    GUIFunctions.normalWait();
    return new CheckOutStep1(driver);
   }
	 
	 /**MethodName:verifyChangeDateBtn
	   * Description:This function Verify the Change date button
	   
	   * @return CheckOutStep1
	  * @throws InterruptedException 
	   * Author:Manjula
	   */
	 public CheckOutStep1 verifyChangeDateBtn() throws Exception
	 {
	  CustomFunction.isElementVisible(CS1_ChangeDateBtn, driver);
	  return new CheckOutStep1(driver);
	 }
	 
	 
	 /**MethodName:clickOnChangeDateBtn
	   * Description:This function click on change date buttton
	   
	   * @return CheckOutStep1
	  * @throws InterruptedException 
	   * Author:Manjula
	   */
	 public TripDetailPage clickOnChangeDateBtn() throws Exception
	 {
	  GUIFunctions.clickElement(driver, CS1_ChangeDateBtn,"Change Date");
	  GUIFunctions.normalWait();
	  return new TripDetailPage(driver);
	 }
	
	 /**MethodName: clickOnNoInterfaceRadioButton()
	  * Description:This function is to Click on continue Button
	  
	  * @return CheckOutStep1
	 * @throws InterruptedException 
	  * Author:Manjula
	  */
	 public CheckOutStep1 clickOnNoInterfaceRadioButton() throws InterruptedException
	 {
	   GUIFunctions.clickElement(driver, CS1_RSNoInterfaceRadioButton, "No Interface");
	   GUIFunctions.normalWait();
	  return new CheckOutStep1(driver);
	 }
	
	
	 /**MethodName=verifyNavigationTabs
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */
		public CheckOutStep1 verifyNavigationTabs()throws Exception{
			//Verify the step 1 navigation bar
			Assert.assertTrue(CustomFunction.isElementPresent(
					step1YourTripNavigationBar, driver),
					"Step1: Your Trip navigation bar is not  displayed");
			System.out.println("Step1: Your Trip navigation bar is displayed");
			//Verify the step 2 navigation bar
			Assert.assertTrue(CustomFunction.isElementPresent(
					step2YourDetailsNavigationBar, driver),
					"Step2: Your Details navigation bar is not  displayed");
			System.out.println("Step2:Your Details navigation bar is displayed");
			//Verify the step 3 navigation bar
			Assert.assertTrue(CustomFunction.isElementPresent(
					step3PaymentNavigationBar, driver),
					"Step3: Payment navigation bar is not  displayed");
			System.out.println("Step3:Payment navigation bar is displayed");
			//Verify whether the step 1 navigation bar is highted
			String color=driver.findElement(step1YourTripNavigationBar).getCssValue("color");
			System.out.println("color=" + color);
				return new CheckOutStep1( driver);
		}
	 
	 
	 
		 /**MethodName= verifyDateSelectedText
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */
		public CheckOutStep1 verifyDateSelectedText()throws Exception{
			//Verify the date selected text 
			Assert.assertTrue(CustomFunction.isElementPresent(
					dateSelectedText, driver),
					"Date selected text  is not  displayed");
			System.out.println("Date selected text is displayed");
			
				return new CheckOutStep1( driver);
		}


		 /**MethodName= verifyTitle
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */

		public CheckOutStep1 verifyTitle() throws Exception {
			
			String expectedPDTitle = TextProperty
			.getProperty("Step1OfCheckoutPageTitle");
	String actuaTitle = driver.findElement(step1PageTitle).getText();
	System.out.println("actual = " + actuaTitle);
	System.out.println("expected = " + expectedPDTitle);
	Assert.assertEquals(actuaTitle, expectedPDTitle,
			"Title  is not matching");
	
			return new CheckOutStep1( driver);
		}
	 
		/**MethodName= verifySubTitle
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */

		public CheckOutStep1 verifySubTitle() throws Exception {
			
			String expectedPDTitle = TextProperty
			.getProperty("Step1OfCheckoutPageSubTitle");
	String actuaTitle = driver.findElement(step1PageSubTitle).getText();
	System.out.println("actual = " + actuaTitle);
	System.out.println("expected = " + expectedPDTitle);
	Assert.assertEquals(actuaTitle, expectedPDTitle,
			"SubTitle  is not matching");
	
			return new CheckOutStep1( driver);
		}

		/**MethodName= verifyTripComponentSection
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */

		public CheckOutStep1 verifyTripComponentSection() throws Exception {
			//Verify the trip component section
			Assert.assertTrue(CustomFunction.isElementPresent(
					tripComponentSection, driver),
					"Trip component section  is not  displayed");
			System.out.println("Trip component section is displayed");
			
			//Verify Your Trip dates title
			 String expectedPDTitle = TextProperty
			.getProperty("YourTripDatesTitle");
	String actuaTitle = driver.findElement(step1PageYourTripDatesTitle).getText();
	System.out.println("actual = " + actuaTitle);
	System.out.println("expected = " + expectedPDTitle);
	Assert.assertEquals(actuaTitle, expectedPDTitle,
			" YourTripDatesTitle is not matching");
	System.out.println("YourTripDatesTitle is displayed");
	//Verify Program image
	Assert.assertTrue(CustomFunction.isElementPresent(
			programImage, driver),
			"Program image  is not  displayed");
	System.out.println("Program image is displayed");
	
	//Verify Program number
			Assert.assertTrue(CustomFunction.isElementPresent(
					programNumber, driver),
					"Program Number  is not  displayed");
			System.out.println("Program Number is displayed below the Program image");
			//Verify Program title
			Assert.assertTrue(CustomFunction.isElementPresent(
					programTitle, driver),
					"Program title  is not  displayed");
			System.out.println("Program title is displayed ");
			//Verify Program selected date
			Assert.assertTrue(CustomFunction.isElementPresent(
					programSelectedDate, driver),
					"Program seletcted date is not  displayed");
			System.out.println("Program seletcted date is displayed ");
			//Verify Program duration
			Assert.assertTrue(CustomFunction.isElementPresent(
					programDuration, driver),
					"Program duration is not  displayed");
			System.out.println("Program duration is displayed ");
			//Verify Change button
			Assert.assertTrue(CustomFunction.isElementPresent(
					changeButton, driver),
					"Change button is not  displayed");
			System.out.println("Change button is displayed ");
	
         return new CheckOutStep1( driver);
			
		}


		/**MethodName= verifyNeedAirfareSection
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */
		public CheckOutStep1  verifyNeedAirfareSection() throws Exception{
			
			//Verify Need Airfare seection
		
			boolean value=CustomFunction.isElementPresent(
					needAirfareSection,driver);
			if(value== false)
			{
				System.out.println("Need airfare section  is not  displayed");
			}else System.out.println("Need airfare section is displayed");
			return new CheckOutStep1( driver);
			
		}

		/**MethodName= verifyPriceOverviewSection
		 *  @return=CheckOutStep1 page
		 * @throws Exception 
		 **Author:Kavya
		 */

		public CheckOutStep1 verifyPriceOverviewSection()  throws Exception{
			//Verify Price Overview section
			Assert.assertTrue(CustomFunction.isElementPresent(
					priceOverviewSection, driver),
					"Price Overview section is not  displayed");
			System.out.println("Price Overview section is displayed");
			//Verify Price overview section title
			String expectedTitle = TextProperty
					.getProperty("PriceOverviewTitle");
			String actuaTitle = driver.findElement(priceOverviewSection).getText();
			System.out.println("actual = " + actuaTitle);
			System.out.println("expected = " + expectedTitle);
			Assert.assertEquals(actuaTitle, expectedTitle,
					" Price overview Title is not matching");
			System.out.println("Price overview Title is displayed");
			// Verify Item column
			Assert.assertTrue(CustomFunction.isElementPresent(
					itemColumnInPriceOverviewSection, driver),
					"Item column in Price Overview section is not  displayed");
			System.out.println("Item column in Price Overview  is displayed");
			
			// Verify sub total column
			Assert.assertTrue(CustomFunction.isElementPresent(
					subtotalColumnInPriceOverviewSection, driver),
					"Sub total column in Price Overview section is not  displayed");
			System.out.println("Sub total column  in Price Overview  is displayed");
			
			// Verify program title in price overview section
			Assert.assertTrue(CustomFunction.isElementPresent(
					programTitleInPriceOverviewSection, driver),
					"Program title in Price Overview section is not  displayed");
			System.out.println("Program title  in Price Overview  is displayed");
			
			// Verify program title in price overview section
			Assert.assertTrue(CustomFunction.isElementPresent(
					programTitleInPriceOverviewSection, driver),
					"Program title in Price Overview section is not  displayed");
			System.out.println("Program title  in Price Overview  is displayed");
			
			// Verify overall quantity in price overview section
			Assert.assertTrue(CustomFunction.isElementPresent(
					overAllQuantityInPriceOverviewSection, driver),
					"OverAllQuantityInPriceOverviewSectionis not  displayed");
			System.out.println("OverAllQuantityInPriceOverviewSection is displayed");
			
			
			
			
			// Verify subtotal value in price overview section
			Assert.assertTrue(CustomFunction.isElementPresent(
					subTotalValueInPriceOverviewSection, driver),
					"Subtotal value in PriceOverview Section is not  displayed");
			System.out.println("Subtotal value in PriceOverview Section is not displayed");
			

			// Verify subtotal value in price overview section
			Assert.assertTrue(CustomFunction.isElementPresent(
					subTotalValueInPriceOverviewSection, driver),
					"Subtotal value in PriceOverview Section is not  displayed");
			System.out.println("Subtotal value in PriceOverview Section is not displayed");
			
			
			
			
			return new CheckOutStep1( driver);
			
		}
	 
	   public CheckOutStep1 verifyGateWayDropdownOption() throws Exception
	{
	  GUIFunctions.normalWait();
	  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
	  if(CustomFunction.isElementPresent(DepDropdown, driver))
		{
	  
	  BaseTest.Actual=driver.findElement(CS1_VerifyGatewayOption).getText();
	  Assert.assertEquals(BaseTest.Actual, BaseTest.expected);
	  System.out.println("Successfully verified GateWayDropdownOption");
		log.info("Successfully verified GateWayDropdownOption\n");
		}
	  return new CheckOutStep1(driver);
	}
	
	
	
	
}