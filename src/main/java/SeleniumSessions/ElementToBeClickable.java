package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementToBeClickable {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		
		By registry=By.xpath("//a[text()='Registry']");
		By notice=By.xpath("//a[text()='Privacy Notice']");
		clickWhenReady(registry,10);
		clickWhenReady(notice,10);
		

	}
	/**
	 * Repeatedly applies this instance's input value to the given function until one of the followingoccurs: 
     1.the function returns neither null nor false
     2.the function throws an unignored exception
     3.the timeout expires
     4.the current thread is interrupted

	 * @param locator
	 * @param timeout
	 * @return
	 */
  public static void clickWhenReady(By locator,int timeout)
  {
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));  
      wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
  }
  public static void clickElementWhenReady(By locator,int timeout)
  {
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));  
      wait.until(ExpectedConditions.elementToBeClickable(getElement(locator))).click();
  }
  public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
