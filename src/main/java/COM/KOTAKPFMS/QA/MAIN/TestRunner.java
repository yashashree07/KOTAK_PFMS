package COM.KOTAKPFMS.QA.MAIN;

import org.apache.log4j.BasicConfigurator;
import COM.KOTAKPFMS.QA.UTIL.ExtentReportGenerator;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( 
		features="src/main/resources/features/TC10-User.feature",
		glue= "StepDefination"
		,monochrome=true
		,dryRun=false	
		,tags= "@TC_04_02_Servers"
		,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


		)

public class TestRunner {
	/*public static void main(String args[])
	{
		JUnitCore.main(TestRunner.class.getName());
	}*/
		
	//static ExtentReportGenerator reportGenerator=new ExtentReportGenerator();
	
	//@SuppressWarnings("static-access")
	public static void main(String[] args) {
	    System.out.println("in main method");
	   //PropertyConfigurator.configure("E:/PINV/PINV/log4j.properties");
	    BasicConfigurator.configure();
	    CreateCucumberOptions cucumberOptions = new CreateCucumberOptions();
	    ExtentReportGenerator reportGenerator=new ExtentReportGenerator();
	  // ExtentReports reports = new ExtentReports("extentreports.html", true);
	    JUnitCore junitRunner = new JUnitCore();
		cucumberOptions.loadPropertiesFile();
		cucumberOptions.setOptions();
	    System.out.println(TestRunner.class.getName()); 
	  //  Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
	   // ExtentReports reports = new ExtentReports("extentreports.html", true);
	   // reportGenerator.generateReport();
	   
	   // JUnitCore.main(TestRunner.class.getName());
	   junitRunner.run(TestRunner.class);
	    reportGenerator.generateReport();
	    System.out.println("end");
	    System.exit(0);
	  //  reportGenerator.generateReport();
	   // reports.flush();
	  }
	
	
}



