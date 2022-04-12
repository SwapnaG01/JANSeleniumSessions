package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTest {

         static WebDriver driver;
	     public static void main(String[] args) throws InterruptedException {
	    	 //selenium4.x
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			 int pagecount=1;
			while(true)
				{
				if(driver.findElements(By.xpath("//td[text()='Ranchi']")).size()>0)
				{
					selectCity("Ranchi");
					System.out.println(pagecount);
					break;
				}
				else
				{
					//Pagenation
					WebElement next=driver.findElement(By.linkText("Next"));
					if(next.getAttribute("class").contains("disabled"))
               {
	             System.out.println("pagination is over...record is not found");
	              break;
               }
				next.click();
				Thread.sleep(2000);
				pagecount++;
				}
			}
	     }
			public static void selectCity(String cityName)
			{
				driver.findElement(By.xpath("//td[text()='"+cityName+"']//preceding-sibling::td/child::input[@type='checkbox']")).click();
			}

	

}
