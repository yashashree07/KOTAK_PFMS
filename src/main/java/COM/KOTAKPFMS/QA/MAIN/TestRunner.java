package COM.KOTAKPFMS.QA.MAIN;

//imports
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import COM.KOTAKPFMS.QA.UTIL.ExtentReportGenerator;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( 
		features={"src/main/resources/setupFeatures/TC-User.feature"},
		glue= {"StepDefinition","AppHooks"}
		,monochrome=true
		,dryRun=false	
		//,tags= "@TC01_01_AddProfile"
		,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


		)

public class TestRunner {
	public static void main(String[] args) {
	    System.out.println("in main method");
	    PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/main/resources/log4j.properties");
	    BasicConfigurator.configure();
	    CreateCucumberOptions cucumberOptions = new CreateCucumberOptions();
	    ExtentReportGenerator reportGenerator=new ExtentReportGenerator();
	    JUnitCore junitRunner = new JUnitCore();
		cucumberOptions.loadPropertiesFile();
		cucumberOptions.setOptions();
	    System.out.println(TestRunner.class.getName()); 
	 
	    junitRunner.run(TestRunner.class);
	    reportGenerator.generateReport();
	    System.out.println("end");
	    System.exit(0);
	  }//end of main
	
	
}



