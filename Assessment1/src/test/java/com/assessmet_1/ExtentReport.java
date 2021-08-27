package com.assessmet_1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	static ExtentReports extent;
	
	    public static ExtentReports CreateTest()
	    {
	        ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReport.html");
	        
	        reporter.config().setReportName("PHP_Travels");
	        
	        reporter.config().setDocumentTitle("Add to cart");
	        
	        extent = new ExtentReports();

	        extent.attachReporter(reporter);
	        
	        extent.setSystemInfo("Test Engineer", "Bala Subramanian R");
	        
	        return extent;
	        
	    }
	    
	    
}
