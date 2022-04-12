package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUp {
          static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();//Java script:popup,confirmation,prompt
		//if no alert is there:NoalertException
	      String text=alert.getText();
	      System.out.println(text);
	      Thread.sleep(2000);
	      //alert.sendKeys("Testing");
	     // alert.accept();//click on ok button
	       alert.dismiss();//click on cancel button	      
	
	
		
		

	}

}
