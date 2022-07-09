package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,plugin = {"pretty","json:target/cucumber.json"},features = "src/test/resources",glue = "com.stepDefinitionPackage")
public class TestRunneClass {
	
	@AfterClass
	public static void afterclass() {
		
		Reporting.generateJVMReport(System.getProperty("user.dir")+"\\target\\cucumber.json");

	}

}
