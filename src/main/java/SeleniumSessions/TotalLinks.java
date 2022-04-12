package SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
      static WebDriver driver;
	public static void main(String[] args) {
		//1.Total links on the page
		//2.Print the text of each link
		//3.Exclude the blank text
		//Capture the text in a list and return
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		ElementUtil eleutil=new ElementUtil(driver);
		
		
		//List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		//System.out.println("Total no of links: "+linkslist.size());
		
		//for(WebElement e:linkslist)
		//{
		//	String text=e.getText();
		//	if(!text.isEmpty()) {
		//	System.out.println(text);
		//}
			
			//for(int i=0;i<linkslist.size();i++)
			//{
				//String text=linkslist.get(i).getText();
				//if(!text.isEmpty())
				//{
					//System.out.println(text);
			//}
		//}
		
		By links=By.tagName("a");
		System.out.println("Total number of links:"+eleutil.getElements(links).size());
		
		List<String> eleTextlist=eleutil.getLinksTextLinks(links);
		System.out.println(eleTextlist.size());
		System.out.println(eleTextlist.contains("Sell"));
		
	
	
	}
}
  
	
	
