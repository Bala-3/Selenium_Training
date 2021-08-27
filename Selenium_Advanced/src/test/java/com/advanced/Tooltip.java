package com.advanced;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.graphbuilder.curve.Point;

public class Tooltip {
	@Test
	public void f() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");

		WebDriver wb=new ChromeDriver();

		wb.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");

		wb.manage().window().maximize();

		WebElement E1 = wb.findElement(By.id("sdgBod"));

		//Using Get Attribute

		//String s1 = E1.getAttribute("title");

		//System.out.println(s1);

		//Using Action class
		Actions a = new Actions(wb);

		a.moveToElement(E1).perform();

		//WebElement E2 = wb.findElement(By.id("sdgBod"));

		//String s2 = E2.getText();

		//System.out.println(s2);
		
		//Using Screenshot
		
		Thread.sleep(4000);
		
		//Using Screenshot
		
		TakesScreenshot ts =(TakesScreenshot)wb;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Selenium Screenshots\\screenshot3.jpg");
		
		FileHandler.copy(source, destination);
		
		
		

	}
}
