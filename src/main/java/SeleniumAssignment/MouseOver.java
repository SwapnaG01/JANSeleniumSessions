package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseOver {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			ElementUtil eleutil=new ElementUtil(driver);
			By mainMenu=By.className("meganav-shop");
			By beverage=By.linkText("Beverages");
			By tea=By.linkText("Tea");
			By teabags=By.linkText("Tea Bags");
		    eleutil.selectSubMenu(mainMenu,beverage,tea,teabags);
		}
}
			

	

