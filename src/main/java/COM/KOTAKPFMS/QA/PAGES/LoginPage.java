package COM.KOTAKPFMS.QA.PAGES;

//imports
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.KOTAKPFMS.QA.UTIL.ElementUtil;

/**
 * @Author -- Suvarna Prabhumatkari
 **/

public class LoginPage {
	private WebDriver driver;
	ElementUtil elementUtil=new ElementUtil(driver);

	@FindBy(id="accept")
	WebElement acceptBtn;

	@FindBy(name="j_user_text")
	WebElement username;

	@FindBy(name="j_pass_text")
	WebElement password;

	@FindBy(id="login")
	WebElement loginBtn;

	@FindBy(name="j_user")
	WebElement username1;

	@FindBy(name="j_pass")
	WebElement password1;

	@FindBy(id = "details-button")
	WebElement advancedBtn;

	@FindBy(id = "proceed-link")
	WebElement proceedlink;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	Logger log = Logger.getLogger(LoginPage.class);

	//LoginPage Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}//end 

	//----------------------Method to perform Login operation-------------------------
	public HomePage login(String un,String pwd) throws InterruptedException {
		elementUtil.clickElement(acceptBtn);
		log.info("Accept button clicked");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.enterText(username, un);
		log.info("Username entered");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.enterText(password, pwd);
		log.info("Password entered");
		elementUtil.SHORT_TIMEOUT();
		elementUtil.clickElement(loginBtn);
		log.info("Login button clicked");
	

		//check if Login operation is successfull or login operation falied
		try {
			log.error(elementUtil.getText(errormessages));
		}
		catch (NoSuchElementException e) {
			log.info("Login Successful");
		}//end of catch

		return new HomePage(driver);
	}//end of login function

}
