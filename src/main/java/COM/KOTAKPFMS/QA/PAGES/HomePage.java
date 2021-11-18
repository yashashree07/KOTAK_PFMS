package COM.KOTAKPFMS.QA.PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import COM.KOTAKPFMS.QA.UTIL.ElementUtil;

/**
 * @Author -- Suvarna Prabhumatkari
 **/

public class HomePage {
	private WebDriver driver;
	ElementUtil elementUtil;

	// WebElements for Environment Menu
	@FindBy(xpath = "//a[contains(text(),'Environment')]")
	WebElement environmentLink;

	@FindBy(xpath = "//a[contains(text(),'Run')]")
	WebElement environmentRunLink;

	// WebElements for Application Menu
	@FindBy(xpath = "//a[normalize-space()='Application']")
	WebElement applicationLink;

	// WebElements for Mandate Management Menu
	@FindBy(xpath = "//a[normalize-space()='Mandate Management']")
	WebElement mandateManagementLink;

	@FindBy(xpath = "//a[contains(text(),'Sponsor Mandate')]")
	WebElement sponsorMandateLink;

	// WebElements for Sponsor Mandate Menu
	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[18]/td[6]/a")
	WebElement approveMandateLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[17]/td[6]/a")
	WebElement listMandateLink;

	// WebElements for File Manager Menu
	@FindBy(xpath = "//a[normalize-space()='File Manager']")
	WebElement fileManagerLink;

	@FindBy(xpath = "//a[normalize-space()='List']")
	WebElement fileManagerListLink;

	// WebElements for Sponsor Module Menu
	@FindBy(xpath = "//a[normalize-space()='Sponsor Module']")
	WebElement sponsorModuleLink;

	@FindBy(xpath = "//a[normalize-space()='Upload']")
	WebElement sponsorModule_UploadLink;

	@FindBy(xpath = "//a[normalize-space()='Create ACH File']")
	WebElement sponsorModule_CreateACHFileLink;

	@FindBy(xpath = "//a[normalize-space()='Approve Possible Reject']")
	WebElement sponsorModule_ApprovePossibleRejectLink;

	// WebElements for Maintenance Menu
	@FindBy(xpath = "//a[normalize-space()='Maintenance']")
	WebElement maintenanceLink;

	@FindBy(xpath = "//a[contains(text(),'DB')]")
	WebElement dbLink;

	@FindBy(xpath = "//a[contains(text(),'DB Loads')]")
	WebElement dbloadsLink;

	@FindBy(xpath = "//a[contains(text(),'Schedule')]")
	WebElement scheduleLink;

	@FindBy(xpath = "//a[contains(text(),'Control')]")
	WebElement scheduleControlLink;

	@FindBy(xpath = "//a[contains(text(),'New')]")
	WebElement scheduleNewLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement scheduleListLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement scheduleModifyLink;

	// WebElements for Currency Menu
	@FindBy(xpath = "//a[contains(text(),'Currency')]")
	WebElement currencyLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement currencyAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement currencyApproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement currencyListLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement currencyDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement currencyModifyLink;

	// WebElements for Calendar Menu
	@FindBy(xpath = "//a[normalize-space()='Calendar']")
	WebElement calendarLink;

	@FindBy(xpath = "//a[normalize-space()='Create']")
	WebElement calendarCreateLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement calendarApproveLink;

	@FindBy(xpath = "//a[normalize-space()='View']")
	WebElement calendarViewLink;

	@FindBy(xpath = "//a[normalize-space()='Modify/Repair']")
	WebElement calendarModifyLink;

	// WebElements for Logout function
	@FindBy(xpath = "//*[@id=\"frmLogout\"]/button")
	WebElement logoutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/div[3]/div[3]/div/button[2]")
	WebElement logoutOKBtn;

	@FindBy(xpath = "//a[normalize-space()='IFSCCODE']")
	WebElement ifscCodeLink;

	@FindBy(xpath = "//a[normalize-space()='List']")
	WebElement ifscCodeListLink;

	@FindBy(xpath = "//a[normalize-space()='Add']")
	WebElement ifscCodeAddLink;

	@FindBy(xpath = "//a[normalize-space()='Approve']")
	WebElement ifscCodeApproveLink;

	@FindBy(xpath = "//a[normalize-space()='Modify']")
	WebElement ifscCodeModifyLink;

	@FindBy(xpath = "//a[normalize-space()='Delete']")
	WebElement ifscCodeDeleteLink;

	@FindBy(xpath = "//a[normalize-space()='Confirm Delete']")
	WebElement ifscCodeConfirmDeleteLink;

	// WebElements for Administration Menu
	@FindBy(xpath = "//a[normalize-space()='Administration']")
	WebElement administrationMenu;

	// WebElements for User Menu
	@FindBy(xpath = "//a[contains(text(),'User')]")
	WebElement userMenu;

	@FindBy(xpath = "//a[contains(text(),'View')]")
	WebElement userView;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement userAdd;

	@FindBy(name = "groupName")
	WebElement groupNameDropdown;

	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement userOk;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement userModify;

	@FindBy(name = "userName")
	WebElement modifyUserNameTxtField;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement okBtn;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement userApprove;

	@FindBy(xpath = "//a[contains(text(),'Block')]")
	WebElement userBlock;

	@FindBy(xpath = "//input[@name='userName']")
	WebElement blockUserNameTxtField;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement userRemove;

	@FindBy(xpath = "//input[@name='userName']")
	WebElement removeUserNameTextField;

	// WebElements for Group Menu
	@FindBy(xpath = "//a[contains(text(),'Group')]")
	WebElement groupMenu;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement groupList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement groupAdd;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement groupModify;

	@FindBy(name = "groupName")
	WebElement grpModifyTextField;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnModifyOk;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement groupApprove;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement groupOk;

	@FindBy(xpath = "//a[contains(text(),'Block')]")
	WebElement groupBlock;

	@FindBy(xpath = "//a[contains(text(),'Unblock')]")
	WebElement groupUnblock;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement groupRemove;

	@FindBy(name = "groupName")
	WebElement groupTextfield;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnGroupOk;

	// WebElements for Profile Menu
	@FindBy(xpath = "//a[normalize-space()='Profiles']")
	WebElement profileMenu;

	@FindBy(xpath = "//a[normalize-space()='List']")
	WebElement profileList;

	@FindBy(xpath = "//a[normalize-space()='Add']")
	WebElement profileAdd;

	@FindBy(xpath = "//a[normalize-space()='Modify/Repair']")
	WebElement profileModify;

	@FindBy(xpath = "//a[normalize-space()='Approve']")
	WebElement profileApprove;

	@FindBy(xpath = "//a[normalize-space()='Remove']")
	WebElement profileRemove;

	@FindBy(name = "profileName")
	WebElement textFieldProfileName;

	@FindBy(xpath = "//input[@value=\"OK\"]")
	WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement approvePageBtnOk;

	@FindBy(xpath = "//input[@type=\"reset\"]")
	WebElement approvePageBtnReset;

	@FindBy(name = "profileName")
	WebElement textfieldRemoveProfile;

	// ---------------Corporate CMS Menu-----------//
	@FindBy(xpath = "//a[contains(text(),'Corporate CMS')]")
	WebElement corporateCMSlink;

	@FindBy(xpath = "//a[contains(text(),'Industry Type')]")
	WebElement industryTypeLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement industryTypeaddLink;

	@FindBy(xpath = "//a[.='Approve']")
	WebElement industryTypeapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement industryTypelistLink;

	@FindBy(xpath = "//a[contains(.,'Modify')]")
	WebElement industryTypeModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Business Group')]")
	WebElement businessGroupLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement businessGroupaddLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement businessGroupModify;

	@FindBy(xpath = "//a[normalize-space()='Delete']")
	WebElement businessGroupDelete;

	@FindBy(xpath = "//a[normalize-space()='Confirm Delete']")
	WebElement businessConfirmDelete;

	// Xpath of Ok button of Add Page of BusinessGroup
	@FindBy(xpath = "//input[contains(@value,'OK')]")
	WebElement buinessGroupOkBtn;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement businessGroupapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement businessGrouplistLink;

	@FindBy(xpath = "//a[contains(text(),'Accounting')]")
	WebElement accountingLink;
	
	@FindBy(xpath="//a[contains(text(),'Modify')]")
	WebElement accountingModifyLink;
	
	@FindBy(xpath="//a[contains(@title,'Delete')]")
	WebElement accountingDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement accountingaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement accountingapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement accountingviewLink;

	// -------- Miscellaneous Menu Xpath----------
	@FindBy(xpath = "//a[contains(.,'Miscellaneous')]")
	WebElement miscellaneousLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement miscellaneousAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement miscellaneousApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement miscellaneousModifyLink;

	@FindBy(xpath = "//a[contains(@title,'Delete')]")
	WebElement miscellaneousDeleteLink;

	@FindBy(xpath = "//a[contains(.,'Confirm Delete')]")
	WebElement miscellaneousConfirmDeleteLink;

	/*
	 * @FindBy(xpath="//a[.='Approve']") WebElement miscellaneousApprove;
	 */

	// --------Customer Menu Xpath-----------//
	@FindBy(xpath = "//a[contains(text(),'Customer')]")
	WebElement customerLink;
	
	@FindBy(xpath="//a[contains(text(),'Confirm Delete')]")
	WebElement customerConfirmDeleteLink;
	
	@FindBy(xpath="//a[contains(text(),'Modify')]")
	WebElement customerModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement customerAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement customerApproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement customerListLink;

	@FindBy(xpath = "//a[contains(text(),'Static Data')]")
	WebElement staticDataLink;

	@FindBy(xpath = "//a[contains(text(),'DB Loads')]")
	WebElement dbLoadsLink;

	@FindBy(name = "ack")
	WebElement ackBtn;

	// HomePage Class Constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.elementUtil = new ElementUtil(driver);
	}

	// ----------------------Sponsor Module Menu
	// Methods--------------------------------//

	// --------Method to reach to Sponsor Module Upload Link----------//
	public SponsorModulePage clickonSponsorModule_UploadLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(fileManagerLink);
		elementUtil.clickElement(sponsorModuleLink);
		elementUtil.clickElement(sponsorModule_UploadLink);
		elementUtil.handlewin(driver);
		return new SponsorModulePage(driver);
	}

	// --------Method to reach to Sponsor Module Create ACH File Link-----------//
	public SponsorModulePage clickonSponsorModule_CreateACHFileLink() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(fileManagerLink);
		elementUtil.clickElement(sponsorModuleLink);
		elementUtil.clickElement(sponsorModule_CreateACHFileLink);
		elementUtil.handlewin(driver);
		return new SponsorModulePage(driver);
	}

	// ----------Method to reach to Sponsor Module Approve Possible Reject
	// Link------//
	public SponsorModulePage clickonSponsorModule_ApprovePossibleRejectLink() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(fileManagerLink);
		elementUtil.clickElement(sponsorModuleLink);
		elementUtil.clickElement(sponsorModule_ApprovePossibleRejectLink);
		elementUtil.handlewin(driver);
		return new SponsorModulePage(driver);
	}

	// -----------Method to reach to File Manager List Link------//
	public FileManagerPage clickonFileManager_ListLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(fileManagerLink);
		elementUtil.clickElement(fileManagerListLink);
		elementUtil.handlewin(driver);
		return new FileManagerPage(driver);
	}

	// ------------Method to reach to Environment Run Link------------//
	public EnvironmentPage clickonEnvironmentRunLink() throws InterruptedException {
		elementUtil.clickElement(environmentLink);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(environmentRunLink);
		elementUtil.handlewin(driver);
		return new EnvironmentPage(driver);
	}

	// --------Logout function----------//
	public void LogOut() throws InterruptedException {
		elementUtil.clickElement(logoutBtn);
		elementUtil.clickElement(logoutOKBtn);
		elementUtil.quitBrowser();
	}

	// ----------------------User Menu Methods--------------------------------//

	// ------------Method to reach to User Add Link---------------//
	public UserPage clickonUserAddLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(userMenu);
		elementUtil.clickElement(userAdd);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new UserPage(driver);
	}

	// ----------Method to reach to User Approve Link--------//
	public UserPage clickonUserApproveLink() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(userMenu);
		elementUtil.clickElement(userApprove);
		elementUtil.handlewin(driver);
		return new UserPage(driver);
	}

	// ----------Method to reach to User View Link--------//
	public UserPage clickonUserViewLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(userMenu);
		elementUtil.clickElement(userView);
		elementUtil.handlewin(driver);
		return new UserPage(driver);
	}

	// ----------Method to reach to User Remove Link--------//
	public UserPage clickonUserRemoveLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(userMenu);
		elementUtil.clickElement(userRemove);
		elementUtil.handlewin(driver);
		return new UserPage(driver);
	}

	// ----------Method to reach to User Modify Link--------//
	public UserPage clickonUserModifyLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(userMenu);
		elementUtil.clickElement(userModify);
		elementUtil.handlewin(driver);
		return new UserPage(driver);
	}

	// ----------Method to reach to User Block/Unblock Link--------//
	public UserPage clickonUserBlockUnBlockLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(userMenu);
		elementUtil.clickElement(userBlock);
		elementUtil.handlewin(driver);
		return new UserPage(driver);
	}

	// ----------------------Calendar Menu Methods--------------------------------//

	// --------Method to reach to Calendar Create Link---------//
	public CalendarPage clickonCalendarCreateLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(calendarLink);
		elementUtil.clickElement(calendarCreateLink);
		elementUtil.handlewin(driver);
		return new CalendarPage(driver);
	}

	// ----------Method to reach to Calendar Approve Link---------//
	public CalendarPage clickonCalendarApproveLink() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(calendarLink);
		elementUtil.clickElement(calendarApproveLink);
		elementUtil.handlewin(driver);
		return new CalendarPage(driver);
	}

	// ----------Method to reach to Calendar View Link--------//
	public CalendarPage clickonCalendarViewLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(calendarLink);
		elementUtil.clickElement(calendarViewLink);
		elementUtil.handlewin(driver);
		return new CalendarPage(driver);
	}

	// ----------Method to reach to Calendar Modify Link--------//
	public CalendarPage clickonCalendarModifyLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(calendarLink);
		elementUtil.clickElement(calendarModifyLink);
		elementUtil.handlewin(driver);
		return new CalendarPage(driver);
	}

	// ----------------------Profile Menu Methods--------------------------------//

	// ----------Method to reach to Profile Add Link--------//
	public ProfilePage clickonProfileAddLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(profileMenu);
		elementUtil.clickElement(profileAdd);
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile Approve Link--------//
	public ProfilePage clickonProfileApproveLink() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(profileMenu);
		elementUtil.clickElement(profileApprove);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile Modify Link--------//
	public ProfilePage clickonProfileModifyLink(String profilename) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(profileMenu);
		elementUtil.clickElement(profileModify);
		elementUtil.handlewin(driver);
		elementUtil.enterText(textFieldProfileName, profilename);
		elementUtil.clickElement(btnOk);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile Remove Link--------//
	public ProfilePage clickonProfileRemoveLink(String profilename) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(profileMenu);
		elementUtil.clickElement(profileRemove);
		elementUtil.handlewin(driver);
		elementUtil.enterText(textfieldRemoveProfile, profilename);
		elementUtil.clickElement(btnOk);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile List Link--------//
	public ProfilePage clickonProfileListLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(profileMenu);
		elementUtil.clickElement(profileList);
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------------------Group Menu Methods--------------------------------//

	// ----------Method to reach to Group Add Link--------//
	public GroupPage clickonAddGroupLink() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupAdd);
		elementUtil.handlewin(driver);
		return new GroupPage(driver);
	}

	// ----------Method to reach to Group Approve Link--------//
	public GroupPage clickonApproveGroupLink() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupApprove);
		elementUtil.handlewin(driver);
		elementUtil.clickElement(groupOk);
		return new GroupPage(driver);
	}

	// ----------Method to reach to Group Modify Link--------//
	public GroupPage clickonModifyGroupLink(String name) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupModify);
		elementUtil.handlewin(driver);
		elementUtil.enterText(grpModifyTextField, name);
		elementUtil.clickElement(btnModifyOk);
		return new GroupPage(driver);
	}

	// ----------Method to reach to Group Remove Link--------//
	public GroupPage clickonRemoveGroupLink(String name) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupRemove);
		elementUtil.handlewin(driver);
		elementUtil.enterText(groupTextfield, name);
		elementUtil.clickElement(btnGroupOk);
		return new GroupPage(driver);
	}

	// ----------Method to reach to Group List Link--------//
	public GroupPage clickonListGroupLink(String name, String WithStatus) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupList);
		elementUtil.handlewin(driver);
		return new GroupPage(driver);
	}

	// ----------Method to reach to Group Block Link--------//
	public GroupPage clickonBlockGroupLink(String name) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupBlock);
		elementUtil.handlewin(driver);
		return new GroupPage(driver);
	}

	// ----------Method to reach to Group Unblock Link--------//
	public GroupPage clickonUnblockGroupLink(String name) throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.clickElement(groupMenu);
		elementUtil.clickElement(groupUnblock);
		elementUtil.handlewin(driver);
		return new GroupPage(driver);
	}

	// ----------Method to reach to DB Load Link--------//
	public DBLoadPage clickonStaticDataDBLoadsLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(dbloadsLink);
		elementUtil.handlewin(driver);
		return new DBLoadPage(driver);
	}

	// ----------------------IFSC Code Menu
	// Methods--------------------------------//

	// ----------Method to reach to IFSC Code List Link--------//
	public IFSC_CODEPage clickonStaticDataIFSCCODEListLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(ifscCodeLink);
		elementUtil.clickElement(ifscCodeListLink);
		elementUtil.handlewin(driver);
		return new IFSC_CODEPage(driver);
	}

	// ----------Method to reach to IFSC Code Add Link--------//
	public IFSC_CODEPage clickonStaticDataIFSCCODEAddLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(ifscCodeLink);
		elementUtil.clickElement(ifscCodeAddLink);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new IFSC_CODEPage(driver);
	}

	// ----------Method to reach to IFSC Code Approve Link--------//
	public IFSC_CODEPage clickonStaticDataIFSCCODEApproveLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(ifscCodeLink);
		elementUtil.clickElement(ifscCodeApproveLink);
		elementUtil.handlewin(driver);
		return new IFSC_CODEPage(driver);
	}

	// ----------Method to reach to IFSC Code Modify Link--------//
	public IFSC_CODEPage clickonStaticDataIFSCCODEModifyLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(ifscCodeLink);
		elementUtil.clickElement(ifscCodeModifyLink);
		elementUtil.handlewin(driver);
		return new IFSC_CODEPage(driver);
	}

	// ----------Method to reach to IFSC Code Delete Link--------//
	public IFSC_CODEPage clickonStaticDataIFSCCODEDeleteLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(ifscCodeLink);
		elementUtil.clickElement(ifscCodeDeleteLink);
		elementUtil.handlewin(driver);
		return new IFSC_CODEPage(driver);
	}

	// ----------Method to reach to IFSC Code Confirm Delete Link--------//
	public IFSC_CODEPage clickonStaticDataIFSCCODEConfirmDeleteLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(ifscCodeLink);
		elementUtil.clickElement(ifscCodeConfirmDeleteLink);
		elementUtil.handlewin(driver);
		return new IFSC_CODEPage(driver);
	}
	
	// ---------Corporate Page Industry Type Method---------------------
	public CorporatePage addIndustryType() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(industryTypeLink);
		elementUtil.clickElement(industryTypeaddLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new CorporatePage(driver);
	}

	public CorporatePage approveIndustryType() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(industryTypeLink);
		elementUtil.clickElement(industryTypeapproveLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new CorporatePage(driver);
	}

	public CorporatePage modifyIndustryType() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(industryTypeLink);
		elementUtil.clickElement(industryTypeModifyLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new CorporatePage(driver);
	}

	// Corporate Page Miscellaneous Menu Methods----------------------
	public CorporatePage addMiscellaneous() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(miscellaneousLink);
		elementUtil.clickElement(miscellaneousAddLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new CorporatePage(driver);
	}

	public CorporatePage approveMiscellaneous() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(miscellaneousLink);
		elementUtil.clickElement(miscellaneousApproveLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new CorporatePage(driver);
	}

	// -----------Close Ack Window-----------//
	public void closeackwindow() {
		if (ackBtn.isEnabled()) {
			elementUtil.clickElement(ackBtn);
			System.out.println("Ack Window closed");
		}
	}

	// -------------Sponsor Mandate------------//
	// ------------Upload Mandate File---------------//
	public SponsorMandatePage clickonSponsorModuleUploadLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(fileManagerLink);
		elementUtil.clickElement(sponsorModuleLink);
		elementUtil.clickElement(sponsorModule_UploadLink);
		elementUtil.handlewin(driver);
		return new SponsorMandatePage(driver);
	}

	// -------------Approve Mandate--------------//
	public SponsorMandatePage clickonSponsorMandateApproveMandate() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(mandateManagementLink);
		elementUtil.clickElement(sponsorMandateLink);
		elementUtil.clickElement(approveMandateLink);
		elementUtil.handlewin(driver);
		return new SponsorMandatePage(driver);
	}

	// -------------List Mandate--------------//
	public SponsorMandatePage clickonSponsorMandateListMandate() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(mandateManagementLink);
		elementUtil.clickElement(sponsorMandateLink);
		elementUtil.clickElement(listMandateLink);
		elementUtil.handlewin(driver);
		return new SponsorMandatePage(driver);
	}

	// ------------------------------ACCOUNTING MENU
	// METHODS-------------------------------------------
	// Method to navigate to Accounting->Add Menu
	public CorporatePage accountingAddMenu() throws InterruptedException {

		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(accountingLink);
		elementUtil.clickElement(accountingaddLink);

		elementUtil.handlewin(driver);

		elementUtil.SHORT_TIMEOUT();

		return new CorporatePage(driver);
	}// end of accountingAddMenu function

	// Method to navigate to Accounting->Modify Menu
	public CorporatePage accountingModifyMenu() throws InterruptedException {

		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(accountingLink);
		elementUtil.clickElement(accountingModifyLink);

		elementUtil.handlewin(driver);

		elementUtil.SHORT_TIMEOUT();

		return new CorporatePage(driver);
	}// end of accountingModifyMenu function

	// Method to navigate to Accounting->Delete Menu
	public CorporatePage accountingDeleteMenu() throws InterruptedException {

		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(accountingLink);
		elementUtil.clickElement(accountingDeleteLink);

		elementUtil.handlewin(driver);

		elementUtil.SHORT_TIMEOUT();

		return new CorporatePage(driver);
	}// end of accountingDeleteMenu function

	// Method to navigate to Accounting->ConfirmDelete Menu
	public CorporatePage accountingConfirmDeleteMenu() throws InterruptedException {

		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(accountingLink);
		elementUtil.clickElement(accountingConfirmDeleteLink);

		elementUtil.handlewin(driver);

		elementUtil.SHORT_TIMEOUT();

		return new CorporatePage(driver);
	}// end of accountingConfirmDeleteMenu function

	// Method to navigate to Accounting->Approve Menu
	public CorporatePage accountingApproveMenu() throws InterruptedException {

		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(accountingLink);
		elementUtil.clickElement(accountingapproveLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();

		return new CorporatePage(driver);
	}// end of accountingApprove function

	// Method to navigate to Accounting->List Menu
	public CorporatePage accountingListMenu() throws InterruptedException {

		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(corporateCMSlink);
		elementUtil.clickElement(accountingLink);
		elementUtil.clickElement(accountingviewLink);
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();

		return new CorporatePage(driver);
	}// end of accountingList function
	
	//--------- Corporate Page  Business Group Method-------------------------

		//Method to navigate to Business Group->Add Menu
		public CorporatePage createBusinessGroup() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(businessGroupLink);
			elementUtil.clickElement(businessGroupaddLink);
			elementUtil.handlewin(driver);
			elementUtil.SHORT_TIMEOUT();
			//    elementUtil.clickElement(buinessGroupOkBtn);
			return new CorporatePage(driver);
		}//end of createBusinessGroup function

		//Method to navigate to Business Group->Modify
		public CorporatePage modifyBusinessGroup() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(businessGroupLink);
			elementUtil.clickElement(businessGroupModify);
			elementUtil.handlewin(driver);

			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of modifyBusinessGroup function

		//Method to navigate to Business Group->Approve 
		public CorporatePage approveBusinessGroup() throws InterruptedException {

			elementUtil.GoToFrame("toc");
			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(businessGroupLink);
			elementUtil.clickElement(businessGroupapproveLink);
			elementUtil.handlewin(driver);

			return new CorporatePage(driver);
		}//end of approveBusinessGroup function

		//Method to navigate to Business Group->Delete
		public CorporatePage deleteBusinessGroup() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(businessGroupLink);
			elementUtil.clickElement(businessGroupDelete);
			elementUtil.handlewin(driver);

			return new CorporatePage(driver);
		}//end of deleteBusinessGroup function

		//Method to navigate to Business Group->Confirm Delete
		public CorporatePage confirmDeleteBusinessGroup() throws InterruptedException {

			elementUtil.GoToFrame("toc");
			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(businessGroupLink);
			elementUtil.clickElement(businessConfirmDelete);
			elementUtil.handlewin(driver);

			return new CorporatePage(driver);
		}//end of confirmDeleteBusinessGroup function

		//Method to navigate to Business Group->List
		public CorporatePage listBusinessGroup() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(businessGroupLink);
			elementUtil.clickElement(businessGrouplistLink);
			elementUtil.handlewin(driver);

			return new CorporatePage(driver);
		}//end of listBusinessGroup function
		
		//---------------------------CORPORATE PAGE->CUSTOMER MENU METHODS-------------------------------------------
		//Method to navigate to Customer->Add Menu
		public CorporatePage customerAddMenu() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customerAddLink);

			elementUtil.handlewin(driver);

			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerAddMenu function

		//Method to navigate to Customer->Approve Menu
		public CorporatePage customerApproveMenu() throws InterruptedException {

			elementUtil.GoToFrame("toc");
			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customerApproveLink);

			elementUtil.handlewin(driver);

			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerApproveMenu function

		//Method to navigate to Customer->Modify Menu
		public CorporatePage customerrModifyMenu() throws InterruptedException {
			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customerModifyLink);

			elementUtil.handlewin(driver);

			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerrModifyMenu function

		//Method to navigate to Customer->Delete Menu
		public CorporatePage customerDeleteMenu() throws InterruptedException {
			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customerDeleteLink);

			elementUtil.handlewin(driver);

			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerDeleteMenu function

		//Method to navigate to Customer->Confirm Delete Menu
		public CorporatePage customerconfirmDeleteMenu() throws InterruptedException {
			elementUtil.GoToFrame("toc");
			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customerConfirmDeleteLink);
			elementUtil.handlewin(driver);
			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerconfirmDeleteMenu function

		//Method to navigate to Customer->List Menu
		public CorporatePage customerListMenu() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customerListLink);
			elementUtil.handlewin(driver);
			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerListMenu function

		//Method to navigate to Customer->Scheme/FormatCode Mapping Menu
		public CorporatePage customerSchemeFormatCodeMappingMenu() throws InterruptedException {

			elementUtil.clickElement(applicationLink);
			elementUtil.clickElement(maintenanceLink);
			elementUtil.clickElement(corporateCMSlink);
			elementUtil.clickElement(customerLink);
			elementUtil.clickElement(customer_SchemeFormatCdMappingLink);

			elementUtil.handlewin(driver);

			elementUtil.SHORT_TIMEOUT();

			return new CorporatePage(driver);
		}//end of customerSchemeFormatCodeMappingMenu function


	// -----------------Methods to close menus------------------------//

	public HomePage closeAdministrationMenu() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(administrationMenu);
		return new HomePage(driver);
	}

	public HomePage closeEnvironmentMenu() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(environmentLink);
		return new HomePage(driver);
	}

	public HomePage closeApplicationMenu() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.clickElement(applicationLink);
		return new HomePage(driver);
	}

}
