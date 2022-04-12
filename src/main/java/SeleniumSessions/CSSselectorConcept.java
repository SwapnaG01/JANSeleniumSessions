package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSselectorConcept {
            static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		//custom CSSselector
		
		//css Slector
		By.cssSelector("#input-email");
		//id
		By.cssSelector("#input-email");
		//class
		By.cssSelector("");
		
		

	}

}
