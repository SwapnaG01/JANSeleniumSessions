package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		  // 1.Implicitly wait---for global waits
		   //  2.Explicitly wait--for specific element,custom wait,non web element(alerts url,title)
	           // a.webdriver wait
	           // b.fluent wait
			//webdriver wait(C) extends Fluent wait(C)implements wait(Interface)--until();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
            //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            //Alert alert=wait.until(ExpectedConditions.alertIsPresent());
			//System.out.println(alert.getText());
            //alert.accept();
			waitForAlert(10);
			acceptAlert(10);
	        
	
	}

	public static Alert waitForAlert(int timeout)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
         return wait.until(ExpectedConditions.alertIsPresent());
	     
	}
	public static void acceptAlert(int timeout)
	{
		waitForAlert(timeout).accept();
		
	}
	public static void dismissAlert(int timeout)
	{
		waitForAlert(timeout).dismiss();
		
	}
	public static String getAlertText(int timeout)
	{
		return waitForAlert(timeout).getText();
		
	}

}
