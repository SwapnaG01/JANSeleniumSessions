package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlConcept {

	static WebDriver driver;
	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		 By email=By.xpath("//input[@id='input-email']");
		 By password=By.xpath("//input[@id='input-password']");
		 By login=By.xpath("//input[@type='submit']");
		 waitForElementToBeVisisble(email,10,2000).sendKeys("naveenanimation20@gmail.com");
		 getElement(password).sendKeys("Selenium12345");
		 getElement(login).click();
		 //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//if( wait.until(ExpectedConditions.urlContains("route=account/account")))
		//{
			//System.out.println(driver.getCurrentUrl());
		//}
		waitforUrl(5,"route=account/account");
		 String title=waitForTitleContains(5,"My Account");
		 System.out.println(title);
		 
	}
	public static String waitForTitleContains(int timeout,String titleFraction)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(titleFraction)))
				{
			return driver.getTitle();
				}
		else{
			System.out.println("title is not correct");
			return null;
		}
	
	}
	public static String waitForTitleIs(int timeout,String titleVal)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(titleVal)))
				{
			return driver.getTitle();
				}
		else{
			System.out.println("title is not correct");
			return null;
		}
	}
	
	public static String waitforUrl(int timeout,String urlFraction)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			if( wait.until(ExpectedConditions.urlContains(urlFraction)))
			{
				return driver.getCurrentUrl();
			}
			return null;
		
	}
	public static String waitforUrlToBe(int timeout,String urlVal)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			if( wait.until(ExpectedConditions.urlToBe(urlVal)))
			{
				return driver.getCurrentUrl();
			}
			return null;
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static WebElement waitForElementToBeVisisble(By locator,int timeout,long pollingtime)
	{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofMillis(pollingtime));
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
