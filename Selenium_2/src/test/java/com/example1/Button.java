package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
	  WebDriver wb;
	  wb=new ChromeDriver();
	  wb.get("http://www.leafground.com/pages/Button.html");
	 
	  wb.findElement(By.id("position")).click();
	  wb.findElement(By.cssSelector("button[style='background-color:lightgreen']")).click();
	  wb.findElement(By.xpath("//button[@style='background-color:lightblue']")).click();
	  wb.findElement(By.id("home")).click();
	  wb.quit();
  }
}
