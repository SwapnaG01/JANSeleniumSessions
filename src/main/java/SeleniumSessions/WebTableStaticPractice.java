package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableStaticPractice {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
		//int rowcount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		//int colcount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		By rows=By.xpath("//table[@id='customers']/tbody/tr");
		By cols=By.xpath("//table[@id='customers']//th");
		String before_Xpath="//*[@id=\"customers\"]/tbody/tr[";
		String after_Xpath="]/td[";
        String after_xpath="]";
        
		for(int row=2;row<=getRowCount(rows);row++)
			{
			for(int col=1;col<=getColCount(cols);col++)
			{
				String xpath=before_Xpath+row+ after_Xpath+col+after_xpath;
				//System.out.println(xpath);
				String text=driver.findElement(By.xpath(xpath)).getText();
				System.out.println(text);
				
			}
			System.out.println("\n");
			}
	}
	   // for(int row=2;row<=getRowCount(rows);row++)
		//{
			//String xpath=before_Xpath+row+after_Xpath;
			//String text=driver.findElement(By.xpath(xpath)).getText();
			//System.out.println(text);
			
		//}
		//getColumnData(before_Xpath,after_Xpath,rows);
		

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
