package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrameConcept {
	    static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");
			By frameLocator=By.xpath("//frame[@name='main']");
			driver=waitForFrameByLocator(5,frameLocator);
			String header=driver.findElement(By.xpath("/html/body/h2")).getText();
		    System.out.println(header);
		    //driver.switchTo().defaultContent();
		}
		public static WebDriver waitForFrameByElement(int timeout,WebElement frameElement)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
		}
		public static WebDriver waitForFrameByString(int timeout,String frameLocator)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		}
		public static WebDriver waitForFrameByIndex(int timeout,int frameIndex)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		}
		public static WebDriver waitForFrameByLocator(int timeout,By frameLocator)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		}
		
}
