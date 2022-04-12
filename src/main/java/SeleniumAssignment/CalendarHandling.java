/*
 * To select previous date in a calendar.
 */
package SeleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CalendarHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectPreviousDate("January 2020","1");
	}
	public static void selectPreviousDate(String preMonthYear,String dateNum)
	{
		if(Integer.parseInt(dateNum)>31)
		{
			System.out.println("Wrong date,please pass the correct day/date ");
			return;
		}
		if(preMonthYear.contains("February")&& Integer.parseInt(dateNum)>29)
				{
			System.out.println("Wrong date,please pass the correct day/date");
			return;
				}
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		while(!actMonthYear.equalsIgnoreCase(preMonthYear))
		{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			if(preMonthYear.equalsIgnoreCase(actMonthYear))
			{
				break;
			}
		}
		 selectDate(dateNum);

	}
	public static void selectDate(String dateNum)
	{
	
		driver.findElement(By.xpath("//a[text()='"+dateNum+"']")).click();
		
}}
