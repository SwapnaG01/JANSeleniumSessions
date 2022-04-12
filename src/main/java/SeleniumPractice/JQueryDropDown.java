package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDown {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		List<WebElement> jList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		for(WebElement e:jList) 
		{
		String text=e.getText();
		System.out.println(text);
	
				
		}
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Thread.sleep(2000);
		System.out.println("------------");
		List<WebElement> cascadeList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for(WebElement e:cascadeList) 
		{
		String text1=e.getText();
		System.out.println(text1);
		
		}

	}

}
