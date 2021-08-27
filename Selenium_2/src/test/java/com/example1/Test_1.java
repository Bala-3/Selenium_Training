package com.example1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Test_1 {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method Sample");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@Test(priority=1,groups={"Smoke Test"})
	public void sample1()
	{
		System.out.println("First Sample");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(priority=-1,groups={"Smoke Test"})
	public void sample2()
	{
		System.out.println("Second Sample");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups={"Functional Test"})
	public void sample3()
	{
		System.out.println("Third Sample");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(dependsOnMethods={"sample1"},groups={"Smoke Test"})
	public void sample4()
	{
		System.out.println("Fourth Sample");
		System.out.println(Thread.currentThread().getId());
	}
	
	//ignore
	@Test(groups={"Functional Test"},enabled=false)
	public void sample5()
	{
		System.out.println("Fifth Sample");
		System.out.println(Thread.currentThread().getId());
	}
	
	//synchronization
	@Test(groups={"Functional Test"},timeOut=10000)
	public void sample6()
	{
		System.out.println("Sixth Sample");
		System.out.println(Thread.currentThread().getId());
	}
	
	//exception handling
	@Test(groups={"Functional Test"},expectedExceptions=ArithmeticException.class)
	public void sample7()
	{
		int a,b,c;
		a=1;
		b=0;
		c=a/b;
		System.out.println(c);
		
	}
	
	//report print statement
	@Test(groups={"Functional Test"})
	public void sample8()
	{
		Reporter.log("All Samples are Passed");
		Reporter.log("All Samples are Passed",true);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method Sample");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
}
