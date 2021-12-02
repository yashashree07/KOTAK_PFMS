package COM.KOTAKPFMS.QA.PAGES;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	ElementUtil elementUtil;
	FileReadUtils fileReader;
	HomePage homePage;
	private WebDriver driver;
	Logger log = Logger.getLogger(GroupPage.class);

	// User Page Xpaths
	@FindBy(name = "groupName")
	WebElement groupNameDropdown;

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

	@FindBy(xpath="//tr[@class='rowcoloreven']//td[8]")
	WebElement screenRecord;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement modifyScreenRecord;

	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement removeScreenRecord;

	// Cancel Error Msg Xpath
	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement cancelErrorMsg;

	// Text fields Error Msg Xpath
	@FindBy(xpath = "//td[@id='inf_username']")
	WebElement userNameErrorMsg;

	@FindBy(xpath = "//td[@id='inf_fullName']")
	WebElement fullNameErrorMsg;

	@FindBy(xpath = "//td[@id='inf_profileId']")
	WebElement profileErrorMsg;

	@FindBy(xpath = "//a[@class='restartInHeader']")
	WebElement btnRestartWorkFLow;

	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement userOk;

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

	@FindBy(xpath="//body[1]/div[4]/center[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]")
	WebElement approveScreenUserNameTxt;

	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]")
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


	// Group Class Constructor
	public GroupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.homePage = new HomePage(driver);
		this.elementUtil = new ElementUtil(driver);
		this.fileReader = new FileReadUtils(driver);

	}//end


}
