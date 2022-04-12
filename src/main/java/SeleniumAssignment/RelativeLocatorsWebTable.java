/*
 * Printing webtable data using relative locators.
 */
package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
public class RelativeLocatorsWebTable {

	 static WebDriver driver;
     public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement webtable=driver.findElement(By.xpath("//span[text()='STATES']"));
	    List<WebElement> webtableList=driver.findElements(with(By.tagName("tr")).below(webtable));
	    for(WebElement e:webtableList)
		{
			System.out.println(e.getText());
		}
		
     }
}
