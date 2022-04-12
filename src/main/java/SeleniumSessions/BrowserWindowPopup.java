package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {
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
		
		String childWindowId=it.next();
		System.out.println("Parent window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		String childwindowTitle=driver.getTitle();
		System.out.println("Child window title: "+childwindowTitle );
		
		driver.close();//close the child window--driver lost
		
		driver.switchTo().window(parentWindowId);
		//if without switching, you are interacting parent window:
		//it will throw:nNoSuchWindowException:no such window:target window already closed.
		String parentchildTitle=driver.getTitle();
		System.out.println("Parentchild title is: "+parentchildTitle);
		
		driver.quit();
		
		
		

	}

}
