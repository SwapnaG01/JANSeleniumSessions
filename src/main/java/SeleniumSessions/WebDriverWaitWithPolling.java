package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitWithPolling {
        static WebDriver driver;
	public static void main(String[] args) {
		//default polling time is 500milliseconds in selenium.
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		 By email=By.xpath("//input[@id='input-email']");
		 By password=By.xpath("//input[@id='input-password']");
		 By login=By.xpath("//input[@type='submit']");
		 waitForElementPresent(email,10,2000).sendKeys("abc@gmail.com");
		 getElement(password).sendKeys("abc");
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
 * @param pollingtime
 * @return
 */
	public static WebElement waitForElementPresent(By locator,int timeout,long pollingtime)
       {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(pollingtime));
	 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
       }
/**
 * An expectation for checking that an element is present on the DOM of a page and visible.
 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
 * @param locator
 * @param timeout
 * @param pollingtime
 * @return
 */
	public static WebElement waitForElementToBeVisisble(By locator,int timeout,long pollingtime)
	{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(pollingtime));
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	}


