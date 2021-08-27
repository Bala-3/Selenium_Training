package com.advanced;



import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Selenium_Webdriver {
	@Test
	public void f() throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("http://demo.automationtesting.in/AutoComplete.html");
		wb.manage().window().maximize();
		
		
		//Ul
		wb.findElement(By.id("searchbox")).sendKeys("A");
		Thread.sleep(3000);
		List<WebElement> e1= wb.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		Thread.sleep(3000);
		for(WebElement value: e1)
		{
			 if(value.getText().equalsIgnoreCase("American Samoa"))
			 {
				 value.click();
				 break;
			 }
			 
		}
		
		//ul-2 Selecting more than one 
		wb.navigate().to("http://demo.automationtesting.in/Selectable.html");
		wb.manage().window().maximize();
		wb.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		List<WebElement> e2=wb.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
		int l1=e2.size();
		System.out.println(l1); 
		Actions a= new Actions(wb);
		a.keyDown(Keys.CONTROL).click(e2.get(0)).click(e2.get(2)).click(e2.get(3)).build().perform();
		
		//TakesScreenshot
		wb.navigate().to("http://demo.automationtesting.in/Alerts.html");
		wb.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot)wb;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Selenium Screenshots\\screenshot1.jpg");
		FileHandler.copy(source, destination);
		
		//Robot Class
		wb.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Robot r=new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage source1=r.createScreenCapture(rect);
		File destination1=new File("C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Selenium Screenshots\\screenshot2.jpg");
		ImageIO.write(source1, "jpg", destination1);
		wb.switchTo().alert().accept();
		
	}
}
