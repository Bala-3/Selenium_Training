package com.advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class FileUploadAndDownload {
	@Test
	public void f() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.adobe.com/in/acrobat/online/word-to-pdf.html");
		wb.manage().window().maximize();
		
		//Click the Select File button
		Thread.sleep(3000);
		wb.findElement(By.xpath("//button[@id='lifecycle-nativebutton']")).click();
		
		String Filepath = "C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Sample1.docx";
		
		StringSelection s1 = new StringSelection(Filepath);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
		
		Thread.sleep(3000);

		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(8000);
		
		wb.findElement(By.xpath("//button[@data-test-id='download']")).click();
		
		Thread.sleep(4000);
		
		File path = new File("C:\\Users\\balasubramani.ramas\\Downloads");
		
		File[] f = path.listFiles();
		
		for(File file : f)
		{
			if(file.getName().equalsIgnoreCase("Sample1.pdf"))
			{
				System.out.println("File is Downloaded");
				break;
			}
		}
		
	}
}
