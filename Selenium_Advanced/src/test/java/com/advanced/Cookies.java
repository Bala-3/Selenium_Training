package com.advanced;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	@Test
	public void f() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");

		WebDriver wb=new ChromeDriver();

		wb.get("https://www.amazon.in/");

		wb.manage().window().maximize();

		wb.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Inspiron 3501");

		wb.findElement(By.id("nav-search-submit-button")).click();
		
		Cookie ck = new Cookie("Cookie_1","1234567890");
		
		Cookie ce = new Cookie("Cookie_2","0987654321");
		
		//Add Cookies
		
		wb.manage().addCookie(ck);
		
		wb.manage().addCookie(ce);

		//Delete Cookies
		
		wb.manage().deleteCookieNamed("session-id");
		
		wb.manage().deleteCookieNamed("session-token");
		
		File f = new File("Cookies.data");

		f.createNewFile();

		FileWriter fw = new FileWriter(f);

		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Cookie c : wb.manage().getCookies())
		{
			bw.write((c.getName()+";"+c.getDomain()+";"+c.getPath()+";"+c.getExpiry()+";"+c.isSecure()+";"+c.getValue()));

			bw.newLine();
				
			System.out.println(c.getName()+";"+c.getDomain()+";"+c.getPath()+";"+c.getExpiry()+";"+c.isSecure()+";"+c.getValue());
		}
		
		bw.close();
		
		fw.close();
		
		

	}
}
