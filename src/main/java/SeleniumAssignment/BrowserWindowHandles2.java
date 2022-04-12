package SeleniumAssignment;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandles2 {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println("Parent window id:"+parentWindowId);
		String childWindowId1=it.next();
		System.out.println("Child window id:"+childWindowId1);
	    driver.switchTo().window(childWindowId1);
		String childwindowTitle1=driver.getTitle();
		System.out.println("Child window title: "+childwindowTitle1 );
		driver.close();
		driver.switchTo().window(parentWindowId);
		String parentchildTitle=driver.getTitle();
		System.out.println("Parent window title: "+parentchildTitle);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles2=driver.getWindowHandles();
		Iterator<String> it2=handles2.iterator();
		String parentWindowId2=it2.next();
		System.out.println("Parent window id:"+parentWindowId2);
		String childWindowId2=it2.next();
		System.out.println("Child window id:"+childWindowId2);
	    driver.switchTo().window(childWindowId2);
		String childwindowTitle2=driver.getTitle();
		System.out.println("Child window title: "+childwindowTitle2 );
		driver.close();
		driver.switchTo().window(parentWindowId);
		String parentchildTitle2=driver.getTitle();
		System.out.println("Parent window title: "+parentchildTitle2);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		Set<String> handles3=driver.getWindowHandles();
		Iterator<String> it3=handles3.iterator();
		String parentWindowId3=it3.next();
		System.out.println("Parent window id:"+parentWindowId3);
		String childWindowId3=it3.next();
		System.out.println("Child window id:"+childWindowId3);
	    driver.switchTo().window(childWindowId3);
		String childwindowTitle3=driver.getTitle();
		System.out.println("Child window title: "+childwindowTitle3 );
		driver.close();
		driver.switchTo().window(parentWindowId);
		String parentchildTitle3=driver.getTitle();
		System.out.println("Parent window title: "+parentchildTitle3);
	     
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		Set<String> handles4=driver.getWindowHandles();
		Iterator<String> it4=handles4.iterator();
		String parentWindowId4=it4.next();
		System.out.println("Parent window id:"+parentWindowId4);
		String childWindowId4=it4.next();
		System.out.println("Child window id:"+childWindowId4);
	    driver.switchTo().window(childWindowId4);
		String childwindowTitle4=driver.getTitle();
		System.out.println("Child window title: "+childwindowTitle4 );
		driver.close();
		driver.switchTo().window(parentWindowId);
		String parentchildTitle4=driver.getTitle();
		System.out.println("Parent window title: "+parentchildTitle4);
		driver.quit();
		
	
	
	}
	
}
