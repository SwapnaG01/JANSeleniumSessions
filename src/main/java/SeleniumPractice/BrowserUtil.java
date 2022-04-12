package SeleniumPractice;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public WebDriver driver;
	
	public WebDriver laucnchBrowser(String browsername)
	{
		System.out.println("please pass the browser"+browsername);
		

		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://www.google.com");
		}
		else if(browsername.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("http://www.google.com");
		}
		else if(browsername.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
			
		}
		else
		{
			System.out.println("please pass the correct browser");
		}
		return driver;
		
	}
	 public void launchurl(String url)
	 {
		 System.out.println("Please launch url");
		 
		 if(url==null)
		 {
			 System.out.println("please pass the correct url");
			 return;
		 }
		 else if(url.contains("https") || url.contains("http") )
				 {
			 driver.get(url);
			 driver.getTitle();
				 }
		 else
		 {
			 System.out.println("please pass the correct browser");
			 try
			 {
				 throw new Exception("please pass the correct url");
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
	 }
		 
		 public void closeBrowser()
		{
		driver.close();	 
		 }
		 
		 public void navigateurl(URL url)
		 {
			 driver.navigate().to(url);
		 }
		 
		 public void quitBrowser()
		 {
			 driver.quit();
		 }
		 
		 public String getBrowserTitle()
		 {
			 return driver.getTitle();
		 }
		 public String pageUrl()
		 {
			 return driver.getCurrentUrl();
		 }
		 
		 
	 }
	
	
	
	
	
	


