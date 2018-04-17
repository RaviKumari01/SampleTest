package in.valtech.config;

import in.valtech.custom.CustomFunction;
import in.valtech.util.PropertyFileReader;

import java.util.logging.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseTest {

	public static WebDriver driver;
	public static Logger log;
	public String rootDir=CustomFunction.getRootDir();
	public static String homePageUrl;
	public static ITestResult result;
	public static String driver_Name;
	public static Process process;
	public static String dataSet_Config;
	public static String UserName;
	public static String Password;
	public static String Actual;
	public static String expected;
	public static String expected_Date;
	public static String Actual_Date;
	public static String expected_ProgramName;
	public static String Actual_ProgramName;
	
	@BeforeSuite
	public void suiteSetUp() throws Exception {
		// For logging
		log = Logger.getLogger(this.getClass().getName());
	}

	@Parameters({ "TC_NAME","DS_CONFIG","DRIVER","HOMEPAGE_URL","USERNAME","PASSWORD"})
	@BeforeTest
	public void setUp(
			String testCaseName, String dataSetConfig, String nativeDriver, 
			String homeUrl,String userName,String password)
			throws Exception {

		System.out.println("Enter into base test");
		
		// Assigning default value to ITestResult variable
		result = null;

		log.info("*****************************");
		log.info("Test case name->" + testCaseName);
		System.out.println("Test Case name= "+testCaseName);

		// Assigning driver value
		driver_Name = nativeDriver;                                  
		log.info("Driver->" + nativeDriver);
		System.out.println("nativeDriverFromBase"+nativeDriver);

		// Assigning data set config value
		dataSet_Config=dataSetConfig;
		log.info("Test dataSet_Config->" + dataSet_Config);
		System.out.println("dataSet_Config=======>>>>"+dataSet_Config);

		// Get Test Data set Details
		CustomFunction.getTestDataSetDetails(dataSet_Config);

		// Assigning baseUrl value
		homePageUrl = homeUrl;
		log.info("BaseURL->" + homePageUrl);
		System.out.println("baseUrl From Base= "+homePageUrl);

		
		// Assigning  username
		UserName=userName;
		System.out.println("UserName= "+UserName);
		log.info(" UserName->" + UserName);

		// Assigning password
		Password=password;
		log.info("Password->" + Password);
		System.out.println("Password= "+Password);


		// ************* Load Property File********************
		PropertyFileReader.loadProprtyFile();

		/*
		 * Select the relative drive as configured at BasicConfig.csv file using
		 * switch-case.
		 */
		driver = CustomFunction.initializeDriver(nativeDriver, driver, rootDir);

		if (driver_Name.equalsIgnoreCase("FF") || driver_Name.equalsIgnoreCase("CHROME"))   
		{
			// Setting window size according to RS application on FF or chrome
			driver.manage().window().setSize(new Dimension(1259, 906));
			driver.manage().window().maximize();

			log.info("Window size ---" + driver.manage().window().getSize());
		}

		else if(driver_Name.equalsIgnoreCase("IE8"))
		{
			// Setting window size according to chanel application on FF
			driver.manage().window().setSize(new Dimension(1259, 906));
			driver.manage().window().maximize();
		}

					}


	@BeforeMethod
	public void methodLevelSetup() throws Exception {

		/*
		 * Checks for exceptions like IllegalStateException or SkipException or
		 * SessionNotFoundException or UnreachableBrowserException, If found
		 * skips the test method
		 */
		if (result != null) 
		{
			if ((result.getThrowable().toString()
					.contains("IllegalStateException")
					|| result.getThrowable().toString()
					.contains("SkipException")
					|| result.getThrowable().toString()
					.contains("SessionNotFoundException") || result
					.getThrowable().toString()
					.contains("UnreachableBrowserException"))) {

				throw new SkipException("Skip Methods");
			}
		}

	}

	@AfterMethod
	public void methodLevelTearDown() throws Exception {

		/*
		 * Checks for exceptions like IllegalStateException or SkipException or
		 * SessionNotFoundException or UnreachableBrowserException, If found
		 * skips the test method
		 */
		if (result != null) {
			if ((result.getThrowable().toString()
					.contains("IllegalStateException")
					|| result.getThrowable().toString()
					.contains("SkipException")
					|| result.getThrowable().toString()
					.contains("SessionNotFoundException") || result
					.getThrowable().toString()
					.contains("UnreachableBrowserException"))) {

				throw new SkipException("Skip Methods");
			}
		}

	}

	@AfterClass
	public void classLevelTearDown() throws Exception {
		/*
		 * Checks for exceptions like IllegalStateException or SkipException or
		 * UnreachableBrowserException, If found skips the test cases
		 */
		if (result != null) 
		{
			if ((result.getThrowable().toString()
					.contains("IllegalStateException")
					|| result.getThrowable().toString()
					.contains("SkipException") || result.getThrowable()
					.toString().contains("UnreachableBrowserException"))) {

				throw new SkipException("Skip Testcases");
			}
		}
	}
}

