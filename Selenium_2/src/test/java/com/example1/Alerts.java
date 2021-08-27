package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
	  WebDriver wb;
	  wb=new ChromeDriver();
	  wb.get("http://demo.automationtesting.in/Alerts.html");
	  
	  //Popup
	 
	  wb.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	  wb.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
      String s1=wb.switchTo().alert().getText();
	  System.out.println(s1);
	  wb.switchTo().alert().accept();
	  
	  //Confirm
	  wb.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  wb.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
      String s2=wb.switchTo().alert().getText();
	  System.out.println(s2);
	  wb.switchTo().alert().accept();
	  String s3=wb.findElement(By.id("demo")).getText();
	  System.out.println(s3);
	  
	  
	//Prompt
	  wb.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	  wb.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
      String s4=wb.switchTo().alert().getText();
	  System.out.println(s4);
	 // wb.switchTo().alert().();
	  wb.quit();
  }
}
