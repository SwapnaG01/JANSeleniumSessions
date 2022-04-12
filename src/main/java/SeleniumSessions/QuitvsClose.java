package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

	public static void main(String[] args) {
		  
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\swapn\\Downloads\\chromedriver\\chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.get("https://www.google.com/");//enter url
	 		String s1=driver.getCurrentUrl();//get the url
	 		System.out.println("Current Url is: "+s1);//printing url
	 		String s=driver.getTitle(); //get the title  
	 		System.out.println(s);//print the title
	 		driver.quit();//quit the browser
	 		
	 		//System.out.println(driver.getTitle());//session ID is null//NosuchSessionException
	 		
	 		driver =new ChromeDriver();//re initialise the browser//always create new session id launch new browser
	 		driver.get("https://www.amazon.co.uk");//get the url
	 		System.out.println(driver.getTitle());//print the title
	 		driver.close();//close the browser
	 		
	 		//System.out.println(driver.getCurrentUrl());//invalid session id//NoSuchSessionException
	 	
	 		
	}

}
