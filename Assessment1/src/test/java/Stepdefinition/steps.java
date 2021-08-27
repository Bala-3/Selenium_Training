package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class steps 
{
	WebDriver wb;

	@Given("Open Chrome browser and enter the url of the application")
	public void open_chrome_browser_and_enter_the_url_of_the_application() 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");

		wb = new ChromeDriver();

		wb.get("https://phptravels.org/register.php");
		
		wb.manage().window().maximize();

		System.out.println("Opened the browser and application");

	}

	@When("Enter the details for registration")
	public void enter_the_details_for_registration() 
	{

		//Personal Information

		wb.findElement(By.id("inputFirstName")).sendKeys("Bala1");

		wb.findElement(By.id("inputLastName")).sendKeys("R");

		wb.findElement(By.id("inputEmail")).sendKeys("balasubramaniramas20@gmail.com");

		wb.findElement(By.id("inputPhone")).sendKeys("9192346401");

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

		System.out.println("Details entered");
	}

	@Then("Login successfully")
	public void login_successfully() throws InterruptedException 
	{
		Thread.sleep(100000);

		wb.findElement(By.xpath("//input[@type='submit']")).click(); //Register

		System.out.println("Registered and Logged in Successfully");
	}

	@Given("Login Page")
	public void Login_Page() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balasubramani.ramas\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver.exe");

		wb = new ChromeDriver();
		
		wb.get("https://phptravels.org/index.php?rp=/login");
		
		wb.manage().window().maximize();
		
		wb.findElement(By.id("inputEmail")).sendKeys("balasubramaniramas20@gmail.com");
		
		wb.findElement(By.id("inputPassword")).sendKeys("Bala123");
		
		Thread.sleep(100000);
		
		wb.findElement(By.id("login")).click();

		System.out.println("Logged in Successfully");
	}

	@When("Select the product")
	public void Select_the_product() 
	{
		//wb.findElement(By.xpath("//*[@id='main-body']/div/div/div[4]/div[2]/div[1]/h3/i[2]")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)wb;
		
		js.executeScript("scroll(0,350)");
		
		wb.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Order_New_Services")).click();
		
		wb.findElement(By.id("pid13")).click();

		System.out.println("Product has been Selected");
	}

	@Then("Add to Cart")
	public void Add_to_Cart()  
	{

		wb.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Added to Cart");
	}
	

}


