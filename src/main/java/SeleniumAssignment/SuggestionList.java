/*
 * To print sugession list text on the console and clicking the option that contains given text.
 */
package SeleniumAssignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.get("http://www.automationpractice.com");
	    driver.findElement(By.name("search_query")).sendKeys("Dress");
	    Thread.sleep(3000);
       List<WebElement> suggList=driver.findElements(By.xpath("//div[@class='ac_resu lts']//li"));
		for(WebElement e:suggList)
		{
		    String text=e.getText();
			System.out.println(text);
			if(text.contains("Casual Dresses")) {
				e.click();
				break;
		  }

	  }
	}
}


