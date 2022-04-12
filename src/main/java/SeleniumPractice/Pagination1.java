
/*
 *Pagination printing first column names in dynamic webtablef comparing the count.
 */
 package SeleniumPractice;
 import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Pagination1 {
    static WebDriver driver;	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.datatables.net/examples/advanced_init/dt_events.html");
		int pgSize=driver.findElements(By.xpath("//div[@id='example_paginate']//span/a")).size();
		List<String> names=new ArrayList<String>();
		
		for(int i=1;i<=pgSize;i++)
		{
			String pageSelector="(//div[@id='example_paginate']//span/a)["+i+"]";
			driver.findElement(By.xpath(pageSelector)).click();
			List<WebElement> namesElements=driver.findElements(By.xpath("//td[@class='sorting_1']"));
			for(WebElement e:namesElements)
			{
				names.add(e.getText());
			}
		}
		
		for(String s:names)
		  {
            System.out.println(s);
          }
		int j=names.size();
         System.out.println("total number of names :"+j);
         String displaycount=driver.findElement(By.xpath("//div[@id='example_info']")).getText().split(" ")[5];
         System.out.println(displaycount);
         
         if(displaycount.equals(String.valueOf(j)))
         {
        	System.out.println("count is same"); 
         }
         else
         {
        	 System.out.println("count is not same");
         }
         
         driver.quit();
  }
}
