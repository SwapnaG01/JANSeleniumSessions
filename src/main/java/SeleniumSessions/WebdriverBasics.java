package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapn\\Downloads\\chromedriver\\chromedriver.exe");
	    //Top casting:
		//chrome driver class object can be referred by parent webdriver interface variable
		WebDriver driver=new ChromeDriver();//launch url
		driver.get("https://www.google.com/");//Enter url
		//driver.get("www.google.com");//InValidArgument Exception so https or http is must (i.w protocol is must.
		String title=driver.getTitle();
		System.out.println(title);
		//validation point//check point//act vs expected result
		if(title.equals("Google"))
		{
			System.out.println("Correct title");
			}
		else
		{
			System.out.println("incorrect title");
		}
		//automation steps+validation is automation testing
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().contains("google"));
		System.err.println(driver.getPageSource().contains("Copyright The Closure Library Authors"));
		driver.quit();

	}

}
