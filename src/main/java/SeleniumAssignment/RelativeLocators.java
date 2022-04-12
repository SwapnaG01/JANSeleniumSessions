/*
 * Using relative locators clicking radio button and checkbox
 */
package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;
public class RelativeLocators {
      static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("NehaR");
        driver.findElement(By.id("input-lastname")).sendKeys("S");
        driver.findElement(By.id("input-email")).sendKeys("sneha@abc.com");
        driver.findElement(By.id("input-telephone")).sendKeys("089576043");
        driver.findElement(By.id("input-password")).sendKeys("dscy");
        driver.findElement(By.id("input-confirm")).sendKeys("dscy");
        
        WebElement ele=driver.findElement(By.xpath("//input[@type='radio' and @value='0']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(ele)).click();
       
        WebElement chkbox=driver.findElement(By.xpath("//input[@value='1' and @name='agree']"));
        chkbox.click();
        driver.findElement(with(By.tagName("input")).toRightOf(chkbox)).click();
       
      }

}
