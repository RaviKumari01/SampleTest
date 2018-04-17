package in.valtech.custom;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import in.valtech.util.DS_Config;
import in.valtech.util.ExcelReader;
import in.valtech.util.Payment_Check;
import in.valtech.util.Payment_Credit;
import in.valtech.util.TCExecutor;
import in.valtech.util.User_DS;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CustomFunction {



	public static Logger log = Logger.getLogger(CustomFunction.class.getName());


	public static TCExecutor tcExcecutorDetails;
	public static DS_Config dSDetails;
	public static Payment_Check  payment_CheckDetails;
	public static Payment_Credit payment_CreditDetails;
	public static User_DS  user_Details;



	/** 1st method
	 * Method Name: isElementPresent Description:Method to verify the Element is present or not
	 * 
	 * @param by
	 *            :by is the Element locator
	 * @param driver
	 *            :WebDriver
	 * @return true: if element is present, return false: if element is not present
	 */

	public static boolean isElementPresent(By by, WebDriver driver) 
	{
		try 
		{
			System.out.println("element is present inside isElementPresent()");
			driver.findElement(by);
			return true;
		} 
		catch (NoSuchElementException e) 
		{
			System.out.println("catch of isElementPresent()");
			System.out.println("element is not present");
			return false;
		}
	}


	/** 2nd method 
	 * Method Name: getRootDir Description: Method to get Root directory
	 * 
	 * @return :rootDir
	 */
	public static String getRootDir() 
	{
		File path = new File("");
		String absPath = path.getAbsolutePath();
		File dir = new File(absPath);
		String rootDir = dir.getParent();
		System.out.println("Project Location is(CustomFunction)-rootDir = "+rootDir);
		System.out.println("Project Location is(CustomFunction)-absPath = "+absPath);
		return rootDir;


	}

	/**3rd method
	 * Method Name: refreshPage Description: Method to used refresh a page after
	 * doing some action (if required page refresh)
	 * 
	 * @param driver
	 *            :WebDriver
	 * @return driver
	 */
	public static WebDriver refreshPage(WebDriver driver)
	{

		driver.navigate().refresh();
		return (driver);


	}

	/**4th method
	 * Method Name: switchToNewWindow Description: This function switches the
	 * browser control to new window and verifies title
	 * 
	 * @param driver
	 *            : WebDriver
	 * @param pageTitle
	 *            : title of the page
	 * @return newWindow(driver)
	 */



	public static WebDriver switchToNewWindow(WebDriver driver, String pageTitle)
	{

		WebDriver newWindow = null;
		Set<String> windowIterator = driver.getWindowHandles();
		System.err.println("No of windows :  " + windowIterator.size());
		for (String s : windowIterator)
		{
			String windowHandle = s;
			newWindow = driver.switchTo().window(windowHandle);
			System.out.println("Window Title : " + newWindow.getTitle());
			System.out.println("Window Url : " + newWindow.getCurrentUrl());
			if (newWindow.getTitle().equals(pageTitle))
			{
				System.out.println("Selected Window Title : "+ newWindow.getTitle());
				return newWindow;
			}

		}
		System.out.println("Window Title :" + newWindow.getTitle());
		System.out.println();
		return newWindow;
	}

	/**5th method
	 * MethodName:generateTimeStamp Description: This method generates timestamp
	 * 
	 * @return newDate
	 */
	public static String generateTimeStamp()
	{

		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat stringDate = new SimpleDateFormat("ddMMyyhhmmss");

		String newDate = stringDate.format(date);

		return newDate;
	}

	/**6th method
	 * MethodName:verifyDropdownValues
	 * 
	 * Description: This method verifies the dropdown options
	 * 
	 * @param Webelement
	 *            ele
	 * @param dropDownValuesArray
	 * @throws Exception
	 */
	public static boolean verifyDropdownValues(WebElement ele,String[] dropDownValuesArray) throws Exception 
	{

		boolean match = false;

		try
		{
			Select dropDown = new Select(ele);

			List<WebElement> options = dropDown.getOptions();

			if (options.size() == dropDownValuesArray.length)
			{

				for (WebElement we : options) 
				{

					for (int i = 0; i < dropDownValuesArray.length; i++)
					{

						String act = we.getText().replace("\n", "").trim();

						if (act.equalsIgnoreCase(dropDownValuesArray[i])) 
						{

							match = true;
							Reporter.log("Dropdown options: " + we.getText());
							log.info("Dropdown options: " + we.getText());
							System.out.println("Dropdown options: "
									+ we.getText());
						}
					}

				}
			} 
			else 
			{
				log.error("Dropdown values size is not matching");
				Reporter.log("<p>Dropdown values size is not matching");
			}
		} 
		catch (NoSuchElementException e)
		{
			log.error("Element to type data is not present " + e);
			Reporter.log("<p>Element to type data is not present");

		}
		return match;

	}

	/**7 th method
	 * MethodName:verifySelectedDropdownValue
	 * 
	 * Description: This method verifies the Selected dropdown value
	 * 
	 * @param Webelement
	 *            ele
	 * @param shippingmethodarray
	 * @throws Exception
	 */
	public static boolean verifySelectedDropdownValue(WebElement dropDown,String dropDownValue) throws Exception
	{

		boolean match = false;

		// Dropdown element initialization
		Select dropDownEle = new Select(dropDown);

		// Get Selected dropdown value
		String defaultoption = dropDownEle.getFirstSelectedOption().getText();

		defaultoption = defaultoption.replace("\n", "").trim();

		log.info("Default DropDown option: " + defaultoption);
		log.info("DropDown Value: " + dropDownValue);

		// Verify selected value
		if (defaultoption.equalsIgnoreCase(dropDownValue)) {
			match = true;
		}

		return match;
	}
	/**8th method
	 * MethodName:getTestDataSetDetails
	 * 
	 * Description: This method retrieves Data Config details
	 * 
	 * @param dataSetConfig
	 * @throws Exception
	 */

	public static void getTestDataSetDetails(String dataSetConfig)
			throws Exception {

		// Get Root directory
		String rootDir = CustomFunction.getRootDir();
		Boolean flag = false;

		/*tcExcecutorDetails=new TCExecutor();
	dSDetails=new  DS_Config();
	payment_CheckDetails=new Payment_Check();
	payment_CreditDetails=new Payment_Credit();*/
		user_Details=new User_DS();


		String[] DSDetails = new String[10];

		// Split dataSetConfig by ","
		String[] dataSet_array = dataSetConfig.split(",");

		for (int i = 0; i < dataSet_array.length; i++) {

			// Add SKU dataset to array
			if (dataSet_array[i].contains("DS_CONFIG")) {
				// Split dataset by "-" (sheet name and version)
				String[] str_array = dataSet_array[i].split("-");
				// Get UserInfo Data set values
				dSDetails = ExcelReader.getDS_ConfigDetails(
						rootDir + "/resources/testData/Automation_DS.xls",
						str_array[0], str_array[1]);


			}

			else {

				// Split dataset by "-" (sheet name and version)
				String[] str_array = dataSet_array[i].split("-");

				if (str_array[0].equalsIgnoreCase("PAYMENT_CHECK")) {

					// Get Payment Data set values
					payment_CheckDetails = ExcelReader
							.getPaymentCheckDetails(rootDir
									+ "/resources/testData/Automation_DS.xls",
									str_array[0], str_array[1]);

				}
				if (str_array[0].equalsIgnoreCase("PAYMENT_CREDIT")) {

					// Get UserInfo Data set values
					payment_CreditDetails = ExcelReader
							.getPaymentCreditDetails(rootDir
									+ "/resources/testData/Automation_DS.xls",
									str_array[0], str_array[1]);

				}
				if (str_array[0].equalsIgnoreCase("USER_DS")) {

					System.out.println("Str1"+str_array[0]);
					System.out.println("Str2"+str_array[1]);
					// Get payPalPaymentDSDetails values
					user_Details = ExcelReader
							.getUserDetails(rootDir
									+ "/resources/testData/Automation_DS.xls",
									str_array[0], str_array[1]);

				}


			}
		}
	}


	/**9th method
	 * This element verifies element is displayed or not
	 * 
	 * @param ele
	 * @param driver
	 * @return
	 * @throws Exception
	 */
	public static boolean isElementVisible(By ele, WebDriver driver)
			throws Exception 

			{
		try 
		{
			driver.findElement(ele).isDisplayed();
			System.out.println("Element is Displayed");
			return true;
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Element is not Displayed");
			return false;

		}
			}

	/**10 th method
	 * This element verifies element is selected or not
	 * 
	 * @param ele
	 * @param driver
	 * @return
	 * @throws Exception
	 */


	public static boolean isElementSelected(By ele, WebDriver driver)
			throws Exception 

			{
		try 
		{
			driver.findElement(ele).isSelected();
			System.out.println("Element is Selected");
			return true;
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Element is not Selected");
			return false;

		}
			}





	/**11 th method
	 * This element Gets  the text
	 * 
	 * @param ele
	 * @param driver
	 * @throws Exception
	 * 
	 */	


	public void getElementText(WebDriver driver,By ele) throws Exception
	{ 

		try 
		{
			WebElement element = driver.findElement(ele);
			String textValue = element.getText();
			System.out.println("textValue="+textValue);
			log.info("got text value ");
			Reporter.log("<p>got text value");
		} catch (NoSuchElementException e) {
			log.error("text value is missing");
			Reporter.log("<p>text value is missing"); 


		}
	}

	/**12 th method
	 * 
	 * @param driverName
	 * @param driver
	 * @param rootDir
	 * @throws Exception
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws MalformedURLException
	 */
	public static WebDriver initializeDriver(String driverName,WebDriver driver, String rootDir)
			throws Exception, IOException, InterruptedException,MalformedURLException 
			{
		switch (driverName) 
		{
		case "FF":
			// Initiating the Firefox driver
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			// Set the BP at browser screen level desktop

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			break;

		case "CHROME":
			// Chrome driver set up
			System.setProperty("webdriver.chrome.driver", rootDir+ "/resources/drivers/chromedriver.exe");
			// Initiating the Chrome Driver.
			driver = new ChromeDriver();
			// Maximizing the webdriver browser window.
			// Set the BP at browser screen level desktop
			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			break;

		case "IE":
			// IE driver set up
			System.setProperty("webdriver.ie.driver", rootDir+ "/resources/drivers/IEDriverServer.exe");
			// setting browser capabilities
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			// Initiating the IE Driver.
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().deleteAllCookies();
			break;

		case "SAFARI":

			// Delete browser cookies and cache

			String[] command = new String[] 
					{
					rootDir+ "/resources/front/SafariClearCookies.sh" 
					};
			// Runtime.getRuntime().exec("chmod -R 755 *");
			Runtime.getRuntime().exec(command);
			// Initiating the Safari driver
			driver = new SafariDriver();
			driver.manage().deleteAllCookies();
			log.info("SafariDriver Started");
			break;



		default:
			// By default initiating the Firefox driver.
			driver = new FirefoxDriver();
			// Maximizing the webdriver browser window.
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		return driver;
			}




	public  void waitForElement(WebDriver driver,By by)
	{
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		System.out.println("waited for the element");
	}






}
