package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb;
		wb=new ChromeDriver();

		wb.get("https://letcode.in/dropdowns");

		wb.manage().window().maximize();

		Select s1=new Select(wb.findElement(By.id("fruits")));
		s1.selectByIndex(2);

		Select s2=new Select(wb.findElement(By.id("superheros")));
		s2.selectByVisibleText("Aquaman");
		s2.selectByVisibleText("Batman");
		s2.selectByVisibleText("Captain Marvel");
		//s2.deselectByVisibleText("Captain Marvel");

		Select s3=new Select(wb.findElement(By.id("lang")));
		s3.selectByValue("swift");

		Boolean b1=s2.isMultiple();
		System.out.println(b1);

		Select s4=new Select(wb.findElement(By.id("superheros")));
		s4.deselectAll();


		//wb.quit();
	}
}
