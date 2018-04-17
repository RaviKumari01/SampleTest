/*Author:Sravani
Objective:Mouse hover on my account->Click on wishlist link->Click on list view icon->Click on info icon->
Verify the card title->Click on View details button->Check the title of the page after clicking
 */
package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.WishlistPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class WLP_TC_23 extends BaseTest
{
	static  HomePage homePage ;
	//Navigating to wishlistpage
	@Test(priority=1,description="Step 1:Navigating to wishlistpage")
	public void step01_NavigateToWishlistPage() throws InterruptedException
	{
		System.out.println("step 1 begin");
		GUIFunctions.normalWait();
		HomePage hop= new HomePage(driver);
		hop.clickOnWishList();
		log.info("Successfully navigated to wishlistpage \n");
		Reporter.log("<p>Successfully navigated to wishlistpage");
		System.out.println("step 1 end");
	}
	
	
//Finding WishList Count before Deletion
	@Test(priority=2,description="step 2:Finding WishList Count before Deletion")
	public void step02findingWishListCountBeforeDeletion() throws InterruptedException
	{
		System.out.println("step 2 begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.WishlistCount();
		log.info("Successfully Found WishList Count before Deletion \n");
		Reporter.log("<p>Successfully Found WishList Count before Deletion");
		System.out.println("step 2 end");
	}

	//Clicking on List view icon
	@Test(priority=3,description="step 3:Clicking on List view icon")
	public void step03clickOnListViewIcon() throws InterruptedException
	{
		System.out.println("step 3 begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.ClickOnListView();
		log.info("Successfully clicked on list view Icon \n");
		Reporter.log("<p>Successfully clicked on list view Icon");
		System.out.println("step 3 end");
	}

	
	//Click on info icon
	@Test(priority=4,description="step 4:Click on info icon")
	public void step5_clickOnInfoIcon() throws InterruptedException
	{
		System.out.println("step 4 begin");
		GUIFunctions.normalWait();
		WishlistPage WLP=new WishlistPage(driver);
		WLP.ClickOnInfo();
		log.info("Successfully clicked  on info icon \n");
		Reporter.log("<p>Successfully clicked  on info icon");
		System.out.println("step 4 end");
	}
	
	//Clicking on ViewDetails Button 
	@Test(priority=5,description="step 5:Clicking view Details button")
	public void step5_clickOnViewDetailsButton() throws InterruptedException
	{
		System.out.println("step 5 begin");
		GUIFunctions.normalWait();
		WishlistPage WLP=new WishlistPage(driver);
		WLP.ClickViewDetails();
		log.info("Successfully clicked on view Details Button \n");
		Reporter.log("<p>Successfully clicked on view Details Button");
		System.out.println("step 5 end");
	}



}
