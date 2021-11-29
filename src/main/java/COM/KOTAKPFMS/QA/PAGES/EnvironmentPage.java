package COM.KOTAKPFMS.QA.PAGES;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import COM.KOTAKPFMS.QA.UTIL.ElementUtil;

/**
 * @Author -- Suvarna Prabhumatkari
 **/

public class EnvironmentPage {
/*	private WebDriver driver;
	ElementUtil elementUtil;
	Logger log = Logger.getLogger(EnvironmentPage.class);

	// WebElements for Environment Page
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:sodExecutorc2")
	WebElement sodStatus;
	
	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:sodExecutor")
	WebElement sodcheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:eodExecutorc2")
	WebElement eodStatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:eodExecutor")
	WebElement eodcheckbox;

	@FindBy(id = "modalDialogContinue")
	WebElement continuebutton;

	@FindBy(xpath = "//*[@id=\"preconditionEnforceAdvice\"]/table/tbody/tr/td[2]/input")
	WebElement manageBtn;

	@FindBy(name = "env.run.continue")
	WebElement returnButton;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps")
	WebElement bdcheckbox;

	@FindBy(id = "SET_BUSINESS_DATE_ACTION")
	WebElement setBusinessDateButton;
	
	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td/span")
	WebElement businessDateSubmitBtnMsg;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
	WebElement bdSubmitbutton;

	@FindBy(id = "SWITCH_RESOURCE_ACTION")
	WebElement switchResourceButton;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement environmentokbutton;

	@FindBy(xpath = "//*[@id='adviceId' and @class='visible']")
	WebElement buttonVisibility;
	
	@FindBy(name ="RUN_INTEGRATED_JOB_REEVALUATE")
	WebElement reEvaluateBtn;
 
	@FindBy(xpath ="//*[@id=\"pageBody\"]/form/table[2]/tbody/tr[4]/td/div/table/tbody/tr[1]/td/select")
	WebElement preconditionsFilterDropdown;
	
	@FindBy(id ="RUN_INTEGRATED_JOB_CONFIRM")
	WebElement proceedBtn;

	// WebElements for Server's Status and checkbox 
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:envEventServerc2")
	WebElement envEventServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:envEventServer")
	WebElement envEventServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:remoteResourceServerc2")
	WebElement remoteResourceServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:remoteResourceServer")
	WebElement remoteResourceServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:remoteLogConsoleServerc2")
	WebElement remoteLogConsoleServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:remoteLogConsoleServer")
	WebElement remoteLogConsoleServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:schedulerTrackerc2")
	WebElement schedulerTrackerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:schedulerTracker")
	WebElement schedulerTrackercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:updaterServerc2")
	WebElement updaterServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:updaterServer")
	WebElement updaterServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:EmailServerc2")
	WebElement emailServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:EmailServer")
	WebElement emailServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:ReportEventProducerServerc2")
	WebElement ReportEventProducerServerstatus;
	
	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:ReportEventProducerServer")
	WebElement ReportEventProducerServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps:ReportGeneratorServerc2")
	WebElement ReportGeneratorServerstatus;
	
	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps:ReportGeneratorServer")
	WebElement ReportGeneratorServercheckbox;

	// WebElements for SFTP Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SFTPDownloadServerc2")
	WebElement SFTPDownloadServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SFTPDownloadServer")
	WebElement SFTPDownloadServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SFTPUploadServerc2")
	WebElement SFTPUploadServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SFTPUploadServer")
	WebElement SFTPUploadServercheckbox;

	// WebElements for File Processor Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileReadServerc2")
	WebElement FileReadServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileReadServer")
	WebElement FileReadServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileValidateServerc2")
	WebElement FileValidateServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileValidateServer")
	WebElement FileValidateServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:PfmsBatchQueueServerc2")
	WebElement PfmsBatchQueueServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:PfmsBatchQueueServer")
	WebElement PfmsBatchQueueServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:MainFilePayCreationServerc2")
	WebElement MainFilePayCreationServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:MainFilePayCreationServer")
	WebElement MainFilePayCreationServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FutureRolloverServerc2")
	WebElement FutureRolloverServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FutureRolloverServer")
	WebElement FutureRolloverServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileExpiryServerc2")
	WebElement FileExpiryServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileExpiryServer")
	WebElement FileExpiryServercheckbox;

	// WebElements for Enrollment Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileEnrolmentMatcherServerc2")
	WebElement FileEnrolmentMatcherServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileEnrolmentMatcherServer")
	WebElement FileEnrolmentMatcherServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:DscEnrollementServerc2")
	WebElement DscEnrollementServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:DscEnrollementServer")
	WebElement DscEnrollementServercheckbox;
	
	// WebElement for Producer Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:GpsReQueueingServerc2")
	WebElement GpsReQueueingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:GpsReQueueingServer")
	WebElement GpsReQueueingServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:InitAckProducerServerc2")
	WebElement InitAckProducerServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:InitAckProducerServer")
	WebElement InitAckProducerServercheckbox;
	
	// WebElements for MISC Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileStatusUpdateServerc2")
	WebElement FileStatusUpdateServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:FileStatusUpdateServer")
	WebElement FileStatusUpdateServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:DISCExpiryAlertServerc2")
	WebElement DISCExpiryAlertServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:DISCExpiryAlertServer")
	WebElement DISCExpiryAlertServercheckbox;

	// WebElements for ACK NACK Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ReceiptAckServerc2")
	WebElement ReceiptAckServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ReceiptAckServer")
	WebElement ReceiptAckServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:InitAckConsumerServerc2")
	WebElement InitAckConsumerServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:InitAckConsumerServer")
	WebElement InitAckConsumerServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SuccAckServerc2")
	WebElement SuccAckServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SuccAckServer")
	WebElement SuccAckServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:RejectAckServerc2")
	WebElement RejectAckServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:RejectAckServer")
	WebElement RejectAckServercheckbox;

	// WebElements for Posting Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:MainPostingServerc2")
	WebElement MainPostingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:MainPostingServer")
	WebElement MainPostingServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:DupRevPostingServerc2")
	WebElement DupRevPostingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:DupRevPostingServer")
	WebElement DupRevPostingServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:PoolToSettBatchPostingServerc2")
	WebElement PoolToSettBatchPostingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:PoolToSettBatchPostingServer")
	WebElement PoolToSettBatchPostingServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:PoolToAgencyBatchPostingServerc2")
	WebElement PoolToAgencyBatchPostingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:PoolToAgencyBatchPostingServer")
	WebElement PoolToAgencyBatchPostingServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SettToPoolBatchPostingServerc2")
	WebElement SettToPoolBatchPostingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:SettToPoolBatchPostingServer")
	WebElement SettToPoolBatchPostingServercheckbox;

	// WebElements for ONUS Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:OnUsPaymentProcessServerc2")
	WebElement OnUsPaymentProcessServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:OnUsPaymentProcessServer")
	WebElement OnUsPaymentProcessServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:OnusPostingServerc2")
	WebElement OnusPostingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:OnusPostingServer")
	WebElement OnusPostingServercheckbox;

	// WebElements for NEFT Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:NeftPaymentProcessServerc2")
	WebElement NeftPaymentProcessServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:NeftPaymentProcessServer")
	WebElement NeftPaymentProcessServercheckbox;
	
	// WebElements for ACH Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchPaymentProcessServerc2")
	WebElement AchPaymentProcessServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchPaymentProcessServer")
	WebElement AchPaymentProcessServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchOutputServerc2")
	WebElement AchOutputServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchOutputServer")
	WebElement AchOutputServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchResponseReaderServerc2")
	WebElement AchResponseReaderServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchResponseReaderServer")
	WebElement AchResponseReaderServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchResponseProcessServerc2")
	WebElement AchResponseProcessServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AchResponseProcessServer")
	WebElement AchResponseProcessServercheckbox;

	// WebElements for APBS Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsPaymentProcessServerc2")
	WebElement ApbsPaymentProcessServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsPaymentProcessServer")
	WebElement ApbsPaymentProcessServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsOutputServerc2")
	WebElement ApbsOutputServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsOutputServer")
	WebElement ApbsOutputServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsResponseReaderServerc2")
	WebElement ApbsResponseReaderServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsResponseReaderServer")
	WebElement ApbsResponseReaderServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsResponseProcessServerc2")
	WebElement ApbsResponseProcessServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ApbsResponseProcessServer")
	WebElement ApbsResponseProcessServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AadhaarVaultGetReferenceServerc2")
	WebElement AadhaarVaultGetReferenceServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AadhaarVaultGetReferenceServer")
	WebElement AadhaarVaultGetReferenceServercheckbox;
	
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AadhaarVaultForHistoryPaymentsServerc2")
	WebElement AadhaarVaultForHistoryPaymentsServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AadhaarVaultForHistoryPaymentsServer")
	WebElement AadhaarVaultForHistoryPaymentsServercheckbox;
	
	// WebElements for AV Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:CpsmsAVFileRequestServerc2")
	WebElement CpsmsAVFileRequestServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:CpsmsAVFileRequestServer")
	WebElement CpsmsAVFileRequestServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:CpsmsAVProcessingServerc2")
	WebElement CpsmsAVProcessingServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:CpsmsAVProcessingServer")
	WebElement CpsmsAVProcessingServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AVResponseGenerationServerc2")
	WebElement AVResponseGenerationServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AVResponseGenerationServer")
	WebElement AVResponseGenerationServercheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AVAckReadServerc2")
	WebElement AVAckReadServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:AVAckReadServer")
	WebElement AVAckReadServercheckbox;

	// WebElements for SFMS Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:NeftOutputServerc2")
	WebElement NeftOutputServerstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:NeftOutputServer")
	WebElement NeftOutputServercheckbox;

	// WebElements for REPORT Servers
	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ReportEventProducerServerc2")
	WebElement ReportEventProducerServer_Reportstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ReportEventProducerServer")
	WebElement ReportEventProducerServer_Reportcheckbox;

	@FindBy(id = "TRin,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ReportGeneratorServerc2")
	WebElement ReportGeneratorServer_Reportstatus;

	@FindBy(id = "in,in/kotak_pfms,in/kotak_pfms/gps,in/kotak_pfms/gps:ReportGeneratorServer")
	WebElement ReportGeneratorServer_Reportcheckbox;

	// WebElements for Logout function
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	// EnvironmentPage Class Constructor
	public EnvironmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.elementUtil = new ElementUtil(driver);
	}

	//-----To click on Ok button------//
	public void clickonEnvironmentokbutton() throws InterruptedException {
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(environmentokbutton);
	}

	//------To set new Business Date--------//
	public void businessDate() throws InterruptedException {
		String Status = elementUtil.getText(sodStatus);
		String StatusEod = elementUtil.getText(eodStatus);
		if (Status.equals("Not Performed") && StatusEod.equals("Not Performed")) {
			elementUtil.clickElement(bdcheckbox);
			elementUtil.clickElement(setBusinessDateButton);
			elementUtil.clickElement(bdSubmitbutton);
			performSOD();
		} else if (Status.equals("Performed") && StatusEod.equals("Not Performed")) {
			log.info("SOD is already performed");
		} else if (Status.equals("Performed") && StatusEod.equals("Performed")) {
			log.info("SOD is already performed");
			log.info("EOD is already performed");
			elementUtil.clickElement(bdcheckbox);
			elementUtil.clickElement(setBusinessDateButton);
			elementUtil.clickElement(bdSubmitbutton);
			performSOD();
		}
		LogOut();
	}
	
	public void clickEODandManage() throws InterruptedException
	{
		eodcheckbox.click();
		elementUtil.SHORT_TIMEOUT();
		switchResourceButton.click();
		elementUtil.SHORT_TIMEOUT();
//		returnBtnStatus();
		manageBtn.click();
		elementUtil.SHORT_TIMEOUT();
		
		Select sel=new Select (preconditionsFilterDropdown);
		sel.selectByVisibleText("All");
		elementUtil.SHORT_TIMEOUT();
		reEvaluateBtn.click();
		//System.out.println("entering inside");
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list);
		for (WebElement el : list)
		{
			if(!el.isSelected())
				el.click();
			Thread.sleep(100);
		}
		elementUtil.SHORT_TIMEOUT();
		reEvaluateBtn.click();
		elementUtil.SHORT_TIMEOUT();
		proceedBtn.click();
		returnBtnStatus();
		elementUtil.SHORT_TIMEOUT();
		
	}//end 

	//-------To Click on Return Button-------//
	public void returnBtnStatus() throws InterruptedException {
		boolean waitForReturnBtn = true;
		while (waitForReturnBtn) {
			if (null != buttonVisibility) {
				elementUtil.clickElement(returnButton);
				waitForReturnBtn = false;
			} else {
				log.info(new Date() + " start time");
				elementUtil.TIMEOUT();
				log.info(new Date() + " start time");
			}
		}
	}

	//------To perform SOD functionality-------//
	public void performSOD() throws InterruptedException {
		elementUtil.clickElement(sodcheckbox);
		elementUtil.clickElement(switchResourceButton);
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(continuebutton);
		returnBtnStatus();
	}

	//--------Check envEventServer Status-------//
	public void checkenvEventServer() throws InterruptedException {
		String statusenvEventServer = elementUtil.getText(envEventServerstatus);
		if (statusenvEventServer.equals("Inactive")) {
			elementUtil.clickElement(envEventServercheckbox);
			elementUtil.clickElement(switchResourceButton);
			returnBtnStatus();
			checkenvEventServer1();
		} else {
			log.info("envEventServer is already running");
		}
	}

	public void checkenvEventServer1() {
		String statusenvEventServer = elementUtil.getText(envEventServerstatus);
		if (statusenvEventServer.equals("Active")) {
			log.info("envEventServer is started");
		} else {
			log.error("envEventServer is failed to start");
		}
	}

	//-------Check remoteResourceServer Status--------//
	public void checkremoteResourceServer() throws InterruptedException {
		String statusremoteResourceServer = elementUtil.getText(remoteResourceServerstatus);
		if (statusremoteResourceServer.equals("Inactive")) {
			elementUtil.clickElement(remoteResourceServercheckbox);
			elementUtil.clickElement(switchResourceButton);
			returnBtnStatus();
			checkremoteResourceServer1();
		} else {
			log.info("remoteResourceServer is already running");
		}
	}

	public void checkremoteResourceServer1() {
		String statusremoteResourceServer = elementUtil.getText(remoteResourceServerstatus);
		if (statusremoteResourceServer.equals("Active")) {
			log.info("remoteResourceServer is started");
		} else {
			log.error("remoteResourceServer is failed to start");
		}
	}

	//-------Check remoteLogConsoleServer Status---------//
	public void checkremoteLogConsoleServer() throws InterruptedException {
		String statusremoteLogConsoleServer = remoteLogConsoleServerstatus.getText();
		if (statusremoteLogConsoleServer.equals("Inactive")) {
			remoteLogConsoleServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkremoteLogConsoleServer1();
		} else {
			log.info("remoteLogConsoleServer is already running");
		}
	}

	public void checkremoteLogConsoleServer1() {
		String statusremoteLogConsoleServer = remoteLogConsoleServerstatus.getText();
		if (statusremoteLogConsoleServer.equals("Active")) {
			log.info("remoteLogConsoleServer is started");
		} else {
			log.error("remoteLogConsoleServer is failed to start");
		}
	}

	//---------Check schedulerTracker Status--------//
	public void checkschedulerTracker() throws InterruptedException {
		String statusschedulerTracker = schedulerTrackerstatus.getText();
		if (statusschedulerTracker.equals("Inactive")) {
			schedulerTrackercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkschedulerTracker1();
		} else {
			log.info("schedulerTracker is already running");
		}
	}

	public void checkschedulerTracker1() {
		String statusschedulerTracker = schedulerTrackerstatus.getText();
		if (statusschedulerTracker.equals("Active")) {
			log.info("schedulerTracker is started");
		} else {
			log.error("schedulerTracker is failed to start");
		}
	}

	//---------Check updaterServer Status---------//
	public void checkupdaterServer() throws InterruptedException {
		String statusupdaterServer = updaterServerstatus.getText();
		if (statusupdaterServer.equals("Inactive")) {
			updaterServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkupdaterServer1();
		} else {
			log.info("updaterServer is already running");
		}
	}

	public void checkupdaterServer1() {
		String statusupdaterServer = updaterServerstatus.getText();
		if (statusupdaterServer.equals("Active")) {
			log.info("updaterServer is started");
		} else {
			log.error("updaterServer is failed to start");
		}
	}

	//-----------Check emailServer Status-----------//
	public void checkemailServer() throws InterruptedException {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Inactive")) {
			emailServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkemailServer1();
		} else {
			log.info("emailServer is already running");
		}
	}

	public void checkemailServer1() {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Active")) {
			log.info("emailServer is started");
		} else {
			log.error("emailServer is failed to start");
		}
	}
	
	//-----------Check ReportEventProducerServer Status-----------//
		public void checkReportEventProducerServer() throws InterruptedException {
			String statusReportEventProducerServer = ReportEventProducerServerstatus.getText();
			if (statusReportEventProducerServer.equals("Inactive")) {
				ReportEventProducerServercheckbox.click();
				switchResourceButton.click();
				returnBtnStatus();
				checkReportEventProducerServer1();
			} else {
				log.info("ReportEventProducerServer is already running");
			}
		}

		public void checkReportEventProducerServer1() {
			String statusReportEventProducerServer = ReportEventProducerServerstatus.getText();
			if (statusReportEventProducerServer.equals("Active")) {
				log.info("ReportEventProducerServer is started");
			} else {
				log.error("ReportEventProducerServer is failed to start");
			}
		}
		
		//-----------Check ReportGeneratorServer Status-----------//
				public void checkReportGeneratorServer() throws InterruptedException {
					String statusReportGeneratorServer = ReportGeneratorServerstatus.getText();
					if (statusReportGeneratorServer.equals("Inactive")) {
						ReportGeneratorServercheckbox.click();
						switchResourceButton.click();
						returnBtnStatus();
						checkReportGeneratorServer1();
					} else {
						log.info("ReportGeneratorServer is already running");
					}
				}

				public void checkReportGeneratorServer1() {
					String statusReportGeneratorServer = ReportGeneratorServerstatus.getText();
					if (statusReportGeneratorServer.equals("Active")) {
						log.info("ReportGeneratorServer is started");
					} else {
						log.error("ReportGeneratorServer is failed to start");
					}
				}	

	//-----------Check SFTPDownloadServer Status----------//
	public void checkSFTPDownloadServer() throws InterruptedException {
		String statusSFTPDownloadServer = SFTPDownloadServerstatus.getText();
		if (statusSFTPDownloadServer.equals("Inactive")) {
			SFTPDownloadServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkSFTPDownloadServer1();
		} else {
			log.info("SFTPDownloadServer is already running");
		}
	}	

	public void checkSFTPDownloadServer1() {
		String statusSFTPDownloadServer = SFTPDownloadServerstatus.getText();
		if (statusSFTPDownloadServer.equals("Active")) {
			log.info("SFTPDownloadServer is started");
		} else {
			log.error("SFTPDownloadServer is failed to start");
		}
	}

	//-----------Check SFTPUploadServer Status-----------//
	public void checkSFTPUploadServer() throws InterruptedException {
		String statusSFTPUploadServer = SFTPUploadServerstatus.getText();
		if (statusSFTPUploadServer.equals("Inactive")) {
			SFTPUploadServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkSFTPUploadServer1();
		} else {
			log.info("SFTPUploadServer is already running");
		}
	}

	public void checkSFTPUploadServer1() {
		String statusSFTPUploadServer = SFTPUploadServerstatus.getText();
		if (statusSFTPUploadServer.equals("Active")) {
			log.info("SFTPUploadServer is started");
		} else {
			log.error("SFTPUploadServer is failed to start");
		}
	}

	//-----------Check FileReadServer Status-------------//
	public void checkFileReadServer() throws InterruptedException {
		String statusFileReadServer = FileReadServerstatus.getText();
		if (statusFileReadServer.equals("Inactive")) {
			FileReadServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFileReadServer1();
		} else {
			log.info("FileReadServer is already running");
		}
	}

	public void checkFileReadServer1() {
		String statusFileReadServer = FileReadServerstatus.getText();
		if (statusFileReadServer.equals("Active")) {
			log.info("FileReadServer is started");
		} else {
			log.error("FileReadServer is failed to start");
		}
	}

	//------------Check FileValidateServer Status------------//
	public void checkFileValidateServer() throws InterruptedException {
		String statusFileValidateServer = FileValidateServerstatus.getText();
		if (statusFileValidateServer.equals("Inactive")) {
			FileValidateServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFileValidateServer1();
		} else {
			log.info("FileValidateServer is already running");
		}
	}

	public void checkFileValidateServer1() {
		String statusFileValidateServer = FileValidateServerstatus.getText();
		if (statusFileValidateServer.equals("Active")) {
			log.info("FileValidateServer is started");
		} else {
			log.error("FileValidateServer is failed to start");
		}
	}

	//----------Check PfmsBatchQueueServer Status-----------//
	public void checkPfmsBatchQueueServer() throws InterruptedException {
		String statusPfmsBatchQueueServer = PfmsBatchQueueServerstatus.getText();
		if (statusPfmsBatchQueueServer.equals("Inactive")) {
			PfmsBatchQueueServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPfmsBatchQueueServer1();
		} else {
			log.info("PfmsBatchQueueServer is already running");
		}
	}

	public void checkPfmsBatchQueueServer1() {
		String statusPfmsBatchQueueServer = PfmsBatchQueueServerstatus.getText();
		if (statusPfmsBatchQueueServer.equals("Active")) {
			log.info("PfmsBatchQueueServer is started");
		} else {
			log.error("PfmsBatchQueueServer is failed to start");
		}
	}

	//----------Check MainFilePayCreationServer Status-----------//
	public void checkMainFilePayCreationServer() throws InterruptedException {
		String statusMainFilePayCreationServer = MainFilePayCreationServerstatus.getText();
		if (statusMainFilePayCreationServer.equals("Inactive")) {
			MainFilePayCreationServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMainFilePayCreationServer1();
		} else {
			log.info("MainFilePayCreationServer is already running");
		}
	}

	public void checkMainFilePayCreationServer1() {
		String statusMainFilePayCreationServer = MainFilePayCreationServerstatus.getText();
		if (statusMainFilePayCreationServer.equals("Active")) {
			log.info("MainFilePayCreationServer is started");
		} else {
			log.error("MainFilePayCreationServer is failed to start");
		}
	}

	//-------------Check FutureRolloverServer Status------------//
	public void checkFutureRolloverServer() throws InterruptedException {
		String statusFutureRolloverServer = FutureRolloverServerstatus.getText();
		if (statusFutureRolloverServer.equals("Inactive")) {
			FutureRolloverServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFutureRolloverServer1();
		} else {
			log.info("FutureRolloverServer is already running");
		}
	}

	public void checkFutureRolloverServer1() {
		String statusFutureRolloverServer = FutureRolloverServerstatus.getText();
		if (statusFutureRolloverServer.equals("Active")) {
			log.info("FutureRolloverServer is started");
		} else {
			log.error("FutureRolloverServer is failed to start");
		}
	}

	//------------Check FileExpiryServer Status---------------//
	public void checkFileExpiryServer() throws InterruptedException {
		String statusFileExpiryServer = FileExpiryServerstatus.getText();
		if (statusFileExpiryServer.equals("Inactive")) {
			FileExpiryServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFileExpiryServer1();
		} else {
			log.info("FileExpiryServer is already running");
		}
	}

	public void checkFileExpiryServer1() {
		String statusFileExpiryServer = FileExpiryServerstatus.getText();
		if (statusFileExpiryServer.equals("Active")) {
			log.info("FileExpiryServer is started");
		} else {
			log.error("FileExpiryServer is failed to start");
		}
	}

	//------------Check FileEnrolmentMatcherServer Status--------------//
	public void checkFileEnrolmentMatcherServer() throws InterruptedException {
		String statusFileEnrolmentMatcherServer = FileEnrolmentMatcherServerstatus.getText();
		if (statusFileEnrolmentMatcherServer.equals("Inactive")) {
			FileEnrolmentMatcherServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFileEnrolmentMatcherServer1();
		} else {
			log.info("FileEnrolmentMatcherServer is already running");
		}
	}

	public void checkFileEnrolmentMatcherServer1() {
		String statusFileEnrolmentMatcherServer = FileEnrolmentMatcherServerstatus.getText();
		if (statusFileEnrolmentMatcherServer.equals("Active")) {
			log.info("FileEnrolmentMatcherServer is started");
		} else {
			log.error("FileEnrolmentMatcherServer is failed to start");
		}
	}

	//---------Check DscEnrollementServer Status----------//
	public void checkDscEnrollementServer() throws InterruptedException {
		String statusDscEnrollementServer = DscEnrollementServerstatus.getText();
		if (statusDscEnrollementServer.equals("Inactive")) {
			DscEnrollementServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDscEnrollementServer1();
		} else {
			log.info("DscEnrollementServer is already running");
		}
	}

	public void checkDscEnrollementServer1() {
		String statusDscEnrollementServer = DscEnrollementServerstatus.getText();
		if (statusDscEnrollementServer.equals("Active")) {
			log.info("DscEnrollementServer is started");
		} else {
			log.error("DscEnrollementServer is failed to start");
		}
	}

	//-----------Check GpsReQueueingServer Status------------//
	public void checkGpsReQueueingServer() throws InterruptedException {
		String statusGpsReQueueingServer = GpsReQueueingServerstatus.getText();
		if (statusGpsReQueueingServer.equals("Inactive")) {
			GpsReQueueingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkGpsReQueueingServer1();
		} else {
			log.info("GpsReQueueingServer is already running");
		}
	}

	public void checkGpsReQueueingServer1() {
		String statusGpsReQueueingServer = GpsReQueueingServerstatus.getText();
		if (statusGpsReQueueingServer.equals("Active")) {
			log.info("GpsReQueueingServer is started");
		} else {
			log.error("GpsReQueueingServer is failed to start");
		}
	}

	//----------Check InitAckProducerServer Status----------//
	public void checkInitAckProducerServer() throws InterruptedException {
		String statusInitAckProducerServer = InitAckProducerServerstatus.getText();
		if (statusInitAckProducerServer.equals("Inactive")) {
			InitAckProducerServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInitAckProducerServer1();
		} else {
			log.info("InitAckProducerServer is already running");
		}
	}

	public void checkInitAckProducerServer1() {
		String statusInitAckProducerServer = InitAckProducerServerstatus.getText();
		if (statusInitAckProducerServer.equals("Active")) {
			log.info("InitAckProducerServer is started");
		} else {
			log.error("InitAckProducerServer is failed to start");
		}
	}

	//-----------Check FileStatusUpdateServer Status---------------//
	public void checkFileStatusUpdateServer() throws InterruptedException {
		String statusFileStatusUpdateServer = FileStatusUpdateServerstatus.getText();
		if (statusFileStatusUpdateServer.equals("Inactive")) {
			FileStatusUpdateServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFileStatusUpdateServer1();
		} else {
			log.info("FileStatusUpdateServer is already running");
		}
	}

	public void checkFileStatusUpdateServer1() {
		String statusFileStatusUpdateServer = FileStatusUpdateServerstatus.getText();
		if (statusFileStatusUpdateServer.equals("Active")) {
			log.info("FileStatusUpdateServer is started");
		} else {
			log.error("FileStatusUpdateServer is failed to start");
		}
	}

	//---------Check DISCExpiryAlertServer Status----------//
	public void checkDISCExpiryAlertServer() throws InterruptedException {
		String statusDISCExpiryAlertServer = DISCExpiryAlertServerstatus.getText();
		if (statusDISCExpiryAlertServer.equals("Inactive")) {
			DISCExpiryAlertServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDISCExpiryAlertServer1();
		} else {
			log.info("DISCExpiryAlertServer is already running");
		}
	}

	public void checkDISCExpiryAlertServer1() {
		String statusDISCExpiryAlertServer = DISCExpiryAlertServerstatus.getText();
		if (statusDISCExpiryAlertServer.equals("Active")) {
			log.info("DISCExpiryAlertServer is started");
		} else {
			log.error("DISCExpiryAlertServer is failed to start");
		}
	}

	//----------Check ReceiptAckServer Status---------//
	public void checkReceiptAckServer() throws InterruptedException {
		String statusReceiptAckServer = ReceiptAckServerstatus.getText();
		if (statusReceiptAckServer.equals("Inactive")) {
			ReceiptAckServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkReceiptAckServer1();
		} else {
			log.info("ReceiptAckServer is already running");
		}
	}

	public void checkReceiptAckServer1() {
		String statusReceiptAckServer = ReceiptAckServerstatus.getText();
		if (statusReceiptAckServer.equals("Active")) {
			log.info("ReceiptAckServer is started");
		} else {
			log.error("ReceiptAckServer is failed to start");
		}
	}

	//----------Check InitAckConsumerServer Status-------------//
	public void checkInitAckConsumerServer() throws InterruptedException {
		String statusInitAckConsumerServer = InitAckConsumerServerstatus.getText();
		if (statusInitAckConsumerServer.equals("Inactive")) {
			InitAckConsumerServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInitAckConsumerServer1();
		} else {
			log.info("InitAckConsumerServer is already running");
		}
	}

	public void checkInitAckConsumerServer1() {
		String statusInitAckConsumerServer = InitAckConsumerServerstatus.getText();
		if (statusInitAckConsumerServer.equals("Active")) {
			log.info("InitAckConsumerServer is started");
		} else {
			log.error("InitAckConsumerServer is failed to start");
		}
	}

	//---------Check SuccAckServer Status----------//
	public void checkSuccAckServer() throws InterruptedException {
		String statusSuccAckServer = SuccAckServerstatus.getText();
		if (statusSuccAckServer.equals("Inactive")) {
			SuccAckServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkSuccAckServer1();
		} else {
			log.info("SuccAckServer is already running");
		}
	}

	public void checkSuccAckServer1() {
		String statusSuccAckServer = SuccAckServerstatus.getText();
		if (statusSuccAckServer.equals("Active")) {
			log.info("SuccAckServer is started");
		} else {
			log.error("SuccAckServer is failed to start");
		}
	}

	//----------Check RejectAckServer Status-----------//
	public void checkRejectAckServer() throws InterruptedException {
		String statusRejectAckServer = RejectAckServerstatus.getText();
		if (statusRejectAckServer.equals("Inactive")) {
			RejectAckServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkRejectAckServer1();
		} else {
			log.info("RejectAckServer is already running");
		}
	}

	public void checkRejectAckServer1() {
		String statusRejectAckServer = RejectAckServerstatus.getText();
		if (statusRejectAckServer.equals("Active")) {
			log.info("RejectAckServer is started");
		} else {
			log.error("RejectAckServer is failed to start");
		}
	}

	//----------Check MainPostingServer Status----------//
	public void checkMainPostingServer() throws InterruptedException {
		String statusMainPostingServer = MainPostingServerstatus.getText();
		if (statusMainPostingServer.equals("Inactive")) {
			MainPostingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMainPostingServer1();
		} else {
			log.info("MainPostingServer is already running");
		}
	}

	public void checkMainPostingServer1() {
		String statusMainPostingServer = MainPostingServerstatus.getText();
		if (statusMainPostingServer.equals("Active")) {
			log.info("MainPostingServer is started");
		} else {
			log.error("MainPostingServer is failed to start");
		}
	}

	//------------Check DupRevPostingServer Status---------//
	public void checkDupRevPostingServer() throws InterruptedException {
		String statusDupRevPostingServer = DupRevPostingServerstatus.getText();
		if (statusDupRevPostingServer.equals("Inactive")) {
			DupRevPostingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDupRevPostingServer1();
		} else {
			log.info("DupRevPostingServer is already running");
		}
	}

	public void checkDupRevPostingServer1() {
		String statusDupRevPostingServer = DupRevPostingServerstatus.getText();
		if (statusDupRevPostingServer.equals("Active")) {
			log.info("DupRevPostingServer is started");
		} else {
			log.error("DupRevPostingServer is failed to start");
		}
	}

	//-----------Check PoolToSettBatchPostingServer Status----------//
	public void checkPoolToSettBatchPostingServer() throws InterruptedException {
		String statusPoolToSettBatchPostingServer = PoolToSettBatchPostingServerstatus.getText();
		if (statusPoolToSettBatchPostingServer.equals("Inactive")) {
			PoolToSettBatchPostingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPoolToSettBatchPostingServer1();
		} else {
			log.info("PoolToSettBatchPostingServer is already running");
		}
	}

	public void checkPoolToSettBatchPostingServer1() {
		String statusPoolToSettBatchPostingServer = PoolToSettBatchPostingServerstatus.getText();
		if (statusPoolToSettBatchPostingServer.equals("Active")) {
			log.info("PoolToSettBatchPostingServer is started");
		} else {
			log.error("PoolToSettBatchPostingServer is failed to start");
		}
	}

	//------------Check PoolToAgencyBatchPostingServer Status---------//
	public void checkPoolToAgencyBatchPostingServer() throws InterruptedException {
		String statusPoolToAgencyBatchPostingServer = PoolToAgencyBatchPostingServerstatus.getText();
		if (statusPoolToAgencyBatchPostingServer.equals("Inactive")) {
			PoolToAgencyBatchPostingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPoolToAgencyBatchPostingServer1();
		} else {
			log.info("PoolToAgencyBatchPostingServer is already running");
		}
	}

	public void checkPoolToAgencyBatchPostingServer1() {
		String statusPoolToAgencyBatchPostingServer = PoolToAgencyBatchPostingServerstatus.getText();
		if (statusPoolToAgencyBatchPostingServer.equals("Active")) {
			log.info("PoolToAgencyBatchPostingServer is started");
		} else {
			log.error("PoolToAgencyBatchPostingServer is failed to start");
		}
	}

	//-------------Check SettToPoolBatchPostingServer Status--------------//
	public void checkSettToPoolBatchPostingServer() throws InterruptedException {
		String statusSettToPoolBatchPostingServer = SettToPoolBatchPostingServerstatus.getText();
		if (statusSettToPoolBatchPostingServer.equals("Inactive")) {
			SettToPoolBatchPostingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkSettToPoolBatchPostingServer1();
		} else {
			log.info("SettToPoolBatchPostingServer is already running");
		}
	}

	public void checkSettToPoolBatchPostingServer1() {
		String statusSettToPoolBatchPostingServer = SettToPoolBatchPostingServerstatus.getText();
		if (statusSettToPoolBatchPostingServer.equals("Active")) {
			log.info("SettToPoolBatchPostingServer is started");
		} else {
			log.error("SettToPoolBatchPostingServer is failed to start");
		}
	}

	//---------Check OnUsPaymentProcessServer Status----------//
	public void checkOnUsPaymentProcessServer() throws InterruptedException {
		String statusOnUsPaymentProcessServer = OnUsPaymentProcessServerstatus.getText();
		if (statusOnUsPaymentProcessServer.equals("Inactive")) {
			OnUsPaymentProcessServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOnUsPaymentProcessServer1();
		} else {
			log.info("OnUsPaymentProcessServer is already running");
		}
	}

	public void checkOnUsPaymentProcessServer1() {
		String statusOnUsPaymentProcessServer = OnUsPaymentProcessServerstatus.getText();
		if (statusOnUsPaymentProcessServer.equals("Active")) {
			log.info("OnUsPaymentProcessServer is started");
		} else {
			log.error("OnUsPaymentProcessServer is failed to start");
		}
	}

	//----------Check OnusPostingServer Status-----------//
	public void checkOnusPostingServer() throws InterruptedException {
		String statusOnusPostingServer = OnusPostingServerstatus.getText();
		if (statusOnusPostingServer.equals("Inactive")) {
			OnusPostingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkOnusPostingServer1();
		} else {
			log.info("OnusPostingServer is already running");
		}
	}

	public void checkOnusPostingServer1() {
		String statusOnusPostingServer = OnusPostingServerstatus.getText();
		if (statusOnusPostingServer.equals("Active")) {
			log.info("OnusPostingServer is started");
		} else {
			log.error("OnusPostingServer is failed to start");
		}
	}

	//---------Check NeftPaymentProcessServer Status----------//
	public void checkNeftPaymentProcessServer() throws InterruptedException {
		String statusNeftPaymentProcessServer = NeftPaymentProcessServerstatus.getText();
		if (statusNeftPaymentProcessServer.equals("Inactive")) {
			NeftPaymentProcessServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNeftPaymentProcessServer1();
		} else {
			log.info("NeftPaymentProcessServer is already running");
		}
	}

	public void checkNeftPaymentProcessServer1() {
		String statusNeftPaymentProcessServer = NeftPaymentProcessServerstatus.getText();
		if (statusNeftPaymentProcessServer.equals("Active")) {
			log.info("NeftPaymentProcessServer is started");
		} else {
			log.error("NeftPaymentProcessServer is failed to start");
		}
	}

	//-----------Check AchPaymentProcessServer Status----------//
	public void checkAchPaymentProcessServer() throws InterruptedException {
		String statusAchPaymentProcessServer = AchPaymentProcessServerstatus.getText();
		if (statusAchPaymentProcessServer.equals("Inactive")) {
			AchPaymentProcessServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchPaymentProcessServer1();
		} else {
			log.info("AchPaymentProcessServer is already running");
		}
	}

	public void checkAchPaymentProcessServer1() {
		String statusAchPaymentProcessServer = AchPaymentProcessServerstatus.getText();
		if (statusAchPaymentProcessServer.equals("Active")) {
			log.info("AchPaymentProcessServer is started");
		} else {
			log.error("AchPaymentProcessServer is failed to start");
		}
	}

	//---------Check AchOutputServer Status----------//
	public void checkAchOutputServer() throws InterruptedException {
		String statusAchOutputServer = AchOutputServerstatus.getText();
		if (statusAchOutputServer.equals("Inactive")) {
			AchOutputServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchOutputServer1();
		} else {
			log.info("AchOutputServer is already running");
		}
	}

	public void checkAchOutputServer1() {
		String statusAchOutputServer = AchOutputServerstatus.getText();
		if (statusAchOutputServer.equals("Active")) {
			log.info("AchOutputServer is started");
		} else {
			log.error("AchOutputServer is failed to start");
		}
	}

	//-----------Check AchResponseReaderServer Status----------//
	public void checkAchResponseReaderServer() throws InterruptedException {
		String statusAchResponseReaderServer = AchResponseReaderServerstatus.getText();
		if (statusAchResponseReaderServer.equals("Inactive")) {
			AchResponseReaderServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchResponseReaderServer1();
		} else {
			log.info("AchResponseReaderServer is already running");
		}
	}

	public void checkAchResponseReaderServer1() {
		String statusAchResponseReaderServer = AchResponseReaderServerstatus.getText();
		if (statusAchResponseReaderServer.equals("Active")) {
			log.info("AchResponseReaderServer is started");
		} else {
			log.error("AchResponseReaderServer is failed to start");
		}
	}

	//----------Check AchResponseProcessServer Status----------//
	public void checkAchResponseProcessServer() throws InterruptedException {
		String statusAchResponseProcessServer = AchResponseProcessServerstatus.getText();
		if (statusAchResponseProcessServer.equals("Inactive")) {
			AchResponseProcessServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAchResponseProcessServer1();
		} else {
			log.info("AchResponseProcessServer is already running");
		}
	}

	public void checkAchResponseProcessServer1() {
		String statusAchResponseProcessServer = AchResponseProcessServerstatus.getText();
		if (statusAchResponseProcessServer.equals("Active")) {
			log.info("AchResponseProcessServer is started");
		} else {
			log.error("AchResponseProcessServer is failed to start");
		}
	}

	//----------Check CorporateFundingServer Status---------//
	public void checkCorporateFundingServer() throws InterruptedException {
		String statusCorporateFundingServer = CorporateFundingServerstatus.getText();
		if (statusCorporateFundingServer.equals("Inactive")) {
			CorporateFundingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCorporateFundingServer1();
		} else {
			log.info("CorporateFundingServer is already running");
		}
	}

	public void checkCorporateFundingServer1() {
		String statusCorporateFundingServer = CorporateFundingServerstatus.getText();
		if (statusCorporateFundingServer.equals("Active")) {
			log.info("CorporateFundingServer is started");
		} else {
			log.error("CorporateFundingServer is failed to start");
		}
	}

	//----------Check FileMarkCompleteServer Status----------//
	public void checkFileMarkCompleteServer() throws InterruptedException {
		String statusFileMarkCompleteServer = FileMarkCompleteServerstatus.getText();
		if (statusFileMarkCompleteServer.equals("Inactive")) {
			FileMarkCompleteServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFileMarkCompleteServer1();
		} else {
			log.info("FileMarkCompleteServer is already running");
		}
	}

	public void checkFileMarkCompleteServer1() {
		String statusFileMarkCompleteServer = FileMarkCompleteServerstatus.getText();
		if (statusFileMarkCompleteServer.equals("Active")) {
			log.info("FileMarkCompleteServer is started");
		} else {
			log.error("FileMarkCompleteServer is failed to start");
		}
	}

	//-----------Check FilePostingMarkCompleteServer Status-----------//
	public void checkFilePostingMarkCompleteServer() throws InterruptedException {
		String statusFilePostingMarkCompleteServer = FilePostingMarkCompleteServerstatus.getText();
		if (statusFilePostingMarkCompleteServer.equals("Inactive")) {
			FilePostingMarkCompleteServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFilePostingMarkCompleteServer1();
		} else {
			log.info("FilePostingMarkCompleteServer is already running");
		}
	}

	public void checkFilePostingMarkCompleteServer1() {
		String statusFilePostingMarkCompleteServer = FilePostingMarkCompleteServerstatus.getText();
		if (statusFilePostingMarkCompleteServer.equals("Active")) {
			log.info("FilePostingMarkCompleteServer is started");
		} else {
			log.error("FilePostingMarkCompleteServer is failed to start");
		}
	}

	//-----------Check Finacle_Posting_Server Status-------------//
	public void checkFinacle_Posting_Server() throws InterruptedException {
		String statusFinacle_Posting_Server = Finacle_Posting_Serverstatus.getText();
		if (statusFinacle_Posting_Server.equals("Inactive")) {
			Finacle_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFinacle_Posting_Server1();
		} else {
			log.info("Finacle_Posting_Server is already running");
		}
	}

	public void checkFinacle_Posting_Server1() {
		String statusFinacle_Posting_Server = Finacle_Posting_Serverstatus.getText();
		if (statusFinacle_Posting_Server.equals("Active")) {
			log.info("Finacle_Posting_Server is started");
		} else {
			log.error("Finacle_Posting_Server is failed to start");
		}
	}

	//----------Check GpsReQueueingServer Status------------//
	public void checkGpsReQueueingServer() throws InterruptedException {
		String statusGpsReQueueingServer = GpsReQueueingServerstatus.getText();
		if (statusGpsReQueueingServer.equals("Inactive")) {
			GpsReQueueingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkGpsReQueueingServer1();
		} else {
			log.info("GpsReQueueingServer is already running");
		}
	}

	public void checkGpsReQueueingServer1() {
		String statusGpsReQueueingServer = GpsReQueueingServerstatus.getText();
		if (statusGpsReQueueingServer.equals("Active")) {
			log.info("GpsReQueueingServer is started");
		} else {
			log.error("GpsReQueueingServer is failed to start");
		}
	}

	//-----------Check IpaymentReQueueingServer Status-----------//
	public void checkIpaymentReQueueingServer() throws InterruptedException {
		String statusIpaymentReQueueingServer = IpaymentReQueueingServerstatus.getText();
		if (statusIpaymentReQueueingServer.equals("Inactive")) {
			IpaymentReQueueingServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkIpaymentReQueueingServer1();
		} else {
			log.info("IpaymentReQueueingServer is already running");
		}
	}

	public void checkIpaymentReQueueingServer1() {
		String statusIpaymentReQueueingServer = IpaymentReQueueingServerstatus.getText();
		if (statusIpaymentReQueueingServer.equals("Active")) {
			log.info("IpaymentReQueueingServer is started");
		} else {
			log.error("IpaymentReQueueingServer is failed to start");
		}
	}

	//------------Check Inward_Debit_Posting_Server Status-----------//
	public void checkInward_Debit_Posting_Server() throws InterruptedException {
		String statusInward_Debit_Posting_Server = Inward_Debit_Posting_Serverstatus.getText();
		if (statusInward_Debit_Posting_Server.equals("Inactive")) {
			Inward_Debit_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInward_Debit_Posting_Server1();
		} else {
			log.info("Inward_Debit_Posting_Server is already running");
		}
	}

	public void checkInward_Debit_Posting_Server1() {
		String statusInward_Debit_Posting_Server = Inward_Debit_Posting_Serverstatus.getText();
		if (statusInward_Debit_Posting_Server.equals("Active")) {
			log.info("Inward_Debit_Posting_Server is started");
		} else {
			log.error("Inward_Debit_Posting_Server is failed to start");
		}
	}

	//----------Check Inward_Credit_Posting_Server Status----------//
	public void checkInward_Credit_Posting_Server() throws InterruptedException {
		String statusInward_Credit_Posting_Server = Inward_Credit_Posting_Serverstatus.getText();
		if (statusInward_Credit_Posting_Server.equals("Inactive")) {
			Inward_Credit_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInward_Credit_Posting_Server1();
		} else {
			log.info("Inward_Credit_Posting_Server is already running");
		}
	}

	public void checkInward_Credit_Posting_Server1() {
		String statusInward_Credit_Posting_Server = Inward_Credit_Posting_Serverstatus.getText();
		if (statusInward_Credit_Posting_Server.equals("Active")) {
			log.info("Inward_Credit_Posting_Server is started");
		} else {
			log.error("Inward_Credit_Posting_Server is failed to start");
		}
	}

	//------------Check Inward_Debit_RePosting_Server Status------------//
	public void checkInward_Debit_RePosting_Server() throws InterruptedException {
		String statusInward_Debit_RePosting_Server = Inward_Debit_RePosting_Serverstatus.getText();
		if (statusInward_Debit_RePosting_Server.equals("Inactive")) {
			Inward_Debit_RePosting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInward_Debit_RePosting_Server1();
		} else {
			log.info("Inward_Debit_RePosting_Server is already running");
		}
	}

	public void checkInward_Debit_RePosting_Server1() {
		String statusInward_Debit_RePosting_Server = Inward_Debit_RePosting_Serverstatus.getText();
		if (statusInward_Debit_RePosting_Server.equals("Active")) {
			log.info("Inward_Debit_RePosting_Server is started");
		} else {
			log.error("Inward_Debit_RePosting_Server is failed to start");
		}
	}

	//----------Check Inward_Credit_RePosting_Server Status-----------//
	public void checkInward_Credit_RePosting_Server() throws InterruptedException {
		String statusInward_Credit_RePosting_Server = Inward_Credit_RePosting_Serverstatus.getText();
		if (statusInward_Credit_RePosting_Server.equals("Inactive")) {
			Inward_Credit_RePosting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInward_Credit_RePosting_Server1();
		} else {
			log.info("Inward_Credit_RePosting_Server is already running");
		}
	}

	public void checkInward_Credit_RePosting_Server1() {
		String statusInward_Credit_RePosting_Server = Inward_Credit_RePosting_Serverstatus.getText();
		if (statusInward_Credit_RePosting_Server.equals("Active")) {
			log.info("Inward_Credit_RePosting_Server is started");
		} else {
			log.error("Inward_Credit_RePosting_Server is failed to start");
		}
	}

	//-----------Check Inward_Debit_ReffralPost_Server Status-----------//
	public void checkInward_Debit_ReffralPost_Server() throws InterruptedException {
		String statusInward_Debit_ReffralPost_Server = Inward_Debit_ReffralPost_Serverstatus.getText();
		if (statusInward_Debit_ReffralPost_Server.equals("Inactive")) {
			Inward_Debit_ReffralPost_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInward_Debit_ReffralPost_Server1();
		} else {
			log.info("Inward_Debit_ReffralPost_Server is already running");
		}
	}

	public void checkInward_Debit_ReffralPost_Server1() {
		String statusInward_Debit_ReffralPost_Server = Inward_Debit_ReffralPost_Serverstatus.getText();
		if (statusInward_Debit_ReffralPost_Server.equals("Active")) {
			log.info("Inward_Debit_ReffralPost_Server is started");
		} else {
			log.error("Inward_Debit_ReffralPost_Server is failed to start");
		}
	}

	//-----------Check Inward_Credit_ReffralPost_Server Status----------//
	public void checkInward_Credit_ReffralPost_Server() throws InterruptedException {
		String statusInward_Credit_ReffralPost_Server = Inward_Credit_ReffralPost_Serverstatus.getText();
		if (statusInward_Credit_ReffralPost_Server.equals("Inactive")) {
			Inward_Credit_ReffralPost_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkInward_Credit_ReffralPost_Server1();
		} else {
			log.info("Inward_Credit_ReffralPost_Server is already running");
		}
	}

	public void checkInward_Credit_ReffralPost_Server1() {
		String statusInward_Credit_ReffralPost_Server = Inward_Credit_ReffralPost_Serverstatus.getText();
		if (statusInward_Credit_ReffralPost_Server.equals("Active")) {
			log.info("Inward_Credit_ReffralPost_Server is started");
		} else {
			log.error("Inward_Credit_ReffralPost_Server is failed to start");
		}
	}

	//-------------Check Mandate_SMS_Alerts_Server Status-----------//
	public void checkMandate_SMS_Alerts_Server() throws InterruptedException {
		String statusMandate_SMS_Alerts_Server = Mandate_SMS_Alerts_Serverstatus.getText();
		if (statusMandate_SMS_Alerts_Server.equals("Inactive")) {
			Mandate_SMS_Alerts_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMandate_SMS_Alerts_Server1();
		} else {
			log.info("Mandate_SMS_Alerts_Server is already running");
		}
	}

	public void checkMandate_SMS_Alerts_Server1() {
		String statusMandate_SMS_Alerts_Server = Mandate_SMS_Alerts_Serverstatus.getText();
		if (statusMandate_SMS_Alerts_Server.equals("Active")) {
			log.info("Mandate_SMS_Alerts_Server is started");
		} else {
			log.error("Mandate_SMS_Alerts_Server is failed to start");
		}
	}

	//-----------Check Mandate_EMAIL_Alerts_Server Status-------------//
	public void checkMandate_EMAIL_Alerts_Server() throws InterruptedException {
		String statusMandate_EMAIL_Alerts_Server = Mandate_EMAIL_Alerts_Serverstatus.getText();
		if (statusMandate_EMAIL_Alerts_Server.equals("Inactive")) {
			Mandate_EMAIL_Alerts_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMandate_EMAIL_Alerts_Server1();
		} else {
			log.info("Mandate_EMAIL_Alerts_Server is already running");
		}
	}

	public void checkMandate_EMAIL_Alerts_Server1() {
		String statusMandate_EMAIL_Alerts_Server = Mandate_EMAIL_Alerts_Serverstatus.getText();
		if (statusMandate_EMAIL_Alerts_Server.equals("Active")) {
			log.info("Mandate_EMAIL_Alerts_Server is started");
		} else {
			log.error("Mandate_EMAIL_Alerts_Server is failed to start");
		}
	}

	//------------Check Payment_SMS_Alerts_Server Status-------------//
	public void checkPayment_SMS_Alerts_Server() throws InterruptedException {
		String statusPayment_SMS_Alerts_Server = Payment_SMS_Alerts_Serverstatus.getText();
		if (statusPayment_SMS_Alerts_Server.equals("Inactive")) {
			Payment_SMS_Alerts_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPayment_SMS_Alerts_Server1();
		} else {
			log.info("Payment_SMS_Alerts_Server is already running");
		}
	}

	public void checkPayment_SMS_Alerts_Server1() {
		String statusPayment_SMS_Alerts_Server = Payment_SMS_Alerts_Serverstatus.getText();
		if (statusPayment_SMS_Alerts_Server.equals("Active")) {
			log.info("Payment_SMS_Alerts_Server is started");
		} else {
			log.error("Payment_SMS_Alerts_Server is failed to start");
		}
	}

	//------------Check Payment_EMAIL_Alerts_Server Status-----------//
	public void checkPayment_EMAIL_Alerts_Server() throws InterruptedException {
		String statusPayment_EMAIL_Alerts_Server = Payment_EMAIL_Alerts_Serverstatus.getText();
		if (statusPayment_EMAIL_Alerts_Server.equals("Inactive")) {
			Payment_EMAIL_Alerts_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPayment_EMAIL_Alerts_Server1();
		} else {
			log.info("Payment_EMAIL_Alerts_Server is already running");
		}
	}

	public void checkPayment_EMAIL_Alerts_Server1() {
		String statusPayment_EMAIL_Alerts_Server = Payment_EMAIL_Alerts_Serverstatus.getText();
		if (statusPayment_EMAIL_Alerts_Server.equals("Active")) {
			log.info("Payment_EMAIL_Alerts_Server is started");
		} else {
			log.error("Payment_EMAIL_Alerts_Server is failed to start");
		}
	}

	//-------------Check PaymentPosting_Alert_Server Status------------//
	public void checkPaymentPosting_Alert_Server() throws InterruptedException {
		String statusPaymentPosting_Alert_Server = PaymentPosting_Alert_Serverstatus.getText();
		if (statusPaymentPosting_Alert_Server.equals("Inactive")) {
			PaymentPosting_Alert_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkPaymentPosting_Alert_Server1();
		} else {
			log.info("PaymentPosting_Alert_Server is already running");
		}
	}

	public void checkPaymentPosting_Alert_Server1() {
		String statusPaymentPosting_Alert_Server = PaymentPosting_Alert_Serverstatus.getText();
		if (statusPaymentPosting_Alert_Server.equals("Active")) {
			log.info("PaymentPosting_Alert_Server is started");
		} else {
			log.error("PaymentPosting_Alert_Server is failed to start");
		}
	}

	//------------Check ESIGNMMSInFileServer Status-----------//
	public void checkESIGNMMSInFileServer() throws InterruptedException {
		String statusESIGNMMSInFileServer = ESIGNMMSInFileServerstatus.getText();
		if (statusESIGNMMSInFileServer.equals("Inactive")) {
			ESIGNMMSInFileServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkESIGNMMSInFileServer1();
		} else {
			log.info("ESIGNMMSInFileServer is already running");
		}
	}

	public void checkESIGNMMSInFileServer1() {
		String statusESIGNMMSInFileServer = ESIGNMMSInFileServerstatus.getText();
		if (statusESIGNMMSInFileServer.equals("Active")) {
			log.info("ESIGNMMSInFileServer is started");
		} else {
			log.error("ESIGNMMSInFileServer is failed to start");
		}
	}

	//-----------Check ESIGNMMSVerificationServer Status-----------//
	public void checkESIGNMMSVerificationServer() throws InterruptedException {
		String statusESIGNMMSVerificationServer = ESIGNMMSVerificationServerstatus.getText();
		if (statusESIGNMMSVerificationServer.equals("Inactive")) {
			ESIGNMMSVerificationServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkESIGNMMSVerificationServer1();
		} else {
			log.info("ESIGNMMSVerificationServer is already running");
		}
	}

	public void checkESIGNMMSVerificationServer1() {
		String statusESIGNMMSVerificationServer = ESIGNMMSVerificationServerstatus.getText();
		if (statusESIGNMMSVerificationServer.equals("Active")) {
			log.info("ESIGNMMSVerificationServer is started");
		} else {
			log.error("ESIGNMMSVerificationServer is failed to start");
		}
	}

	//-----------Check APIMandateValidateServer Status------------//
	public void checkAPIMandateValidateServer() throws InterruptedException {
		String statusAPIMandateValidateServer = APIMandateValidateServerstatus.getText();
		if (statusAPIMandateValidateServer.equals("Inactive")) {
			APIMandateValidateServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAPIMandateValidateServer1();
		} else {
			log.info("APIMandateValidateServer is already running");
		}
	}

	public void checkAPIMandateValidateServer1() {
		String statusAPIMandateValidateServer = APIMandateValidateServerstatus.getText();
		if (statusAPIMandateValidateServer.equals("Active")) {
			log.info("APIMandateValidateServer is started");
		} else {
			log.error("APIMandateValidateServer is failed to start");
		}
	}

	//--------------Check JARVISFileProcessServer Status-------------//
	public void checkJARVISFileProcessServer() throws InterruptedException {
		String statusJARVISFileProcessServer = JARVISFileProcessServerstatus.getText();
		if (statusJARVISFileProcessServer.equals("Inactive")) {
			JARVISFileProcessServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkJARVISFileProcessServer1();
		} else {
			log.info("JARVISFileProcessServer is already running");
		}
	}

	public void checkJARVISFileProcessServer1() {
		String statusJARVISFileProcessServer = JARVISFileProcessServerstatus.getText();
		if (statusJARVISFileProcessServer.equals("Active")) {
			log.info("JARVISFileProcessServer is started");
		} else {
			log.error("JARVISFileProcessServer is failed to start");
		}
	}

	//-----------Check JARVISFileCreatorServer Status------------//
	public void checkJARVISFileCreatorServer() throws InterruptedException {
		String statusJARVISFileCreatorServer = JARVISFileCreatorServerstatus.getText();
		if (statusJARVISFileCreatorServer.equals("Inactive")) {
			JARVISFileCreatorServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkJARVISFileCreatorServer1();
		} else {
			log.info("JARVISFileCreatorServer is already running");
		}
	}

	public void checkJARVISFileCreatorServer1() {
		String statusJARVISFileCreatorServer = JARVISFileCreatorServerstatus.getText();
		if (statusJARVISFileCreatorServer.equals("Active")) {
			log.info("JARVISFileCreatorServer is started");
		} else {
			log.error("JARVISFileCreatorServer is failed to start");
		}
	}

	//---------------Check NACH_FileEncryption_Server Status--------------//
	public void checkNACH_FileEncryption_Server() throws InterruptedException {
		String statusNACH_FileEncryption_Server = NACH_FileEncryption_Serverstatus.getText();
		if (statusNACH_FileEncryption_Server.equals("Inactive")) {
			NACH_FileEncryption_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNACH_FileEncryption_Server1();
		} else {
			log.info("NACH_FileEncryption_Server is already running");
		}
	}

	public void checkNACH_FileEncryption_Server1() {
		String statusNACH_FileEncryption_Server = NACH_FileEncryption_Serverstatus.getText();
		if (statusNACH_FileEncryption_Server.equals("Active")) {
			log.info("NACH_FileEncryption_Server is started");
		} else {
			log.error("NACH_FileEncryption_Server is failed to start");
		}
	}

	//---------------Check NACH_FileDecryption_Server Status-------------//
	public void checkNACH_FileDecryption_Server() throws InterruptedException {
		String statusNACH_FileDecryption_Server = NACH_FileDecryption_Serverstatus.getText();
		if (statusNACH_FileDecryption_Server.equals("Inactive")) {
			NACH_FileEncryption_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNACH_FileEncryption_Server1();
		} else {
			log.info("NACH_FileDecryption_Server is already running");
		}
	}

	public void checkNACH_FileDecryption_Server1() {
		String statusNACH_FileDecryption_Server = NACH_FileDecryption_Serverstatus.getText();
		if (statusNACH_FileDecryption_Server.equals("Active")) {
			log.info("NACH_FileDecryption_Server is started");
		} else {
			log.error("NACH_FileDecryption_Server is failed to start");
		}
	}

	//---------Check Logout function----------//
	public void LogOut() {
		elementUtil.clickElement(logOutBtn);
		elementUtil.clickElement(logoutBtn);
	}*/
}
