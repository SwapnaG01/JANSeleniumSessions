package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementsConcept {
	 static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.freshworks.com/");
			
			By footer=By.xpath("//ul[@class='footer-nav']//a");
			printAllElementsText(footer,10);
			if(getElementsTextListWithWait(footer,10).contains("Contact us"))
			{
				System.out.println("Contact us is present..");
			}
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//List<WebElement>footerList=
		//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
	//for(WebElement e:footerList)
	//{
	//	System.out.println(e.getText());
	//}
	
}
		public static void printAllElementsText(By locator,int timeout)
		{
			List<WebElement>footerList=waitForElementsToBeVisible(locator,timeout);
			for(WebElement e:footerList)
			{
				System.out.println(e.getText());
			}
		}
		public static List<String> getElementsTextListWithWait(By locator,int timeout)
		{
			List<WebElement>footerList=waitForElementsToBeVisible(locator,timeout);
			List<String> footerTextList=new ArrayList<String>();
			for(WebElement e:footerList)
			{
				String text=e.getText();
				footerTextList.add(text);
			}
			return footerTextList;
		}
		
		public static List<WebElement> waitForElementsToBeVisible(By locator,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
}
