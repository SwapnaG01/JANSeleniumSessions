package SeleniumAssignment;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandles1 {
       static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
			driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
			driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
			driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
			
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			
			String parentWindowId=it.next();
			System.out.println("Parent window id:"+parentWindowId);
			
			String childWindowId1=it.next();
			System.out.println("Child window id:"+childWindowId1);
			
			String childWindowId2=it.next();
			System.out.println("Child window id:"+childWindowId2);
			
			String childWindowId3=it.next();
			System.out.println("Child window id:"+childWindowId3);
			
			String childWindowId4=it.next();
			System.out.println("Child window id:"+childWindowId4);
			
			driver.switchTo().window(childWindowId1);
			String childwindowTitle1=driver.getTitle();
			System.out.println("Child window title: "+childwindowTitle1 );
			driver.close();
			
			driver.switchTo().window(childWindowId2);
			String childwindowTitle2=driver.getTitle();
			System.out.println("Child window title: "+childwindowTitle2 );
			driver.close();
			
			driver.switchTo().window(childWindowId3);
			String childwindowTitle3=driver.getTitle();
			System.out.println("Child window title: "+childwindowTitle3 );
			driver.close();
			
			driver.switchTo().window(childWindowId4);
			String childwindowTitle4=driver.getTitle();
			System.out.println("Child window title: "+childwindowTitle4 );
			driver.close();
			
			driver.switchTo().window(parentWindowId);
			String parentchildTitle=driver.getTitle();
			System.out.println("Parentchild title is: "+parentchildTitle);
			driver.quit();
	  }
}
