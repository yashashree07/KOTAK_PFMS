package COM.KOTAKPFMS.QA.PAGES;

//imports
import java.io.IOException;
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

/**
 * @Author -- Yashashree Suryawanshi
 * @version 1.0
 * @since 20-11-2021
 * 
 * <h2>Class Description : Class Involving different methods related to Administration->User Menu</h2>
 **/

public class UserPage {

	List<Map<String, String>> test_Data;
	ElementUtil elementUtil;
	FileReadUtils fileReader;
	HomePage homePage;
	private WebDriver driver;
	Logger log = Logger.getLogger(UserPage.class);

	// User Page Xpaths
	@FindBy(name = "groupName")
	WebElement groupNameDropdown;

	@FindBy(id="inf_codeValue")
	WebElement invalidIFSCCodeErrorMessage;

	@FindBy(name="group")
	WebElement groupNameTxtField;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement okBtn;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(name = "userName")
	WebElement userName;

	@FindBy(name = "fullName")
	WebElement fullName;

	@FindBy(name="username")
	WebElement userAdd_Modify_Screen_UserName;

	@FindBy(name = "locale")
	WebElement language;

	@FindBy(name = "initials")
	WebElement initials;

	@FindBy(name = "emailAddress")
	WebElement emailAddress;

	@FindBy(name = "mobileNo")
	WebElement mobileNo;

	@FindBy(name = "isSupervisor")
	WebElement isSupervisor;

	@FindBy(name = "profileId")
	WebElement profile;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "verifyPassword")
	WebElement verifyPassword;

	@FindBy(name = "externalId")
	WebElement externalId;

	@FindBy(name = "SOLid")
	WebElement SOLIDTxtField;

	@FindBy(id = "codeId")
	WebElement userMappingCodedropdown;

	@FindBy(name = "codeValue")
	WebElement userMappingCode;

	@FindBy(name = "sec.param.type")
	WebElement securityParameters;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/p/input[2]")
	WebElement btnConfirm;

	@FindBy(id = "inf_username")
	WebElement errorUsername;

	@FindBy(id = "inf_fullName")
	WebElement errorFullname;

	@FindBy(id = "inf_profileId")
	WebElement errorProfileId;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement btnCancel;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement btnReset;

	@FindBy(id = "btnBlockUnblock")
	WebElement blockUnblockBtn;

	// WebElements for User-Approve page btn
	@FindBy(xpath = "//input[@value='OK']")
	WebElement OkBtn;

	@FindBy(xpath = "//input[@value='Reset']")
	WebElement resetBtn;

	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name = "reject")
	WebElement rejectBtn;

	@FindBy(name = "repair")
	WebElement toRepairBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errorMessages;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]")
	WebElement validationMsg;

	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr[1]/td/b")
	WebElement screenMsg;

	@FindBy(xpath="//td[@class='HeaderTitle']")
	WebElement headerMsg;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement screenRecord;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement removeScreenRecord;

	// Cancel Error Msg Xpath
	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement cancelErrorMsg;

	@FindBy(xpath = "//a[@class='restartInHeader']")
	WebElement btnRestartWorkFLow;

	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement userOk;

	@FindBy(name="add")
	WebElement addBtn;

	// Webelements for View user screen filter
	@FindBy(name = "userName")
	WebElement username;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement viewUserName;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[6]")
	WebElement viewUserStatus;

	@FindBy(name = "code")
	WebElement ifscCode;

	@FindBy(name = "fullname")
	WebElement fullname;

	@FindBy(name = "group")
	WebElement group;

	@FindBy(name="authGroupInherited")
	WebElement groupInheritedChkbox;

	@FindBy(name="authPassword")
	WebElement passwordAuthenticationChkBox;
	
	@FindBy(xpath="/html/body/div[4]/center/div[2]/table/tbody/tr[2]/td/div[2]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]")
	WebElement approveScreenUserNameTxt;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[3]")
	WebElement removeScreenUserName;

	@FindBy(id="btnRemove")
	WebElement removeBtn;

	@FindBy(name = "itemStatus")
	WebElement statusDropdown;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[6]")
	WebElement userListScreenRecordStatusValue;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeBtn;

	@FindBy(xpath = "//a[normalize-space()='Restart Workflow']")
	WebElement restartWorkFlowBtn;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-log-out']")
	WebElement mainPageLogOutButton;

	@FindBy(id = "content")
	WebElement mainFrame;

	@FindBy(xpath = "//p[@class='messages']")
	WebElement messages;

	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement listScreenErrorMessage;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='OK']")
	WebElement mainPageLogoutOkBtn;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement listScreenRecord;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement listScreenRecordUserName;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement blockUnblockScreenRecord;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement blockUnblockScreenUserName;

	@FindBy(id="inf_username")
	WebElement userNameFieldErrorMessage;

	@FindBy(id="inf_fullName")
	WebElement fullNameFieldErrorMessage;

	@FindBy(id="inf_profileId")
	WebElement profileFieldErrorMessage;

	@FindBy(name="content(groupId)")
	WebElement groupNameDropDownField;

	// UserPage Class Constructor
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.homePage = new HomePage(driver);
		this.elementUtil = new ElementUtil(driver);
		this.fileReader = new FileReadUtils(driver);

	}//end

	//--------------Method to Add User Record------------------------//
	public void addUser(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupNameDropdown = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String Language = map.get("Language");
			String Initials = map.get("Initials");
			String EmailAddress = map.get("Email Address");
			String MobileNo = map.get("Mobile No.");
			String IsSupervisor = map.get("Is Supervisor");
			String Profile = map.get("Profile");
			String GroupInherited=map.get("Group Inherited");
			String PasswordAuthentication=map.get("Password Authentication");
			String Password = map.get("Password");
			String VerifyPassword = map.get("Verify Password");
			String ExternalUserID = map.get("External User ID");
			String SOLID = map.get("SOL ID");
			String UserMappingCodeDropdown = map.get("User Mapping Code Dropdown");
			String UserMappingCode = map.get("IFSC Code(User Mapping Code)");
			String ExpectedFieldInvalidDataMessage="Invalid field";
			String ExpectedIFSCCodeErrorMessage="IFSC code " +UserMappingCode+ " must start with KKBK";
			String ExpectedBICCodeErrorMessage=UserMappingCode+ " is not valid BIC or not in database";
			String ExpectedBranchCodeErrorMessage="BRANCH code " +UserMappingCode+ " must be 5 digit numeric value";
			String ExpectedAlphanumericIFSCodeMsg="Invalid alphanumeric\n" + "data";

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.selectDropDownByVisibleText(groupNameDropdown, GroupNameDropdown);
			elementUtil.clickElement(okBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(cancelBtn);

			String ActualCancelBtnValidationMsg = elementUtil.getText(errorMessages);
			String ExpectedCancelBtnValidationMsg = "Operation Add new user was cancelled.";

			if (ActualCancelBtnValidationMsg.trim().toString().equals(ExpectedCancelBtnValidationMsg.trim().toString())) {
				log.info("Cancel button is working fine");
			} else {
				log.error("Cancel button is not working");
			}

			elementUtil.selectDropDownByVisibleText(groupNameDropdown, GroupNameDropdown);
			elementUtil.clickElement(okBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnOk);

			String ActualUsernameFieldValidation = errorUsername.getText();
			String ActualFullnameFieldValidation = errorFullname.getText();
			String ActualProfileIdFieldValidation = errorProfileId.getText();
			String ExpectedFieldValidation = "ERROR: required";

			if (ActualUsernameFieldValidation.equals(ExpectedFieldValidation)
					&& ActualFullnameFieldValidation.equals(ExpectedFieldValidation)
					&& ActualProfileIdFieldValidation.equals(ExpectedFieldValidation)) {
				log.info("Required fields are validated");
			} else {
				log.error("Required field validation failed");
			}

			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(userAdd_Modify_Screen_UserName, Username);
			elementUtil.enterText(fullName, FullName);
			elementUtil.selectDropDownByVisibleText(language, Language);
			elementUtil.enterText(initials, Initials);
			elementUtil.enterText(emailAddress, EmailAddress);
			elementUtil.enterText(mobileNo, MobileNo);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(isSupervisor, IsSupervisor);
			elementUtil.selectDropDownByVisibleText(profile, Profile);
			if(GroupInherited.equalsIgnoreCase("Yes"))
			{
				if(!groupInheritedChkbox.isSelected())
				{
					elementUtil.clickElement(groupInheritedChkbox);
				}//end 

			}//end 
			if(PasswordAuthentication.equalsIgnoreCase("Yes"))
			{
				elementUtil.clickElement(passwordAuthenticationChkBox);
			}//end of if
			elementUtil.enterText(password, Password);
			elementUtil.enterText(verifyPassword, VerifyPassword);
			elementUtil.enterText(externalId, ExternalUserID);
			elementUtil.enterText(SOLIDTxtField,SOLID);
			if(!UserMappingCodeDropdown.isEmpty() && !UserMappingCode.isEmpty())
			{
				elementUtil.selectDropDownByVisibleText(userMappingCodedropdown, UserMappingCodeDropdown);
				elementUtil.enterText(userMappingCode, UserMappingCode);
				elementUtil.clickElement(addBtn);
				try {

					if(elementUtil.getText(invalidIFSCCodeErrorMessage).equals(ExpectedAlphanumericIFSCodeMsg))
					{
						log.info(ExpectedAlphanumericIFSCodeMsg);
					}
				} catch (NoSuchElementException e6) {
					//No implementation
				}

			}
			elementUtil.clickElement(btnOk);
			elementUtil.SHORT_TIMEOUT();


			try {	
				//Check if Duplicate Record
				if(elementUtil.getText(errorMessages).trim().toString().equals("User already exists".trim().toString()))
				{
					log.info("Duplicate Record Found Record With User Name " +Username+ " Already Exists");
				}//end of if
				//Check For IFSC Code Error Message
				else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedIFSCCodeErrorMessage.trim().toString()))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				//Check For BIC Code Error Message
				else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBICCodeErrorMessage.trim().toString()))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				//Check For Branch Code Error Message
				else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBranchCodeErrorMessage.trim().toString()))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				else
				{
					log.error("Test Data Provided For User Add Operation Is Not As Per Valid Format");
					log.error(elementUtil.getText(errorMessages));
				}//end of else
			} catch (NoSuchElementException e) {
				try {
					if (elementUtil.getText(userNameFieldErrorMessage).equals(ExpectedFieldValidation)
							|| elementUtil.getText(fullNameFieldErrorMessage).equals(ExpectedFieldValidation)
							|| elementUtil.getText(profileFieldErrorMessage).equals(ExpectedFieldValidation) ||
							elementUtil.getText(userNameFieldErrorMessage).equals(ExpectedFieldInvalidDataMessage) || elementUtil.getText(fullNameFieldErrorMessage).equals(ExpectedFieldInvalidDataMessage)) {
						log.info("Required fields are validated for User-->Add Screen");
					}
					else
					{
						log.error("Required fields are validated failed for User-->Add Screen");
					}
				} catch (NoSuchElementException e2) {
					elementUtil.clickElement(btnConfirm);
					String userAddValidationMessage="Operation Add new user executed successfully. " +GroupNameDropdown+"/"+Username+ " placed in Approve queue.";
					if(elementUtil.getText(messages).trim().toString().equals(userAddValidationMessage.trim().toString()))
					{
						log.info("Record With User Name " +Username+ " Added Successfully");
					}

				}

			}//end of catch

		}//end of for
		//perform logout operation
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of userAdd function


	//--------------Method to Add User Record With Invalid Data------------------------//
	public void addUserInvalidData(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupNameDropdown = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String Language = map.get("Language");
			String Initials = map.get("Initials");
			String EmailAddress = map.get("Email Address");
			String MobileNo = map.get("Mobile No.");
			String IsSupervisor = map.get("Is Supervisor");
			String Profile = map.get("Profile");
			String GroupInherited=map.get("Group Inherited");
			String PasswordAuthentication=map.get("Password Authentication");
			String Password = map.get("Password");
			String VerifyPassword = map.get("Verify Password");
			String ExternalUserID = map.get("External User ID");
			String SOLID = map.get("SOL ID");
			String UserMappingCodeDropdown = map.get("User Mapping Code Dropdown");
			String UserMappingCode = map.get("IFSC Code(User Mapping Code)");
			String ExpectedFieldValidation = "ERROR: required";
			String ExpectedFieldInvalidDataMessage="Invalid field";
			String ExpectedIFSCCodeErrorMessage="IFSC code " +UserMappingCode+ " must start with KKBK";
			String ExpectedBICCodeErrorMessage=UserMappingCode+ " is not valid BIC or not in database";
			String ExpectedBranchCodeErrorMessage="BRANCH code " +UserMappingCode+ " must be 5 digit numeric value";
			String ExpectedAlphanumericIFSCodeMsg="Invalid alphanumeric\n" + "data";

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.selectDropDownByVisibleText(groupNameDropdown, GroupNameDropdown);
			elementUtil.clickElement(okBtn);
			elementUtil.SHORT_TIMEOUT();

			elementUtil.enterText(userAdd_Modify_Screen_UserName, Username);
			elementUtil.enterText(fullName, FullName);
			elementUtil.selectDropDownByVisibleText(language, Language);
			elementUtil.enterText(initials, Initials);
			elementUtil.enterText(emailAddress, EmailAddress);
			elementUtil.enterText(mobileNo, MobileNo);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.selectDropDownByVisibleText(isSupervisor, IsSupervisor);
			elementUtil.selectDropDownByVisibleText(profile, Profile);
			if(GroupInherited.equalsIgnoreCase("Yes"))
			{
				if(!groupInheritedChkbox.isSelected())
				{
					elementUtil.clickElement(groupInheritedChkbox);
				}//end 

			}//end 
			if(PasswordAuthentication.equalsIgnoreCase("Yes"))
			{
				elementUtil.clickElement(passwordAuthenticationChkBox);
			}//end of if
			elementUtil.enterText(password, Password);
			elementUtil.enterText(verifyPassword, VerifyPassword);
			elementUtil.enterText(externalId, ExternalUserID);
			elementUtil.enterText(SOLIDTxtField,SOLID);
			if(!UserMappingCodeDropdown.isEmpty() && !UserMappingCode.isEmpty())
			{
				elementUtil.selectDropDownByVisibleText(userMappingCodedropdown, UserMappingCodeDropdown);
				elementUtil.enterText(userMappingCode, UserMappingCode);
				elementUtil.clickElement(addBtn);
				try {

					if(elementUtil.getText(invalidIFSCCodeErrorMessage).equals(ExpectedAlphanumericIFSCodeMsg))
					{
						log.info(ExpectedAlphanumericIFSCodeMsg);
					}
				} catch (NoSuchElementException e6) {
					//No implementation
				}

			}
			elementUtil.clickElement(btnOk);
			elementUtil.SHORT_TIMEOUT();


			try {	
				//Check if Duplicate Record
				if(elementUtil.getText(errorMessages).trim().toString().equals("User already exists".trim().toString()))
				{
					log.info("Duplicate Record Found Record With User Name " +Username+ " Already Exists");
				}//end of if
				//Check For IFSC Code Error Message
				else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedIFSCCodeErrorMessage.trim().toString()))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				//Check For BIC Code Error Message
				else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBICCodeErrorMessage.trim().toString()))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				//Check For Branch Code Error Message
				else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBranchCodeErrorMessage.trim().toString()))
				{
					log.info(elementUtil.getText(errorMessages));
				}
			} catch (NoSuchElementException e) {
				try {
					if (elementUtil.getText(userNameFieldErrorMessage).equals(ExpectedFieldValidation)
							|| elementUtil.getText(fullNameFieldErrorMessage).equals(ExpectedFieldValidation)
							|| elementUtil.getText(profileFieldErrorMessage).equals(ExpectedFieldValidation) ||
							elementUtil.getText(userNameFieldErrorMessage).equals(ExpectedFieldInvalidDataMessage) || elementUtil.getText(fullNameFieldErrorMessage).equals(ExpectedFieldInvalidDataMessage)) {
						log.info("Required fields are validated for User-->Add Screen");
					}
				} catch (NoSuchElementException e2) {
					log.error("Test Data Provided For User-->Add Operation is Not Invalid");
				}

			}//end of catch

		}//end of for
		//perform logout operation
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of userAddInvalidData function

	// --------------Method to Approve User Record------------------------//
	public void approveUserRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupName = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String IFSC=map.get("IFSC Code(User Mapping Code)");
			String operation=map.get("Operation");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);

			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(userName).isEmpty() && elementUtil.getText(ifscCode).isEmpty() && elementUtil.getText(fullName).isEmpty() && elementUtil.getText(groupNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);

			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for operation".trim().toString()))
				{
					log.info("Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For Approve Operation" );
				}

			} catch (NoSuchElementException e) {
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(screenRecord);
				try {
					
					if(elementUtil.getText(errorMessages).trim().toString().equals("Operation Approve user changes failed to execute: User cannot approve own modification.".trim().toString()))
					{
						log.info("Approval of Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Failed. User cannot approve own modification" );
					}
				} catch (NoSuchElementException e2) {
					if(elementUtil.getText(approveScreenUserNameTxt).trim().toString().equals(Username.trim().toString()))
					{
						if(operation.equalsIgnoreCase("Approve"))
						{
							elementUtil.clickElement(approveBtn);
							log.info(elementUtil.getText(messages));
						}
						else if(operation.equalsIgnoreCase("Reject"))
						{
							elementUtil.clickElement(rejectBtn);
							log.info(elementUtil.getText(messages));
						}
						else if(operation.equalsIgnoreCase("To Repair"))
						{
							elementUtil.clickElement(toRepairBtn);
							log.info(elementUtil.getText(messages));
						}
					}//end of if
					else
					{
						log.error("Record Mismatch, Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For Approve Operation");
					}//end of else
				}//end of catch
			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of userApprove function

	// --------------Method to Remove User Record------------------------//
	public void removeUserRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupName = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String IFSC=map.get("IFSC Code(User Mapping Code)");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);

			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(userName).isEmpty() && elementUtil.getText(ifscCode).isEmpty() && elementUtil.getText(fullName).isEmpty() && elementUtil.getText(groupNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for operation".trim().toString()))
				{
					log.info("Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For Remove Operation" );
				}

			} catch (NoSuchElementException e) {
				if(elementUtil.getText(removeScreenUserName).trim().toString().equals(Username.trim().toString()))
				{
					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(removeScreenRecord);
					elementUtil.clickElement(removeBtn);
					log.info(elementUtil.getText(messages));
				}//end of if
				else
				{
					log.error("Record Mismatch, Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For Remove Operation");
				}
			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of userRemove function

	// --------------Method to Block/Unblock User Record------------------------//
	public void userBlockUnblockRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupName = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String IFSC=map.get("IFSC Code(User Mapping Code)");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);

			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(userName).isEmpty() && elementUtil.getText(ifscCode).isEmpty() && elementUtil.getText(fullName).isEmpty() && elementUtil.getText(groupNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);

			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for operation".trim().toString()))
				{
					log.info("Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For Block/Unblock Operation" );
				}

			} catch (NoSuchElementException e) {
				
				if(elementUtil.getText(blockUnblockScreenUserName).trim().toString().equals(Username.trim().toString()))
				{
					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(blockUnblockScreenRecord);
					elementUtil.clickElement(blockUnblockBtn);
					log.info(elementUtil.getText(messages));

				}//end of if
				else
				{
					log.error("Record Mismatch, Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For Block/Unblock Operation");
				}
			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of userBlockUnblockRecord function

	// --------------Method to Modify User Record------------------------//
	public void modifyUserRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			String OriginalGroupName = map.get("Original GroupName");
			String OriginalUsername = map.get("Original Username");
			String OriginalFullName = map.get("Original Full Name");
			String OriginalIFSC=map.get("Original IFSC Code(User Mapping Code)");
			String GroupName = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String Language = map.get("Language");
			String Initials = map.get("Initials");
			String EmailAddress = map.get("Email Address");
			String MobileNo = map.get("Mobile No.");
			String IsSupervisor = map.get("Is Supervisor");
			String Profile = map.get("Profile");
			String Password = map.get("Password");
			String VerifyPassword = map.get("Verify Password");
			String ExternalUserID = map.get("External User ID");
			String SOLID = map.get("SOL ID");
			String UserMappingCodeDropdown = map.get("User Mapping Code Dropdown");
			String UserMappingCode=map.get("IFSC Code(User Mapping Code)");
			String GroupInherited=map.get("Group Inherited");
			String PasswordAuthentication=map.get("Password Authentication");
			String ExpectedFieldValidation = "ERROR: required";
			String ExpectedFieldInvalidDataMessage="Invalid field";
			String ExpectedIFSCCodeErrorMessage=UserMappingCode+ " is not valid IFSC or not in database";
			String ExpectedBICCodeErrorMessage=UserMappingCode+ " is not valid BIC or not in database";
			String ExpectedBranchCodeErrorMessage="BRANCH code " +UserMappingCode+ " must be 5 digit numeric value";
			String ExpectedAlphanumericIFSCodeMsg="Invalid alphanumeric\n" + "data";


			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(userName,OriginalUsername);
			elementUtil.enterText(ifscCode, OriginalIFSC);
			elementUtil.enterText(fullName, OriginalFullName);
			elementUtil.enterText(groupNameTxtField,OriginalGroupName);

			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(userName).isEmpty() && elementUtil.getText(ifscCode).isEmpty() && elementUtil.getText(fullName).isEmpty() && elementUtil.getText(groupNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}//end

			//enter details on filter screen
			elementUtil.enterText(userName,OriginalUsername);
			elementUtil.enterText(ifscCode, OriginalIFSC);
			elementUtil.enterText(fullName, OriginalFullName);
			elementUtil.enterText(groupNameTxtField,OriginalGroupName);

			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for operation".trim().toString()))
				{
					log.info("Record With Values [ " +OriginalUsername+ " , " +OriginalIFSC+ " , " +OriginalFullName+ " , " +OriginalGroupName+ " ] Not Found For Modify/Repair Operation" );
				}

			} catch (NoSuchElementException e) {
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(screenRecord);
				if(elementUtil.getAttribute(userAdd_Modify_Screen_UserName).trim().toString().equals(OriginalUsername.trim().toString()))
				{
					elementUtil.clearText(fullName);
					elementUtil.enterText(fullName,FullName);
					elementUtil.selectDropDownByVisibleText(language, Language);
					elementUtil.clearText(initials);
					elementUtil.enterText(initials, Initials);
					elementUtil.clearText(emailAddress);
					elementUtil.enterText(emailAddress, EmailAddress);
					elementUtil.clearText(mobileNo);
					elementUtil.enterText(mobileNo, MobileNo);
					elementUtil.SHORT_TIMEOUT();
					elementUtil.selectDropDownByVisibleText(isSupervisor, IsSupervisor);
					elementUtil.selectDropDownByVisibleText(groupNameDropDownField, GroupName);
					elementUtil.selectDropDownByVisibleText(profile, Profile);
					if(GroupInherited.equalsIgnoreCase("Yes"))
					{
						if(!groupInheritedChkbox.isSelected())
						{
							elementUtil.clickElement(groupInheritedChkbox);
						}//end 

					}//end 
					if(PasswordAuthentication.equalsIgnoreCase("Yes"))
					{
						if(!passwordAuthenticationChkBox.isSelected())
						{
							elementUtil.clickElement(passwordAuthenticationChkBox);
						}
					}//end of if

					elementUtil.clearText(password);
					elementUtil.enterText(password, Password);
					elementUtil.clearText(verifyPassword);
					elementUtil.enterText(verifyPassword, VerifyPassword);
					elementUtil.clearText(externalId);
					elementUtil.enterText(externalId, ExternalUserID);
					elementUtil.clearText(SOLIDTxtField);
					elementUtil.enterText(SOLIDTxtField,SOLID);
					if(!UserMappingCodeDropdown.isEmpty() && !UserMappingCode.isEmpty())
					{
						elementUtil.selectDropDownByVisibleText(userMappingCodedropdown, UserMappingCodeDropdown);
						elementUtil.enterText(userMappingCode, UserMappingCode);
						elementUtil.clickElement(addBtn);
						try {

							if(elementUtil.getText(invalidIFSCCodeErrorMessage).equals(ExpectedAlphanumericIFSCodeMsg))
							{
								log.info(ExpectedAlphanumericIFSCodeMsg);
							}
						} catch (NoSuchElementException e6) {
							//No implementation
						}//end of catch

					}//end of if
					
					elementUtil.clickElement(okBtn);
					try {
						if(elementUtil.getText(errorMessages).trim().toString().equals("User already exists".trim().toString()))
						{
							log.info("Duplicate Record Found , Record With " +Username+ " Already Exists");
						}//end of if
						//Check For IFSC Code Error Message
						else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedIFSCCodeErrorMessage.trim().toString()))
						{
							log.info(elementUtil.getText(errorMessages));
						}
						//Check For BIC Code Error Message
						else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBICCodeErrorMessage.trim().toString()))
						{
							log.info(elementUtil.getText(errorMessages));
						}
						//Check For Branch Code Error Message
						else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBranchCodeErrorMessage.trim().toString()))
						{
							log.info(elementUtil.getText(errorMessages));
						}
						else
						{
							log.info("Test Data Provided For Modify/Repair Operation Is Not As Per Valid Format");
						}//end of else
					} catch (NoSuchElementException e2) {
						elementUtil.SHORT_TIMEOUT();
						elementUtil.clickElement(okBtn);
						log.info(elementUtil.getText(messages));
						
					}//end of catch

				}//end of if
				else
				{
					log.info("Record Mismatch, Record With Values [ " +OriginalUsername+ " , " +OriginalIFSC+ " , " +OriginalFullName+ " , " +OriginalGroupName+ " ] Not Found For Modify/Repair Operation" );		
				}
			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of modifyUserRecord function

	// --------------Method to Modify User Record With Invalid Data------------------------//
	public void modifyUserRecordInvalidData(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			String OriginalGroupName = map.get("Original GroupName");
			String OriginalUsername = map.get("Original Username");
			String OriginalFullName = map.get("Original Full Name");
			String OriginalIFSC=map.get("Original IFSC Code(User Mapping Code)");
			String GroupName = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String Language = map.get("Language");
			String Initials = map.get("Initials");
			String EmailAddress = map.get("Email Address");
			String MobileNo = map.get("Mobile No.");
			String IsSupervisor = map.get("Is Supervisor");
			String Profile = map.get("Profile");
			String Password = map.get("Password");
			String VerifyPassword = map.get("Verify Password");
			String ExternalUserID = map.get("External User ID");
			String SOLID = map.get("SOL ID");
			String UserMappingCodeDropdown = map.get("User Mapping Code Dropdown");
			String UserMappingCode=map.get("IFSC Code(User Mapping Code)");
			String GroupInherited=map.get("Group Inherited");
			String PasswordAuthentication=map.get("Password Authentication");
			String ExpectedFieldValidation = "ERROR: required";
			String ExpectedFieldInvalidDataMessage="Invalid field";
			String ExpectedIFSCCodeErrorMessage=UserMappingCode+ " is not valid IFSC or not in database";
			String ExpectedBICCodeErrorMessage=UserMappingCode+ " is not valid BIC or not in database";
			String ExpectedBranchCodeErrorMessage="BRANCH code " +UserMappingCode+ " must be 5 digit numeric value";
			String ExpectedAlphanumericIFSCodeMsg="Invalid alphanumeric\n" + "data";

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(userName,OriginalUsername);
			elementUtil.enterText(ifscCode, OriginalIFSC);
			elementUtil.enterText(fullName, OriginalFullName);
			elementUtil.enterText(groupNameTxtField,OriginalGroupName);

			elementUtil.clickElement(okBtn);

			try {
				if(elementUtil.getText(errorMessages).trim().toString().equals("No items available for operation".trim().toString()))
				{
					log.info("Record With Values [ " +OriginalUsername+ " , " +OriginalIFSC+ " , " +OriginalFullName+ " , " +OriginalGroupName+ " ] Not Found For Modify/Repair Operation" );
				}

			} catch (NoSuchElementException e) {
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(screenRecord);
				if(elementUtil.getAttribute(userAdd_Modify_Screen_UserName).trim().toString().equals(OriginalUsername.trim().toString()))
				{

					elementUtil.clearText(fullName);
					elementUtil.enterText(fullName,FullName);
					elementUtil.selectDropDownByVisibleText(language, Language);
					elementUtil.clearText(initials);
					elementUtil.enterText(initials, Initials);
					elementUtil.clearText(emailAddress);
					elementUtil.enterText(emailAddress, EmailAddress);
					elementUtil.clearText(mobileNo);
					elementUtil.enterText(mobileNo, MobileNo);
					elementUtil.SHORT_TIMEOUT();
					elementUtil.selectDropDownByVisibleText(isSupervisor, IsSupervisor);
					elementUtil.selectDropDownByVisibleText(groupNameDropDownField, GroupName);
					elementUtil.selectDropDownByVisibleText(profile, Profile);
					if(GroupInherited.equalsIgnoreCase("Yes"))
					{
						if(!groupInheritedChkbox.isSelected())
						{
							elementUtil.clickElement(groupInheritedChkbox);
						}//end 

					}//end 
					if(PasswordAuthentication.equalsIgnoreCase("Yes"))
					{
						if(!passwordAuthenticationChkBox.isSelected())
						{
							elementUtil.clickElement(passwordAuthenticationChkBox);
						}
					}//end of if

					elementUtil.clearText(password);
					elementUtil.enterText(password, Password);
					elementUtil.clearText(verifyPassword);
					elementUtil.enterText(verifyPassword, VerifyPassword);
					elementUtil.clearText(externalId);
					elementUtil.enterText(externalId, ExternalUserID);
					elementUtil.clearText(SOLIDTxtField);
					elementUtil.enterText(SOLIDTxtField,SOLID);
					if(!UserMappingCodeDropdown.isEmpty() && !UserMappingCode.isEmpty())
					{
						elementUtil.selectDropDownByVisibleText(userMappingCodedropdown, UserMappingCodeDropdown);
						elementUtil.enterText(userMappingCode, UserMappingCode);
						elementUtil.clickElement(addBtn);
						try {

							if(elementUtil.getText(invalidIFSCCodeErrorMessage).equals(ExpectedAlphanumericIFSCodeMsg))
							{
								log.info(ExpectedAlphanumericIFSCodeMsg);
							}
						} catch (NoSuchElementException e6) {
							//No implementation
						}

					}

					elementUtil.clickElement(okBtn);
					try {	
						//Check if Duplicate Record
						if(elementUtil.getText(errorMessages).trim().toString().equals("User already exists".trim().toString()))
						{
							log.info("Duplicate Record Found Record With User Name " +Username+ " Already Exists");
						}//end of if
						//Check For IFSC Code Error Message
						else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedIFSCCodeErrorMessage.trim().toString()))
						{
							log.info(elementUtil.getText(errorMessages));
						}
						//Check For BIC Code Error Message
						else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBICCodeErrorMessage.trim().toString()))
						{
							log.info(elementUtil.getText(errorMessages));
						}
						//Check For Branch Code Error Message
						else if(elementUtil.getText(errorMessages).trim().toString().equals(ExpectedBranchCodeErrorMessage.trim().toString()))
						{
							log.info(elementUtil.getText(errorMessages));
						}
					} catch (NoSuchElementException e5) {
						try {
							if (elementUtil.getText(userNameFieldErrorMessage).equals(ExpectedFieldValidation)
									|| elementUtil.getText(fullNameFieldErrorMessage).equals(ExpectedFieldValidation)
									|| elementUtil.getText(profileFieldErrorMessage).equals(ExpectedFieldValidation) ||
									elementUtil.getText(userNameFieldErrorMessage).equals(ExpectedFieldInvalidDataMessage) || elementUtil.getText(fullNameFieldErrorMessage).equals(ExpectedFieldInvalidDataMessage)) {
								log.info("Required fields are validated for User-->Modify/Repair");
							}
						} catch (NoSuchElementException e2) {
							log.error("Test Data Provided For User-->ModifyRepair Operation is Not Invalid");
						}

					}//end of catch

				}//end of if
				else
				{
					log.info("Record Mismatch, Record With Values [ " +OriginalUsername+ " , " +OriginalIFSC+ " , " +OriginalFullName+ " , " +OriginalGroupName+ " ] Not Found For Modify/Repair Operation" );		
				}
			}//end of catch
		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of modifyUserRecord function

	//--------------Method to List User Record------------------------//
	public void listUserRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupName = map.get("GroupName");
			String Username = map.get("Username");
			String FullName = map.get("Full Name");
			String IFSC=map.get("IFSC Code(User Mapping Code)");
			String status=map.get("Status");

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);
			elementUtil.selectDropDownByVisibleText(statusDropdown, status);

			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(userName).isEmpty() && elementUtil.getText(ifscCode).isEmpty() && elementUtil.getText(fullName).isEmpty() && elementUtil.getText(groupNameTxtField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}

			//enter details on filter screen
			elementUtil.enterText(userName, Username);
			elementUtil.enterText(ifscCode, IFSC);
			elementUtil.enterText(fullName, FullName);
			elementUtil.enterText(groupNameTxtField,GroupName);
			elementUtil.selectDropDownByVisibleText(statusDropdown, status);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);


			if(elementUtil.getText(listScreenErrorMessage).trim().toString().equals("No items available for List operation given the search criteria".trim().toString()))
			{
				log.info("Record With Values [ " +Username+ " , " +IFSC+ " , " +FullName+ " , " +GroupName+ " ] Not Found For List Operation" );
			}//end of if

			else
			{
				elementUtil.SHORT_TIMEOUT();
				String userRecordStatusValue=elementUtil.getText(userListScreenRecordStatusValue);
				elementUtil.SHORT_TIMEOUT();
				String listScreenRecordUserNameValue=elementUtil.getText(listScreenRecordUserName);
				elementUtil.SHORT_TIMEOUT();
				System.out.println(userRecordStatusValue+""+listScreenRecordUserNameValue);
				if(listScreenRecordUserNameValue.trim().toString().equals(Username.trim().toString()))
				{
					log.info("Record With " +Username+ " Is Displayed In List With Status " +userRecordStatusValue);
				}//end of if
				else
				{
					log.info("Record With " +Username+ " Is Not Displayed In List" );

				}//end of else
			}//end of else

		}//end of for 

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of listUserRecord function

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


}//end of main class UserPage
