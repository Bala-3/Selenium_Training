package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Webdriver {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
	  WebDriver wb;
	  wb=new ChromeDriver();
	  wb.get("http://www.leafground.com/pages/Edit.html");
	  /*wb.findElement(By.cssSelector("img[src='images/edit.png']")).click();
	 
	  //Text box
	  wb.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");
	  wb.findElement(By.cssSelector("img[src='../images/testleaf_logo.png']")).click();
	  
	  //Button
	  wb.findElement(By.linkText("Button")).click();
	  wb.findElement(By.xpath("//button[@id='position']")).submit();
	  wb.findElement(By.cssSelector("button[style='background-color:lightgreen']")).submit();
	  wb.findElement(By.id("size")).click();
	  wb.findElement(By.xpath("//button[onclick='window.location='../home.html';']")).click();
	  
	  //Radio Button
	  wb.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[6]/a/img")).click();
	  wb.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input")).click();
	  wb.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[3]")).click();
	  wb.findElement(By.cssSelector("img[src='../images/testleaf_logo.png']")).click();
	  
	  //Check Box
	  wb.findElement(By.linkText("Checkbox")).click();
	  wb.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input")).click();
	  wb.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input")).click();
	  wb.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[4]/input")).click();
	 
	  wb.quit();*/
	  
	  WebElement e=wb.findElement(By.id("email"));
	  e.sendKeys("Bala");
	  String w1 = e.getAttribute("value");
	  System.out.println(w1);
  }
}
