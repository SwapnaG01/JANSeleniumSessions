package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEandFEsExceptions {
    static WebDriver driver;
	public static void main(String[] args) {
		/* ******List of Exceptions********/
		//IllegalstateException
		//staleElementRefException
		//ElementNotInteractableException
		//NoSuchElementException
		//NosuchsessionException
		//TimeoutException
		//NoalertException
		//NOFrameException
		//NobrowserwindowException
		
		//no exception thrown in case of driver.findelements but it will return 0
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		//driver.findElement(By.linkText("customers222"));//NosuchElementexception in case of drivrer.findelement
		//List<WebElement> footerList=driver.findElements(By.xpath("//ul[@class='footer-nav11']//a"));
		//System.out.println(footerList.size());//0 that means no exception thrown in case of driver.findelements
		
		//if xpath syntax wrong it gives InvalidselectorException
    System.out.println(isElementPresent(By.linkText("customers")));
	}
	public static List<WebElement>getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static boolean isElementPresent(By locator)
	{
		if(getElements(locator).size()>0) {
			return true;
		}
		return false;
		}
	

}
