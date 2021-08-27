package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
	  WebDriver wb;
	  wb=new ChromeDriver();
	  wb.get("https://letcode.in/test");
	  
	  wb.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();
	  wb.findElement(By.xpath("//input[@id='no']")).click();
	  wb.findElement(By.xpath("//input[@id='one']")).click();
	  wb.findElement(By.id("bug")).click();
	  wb.findElement(By.id("maybe")).click();
	  wb.quit();
  }
}
