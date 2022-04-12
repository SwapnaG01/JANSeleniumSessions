package SeleniumAssignment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsPrompt {
	 
	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts\r\n");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
			Alert alert=driver.switchTo().alert();
			String text=alert.getText();
			System.out.println(text);
			Thread.sleep(2000);
		    alert.sendKeys("Java Script");
		    alert.accept();
			String result=driver.findElement(By.id("result")).getText();
		    System.out.println(result);
	   }

	}


