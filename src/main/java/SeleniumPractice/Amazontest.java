package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontest {
    static  WebDriver driver;
	public static WebElement getelement(By locator)
	  {
		return driver.findElement(locator);
	   }
	public static void dosendkeys(By locator,String value)
	{
		getelement(locator).sendKeys(value);
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		//driver.get("https://ttrockstars.com/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		By search=By.id("twotabsearchtextbox");
		By submit=By.id("nav-search-submit-button");
		
		//getelement(search).sendKeys("books");
		dosendkeys(search,"books");
		getelement(submit).click();

	}

}
