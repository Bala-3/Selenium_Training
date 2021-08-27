package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.assessmet_1.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class listener extends PHPTravels implements ITestListener  {

 

    ExtentReports extent = ExtentReport.CreateTest();
    ExtentTest test;


    public void onFinish(ITestContext arg0) {

        extent.flush();
        System.out.println("Test Finished");

    }


    public void onStart(ITestContext arg0) {

        test = extent.createTest("Test_2");

        test.assignAuthor("Bala");

        test.assignCategory("Functional Testing");
        
        System.out.println("Test Started");


    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        System.out.println("Test Failed But WithinSuccess Percentage");

 

    }

    public void onTestFailure(ITestResult arg0) {
    	
    	test.fail("Registration failed");
    	
    	test.fail("Login Failed");
    	
    	test.fail("Add to cart failed");
    	
        System.out.println("Test Failed "+arg0.getName());

 

    }

 

    public void onTestSkipped(ITestResult arg0) {
        System.out.println("Test Skipped "+arg0.getName());

 

    }

    public void onTestStart(ITestResult arg0) {
            
        System.out.println("Test Started Successfully" +arg0.getName());

    }

 

    public void onTestSuccess(ITestResult arg0) {


        test.pass("Enter the details for registration");


        test.pass("Click on the register button");

        test.pass("Search the product");

        test.pass("Add the product to the cart");

        System.out.println("Test Successfully completed "+arg0.getName());

 

    }

 


}