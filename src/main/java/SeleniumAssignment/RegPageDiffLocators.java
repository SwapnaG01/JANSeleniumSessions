package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageDiffLocators {

	public static void main(String[] args) {
		BrowserUtil1 brUtil=new BrowserUtil1();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		By firstname = By.id("input-firstname");
        By lastname = By.name("lastname");
        By email = By.xpath("//*[@id=\"input-email\"]");
        By telephone = By.name("telephone");
        By password = By.cssSelector("#input-password");
        By passwordConfirm = By.xpath("//*[@id=\"input-confirm\"]");
        By checkbox=By.name("agree");
        By continuebtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
        By links=By.tagName("h1");
        
        
       ElementUtil eleutil=new ElementUtil(driver);
       eleutil.dosendkeys(firstname,"Tony001");
       eleutil.dosendkeys(lastname, "Bravo001");
       eleutil.dosendkeys(email,"tony001@abc.com");
       eleutil.dosendkeys(telephone,"2121212");
       eleutil.dosendkeys(password, "****");
       eleutil.dosendkeys(passwordConfirm,"****");
       eleutil.doclick(checkbox);
       eleutil.doclick(continuebtn);
       System.out.println("Total number of links:"+eleutil.getElements(links).size());
	   List<String> eleTextlist=eleutil.getLinksTextLinks(links);
	   System.out.println(eleTextlist.size());
	   if(eleTextlist.contains("Your Account Has Been Created!"))
	   {
		   System.out.println("Successfully registered");
	   }
	   else
	   {
		   System.out.println("This account already registered");
	   }
       
      
	
		
	   
	 }

	}


