package AppHooks;

import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import COM.KOTAKPFMS.QA.FACTORY.DriverFactory;
import COM.KOTAKPFMS.QA.PAGES.HomePage;
import COM.KOTAKPFMS.QA.PAGES.LoginPage;
import COM.KOTAKPFMS.QA.UTIL.ConfigReader;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @Author -- Suvarna Prabhumatkari
 **/
public class Hooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	public static Properties prop;
	HomePage homePage;
	LoginPage loginPage;
	Scenario scenario;
	Logger log = Logger.getLogger(Hooks.class);
	
	
	@Before(order = 0)
	public void getProperty() {

		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser(Scenario scenario) throws InterruptedException {
		this.scenario = scenario;
		log.info(scenario.getName());
		
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		DriverFactory.getDriver().get(prop.getProperty("URL"));
		loginPage = new LoginPage(driver);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	/**
	 * @Author -- Suvarna Prabhumatkari
	 **/
	public HomePage launchBrowser1() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		DriverFactory.getDriver().get(prop.getProperty("URL"));
		loginPage = new LoginPage(driver);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		return new HomePage(driver);
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			String screenshot = scenario.getName().replaceAll(" ", "_");
			byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshot);
		}
	}

}
