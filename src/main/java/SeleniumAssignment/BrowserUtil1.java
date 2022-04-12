package SeleniumAssignment;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil1 {
	public WebDriver driver;
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name is: " + browserName);
	   if (browserName.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "");
		 driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
		 driver = new SafariDriver();
		} else {
		 System.out.println("please pass the correct browser: " + browserName);
				}
	     return driver;
		}
        public void launchUrl(String url) {
		  if (url == null) {
		    System.out.println("please pass the right url");
			return;
				}
			if (url.contains("https") || url.contains("http")) {
				driver.get(url);
				} else {
				    driver.close();
					try {
						throw new Exception("INVALID URL EXCEPTION--pleae pass right url");
					} catch (Exception e) {
						
						e.printStackTrace();
			        }
					
				}
					
			}
			
			public void launchurl(URL url)
			
			{
				driver.navigate().to(url);
			}

			public String getPageTitle() {
				return driver.getTitle();
			}

			public String getPageUrl() {
				return driver.getCurrentUrl();
			}

			public void closeBrowser() {
				driver.close();
			}

			public void quitBrowser() {
				driver.quit();
			}

		
		
		
}	
		

	


