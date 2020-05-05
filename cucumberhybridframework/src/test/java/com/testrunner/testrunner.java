package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	
features = "C:\\Users\\KRISHNA PC\\eclipse-workspace\\cucumberhybridframework\\src\\test\\resources\\Features\\Admin.feature",
glue = {"com.stepdefinition"},

plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/reports/cucumber-html-report/jsonreport",
"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/Extentreport.html"}
			/*	      tags = {"@tc_01_login"} */


)

public class testrunner {
	
	    @AfterClass
	      public static void extendReport()
	    {
	        Reporter.loadXMLConfig("\\src\\test\\resources\\Testdata\\extent-config.xml");
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows");
	        Reporter.setTestRunnerOutput("Sample test runner output message");
	  
	    }

	

}
