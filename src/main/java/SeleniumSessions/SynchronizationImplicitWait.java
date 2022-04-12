package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationImplicitWait {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
      // Thread.sleep(2000);//static wait
		
		//dynamic wait:
		//implicitly wait:
		   //global wait:it will be applicabale for all the web elements
		   //FE:imp wait will be applied by default
		   //it works only for web elements
		   //it does not work for non web elements:alerts,url,title
		   //we avoid imp wait in framework design
		   
		//timeout=10secs-->2 secs--->8 sec ignored
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='input-email11']")).sendKeys("abc@email.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abc@123");
		//home page :5 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e5 e6
		//click on logout
		//login page:5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on register:
		//register page:15 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//e9 e10
		//product page :0 secs nullify imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
	}

}
