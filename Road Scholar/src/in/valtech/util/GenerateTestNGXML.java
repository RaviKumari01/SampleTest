package in.valtech.util;

import in.valtech.custom.CustomFunction;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class GenerateTestNGXML 
{

	public static String rootDir = CustomFunction.getRootDir();
	
	static XmlTest test = null;
	static XmlSuite suite = null;

	/**
	 * Method:generateTestNGXMLfile Description: This method generates testNg.xml by
	 * reading the data mentioned in "Automation_DS"Excel
	 * 
	 * @throws Exception
	 */
	public static void generateXMLfile() throws Exception 
	{
		System.out.println("rootDir======================="+rootDir);
		List<String> featureNameList = ExcelReader.getGlobalFeatureSheets("resources/testData/Automation_DS.xls");

		for (int i = 0; i < featureNameList.size(); i++) 
		{

			generateModuleXMLFile(featureNameList.get(i).toLowerCase());

		}

	}

	/**
	 * Method:generateModuleTestNGXMLFile Description: This method generates
	 * testNg.xml by reading the data mentioned in "Automation_DS"Excel module
	 * wise
	 * 
	 * @throws Exception
	 */
	public static void generateModuleXMLFile(String module) throws Exception {
		try {
			
			FileWriter writer=null;
			// Fetching TC details from Excel
			List<TCExecutor> tcExecutorDetailsList = ExcelReader
					.getTCExecutorDetails(
							"resources/testData/Automation_DS.xls",
							module.toUpperCase());
			System.out.println("List Size : "+ tcExecutorDetailsList.size());
			System.out.println("Feature name: "+ module);
			
			if (tcExecutorDetailsList.size() != 0) 
			{
				// Create an instance of XmlSuite and assign a name for it.
				suite = new XmlSuite();

				suite.setName("RS Automation Automation :"+ module.toUpperCase());
			
				suite.setGroupByInstances(true);

				// For adding listners to suite
				List<String> listnerClasses = new ArrayList<String>();


				//suite.setListeners(listnerClasses);

				for (int i = 0; i < tcExecutorDetailsList.size(); i++) 
				{

//				
						// Create a instance of XmlTest and assign a name for
						// it.
						test = new XmlTest(suite);

						test.setName(tcExecutorDetailsList.get(i)
								.getModule()
								+ "_"
								+ tcExecutorDetailsList.get(i)
								.getTc_Description()
								+ "_"
								+ tcExecutorDetailsList.get(i)
								.getTc_Name());

						// This Map can hold your testng Parameters.
						Map<String, String> testngParams = new HashMap<String, String>();

						// Assigning the TC_DESCRIPTIONS.
						testngParams.put("TC_DESCRIPTIONS",
								tcExecutorDetailsList.get(i)
										.getTc_Description());

						// Assigning the TC_NAME.
						testngParams.put("TC_NAME", tcExecutorDetailsList
								.get(i).getTc_Name());
						
						// Assigning the REUSABLE_TC ID.
						testngParams.put("REUSABLE_TC ID", tcExecutorDetailsList
								.get(i).getReusable_TCID());
						
						// Assigning the DS_CONFIG.
						testngParams.put("DS_CONFIG", tcExecutorDetailsList
								.get(i).getDs_Config());

						// Assigning the DRIVER.
						testngParams.put("DRIVER", tcExecutorDetailsList
								.get(i).getDriver());

						// Assigning the Home Page URL.
						testngParams.put("HOMEPAGE_URL", tcExecutorDetailsList
								.get(i).getHomepage_url());

						
						// Assigning the HMC_USERNAME
						testngParams.put("USERNAME",
								tcExecutorDetailsList.get(i)
										.getUserName());
						
						// Assigning the HMC_PASSWORD
						testngParams.put("PASSWORD",
								tcExecutorDetailsList.get(i)
										.getPassword());
					

						// Add any parameters that you want to set to the Test.
						test.setParameters(testngParams);

						// test.setPreserveOrder("true");
						XmlClass testClass = null;
						// Create an array list of XmlClass
						ArrayList<XmlClass> classes = new ArrayList<XmlClass>();

						testClass = new XmlClass();

					// ==================== Dependent Classes ============
					String depClasses = ExcelReader.getColumnValueDep(
							"resources/testData/Automation_DS.xls",
							"TCEXECUTER",
							tcExecutorDetailsList.get(i)
							.getTc_Description(), "TC_DESCRIPTIONS",
							"REUSABLE_TC ID");
					System.out.println("Dependency = "+depClasses);
					if (!depClasses.equalsIgnoreCase("NA"))
					{
						String[] array = depClasses.split(",");
						for (int j = 0; j < array.length; j++) {
							testClass = new XmlClass();
							System.out.println("Array[j] = "+array[j]);
							testClass
							.setName("in.valtech.RoadScholar.test."
									+ ExcelReader
									.getColumnValueDep(
											"resources/testData/Automation_DS.xls",
											module.toUpperCase(),
											array[j],
											"TC_DESCRIPTIONS",
											"TC_NAME").toUpperCase());
							/*+ "."
												+ ExcelReader
														.getColumnValueDep(
																"resources/testData/Automation_DS.xls",
																"TCEXECUTER"+ module.toUpperCase(),
																array[j],
																"TC_DESCRIPTIONS",
																"TC_NAME"));*/
							classes.add(testClass);
							testClass = new XmlClass();
							System.out.println("*********************************RANOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO " +"in.valtech.RoadScholar.test."
									+ ExcelReader
									.getColumnValueDep(
											"resources/testData/Automation_DS.xls",
											module.toUpperCase(),
											array[j],
											"TC_DESCRIPTIONS",
											"TC_NAME").toUpperCase());
						}
					}


						// =====================================

						testClass.setName("in.valtech.RoadScholar.test"
								+ "."
								+ tcExecutorDetailsList.get(i)
										.getTc_Name());

						classes.add(testClass);
						test.setXmlClasses(classes);

						// Creating TestNG.xml file

						File file = new File(System.getProperty("user.dir")
								+ "/testSuites/TestSuite_" + module
								+ ".xml");

						 writer = new FileWriter(file);
						writer.write(suite.toXml());
						                  
					//}
				}
				writer.close();
				tcExecutorDetailsList.clear();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// For testing purpose
	public static void main(String args[]) throws Exception {
	
		generateXMLfile();
	}
}