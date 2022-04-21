package StepDefinition;

//imports
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import AppHooks.Hooks;
import COM.KOTAKPFMS.QA.FACTORY.DriverFactory;
import COM.KOTAKPFMS.QA.PAGES.EnvironmentPage;
import COM.KOTAKPFMS.QA.PAGES.GroupPage;
import COM.KOTAKPFMS.QA.PAGES.HomePage;
import COM.KOTAKPFMS.QA.PAGES.LoginPage;
import COM.KOTAKPFMS.QA.UTIL.ElementUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
* @Author -- Yashashree Suryawanshi
**/


public class GroupStepDefination {

	private DriverFactory driverFactory;
	private WebDriver driver=DriverFactory.getDriver();
	EnvironmentPage environmentPage;
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	ElementUtil elementUtil=new ElementUtil(driver);
	Hooks hooks = new Hooks();
	GroupPage groupPage;

	//------------Group Add Scenario-----------------

	@Given("User goes to Administration and then Group Add menu")
	public void user_goes_to_Administration_and_then_Group_Add_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		groupPage = homePage.AddGroupMenu();
	}//end

	@Then("User enters valid group details using {string} and clicks on Ok button")
	public void user_enters_valid_group_details_using_and_clicks_on_Ok_button(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.addGroupRecord(sheetName);
	}//end
	
	//------------Group Approve Scenario-----------------

	@Given("User goes to Administration and then Group Approve menu")
	public void user_goes_to_Administration_and_then_Group_Approve_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		homePage.LogOut();
		homePage = hooks.launchBrowser1();
		groupPage = homePage.ApproveGroupMenu();
	}//end

	@Then("User goes to Group Approve screen and approves the record using {string}")
	public void user_goes_to_Group_Approve_screen_and_approves_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.approveGroupRecord(sheetName);
	}//end

	//------------Group List Scenario-----------------
	
	@Given("User goes to Administration and then Group List menu")
	public void user_goes_to_Administration_and_then_Group_List_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		groupPage = homePage.GroupListMenu();
	}//end

	@Then("User goes to Group List screen and views the record using {string}")
	public void user_goes_to_Group_List_screen_and_views_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.listGroupRecord(sheetName);
	}
	
	//------------Group Modify/Repair Scenario-----------------

	@Given("Group goes to Administration and then User selects Modify\\/Repair menu")
	public void group_goes_to_Administration_and_then_User_selects_Modify_Repair_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		groupPage = homePage.ModifyGroupMenu();
	}//end 

	@Then("Group provides valid record details for Modify\\/Repair operation using {string}")
	public void group_provides_valid_record_details_for_Modify_Repair_operation_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.modifyGroupRecord(sheetName);
	}//end
	
	//------------Group Remove Scenario-----------------

	@Given("User goes to Administration and then User selects Group Remove menu")
	public void user_goes_to_Administration_and_then_User_selects_Group_Remove_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		groupPage = homePage.RemoveGroupMenu();
	}//end

	@Then("User goes to Remove screen and removes the record using {string}")
	public void user_goes_to_Remove_screen_and_removes_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.removeGroupRecord(sheetName);
	}//end
	
	//------------Group Block Scenario-----------------

	@Given("User goes to Administration and then User selects Group Block menu")
	public void user_goes_to_Administration_and_then_User_selcts_Group_Block_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		groupPage = homePage.BlockGroupMenu();
	}//end

	@Then("User goes to Block screen and Block the record using {string}")
	public void user_goes_to_Block_screen_and_Block_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.blockGroupRecord(sheetName);
	}//end

	//------------Group Unblock Scenario-----------------
	@Given("User goes to Administration and then User selects Group UnBlock menu")
	public void user_goes_to_Administration_and_then_User_selcts_Group_UnBlock_menu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		groupPage = homePage.UnblockGroupMenu();
	}//end

	@Then("User goes to UnBlock screen and Block the record using {string}")
	public void user_goes_to_UnBlock_screen_and_UnBlock_the_record_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.unblockGroupRecord(sheetName);
	}//end

	//------------Group Add Invalid Data Scenario-----------------
	@Then("User enters invalid group details using {string} and clicks on Ok button")
	public void user_enters_invalid_group_details_using_and_clicks_on_Ok_button(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.addGroupRecordInvalidData(sheetName);
	}//end
	
	//------------Group Modify/Repair Invalid Data Scenario-----------------
	@Then("Group provides invalid record details for Modify\\/Repair operation using {string}")
	public void group_provides_invalid_record_details_for_Modify_Repair_operation_using(String sheetName) throws InvalidFormatException, InterruptedException, IOException {
		groupPage.modifyGroupRecordInvalidData(sheetName);
	}//end
}
