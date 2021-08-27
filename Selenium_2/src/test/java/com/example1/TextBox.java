package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {
  @Test
  public void f() {
	  

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
	  WebDriver wb;
	  wb=new ChromeDriver();
	  
	  wb.get("https://letcode.in/test");
	  wb.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
	  wb.findElement(By.id("fullName")).sendKeys("Bala Subramanian R");
	  wb.findElement(By.id("join")).sendKeys(" and Fine");
	  String s1= wb.findElement(By.id("getMe")).getText();
	  System.out.println(s1);
	  wb.findElement(By.xpath("//input[@id='clearMe']")).clear();
	  wb.findElement(By.xpath("//input[@id='noEdit']")).click();
	  wb.quit();
	  
  }
}
