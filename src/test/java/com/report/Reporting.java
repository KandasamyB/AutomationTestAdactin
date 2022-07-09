package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void generateJVMReport(String jsonFile) {
		
		
		File file= new File(System.getProperty("user.dir")+"\\target");
		
		Configuration config=new Configuration(file, "AdactinAutomation");
		
		
		config.addClassifications("OS", "Win10");
		config.addClassifications("Browser", "chrome");
		config.addClassifications("version", "108");
		config.addClassifications("sprint", "33");
		
		List<String> jsonfiles= new ArrayList<String>();
		jsonfiles.add(jsonFile);
		
		ReportBuilder builder =new ReportBuilder(jsonfiles, config);
		builder.generateReports();
		


	}

}
