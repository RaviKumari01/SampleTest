/*Author:Sravani
Objective:Mouse hover on my account->Click on wishlist link->Verify the page->Verify the wishlist count
->Click on list view ->Click on edit button->
remove the card->Click on done button->Find the count  
 */
package in.valtech.RoadScholar.test;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.WishlistPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WLP_TC_22 extends BaseTest
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
	
	
	//Verify wishlistpage
	@Test(priority=2,description="Step 2:Verify wishlistpage")
	public void step02_VerifyWishlistPage() throws InterruptedException
	{
		System.out.println("step 2 begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.VerifyPage();
		log.info("Successfully Verified wishlistpage \n");
		Reporter.log("<p>Successfully Verified wishlistpage");
		System.out.println("step 2 end");
	}
	
	//Finding WishList Count before Deletion
	@Test(priority=3,description="step 3:Finding WishList Count before Deletion")
	public void step03_FindingWishListCountBeforeDeletion() throws InterruptedException
	{
		System.out.println("step 3 begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.WishlistCount();
		log.info("Successfully Found WishList Count before Deletion \n");
		Reporter.log("<p>Successfully Found WishList Count before Deletion");
		System.out.println("step 3 end");
	}

	//Clicking on List view icon
	@Test(priority=4,description="step 4:Clicking on List view icon")
	public void step04_clickOnListViewIcon() throws InterruptedException
	{
		System.out.println("step 4 begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.ClickOnListView();
		log.info("Successfully clicked on list view Icon \n");
		Reporter.log("<p>Successfully clicked on list view Icon");
		System.out.println("step 4 end");
	}

	//Click on Edit Button
	@Test(priority=5,description="step 5:Click on Edit Button")
	public void step5_ClickOnEditButton() throws InterruptedException
	{
		System.out.println("step 5 Begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.ClickOnEdit();
		log.info("Successfully clicked on edit Button \n");
		Reporter.log("<p>Successfully clicked on edit Button");
		System.out.println("step 5 end");
	}

	//Click on remove from wishlist button
	@Test(priority=6,description="step 6:Click on remove from wishlist button")
	public void step6_clickOnRemovefromWishList() throws InterruptedException
	{
		System.out.println("step 6 Begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.RemoveFromWishList();
		log.info("Successfully Clicked on remove from wishlist button \n");
		Reporter.log("<p>Successfully Clicked on remove from wishlist button");
		System.out.println("step 6 end");
	}

	//Click on Done button
	@Test(priority=7,description="step 7:Click on Done button")
	public void step6_ClickOnDoneButton() throws InterruptedException
	{
		System.out.println("step 7 Begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.ClickOnDone();
		log.info("Successfully clicked on done Button \n");
		Reporter.log("<p>Successfully clicked on done Button");
		System.out.println("step 7 end");
	}

	// Wish list count after deletion
	@Test(priority=8,description="step 8:wishlist count After Deletion")
	public void step7_wishListCountAfterDeletion() throws InterruptedException
	{
		System.out.println("step 8 Begin");
		GUIFunctions.normalWait();
		WishlistPage wlp=new WishlistPage(driver);
		wlp.FindCountAfterDeleting();
		log.info("Successfully found the wishlist count After Deletion \n");
		Reporter.log("<p>Successfully found the wishlist count After Deletion");
		System.out.println("step 8 end");

	}


}
