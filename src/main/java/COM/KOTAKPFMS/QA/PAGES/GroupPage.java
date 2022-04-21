package COM.KOTAKPFMS.QA.PAGES;

//imports
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.log4j.Logger;
import org.intellij.lang.annotations.JdkConstants.FlowLayoutAlignment;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.graphbuilder.math.func.LnFunction;

import COM.KOTAKPFMS.QA.UTIL.ElementUtil;
import COM.KOTAKPFMS.QA.UTIL.FileReadUtils;


public class GroupPage {
	/**
	 * @Author -- Yashashree Suryawanshi
	 * @version 1.0
	 * @since 30-11-2021
	 * 
	 * <h2>Class Description : Class Involving different methods related to Administration->Group Menu</h2>
	 **/

	List<Map<String, String>> test_Data;
	private WebDriver driver;
	ElementUtil elementUtil;
	FileReadUtils fileReader;
	HomePage homePage;
	Logger log = Logger.getLogger(GroupPage.class);

	// WebElements for Group Page Menu
	@FindBy(name="name")
	WebElement nameTextField;

	@FindBy(name="groupName")
	WebElement nameField;

	@FindBy(name="sortPriority")
	WebElement sortPriorityTextField;

	@FindBy(name="details")
	WebElement detailsTextField;

	@FindBy(name="admin")
	WebElement adminChkBox;

	@FindBy(name="drModeLogin")
	WebElement nonInquiryUsersChkBox;

	@FindBy(name="isCustomer")
	WebElement isCustomerChkBox;

	@FindBy(name="authPassword")
	WebElement passwordAuthenticationChkbox;

	@FindBy(name="profileId")
	WebElement profileDropDown;

	@FindBy(name="mySwiftBic")
	WebElement swiftBic;

	@FindBy(name="myEmailAddr")
	WebElement emailAddress;

	@FindBy(name="sec.param.type")
	WebElement securityParameters;

	@FindBy(xpath="//input[@value=\"OK\"]")
	WebElement btnOk;

	@FindBy(name="itemStatus")
	WebElement groupRecordstatusDropDown;

	// btn confirm
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/p/input[2]")
	WebElement btnConfirm;

	// Message
	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement approveMsg;

	@FindBy(xpath="//a[@class='restartInHeader']")
	WebElement btnRestart;

	@FindBy(xpath="//input[@value=\"Reset\"]")
	WebElement btnReset;

	@FindBy(xpath="//input[@value=\"Cancel\"]")
	WebElement btnCancel;

	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement cancelMsg;

	@FindBy(xpath="//*[@id=\"pageBody\"]/p[1]")
	WebElement groupErrorMsg;

	@FindBy(name="filter")
	WebElement withStatusdropdown;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement verifyGroupName;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[3]/td[2]")
	WebElement verifyGroupNameTemp;

	// Approve Record
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement approveRecord;

	@FindBy(xpath="//input[@name='approve']")
	WebElement btnApprove;

	// Remove Record
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement removeRecordLink;

	@FindBy(xpath="//input[@id='btnRemove']")
	WebElement btnRemove;

	@FindBy(xpath="//*[@id=\"pageBody\"]/p")
	WebElement removeMsg;

	// Block Record
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement revealRecord;

	@FindBy(name="block")
	WebElement blockBtn;

	// Unblock Record
	@FindBy(name="unblock")
	WebElement unblockBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	// Modify Record
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[1]")
	WebElement modifyRecordLink;

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

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement groupModulesRecords;

	@FindBy(name="reject")
	WebElement rejectButton;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errorMessages;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement groupListScreenRecStatusValue;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement groupScreenRecGroupNameValue;

	@FindBy(xpath="//*[@id=\"pageBody\"]/div/div/div/form[3]/button")
	WebElement nextBtn;

	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr[2]/td/div[1]/div/div/form[3]/button")
	WebElement nextButton;

	@FindBy(xpath="//*[@id=\"table-reveal\"]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]")
	WebElement groupNameScreen;

	// GroupPage Class Constructor
	public GroupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.elementUtil = new ElementUtil(driver);
		this.homePage = new HomePage(driver);
		this.fileReader = new FileReadUtils(driver);
	}//end 

	//--------------------To add Group---------------//
	public void addGroupRecord(String sheetName) throws InterruptedException, IOException {
		test_Data = fileReader.readSetupExcel(sheetName);

		for (Map<String, String> map : test_Data) {
			String groupName = map.get("Group Name");
			String sortPriority = map.get("Sort Priority");
			String Details=map.get("Details");
			String Swift_BIC=map.get("Swift BIC");
			String EmailAddress=map.get("Email Address");
			String Admin=map.get("Admin");
			String Non_Inquiry_Users=map.get("Non-Inquiry Users"); 
			String IsCustomer=map.get("Is Customer");
			String Account_Set=map.get("Account Set");
			String Customer_Set=map.get("Customer Set");
			String SecurityParameters = map.get("SecurityParameters");
			String passwordAuthentication=map.get("Password Authentication");
			String mandatoryNameFieldValidationMessage="Name is required.";
			String mandatoryDetailsFieldValidationMessage="Details is required.";

			//Restart Workflow
			elementUtil.clickElement(restartWorkFlowBtn);

			//----Cancel button validation----//
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnCancel);
			String actualCancelMsg= elementUtil.getText(errormessages);
			String expectCancelMsg="Operation Add group was cancelled.";

			if(actualCancelMsg.trim().toString().equals(expectCancelMsg.trim().toString())) {
				System.out.println("Cancel Button Is Working Fine");
			}else {
				System.out.println("Cancel Button Is Not Working Fine");
			}//end

			//Restart Workflow
			elementUtil.clickElement(restartWorkFlowBtn);

			//checking mandatory fields validation message
			String mandatoryFieldValidationMessage="Name is required.\r\n" + "Details is required.";
			elementUtil.clickElement(btnOk);

			if(elementUtil.getText(errormessages).trim().toString().equals(mandatoryFieldValidationMessage.trim().toString()))
			{
				log.info("Mandatory Field Validation Message Displayed Is Correct");
			}//end of if
			else
			{
				log.error("Mandatory Field Validation Message Displayed Is Incorrect");
			}//end of else


			elementUtil.clickElement(restartWorkFlowBtn);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(nameTextField,groupName);
			elementUtil.enterText(sortPriorityTextField,sortPriority);
			elementUtil.enterText(detailsTextField,Details);
			//If value from Test Sheet for Admin field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(adminChkBox, Admin);
			//If value from Test Sheet for Non-Enquiry Users field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(nonInquiryUsersChkBox, Non_Inquiry_Users);
			//If value from Test Sheet for IsCustomer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(isCustomerChkBox, IsCustomer);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(swiftBic,Swift_BIC);
			elementUtil.enterText(emailAddress, EmailAddress);
			//If value from Test Sheet for Is Customer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(passwordAuthenticationChkbox, passwordAuthentication);
			elementUtil.selectDropDownByVisibleText(securityParameters, SecurityParameters);

			//click on ok button to proceed further
			elementUtil.clickElement(btnOk);
			//Avoid Record Addition in case of Duplicate Record Existence OR Invalid Record from Test Sheet
			try {
				if(elementUtil.getText(errormessages).trim().toString().equals("Group with the same name already exists".trim().toString()))
				{
					log.info("Duplicate Record Found : Record With Group Name " +groupName+ " Already exists");
				}//end of if
				else if(elementUtil.getText(errorMessages).equals(mandatoryFieldValidationMessage) || elementUtil.getText(errorMessages).equals(mandatoryNameFieldValidationMessage)|| elementUtil.getText(errorMessages).equals(mandatoryDetailsFieldValidationMessage))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				else if(elementUtil.getText(errorMessages).equals("SWIFT BIC"))
				{
					log.info("Invalid SWIFT BIC VALUE provided");
				}
				else
				{
					log.info("Test Data Provided For Group-->Add operation Is Not As Per Valid Format");
				}//end of else
			} catch (NoSuchElementException e) {
				elementUtil.clickElement(btnOk);
				String groupAddValidationMessage="Operation Add group executed successfully." +groupName+ "placed in Approve queue.";
				if(elementUtil.getText(messages).trim().toString().equals(groupAddValidationMessage.trim().toString()))
				{
					log.info("Record With Group Name " +groupName+ " Added SuccessFully");
				}//end of if
			}
		}//end of for
		//perform logout operation
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of function addGroupRecord

	//--------------------To add Group With Invalid Data---------------//
	public void addGroupRecordInvalidData(String sheetName) throws InterruptedException, IOException {
		test_Data = fileReader.readSetupExcel(sheetName);

		for (Map<String, String> map : test_Data) {
			String groupName = map.get("Group Name");
			String sortPriority = map.get("Sort Priority");
			String Details=map.get("Details");
			String Swift_BIC=map.get("Swift BIC");
			String EmailAddress=map.get("Email Address");
			String Admin=map.get("Admin");
			String Non_Inquiry_Users=map.get("Non-Inquiry Users"); 
			String IsCustomer=map.get("Is Customer");
			String Account_Set=map.get("Account Set");
			String Customer_Set=map.get("Customer Set");
			String SecurityParameters = map.get("SecurityParameters");
			String passwordAuthentication=map.get("Password Authentication");
			String mandatoryFieldValidationMessage="Name is required.\n" + "Details is required.";
			String mandatoryNameFieldValidationMessage="Name is required.";
			String mandatoryDetailsFieldValidationMessage="Details is required.";

			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(nameTextField,groupName);
			elementUtil.enterText(sortPriorityTextField,sortPriority);
			elementUtil.enterText(detailsTextField,Details);
			//If value from Test Sheet for Admin field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(adminChkBox, Admin);
			//If value from Test Sheet for Non-Enquiry Users field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(nonInquiryUsersChkBox, Non_Inquiry_Users);
			//If value from Test Sheet for IsCustomer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(isCustomerChkBox, IsCustomer);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(swiftBic,Swift_BIC);
			elementUtil.enterText(emailAddress, EmailAddress);
			//If value from Test Sheet for Password Authentication field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(passwordAuthenticationChkbox, passwordAuthentication);
			elementUtil.selectDropDownByVisibleText(securityParameters, SecurityParameters);

			//click on ok button to proceed further
			elementUtil.clickElement(btnOk);

			try {
				if(elementUtil.getText(errormessages).trim().toString().equals("Group with the same name already exists".trim().toString()))
				{
					log.info("Duplicate Record Found : Record With Group Name " +groupName+ " Already exists");
				}//end of if
				else if(elementUtil.getText(errorMessages).equals(mandatoryFieldValidationMessage) || elementUtil.getText(errorMessages).equals(mandatoryNameFieldValidationMessage)|| elementUtil.getText(errorMessages).equals(mandatoryDetailsFieldValidationMessage))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				else if(elementUtil.getText(errorMessages).equals("SWIFT BIC"))
				{
					log.info("Invalid SWIFT BIC VALUE provided");
				}
				else
				{
					log.info(elementUtil.getText(errorMessages));
				}//end of else
			} catch (NoSuchElementException e) {
				log.info("Test Data Provided For Group-->Add Operation Is Not Invalid");
			}//end of catch
		}//end of for
		//perform logout operation
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of function addGroupRecordInvalidData

	//--------To Approve Group----------//
	public void approveGroupRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException  {

		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String groupName=map.get("Group Name");
			String Operation = map.get("Operation");
			boolean recordFoundFlag=false;
			
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			try {
				if(elementUtil.getText(errorMessages).equals("No items available for Approve group changes operation"))
				{
					log.info("Record With Group Name : " +groupName+ " Not Found");
				}
			} catch (NoSuchElementException e2) {
				//Click on first record available
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(groupModulesRecords);

				try {
					//Case if User tries to approve own modification
					if(elementUtil.getText(errormessages).trim().toString().equals("Operation Approve group changes failed to execute: User cannot approve own modification.".trim().toString()))
					{
						log.info("Record Approval Failed : As User Cannot Approve Own Modification");
					}//end of if 
				} catch (NoSuchElementException e3) {
					while(nextButton.isEnabled())
					{
						//Perform Approve operation with invalid if Next button is enabled
						recordFoundFlag=approveRecord(groupName, Operation);
						//if expected record found break the loop
						if(recordFoundFlag==true)
						{
							break;
						}//end of if
					}//end of while
					try {
						//check if Next button is disabled
						if(nextButton.isEnabled()==false)
						{
							approveRecord(groupName, Operation);
						}//end of if
					} catch (NoSuchElementException e4) {
						//No implementation
					}//end of catch
				}//end of catch
			}//end of catch
		}//end of for
		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();

	}//end of approveGroupRecord function

	//--------To Remove Group----------//
	public void removeGroupRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException  {

		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			//fetch details
			String groupName=map.get("Group Name");
			boolean recordFoundFlag=false;

			//Restart Workflow
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			try {
				if(elementUtil.getText(errorMessages).equals("No items available for Remove group changes operation"))
				{
					log.info("Record With Group Name : " +groupName+ " Not Found");	
				}
			} catch (NoSuchElementException e) {
				//Click on first record available
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(groupModulesRecords);

				//check if Next button is enabled
				while(nextButton.isEnabled()){
					//Perform Remove operation if Next button is enabled
					recordFoundFlag=removeRecord(groupName);
					//if expected record found break the loop
					if(recordFoundFlag==true)
					{
						break;
					}//end of if
				}//end of while
				try {
					//check if Next button is disabled
					if(nextButton.isEnabled()==false)
					{
						recordFoundFlag=removeRecord(groupName);
					}//end of if
				} catch (NoSuchElementException e2) {
					System.out.println("in catch");
				}//end of catch

			}//end of catch

		}//end of for
		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();

	}//end of removeGroupRecord function

	//--------To Block Group----------//
	public void blockGroupRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException  {

		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			String groupName=map.get("Group Name");
			boolean recordFoundFlag=false;

			//Restart Workflow
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			try {
				if(elementUtil.getText(errorMessages).equals("No items available for Block group changes operation"))
				{
					log.info("Record With Group Name : " +groupName+ " Not Found");	
				}
			} catch (NoSuchElementException e) {
				//Click on first record available
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(groupModulesRecords);

				try {
					if(elementUtil.getText(errormessages).equals("Operation Block group failed to execute: User cannot approve own modification."))
					{
						log.info("Operation Block group failed to execute: User cannot approve own modification.");
					}
				} catch (NoSuchElementException e2) {
					//check if Next button is enabled
					while(nextButton.isEnabled()){
						//Perform Block operation if Next button is enabled
						recordFoundFlag=blockRecord(groupName);
						//if expected record found break the loop
						if(recordFoundFlag==true)
						{
							break;
						}//end of if
					}//end of while
					try {
						//check if Next button is disabled
						if(nextButton.isEnabled()==false)
						{
							recordFoundFlag=blockRecord(groupName);
						}//end of if
					} catch (NoSuchElementException e3) {
						
					}//end of catch
				}//end of catch

			}//end of catch block


		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();

	}//end of blockGroupRecord function

	//--------To UnBlock Group----------//
	public void unblockGroupRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException  {

		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			String groupName=map.get("Group Name");
			boolean recordFoundFlag=false;
			//Restart Workflow
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);


			try {
				if(elementUtil.getText(errorMessages).equals("No items available for UnBlock group changes operation"))
				{
					log.info("Record With Group Name : " +groupName+ " Not Found");	
				}
			} catch (NoSuchElementException e) {
				//Click on first record available
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(groupModulesRecords);

				try {
					if(elementUtil.getText(errorMessages).equals("Operation Unblock group failed to execute: User cannot approve own modification."))
					{
						log.info("Operation Unblock group failed to execute: User cannot approve own modification for Record With Group Name : " +groupName);
					}
				} catch (NoSuchElementException e2) {
					//check if Next button is enabled
					while(nextButton.isEnabled()){
						//Perform UnBlock operation if Next button is enabled
						recordFoundFlag=unblockRecord(groupName);
						//if expected record found break the loop
						if(recordFoundFlag==true)
						{
							break;
						}//end of if
					}//end of while
					try {
						//check if Next button is disabled
						if(nextButton.isEnabled()==false)
						{
							recordFoundFlag=unblockRecord(groupName);
						}//end of if
					} catch (NoSuchElementException e3) {
						
					}//end of catch
				}//end of catch
			}//end of catch

		}//end of for

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();

	}//end of unblockGroupRecord function


	//--------To Modify Group----------//
	public void modifyGroupRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException  {

		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			String originalGroupName=map.get("Original Group Name");
			String groupName = map.get("Group Name");
			String sortPriority = map.get("Sort Priority");
			String Details=map.get("Details");
			String Swift_BIC=map.get("Swift BIC");
			String EmailAddress=map.get("Email Address");
			String Admin=map.get("Admin");
			String Non_Inquiry_Users=map.get("Non-Inquiry Users"); 
			String IsCustomer=map.get("Is Customer");
			String Account_Set=map.get("Account Set");
			String Customer_Set=map.get("Customer Set");
			String SecurityParameters = map.get("SecurityParameters");
			String passwordAuthentication=map.get("Password Authentication");
			String mandatoryNameFieldValidationMessage="Name is required.";
			String mandatoryDetailsFieldValidationMessage="Details is required.";
			boolean recordFoundFlag=false;
			

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//Check if records are present for Modify Operation
			try {
				if(elementUtil.getText(errorMessages).equals("No items available for Modify group changes operation"))
				{
					log.info("Record With Group Name : " +groupName+ " Not found");
				}
			} catch (NoSuchElementException e) {
				//Reveal the first record available
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(groupModulesRecords);

				//check if Next button is enabled
				while(nextBtn.isEnabled()){
					//Perform Modify operation if Next button is enabled
					recordFoundFlag=modifyRecord(originalGroupName, groupName, sortPriority, Details, Swift_BIC, EmailAddress, Admin, Non_Inquiry_Users, IsCustomer, Account_Set, Customer_Set, SecurityParameters, passwordAuthentication, mandatoryNameFieldValidationMessage, mandatoryDetailsFieldValidationMessage);
					//if expected record found break the loop
					if(recordFoundFlag==true)
					{
						break;
					}
				}
				try {
					//check if Next button is disabled
					if(nextBtn.isEnabled()==false)
					{
						modifyRecord(originalGroupName, groupName, sortPriority, Details, Swift_BIC, EmailAddress, Admin, Non_Inquiry_Users, IsCustomer, Account_Set, Customer_Set, SecurityParameters, passwordAuthentication, mandatoryNameFieldValidationMessage, mandatoryDetailsFieldValidationMessage);

					}//end of if
				} catch (NoSuchElementException e2) {
					//No implementation
				}


			}//end of catch

		}//end of for
		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();

	}//end of modifyGroupRecord function

	//--------To Modify Group With Invalid Data----------//
	public void modifyGroupRecordInvalidData(String SheetName) throws InterruptedException, InvalidFormatException, IOException  {

		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {

			String originalGroupName=map.get("Original Group Name");
			String groupName = map.get("Group Name");
			String sortPriority = map.get("Sort Priority");
			String Details=map.get("Details");
			String Swift_BIC=map.get("Swift BIC");
			String EmailAddress=map.get("Email Address");
			String Admin=map.get("Admin");
			String Non_Inquiry_Users=map.get("Non-Inquiry Users"); 
			String IsCustomer=map.get("Is Customer");
			String Account_Set=map.get("Account Set");
			String Customer_Set=map.get("Customer Set");
			String SecurityParameters = map.get("SecurityParameters");
			String passwordAuthentication=map.get("Password Authentication");
			String mandatoryNameFieldValidationMessage="Name is required.";
			String mandatoryDetailsFieldValidationMessage="Details is required.";
			String mandatoryFieldValidationMessage="Name is required.\n" + "Details is required.";
			boolean recordFoundFlag=false;

			//restart Workflow
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			try {
				if(elementUtil.getText(errorMessages).equals("No items available for Modify group changes operation"))
				{
					log.info("Record With Group Name : " +groupName+ " Not Found");	
				}
			} catch (NoSuchElementException e) {
				elementUtil.SHORT_TIMEOUT();
				elementUtil.clickElement(groupModulesRecords);

				while(nextBtn.isEnabled())
				{
					//Perform Modify operation with invalid if Next button is enabled
					recordFoundFlag=modifyInvalidData(originalGroupName, groupName, sortPriority, Details, Swift_BIC, EmailAddress, Admin, Non_Inquiry_Users, IsCustomer, Account_Set, Customer_Set, SecurityParameters, passwordAuthentication, mandatoryFieldValidationMessage, mandatoryNameFieldValidationMessage, mandatoryDetailsFieldValidationMessage);
					//if expected record found break the loop
					if(recordFoundFlag==true)
					{
						break;
					}
				}//end 
				try {
					//check if Next button is disabled
					if(nextBtn.isEnabled()==false)
					{
						modifyInvalidData(originalGroupName, groupName, sortPriority, Details, Swift_BIC, EmailAddress, Admin, Non_Inquiry_Users, IsCustomer, Account_Set, Customer_Set, SecurityParameters, passwordAuthentication, mandatoryFieldValidationMessage, mandatoryNameFieldValidationMessage, mandatoryDetailsFieldValidationMessage);

					}//end of if
				} catch (NoSuchElementException e2) {
					
				}//end of catch

			}//end of catch

		}//end of for
		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();


	}//end of modifyGroupRecord function


	//--------------Method to List Group Record------------------------//
	public void listGroupRecord(String SheetName) throws InterruptedException, InvalidFormatException, IOException {
		test_Data = fileReader.readSetupExcel(SheetName);
		for (Map<String, String> map : test_Data) {
			String GroupName = map.get("Group Name");
			String status=map.get("Status");

			//WorkFlow Restart operation
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			//enter details on filter screen
			elementUtil.enterText(nameField,GroupName);
			elementUtil.selectDropDownByVisibleText(groupRecordstatusDropDown,status);

			//checking Reset button working
			elementUtil.clickElement(btnReset);

			if (elementUtil.getText(nameField).isEmpty()) {
				log.info("Reset Button is working fine");
			} else {
				log.error("Reset Button is not working");
			}//end

			//enter details on filter screen
			elementUtil.enterText(nameField,GroupName);
			elementUtil.selectDropDownByVisibleText(groupRecordstatusDropDown, status);

			//Click on ok button to proceed further
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnOk);

			try {
				//checking whether record is available for List Operation
				if(elementUtil.getText(errormessages).trim().toString().equals("No items available for List groups operation".trim().toString()))
				{
					System.out.println("Record With Values [ " +GroupName+ " ] Not Found For List Operation");
					log.info("Record With Values [ " +GroupName+ " ] Not Found For List Operationn" );
				}//end of if
			} catch (NoSuchElementException e) {
				//If Record available check for the required record and proceed further
				elementUtil.SHORT_TIMEOUT();
				String groupRecordStatusValue=elementUtil.getText(groupListScreenRecStatusValue);
				elementUtil.SHORT_TIMEOUT();
				String listScreenRecordGroupNameValue=elementUtil.getText(groupScreenRecGroupNameValue);
				elementUtil.SHORT_TIMEOUT();

				if(listScreenRecordGroupNameValue.trim().toString().equals(GroupName.trim().toString()))
				{
					System.out.println("Record With  " +GroupName+ " Is Displayed In List With Status " +groupRecordStatusValue);
					log.info("Record With " +GroupName+ " Is Displayed In List With Status " +groupRecordStatusValue);
				}//end of if
				else
				{
					System.out.println("Record With " +GroupName+ " Is Not Displayed In List");
					log.info("Record With " +GroupName+ " Is Not Displayed In List" );

				}//end of else
			}//end of catch
		}//end of for 

		// perform logout operation
		elementUtil.handlewin1(driver);
		logOutOperation();
	}//end of listGroupRecord function

	public boolean modifyRecord(String originalGroupName, String groupName,String sortPriority, String Details, String Swift_BIC, String EmailAddress, String Admin, String Non_Inquiry_Users, String IsCustomer,String Account_Set, String  Customer_Set, String SecurityParameters, String passwordAuthentication, String mandatoryNameFieldValidationMessage, String mandatoryDetailsFieldValidationMessage) throws InterruptedException, InvalidFormatException, IOException  {

		boolean recordMatchFlag=false;
		if(elementUtil.getAttribute(nameTextField).equals(originalGroupName))
		{
			recordMatchFlag=true;
			//----Cancel button validation----//
			/*	elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnCancel);
			String expectCancelMsg="Operation Modify group was cancelled.";

			if(elementUtil.getText(errormessages).trim().toString().equals(expectCancelMsg.trim().toString())) {
				System.out.println("Cancel Button Is Working Fine");
			}else {
				System.out.println("Cancel Button Is Not Working Fine");
			}//end

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(groupModulesRecords);*/

			//Clear the details
			elementUtil.clearText(nameTextField);
			elementUtil.clearText(detailsTextField);

			//checking mandatory fields validation message
			String mandatoryFieldValidationMessage="Name is required.\n" + "Details is required.";
			elementUtil.clickElement(btnOk);

			if(elementUtil.getText(errormessages).trim().toString().equals(mandatoryFieldValidationMessage.trim().toString()))
			{
				log.info("Mandatory Field Validation Message Displayed Is Correct");
			}//end of if
			else
			{
				log.error("Mandatory Field Validation Message Displayed Is Incorrect");
			}//end of else

			elementUtil.clearText(nameTextField);
			elementUtil.enterText(nameTextField,groupName);
			elementUtil.enterText(sortPriorityTextField,sortPriority);
			elementUtil.clearText(detailsTextField);
			elementUtil.enterText(detailsTextField,Details);
			//If value from Test Sheet for Admin field is  Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(adminChkBox, Admin);
			//If value from Test Sheet for Non-Enquiry Users field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(nonInquiryUsersChkBox, Non_Inquiry_Users);
			//If value from Test Sheet for IsCustomer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(isCustomerChkBox, IsCustomer);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clearText(swiftBic);
			elementUtil.enterText(swiftBic,Swift_BIC);
			elementUtil.clearText(emailAddress);
			elementUtil.enterText(emailAddress, EmailAddress);
			//If value from Test Sheet for Is Customer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(passwordAuthenticationChkbox, passwordAuthentication);
			elementUtil.selectDropDownByVisibleText(securityParameters, SecurityParameters);

			//click on ok button to proceed further
			elementUtil.clickElement(btnOk);
			//Avoid Record Addition in case of Duplicate Record Existence OR Invalid Record from Test Sheet
			try {
				if(elementUtil.getText(errormessages).trim().toString().equals("Group with the same name already exists".trim().toString()))
				{
					log.info("Duplicate Record Found : Record With Group Name " +groupName+ " Already exists");
				}//end of if
				else if(elementUtil.getText(errorMessages).equals(mandatoryFieldValidationMessage) || elementUtil.getText(errorMessages).equals(mandatoryNameFieldValidationMessage)|| elementUtil.getText(errorMessages).equals(mandatoryDetailsFieldValidationMessage))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				else if(elementUtil.getText(errorMessages).equals("SWIFT BIC"))
				{
					log.info("Invalid SWIFT BIC VALUE provided");
				}
				else
				{
					log.info("Test Data Provided For Group-->Modify Operation Is Not As Per Valid Format");
				}//end of else

			} catch (NoSuchElementException e2) {
				elementUtil.clickElement(btnOk);
				log.info(elementUtil.getText(messages));
			}//end of 
			return recordMatchFlag;
		}//end of if
		else
		{
			recordMatchFlag=false;
			elementUtil.clickElement(nextBtn);
			elementUtil.SHORT_TIMEOUT();

		}
		return recordMatchFlag;

	}//end of modifyGroupRecord function

	//--------To Modify Group With Invalid Data----------//
	public boolean modifyInvalidData(String originalGroupName, String groupName,String sortPriority, String Details, String Swift_BIC, String EmailAddress, String Admin, String Non_Inquiry_Users, String IsCustomer,String Account_Set, String  Customer_Set, String SecurityParameters, String passwordAuthentication, String mandatoryFieldValidationMessage, String mandatoryNameFieldValidationMessage, String mandatoryDetailsFieldValidationMessage) throws InterruptedException, InvalidFormatException, IOException  {

		boolean recordMatchFlag=false;
		if(elementUtil.getAttribute(nameTextField).equals(originalGroupName))
		{
			recordMatchFlag=true;
			elementUtil.clearText(nameTextField);
			elementUtil.enterText(nameTextField,groupName);
			elementUtil.enterText(sortPriorityTextField,sortPriority);
			elementUtil.clearText(detailsTextField);
			elementUtil.enterText(detailsTextField,Details);
			//If value from Test Sheet for Admin field is  Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(adminChkBox, Admin);
			//If value from Test Sheet for Non-Enquiry Users field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(nonInquiryUsersChkBox, Non_Inquiry_Users);
			//If value from Test Sheet for IsCustomer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(isCustomerChkBox, IsCustomer);
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clearText(swiftBic);
			elementUtil.enterText(swiftBic,Swift_BIC);
			elementUtil.clearText(emailAddress);
			elementUtil.enterText(emailAddress, EmailAddress);
			//If value from Test Sheet for Is Customer field is Yes Select the Checkbox
			elementUtil.CheckBoxSelectAndDeslection(passwordAuthenticationChkbox, passwordAuthentication);
			elementUtil.selectDropDownByVisibleText(securityParameters, SecurityParameters);

			//click on ok button to proceed further
			elementUtil.clickElement(btnOk);

			try {
				if(elementUtil.getText(errormessages).trim().toString().equals("Group with the same name already exists".trim().toString()))
				{
					log.info("Duplicate Record Found : Record With Group Name " +groupName+ " Already exists");
				}//end of if
				else if(elementUtil.getText(errorMessages).equals(mandatoryFieldValidationMessage) || elementUtil.getText(errorMessages).equals(mandatoryNameFieldValidationMessage)|| elementUtil.getText(errorMessages).equals(mandatoryDetailsFieldValidationMessage))
				{
					log.info(elementUtil.getText(errorMessages));
				}
				else if(elementUtil.getText(errorMessages).equals("SWIFT BIC"))
				{
					log.info("Invalid SWIFT BIC VALUE provided");
				}
				else
				{
					log.info(elementUtil.getText(errorMessages));
				}//end of else
			} catch (NoSuchElementException e2) {
				log.info("Test Data Provided For Group-->Modify Operation Is Not Invalid");
			}//end of 

		}//end of if
		else
		{
			recordMatchFlag=false;
			elementUtil.clickElement(nextBtn);
			elementUtil.SHORT_TIMEOUT();
		}

		return recordMatchFlag;

	}//end of function modifyInvalidData

	//Method to remove Group Record
	public boolean removeRecord(String groupName) throws InterruptedException, InvalidFormatException, IOException  {

		boolean recordMatchFlag=false;
		if(elementUtil.getText(groupNameScreen).trim().toString().equals(groupName))
		{
			recordMatchFlag=true;
			//click on Remove button
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnRemove);


			try {
				if(elementUtil.getText(errorMessages).contains("Group cannot be deleted\r\n" + "Found users belonging to Group TESTER A\r\n" + "Operation Remove group failed to execute."))
				{
					log.info("Group Cannot Be Deleted As Users Are Mapped To the Group");
				}//end of if
			} catch (NoSuchElementException e) {
				log.info(elementUtil.getText(messages));
			}//end of catch

		}//end of if
		else
		{
			recordMatchFlag=false;
			System.out.println("in else");
			elementUtil.clickElement(nextButton);
			elementUtil.SHORT_TIMEOUT();
		}
		return recordMatchFlag;
	}//end of removeGroupRecord function

	//--------To Block Group----------//
	public boolean blockRecord(String groupName) throws InterruptedException, InvalidFormatException, IOException  {

		boolean recordMatchFlag=false;
		if(elementUtil.getText(groupNameScreen).trim().toString().equals(groupName))
		{
			recordMatchFlag=true;
			//click on block button
			elementUtil.clickElement(blockBtn);

			try {
				if(elementUtil.getText(errorMessages).equals("Operation Block group failed to execute."))
				{
					log.info("Operation Block group failed to execute for Record with Group Name : " +groupName);
				}
			} catch (NoSuchElementException e) {
				log.info(elementUtil.getText(messages));
			}

		}//end of if
		else
		{
			recordMatchFlag=false;
			elementUtil.clickElement(nextButton);
			elementUtil.SHORT_TIMEOUT();
		}//end of else
		return recordMatchFlag;

	}//end of blockRecord function

	//--------To UnBlock Group----------//
	public boolean unblockRecord(String groupName) throws InterruptedException, InvalidFormatException, IOException  {

		boolean recordMatchFlag=false;
		if(elementUtil.getText(groupNameScreen).trim().toString().equals(groupName))
		{
			recordMatchFlag=true;
			//click on UnBlock button
			elementUtil.clickElement(unblockBtn);

			try {
				if(elementUtil.getText(errorMessages).equals("Operation UnBlock group failed to execute."))
				{
					log.info("Operation UnBlock group failed to execute for Record with Group Name : " +groupName);
				}
			} catch (NoSuchElementException e) {
				log.info(elementUtil.getText(messages));
			}//end of catch

		}//end of if
		else
		{
			recordMatchFlag=false;
			elementUtil.clickElement(nextButton);
			elementUtil.SHORT_TIMEOUT();
		}//end of else

		return recordMatchFlag;

	}//end of unblockRecord function

	//--------To Approve Group----------//
	public boolean approveRecord(String groupName, String Operation) throws InterruptedException, InvalidFormatException, IOException  {

		boolean recordMatchFlag=false;
		//If operation From Test Sheet=Approve perform following

		if(elementUtil.getText(groupNameScreen).trim().toString().equals(groupName))
		{
			recordMatchFlag=true;

			switch (Operation) {
			case "Approve"://If operation is Approve 
							elementUtil.clickElement(btnApprove);
							log.info(elementUtil.getText(messages));
							break;
			
			case "Reject"://If operation is Reject
							elementUtil.clickElement(rejectButton);
							log.info(elementUtil.getText(messages));
							break;
							

			default://default case
							log.info("No Operation Performed On Record With Group Name : " +groupName);
							break;
			}//end of switch
			
		}//end of if
		else
		{
			recordMatchFlag=false;
			elementUtil.clickElement(nextButton);
			elementUtil.SHORT_TIMEOUT();
		}//end of else
		return recordMatchFlag;
	}//end of approveGroupRecord function

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

