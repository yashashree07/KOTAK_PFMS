package StepDefinition;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import AppHooks.Hooks;
import COM.KOTAKPFMS.QA.FACTORY.DriverFactory;
import COM.KOTAKPFMS.QA.PAGES.CalendarPage;
import COM.KOTAKPFMS.QA.PAGES.EnvironmentPage;
import COM.KOTAKPFMS.QA.PAGES.HomePage;
import COM.KOTAKPFMS.QA.PAGES.LoginPage;
import COM.KOTAKPFMS.QA.UTIL.ElementUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalendarStepDefination {

	private DriverFactory driverFactory;
	private WebDriver driver = DriverFactory.getDriver();
	EnvironmentPage environmentPage;
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	ElementUtil elementUtil = new ElementUtil(driver);
	Hooks hooks = new Hooks();
	CalendarPage calendarPage;

	/*--------------------------view user-------------------------------*/

	@Given("User navigates to GPS and then to Static Data and clicks on Calendar menu and clicks on sub option View")
	public void user_navigates_to_GPS_and_then_to_Static_Data_and_clicks_on_Calendar_menu_and_clicks_on_sub_option_View()
			throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		calendarPage = homePage.clickonCalendarViewLink();

	}

	@Then("User goes to Calendar screen and views the record using {string}")
	public void user_view_calendar_using(String SheetName)
			throws InterruptedException, InvalidFormatException, IOException {
		// calendarPage = calendarPage.viewCalendar(SheetName);
		calendarPage.viewCalendar(SheetName);
	}

	// --------Create Calendar----------//
	@Then("User goes to GPS and open Calendar Create menu to add Calendar")
	public void user_goes_to_GPS_and_open_Calendar_Create_menu_to_add_Calendar() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		calendarPage = homePage.clickonCalendarCreateLink();
	}

	@Then("User add Calendar with invalid data using {string}")
	public void user_add_Calendar_with_invalid_data_using(String SheetName)
			throws InterruptedException, InvalidFormatException, IOException {
		calendarPage.createCalendarwithInvalidData(SheetName);
	}

	@Then("User add Calendar with valid data using {string}")
	public void user_add_Calendar_with_valid_data_using(String SheetName)
			throws InterruptedException, InvalidFormatException, IOException {
		calendarPage.createCalendarwithvalidData(SheetName);

	}

	// --------Modify Calendar----------//
	@Then("User goes to GPS and open Calendar Modify menu")
	public void user_goes_to_GPS_and_open_Calendar_Modify_menu() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		calendarPage = homePage.clickonCalendarModifyLink();
	}

	@Then("User modify Calendar using {string} and view the record")
	public void user_modify_Calendar_using_valid(String SheetName)
			throws InterruptedException, InvalidFormatException, IOException {
		elementUtil.SHORT_TIMEOUT();
		calendarPage = calendarPage.modifyCalendar(SheetName);
	}

	@Then("User goes to GPS and open Calendar Approve menu to approve Calendar")
	public void user_goes_to_GPS_and_open_Calendar_Approve_menu_to_approve_Calendar() throws InterruptedException {
		homePage.LogOut();
		homePage=hooks.launchBrowser1();
		elementUtil.SHORT_TIMEOUT();
		//elementUtil.SHORT_TIMEOUT();
		calendarPage = homePage.clickonCalendarApproveLink();
	}

	@Then("User Approves Calendar using {string} and view the record")
	public void user_Approves_Calendar_using(String SheetName)
			throws InterruptedException, InvalidFormatException, IOException {
		calendarPage = calendarPage.approveCalendar(SheetName);
	}
}
