package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {
	 static WebDriver driver;
     
     public static void main(String[] args) throws InterruptedException {
 		WebDriverManager.chromedriver().setup();
 		driver =new ChromeDriver();
 		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
 		
     }
}
