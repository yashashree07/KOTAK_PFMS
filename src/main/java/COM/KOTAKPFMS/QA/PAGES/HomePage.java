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
	@FindBy(xpath = "//*[@id=\"1l2l2\"]/a")
	WebElement userMenu;

	@FindBy(xpath = "//*[@id=\"1l2l2l1\"]/a")
	WebElement userView;

	@FindBy(xpath = "//*[@id=\"1l2l2l2\"]/a")
	WebElement userAdd;

	@FindBy(xpath = "//*[@id=\"1l2l2l3\"]/a")
	WebElement userModify;

	@FindBy(xpath = "//*[@id=\"1l2l2l4\"]/a")
	WebElement userApprove;

	@FindBy(xpath = "//*[@id=\"1l2l2l5\"]/a")
	WebElement userBlock;

	@FindBy(xpath = "//*[@id=\"1l2l2l6\"]/a")
	WebElement userRemove;

	// WebElements for Group Menu
	@FindBy(xpath = "//a[contains(text(),'Group')]")
	WebElement groupMenu;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement groupList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement groupAdd;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement groupModify;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement groupApprove;

	@FindBy(xpath = "//a[contains(text(),'Block')]")
	WebElement groupBlock;

	@FindBy(xpath = "//a[contains(text(),'Unblock')]")
	WebElement groupUnblock;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement groupRemove;

	// WebElements for Profile Menu
	@FindBy(xpath = "//*[@id=\"1l2l4\"]/a")
	WebElement profileMenu;

	@FindBy(xpath = "//*[@id=\"1l2l4l1\"]/a")
	WebElement profileList;

	@FindBy(xpath = "//*[@id=\"1l2l4l2\"]/a")
	WebElement profileAdd;

	@FindBy(xpath = "//*[@id=\"1l2l4l3\"]/a")
	WebElement profileModify;

	@FindBy(xpath = "//*[@id=\"1l2l4l4\"]/a")
	WebElement profileApprove;

	@FindBy(xpath = "//*[@id=\"1l2l4l5\"]/a")
	WebElement profileRemove;

	//HomePage Webelements

	@FindBy(xpath="//span[@class='glyphicon glyphicon-log-out']")
	WebElement mainPageLogOutButton;

	@FindBy(id="content")
	WebElement mainFrame;

	@FindBy(xpath="//button[@type='button'][normalize-space()='OK']")
	WebElement mainPageLogoutOkBtn;

	// HomePage Class Constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.elementUtil = new ElementUtil(driver);
	}//end

	// ------------Method to reach to Environment Run Link------------//
	/*public EnvironmentPage clickonEnvironmentRunLink() throws InterruptedException {
		elementUtil.clickElement(environmentLink);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(environmentRunLink);
		elementUtil.handlewin(driver);
		return new EnvironmentPage(driver);
	}
	 */


	// ----------------------User Menu Methods--------------------------------//

	// ------------Method to reach to User Add Link---------------//
	public UserPage UserAddMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userAdd);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new UserPage(driver);
	}//end of clickonUserAddLink function

	// ----------Method to reach to User Approve Link--------//
	public UserPage UserApproveMenu() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userApprove);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new UserPage(driver);
	}

	// ----------Method to reach to User View Link--------//
	public UserPage UserListMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userView);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new UserPage(driver);
	}

	// ----------Method to reach to User Remove Link--------//
	public UserPage UserRemoveMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userRemove);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new UserPage(driver);
	}

	// ----------Method to reach to User Modify Link--------//
	public UserPage UserModifyMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userModify);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new UserPage(driver);
	}

	// ----------Method to reach to User Block/Unblock Link--------//
	public UserPage UserBlockUnBlockMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(userBlock);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		elementUtil.SHORT_TIMEOUT();
		return new UserPage(driver);
	}//end of UserBlockUnBlockMenufunction

	// ----------------------Profile Menu Methods--------------------------------//

	// ----------Method to reach to Profile Add Link--------//
	public ProfilePage ProfileAddMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileAdd);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile Approve Link--------//
	public ProfilePage ProfileApproveMenu() throws InterruptedException {
		elementUtil.GoToFrame("toc");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileApprove);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile Modify Link--------//
	public ProfilePage ProfileModifyMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileModify);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile Remove Link--------//
	public ProfilePage ProfileRemoveMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileRemove);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------Method to reach to Profile List Link--------//
	public ProfilePage ProfileListMenu() throws InterruptedException {
		elementUtil.clickElement(administrationMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileMenu);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(profileList);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.handlewin(driver);
		return new ProfilePage(driver);
	}

	// ----------------------Group Menu Methods--------------------------------//

	// ----------Method to reach to Group Add Link--------//
	/*public GroupPage clickonAddGroupLink() throws InterruptedException {
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
	}*/

	// ----------Method to reach to DB Load Link--------//
	/*public DBLoadPage clickonStaticDataDBLoadsLink() throws InterruptedException {
		elementUtil.clickElement(applicationLink);
		elementUtil.clickElement(maintenanceLink);
		elementUtil.clickElement(staticDataLink);
		elementUtil.clickElement(dbloadsLink);
		elementUtil.handlewin(driver);
		return new DBLoadPage(driver);
	}*/

	// ----------------------IFSC Code Menu
	// Methods--------------------------------//

	// ----------Method to reach to IFSC Code List Link--------//
	/*public IFSC_CODEPage clickonStaticDataIFSCCODEListLink() throws InterruptedException {
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
	}*/





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

	//-------------------------Method For Logout Operation----------------------------------
	//Method to perform logout operation
	public void LogOut() throws InterruptedException {
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
	}//end of LogOut function


}
