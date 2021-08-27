package com.example1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("https://letcode.in/waits");
		wb.findElement(By.id("accept")).click();
		WebDriverWait w1= new WebDriverWait(wb, 20);
		w1.until(ExpectedConditions.alertIsPresent());
		wb.switchTo().alert().accept();
		
		wb.navigate().to("https://letcode.in/buttons");
		wb.manage().window().maximize();
		WebDriverWait w2= new WebDriverWait(wb, 20);
		WebElement E1=w2.until(ExpectedConditions.elementToBeClickable(By.id("home")));
		E1.click();
		
		//wb.findElement(By.id("testing")).click();
		//wb.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();
		//WebDriverWait w3=new WebDriverWait(wb, 20);
		//w3.until(ExpectedConditions.elementToBeSelected(By.id("fruits")));
		//Select s1= new Select(wb.findElement(By.id("fruits")));
		//s1.selectByVisibleText("Orange");
		
		//wb.findElement(By.id("testing")).click();
		//wb.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		//WebDriverWait w4=new WebDriverWait(wb, 10);
		//w4.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("firstFr"));
		//wb.switchTo().frame("firstFr");
		//wb.findElement(By.id("fname")).sendKeys("Bala");
		
		wb.findElement(By.id("testing")).click();
		wb.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		WebDriverWait w5=new WebDriverWait(wb, 10);
		w5.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));
		wb.findElement(By.id("fullName")).sendKeys("Hello");
		
  }
}
