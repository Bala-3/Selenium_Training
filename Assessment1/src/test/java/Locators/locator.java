package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class locator {
	
	@FindBy(id="inputFirstName")
	public static WebElement FirstName;
	
	@FindBy(id="inputLastName")
	public static WebElement LastName;
	
	@FindBy(id="inputEmail")
	public static WebElement Email;
	
	@FindBy(id="inputPhone")
	public static WebElement Phone;
	
	@FindBy(id="inputCompanyName")
	public static WebElement inputCompanyName;
	
	@FindBy(id="inputAddress1")
	public static WebElement inputAddress1;
	
	@FindBy(id="inputAddress2")
	public static WebElement inputAddress2;
	
	@FindBy(id="inputCountry")
	public static WebElement inputCountry;
	
	@FindBy(id="inputCity")
	public static WebElement inputCity;
	
	@FindBy(id="stateselect")
	public static WebElement stateselect;
	
	@FindBy(xpath="//input[@id='inputPostcode']")
	public static WebElement inputPostcode;
	
	@FindBy(id="inputNewPassword1")
	public static WebElement inputNewPassword1;
	
	@FindBy(id="inputNewPassword2")
	public static WebElement inputNewPassword2;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement Loginsubmit;
	
	@FindBy(id="Secondary_Sidebar-Client_Shortcuts-Order_New_Services")
	public static WebElement Search_product;
	
	@FindBy(id="pid13")
	public static WebElement Select_product;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement Addtocart;
	

}
