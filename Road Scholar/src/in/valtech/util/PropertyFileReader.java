package in.valtech.util;

import in.valtech.custom.CustomFunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	/**
	 * Properties.
	 */
	
	public static Properties ObjRepoProperty;
	public static Properties TextProperty;
	public static String rootDir = CustomFunction.getRootDir();
			

	/**
	 * Load Property File.
	 * @param hOMEPAGE_URL 
	 * 
	 **/
		
	public static void loadProprtyFile()
	{

		ObjRepoProperty = new Properties();
		TextProperty = new Properties();

		try {

				// Reading/loading the ObjectRepository property file.
			System.out.println("rootDir from Property File Reader (Object Repository)= " +rootDir);
			ObjRepoProperty.load(new FileInputStream(rootDir+"/resources/testData/ObjectRepository.properties"));
				
				
				// Reading/loading the Text property file
			System.out.println("rootDir from Property File Reader (Text)= " +rootDir);
		        TextProperty.load(new FileInputStream(rootDir + "/resources/testData/Text.properties"));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
