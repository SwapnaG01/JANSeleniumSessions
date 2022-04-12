package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
         static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
        Thread.sleep(2000);
		driver.findElement(By.id("L2AGLb")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@title='Search']"));
		ele.sendKeys("Naveen automationlabs");
		ele.click();
		Thread.sleep(2000);
	   //List<WebElement> searchList=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	    By suggList1=By.xpath("//div[@class='wM6W7d']/span");
	    getSuggestionList(suggList1);
	    getSuggestionList(suggList1,"github");
	
}
	public static  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static void getSuggestionList(By locator)
	{
		List<WebElement> suggList=getElements(locator);
	
		for(WebElement e:suggList)
		{
		String text=e.getText();
		System.out.println(text);
		
	}
	}
	public static void getSuggestionList(By locator,String value)
	{
		List<WebElement> suggList=getElements(locator);
	
		for(WebElement e:suggList)
		{
		String text=e.getText();
		System.out.println(text);
		if(text.contains(value))
		{
			e.click();
			break;
		}
		
	}
	}

}
