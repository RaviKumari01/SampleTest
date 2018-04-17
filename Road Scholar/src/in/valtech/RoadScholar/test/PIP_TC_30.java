/*Author:Sravani
 * Objective:Navigate to PI page->Change the email address displayed->
 * Click on Change password button->Click on stay on page button->
 * Verify whether user is redirected back to PI page

 */

package in.valtech.RoadScholar.test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import in.valtech.RoadScholar.pages.HomePage;
import in.valtech.RoadScholar.pages.Login;
import in.valtech.RoadScholar.pages.PersonalInformationPage;
import in.valtech.config.BaseTest;
import in.valtech.uiFunctions.GUIFunctions;

public class PIP_TC_30 extends BaseTest
{


	//Click on personal Information Page
	@Test(priority=7,description="step 7:Click on Personal Information link")
	public void step07_clickOnPersonalInformationLink() throws Exception 
	{
		System.out.println("step 7 begin");
		HomePage hop=new HomePage(driver);
		hop.clickOnPIP();
		log.info("Successfully clicked on Personal Information link \n");
		Reporter.log("<p>Successfully Clicked on personal information link");
		System.out.println("step 7 end");
	}


	//change email adress in EmailAddress field
	@Test(priority=8,description="step 8:change email adress in EmailAddress field ")
	public void step08_changeEmailInEmailAddressField() throws Exception 
	{
		System.out.println("step 8 begin");
		PersonalInformationPage PIP= new PersonalInformationPage(driver);
		PIP.ChangeEmail();
		log.info("Successfully changed mail address in EmailAddress field \n");
		Reporter.log("<p>Successfully changed mail address in EmailAddress field");
		System.out.println("step 8 end");
	}

	//click on Change Password Link
	@Test(priority=9,description="step 9:click on Change Password Link ")
	public void step09_ClickOnChangePasswordLink() throws Exception
	{
		System.out.println("step 9 begin");
		GUIFunctions.normalWait();
		PersonalInformationPage PIP= new PersonalInformationPage(driver);
		PIP.ClickOnChangePwd1();
		log.info("Successfully Clicked on change password Link \n");
		Reporter.log("<p>Successfully Clicked on change password Link");
		System.out.println("step 9 end");
	}

	//click on Stay on page Button
	@Test(priority=10,description="step 10:click on Stay on page Button ")
	public void step10_ClickOnStayOnPageButton() throws Exception 
	{
		System.out.println("step 10 begin");
		PersonalInformationPage PIP= new PersonalInformationPage(driver);
		PIP.ClickOnStayOnPage();
		GUIFunctions.normalWait();
		log.info("Successfully Clicked on stay on page Button \n");
		Reporter.log("<p>Successfully Clicked on stay on page Button");
		System.out.println("step 10  end");
	}


}
