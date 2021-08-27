package com.example1;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb;
		wb=new ChromeDriver();
		wb.get("https://letcode.in/windows");
		//Maximize Window
		wb.manage().window().maximize();
		
		wb.findElement(By.id("home")).click();
		Set<String> values = wb.getWindowHandles();
		Iterator<String> i1=values.iterator();
		String s1=i1.next();
		String s2=i1.next();
		System.out.println(s1+" "+s2);
		wb.switchTo().window(s2);
		//Minimize the Window
		Dimension d=new Dimension(450,750);
		wb.manage().window().setSize(d);
		
		//CurrentUrl
		String s3 = wb.getCurrentUrl();
		System.out.println(s3);
		
		//PageTitle
		String s4 = wb.getTitle();
		System.out.println(s4);
		
		//PageSourceCode
		String s5 = wb.getPageSource();
		System.out.println(s5);
		
		//getText
		String s6=wb.findElement(By.xpath("//*[@id='testing']")).getText();
		System.out.println(s6);
		
		//navigateBack
		wb.navigate().back();
		
		//navigateForward
		wb.navigate().forward();
		
		//navigateRefresh
		wb.navigate().refresh();
		
		//navigateTo
		wb.navigate().to("https://letcode.in/");
		wb.quit();
	}
}

