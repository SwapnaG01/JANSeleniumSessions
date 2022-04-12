package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//bElement country=driver.findElement(By.id("Form_submitForm_Country"));
		//html tag=select--dropdown
		//lect select=new Select(country);
		//select.selectByIndex(5);
	  
		//select.selectByValue("Algeria");
	//hread.sleep(2000);
	//ebElement state=driver.findElement(By.id("Form_submitForm_State"));
     //  Select select1=new Select(state);
     //  select1.selectByVisibleText("Telangana");
         
		By country=By.id("Form_submitForm_Country");
		By state=By.id("Form_submitForm_State");
		//doSelectVisibleText(country,"India");
		//Thread.sleep(2000);
		//doSelectVisibleText(state,"Goa");
		//doSelectIndex(country,5);
		//Thread.sleep(2000);
		//doSelectIndex(state,1);
		doSelectValue(country,"India");
		Thread.sleep(2000);
		doSelectValue(state,"Goa");
         
      }
	   public static WebElement getElement(By locator)
	   {
		   return driver.findElement(locator);
		   
	   }
       public static void doSelectVisibleText(By locator,String text)
       {
    	   Select select=new Select(getElement(locator));
    	   select.selectByVisibleText(text);
       }
       public static void doSelectIndex(By locator,int index)
       {
    	   Select select=new Select(getElement(locator));
    	   select.selectByIndex(index);
       }
       public static void doSelectValue(By locator,String value)
       {
    	   Select select=new Select(getElement(locator));
    	   select.selectByValue(value);
       }
       
       
       

}
