package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablkeCheckbox {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//a[contains(text(),'Joe.Root')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		selectUserName("Joe.Root");
		selectUserName("John.Smith");
}
	public static void selectUserName(String name)
	{
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
	}
	
}