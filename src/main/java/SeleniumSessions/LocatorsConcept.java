package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("99.0").setup();
	    driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	    By email = By.id("input-email");//by is a class and id is static method
        By password = By.id("input-password");
		getElement(email).sendKeys("test@gmail.com");
		getElement(password).sendKeys("test@123");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	}




