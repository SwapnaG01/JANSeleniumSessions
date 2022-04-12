package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {
static WebDriver driver;
	public static void main(String[] args) {
	    // 1.Implicitly wait---for global waits
	   //  2.Explicitly wait--for specific element,custom wait,non web element(alerts url,title)
           // a.webdriver wait
           // b.fluent wait
		//webdriver wait(C) extends Fluent wait(C)implements wait(Interface)--until();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		 By email=By.xpath("//input[@id='input-email']");
		 By password=By.xpath("//input[@id='input-password']");
		 By login=By.xpath("//input[@type='submit']");
		 
		 //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		// WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(email));
		// ele.sendKeys("test@gmail.com");
		 //driver.findElement(password).sendKeys("abc");
		 //driver.findElement(login).click();
		 //waitForElementPresent(email, 10).sendKeys("naveen@gamil.com");
		 waitForElementToBeVisisble(email,10).sendKeys("naveen@gmail.com");
		 getElement(password).sendKeys("test@123");
		 getElement(login).click();
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
/**
 * An expectation for checking that an element is present on the DOM of a page.
 *  This does notnecessarily mean that the element is visible.
 * @param locator
 * @param timeout
 * @return
 */
	public static WebElement waitForElementPresent(By locator,int timeout)
       {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
       }
/**
 * An expectation for checking that an element is present on the DOM of a page and visible.
 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
 * @param locator
 * @param timeout
 * @return
 */
	public static  WebElement waitForElementToBeVisisble(By locator,int timeout)
		{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

}
