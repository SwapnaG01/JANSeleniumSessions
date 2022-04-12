package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.navigate().to("http://www.google.com");//to method internally calls get method only 
		System.out.println(driver.getTitle());
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
	    driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		

	}

}
