package com.example1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb;
		wb=new ChromeDriver();
		wb.get("http://www.leafground.com/pages/Edit.html");
		Actions a1= new Actions(wb);
		WebElement e1= wb.findElement(By.id("email"));
		a1.sendKeys(e1,"Bala");
		a1.doubleClick(e1);
		//a1.contextClick(e1).dragAndDrop(e1, e2).build().perform();
		//a1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		a1.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement e2= wb.findElement(By.xpath("//input[@value='Append ']"));
		e2.click();
		a1.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
  }
}
