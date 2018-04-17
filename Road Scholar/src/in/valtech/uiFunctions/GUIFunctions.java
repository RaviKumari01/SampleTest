package in.valtech.uiFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class GUIFunctions {

	public static Logger log = Logger.getLogger(GUIFunctions.class.getName());

	/**
	 * Method Name: navigateBack Description: This method is used to go back to previous page
	 * 
	 * @param driver
	 *            :WebDriver
	 * @return driver
	 */
	public static WebDriver navigateBack(WebDriver driver) {
		try {


			// Navigate back to Previous page
			driver.navigate().back();
			GUIFunctions.normalWait();


		} catch (Exception e) {
			log.error("Navigation to previous page failed--> \n" + e);
			Reporter.log("<p>Navigation to previous page failed");
		}

		return (driver);
	}

	//normal wait
	public static void normalWait() throws InterruptedException
	{
		Thread.sleep(5000);
	}	
	/**
	 * Method Name: clickElement Description: This method clicks on WebElement
	 * specified
	 * 
	 * @param driver
	 *            : WebDriver
	 * @param ele
	 *            : WebElement locator
	 * @param eleName
	 *            : Name of the element to be clicked
	 */

	public static void clickElement(WebDriver driver, By by, String eleName) 
	{
		try {

			WebElement element = driver.findElement(by);

			// Click on element
			element.click();

			log.info("Successfully clicked on element: " + eleName);


		} catch (NoSuchElementException e) {
			log.error("Element to click is not present " + e);

		}
	}
	/**
	 * This Function selects the radio button.
	 * 
	 * @param driver
	 *            : WebDriver instance.
	 */

	public static void selectRaidoButton(WebDriver driver, By by, String elementName) {
		// Initialize WebElement
		WebElement ele = driver.findElement(by);

		try {
			if (!ele.isSelected()) 
			{
				ele.click();
			}
			log.info("Successfully selected the raido button '" + elementName);
		}

		catch (NoSuchElementException e) {

			log.error("Exception element not present : " + elementName);
		}

	}
	/**
	 * Method Name: clickElement Description: This method is used to enter a value into text box
	 * 
	 * @param driver
	 *            : WebDriver
	 * @param ele
	 *            : WebElement locator

	 */
	public static void enterValueIntoTextBox(WebDriver driver, By by, String value) {
		try {

			// Click on element
			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(value);
		} catch (NoSuchElementException e) {
			log.error("Element to type data is not present " + e);
			Reporter.log("<p>Element to type data is not present");

		}
	}
	/** This method will select value from dropdown.
	 * 
	 * @param driver
	 * @param xpathOfElement
	 * @param value
	 */

	public static void SelectDropdownValue(WebDriver driver,String xpathOfElement,String value)
	{
		try

		{
			Select itemType = new Select(driver.findElement(By.xpath(xpathOfElement)));
			itemType.selectByVisibleText(value);

		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}

	}
	/**
	 * Method Name: verifyText Description: This method
	 * is used to compare the actual and expected value
	 * 
	 * @param driver
	 *            : WebDriver
	 * 
	 * */	


	public static void assertVerify(WebDriver driver, By by, String expectedValue) throws Exception

	{
		try 
		{
			WebElement element = driver.findElement(by);
			String ActualValue = element.getText();

			System.out.println("actual = "+ ActualValue);
			System.out.println("expected = "+ expectedValue);

			Assert.assertEquals(ActualValue, expectedValue, "Text is not matching");
			log.info("Text is matching ");
			Reporter.log("<p>Text is matching ");
		} catch (NoSuchElementException e) {
			log.error("Text is not matching");
			Reporter.log("<p>Text is not matching");	


		}

	}



	//Author:Manjula

	public static int   assertVerifyLength(WebDriver driver, By by, String expectedValue) throws Exception

	{
		try 
		{
			WebElement element = driver.findElement(by);
			String ActualValue = element.getAttribute("maxlength");

			System.out.println("actual = "+ ActualValue);
			System.out.println("expected = "+ expectedValue);

			Assert.assertEquals(ActualValue, expectedValue, "Text is not matching");
			log.info("Maximum value for  text field is  ="+ ActualValue);
			Reporter.log("<p>Text is matching ");
			int i=Integer.parseInt(ActualValue);
			return i;

		} catch (NoSuchElementException e) {
			log.error("Text is not matching");
			Reporter.log("<p>Text is not matching");	


		}
		return 0;
	}




	//Clear any field

	public static void clear(WebDriver driver, By by)
	{
		driver.findElement(by).clear();

	}
	/**Method:
	 * Description:To delete browser cookies 
	 * Author:Ashritha
	 * 
	 * 
	 */
	public static void DeleteCookies(WebDriver driver) 
	{
		driver.manage().deleteAllCookies();
	}
	/**
	 * Method Name: mouseHover Description: This method
	 * is used to mouse hover on element
	 * 
	 * @param driver
	 *            : WebDriver
	 * 
	 * */ 

	public static void mouseHover(WebDriver driver, By by,String eleName ) throws Exception

	{
		try 
		{

			WebElement mouseElement=driver.findElement(by);
			Actions builder=new Actions(driver);
			builder.moveToElement(mouseElement).build().perform();

			log.info("mouse hover function is done ");
			Reporter.log("<p>mouse hover function is done");
		} catch (NoSuchElementException e) {
			log.error("There is some problem with mouse hover");
			Reporter.log("<p>There is some problem with mouse hover"); 


		}
	}
	//Clicking on value from dropdown
	public static void dropdownClick(WebDriver driver , By by)
	{
		driver.findElement(by).click();
	}

	/** This method will select value from dropdown.
	 * 
	 * @param driver
	 * @param xpathOfElement
	 * @param value
	 */
	public static void SelectDropdownValueByIndex(WebDriver driver,By xpathOfElement,int i)
	{
		try

		{
			Select itemType = new Select(driver.findElement(xpathOfElement));
			itemType.selectByIndex(i);

		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}

	}	  
	
	/** This method will select value from dropdown.
	 * 
	 * @param driver
	 * @param xpathOfElement
	 * @param value
	 */
	public static void SelectDropdownValue(WebDriver driver,By xpathOfElement,String value)
	{
		try

		{
			Select itemType = new Select(driver.findElement(xpathOfElement));
			itemType.selectByVisibleText(value);

		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}

	}



}
