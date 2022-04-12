package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp {
    public static WebDriver driver;
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	Alert alert=driver.switchTo().alert();
    	alert.accept();
    	
    	
		

	}

}
