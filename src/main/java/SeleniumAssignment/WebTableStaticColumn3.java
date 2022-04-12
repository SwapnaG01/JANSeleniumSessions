/*
 * * Print third column data in a static webtable.
 */
package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebTableStaticColumn3 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.xpath("//div[@id='accept-choices']")).click();
		By rows=By.xpath("//table[@id='customers']/tbody/tr");
		String before_xpath="//*[@id=\"customers\"]/tbody/tr[";
		String after_xpath="]/td[3]";
		getColumnData(before_xpath,after_xpath,rows);
}
	public static void getColumnData(String before_Xpath,String after_Xpath,By rows)
	{
		for(int row=2;row<=getRowCount(rows);row++)
		{
			
			String xpath=before_Xpath+row+after_Xpath;
			String text=driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);
	   }
	}
	public static int getColCount(By locator)
	{
		return driver.findElements(locator).size();
	}
	
	public static int getRowCount(By locator)
	{
		return driver.findElements(locator).size();
	}
	
}

