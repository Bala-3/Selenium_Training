package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
	  WebDriver wb;
	  wb=new ChromeDriver();
	  wb.get("https://letcode.in/frame");
	  
      wb.switchTo().frame("firstFr");
	  wb.findElement(By.name("fname")).sendKeys("Bala");
	  wb.switchTo().frame(0);
	  wb.findElement(By.name("email")).sendKeys("bala@gmail.com");
	  wb.switchTo().parentFrame();
	  wb.findElement(By.name("lname")).sendKeys("R"); 
	  wb.switchTo().defaultContent();
	  wb.findElement(By.className("card-footer-item")).click();
	  wb.quit();
  }
}
