package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//selectDate("1");
		selectFutureDate("May 2022","11");
		
	}
	public static void selectFutureDate(String expMonthYear,String dateNum)
	{
		if(Integer.parseInt(dateNum)>31)
		{
			System.out.println("Wrong date");
			return;
		}
		if(expMonthYear.contains("February")&& Integer.parseInt(dateNum)>29)
				{
			System.out.println("Wrong date");
			return;
				}
		String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		while(!actMonthYear.equalsIgnoreCase(expMonthYear))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		 selectDate(dateNum);

	}
	public static void selectDate(String dateNum)
	{
	
		driver.findElement(By.xpath("//a[text()='"+dateNum+"']")).click();
		
}}
