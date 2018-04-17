package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import static in.valtech.util.PropertyFileReader.TextProperty;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static in.valtech.custom.CustomFunction.tcExcecutorDetails;
import in.valtech.config.BaseTest;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditProfile
{

	private final WebDriver driver;

	public Logger log = Logger.getLogger(this.getClass().getName());

	public EditProfile(WebDriver driver)
	{
		this.driver = driver;

		log.info("EditProfile Page title" + driver.getTitle());

		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("EDP_EditProfileTitle_XPATH"));
		if (!(CustomFunction.isElementPresent(By.xpath(ObjRepoProperty.getProperty("EDP_EditProfileTitle_XPATH")),
				driver))) {
			throw new IllegalStateException("This is not the EditProfile page");
		}
	}

	// ===============================Locators===================================
	By EDP_PageTitle=By.xpath(ObjRepoProperty.getProperty("EDP_EditProfileTitle_XPATH"));
	By EDP_EditProfileDefaultImage=By.xpath(ObjRepoProperty.getProperty("EDP_EditProfileDefaultImage_XPATH"));
	By EDP_EditProfileImage=By.xpath(ObjRepoProperty.getProperty("EDP_EditProfileImage_XPATH"));	
	By EDP_SaveButton=By.xpath(ObjRepoProperty.getProperty("EDP_SaveButton_XPATH"));
	By EDP_RemoveLink=By.xpath(ObjRepoProperty.getProperty("EDP_RemoveLink_XPATH"));
	By EDP_EditProfileSuccessMessage=By.xpath(ObjRepoProperty.getProperty("EDP_EditProfileSuccessMessage"));
	By EDP_ProfileSucess=By.xpath(ObjRepoProperty.getProperty("EDP_ProfileSucess_XPATH"));
	By EDP_Private=By.xpath(ObjRepoProperty.getProperty("EDP_Private_XPATH"));
	By EDP_MyAccount=By.xpath(ObjRepoProperty.getProperty("CP_MyAccount_XPATH"));
	By EDP_Signout=By.xpath(ObjRepoProperty.getProperty("CP_Signout_XPATH"));
	By EDP_Change=By.xpath(ObjRepoProperty.getProperty("EDP_Change_XPATH"));


	/**MethodName:verifyEditProfilePageTitle
	 * @return EditProfile
	 * @throws Exception 
	 * Author:Sukrity
	 */
	public  EditProfile verifyEditProfilePageTitle() throws Exception{
		Thread.sleep(5000);
		String Actual=driver.findElement(EDP_PageTitle).getText();					
		String Expected=TextProperty.getProperty("EDP_EditProfileTitle");
		Assert.assertEquals( Actual, Expected);
		log.info("Successfully Navigated to ThankYou Page");
		return new EditProfile(driver);
	}

	/**MethodName:verifyEditProfileDefaultImage
	 * @return EditProfile
	 * @throws Exception 
	 * Author:Sukrity
	 */
	public  EditProfile verifyEditProfileDefaultImage() throws Exception
	{
		if(CustomFunction.isElementVisible(EDP_EditProfileDefaultImage,driver))
			log.info("ByDefault Profile img displayed");
		return new EditProfile(driver);
	}

	/**MethodName:verifyEditProfileImage
	 * @return EditProfile
	 * @throws Exception 
	 * Author:Sukrity
	 */
	public  EditProfile verifyEditProfileImage() throws Exception{
		if(CustomFunction.isElementVisible(EDP_EditProfileImage,driver))
			log.info("ByDefault Profile img displayed");
		return new EditProfile(driver);
	}

	/**MethodName:ClickOnSaveButton
	 * @return EditProfile
	 * @throws InterruptedException
	 * Author:Sukrity
	 */
	public EditProfile ClickOnSaveButton() throws InterruptedException{
		GUIFunctions.clickElement(driver, EDP_SaveButton , "SaveButton");
		Thread.sleep(5000);
		return new EditProfile(driver);
	}

	/**MethodName:ClickOnRemoveLink
	 * @return EditProfile
	 * @throws InterruptedException
	 * Author:Sukrity
	 */
	public EditProfile ClickOnRemoveLink() throws InterruptedException
	{
		GUIFunctions.clickElement(driver, EDP_RemoveLink , "RemoveLink");
		Thread.sleep(5000);
		return new EditProfile(driver);
	}

	/**MethodName:verifyEditProfileSuccessMessage
	 * @return EditProfile
	 * @throws Exception 
	 * Author:Sukrity
	 */
	public  EditProfile verifyEditProfileSuccessMessage() throws Exception
	{
		String Actual=driver.findElement(EDP_EditProfileSuccessMessage).getText();					
		String Expected=TextProperty.getProperty("EDP_UpdatedProfileSuccessMessage");
		Assert.assertEquals( Actual, Expected);
		log.info("Updated Profile SuccessMessage Displayed");
		return new EditProfile(driver);
	}

	/**MethodName:UploadImage
	 * @return EditProfile
	 * @throws InterruptedException
	 * Author:Sravani
	 * @throws IOException 
	 * @throws AWTException 
	 */
	/*public EditProfile UploadImage() throws InterruptedException, IOException, AWTException{
		GUIFunctions.clickElement(driver, EDP_Change , "Change Link");
		System.out.println("***********************");
		String driverName =tcExcecutorDetails.getDriver();
		System.out.println("--------------------------------");
		System.out.println("driver name is"+driverName);
		/*if(driverName=="CHROME")
		{
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		System.out.println("enteringing imto exe file");
		Runtime.getRuntime().exec("C:\\Users\\sravani.ancha\\Desktop\\Upload.exe");
		System.out.println("ending the method");
		return new EditProfile(driver);
		}
		else
		{
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			System.out.println("enteringing imto exe file");
			Runtime.getRuntime().exec("C:\\Users\\sravani.ancha\\Desktop\\FileUpload_FF.exe");
			System.out.println("ending the method");
			return new EditProfile(driver);
		}
	}*/

	/**MethodName:verifyProfileSucess
	 * @return EditProfile
	 * @throws Exception 
	 * Author:Sravani
	 */
	public  EditProfile verifyProfileSucess() throws Exception{
		Thread.sleep(5000);
		String Actual=driver.findElement(EDP_ProfileSucess).getText();	
		System.out.println("actual text is"+Actual);
		String Expected=TextProperty.getProperty("EDP_ProfileSucess");
		Assert.assertEquals( Actual, Expected);
		System.out.println(" A message of "+TextProperty.getProperty("EDP_ProfileSucess")+" has been displayed");
		return new EditProfile(driver);
	}

	/**MethodName:SelectPrivateRadioButton
	 * @return EditProfile
	 * @throws Exception 
	 * Author:Sravani
	 */
	public  EditProfile SelectPrivateRadioButton() throws Exception{
		Thread.sleep(5000);
		GUIFunctions.selectRaidoButton(driver, EDP_Private, "Private");
		return new EditProfile(driver);
	}

	/**MethodName:Signout
	 * Description:This function is to click sign out button
	 * @return HomePage
	 * @throws InterruptedException
	 * Author:Sravani
	 */
	public HomePage SignOut() throws InterruptedException{
		GUIFunctions.normalWait();
		GUIFunctions.clickElement(driver,EDP_MyAccount,"MyAccount");
		GUIFunctions.clickElement(driver,EDP_Signout,"Signout");
		GUIFunctions.normalWait();
		return new HomePage(driver);
	}
	
	public EditProfile UploadImage() throws InterruptedException, IOException, AWTException{
		GUIFunctions.clickElement(driver, EDP_Change , "Change Link");
		System.out.println("enteringing imto exe file");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//Runtime.getRuntime().exec("C:\\Users\\sravani.ancha\\Desktop\\FF.exe");
		Runtime.getRuntime().exec("C:\\Users\\rani.kumari\\Desktop\\Upload.exe");
		System.out.println("ending the method");
		return new EditProfile(driver);
		}
	
	

}

