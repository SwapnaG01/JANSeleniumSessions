package testngSessions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DemoOpenCartTest {
   WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}
	@Test
	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Account Login");
	}
	@Test
	public void urlTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("demo"));
	}
	@Test
	public void searchTest()
	{
	Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}