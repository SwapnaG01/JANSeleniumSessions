package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorsConcept {
     static WebDriver driver;
     public static void main(String[] args) {
    	 //selenium4.x
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele=driver.findElement(By.linkText("Windsor, Canada"));
		//toRightof
		String index=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(index);
		//toLeftof
		String rank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);
		//below
		String below=driver.findElement(with(By.tagName("p")).below(ele)).getText();
        System.out.println(below);
        //above
        String above=driver.findElement(with(By.tagName("p")).above(ele)).getText();
        System.out.println(above);
        //near
        String near=driver.findElement(with(By.tagName("p")).near(ele)).getText();
        System.out.println(near);
        
      List<WebElement> aboveList= driver.findElements(with(By.tagName("a")).above(ele));
      for(WebElement e:aboveList)
      {
    	  System.out.println(e.getText());
      }
   }

}
