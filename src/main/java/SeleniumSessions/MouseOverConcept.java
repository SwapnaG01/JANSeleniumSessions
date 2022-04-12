package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
	    WebElement contentEle=	driver.findElement(By.className("menulink"));
	
	
	    Actions act=new Actions(driver);
	    act.moveToElement(contentEle).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("COURSES")).click();
	
		

}
}
