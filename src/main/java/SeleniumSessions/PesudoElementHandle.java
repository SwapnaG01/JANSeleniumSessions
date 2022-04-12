package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PesudoElementHandle {

	 static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/register");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
            String mand_text=js.executeScript(script).toString();
            System.out.println(mand_text);
            
		
		}
}
