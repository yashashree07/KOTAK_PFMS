package StepDefinition;

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

public class GroupStepDefination {
	
	private DriverFactory driverFactory;
	private WebDriver driver=DriverFactory.getDriver();
	EnvironmentPage environmentPage;
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	ElementUtil elementUtil=new ElementUtil(driver);
	Hooks hooks = new Hooks();
	GroupPage groupPage;

	
	@Given("User goes to Administration and then Group Add menu")
	public void user_goes_to_Administration_and_then_Group_Add_menu() {
	   
	}//end

	@Then("User enters valid group details using {string} and clicks on Ok button")
	public void user_enters_valid_group_details_using_and_clicks_on_Ok_button(String string) {
	   
	}

	@Given("User goes to Administration and then Group Approve menu")
	public void user_goes_to_Administration_and_then_Group_Approve_menu() {
	  
	}

	@Then("User goes to Group Approve screen and approves the record using {string}")
	public void user_goes_to_Group_Approve_screen_and_approves_the_record_using(String string) {
	   
	}

	@Given("User goes to Administration and then Group List menu")
	public void user_goes_to_Administration_and_then_Group_List_menu() {

	}

	@Then("User goes to Group List screen and views the record using {string}")
	public void user_goes_to_Group_List_screen_and_views_the_record_using(String string) {
	
	}

	@Given("Group goes to Administration and then User selects Modify\\/Repair menu")
	public void group_goes_to_Administration_and_then_User_selects_Modify_Repair_menu() {
	   
	}

	@Then("Group provides valid record details for Modify\\/Repair operation using {string}")
	public void group_provides_valid_record_details_for_Modify_Repair_operation_using(String string) {
	  
	}

	@Given("User goes to Administration and then User selects Group Remove menu")
	public void user_goes_to_Administration_and_then_User_selects_Group_Remove_menu() {
	   
	}

	@Then("User goes to Remove screen and removes the record using {string}")
	public void user_goes_to_Remove_screen_and_removes_the_record_using(String string) {
	  
	}

	@Given("User goes to Administration and then User selcts Group Block menu")
	public void user_goes_to_Administration_and_then_User_selcts_Group_Block_menu() {
	  
	}

	@Then("User goes to Block screen and Block the record using {string}")
	public void user_goes_to_Block_screen_and_Block_the_record_using(String string) {
	
	}

}
