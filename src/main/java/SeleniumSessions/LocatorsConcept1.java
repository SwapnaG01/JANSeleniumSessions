package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept1 {
   static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//create webelement+perform actions(click,sendkeys,isDisplayed,getText)
		//1.id locator
		//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("naveentest");
		
		//2.
		//WebElement emailId=driver.findElement(By.id("input-email"));
		//WebElement password=driver.findElement(By.id("input-password"));
		
		//emailId.sendKeys("naveen@gmail.com");
		//password.sendKeys("test@123");
		
		//3.By locator
		//By emailId=By.id("input-email");
		//By password=By.id("input-password");
		//WebElement email=driver.findElement(emailId);
		//WebElement pwd=driver.findElement(password);
		//email.sendKeys("naveen@gmail.com");
		//pwd.sendKeys("test@123");
		
	//4. By locator: generic function
		//By email = By.id("input-email");
        //By password = By.id("input-password");
		//getElement(email).sendKeys("test@gmail.com");
		//getElement(password).sendKeys("test@123");
		
		//5.By locator:generic function(GE,actions)
		//By email = By.id("input-email");
       // By password = By.id("input-password");
		
       // dosendkeys(email,"test@gmail.com");
       // dosendkeys(password,"test@123");
		
		//6.By locators:generic functions(GE,functions)in utility class
		By email = By.id("input-email");
	    By password = By.id("input-password");
	    
	    ElementUtil eleUtil=new ElementUtil(driver);
	    eleUtil.dosendkeys(email,"test@email.com");
	    eleUtil.dosendkeys(password,"test@123");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void dosendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	}




