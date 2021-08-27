package com.advanced;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker_Scrollpage {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("http://www.leafground.com/pages/Calendar.html");
		wb.manage().window().maximize();

		//DatePicker using JavascriptExecutor
		
		JavascriptExecutor js= (JavascriptExecutor)wb;
		
		js.executeScript("document.getElementById('datepicker').value='15/08/2021'");
		
		//DatePicker using Selenium
		
		//wb.findElement(By.id("datepicker")).sendKeys("15/08/2021");
		
		//scroll the fullpage
		
		wb.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		js.executeScript("scroll(0,650)");
		//WebElement E=wb.findElement(By.xpath("//*[@id='mCSB_6_container']/ul/li[13]/img"));
		//js.executeScript("arguments[0].scrollIntoView(true)",E);
	}
}
