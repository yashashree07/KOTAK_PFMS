package COM.KOTAKPFMS.QA.PAGES;

import java.io.IOException;
//imports
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.KOTAKPFMS.QA.UTIL.ElementUtil;
import COM.KOTAKPFMS.QA.UTIL.FileReadUtils;

public class ProfilePage {

	/**
	 * @Author -- Yashashree Suryawanshi
	 * @version 1.0
	 * @since 26-11-2021
	 * 
	 * <h2>Class Description : Class Involving different methods related to Administration->Profile Menu</h2>
	 **/

	List<Map<String, String>> test_Data;
	ElementUtil elementUtil;
	FileReadUtils fileReader;
	HomePage homePage;
	private WebDriver driver;
	Logger log = Logger.getLogger(ProfilePage.class);

	@FindBy(xpath = "//input[@value='OK']")
	WebElement okBtn;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement confirmOK;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errorMessages;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement btnCancel;

	@FindBy(id = "checkAllBtn")
	WebElement btnChkAll;

	@FindBy(id = "unCheckAllBtn")
	WebElement btnUnChkAll;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p")
	WebElement cancelMsg;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement btnReset;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]")
	WebElement btnOkErrorMsg;

	@FindBy(xpath = "//*[@id=\"header_nav\"]/li[5]/a")
	WebElement btnRestartWorkFlow;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement resetBtn;

	@FindBy(name = "name")
	WebElement profileNameTxtField;

	@FindBy(name="profileName")
	WebElement filterScreenProfileNameTxtField;

	@FindBy(name="profileDesc")
	WebElement profileDescTxtField;

	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement validationmsg;

	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/b")
	WebElement screenmsg;//*[@id="pageBody"]/p

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement record;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement nextStatus;

	@FindBy(name = "profileName")
	WebElement nameField;

	@FindBy(name = "itemStatus")
	WebElement statusDropdown;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement btnSubmit;

	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name = "reject")
	WebElement rejectBtn;

	@FindBy(name = "repair")
	WebElement toRepairBtn;

	@FindBy(xpath = "//input[@value=\"Cancel\"]")
	WebElement btnCancel2;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement modifyRecord;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement verifyProfilename;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[3]")
	WebElement verifyProfilenameStatus;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement approveScreenRecord;

	// Approve profile menus xpath

	@FindBy(xpath = "//input[@name='reject']")
	WebElement rejectRecord;

	@FindBy(xpath = "//input[@name='repair']")
	WebElement repairRecord;

	@FindBy(xpath = "//input[@name='approve']")
	WebElement btnApprove;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement listScreenProfileNameValue;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[6]")
	WebElement listScreenProfileStatus;

	// Remove button
	@FindBy(id = "btnRemove")
	WebElement btnRemove;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement removeScreenRecord;

	@FindBy(xpath="//*[@id=\"pageBody\"]/table[1]/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]")
	WebElement removeScreenProfileNameValue;

	// Remove Message
	@FindBy(xpath = "//*[@id=\"pageBody\"]/p")
	WebElement removeMsg;

	@FindBy(name = "profileName")
	WebElement textfieldRemoveProfile;

	@FindBy(name = "profileName")
	WebElement textFieldProfileName;

	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]")
	WebElement ScreenProfileNameTxtValue;

	@FindBy(xpath = "//a[normalize-space()='Restart Workflow']")
	WebElement restartWorkFlowBtn;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-log-out']")
	WebElement mainPageLogOutButton;

	@FindBy(id = "content")
	WebElement mainFrame;

	@FindBy(xpath = "//p[@class='messages']")
	WebElement messages;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='OK']")
	WebElement mainPageLogoutOkBtn;

	// ProfilePage Class Constructor
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.homePage = new HomePage(driver);
		this.elementUtil = new ElementUtil(driver);
		this.fileReader = new FileReadUtils(driver);

	}//end

	//--------------Method to Add Profile Record------------------------//
	public void addprofile(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String ProfileName = map.get("Profile Name");
			String ProfileDescription = map.get("Profile Description");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnCancel);

			String ActualCancelBtnValidationMsg = elementUtil.getText(errorMessages);
			String ExpectedCancelBtnValidationMsg = "Operation Add new profile was cancelled.";

			if (ActualCancelBtnValidationMsg.trim().toString().equals(ExpectedCancelBtnValidationMsg.trim().toString())) {
				log.info("Cancel button is working fine");
			} else {
				log.error("Cancel button is not working");
			}

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);

			String profileAddScreenErrorMessageexpected="Profile Name is required.\r\n" + "You must select some menu checkboxes";

			if (elementUtil.getText(errorMessages).trim().toString().equals(profileAddScreenErrorMessageexpected.trim().toString())) {
				log.info("Mandatory Fields Validation Message Displayed Is Correct");
			} else {
				log.info("Mandatory Fields Validation Message Displayed Is Incorrect");
			}

			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(profileNameTxtField, ProfileName);
			elementUtil.enterText(profileDescTxtField, ProfileDescription);
			elementUtil.clickElement(btnChkAll);
			elementUtil.clickElement(btnOk);

			try {

				if(elementUtil.getText(errormessages).trim().toString().equals("Profile already exists".trim().toString()))
				{
					log.info("Duplicate Record Found Record With Profile " +ProfileName+ " Already Exists");
				}//end of if
				else
				{
					log.error("Test Data Provided For User Add Operation Is Not As Valid Format");
				}//end of else
			} catch (NoSuchElementException e) {
				elementUtil.clickElement(okBtn);
				String profileAddValidationMessage="Operation Add new profile executed successfully. " +ProfileName+ " placed in Approve queue.";
				if(elementUtil.getText(messages).trim().toString().equals(profileAddValidationMessage.trim().toString()))
				{
					log.info("Record With Profile Name " +ProfileName+ " Added Successfully");
				}
			}//end of catch

		}//end of for

		//perform logout operation
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of profileAdd function

	// --------------Method to Remove Profile Record------------------------//
	public void profileRemove(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String ProfileName = map.get("Profile Name");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(filterScreenProfileNameTxtField,ProfileName);

			//click on Reset Button
			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(filterScreenProfileNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(filterScreenProfileNameTxtField,ProfileName);

			//click on ok button
			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for Remove profile operation".trim().toString()))
				{
					log.info("Record With " +ProfileName+ " Not Found For Remove Operation" );
				}

			} catch (NoSuchElementException e) {

				elementUtil.clickElement(removeScreenRecord);
				if(elementUtil.getText(removeScreenProfileNameValue).trim().toString().equals(ProfileName.trim().toString()))
				{
					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(btnRemove);
					String removeScreenValidationMessage="Operation Remove profile executed successfully. " +ProfileName+ " placed in Approve queue.";
					if(elementUtil.getText(messages).trim().toString().equals(removeScreenValidationMessage.trim().toString()))
					{
						log.info("Record With Profile " +ProfileName+ " Removed Successfully ");
					}
				}//end of if
				else
				{
					log.error("Record Mismatch, Record With " +ProfileName+ " Not Found For Remove Operation");
				}//end of else

			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of profileRemove function

	// --------------Method to Approve Profile Record------------------------//
	public void profileApprove(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String ProfileName = map.get("Profile Name");
			String operation=map.get("Operation");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(filterScreenProfileNameTxtField,ProfileName);

			//click on Reset Button
			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(filterScreenProfileNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(filterScreenProfileNameTxtField,ProfileName);

			//click on ok button
			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for Approve profile changes operation".trim().toString()))
				{
					log.info("Record With " +ProfileName+ " Not Found For Approve Operation" );
				}

			} catch (NoSuchElementException e) {
				try {
					elementUtil.clickElement(approveScreenRecord);
					if(elementUtil.getText(errorMessages).trim().toString().equals("Operation Approve profile changes failed to execute: User cannot approve own modification.".trim().toString()))
					{
						log.info("Approval of Record " +ProfileName+ " Failed. User cannot approve own modification" );
					}
				} catch (NoSuchElementException e2) {
					if(elementUtil.getText(ScreenProfileNameTxtValue).trim().toString().equals(ProfileName.trim().toString()))
					{
						if(operation.equalsIgnoreCase("Approve"))
						{
							elementUtil.clickElement(approveBtn);
							String validationMessageApprove="Operation Approve profile changes executed successfully. ";
							if(elementUtil.getText(messages).trim().toString().contains(validationMessageApprove.trim().toString()))
							{
								log.info("Record With Profile " +ProfileName+  " Approved Successfully" );
							}//end of if
						}
						else if(operation.equalsIgnoreCase("Reject"))
						{
							//Operation Reject changes for profile executed successfully. Modification placed in Profile queue.
							//Operation Reject changes for profile executed successfully. Removal placed in Profile queue.
							//Operation Approve profile changes executed successfully. 12345 placed in DELETED queue.
							elementUtil.clickElement(rejectBtn);
							String validationMessageReject="Operation Reject changes for profile executed successfully";
							if(elementUtil.getText(messages).trim().toString().contains(validationMessageReject.trim().toString()))
							{
								log.info("Record With Values  " +ProfileName+  " Rejected Successfully" );
							}//end of if

						}
						else if(operation.equalsIgnoreCase("To Repair"))
						{
							elementUtil.clickElement(toRepairBtn);
							String validationMessageToRepair="Operation Send to repair executed successfully. Profile placed in " +ProfileName+ " queue.";
							if(elementUtil.getText(messages).trim().toString().equals(validationMessageToRepair.trim().toString()))
							{
								log.info("Record With Values  " +ProfileName+  " Sent To Repair Queue Successfully" );
							}//end of if
						}
					}//end of if
					else
					{
						log.error("Record Mismatch, Record With " +ProfileName+ " Not Found For Approve Operation");
					}//end of else
				}//end of catch
			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of profileApprove function


	//--------------Method to List Profile Record------------------------//
	public void listProfileRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String ProfileName = map.get("Profile Name");
			String status=map.get("Status");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(filterScreenProfileNameTxtField, ProfileName);
			elementUtil.selectDropDownByVisibleText(statusDropdown, status);

			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(filterScreenProfileNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(filterScreenProfileNameTxtField, ProfileName);
			elementUtil.selectDropDownByVisibleText(statusDropdown, status);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errormessages).trim().toString().equals("No items available for List profiles operation".trim().toString()))
				{
					log.info("Record With " +ProfileName+ " Not Found For List Operation" );
				}//end of if
			} catch (NoSuchElementException e) {
				elementUtil.SHORT_TIMEOUT();
				String profileRecordStatusValue=elementUtil.getText(listScreenProfileStatus);
				elementUtil.SHORT_TIMEOUT();
				String listScreenRecordProfileNameValue=elementUtil.getText(listScreenProfileNameValue);
				elementUtil.SHORT_TIMEOUT();
				if(listScreenRecordProfileNameValue.trim().toString().equals(ProfileName.trim().toString()))
				{
					log.info("Record With " +ProfileName+ " Is Displayed In List With Status " +profileRecordStatusValue);
				}//end of if
				else
				{
					log.info("Record With " +ProfileName+ " Is Not Displayed In List" );

				}//end of else
			}//end of catch

		}//end of for 

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of listProfileRecord function

	//--------------Method to Modify/Repair Profile Record------------------------//
	public void modifyRepairprofile(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String originalProfileName = map.get("Original Profile Name");
			String ProfileName=map.get("Profile Name");
			String ProfileDescription = map.get("Profile Description");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.enterText(filterScreenProfileNameTxtField, originalProfileName);
			elementUtil.clickElement(btnReset);

			if(elementUtil.getText(filterScreenProfileNameTxtField).isEmpty())
			{
				log.info("Reset Button Is Working Fine");
			}//end
			else
			{
				log.error("Reset Button Not Working Fine");
			}//end of else

			elementUtil.enterText(filterScreenProfileNameTxtField, originalProfileName);
			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for Modify/Repair profile operation".trim().toString()))
				{
					log.info("Record With Profile " +originalProfileName+ " Not Found For Modify Operation");
				}
			} catch (NoSuchElementException e) {

				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(modifyRecord);
				if(elementUtil.getAttribute(profileNameTxtField).trim().toString().equals(originalProfileName))	
				{
					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(btnCancel);

					String ActualCancelBtnValidationMsg = elementUtil.getText(errorMessages);
					String ExpectedCancelBtnValidationMsg = "Operation Modify/Repair profile was cancelled.";

					if (ActualCancelBtnValidationMsg.trim().toString().equals(ExpectedCancelBtnValidationMsg.trim().toString())) {
						log.info("Cancel button is working fine");
					} else {
						log.error("Cancel button is not working");
					}	

					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(restartWorkFlowBtn);

					elementUtil.enterText(filterScreenProfileNameTxtField, originalProfileName);
					elementUtil.clickElement(okBtn);

					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(modifyRecord);

					elementUtil.clearText(profileNameTxtField);
					elementUtil.clearText(profileDescTxtField);
					elementUtil.clickElement(btnUnChkAll);

					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(okBtn);

					String profileModifyScreenErrorMessageexpected="Profile Name is required." + "You must select some menu checkboxes";

					if (elementUtil.getText(errorMessages).trim().toString().equals(profileModifyScreenErrorMessageexpected.trim().toString())) {
						log.info("Mandatory Fields Validation Message For Profile Modify/Repair Screen Displayed Is Correct");
					} else {
						log.info("Mandatory Fields Validation Message For Profile Modify/Repair Screen Displayed Is Incorrect");
					}

					elementUtil.SHORT_TIMEOUT();
					elementUtil.enterText(profileNameTxtField, ProfileName);
					elementUtil.enterText(profileDescTxtField, ProfileDescription);
					elementUtil.clickElement(btnChkAll);
					elementUtil.clickElement(btnOk);

					try {

						if(elementUtil.getText(errorMessages).trim().toString().equals("Profile already exists".trim().toString()))
						{
							log.info("Duplicate Record Found Record With Profile " +ProfileName+ " Already Exists");
						}//end of if
						else
						{
							log.error("Test Data Provided For Profile Modify Operation Is Not As Valid Format");
						}//end of else
					} catch (NoSuchElementException e2) {
						elementUtil.clickElement(okBtn);
						String profileAddValidationMessage="Operation Modify/Repair profile executed successfully. " +ProfileName+ "  placed in Approve queue. ";
						if(elementUtil.getText(messages).trim().toString().equals(profileAddValidationMessage.trim().toString()))
						{
							log.info("Record With Profile Name " +ProfileName+ " Modified Successfully");
						}
					}//end of catch

				}//end of if
				else
				{
					log.error("Record Mismatch, Record With Profile Name " +originalProfileName+ " Not Found For Modify Operation");
				}
			}//end of catch 
		}//end of for

		//perform logout operation
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of modifyRepairProfile function

	//-----------------Method to perform Logout Operation----------------------------
	public void logOutOperation() throws InterruptedException {
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
