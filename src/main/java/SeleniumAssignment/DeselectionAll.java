/*
 * Selection and deselection all choices.
 */
package SeleniumAssignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeselectionAll {
          static WebDriver driver;
	    public static void main(String[] args) throws InterruptedException {
	     
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/\r\n");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		//List<WebElement> checklist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	    By choices =By.xpath("//span[@class='comboTreeItemTitle']");
	    selectChoice(choices,"ALL");
	    deselectChoice(choices,"ALL");
		
 }	
	public static void selectChoice(By locator,String... value)
	{
    List<WebElement> choiceList=driver.findElements(locator);
    if(!(value[0].equalsIgnoreCase("all")))
	{
		for(WebElement e:choiceList)
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
		else
			{
			//all selection
				try
				{
					for(WebElement e:choiceList)
					{
					
				     e.click();
				     	     
					}
					
				}catch(ElementNotInteractableException e)
				{
					System.out.println("all choices are over");
				}
				
			}
		
	 }
	public static void deselectChoice(By locator,String... value)
	{
    List<WebElement> choiceList=driver.findElements(locator);
    if(!(value[0].equalsIgnoreCase("all")))
	{
		for(WebElement e:choiceList)
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
		else
			{
			//all selection
				try
				{
					for(WebElement e:choiceList)
					{
					
				     e.click();
				     	     
					}
					
				}catch(ElementNotInteractableException e)
				{
					System.out.println("all choices are over");
				}
				
			}
		
	 }
}	
		



