/*
 * Jquery Single selection.
 */
package SeleniumAssignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySingleSelection {
        static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		//List<WebElement> checklist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		driver.findElement(By.id("justAnotherInputBox")).click();
		
		By choiceList=By.xpath("//span[@class='comboTreeItemTitle']");
		
		singleSelection(choiceList,"choice 2 1");
	
	}
	     public static void singleSelection(By locator,String value)
	     {
	    	 List<WebElement> checklist=driver.findElements(locator);
	    	 for(WebElement e:checklist)
				{
					String text=e.getText();
					System.out.println(text);
					if(text.equalsIgnoreCase(value))
					{
						e.click();
						break;
					}
				}
	    	 
	     }
}
