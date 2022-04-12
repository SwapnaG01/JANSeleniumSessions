package SeleniumSessions;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopcastingConcept {

	public static void main(String[] args) {
		//1.valid and most common topcasting we use --only  we can use methods present in webdriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//2.valid but for remote
		
		RemoteWebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
		//3.valid but we can not use all methods only two findelement,findelements
		//SearchContext driver3=new ChromeDriver();
		//driver3.get("https://www.google.com");
		
		//4.not valid
		//SearchContext driver4=new RemoteWebDriver();
		//5.valid but not suggested
		RemoteWebDriver driver5=new ChromeDriver();
		driver5.get("https://www.google.com");
	}

}
