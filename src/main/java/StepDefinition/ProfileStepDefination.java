package StepDefinition;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
//imports
import org.openqa.selenium.WebDriver;
import AppHooks.Hooks;
import COM.KOTAKPFMS.QA.FACTORY.DriverFactory;
import COM.KOTAKPFMS.QA.PAGES.EnvironmentPage;
import COM.KOTAKPFMS.QA.PAGES.HomePage;
import COM.KOTAKPFMS.QA.PAGES.LoginPage;
import COM.KOTAKPFMS.QA.PAGES.ProfilePage;
import COM.KOTAKPFMS.QA.UTIL.ElementUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
* @Author -- Yashashree Suryawanshi
**/

public class ProfileStepDefination {
	
	private DriverFactory driverFactory;
	private WebDriver driver=DriverFactory.getDriver();
	EnvironmentPage environmentPage;
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	ElementUtil elementUtil=new ElementUtil(driver);
	Hooks hooks = new Hooks();
	ProfilePage profilePage;
	
	//----------Profile Add------------//
	
	@Given("User goes to Administration and then Profile Add menu")
	public void user_goes_to_Administration_and_then_Profile_Add_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		profilePage = homePage.ProfileAddMenu();
	}//end

	@Then("User enters valid record details using {string} and clicks on Ok button")
	public void user_enters_valid_record_details_using_and_clicks_on_Ok_button(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		profilePage.addprofile(sheetName);
	}//end
	
	//----------Profile Approve------------//

	@Given("User goes to Administration and then Profile Approve menu")
	public void user_goes_to_Administration_and_then_Profile_Approve_menu() throws InterruptedException {
		homePage.LogOut();

		homePage=hooks.launchBrowser1();
		elementUtil.SHORT_TIMEOUT();
		elementUtil.SHORT_TIMEOUT();
		profilePage=homePage.ProfileApproveMenu();
	}//end

	@Then("User goes to Profile Approve screen and approves the record using {string}")
	public void user_goes_to_Profile_Approve_screen_and_approves_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		profilePage.profileApprove(sheetName);
	}//end

	//----------Profile List------------//
	
	@Given("User goes to Administration and then Profile List menu")
	public void user_goes_to_Administration_and_then_Profile_List_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		profilePage = homePage.ProfileListMenu();
	
	}//end

	@Then("User goes to Profile List screen and views the record using {string}")
	public void user_goes_to_Profile_List_screen_and_views_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		profilePage.listProfileRecord(sheetName);
	}//end
	
	//----------Profile Modify/Repair------------//

	@Given("User goes to Administration and then User selects Profile Modify\\/Repair menu")
	public void user_goes_to_Administration_and_then_User_selects_Profile_Modify_Repair_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		profilePage = homePage.ProfileModifyMenu();
	}//end

	@Then("User provides valid profile record details for Modify\\/Repair operation using {string}")
	public void user_provides_valid_profile_record_details_for_Modify_Repair_operation_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		profilePage.modifyRepairprofile(sheetName);
	}//end
	
	//----------Profile Remove------------//

	@Given("User goes to Administration and then User selects Profile Remove menu")
	public void user_goes_to_Administration_and_then_User_selects_Profile_Remove_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		profilePage = homePage.ProfileRemoveMenu();
	}//end

	@Then("User goes to Profile Remove screen and remove the record using {string}")
	public void user_goes_to_Profile_Remove_screen_and_remove_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		profilePage.profileRemove(sheetName);
	}//end



}
