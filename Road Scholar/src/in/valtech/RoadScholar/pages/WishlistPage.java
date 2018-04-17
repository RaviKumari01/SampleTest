package in.valtech.RoadScholar.pages;

import static in.valtech.util.PropertyFileReader.ObjRepoProperty;
import in.valtech.custom.CustomFunction;
import in.valtech.uiFunctions.GUIFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {

	private final WebDriver driver;
	
	public Logger log = Logger.getLogger(this.getClass().getName());

	public  WishlistPage(WebDriver driver)
	{
		this.driver = driver;
		
		log.info("USER is in WishList Page");
		System.out.println("ObjRepoProperty.getProperty=="+ObjRepoProperty.getProperty("WLP_Title_XPATH"));
		if (!(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("WLP_Title_XPATH")),
				driver))){
			throw new IllegalStateException("This is not the WishList page");
		}
	}

	// ===============================Locators===================================
	By WishList_Count= By.xpath(ObjRepoProperty.getProperty("WishList_Count_XPATH"));
	By WLP_ListView= By.xpath(ObjRepoProperty.getProperty("WLP_ListView_XPATH"));  
	By WLP_EditButton=By.xpath(ObjRepoProperty.getProperty("WLP_EditButton_XPATH"));
	By WLP_RemoveFromWishList=By.xpath(ObjRepoProperty.getProperty("WLP_RemoveFromWishList_XPATH")); 
	By WLP_Done=By.xpath(ObjRepoProperty.getProperty("WLP_Done_XPATH"));
	By WLP_Info=By.xpath(ObjRepoProperty.getProperty("WLP_Info_XPATH"));
	By WLP_ViewDetails=By.xpath(ObjRepoProperty.getProperty("WLP_ViewDetails_XPATH"));

	
	/**MethodName:VerifyPage
	 * Description:This function is to Click on ViewDetails Button
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage VerifyPage() throws InterruptedException {
	if(CustomFunction.isElementPresent(
				By.xpath(ObjRepoProperty.getProperty("WLP_Title_XPATH")),driver))
				{
		System.out.println("Sucessfully verified wishlist page");
				}
		return new WishlistPage(driver);
	}
	
	/**MethodName:WishListCount
	 * Description:This function is to find WishList Count
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage WishlistCount() throws InterruptedException
	{
		try{
		String Count=driver.findElement(WishList_Count).getText();
		System.out.println("Actual Count is "+Count);
		log.info("Actual Count is "+Count);
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
		}
		catch(Exception e)
		{
			System.out.println("WhishList count is Zero");
			return new WishlistPage(driver);
		}
	}

	/**MethodName:ClickOnListView
	 * Description:This function is to Click On ListView
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage ClickOnListView() throws InterruptedException {
		GUIFunctions.clickElement(driver,WLP_ListView,"ListView");
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
	}

	/**MethodName:ClickOnEdit
	 * Description:This function is to Click On Edit
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage ClickOnEdit() throws InterruptedException {
		GUIFunctions.clickElement(driver,WLP_EditButton,"EditButton");
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
	}

	/**MethodName:RemoveFromWishList
	 * Description:This function is to RemoveFromWishList
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage RemoveFromWishList() throws InterruptedException {
		GUIFunctions.clickElement(driver,WLP_RemoveFromWishList,"Remove From Wishlist");
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
	}

	/**MethodName:ClickOnDone
	 * Description:This function is to Click On Done
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage ClickOnDone() throws InterruptedException {
		GUIFunctions.clickElement(driver,WLP_Done,"Done");
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
	}

	/**MethodName:FindCountAfterDeleting
	 * Description:This function is to Find the Count After Deleting
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage FindCountAfterDeleting() throws InterruptedException
	{
		try
		{
		String Count=(driver.findElement(WishList_Count).getText());
		System.out.println("count after Deleting is  "+Count);
		log.info("count after Deleting is  "+Count);
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
	}
		catch(Exception e)
		{
			System.out.println("Count after deletion is Zero");
			log.info("Count after deletion is Zero");
			return new WishlistPage(driver);
		}
			
		}

	/**MethodName:ClickOnInfo
	 * Description:This function is to click on info
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage ClickOnInfo() throws InterruptedException {
		GUIFunctions.clickElement(driver,WLP_Info,"Info");
		GUIFunctions.normalWait();
		return new WishlistPage(driver);
	}

	/**MethodName:ClickViewDetails
	 * Description:This function is to Click on ViewDetails Button
	 * @return WishlistPage
	 * @throws InterruptedException 
	 * Author:Sravani
	 */
	public WishlistPage ClickViewDetails() throws InterruptedException {
		GUIFunctions.clickElement(driver,WLP_ViewDetails,"ViewDetails");
		GUIFunctions.normalWait();
		System.out.println("user is in "+driver.getTitle()+"page");
		log.info("user is in "+driver.getTitle()+"page");
		GUIFunctions.navigateBack(driver);
		return new WishlistPage(driver);
	}
	

}


