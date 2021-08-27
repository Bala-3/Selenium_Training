package com.advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apachepoi {
	@Test
	public void f() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");

		WebDriver wb = new ChromeDriver();

		wb.get("https://m.facebook.com/?locale=en_GB");
		
		wb.manage().window().maximize();

		Thread.sleep(3000);
		
		File f = new File("C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Sample1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet  sheet = w.getSheetAt(0);


		for(int i =1;i<=sheet.getLastRowNum();i++)
		{
			Row r1 = sheet.getRow(i);
			
			String username=r1.getCell(0).toString();  

			String password=r1.getCell(1).toString();	
			
			wb.findElement(By.id("m_login_email")).sendKeys(username);

			wb.findElement(By.id("m_login_password")).sendKeys(password);
			
			wb.findElement(By.xpath("//button[@type='button']")).click();
		}

	}
}
