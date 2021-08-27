package com.assessmet_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PHPTravels {
	
	@Test
	public void f() throws InterruptedException, IOException {

		FileInputStream f =new FileInputStream("src\\test\\java\\com\\assessmet_1\\config.properties");

		Properties p =new Properties();

		p.load(f);

		String browser_name = p.getProperty("browser");

		String driver_path = p.getProperty("driver_path");

		WebDriver wb;

		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driver_path);

			wb = new ChromeDriver();
		}

		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",driver_path);

			wb = new FirefoxDriver();
		}

		else
		{
			System.setProperty("webdriver.ie.driver",driver_path);

			wb = new InternetExplorerDriver();
		}

		wb.get("https://phptravels.org/register.php");
		
		wb.manage().window().maximize();

		//Personal Information

		wb.findElement(By.id("inputFirstName")).sendKeys("Bala1");
		
		wb.findElement(By.id("inputLastName")).sendKeys("R");
		
		wb.findElement(By.id("inputEmail")).sendKeys("balasubramani.ramas1.5@gmail.com");
		
		wb.findElement(By.id("inputPhone")).sendKeys("9992346401");

		//Billing Address

		wb.findElement(By.id("inputCompanyName")).sendKeys("HCL");
		
		wb.findElement(By.id("inputAddress1")).sendKeys("Shollinganallur");
		
		wb.findElement(By.id("inputAddress2")).sendKeys("Shollinganallur, Chennai, Tamilnadu");
		
		Select s1=new Select(wb.findElement(By.id("inputCountry")));
		s1.selectByVisibleText("India");
		
		wb.findElement(By.id("inputCity")).sendKeys("Chennai");
		
		Select s=new Select(wb.findElement(By.id("stateselect")));
		
		s.selectByVisibleText("Tamil Nadu");
		
		wb.findElement(By.xpath("//input[@id='inputPostcode']")).sendKeys("600008");

		//Account Security

		wb.findElement(By.id("inputNewPassword1")).sendKeys("Bala123");
		
		wb.findElement(By.id("inputNewPassword2")).sendKeys("Bala123");

		Thread.sleep(100000);

		wb.findElement(By.xpath("//input[@type='submit']")).click(); //Register

		//logout

		//wb.findElement(By.xpath("//*[@id='header']/div/ul/li[3]/a")).click(); 


		//login

		//wb.findElement(By.id("inputEmail")).sendKeys("balasubramani.ramas1.5@gmail.com");
		//wb.findElement(By.id("inputPassword")).sendKeys("Bala123");
		//Thread.sleep(100000);
		//wb.findElement(By.id("login")).click();


		//Select the product
		wb.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Order_New_Services")).click();

		wb.findElement(By.id("pid13")).click();

		//Added to cart
		wb.findElement(By.xpath("//button[@type='submit']")).click(); //Add to cart

	}
}
