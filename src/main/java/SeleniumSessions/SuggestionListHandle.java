package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  SuggestionListHandle {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://www.automationpractice.com");
		driver.findElement(By.name("search_query")).sendKeys("Dress");
		Thread.sleep(3000);
		By sugList=By.xpath("//div[@class='ac_results']//li");
		printSuggestionList(sugList);
		
		//driver.findElement(
		   // By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed')]")).click();
		
		//List<WebElement> suggList=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
	//	for(WebElement e:suggList)
		//{
	//		String text=e.getText();
		//	System.out.println(text);
		//	if(text.contains("Casual Dresses")) {
		//		e.click();
			//	break;
			//}
			
		//}
  }
	public static  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
 public static void printSuggestionList(By locator)
 {
	List<WebElement> suggList=getElements(locator);
	for(WebElement e:suggList)
		{
		    String text=e.getText();
			System.out.println(text);
	
        }
 }
}
