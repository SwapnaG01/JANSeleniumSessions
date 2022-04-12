/*
 * Mouse over and print 3 catogory list.
 */
package SeleniumAssignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseOverList {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement mainMenu=driver.findElement(By.className("meganav-shop"));
		Actions act=new Actions(driver);
		act.moveToElement(mainMenu).perform();
		Thread.sleep(3000);
		List<WebElement> mainMenuList=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		for(WebElement e:mainMenuList)
		{
		    act.moveToElement(e).perform();
			String text=e.getText();
			System.out.println(text);
		List<WebElement> friutsVegList=driver.findElements(By.xpath("(//ul[contains(@class,'nav-stacked')])[4]//a"));
	    for(WebElement e1:friutsVegList)
	    {
	       act.moveToElement(e1).perform();
	       String text1=e1.getText();
		   System.out.println(text1);
		
		 List<WebElement> potatoOnionList=driver.findElements(By.xpath("(//div[@class='box']//ul[@class='list-unstyled'])[3]//a"));
	   for(WebElement e2:potatoOnionList)
		{
		   act.moveToElement(e2) .perform();
	       String text2=e2.getText();
	       System.out.println(text2);
	    }
	}
}
	}
}
		
	
