package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Orangehrmtest {
          
		public static void main(String[] args) {
			BrowserUtil1 brUtil=new BrowserUtil1();
			WebDriver driver=brUtil.launchBrowser("chrome");
			brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			By name = By.name("subdomain");
	        By firstname = By.id("Form_submitForm_Name");
	        By email = By.name("Email");
	        By telephone = By.xpath("//*[@id=\"Form_submitForm_Contact\"]");
	        By submitbtn=By.id("Form_submitForm_action_request");
	      
	        WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
	        
	        ElementUtil eleutil=new ElementUtil(driver);
	        eleutil.dosendkeys(name,"kingdom1234");
	        eleutil.dosendkeys(firstname,"Tony11");
	        eleutil.dosendkeys(email,"tony2@abc.com");
	        eleutil.dosendkeys(telephone,"2121213");
	        Select select=new Select(country);
	       // select.selectByIndex(5);
	        select.selectByVisibleText("India");
	       // select.selectByValue("Algeria");
	        eleutil.doclick(submitbtn);
	       
	}

}
