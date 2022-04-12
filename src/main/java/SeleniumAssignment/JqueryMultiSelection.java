/*
 * Jquery Multi Selection. 
 */
package SeleniumAssignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryMultiSelection {
           static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			driver.findElement(By.id("justAnInputBox1")).click();
			Thread.sleep(2000);
	        By choices=By.xpath("//span[@class='comboTreeItemTitle']");
	        selectChoice(choices,"choice 1","choice 2","choice 7");
	         
		   }
		public static void selectChoice(By locator,String... value)
		{
	    List<WebElement> checkList=driver.findElements(locator);
	      for(WebElement e:checkList)
			{
				String text=e.getText();
				for(int i=0;i<value.length;i++)
				 {
				 if(text.equalsIgnoreCase(value[i]))
				    {
					e.click();
					
					System.out.println(text);
					break;
					}
			     }
				}
			 }
	}