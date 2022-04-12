/*
 * To find the element and clicking the checkbox in webtable pagination.
 */
package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Pagination {
	     static WebDriver driver;
	     public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			int pagecount=1;
			String nextAtr=driver.findElement(By.linkText("Next")).getAttribute("class");
			while(true)
				{
				   WebElement next=driver.findElement(By.linkText("Next"));
				   if(driver.findElements(By.xpath("//td[text()='Hyderabad']")).size()>0)
				        {
				        	selectCity("Hyderabad");
				            System.out.println("Page count"+pagecount);
				            next.click();
				            }
				            else {
				                   next.click();
				                }
				    if(nextAtr.contains("disabled"))
                          {
                              System.out.println("pagination is over...record is not found");
                              break;
				           }
				 Thread.sleep(2000);
				 pagecount++;
				 nextAtr=driver.findElement(By.linkText("Next")).getAttribute("class");
				}
	     }
	                
	     	
				
	     	
	     
			public static void selectCity(String cityName)
			{
				driver.findElement(By.xpath("//td[text()='"+cityName+"']//preceding-sibling::td/child::input[@type='checkbox']")).click();
			}

	

}
