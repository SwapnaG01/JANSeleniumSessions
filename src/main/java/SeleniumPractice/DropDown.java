package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
      static WebDriver driver;
      
      public static void main(String[] args) throws InterruptedException {
  		WebDriverManager.chromedriver().setup();
  		driver =new ChromeDriver();
  		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//a[@aria-label='Accept Cookies' and @title='Accept Cookies']")).click();
  	//WebElement country=	driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
  	By country=By.xpath("//select[@id='Form_submitForm_Country']" );
  	By state=By.xpath("//select[@id='Form_submitForm_State']");
    //Select select=new Select(country);
  	//select.selectByVisibleText("India");
  	//select.deselectByIndex(2);
  	
  	//doselectbyvalue(state,"Telangana");
  	//Select select=new Select(getElement(country));
  	//List<WebElement>countryList=select.getOptions();
  	////System.out.println(countryList.size());
  	//for(WebElement e:countryList)
  	//{
  	
  	//	String text=e.getText();
  		//System.out.println(text);
  //	}
  	
  	doGetOptionsList(country);
  	Thread.sleep(2000);
  	System.out.println(doGetOptionsList(country).contains("India"));
  	doselectbyvalue(country,"India");
  	Thread.sleep(2000);
  	
  	System.out.println(doGetOptionsList(state).contains("Goa"));
  	
  	doSelectOptionsByVlaue(state,"Goa");
}
      public static void doSelectOptionsByVlaue(By locator,String value)
      {
    	  Select select=new Select(getElement(locator));
    	  	List<WebElement>optionsList=select.getOptions();
    	  	System.out.println(optionsList.size());
    	  	for(WebElement e:optionsList)
    	  	{
    	  	
    	  		String text=e.getText();
    	  		if(text.equals(value))
    	  		{
    	  			e.click();
    	  			break;
    	  		}
    	  	} 
    	  
      }
      
      public static List<String> doGetOptionsList(By locator)
      {
    	  Select select=new Select(getElement(locator));
    	  	List<WebElement>optionsList=select.getOptions();
    	  	List<String> optionsValList=new ArrayList<String>();
    	  	System.out.println(optionsList.size());
    	  	for(WebElement e:optionsList)
    	  	{
    	  	
    	  		String text=e.getText();
    	  		//System.out.println(text);
    	  		optionsValList.add(text);
    	  	} 
    	  	return optionsValList;
      }
      public static WebElement getElement(By locator) {
    	  return driver.findElement(locator);
      }
      public static void doselectbyvalue(By locator,String value)
      {
    	  Select select=new Select(getElement(locator));
    	  select.selectByValue(value);
      }
}
