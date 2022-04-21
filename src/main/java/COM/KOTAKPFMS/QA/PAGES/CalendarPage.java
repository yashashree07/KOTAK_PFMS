package COM.KOTAKPFMS.QA.PAGES;

import java.io.IOException;
/**
 * @Author -- Surva jankar
 **/
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.KOTAKPFMS.QA.UTIL.ElementUtil;
import COM.KOTAKPFMS.QA.UTIL.FileReadUtils;

public class CalendarPage {
	private WebDriver driver;
	List<Map<String, String>> testData;
	FileReadUtils fileReader;
	ElementUtil elementUtil;
	Logger log = Logger.getLogger(CalendarPage.class);

	// WebElements for Calendar Page
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-log-out']")
	WebElement mainPageLogOutButton;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='OK']")
	WebElement mainPageLogoutOkBtn;
	@FindBy(name = "currency")
	WebElement currency;

	// WebElement currency;
	@FindBy(name = "paymentType")
	WebElement paymentType;

	@FindBy(name = "month")
	WebElement month;

	@FindBy(name = "year")
	WebElement year;

	@FindBy(name = "filter")
	WebElement statusfilter;

	@FindBy(name = "toYear")
	WebElement toYear;

	// @FindBy(id = "resetButton")
	// WebElement resetBtn;

	// @FindBy(xpath = "//body[@id='body']//td//td[1]//input[1]")
	// WebElement resetbtn;

	// @FindBy(xpath = "//tr[7]//td[1]//input[1]")
	// WebElement RESETBtn;

	@FindBy(xpath = " //input[@value='Reset']")
	WebElement ResetBtn;

	@FindBy(xpath = "//table[@class='TableBorder']//input[2]")
	WebElement okBtn;

	@FindBy(name = "submit")
	WebElement submitBtn;

	@FindBy(name = "confirm")
	WebElement confirmBtn;

	@FindBy(name = "Cancel")
	WebElement CANCELBtn;

	@FindBy(xpath = "//p[@class='label']")
	WebElement message;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement record;

	@FindBy(xpath = "//div[@id='pageBody']//table//tbody//tr//td//form//p//input")
	WebElement removeBtn;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement verifyCurrency;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[6]")
	WebElement verifyStatus;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement verifyYear;

	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name = "reject")
	WebElement rejectBtn;

	@FindBy(name = "repair")
	WebElement repairBtn;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement OKBtn;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement OKBTN;

	@FindBy(name = "day")
	WebElement daytype;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//*[@id=\"body\"]]")
	WebElement smessages;


	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]")
	WebElement validationMsg;

	@FindBy(xpath = "//p[@class='messages']")
	WebElement messages;

	@FindBy(name = "collapse")
	WebElement collapsemonth;

	// WebElements for Logout function_create _Invalid
	@FindBy(id = " //a[@id='logoutButtonIcon']")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	// WebElements for Logout function_create _valid
	// @FindBy(id = "//span[@class='glyphicon glyphicon-log-out']")
	// WebElement logOutBtn;

	// span[@class='glyphicon glyphicon-log-out']
	private String SheetName;

	// CalendarPage Class Constructor
	public CalendarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.elementUtil = new ElementUtil(driver);
		this.fileReader = new FileReadUtils(driver);
	}

	// to view calendar
	public void viewCalendar(String SheetName)

			throws InterruptedException, IOException {
		List<Map<String, String>> testData = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : testData) {
			// Note : 25Feb2022 : Currency variable missing also its selection is missing
			String Currency = map.get("Currency");
			String PaymentType = map.get("PaymentType");
			String Month = map.get("Month");
			String Year = map.get("Year");
			String Status = map.get("Status");
			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(month);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(year, Year);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(statusfilter, Status);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(collapsemonth);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(ResetBtn);
			elementUtil.SHORT_TIMEOUT();

			if (elementUtil.getText(year).isEmpty()) {
				log.info("Reset Button functionality is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(month);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(year, Year);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(statusfilter, Status);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(collapsemonth);
			elementUtil.SHORT_TIMEOUT();

			elementUtil.clickElement(okBtn);
			elementUtil.SHORT_TIMEOUT();

			String ExpectedYear = Year;
			String ScreenMsg = "View calendars";
			String CriteriaMsg = "No items available for Calendar view operation";

			try {
				if (elementUtil.getText(errormessages).equals(CriteriaMsg)) {
					log.info("Calendar " + Year + " is not available for View Operation");
				} else {
					log.error(elementUtil.getText(errormessages));
				}

			} catch (NoSuchElementException e) {
				if (elementUtil.getText(validationMsg).equals(ScreenMsg)) {
					String ActualCurrency = elementUtil.getText(verifyCurrency);
					String ActualStatus = elementUtil.getText(verifyStatus);
					String ActualYear = elementUtil.getText(verifyYear);
					if (ActualYear.equals(ExpectedYear)) {
						log.info("Calendar " + Year + " with " + ActualCurrency
								+ " Currency is present in Calendar list and in " + ActualStatus + " status");
					} else {
						log.error("Calendar " + Year + " with " + ActualCurrency
								+ " Currency is not present in User list");
					}
				}
			}
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkflow);
		}
		elementUtil.handlewin1(driver);
		logOutOperation();
	}

	public CalendarPage createCalendarwithInvalidData(String SheetName) throws InterruptedException, IOException {
		List<Map<String, String>> testData = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : testData) {

			String Currency = map.get("Currency");
			String PaymentType = map.get("PaymentType");
			String Month = map.get("Month");
			String Year = map.get("Year");

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);

			String expectedValidationMsg = "Invalid Year.";
			try {
				if (elementUtil.getText(errormessages).equals(expectedValidationMsg)) {
					log.info("Proper validation message is displayed for Invalid/Blank Year " + Year + " for "
							+ Currency + " currency");
				} else {
					log.error("Validation failed for Invalid Year");
				}
			} catch (NoSuchElementException e) {
				log.info("Test data provided for Calendar Create menu is not Invalid");
			}
			elementUtil.clickElement(restartWorkflow);
		}

		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
		return new CalendarPage(driver);
	}

	public CalendarPage createCalendarwithvalidData(String SheetName) throws InterruptedException, IOException {
		List<Map<String, String>> testData = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : testData) {
			String Currency = map.get("Currency");
			String PaymentType = map.get("PaymentType");
			String Month = map.get("Month");
			String Year = map.get("Year");
			String DayType = map.get("DayType");

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);

			elementUtil.clickElement(ResetBtn);
			String a = elementUtil.getText(year);
			if (a.isEmpty()) {
				log.info("Reset Button functionality is working fine");
			} else {
				log.error("Reset Button is not working fine");
			}

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);

			try {
				String expectedYearMsg = "Calendar already exists";
				if (elementUtil.getText(errormessages).equals(expectedYearMsg)) {
					log.info("Proper validation message is displayed for Already existing Year " + Year + " for "
							+ Currency + " currency");
				} else {
					log.error(elementUtil.getText(errormessages));
				}
			}

			catch (NoSuchElementException e) {
				elementUtil.clickElement(cancelBtn);
				String expectedCancelValidationMsg = "Operation Create new calendar was cancelled.";
				if (elementUtil.getText(errormessages).equals(expectedCancelValidationMsg)) {
					log.info("Cancel operation executed successully");
				} else {
					log.error("Cancel Button is not working");
				}

				elementUtil.clickElement(restartWorkflow);
				elementUtil.clickElement(currency);
				elementUtil.selectDropDownByVisibleText(currency, Currency);
				elementUtil.clickElement(paymentType);
				elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
				elementUtil.clickElement(month);
				elementUtil.selectDropDownByVisibleText(month, Month);
				elementUtil.enterText(year, Year);
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(okBtn);
				elementUtil.clickElement(daytype);
				elementUtil.selectDropDownByVisibleText(daytype, DayType);
				elementUtil.clickElement(OKBtn);

				elementUtil.clickElement(cancelBtn);
				if (elementUtil.getText(errormessages).equals(expectedCancelValidationMsg)) {
					log.info("Cancel Button from Calendar details Confirm screen is working fine");
				} else {
					log.error("Cancel button from Calendar details Confirm screen is not working");
				}

				elementUtil.clickElement(restartWorkflow);
				elementUtil.clickElement(currency);
				elementUtil.selectDropDownByVisibleText(currency, Currency);
				elementUtil.clickElement(paymentType);
				elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
				elementUtil.clickElement(month);
				elementUtil.selectDropDownByVisibleText(month, Month);
				elementUtil.enterText(year, Year);
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(okBtn);
				elementUtil.clickElement(daytype);
				elementUtil.selectDropDownByVisibleText(daytype, DayType);
				elementUtil.clickElement(OKBtn);
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(OKBTN);
				elementUtil.SHORT_TIMEOUT();

				//Note : 1March2022 : do not use the same message which was provided it was as an example
				//message for variable expectedCalendarvalidationMsg should be modified to some generic mesage
				//String expectedCalendarvalidationMsg = " \"Calendar \\\"2022-INR-Any\\\" has been created successfully and is in\r\n"
				//	+ "				 \\\"Approve\\\" status.\"";
				//Example it should be as 
				String expectedCalendarvalidationMsg = "Calendar "+Year+"-"+Currency+"-"+PaymentType+ " has been created successfully and is in Approve status.";
				String expectedValidationMsg = "Invalid Year.";

				//****//Note 1march updated  : message not getting matched 
				
				if (elementUtil.getText(messages).equals(expectedCalendarvalidationMsg)) {
					log.info("Added calendar with year " + Year + " is placed in Approve queue");
				} else if (elementUtil.getText(messages).equals(expectedValidationMsg)) {
					log.info("Proper validation message is displayed for Invalid Year " + Year + " for " + Currency
							+ " currency");
				} else {
					log.error("Validation failed for Invalid Year");
				}
			}
			elementUtil.clickElement(restartWorkflow);
		}
		elementUtil.handlewin1(driver);
		logOutOperation();

		return new CalendarPage(driver);
	}

	public CalendarPage modifyCalendar(String SheetName) throws InterruptedException, IOException {
		List<Map<String, String>> testData = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : testData) {

			String Currency = map.get("Currency");
			String PaymentType = map.get("PaymentType");
			String Month = map.get("Month");
			String Year = map.get("Year");
			String DayType = map.get("DayType");

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);
			elementUtil.clickElement(collapsemonth);
			elementUtil.clickElement(ResetBtn);
			String a = elementUtil.getText(year);
			if (a.isEmpty()) {
				log.info("Reset Button functionality is working fine");
			} else {
				log.error("Reset Button is not working");
			}
			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);
			elementUtil.clickElement(collapsemonth);
			elementUtil.clickElement(okBtn);

			String CriteriaMsg = "No items available for Calendar Modify operation";

			try {
				if (elementUtil.getText(errormessages).equals(CriteriaMsg)) {
					log.info("Calendar " + Year + " is not available for Modify Operation");
				} else {
					log.error("Validation message is not proper");
				}
			} catch (NoSuchElementException e) {
				elementUtil.clickElement(record);
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(cancelBtn);
				String ActualCancelBtnMsg = elementUtil.getText(errormessages);
				String ExpectedCancelBtnMsg = "Operation Modify/Repair calendar was cancelled.";
				if (ActualCancelBtnMsg.equals(ExpectedCancelBtnMsg)) {
					log.info("Cancel Button is working fine");
				} else {
					log.error("Cancel button is not working");
				}
				elementUtil.clickElement(currency);
				elementUtil.selectDropDownByVisibleText(currency, Currency);
				elementUtil.clickElement(paymentType);
				elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
				elementUtil.clickElement(month);
				elementUtil.selectDropDownByVisibleText(month, Month);
				elementUtil.enterText(year, Year);
				elementUtil.clickElement(collapsemonth);
				elementUtil.clickElement(okBtn);
				elementUtil.clickElement(record);
				elementUtil.clickElement(daytype);
				elementUtil.selectDropDownByVisibleText(daytype, DayType);
				elementUtil.clickElement(OKBtn);
				elementUtil.clickElement(cancelBtn);
				if (ActualCancelBtnMsg.equals(ExpectedCancelBtnMsg)) {
					log.info("Cancel Button from Confirm screen is working fine");
				} else {
					log.error("Cancel button from Confirm screen is not working");
				}
				elementUtil.clickElement(currency);
				elementUtil.selectDropDownByVisibleText(currency, Currency);
				elementUtil.clickElement(paymentType);
				elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
				elementUtil.clickElement(month);
				elementUtil.selectDropDownByVisibleText(month, Month);
				elementUtil.enterText(year, Year);
				elementUtil.clickElement(collapsemonth);
				elementUtil.clickElement(okBtn);
				elementUtil.clickElement(record);
				elementUtil.clickElement(daytype);
				elementUtil.selectDropDownByVisibleText(daytype, DayType);
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(OKBtn);
				elementUtil.clickElement(OKBTN);
				elementUtil.SHORT_TIMEOUT();
				log.info(elementUtil.getText(messages));
			}
			elementUtil.clickElement(restartWorkflow);
		}
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
		return new CalendarPage(driver);
	}

	public CalendarPage approveCalendar(String SheetName) throws InterruptedException, IOException {

		List<Map<String, String>> testData = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : testData) {

			String Currency = map.get("Currency");
			String PaymentType = map.get("PaymentType");
			String Month = map.get("Month");
			String Year = map.get("Year");
			String Operation = map.get("Operation");

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);
			elementUtil.clickElement(collapsemonth);
			elementUtil.clickElement(ResetBtn);
			String a = elementUtil.getText(year);
			if (a.isEmpty()) {
				log.info("Reset Button functionality is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			elementUtil.clickElement(currency);
			elementUtil.selectDropDownByVisibleText(currency, Currency);
			elementUtil.clickElement(paymentType);
			elementUtil.selectDropDownByVisibleText(paymentType, PaymentType);
			elementUtil.clickElement(month);
			elementUtil.selectDropDownByVisibleText(month, Month);
			elementUtil.enterText(year, Year);
			elementUtil.clickElement(collapsemonth);
			elementUtil.clickElement(okBtn);
			elementUtil.SHORT_TIMEOUT();

			try {
				String ValidationMsg = "No items available for Approve Calendar operation";
				String ValidationMsg1 = "An error occurred while processing the request. Please contact the Help Desk.Time: 2022-02-28 05:24:35.229, Error: For input string: \"#$#@\"";
				if (elementUtil.getText(errormessages).equals(ValidationMsg)) {
					log.info("Validation Passed, Operation successfully for calendar-->Approve Screen");
				}else if (elementUtil.getText(errormessages).contains(ValidationMsg1)) {
					log.info("Validation Passed, Operation successfully for calendar-->Approve Screen");
				} 
				else {
					log.info(elementUtil.getText(errormessages));
				}

			} catch (NoSuchElementException e) {
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(record);

				try {

					String ValidationMsgapprove = "Operation Approve calendar changes failed to execute: User cannot approve own modification.";
					if (elementUtil.getText(errormessages).equals(ValidationMsgapprove)) {
						log.info("Validation Passed, Operation successfully for calendar-->Approve Screen");
					} else {
						log.info(elementUtil.getText(errormessages));
					}

				} catch (NoSuchElementException e2) {
					switch (Operation) {
					case "Approve":
						elementUtil.SHORT_TIMEOUT();
						elementUtil.clickElement(approveBtn);
						//add the below into log.info()
						elementUtil.getText(messages);
						break;

					case "Reject":
						elementUtil.SHORT_TIMEOUT();
						elementUtil.clickElement(rejectBtn);
						//add the below into log.info()
						elementUtil.getText(messages);
					case "ToRepair":
						elementUtil.SHORT_TIMEOUT();
						elementUtil.clickElement(repairBtn);
						//add the below into log.info()
						elementUtil.getText(messages);
					default:
						//Note 1stmarch2022 updated: change from Mode Of Operation Code-->Approve to Calendar-->Approve
						log.info(
								"For Mode Of Operation Code-->Approve - No operation is specified in Excel sheet");
					
						break;
					}
				}

			}

			elementUtil.clickElement(restartWorkflow);
		}
		elementUtil.handlewin1(driver);
		logOutOperation();

		return new CalendarPage(driver);
	}

	// -----------------Method to perform Logout
	// Operation----------------------------
	// -----------------Method to perform Logout
	// Operation----------------------------
	public void logOutOperation() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("app");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(mainPageLogOutButton);
		elementUtil.SHORT_TIMEOUT();
		driver.switchTo().parentFrame();
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("content");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(mainPageLogoutOkBtn);
		driver.quit();
	}// end of logOutOperation function

}
