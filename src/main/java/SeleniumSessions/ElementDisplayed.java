package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleutil=new ElementUtil(driver);
		
		//By emailId=By.id("input-email11"); NoSuchelElementException thrown by driver.findelement method
		By emailId=By.id("input-email");
		//boolean flag=driver.findElement(emailId).isDisplayed();
		//System.out.println(flag);
		if(eleutil.doIsdisplayed(emailId)) {
			eleutil.dosendkeys(emailId, "abc@gmail.com");
		}
		
		//if(eleutil.doIsenabled(emailId))
		//{
			//eleutil.dosendkeys(emailId, "abcd@email.com");
		//}
		

	}

}
