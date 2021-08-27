package Functionality;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Locators.locator;

public class Scripts {

	@Test
	public void f() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");

		WebDriver wb = new ChromeDriver();

		wb.get("https://phptravels.org/register.php");

		wb.manage().window().maximize();

		PageFactory.initElements(wb, locator.class);

		//Personal Information

		locator.FirstName.sendKeys("Bala_1");

		locator.LastName.sendKeys("R");

		locator.Email.sendKeys("balasubramaniramas2.0@gmail.com");

		locator.Phone.sendKeys("8093892788");

		//Billing Address

		locator.inputCompanyName.sendKeys("HCL");

		locator.inputAddress1.sendKeys("Chennai");

		locator.inputAddress2.sendKeys("Navalur");

		Select s1 = new Select(locator.inputCountry);
		s1.selectByVisibleText("India");

		locator.inputCity.sendKeys("Chennai");

		Select s2 = new Select(locator.stateselect);
		s2.selectByVisibleText("Tamil Nadu");

		locator.inputPostcode.sendKeys("629900");

		//Account Security

		locator.inputNewPassword1.sendKeys("Bala123");

		locator.inputNewPassword2.sendKeys("Bala123");

		//Register
		Thread.sleep(100000);
		
		locator.Loginsubmit.click();
		
		//Home_Page
		
		JavascriptExecutor js= (JavascriptExecutor)wb;

		js.executeScript("scroll(0,350)");
		
		//Search the Product
		
		locator.Search_product.click();
		
		//Select the Product
		
		locator.Select_product.click();
		
		//Add the Product
		
		locator.Addtocart.click();
		
		



	}
}
