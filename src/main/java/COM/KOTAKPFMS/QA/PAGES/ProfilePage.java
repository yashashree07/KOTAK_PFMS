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

	@FindBy(xpath="//*[@id=\"table-reveal\"]/tbody/tr/td/table/tbody/tr[2]/td[2]")
	WebElement ProfileNameValue;
	
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
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@PasswordChangeStart']")
	WebElement passwordCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@LogOut']")
	WebElement logoutCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@main/user/AdminReportAction?method=initiateChangeReport']")
	WebElement administrativeChangGenerateChkBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@ProfileChangeReportFilter?method=filter']")
	WebElement administrativeChangeListChkBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@main/user/loggedInUsers/UseSessionLis']")
	WebElement activeUsersListChkBox;

	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@main/user/loggedInUsers/UseInvalidateSessionLis']")
	WebElement activeUsersForceLogoutChkBox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@LogDBView']")
	WebElement logViewCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@main/user/AdminReportAction?method=initiateInactivityReport']")
	WebElement inactivityReportChkBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@main/user/AdminReportAction?method=initiateSecurityIncidentReport']")
	WebElement securityIncidentReportChkBox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/UseLis']")
	WebElement userListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/UseAdd']")
	WebElement userAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/UseModLis?filterAction=UseMod']")
	WebElement userModifyCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/UseAppLis?filterAction=UseApp']")
	WebElement userApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/UseBlkLis?filterAction=UseBlk']")
	WebElement userBlockUnblockCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/UseDelLis?filterAction=UseDel']")
	WebElement userRemoveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/user/AdminReportAction?method=viewUserReport']")
	WebElement userReportViewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupPreList']")
	WebElement groupListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupAdd']")
	WebElement groupAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupModifyList']")
	WebElement groupModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupApproveList']")
	WebElement groupApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupBlockList']")
	WebElement groupBlockCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupUnblock']")
	WebElement groupUnblockCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/GroupRemoveList']")
	WebElement groupRemoveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/AdminReportAction?method=generateGroupReport']")
	WebElement groupReportBuildCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/group/AdminReportAction?method=viewGroupReport']")
	WebElement groupReportViewCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/ProfLis']")
	WebElement profilesListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/ProfCre']")
	WebElement profilesAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/ProfModLis']")
	WebElement profilesModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/ProfAppLis']")
	WebElement profilesApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/ProfDelLis']")
	WebElement profilesRemoveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/AdminReportAction?method=generateProfileReport']")
	WebElement profilesReportBuildCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/profile/AdminReportAction?method=viewProfileReport']")
	WebElement profilesReportViewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/RemoteResourceAction.do?method=remoteRun&metaFilter=RESOURCE_FILTER{dep_filter|FIRST.HAS.CAPTION=true}']")
	WebElement environmentGlobalProcessesCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/ResourceAction.do?method=run&metaFilter=RESOURCE_FILTER{res_filter|FIRST.HAS.CAPTION=true}']")
	WebElement environmentRunCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/ResourceAction.do?method=show&metaFilter=RESOURCE_FILTER{res_filter|FIRST.HAS.CAPTION=true}']")
	WebElement environmentShowCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/SecurityParamsAction.do?method=view']")
	WebElement securityParametersViewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/SecurityParamsAction.do?method=modify']")
	WebElement securityParametersModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/SecurityParamsAction.do?method=approve']")
	WebElement securityParametersApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/TimeAccessAction.do?method=view']")
	WebElement accessTimeViewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/TimeAccessAction.do?method=modify']")
	WebElement accessTimeModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/TimeAccessAction.do?method=approve']")
	WebElement accessTimeApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@main/user/userPersonalization/UserPersonalizationMaintain']")
	WebElement userPersonalizaCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/widgets/HandlerStatus']")
	WebElement handlerStatusCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/CalLis']")
	WebElement calendarViewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/CalCre']")
	WebElement calendarCreateCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/CalMod']")
	WebElement calendarModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/CalApp']")
	WebElement calendarApproveCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/certMaint/CertMaintList']")
	WebElement certificateListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/certMaint/CertMaintAdd']")
	WebElement certificateAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/certMaint/CertMaintModify']")
	WebElement certificateModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/certMaint/CertMaintDelete']")
	WebElement certificateDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/db/CifDbLoad']")
	WebElement dbLoadsCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/InstallParamMaint']")
	WebElement parameterMaintenanceCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/genericParamConstant/View']")
	WebElement bankInterfaceViewCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@gps/genericParamConstant/Modify']")
	WebElement bankInterfaceModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailList.do&metaFilter=EMAIL_FILTER{set_filter_all|FIRST.HAS.CAPTION=true}']")
	WebElement distributionSetsListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailNew.do&metaFilter=EMAIL_FILTER{set_filter|FIRST.HAS.CAPTION=true}']")
	WebElement distributionSetsAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailApprove.do&metaFilter=EMAIL_FILTER{set_filter_all|FIRST.HAS.CAPTION=true}']")
	WebElement distributionSetsApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailModify.do&metaFilter=EMAIL_FILTER{set_filter_all|FIRST.HAS.CAPTION=true}']")
	WebElement distributionSetsModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailDelete.do&metaFilter=EMAIL_FILTER{set_filter_all|FIRST.HAS.CAPTION=true}']")
	WebElement distributionSetsDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailMessageList.do&metaFilter=EMAIL_FILTER{set_filter_all|CALENDAR|email_message_status_filter_all|FIRST.HAS.CAPTION=true}']")
	WebElement messagesViewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@Synchro?forward=/EmailMessageNew.do&metaFilter=EMAIL_FILTER{email_enter_filter|FIRST.HAS.CAPTION=true}']")
	WebElement messagesNewCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@NotificationLookupAction?method=filter']")
	WebElement consoleNotificationsListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@WebConsoleAction?method=send']")
	WebElement consoleNotificationsSendCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/sftpParam/SftpParamList']")
	WebElement ftpsftpParametersListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/sftpParam/SftpParamNew']")
	WebElement ftpsftpParametersAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/sftpParam/SftpParamModify']")
	WebElement ftpsftpParametersModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/sftpParam/SftpParamFileListFilter']")
	WebElement ftpsftpParametersFTPSFTPFileListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileManager']")
	WebElement listPaymentFilesCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileManagerAV?method=avFilter']")
	WebElement listAVFilesCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileManagerDSC?method=dscFilter']")
	WebElement enrollmentFilesListDSCEnrollmentCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/VerifyFileManagerDSC?method=dscFilter']")
	WebElement enrollmentFilesVerifyDSCEnrollmentCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/ApproveFileManagerDSC?method=dscFilter']")
	WebElement enrollmentFilesApproveDSCEnrollmentCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileManagerAccept']")
	WebElement makerCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileManagerApprove']")
	WebElement checkerCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileListCIB?method=start&process=view']")
	WebElement agencyFileListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/cpsmsfileManager/FileListCIB?method=start&process=approve']")
	WebElement agencyFileApproveFileCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/pfmsAgencyMonitor/pfmsMonitor']")
	WebElement agencyDashboardCheckbox;

	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/cpsmspay/PayPreList']")
	WebElement paymentListChkBox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/ManualMainPostAction?method=filter']")
	WebElement manualInterventionMainPostingCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/ManualBulkPostAction?method=filter']")
	WebElement manualInterventionBulkPostingCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/DSCReprocessAction?method=filter&param=dscReprocess']")
	WebElement manualInterventionDSCReprocessCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/ApproveDSCAction?method=filter&param=approveDSCReprocess']")
	WebElement manualInterventionApproveDSCReprocessCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/repost/ManualTranPostAction?method=filter']")
	WebElement manualInterventionRepostTransactionCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/dbConncetionCheck/DbConnectionParameter?method=list']")
	WebElement manualInterventionDbConnectionCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ackGeneration/ImportMaintainanceFileAction?method=importFile']")
	WebElement manualInterventionAckGenerationCheckbox;

	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/lateReturn/LateReturnListAction?method=listReveal']")
	WebElement LateReturnListCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/lateReturn/LateReturnFileUploadAction?method=importFile']")
	WebElement LateReturnFileUploadCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/ACHReprocessAction?method=filter&param=achReprocess']")
	WebElement ACHAPBSReprocessCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/NEFTReprocessAction?method=filter&param=neftReprocess']")
	WebElement NEFTReprocessCheckBox;			
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/manIntervention/NhmEnquiryAction?method=filter&param=nhmReprocess']")
	WebElement NHMEnquiryCheckBox;			
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/avRepost/AVFileRepost?method=avFilter']")
	WebElement AVRepostFilesCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/pfmsDashboard/pfmsMonitor']")
	WebElement pfmsDashboardCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/pfmsMonitor/agencyPfmsMonitor?module=agency']")
	WebElement pfmsAgencyDashboardCheckBox;			
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/ackNackDashboard/ackNackDashboardFilter?method=filter']")
	WebElement ACKNACKDashboardCheckBox;			
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/avDashboard/avDashboard?method=avDashboardFilter']")
	WebElement AVDashboardCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/DebitBatchRecord/DebitRecordAction?method=debitBacthRecordList']")
	WebElement missingDebitListAdviceCheckBox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/CustomerList']")
	WebElement customerListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/CustomerAdd']")
	WebElement customerAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/CustomerApprove']")
	WebElement customerApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/CustomerModify']")
	WebElement customerModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/CustomerDelete']")
	WebElement customerDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/CustomerDelConf']")
	WebElement customerConfirmDeleteCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/AccountList']")
	WebElement accountListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/AccountAdd']")
	WebElement accountAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/AccountApprove']")
	WebElement accountApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/AccountModify']")
	WebElement accountModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/AccountDelete']")
	WebElement accountDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/cpsmsCust/AccountDelConf']")
	WebElement accountConfirmDeleteCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/AccountScreenMaintainance/ImportMaintainanceFileAction?method=userAccountList']")
	WebElement accountCertificateListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/AccountScreenMaintainance/ImportMaintainanceFileAction?method=importFile']")
	WebElement accountCertificateUploadCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/userManual/userManualRevealAction?method=userManualReveal&operation=delete']")
	WebElement userManualDeleteCheckbox;

	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/userManual/userManualUploadAction?method=uploadFile']")
	WebElement userManualUploadCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/userManual/userManualRevealAction?method=userManualReveal&operation=download']")
	WebElement userManualDownloadCheckbox;

	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/serverFolderView/ServerViewAction?method=view']")
	WebElement serverFolderViewCheckBox;			
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/reportingHighValueTran/crudListFilter']")
	WebElement reportHighValueTransactionListCheckBox;	
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/reportingHighValueTran/crudNew']")
	WebElement reportHighValueTransactionAddCheckBox;		
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/reportingHighValueTran/crudApproveFilter']")
	WebElement reportHighValueTransactionApproveCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/reportingHighValueTran/crudModifyFilter']")
	WebElement reportHighValueTransactionModifyCheckBox;		
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/reportingHighValueTran/crudDeleteFilter']")
	WebElement reportHighValueTransactionDeleteCheckBox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudListFilter']")
	WebElement schemeListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudNew']")
	WebElement schemeAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudApproveFilter']")
	WebElement schemeApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudModifyFilter']")
	WebElement schemeModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudDeleteFilter']")
	WebElement schemeDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudBulkUpload']")
	WebElement schemeUploadCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/schemeCodeMaintenanceCrud/crudBulkApproveFilter']")
	WebElement schemeBulkApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudListFilter']")
	WebElement errorCodeListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudNew']")
	WebElement errorCodeAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudApproveFilter']")
	WebElement errorCodeApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudModifyFilter']")
	WebElement errorCodeModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudDeleteFilter']")
	WebElement errorCodeDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudBulkUpload']")
	WebElement errorCodeUploadCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/errorCodeMappingCrud/crudBulkApproveFilter']")
	WebElement errorCodeBulkApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDays/ppaExpiryDaysAction?method=list']")
	WebElement ppaExpiryDaysListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDays/ppaExpiryDaysAction?method=add']")
	WebElement ppaExpiryDaysAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDays/ppaExpiryDaysAction?method=approve']")
	WebElement ppaExpiryDaysApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDays/ppaExpiryDaysAction?method=modify']")
	WebElement ppaExpiryDaysModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDate/ppaExpiryDateAction?method=list&operation=list']")
	WebElement ppaExpiryDateListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDate/ppaExpiryDateAction?method=filter&operation=update']")
	WebElement ppaExpiryDateUpdateCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/ppaExpiryDate/ppaExpiryDateAction?method=filter&operation=approve']")
	WebElement ppaExpiryDateApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudListFilter']")
	WebElement debitHotListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudNew']")
	WebElement debitHotListAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudApproveFilter']")
	WebElement debitHotListApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudModifyFilter']")
	WebElement debitHotListModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudDeleteFilter']")
	WebElement debitHotLsitDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudBulkUpload']")
	WebElement debitHotListUploadCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/debitHotListCrud/crudBulkApproveFilter']")
	WebElement debitHotListBulkApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateAccountMaster/crudListFilter']")
	WebElement nhmAccountMasterListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateAccountMaster/crudNew']")
	WebElement nhmAccountMasterAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateAccountMaster/crudApproveFilter']")
	WebElement nhmAccountMasterApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateAccountMaster/crudModifyFilter']")
	WebElement nhmAccountMasterModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateAccountMaster/crudDeleteFilter']")
	WebElement nhmAccountMasterDeleteCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateApiMaster/crudListFilter']")
	WebElement nhmAPIAccountMasterListCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateApiMaster/crudNew']")
	WebElement nhmAPIAccountMasterAddCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateApiMaster/crudApproveFilter']")
	WebElement nhmAPIAccountMasterApproveCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateApiMaster/crudModifyFilter']")
	WebElement nhmAPIAccountMasterModifyCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/gps/nhmStateApiMaster/crudDeleteFilter']")
	WebElement nhmAPIAccountMasterDeleteCheckbox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=Operation Report']")
	WebElement operationReportCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=Transaction Report']")
	WebElement transactionReportCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=NACH Payment Report']")
	WebElement nachPaymentReportCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=Reconciliation Report']")
	WebElement reconciliationReportCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=NPCI Exception Report']")
	WebElement npciExceptionReportCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=Zero Byte File Report']")
	WebElement zeroByteFileCheckBox;
	
	@FindBy(xpath="//input[@value='kotak_pfms-gps-menu@in/gps/genericReport/GenericReport?method=displayReportForm&reportName=File Status Report']")
	WebElement fileStatusReportCheckBox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@StartLogExplorer?method=start']")
	WebElement applicationSupportToolsLogExplorerCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@demo/SystemInfo']")
	WebElement applicationSupportToolsSystemInfoCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/InjectionStatistics']")
	WebElement applicationSupportToolsInjectionStatisticsCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@gps/LockManage']")
	WebElement applicationSupportToolsLockManagementCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@demo/DisplayServerConnections']")
	WebElement applicationSupportToolsServerConnectionsCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@demo/QueueMessageUploaderFilter']")
	WebElement applicationSupportToolsQueueMessageUploaderCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@demo/QueueMessageDownloaderFilter']")
	WebElement applicationSupportToolsQueueMessageDownloaderCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/miscellaneous/instance']")
	WebElement applicationSupportToolsInstanceNameCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@in/kotak_pfms/gps/file_upload/FileBulkUpload']")
	WebElement applicationSupportToolsPPAUploadCheckbox;
	
	@FindBy(xpath = "//input[@value='kotak_pfms-gps-menu@demo/ExecuteQuery']")
	WebElement applicationSupportToolsExecuteQueryCheckbox;

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
			String CheckAllBtn = map.get("Check All(Y/N)");
			String UnCheckAllBtn=map.get("UnCheck All(Y/N)");
			String Password = map.get("Password(Select/DeSelect)");
			String Logout = map.get("Logout(Select/DeSelect)");
			String administrativeChange_Generate=map.get("Administrative Change-Generate(Select/DeSelect)");
			String administrativeChange_List=map.get("Administrative Change-List(Select/DeSelect)");
			String activeUsers_List=map.get("Active Users-List(Select/DeSelect)");
			String activeUsers_ForceLogout=map.get("Active Users-Force Logout(Select/DeSelect)");
			String InactivityReport=map.get("Inactivity Report(Select/DeSelect)");			
			String SecurityIncidents=map.get("Security Incidents(Select/DeSelect)");			
			String LogView=map.get("Log-View(Select/DeSelect)");
			String User_List = map.get("User-List(Select/DeSelect)");
			String User_Add = map.get("User-Add(Select/DeSelect)");
			String User_ModifyRepair = map.get("User-Modify/Repair(Select/DeSelect)");
			String User_Approve = map.get("User-Approve(Select/DeSelect)");
			String User_BlockUnblock = map.get("User-Block/Unblock(Select/DeSelect)");
			String User_Remove = map.get("User-Remove(Select/DeSelect)");
			String User_Report = map.get("User-Report(Select/DeSelect)");
			String Group_List = map.get("Group-List(Select/DeSelect)");
			String Group_Add = map.get("Group-Add(Select/DeSelect)");
			String Group_Modify = map.get("Group-Modify(Select/DeSelect)");
			String Group_Approve = map.get("Group-Approve(Select/DeSelect)");
			String Group_Block = map.get("Group-Block(Select/DeSelect)");
			String Group_Unblock = map.get("Group-Unblock(Select/DeSelect)");
			String Group_Remove = map.get("Group-Remove(Select/DeSelect)");
			String Group_ReportBuild = map.get("Group-ReportBuild(Select/DeSelect)");
			String Group_ReportView = map.get("Group-ReportView(Select/DeSelect)");
			String Profiles_List = map.get("Profiles-List(Select/DeSelect)");
			String Profiles_Add = map.get("Profiles-Add(Select/DeSelect)");
			String Profiles_Modify = map.get("Profiles-Modify/Repair(Select/DeSelect)");
			String Profiles_Approve = map.get("Profiles-Approve(Select/DeSelect)");
			String Profiles_Remove = map.get("Profiles-Remove(Select/DeSelect)");
			String Profiles_ReportBuild = map.get("Profiles-ReportBuild(Select/DeSelect)");
			String Profiles_ReportView = map.get("Profiles-ReportView(Select/DeSelect)");
			String Environment_GlobalProcess= map.get("Environment-Global Process(Select/DeSelect)");
			String Environment_Run = map.get("Environment-Run(Select/DeSelect)");
			String Environment_Show=map.get("Environment-Show(Select/DeSelect)");
			String SecurityParameters_View = map.get("Security Parameters-View(Select/DeSelect)");
			String Security_Parameters_Modify = map.get("Security Parameters-Modify(Select/DeSelect)");
			String Security_Parameters_Approve = map.get("Security Parameters-Approve(Select/DeSelect)");
			String accessTime_View = map.get("Access Time-View(Select/DeSelect)");
			String accessTime_Modify = map.get("Access Time-Modify(Select/DeSelect)");
			String accessTime_Approve = map.get("Access Time-Approve(Select/DeSelect)");
			String userPersonalization= map.get("UserPersonalization(Select/DeSelect)");
			String handlerStatus=map.get("HandlerStatus(Select/DeSelect)");
			String Calendar_View = map.get("Calendar-View(Select/DeSelect)");
			String Calendar_Create = map.get("Calendar-Create(Select/DeSelect)");
			String Calendar_Modify = map.get("Calendar-Modify/Repair(Select/DeSelect)");
			String Calendar_Approve = map.get("Calendar-Approve(Select/DeSelect)");
			String Certificate_List = map.get("Certificate-List(Select/DeSelect)");
			String Certificate_Add = map.get("Certificate-Add(Select/DeSelect)");
			String Certificate_Modify = map.get("Certificate-Modify(Select/DeSelect)");
			String Certificate_Delete = map.get("Certificate-Delete(Select/DeSelect)");
			String DBLoads = map.get("DB Loads(Select/DeSelect)");
			String parameterMaintenance=map.get("Parameter Maintenance(Select/DeSelect)");
			String bankInterfaceParameter_View=map.get("Bank Interface Parameter-View(Select/DeSelect)");
			String bankInterfaceParameter_Modify=map.get("Bank Interface Parameter-Modify(Select/DeSelect)");
			String DistributionSets_List = map.get("Distribution Sets-List(Select/DeSelect)");
			String DistributionSets_Add = map.get("Distribution Sets-Add(Select/DeSelect)");
			String DistributionSets_Approve = map.get("Distribution Sets-Approve(Select/DeSelect)");
			String DistributionSets_Modify = map.get("Distribution Sets-Modify(Select/DeSelect)");
			String DistributionSets_Delete = map.get("Distribution Sets-Delete(Select/DeSelect)");
			String Messages_View = map.get("Messages-View(Select/DeSelect)");
			String Messages_New = map.get("Messages-New(Select/DeSelect)");
			String consoleNotificationsList=map.get("Console Notification-List(Select/DeSelect)");
			String consoleNotificationsSend=map.get("Console Notification-Send(Select/DeSelect)");
			String FTPSFTPParameters_List = map.get("FTP-SFTP Parameters-List(Select/DeSelect)");
			String FTPSFTPParameters_Add = map.get("FTP-SFTP Parameters-Add(Select/DeSelect)");
			String FTPSFTPParameters_Modify = map.get("FTP-SFTP Parameters-Modify(Select/DeSelect)");
			String FTPSFTPParameters_FTPSFTPFileList = map.get("FTP-SFTP Parameters-FTP-SFTP File List(Select/DeSelect)");
			String FileManager_ListPaymentFiles=map.get("List Payment Files(Select/DeSelect)");
			String FileManager_ListAVFiles=map.get("List AV Files(Select/DeSelect)");		
			String ListDSCEnrollment=map.get("List DSC Enrollment(Select/DeSelect)");
			String VerifyDSCEnrollment=map.get("Verify DSC Enrollment(Select/DeSelect)");	
			String ApproveDSCEnrollment=map.get("Approve DSC Enrollment(Select/DeSelect)");
			String Maker=map.get("Maker(Select/DeSelect)");
			String Checker=map.get("Checker(Select/DeSelect)");
			String agencyFileList=map.get("Agency File-List(Select/DeSelect)");
			String agencyFileApprove=map.get("Agency File-Approve File(Select/DeSelect)");
			String agencydashboard=map.get("Agency File-Agency Dashboard(Select/DeSelect)");
			String paymentList=map.get("Payment List(Select/DeSelect)");
			String manualIntervention_MainPosting=map.get("Manual Intervention-Main Posting(Select/DeSelect)");
			String manualIntervention_BulkPosting=map.get("Manual Intervention-Bulk Posting(Select/DeSelect)");
			String manualIntervention_DSCReprocess=map.get("Manual Intervention-DSC Reprocess(Select/DeSelect)");
			String manualIntervention_ApproveDSCReprocess=map.get("Manual Intervention-Approve DSC Reprocess(Select/DeSelect)");
			String manualIntervention_RepostTransaction=map.get("Manual Intervention-Repost Transaction(Select/DeSelect)");
			String manualIntervention_DbConnection=map.get("Manual Intervention-Db Connection(Select/DeSelect)");		
			String manualIntervention_AckGeneration=map.get("Manual Intervention-Ack Generation(Select/DeSelect)");	
			String LateReturn_List=map.get("Late Return-File Upload(Select/DeSelect)");
			String LateReturn_FileUpload=map.get("Manual Intervention-File Upload(Select/DeSelect)");
			String ACHAPBSReprocess=map.get("ACH/APBS Reprocess(Select/DeSelect)");		
			String NEFTReprocess=map.get("NEFT Reprocess(Select/DeSelect)");			
			String NHMEnquiry=map.get("NHM Enquiry(Select/DeSelect)");		
			String AVRepostFiles=map.get("AV Repost Files(Select/DeSelect)");
			String PFMSDashboard=map.get("PFMSDashboard(Select/DeSelect)");	
			String PFMSAgencyDashboard=map.get("PFMSAgencyDashboard(Select/DeSelect)");
			String ACKNACKDashboard=map.get("ACKNACKDashboard(Select/DeSelect)");
			String AVDashboard=map.get("AVDashboard(Select/DeSelect)");
			String MissingDebitAdviceList=map.get("Missing Debit Advice List(Select/DeSelect)");
			String Customer_List = map.get("Customer-List(Select/DeSelect)");
			String Customer_Add = map.get("Customer-Add(Select/DeSelect)");
			String Customer_Approve = map.get("Customer-Approve(Select/DeSelect)");
			String Customer_Modify = map.get("Customer-Modify(Select/DeSelect)");
			String Customer_Delete = map.get("Customer-Delete(Select/DeSelect)");
			String Customer_ConfirmDelete = map.get("Customer-Confirm Delete(Select/DeSelect)");
			String Account_List = map.get("Account-List(Select/DeSelect)");
			String Account_Add = map.get("Account-Add(Select/DeSelect)");
			String Account_Approve = map.get("Account-Approve(Select/DeSelect)");
			String Account_Modify = map.get("Account-Modify(Select/DeSelect)");
			String Account_Delete = map.get("Account-Delete(Select/DeSelect)");
			String Account_ConfirmDelete = map.get("Account-Confirm Delete(Select/DeSelect)");
			String AccountCertificateUpload= map.get("Account Certificate Upload(Select/DeSelect)");
			String AccountCertificateList=map.get("Account Certificate List(Select/DeSelect)");
			String UserManual_Upload=map.get("User Manual-Upload(Select/DeSelect)");
			String UserManual_Download=map.get("User Manual-Download(Select/DeSelect)");
			String UserManual_Delete=map.get("User Manual-Delete(Select/DeSelect)");
			String serverFolderView=map.get("Server Folder View(Select/DeSelect)");
			String ReportingHighValueTransactionList=map.get("Reporting High Value Transaction List(Select/DeSelect)");	
			String ReportingHighValueTransactionAdd=map.get("Reporting High Value Transaction Add(Select/DeSelect)");		
			String ReportingHighValueTransactionModify=map.get("Reporting High Value Transaction Modify(Select/DeSelect)");		
			String ReportingHighValueTransactionDelete=map.get("Reporting High Value Transaction Delete(Select/DeSelect)");		
			String ReportingHighValueTransactionApprove=map.get("Reporting High Value Transaction Approve(Select/DeSelect)");	
			String Scheme_List = map.get("Scheme Code Maintenance-List(Select/DeSelect)");
			String Scheme_Add = map.get("Scheme Code Maintenance-Add(Select/DeSelect)");
			String Scheme_Approve = map.get("Scheme Code Maintenance-Approve(Select/DeSelect)");
			String Scheme_Modify = map.get("Scheme Code Maintenance-Modify(Select/DeSelect)");
			String Scheme_Delete = map.get("Scheme Code Maintenance-Delete(Select/DeSelect)");
			String Scheme_Upload = map.get("Scheme Code Maintenance-Upload(Select/DeSelect)");
			String Scheme_BulkApprove = map.get("Scheme Code Maintenance-Bulk Approve(Select/DeSelect)");
			String ErrorCode_List=map.get("ErrorCode-List(Select/DeSelect)");		
			String ErrorCode_Add=map.get("ErrorCode-Add(Select/DeSelect)");		
			String ErrorCode_Approve=map.get("ErrorCode-Approve(Select/DeSelect)");		
			String ErrorCode_Modify=map.get("ErrorCode-Modify(Select/DeSelect)");	
			String ErrorCode_Delete=map.get("ErrorCode-Delete(Select/DeSelect)");	
			String ErrorCode_Upload=map.get("ErrorCode-Upload(Select/DeSelect)");	
			String ErrorCode_BulkApprove=map.get("ErrorCode-Bulk Approve(Select/DeSelect)"); 
			String PPAExpiryDays_List=map.get("PPA Expiry Days-List(Select/DeSelect)");
			String PPAExpiryDays_Add=map.get("PPA Expiry Days-Add(Select/DeSelect)");		
			String PPAExpiryDays_Modify	=map.get("PPA Expiry Days-Modify(Select/DeSelect)");	
			String PPAExpiryDays_Approve=map.get("PPA Expiry Days-Approve(Select/DeSelect)");
			String PPAExpiryDate_List=map.get("PPA Expiry Date-List(Select/DeSelect)");
			String PPAExpiryDate_Update=map.get("PPA Expiry Date-Update(Select/DeSelect)");		
			String PPAExpiryDate_Approve=map.get("PPA Expiry Date-Approve(Select/DeSelect)");	
			String DebitHotList_List = map.get("DebitHotList-List(Select/DeSelect)");
			String DebitHotList_Add = map.get("DebitHotList-Add(Select/DeSelect)");
			String DebitHotList_Approve = map.get("DebitHotList-Approve(Select/DeSelect)");
			String DebitHotList_Modify = map.get("DebitHotList-Modify(Select/DeSelect)");
			String DebitHotList_Delete = map.get("DebitHotList-Delete(Select/DeSelect)");
			String DebitHotList_Upload = map.get("DebitHotList-Upload(Select/DeSelect)");
			String DebitHotList_BulkApprove = map.get("DebitHotList-Bulk Approve(Select/DeSelect)");
			String NHMAccountMaster_List=map.get("NHM Account Master-List(Select/DeSelect)");
			String NHMAccountMaster_Add=map.get("NHM Account Master-Add(Select/DeSelect)");
			String NHMAccountMaster_Approve=map.get("NHM Account Master-Approve(Select/DeSelect)");
			String NHMAccountMaster_Modify=map.get("NHM Account Master-Modify(Select/DeSelect)");
			String NHMAccountMaster_Delete=map.get("NHM Account Master-Delete(Select/DeSelect)");
			String NHMAPIAccountMaster_List=map.get("NHM API Account Master-List(Select/DeSelect)");
			String NHMAPIAccountMaster_Add=map.get("NHM API Account Master-Add(Select/DeSelect)");
			String NHMAPIAccountMaster_Approve=map.get("NHM API Account Master-Approve(Select/DeSelect)");
			String NHMAPIAccountMaster_Modify=map.get("NHM API Account Master-Modify(Select/DeSelect)");
			String NHMAPIAccountMaster_Delete=map.get("NHM API Account Master-Delete(Select/DeSelect)");
			String Report_Reconciliation = map.get("Report-Reconciliation(Select/DeSelect)");
			String Report_TransactionReport = map.get("Report-Transaction Report(Select/DeSelect)");
			String OperationReport = map.get("Report-Operation Report(Select/DeSelect)");
			String NACHPaymentReport= map.get("NACH Payment Report(Select/DeSelect)");
			String NPCIExceptionReport = map.get("NPCI Exception Report(Select/DeSelect)");
			String ZeroByteFile=map.get("Report-Zero Byte File(Select/DeSelect)");
			String FileStatusReport=map.get("File Status Report(Select/DeSelect)");
			String ApplicationSupportTools_LogExplorer = map.get("Application Support Tools-Log Explorer(Select/DeSelect)");
			String ApplicationSupportTools_SystemInfo = map.get("Application Support Tools-System Info(Select/DeSelect)");
			String ApplicationSupportTools_InjectionStatistics=map.get("Application Support Tools-Injection Statistics(Select/DeSelect)");
			String ApplicationSupportTools_LockManagement = map.get("Application Support Tools-Lock Management(Select/DeSelect)");
			String ApplicationSupportTools_ServerConnections=map.get("Application Support Tools-Server Connections(Select/DeSelect)");
			String ApplicationSupportTools_QueueMessageUploader=map.get("Application Support Tools-Queue Message Uploader(Select/DeSelect)");
			String ApplicationSupportTools_QueueMessageDownloader=map.get("Application Support Tools-Queue Message Downloader(Select/DeSelect)");
			String ApplicationSupportTools_InstanceName= map.get("Application Support Tools-Instance Name(Select/DeSelect)");
			String ApplicationSupportTools_PPAUpload = map.get("Application Support Tools-PPA Upload(Select/DeSelect)");
			String ApplicationSupportTools_ExecuteQuery = map.get("Application Support Tools-Execute Query(Select/DeSelect)");
			
			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(btnCancel);

			String ExpectedCancelBtnValidationMsg = "Operation Add new profile was cancelled.";

			if (elementUtil.getText(errorMessages).trim().toString().equals(ExpectedCancelBtnValidationMsg.trim().toString())) {
				log.info("Cancel button is working fine");
			} else {
				log.error("Cancel button is not working");
			}

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(okBtn);

			String profileAddScreenErrorMessageexpected="Profile Name is required.\n" + "You must select some menu checkboxes";

			if (elementUtil.getText(errorMessages).trim().toString().equals(profileAddScreenErrorMessageexpected.trim().toString())) {
				log.info("Mandatory Fields Validation Message Displayed Is Correct");
			} else {
				log.info("Mandatory Fields Validation Message Displayed Is Incorrect");
			}

			elementUtil.SHORT_TIMEOUT();
			elementUtil.clickElement(restartWorkFlowBtn);
			
			elementUtil.SHORT_TIMEOUT();
			elementUtil.enterText(profileNameTxtField, ProfileName);
			elementUtil.enterText(profileDescTxtField, ProfileDescription);
			
			if(CheckAllBtn.equalsIgnoreCase("Y"))
			{
				elementUtil.clickElement(btnChkAll);
			}
			else if(CheckAllBtn.equalsIgnoreCase("N"))
			{
				elementUtil.isElementCheckBoxSelected(passwordCheckbox, Password);
				elementUtil.isElementCheckBoxSelected(logoutCheckbox, Logout);
				
				elementUtil.isElementCheckBoxSelected(administrativeChangGenerateChkBox,administrativeChange_Generate);
				elementUtil.isElementCheckBoxSelected(administrativeChangeListChkBox,administrativeChange_List);
				
				elementUtil.isElementCheckBoxSelected(activeUsersListChkBox,activeUsers_List);
				elementUtil.isElementCheckBoxSelected(activeUsersForceLogoutChkBox,activeUsers_ForceLogout);
						
				elementUtil.isElementCheckBoxSelected(inactivityReportChkBox,InactivityReport);
				elementUtil.isElementCheckBoxSelected(securityIncidentReportChkBox,SecurityIncidents);
				elementUtil.isElementCheckBoxSelected(logViewCheckbox,LogView);
				
				elementUtil.isElementSelected(userListCheckbox, User_List);
				elementUtil.isElementSelected(userAddCheckbox, User_Add);
				elementUtil.isElementSelected(userModifyCheckbox, User_ModifyRepair);
				elementUtil.isElementSelected(userApproveCheckbox, User_Approve);
				elementUtil.isElementSelected(userBlockUnblockCheckbox, User_BlockUnblock);
				elementUtil.isElementSelected(userRemoveCheckbox, User_Remove);
				elementUtil.isElementSelected(userReportViewCheckbox, User_Report);
				
				elementUtil.isElementSelected(groupListCheckbox, Group_List);
				elementUtil.isElementSelected(groupAddCheckbox, Group_Add);
				elementUtil.isElementSelected(groupModifyCheckbox, Group_Modify);
				elementUtil.isElementSelected(groupApproveCheckbox, Group_Approve);
				elementUtil.isElementSelected(groupBlockCheckbox, Group_Block);
				elementUtil.isElementSelected(groupUnblockCheckbox, Group_Unblock);
				elementUtil.isElementSelected(groupRemoveCheckbox, Group_Remove);
				elementUtil.isElementSelected(groupReportBuildCheckbox, Group_ReportBuild);
				elementUtil.isElementSelected(groupReportViewCheckbox, Group_ReportView);
				
				elementUtil.isElementSelected(profilesListCheckbox, Profiles_List);
				elementUtil.isElementSelected(profilesAddCheckbox, Profiles_Add);
				elementUtil.isElementSelected(profilesModifyCheckbox, Profiles_Modify);
				elementUtil.isElementSelected(profilesApproveCheckbox, Profiles_Approve);
				elementUtil.isElementSelected(profilesRemoveCheckbox, Profiles_Remove);
				elementUtil.isElementSelected(profilesReportBuildCheckbox, Profiles_ReportBuild);
				elementUtil.isElementSelected(profilesReportViewCheckbox, Profiles_ReportView);
			
				
				elementUtil.isElementSelected(environmentGlobalProcessesCheckbox, Environment_GlobalProcess);
				elementUtil.isElementSelected(environmentRunCheckbox, Environment_Run);
				elementUtil.isElementSelected(environmentShowCheckbox, Environment_Show);
				
				
				elementUtil.isElementSelected(securityParametersViewCheckbox,SecurityParameters_View);
				elementUtil.isElementSelected(securityParametersModifyCheckbox,Security_Parameters_Modify);
				elementUtil.isElementSelected(securityParametersApproveCheckbox,Security_Parameters_Approve);
				

				elementUtil.isElementSelected(accessTimeViewCheckbox, accessTime_View);
				elementUtil.isElementSelected(accessTimeModifyCheckbox, accessTime_Modify);
				elementUtil.isElementSelected(accessTimeApproveCheckbox, accessTime_Approve);
				
				elementUtil.isElementSelected(userPersonalizaCheckbox, userPersonalization);
				elementUtil.isElementSelected(handlerStatusCheckbox, handlerStatus);
				
				
				elementUtil.isElementSelected(calendarViewCheckbox, Calendar_View);
				elementUtil.isElementSelected(calendarCreateCheckbox, Calendar_Create);
				elementUtil.isElementSelected(calendarModifyCheckbox, Calendar_Modify);
				elementUtil.isElementSelected(calendarApproveCheckbox, Calendar_Approve);
				
				elementUtil.isElementSelected(certificateListCheckbox, Certificate_List);
				elementUtil.isElementSelected(certificateAddCheckbox, Certificate_Add);
				elementUtil.isElementSelected(certificateModifyCheckbox, Certificate_Modify);
				elementUtil.isElementSelected(certificateDeleteCheckbox, Certificate_Delete);
				
				elementUtil.isElementSelected(dbLoadsCheckbox,DBLoads);
				
				elementUtil.isElementSelected(parameterMaintenanceCheckbox,parameterMaintenance);
				elementUtil.isElementSelected(bankInterfaceViewCheckbox, bankInterfaceParameter_View);
				elementUtil.isElementSelected(bankInterfaceModifyCheckbox,bankInterfaceParameter_Modify);
				
				elementUtil.isElementSelected(distributionSetsListCheckbox, DistributionSets_List);
				elementUtil.isElementSelected(distributionSetsAddCheckbox, DistributionSets_Add);
				elementUtil.isElementSelected(distributionSetsApproveCheckbox, DistributionSets_Approve);
				elementUtil.isElementSelected(distributionSetsModifyCheckbox, DistributionSets_Modify);
				elementUtil.isElementSelected(distributionSetsDeleteCheckbox, DistributionSets_Delete);
				
				elementUtil.isElementSelected(messagesViewCheckbox, Messages_View);
				elementUtil.isElementSelected(messagesNewCheckbox, Messages_New);
			
				elementUtil.isElementSelected(consoleNotificationsListCheckbox, consoleNotificationsList);
				elementUtil.isElementSelected(consoleNotificationsSendCheckbox, consoleNotificationsSend);
			
				elementUtil.isElementSelected(ftpsftpParametersListCheckbox, FTPSFTPParameters_List);
				elementUtil.isElementSelected(ftpsftpParametersAddCheckbox, FTPSFTPParameters_Add);
				elementUtil.isElementSelected(ftpsftpParametersModifyCheckbox, FTPSFTPParameters_Modify);
				elementUtil.isElementSelected(ftpsftpParametersFTPSFTPFileListCheckbox, FTPSFTPParameters_FTPSFTPFileList);
				
				elementUtil.isElementSelected(listPaymentFilesCheckbox, FileManager_ListPaymentFiles);
				elementUtil.isElementSelected(listAVFilesCheckbox, FileManager_ListAVFiles);
				elementUtil.isElementSelected(enrollmentFilesListDSCEnrollmentCheckbox,ListDSCEnrollment);
				elementUtil.isElementSelected(enrollmentFilesVerifyDSCEnrollmentCheckbox,VerifyDSCEnrollment);
				elementUtil.isElementSelected(enrollmentFilesApproveDSCEnrollmentCheckbox,ApproveDSCEnrollment );
				
				elementUtil.isElementSelected(makerCheckbox, Maker);
				elementUtil.isElementSelected(checkerCheckbox,Checker);
				
				elementUtil.isElementSelected(agencyFileListCheckbox, agencyFileList);
				elementUtil.isElementSelected(agencyFileApproveFileCheckbox,agencyFileApprove);
				elementUtil.isElementSelected(agencyDashboardCheckbox, agencydashboard);
				
				elementUtil.isElementSelected(paymentListChkBox,paymentList);
				
				elementUtil.isElementSelected(manualInterventionMainPostingCheckbox,manualIntervention_MainPosting);
				elementUtil.isElementSelected(manualInterventionBulkPostingCheckbox,manualIntervention_BulkPosting);
				elementUtil.isElementSelected(manualInterventionDSCReprocessCheckbox,manualIntervention_DSCReprocess);
				elementUtil.isElementSelected(manualInterventionApproveDSCReprocessCheckbox,manualIntervention_ApproveDSCReprocess);
				elementUtil.isElementSelected(manualInterventionRepostTransactionCheckbox,manualIntervention_RepostTransaction);
				elementUtil.isElementSelected(manualInterventionDbConnectionCheckbox,manualIntervention_DbConnection);
				elementUtil.isElementSelected(manualInterventionAckGenerationCheckbox,manualIntervention_AckGeneration);
				elementUtil.isElementSelected(LateReturnListCheckbox,LateReturn_List);
				elementUtil.isElementSelected(LateReturnFileUploadCheckbox,LateReturn_FileUpload);
				
				elementUtil.isElementSelected(ACHAPBSReprocessCheckbox,ACHAPBSReprocess);
				elementUtil.isElementSelected(NEFTReprocessCheckBox,NEFTReprocess);
				elementUtil.isElementSelected(NHMEnquiryCheckBox,NHMEnquiry);
				elementUtil.isElementSelected(AVRepostFilesCheckBox,AVRepostFiles);
				elementUtil.isElementSelected(pfmsDashboardCheckbox,PFMSDashboard);
				elementUtil.isElementSelected(pfmsAgencyDashboardCheckBox,PFMSAgencyDashboard);
				elementUtil.isElementSelected(ACKNACKDashboardCheckBox,ACKNACKDashboard);
				elementUtil.isElementSelected(AVDashboardCheckBox,AVDashboard);
				
				elementUtil.isElementSelected(missingDebitListAdviceCheckBox,MissingDebitAdviceList);
				
				elementUtil.isElementSelected(customerListCheckbox, Customer_List);
				elementUtil.isElementSelected(customerAddCheckbox, Customer_Add);
				elementUtil.isElementSelected(customerApproveCheckbox, Customer_Approve);
				elementUtil.isElementSelected(customerModifyCheckbox, Customer_Modify);
				elementUtil.isElementSelected(customerDeleteCheckbox, Customer_Delete);
				elementUtil.isElementSelected(customerConfirmDeleteCheckbox, Customer_ConfirmDelete);
				
				elementUtil.isElementSelected(accountListCheckbox,Account_List);
				elementUtil.isElementSelected(accountAddCheckbox, Account_Add);
				elementUtil.isElementSelected(accountApproveCheckbox, Account_Approve);
				elementUtil.isElementSelected(accountModifyCheckbox, Account_Modify);
				elementUtil.isElementSelected(accountDeleteCheckbox,Account_Delete);
				elementUtil.isElementSelected(accountConfirmDeleteCheckbox,Account_ConfirmDelete);
				
				elementUtil.isElementSelected(accountCertificateUploadCheckbox,AccountCertificateUpload);
				elementUtil.isElementSelected(accountCertificateListCheckbox,AccountCertificateList);
				
				elementUtil.isElementSelected(userManualUploadCheckbox,UserManual_Upload);
				elementUtil.isElementSelected(userManualDownloadCheckbox,UserManual_Download);
				elementUtil.isElementSelected(userManualDeleteCheckbox,UserManual_Delete);
				
				elementUtil.isElementSelected(serverFolderViewCheckBox,serverFolderView);
				
				elementUtil.isElementSelected(reportHighValueTransactionListCheckBox,ReportingHighValueTransactionList);
				elementUtil.isElementSelected(reportHighValueTransactionAddCheckBox, ReportingHighValueTransactionAdd);
				elementUtil.isElementSelected(reportHighValueTransactionApproveCheckBox,ReportingHighValueTransactionApprove);
				elementUtil.isElementSelected(reportHighValueTransactionModifyCheckBox, ReportingHighValueTransactionModify);
				elementUtil.isElementSelected(reportHighValueTransactionDeleteCheckBox,ReportingHighValueTransactionDelete);
				
				
				elementUtil.isElementSelected(schemeListCheckbox, Scheme_List);
				elementUtil.isElementSelected(schemeAddCheckbox, Scheme_Add);
				elementUtil.isElementSelected(schemeApproveCheckbox, Scheme_Approve);
				elementUtil.isElementSelected(schemeModifyCheckbox, Scheme_Modify);
				elementUtil.isElementSelected(schemeDeleteCheckbox, Scheme_Delete);
				elementUtil.isElementSelected(schemeUploadCheckbox, Scheme_Upload);
				elementUtil.isElementSelected(schemeBulkApproveCheckbox,Scheme_BulkApprove);
				
				elementUtil.isElementSelected(errorCodeListCheckbox,ErrorCode_List);
				elementUtil.isElementSelected(errorCodeAddCheckbox,ErrorCode_Add);
				elementUtil.isElementSelected(errorCodeApproveCheckbox,ErrorCode_Approve);
				elementUtil.isElementSelected(errorCodeModifyCheckbox, ErrorCode_Modify);
				elementUtil.isElementSelected(errorCodeDeleteCheckbox,ErrorCode_Delete);
				elementUtil.isElementSelected(errorCodeUploadCheckbox,ErrorCode_Upload);
				elementUtil.isElementSelected(errorCodeBulkApproveCheckbox,ErrorCode_BulkApprove);
				
				elementUtil.isElementSelected(ppaExpiryDaysListCheckbox,PPAExpiryDays_List);
				elementUtil.isElementSelected(ppaExpiryDaysAddCheckbox,PPAExpiryDays_Add);
				elementUtil.isElementSelected(ppaExpiryDaysModifyCheckbox,PPAExpiryDays_Modify);
				elementUtil.isElementSelected(ppaExpiryDaysApproveCheckbox,PPAExpiryDays_Approve);
			
				elementUtil.isElementSelected(ppaExpiryDateListCheckbox,PPAExpiryDate_List);
				elementUtil.isElementSelected(ppaExpiryDateUpdateCheckbox,PPAExpiryDate_Update);
				elementUtil.isElementSelected(ppaExpiryDateApproveCheckbox,PPAExpiryDate_Approve);
				
				elementUtil.isElementSelected(debitHotListCheckbox,DebitHotList_List);
				elementUtil.isElementSelected(debitHotListAddCheckbox,DebitHotList_Add);
				elementUtil.isElementSelected(debitHotListApproveCheckbox,DebitHotList_Approve);
				elementUtil.isElementSelected(debitHotListModifyCheckbox,DebitHotList_Modify);
				elementUtil.isElementSelected(debitHotLsitDeleteCheckbox,DebitHotList_Delete);
				elementUtil.isElementSelected(debitHotListUploadCheckbox,DebitHotList_Upload);
				elementUtil.isElementSelected(debitHotListBulkApproveCheckbox,DebitHotList_BulkApprove);
				
				elementUtil.isElementSelected(nhmAccountMasterListCheckbox,NHMAccountMaster_List);
				elementUtil.isElementSelected(nhmAccountMasterAddCheckbox,NHMAccountMaster_Add);
				elementUtil.isElementSelected(nhmAccountMasterApproveCheckbox,NHMAccountMaster_Approve);
				elementUtil.isElementSelected(nhmAccountMasterModifyCheckbox,NHMAccountMaster_Modify);
				elementUtil.isElementSelected(nhmAccountMasterDeleteCheckbox,NHMAccountMaster_Delete);
				
				elementUtil.isElementSelected(nhmAPIAccountMasterListCheckbox,NHMAPIAccountMaster_List);
				elementUtil.isElementSelected(nhmAPIAccountMasterAddCheckbox,NHMAPIAccountMaster_Add);
				elementUtil.isElementSelected(nhmAPIAccountMasterApproveCheckbox,NHMAPIAccountMaster_Approve);
				elementUtil.isElementSelected(nhmAPIAccountMasterModifyCheckbox,NHMAPIAccountMaster_Modify);
				elementUtil.isElementSelected(nhmAPIAccountMasterDeleteCheckbox,NHMAPIAccountMaster_Delete);
				
				elementUtil.isElementSelected(operationReportCheckBox,OperationReport);
				elementUtil.isElementSelected(transactionReportCheckBox,Report_TransactionReport);
				elementUtil.isElementSelected(nachPaymentReportCheckBox,NACHPaymentReport);
				elementUtil.isElementSelected(reconciliationReportCheckBox,Report_Reconciliation);
				elementUtil.isElementSelected(npciExceptionReportCheckBox,NPCIExceptionReport);
				elementUtil.isElementSelected(zeroByteFileCheckBox,ZeroByteFile);
				elementUtil.isElementSelected(fileStatusReportCheckBox,FileStatusReport);
				
				elementUtil.isElementSelected(applicationSupportToolsLogExplorerCheckbox, ApplicationSupportTools_LogExplorer);
				elementUtil.isElementSelected(applicationSupportToolsSystemInfoCheckbox, ApplicationSupportTools_SystemInfo);
				elementUtil.isElementSelected(applicationSupportToolsInjectionStatisticsCheckbox,ApplicationSupportTools_InjectionStatistics);
				elementUtil.isElementSelected(applicationSupportToolsLockManagementCheckbox,ApplicationSupportTools_LockManagement);
				elementUtil.isElementSelected(applicationSupportToolsServerConnectionsCheckbox, ApplicationSupportTools_ServerConnections);
				elementUtil.isElementSelected(applicationSupportToolsQueueMessageUploaderCheckbox, ApplicationSupportTools_QueueMessageUploader);
				elementUtil.isElementSelected(applicationSupportToolsQueueMessageDownloaderCheckbox, ApplicationSupportTools_QueueMessageDownloader);
				elementUtil.isElementSelected(applicationSupportToolsInstanceNameCheckbox, ApplicationSupportTools_InstanceName);
				elementUtil.isElementSelected(applicationSupportToolsPPAUploadCheckbox,ApplicationSupportTools_PPAUpload);
				elementUtil.isElementSelected(applicationSupportToolsExecuteQueryCheckbox,ApplicationSupportTools_ExecuteQuery);
			}
			else
			{
				log.error("Value Provided For Check All(Y/N) : " + " [ " + CheckAllBtn + " ] is Improper");
			}
			//click on ok button
			elementUtil.clickElement(okBtn);
			try {

				if(elementUtil.getText(errormessages).trim().toString().equals("Profile already exists".trim().toString()))
				{
					log.info("Duplicate Record Found Record With Profile " +ProfileName+ " Already Exists");
				}//end of if
				else
				{
					log.error(elementUtil.getText(errorMessages));
				}//end of else
			} catch (NoSuchElementException e) {
				elementUtil.clickElement(okBtn);
				log.info(elementUtil.getText(messages));
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
				if(elementUtil.getText(ProfileNameValue).trim().toString().equals(ProfileName.trim().toString()))
				{
					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(btnRemove);
					log.info(elementUtil.getText(messages));
				}//end of if
				else
				{
					log.error("Record Mismatch, Record With Profile Name : " +ProfileName+ " Not Found For Remove Operation");
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
						log.info("Approval of Record With Profile Name : " +ProfileName+ " Failed. User cannot approve own modification" );
					}
				} catch (NoSuchElementException e2) {
					if(elementUtil.getText(ProfileNameValue).trim().toString().equals(ProfileName.trim().toString()))
					{
						//Perform Approve Operation is value for operation from Test Sheet is 
						if(operation.equalsIgnoreCase("Approve"))
						{
							elementUtil.clickElement(approveBtn);
							log.info(elementUtil.getText(messages));
						}//end of if
						else if(operation.equalsIgnoreCase("Reject"))
						{
							elementUtil.clickElement(rejectBtn);
							log.info(elementUtil.getText(messages));

						}//end of else if
						else if(operation.equalsIgnoreCase("To Repair"))
						{
							try {
								if(toRepairBtn.isDisplayed())
								{	
									elementUtil.clickElement(toRepairBtn);
									log.info(elementUtil.getText(messages));
								}
							} catch (NoSuchElementException e3) {
								log.error("No operation Performed As " + operation + " Button Not available ");
							}
							
						}//end of else if
						else
						{
							log.error("Value provided for Operation [ " +operation+ " ] Is Improper, hence no operation performed on record with Profile Name : " +ProfileName+ " Value should be Approve/Reject/To Repair");
						}//end of else
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
			String CheckAllBtn = map.get("Check All(Y/N)");
			String UnCheckAllBtn=map.get("UnCheck All(Y/N)");
			String Password = map.get("Password(Select/DeSelect)");
			String Logout = map.get("Logout(Select/DeSelect)");
			String administrativeChange_Generate=map.get("Administrative Change-Generate(Select/DeSelect)");
			String administrativeChange_List=map.get("Administrative Change-List(Select/DeSelect)");
			String activeUsers_List=map.get("Active Users-List(Select/DeSelect)");
			String activeUsers_ForceLogout=map.get("Active Users-Force Logout(Select/DeSelect)");
			String InactivityReport=map.get("Inactivity Report(Select/DeSelect)");			
			String SecurityIncidents=map.get("Security Incidents(Select/DeSelect)");			
			String LogView=map.get("Log-View(Select/DeSelect)");
			String User_List = map.get("User-List(Select/DeSelect)");
			String User_Add = map.get("User-Add(Select/DeSelect)");
			String User_ModifyRepair = map.get("User-Modify/Repair(Select/DeSelect)");
			String User_Approve = map.get("User-Approve(Select/DeSelect)");
			String User_BlockUnblock = map.get("User-Block/Unblock(Select/DeSelect)");
			String User_Remove = map.get("User-Remove(Select/DeSelect)");
			String User_Report = map.get("User-Report(Select/DeSelect)");
			String Group_List = map.get("Group-List(Select/DeSelect)");
			String Group_Add = map.get("Group-Add(Select/DeSelect)");
			String Group_Modify = map.get("Group-Modify(Select/DeSelect)");
			String Group_Approve = map.get("Group-Approve(Select/DeSelect)");
			String Group_Block = map.get("Group-Block(Select/DeSelect)");
			String Group_Unblock = map.get("Group-Unblock(Select/DeSelect)");
			String Group_Remove = map.get("Group-Remove(Select/DeSelect)");
			String Group_ReportBuild = map.get("Group-ReportBuild(Select/DeSelect)");
			String Group_ReportView = map.get("Group-ReportView(Select/DeSelect)");
			String Profiles_List = map.get("Profiles-List(Select/DeSelect)");
			String Profiles_Add = map.get("Profiles-Add(Select/DeSelect)");
			String Profiles_Modify = map.get("Profiles-Modify/Repair(Select/DeSelect)");
			String Profiles_Approve = map.get("Profiles-Approve(Select/DeSelect)");
			String Profiles_Remove = map.get("Profiles-Remove(Select/DeSelect)");
			String Profiles_ReportBuild = map.get("Profiles-ReportBuild(Select/DeSelect)");
			String Profiles_ReportView = map.get("Profiles-ReportView(Select/DeSelect)");
			String Environment_GlobalProcess= map.get("Environment-Global Process(Select/DeSelect)");
			String Environment_Run = map.get("Environment-Run(Select/DeSelect)");
			String Environment_Show=map.get("Environment-Show(Select/DeSelect)");
			String SecurityParameters_View = map.get("Security Parameters-View(Select/DeSelect)");
			String Security_Parameters_Modify = map.get("Security Parameters-Modify(Select/DeSelect)");
			String Security_Parameters_Approve = map.get("Security Parameters-Approve(Select/DeSelect)");
			String accessTime_View = map.get("Access Time-View(Select/DeSelect)");
			String accessTime_Modify = map.get("Access Time-Modify(Select/DeSelect)");
			String accessTime_Approve = map.get("Access Time-Approve(Select/DeSelect)");
			String userPersonalization= map.get("UserPersonalization(Select/DeSelect)");
			String handlerStatus=map.get("HandlerStatus(Select/DeSelect)");
			String Calendar_View = map.get("Calendar-View(Select/DeSelect)");
			String Calendar_Create = map.get("Calendar-Create(Select/DeSelect)");
			String Calendar_Modify = map.get("Calendar-Modify/Repair(Select/DeSelect)");
			String Calendar_Approve = map.get("Calendar-Approve(Select/DeSelect)");
			String Certificate_List = map.get("Certificate-List(Select/DeSelect)");
			String Certificate_Add = map.get("Certificate-Add(Select/DeSelect)");
			String Certificate_Modify = map.get("Certificate-Modify(Select/DeSelect)");
			String Certificate_Delete = map.get("Certificate-Delete(Select/DeSelect)");
			String DBLoads = map.get("DB Loads(Select/DeSelect)");
			String parameterMaintenance=map.get("Parameter Maintenance(Select/DeSelect)");
			String bankInterfaceParameter_View=map.get("Bank Interface Parameter-View(Select/DeSelect)");
			String bankInterfaceParameter_Modify=map.get("Bank Interface Parameter-Modify(Select/DeSelect)");
			String DistributionSets_List = map.get("Distribution Sets-List(Select/DeSelect)");
			String DistributionSets_Add = map.get("Distribution Sets-Add(Select/DeSelect)");
			String DistributionSets_Approve = map.get("Distribution Sets-Approve(Select/DeSelect)");
			String DistributionSets_Modify = map.get("Distribution Sets-Modify(Select/DeSelect)");
			String DistributionSets_Delete = map.get("Distribution Sets-Delete(Select/DeSelect)");
			String Messages_View = map.get("Messages-View(Select/DeSelect)");
			String Messages_New = map.get("Messages-New(Select/DeSelect)");
			String consoleNotificationsList=map.get("Console Notification-List(Select/DeSelect)");
			String consoleNotificationsSend=map.get("Console Notification-Send(Select/DeSelect)");
			String FTPSFTPParameters_List = map.get("FTP-SFTP Parameters-List(Select/DeSelect)");
			String FTPSFTPParameters_Add = map.get("FTP-SFTP Parameters-Add(Select/DeSelect)");
			String FTPSFTPParameters_Modify = map.get("FTP-SFTP Parameters-Modify(Select/DeSelect)");
			String FTPSFTPParameters_FTPSFTPFileList = map.get("FTP-SFTP Parameters-FTP-SFTP File List(Select/DeSelect)");
			String FileManager_ListPaymentFiles=map.get("List Payment Files(Select/DeSelect)");
			String FileManager_ListAVFiles=map.get("List AV Files(Select/DeSelect)");		
			String ListDSCEnrollment=map.get("List DSC Enrollment(Select/DeSelect)");
			String VerifyDSCEnrollment=map.get("Verify DSC Enrollment(Select/DeSelect)");	
			String ApproveDSCEnrollment=map.get("Approve DSC Enrollment(Select/DeSelect)");
			String Maker=map.get("Maker(Select/DeSelect)");
			String Checker=map.get("Checker(Select/DeSelect)");
			String agencyFileList=map.get("Agency File-List(Select/DeSelect)");
			String agencyFileApprove=map.get("Agency File-Approve File(Select/DeSelect)");
			String agencydashboard=map.get("Agency File-Agency Dashboard(Select/DeSelect)");
			String paymentList=map.get("Payment List(Select/DeSelect)");
			String manualIntervention_MainPosting=map.get("Manual Intervention-Main Posting(Select/DeSelect)");
			String manualIntervention_BulkPosting=map.get("Manual Intervention-Bulk Posting(Select/DeSelect)");
			String manualIntervention_DSCReprocess=map.get("Manual Intervention-DSC Reprocess(Select/DeSelect)");
			String manualIntervention_ApproveDSCReprocess=map.get("Manual Intervention-Approve DSC Reprocess(Select/DeSelect)");
			String manualIntervention_RepostTransaction=map.get("Manual Intervention-Repost Transaction(Select/DeSelect)");
			String manualIntervention_DbConnection=map.get("Manual Intervention-Db Connection(Select/DeSelect)");		
			String manualIntervention_AckGeneration=map.get("Manual Intervention-Ack Generation(Select/DeSelect)");	
			String LateReturn_List=map.get("Late Return-File Upload(Select/DeSelect)");
			String LateReturn_FileUpload=map.get("Manual Intervention-File Upload(Select/DeSelect)");
			String ACHAPBSReprocess=map.get("ACH/APBS Reprocess(Select/DeSelect)");		
			String NEFTReprocess=map.get("NEFT Reprocess(Select/DeSelect)");			
			String NHMEnquiry=map.get("NHM Enquiry(Select/DeSelect)");		
			String AVRepostFiles=map.get("AV Repost Files(Select/DeSelect)");
			String PFMSDashboard=map.get("PFMSDashboard(Select/DeSelect)");	
			String PFMSAgencyDashboard=map.get("PFMSAgencyDashboard(Select/DeSelect)");
			String ACKNACKDashboard=map.get("ACKNACKDashboard(Select/DeSelect)");
			String AVDashboard=map.get("AVDashboard(Select/DeSelect)");
			String MissingDebitAdviceList=map.get("Missing Debit Advice List(Select/DeSelect)");
			String Customer_List = map.get("Customer-List(Select/DeSelect)");
			String Customer_Add = map.get("Customer-Add(Select/DeSelect)");
			String Customer_Approve = map.get("Customer-Approve(Select/DeSelect)");
			String Customer_Modify = map.get("Customer-Modify(Select/DeSelect)");
			String Customer_Delete = map.get("Customer-Delete(Select/DeSelect)");
			String Customer_ConfirmDelete = map.get("Customer-Confirm Delete(Select/DeSelect)");
			String Account_List = map.get("Account-List(Select/DeSelect)");
			String Account_Add = map.get("Account-Add(Select/DeSelect)");
			String Account_Approve = map.get("Account-Approve(Select/DeSelect)");
			String Account_Modify = map.get("Account-Modify(Select/DeSelect)");
			String Account_Delete = map.get("Account-Delete(Select/DeSelect)");
			String Account_ConfirmDelete = map.get("Account-Confirm Delete(Select/DeSelect)");
			String AccountCertificateUpload= map.get("Account Certificate Upload(Select/DeSelect)");
			String AccountCertificateList=map.get("Account Certificate List(Select/DeSelect)");
			String UserManual_Upload=map.get("User Manual-Upload(Select/DeSelect)");
			String UserManual_Download=map.get("User Manual-Download(Select/DeSelect)");
			String UserManual_Delete=map.get("User Manual-Delete(Select/DeSelect)");
			String serverFolderView=map.get("Server Folder View(Select/DeSelect)");
			String ReportingHighValueTransactionList=map.get("Reporting High Value Transaction List(Select/DeSelect)");	
			String ReportingHighValueTransactionAdd=map.get("Reporting High Value Transaction Add(Select/DeSelect)");		
			String ReportingHighValueTransactionModify=map.get("Reporting High Value Transaction Modify(Select/DeSelect)");		
			String ReportingHighValueTransactionDelete=map.get("Reporting High Value Transaction Delete(Select/DeSelect)");		
			String ReportingHighValueTransactionApprove=map.get("Reporting High Value Transaction Approve(Select/DeSelect)");	
			String Scheme_List = map.get("Scheme Code Maintenance-List(Select/DeSelect)");
			String Scheme_Add = map.get("Scheme Code Maintenance-Add(Select/DeSelect)");
			String Scheme_Approve = map.get("Scheme Code Maintenance-Approve(Select/DeSelect)");
			String Scheme_Modify = map.get("Scheme Code Maintenance-Modify(Select/DeSelect)");
			String Scheme_Delete = map.get("Scheme Code Maintenance-Delete(Select/DeSelect)");
			String Scheme_Upload = map.get("Scheme Code Maintenance-Upload(Select/DeSelect)");
			String Scheme_BulkApprove = map.get("Scheme Code Maintenance-Bulk Approve(Select/DeSelect)");
			String ErrorCode_List=map.get("ErrorCode-List(Select/DeSelect)");		
			String ErrorCode_Add=map.get("ErrorCode-Add(Select/DeSelect)");		
			String ErrorCode_Approve=map.get("ErrorCode-Approve(Select/DeSelect)");		
			String ErrorCode_Modify=map.get("ErrorCode-Modify(Select/DeSelect)");	
			String ErrorCode_Delete=map.get("ErrorCode-Delete(Select/DeSelect)");	
			String ErrorCode_Upload=map.get("ErrorCode-Upload(Select/DeSelect)");	
			String ErrorCode_BulkApprove=map.get("ErrorCode-Bulk Approve(Select/DeSelect)"); 
			String PPAExpiryDays_List=map.get("PPA Expiry Days-List(Select/DeSelect)");
			String PPAExpiryDays_Add=map.get("PPA Expiry Days-Add(Select/DeSelect)");		
			String PPAExpiryDays_Modify	=map.get("PPA Expiry Days-Modify(Select/DeSelect)");	
			String PPAExpiryDays_Approve=map.get("PPA Expiry Days-Approve(Select/DeSelect)");
			String PPAExpiryDate_List=map.get("PPA Expiry Date-List(Select/DeSelect)");
			String PPAExpiryDate_Update=map.get("PPA Expiry Date-Update(Select/DeSelect)");		
			String PPAExpiryDate_Approve=map.get("PPA Expiry Date-Approve(Select/DeSelect)");	
			String DebitHotList_List = map.get("DebitHotList-List(Select/DeSelect)");
			String DebitHotList_Add = map.get("DebitHotList-Add(Select/DeSelect)");
			String DebitHotList_Approve = map.get("DebitHotList-Approve(Select/DeSelect)");
			String DebitHotList_Modify = map.get("DebitHotList-Modify(Select/DeSelect)");
			String DebitHotList_Delete = map.get("DebitHotList-Delete(Select/DeSelect)");
			String DebitHotList_Upload = map.get("DebitHotList-Upload(Select/DeSelect)");
			String DebitHotList_BulkApprove = map.get("DebitHotList-Bulk Approve(Select/DeSelect)");
			String NHMAccountMaster_List=map.get("NHM Account Master-List(Select/DeSelect)");
			String NHMAccountMaster_Add=map.get("NHM Account Master-Add(Select/DeSelect)");
			String NHMAccountMaster_Approve=map.get("NHM Account Master-Approve(Select/DeSelect)");
			String NHMAccountMaster_Modify=map.get("NHM Account Master-Modify(Select/DeSelect)");
			String NHMAccountMaster_Delete=map.get("NHM Account Master-Delete(Select/DeSelect)");
			String NHMAPIAccountMaster_List=map.get("NHM API Account Master-List(Select/DeSelect)");
			String NHMAPIAccountMaster_Add=map.get("NHM API Account Master-Add(Select/DeSelect)");
			String NHMAPIAccountMaster_Approve=map.get("NHM API Account Master-Approve(Select/DeSelect)");
			String NHMAPIAccountMaster_Modify=map.get("NHM API Account Master-Modify(Select/DeSelect)");
			String NHMAPIAccountMaster_Delete=map.get("NHM API Account Master-Delete(Select/DeSelect)");
			String Report_Reconciliation = map.get("Report-Reconciliation(Select/DeSelect)");
			String Report_TransactionReport = map.get("Report-Transaction Report(Select/DeSelect)");
			String OperationReport = map.get("Report-Operation Report(Select/DeSelect)");
			String NACHPaymentReport= map.get("NACH Payment Report(Select/DeSelect)");
			String NPCIExceptionReport = map.get("NPCI Exception Report(Select/DeSelect)");
			String ZeroByteFile=map.get("Report-Zero Byte File(Select/DeSelect)");
			String FileStatusReport=map.get("File Status Report(Select/DeSelect)");
			String ApplicationSupportTools_LogExplorer = map.get("Application Support Tools-Log Explorer(Select/DeSelect)");
			String ApplicationSupportTools_SystemInfo = map.get("Application Support Tools-System Info(Select/DeSelect)");
			String ApplicationSupportTools_InjectionStatistics=map.get("Application Support Tools-Injection Statistics(Select/DeSelect)");
			String ApplicationSupportTools_LockManagement = map.get("Application Support Tools-Lock Management(Select/DeSelect)");
			String ApplicationSupportTools_ServerConnections=map.get("Application Support Tools-Server Connections(Select/DeSelect)");
			String ApplicationSupportTools_QueueMessageUploader=map.get("Application Support Tools-Queue Message Uploader(Select/DeSelect)");
			String ApplicationSupportTools_QueueMessageDownloader=map.get("Application Support Tools-Queue Message Downloader(Select/DeSelect)");
			String ApplicationSupportTools_InstanceName= map.get("Application Support Tools-Instance Name(Select/DeSelect)");
			String ApplicationSupportTools_PPAUpload = map.get("Application Support Tools-PPA Upload(Select/DeSelect)");
			String ApplicationSupportTools_ExecuteQuery = map.get("Application Support Tools-Execute Query(Select/DeSelect)");
		

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

					String ExpectedCancelBtnValidationMsg = "Operation Modify/Repair profile was cancelled.";

					if (elementUtil.getText(errorMessages).trim().toString().equals(ExpectedCancelBtnValidationMsg.trim().toString())) {
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

					String profileModifyScreenErrorMessageexpected="Profile Name is required.\n" + "You must select some menu checkboxes";

					if (elementUtil.getText(errorMessages).trim().toString().equals(profileModifyScreenErrorMessageexpected.trim().toString())) {
						log.info("Mandatory Fields Validation Message For Profile Modify/Repair Screen Displayed Is Correct");
					} else {
						log.info("Mandatory Fields Validation Message For Profile Modify/Repair Screen Displayed Is Incorrect");
					}
					
					elementUtil.SHORT_TIMEOUT();
					elementUtil.clickElement(restartWorkFlowBtn);
					
					elementUtil.enterText(filterScreenProfileNameTxtField, originalProfileName);
					elementUtil.clickElement(okBtn);
					
					elementUtil.clickElement(modifyRecord);
					
					elementUtil.clearText(profileNameTxtField);
					elementUtil.clearText(profileDescTxtField);
					
					elementUtil.SHORT_TIMEOUT();
					elementUtil.enterText(profileNameTxtField, ProfileName);
					elementUtil.enterText(profileDescTxtField, ProfileDescription);
				
					if(CheckAllBtn.equalsIgnoreCase("Y"))
					{
						elementUtil.clickElement(btnChkAll);
					}
					else if(UnCheckAllBtn.equals("Y"))
					{
						elementUtil.clickElement(btnUnChkAll);
					}
					else if(CheckAllBtn.equalsIgnoreCase("N") && UnCheckAllBtn.equalsIgnoreCase("N"))
					{
						elementUtil.isElementCheckBoxSelected(passwordCheckbox, Password);
						elementUtil.isElementCheckBoxSelected(logoutCheckbox, Logout);
						
						elementUtil.isElementCheckBoxSelected(administrativeChangGenerateChkBox,administrativeChange_Generate);
						elementUtil.isElementCheckBoxSelected(administrativeChangeListChkBox,administrativeChange_List);
						
						elementUtil.isElementCheckBoxSelected(activeUsersListChkBox,activeUsers_List);
						elementUtil.isElementCheckBoxSelected(activeUsersForceLogoutChkBox,activeUsers_ForceLogout);
								
						elementUtil.isElementCheckBoxSelected(inactivityReportChkBox,InactivityReport);
						elementUtil.isElementCheckBoxSelected(securityIncidentReportChkBox,SecurityIncidents);
						elementUtil.isElementCheckBoxSelected(logViewCheckbox,LogView);
						
						elementUtil.isElementSelected(userListCheckbox, User_List);
						elementUtil.isElementSelected(userAddCheckbox, User_Add);
						elementUtil.isElementSelected(userModifyCheckbox, User_ModifyRepair);
						elementUtil.isElementSelected(userApproveCheckbox, User_Approve);
						elementUtil.isElementSelected(userBlockUnblockCheckbox, User_BlockUnblock);
						elementUtil.isElementSelected(userRemoveCheckbox, User_Remove);
						elementUtil.isElementSelected(userReportViewCheckbox, User_Report);
						
						elementUtil.isElementSelected(groupListCheckbox, Group_List);
						elementUtil.isElementSelected(groupAddCheckbox, Group_Add);
						elementUtil.isElementSelected(groupModifyCheckbox, Group_Modify);
						elementUtil.isElementSelected(groupApproveCheckbox, Group_Approve);
						elementUtil.isElementSelected(groupBlockCheckbox, Group_Block);
						elementUtil.isElementSelected(groupUnblockCheckbox, Group_Unblock);
						elementUtil.isElementSelected(groupRemoveCheckbox, Group_Remove);
						elementUtil.isElementSelected(groupReportBuildCheckbox, Group_ReportBuild);
						elementUtil.isElementSelected(groupReportViewCheckbox, Group_ReportView);
						
						elementUtil.isElementSelected(profilesListCheckbox, Profiles_List);
						elementUtil.isElementSelected(profilesAddCheckbox, Profiles_Add);
						elementUtil.isElementSelected(profilesModifyCheckbox, Profiles_Modify);
						elementUtil.isElementSelected(profilesApproveCheckbox, Profiles_Approve);
						elementUtil.isElementSelected(profilesRemoveCheckbox, Profiles_Remove);
						elementUtil.isElementSelected(profilesReportBuildCheckbox, Profiles_ReportBuild);
						elementUtil.isElementSelected(profilesReportViewCheckbox, Profiles_ReportView);
					
						
						elementUtil.isElementSelected(environmentGlobalProcessesCheckbox, Environment_GlobalProcess);
						elementUtil.isElementSelected(environmentRunCheckbox, Environment_Run);
						elementUtil.isElementSelected(environmentShowCheckbox, Environment_Show);
						
						
						elementUtil.isElementSelected(securityParametersViewCheckbox,SecurityParameters_View);
						elementUtil.isElementSelected(securityParametersModifyCheckbox,Security_Parameters_Modify);
						elementUtil.isElementSelected(securityParametersApproveCheckbox,Security_Parameters_Approve);
						

						elementUtil.isElementSelected(accessTimeViewCheckbox, accessTime_View);
						elementUtil.isElementSelected(accessTimeModifyCheckbox, accessTime_Modify);
						elementUtil.isElementSelected(accessTimeApproveCheckbox, accessTime_Approve);
						
						elementUtil.isElementSelected(userPersonalizaCheckbox, userPersonalization);
						elementUtil.isElementSelected(handlerStatusCheckbox, handlerStatus);
						
						
						elementUtil.isElementSelected(calendarViewCheckbox, Calendar_View);
						elementUtil.isElementSelected(calendarCreateCheckbox, Calendar_Create);
						elementUtil.isElementSelected(calendarModifyCheckbox, Calendar_Modify);
						elementUtil.isElementSelected(calendarApproveCheckbox, Calendar_Approve);
						
						elementUtil.isElementSelected(certificateListCheckbox, Certificate_List);
						elementUtil.isElementSelected(certificateAddCheckbox, Certificate_Add);
						elementUtil.isElementSelected(certificateModifyCheckbox, Certificate_Modify);
						elementUtil.isElementSelected(certificateDeleteCheckbox, Certificate_Delete);
						
						elementUtil.isElementSelected(dbLoadsCheckbox,DBLoads);
						
						elementUtil.isElementSelected(parameterMaintenanceCheckbox,parameterMaintenance);
						elementUtil.isElementSelected(bankInterfaceViewCheckbox, bankInterfaceParameter_View);
						elementUtil.isElementSelected(bankInterfaceModifyCheckbox,bankInterfaceParameter_Modify);
						
						elementUtil.isElementSelected(distributionSetsListCheckbox, DistributionSets_List);
						elementUtil.isElementSelected(distributionSetsAddCheckbox, DistributionSets_Add);
						elementUtil.isElementSelected(distributionSetsApproveCheckbox, DistributionSets_Approve);
						elementUtil.isElementSelected(distributionSetsModifyCheckbox, DistributionSets_Modify);
						elementUtil.isElementSelected(distributionSetsDeleteCheckbox, DistributionSets_Delete);
						
						elementUtil.isElementSelected(messagesViewCheckbox, Messages_View);
						elementUtil.isElementSelected(messagesNewCheckbox, Messages_New);
					
						elementUtil.isElementSelected(consoleNotificationsListCheckbox, consoleNotificationsList);
						elementUtil.isElementSelected(consoleNotificationsSendCheckbox, consoleNotificationsSend);
					
						elementUtil.isElementSelected(ftpsftpParametersListCheckbox, FTPSFTPParameters_List);
						elementUtil.isElementSelected(ftpsftpParametersAddCheckbox, FTPSFTPParameters_Add);
						elementUtil.isElementSelected(ftpsftpParametersModifyCheckbox, FTPSFTPParameters_Modify);
						elementUtil.isElementSelected(ftpsftpParametersFTPSFTPFileListCheckbox, FTPSFTPParameters_FTPSFTPFileList);
						
						elementUtil.isElementSelected(listPaymentFilesCheckbox, FileManager_ListPaymentFiles);
						elementUtil.isElementSelected(listAVFilesCheckbox, FileManager_ListAVFiles);
						elementUtil.isElementSelected(enrollmentFilesListDSCEnrollmentCheckbox,ListDSCEnrollment);
						elementUtil.isElementSelected(enrollmentFilesVerifyDSCEnrollmentCheckbox,VerifyDSCEnrollment);
						elementUtil.isElementSelected(enrollmentFilesApproveDSCEnrollmentCheckbox,ApproveDSCEnrollment );
						
						elementUtil.isElementSelected(makerCheckbox, Maker);
						elementUtil.isElementSelected(checkerCheckbox,Checker);
						
						elementUtil.isElementSelected(agencyFileListCheckbox, agencyFileList);
						elementUtil.isElementSelected(agencyFileApproveFileCheckbox,agencyFileApprove);
						elementUtil.isElementSelected(agencyDashboardCheckbox, agencydashboard);
						
						elementUtil.isElementSelected(paymentListChkBox,paymentList);
						
						elementUtil.isElementSelected(manualInterventionMainPostingCheckbox,manualIntervention_MainPosting);
						elementUtil.isElementSelected(manualInterventionBulkPostingCheckbox,manualIntervention_BulkPosting);
						elementUtil.isElementSelected(manualInterventionDSCReprocessCheckbox,manualIntervention_DSCReprocess);
						elementUtil.isElementSelected(manualInterventionApproveDSCReprocessCheckbox,manualIntervention_ApproveDSCReprocess);
						elementUtil.isElementSelected(manualInterventionRepostTransactionCheckbox,manualIntervention_RepostTransaction);
						elementUtil.isElementSelected(manualInterventionDbConnectionCheckbox,manualIntervention_DbConnection);
						elementUtil.isElementSelected(manualInterventionAckGenerationCheckbox,manualIntervention_AckGeneration);
						elementUtil.isElementSelected(LateReturnListCheckbox,LateReturn_List);
						elementUtil.isElementSelected(LateReturnFileUploadCheckbox,LateReturn_FileUpload);
						
						elementUtil.isElementSelected(ACHAPBSReprocessCheckbox,ACHAPBSReprocess);
						elementUtil.isElementSelected(NEFTReprocessCheckBox,NEFTReprocess);
						elementUtil.isElementSelected(NHMEnquiryCheckBox,NHMEnquiry);
						elementUtil.isElementSelected(AVRepostFilesCheckBox,AVRepostFiles);
						elementUtil.isElementSelected(pfmsDashboardCheckbox,PFMSDashboard);
						elementUtil.isElementSelected(pfmsAgencyDashboardCheckBox,PFMSAgencyDashboard);
						elementUtil.isElementSelected(ACKNACKDashboardCheckBox,ACKNACKDashboard);
						elementUtil.isElementSelected(AVDashboardCheckBox,AVDashboard);
						
						elementUtil.isElementSelected(missingDebitListAdviceCheckBox,MissingDebitAdviceList);
						
						elementUtil.isElementSelected(customerListCheckbox, Customer_List);
						elementUtil.isElementSelected(customerAddCheckbox, Customer_Add);
						elementUtil.isElementSelected(customerApproveCheckbox, Customer_Approve);
						elementUtil.isElementSelected(customerModifyCheckbox, Customer_Modify);
						elementUtil.isElementSelected(customerDeleteCheckbox, Customer_Delete);
						elementUtil.isElementSelected(customerConfirmDeleteCheckbox, Customer_ConfirmDelete);
						
						elementUtil.isElementSelected(accountListCheckbox,Account_List);
						elementUtil.isElementSelected(accountAddCheckbox, Account_Add);
						elementUtil.isElementSelected(accountApproveCheckbox, Account_Approve);
						elementUtil.isElementSelected(accountModifyCheckbox, Account_Modify);
						elementUtil.isElementSelected(accountDeleteCheckbox,Account_Delete);
						elementUtil.isElementSelected(accountConfirmDeleteCheckbox,Account_ConfirmDelete);
						
						elementUtil.isElementSelected(accountCertificateUploadCheckbox,AccountCertificateUpload);
						elementUtil.isElementSelected(accountCertificateListCheckbox,AccountCertificateList);
						
						elementUtil.isElementSelected(userManualUploadCheckbox,UserManual_Upload);
						elementUtil.isElementSelected(userManualDownloadCheckbox,UserManual_Download);
						elementUtil.isElementSelected(userManualDeleteCheckbox,UserManual_Delete);
						
						elementUtil.isElementSelected(serverFolderViewCheckBox,serverFolderView);
						
						elementUtil.isElementSelected(reportHighValueTransactionListCheckBox,ReportingHighValueTransactionList);
						elementUtil.isElementSelected(reportHighValueTransactionAddCheckBox, ReportingHighValueTransactionAdd);
						elementUtil.isElementSelected(reportHighValueTransactionApproveCheckBox,ReportingHighValueTransactionApprove);
						elementUtil.isElementSelected(reportHighValueTransactionModifyCheckBox, ReportingHighValueTransactionModify);
						elementUtil.isElementSelected(reportHighValueTransactionDeleteCheckBox,ReportingHighValueTransactionDelete);
						
						elementUtil.isElementSelected(schemeListCheckbox, Scheme_List);
						elementUtil.isElementSelected(schemeAddCheckbox, Scheme_Add);
						elementUtil.isElementSelected(schemeApproveCheckbox, Scheme_Approve);
						elementUtil.isElementSelected(schemeModifyCheckbox, Scheme_Modify);
						elementUtil.isElementSelected(schemeDeleteCheckbox, Scheme_Delete);
						elementUtil.isElementSelected(schemeUploadCheckbox, Scheme_Upload);
						elementUtil.isElementSelected(schemeBulkApproveCheckbox,Scheme_BulkApprove);
						
						elementUtil.isElementSelected(errorCodeListCheckbox,ErrorCode_List);
						elementUtil.isElementSelected(errorCodeAddCheckbox,ErrorCode_Add);
						elementUtil.isElementSelected(errorCodeApproveCheckbox,ErrorCode_Approve);
						elementUtil.isElementSelected(errorCodeModifyCheckbox, ErrorCode_Modify);
						elementUtil.isElementSelected(errorCodeDeleteCheckbox,ErrorCode_Delete);
						elementUtil.isElementSelected(errorCodeUploadCheckbox,ErrorCode_Upload);
						elementUtil.isElementSelected(errorCodeBulkApproveCheckbox,ErrorCode_BulkApprove);
						
						elementUtil.isElementSelected(ppaExpiryDaysListCheckbox,PPAExpiryDays_List);
						elementUtil.isElementSelected(ppaExpiryDaysAddCheckbox,PPAExpiryDays_Add);
						elementUtil.isElementSelected(ppaExpiryDaysModifyCheckbox,PPAExpiryDays_Modify);
						elementUtil.isElementSelected(ppaExpiryDaysApproveCheckbox,PPAExpiryDays_Approve);
					
						elementUtil.isElementSelected(ppaExpiryDateListCheckbox,PPAExpiryDate_List);
						elementUtil.isElementSelected(ppaExpiryDateUpdateCheckbox,PPAExpiryDate_Update);
						elementUtil.isElementSelected(ppaExpiryDateApproveCheckbox,PPAExpiryDate_Approve);
						
						elementUtil.isElementSelected(debitHotListCheckbox,DebitHotList_List);
						elementUtil.isElementSelected(debitHotListAddCheckbox,DebitHotList_Add);
						elementUtil.isElementSelected(debitHotListApproveCheckbox,DebitHotList_Approve);
						elementUtil.isElementSelected(debitHotListModifyCheckbox,DebitHotList_Modify);
						elementUtil.isElementSelected(debitHotLsitDeleteCheckbox,DebitHotList_Delete);
						elementUtil.isElementSelected(debitHotListUploadCheckbox,DebitHotList_Upload);
						elementUtil.isElementSelected(debitHotListBulkApproveCheckbox,DebitHotList_BulkApprove);
						
						elementUtil.isElementSelected(nhmAccountMasterListCheckbox,NHMAccountMaster_List);
						elementUtil.isElementSelected(nhmAccountMasterAddCheckbox,NHMAccountMaster_Add);
						elementUtil.isElementSelected(nhmAccountMasterApproveCheckbox,NHMAccountMaster_Approve);
						elementUtil.isElementSelected(nhmAccountMasterModifyCheckbox,NHMAccountMaster_Modify);
						elementUtil.isElementSelected(nhmAccountMasterDeleteCheckbox,NHMAccountMaster_Delete);
						
						elementUtil.isElementSelected(nhmAPIAccountMasterListCheckbox,NHMAPIAccountMaster_List);
						elementUtil.isElementSelected(nhmAPIAccountMasterAddCheckbox,NHMAPIAccountMaster_Add);
						elementUtil.isElementSelected(nhmAPIAccountMasterApproveCheckbox,NHMAPIAccountMaster_Approve);
						elementUtil.isElementSelected(nhmAPIAccountMasterModifyCheckbox,NHMAPIAccountMaster_Modify);
						elementUtil.isElementSelected(nhmAPIAccountMasterDeleteCheckbox,NHMAPIAccountMaster_Delete);
						
						elementUtil.isElementSelected(operationReportCheckBox,OperationReport);
						elementUtil.isElementSelected(transactionReportCheckBox,Report_TransactionReport);
						elementUtil.isElementSelected(nachPaymentReportCheckBox,NACHPaymentReport);
						elementUtil.isElementSelected(reconciliationReportCheckBox,Report_Reconciliation);
						elementUtil.isElementSelected(npciExceptionReportCheckBox,NPCIExceptionReport);
						elementUtil.isElementSelected(zeroByteFileCheckBox,ZeroByteFile);
						elementUtil.isElementSelected(fileStatusReportCheckBox,FileStatusReport);
						
						elementUtil.isElementSelected(applicationSupportToolsLogExplorerCheckbox, ApplicationSupportTools_LogExplorer);
						elementUtil.isElementSelected(applicationSupportToolsSystemInfoCheckbox, ApplicationSupportTools_SystemInfo);
						elementUtil.isElementSelected(applicationSupportToolsInjectionStatisticsCheckbox,ApplicationSupportTools_InjectionStatistics);
						elementUtil.isElementSelected(applicationSupportToolsLockManagementCheckbox,ApplicationSupportTools_LockManagement);
						elementUtil.isElementSelected(applicationSupportToolsServerConnectionsCheckbox, ApplicationSupportTools_ServerConnections);
						elementUtil.isElementSelected(applicationSupportToolsQueueMessageUploaderCheckbox, ApplicationSupportTools_QueueMessageUploader);
						elementUtil.isElementSelected(applicationSupportToolsQueueMessageDownloaderCheckbox, ApplicationSupportTools_QueueMessageDownloader);
						elementUtil.isElementSelected(applicationSupportToolsInstanceNameCheckbox, ApplicationSupportTools_InstanceName);
						elementUtil.isElementSelected(applicationSupportToolsPPAUploadCheckbox,ApplicationSupportTools_PPAUpload);
						elementUtil.isElementSelected(applicationSupportToolsExecuteQueryCheckbox,ApplicationSupportTools_ExecuteQuery);
					}
					else
					{
						log.error("Value Provided For Check All(Y/N) : " + " [ " + CheckAllBtn + " ] is Improper");
					}

					elementUtil.clickElement(okBtn);
					try {

						if(elementUtil.getText(errorMessages).trim().toString().equals("Profile already exists".trim().toString()))
						{
							log.info("Duplicate Record Found Record With Profile " +ProfileName+ " Already Exists");
						}//end of if
						else
						{
							log.error(elementUtil.getText(errorMessages));
						}//end of else
					} catch (NoSuchElementException e2) {
						elementUtil.clickElement(okBtn);
						log.info(elementUtil.getText(messages));
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
