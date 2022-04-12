package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionsConcept {
         static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
	     driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	     
	     
		 By country=By.id("Form_submitForm_Country");
		 By state=By.id("Form_submitForm_State");
		// Select select=new Select(driver.findElement(country));
		 //System.out.println(select.isMultiple());
		 //select.getAllSelectedOptions();
		 
		// Select select=new Select(driver.findElement(country));
		 //List<WebElement> countryList=select.getOptions();
		 //for(WebElement e:countryList)
		 //{
		//	 String text=e.getText();
			// if(text.equals("India"))
			// {
			//	 e.click();
			// break;
				 
			// }
		// }
		 doSelectDropDownValue(country,"India");
		 Thread.sleep(2000);
		 doSelectDropDownValue(state,"Goa");
		 
		// Select select=new Select(driver.findElement(country));
		 //List<WebElement> countryOptions=select.getOptions();
		 //System.out.println(countryOptions.size());
		 
		// for(WebElement e:countryOptions)
		// {
		//	String text= e.getText();
		//	System.out.println(text);
			 
		// }
		// System.out.println(doGetDropDownOptions(country));
		// System.out.println(doGetDropDownOptions(country).contains("India"));
		// System.out.println(doGetDropDownOptions(state));
		 

	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<String> doGetDropDownOptions(By locator) {
		
		Select select=new Select(getElement(locator));
		List<WebElement> optionsList=select.getOptions();
		List<String> optionsValueList=new ArrayList<String>();
		System.out.println(optionsList.size());
		 for(WebElement e:optionsList)
		 {
			String text= e.getText();
		    //System.out.println(text);
			optionsValueList.add(text);
	    }
		 return optionsValueList;
	}
	
	public static void doSelectDropDownValue(By locator,String value)
	{
		 Select select=new Select(getElement(locator));
		 List<WebElement> countryList=select.getOptions();
		 for(WebElement e:countryList)
		 {
			 String text=e.getText();
			 if(text.equals(value))
			 {
				 e.click();
			 break;
				 
			 }
		 }
		
	}
	

}
