package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {
		
		BrowserUtil1 brUtil=new BrowserUtil1();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		By firstname = By.id("input-firstname");
        By lastname = By.id("input-lastname");
        By email = By.id("input-email");
        By telephone = By.id("input-telephone");
        
        By password = By.id("input-password");
        By passwordConfirm = By.id("input-confirm");
        
       ElementUtil eleutil=new ElementUtil(driver);
       eleutil.dosendkeys(firstname,"Tom");
       eleutil.dosendkeys(lastname, "C");
       eleutil.dosendkeys(email,"tom@abc.com");
       eleutil.dosendkeys(telephone, "84375123");
       eleutil.dosendkeys(password, "tomc");
       eleutil.dosendkeys(passwordConfirm,"tomc");
       //brUtil.quitBrowser();
   }

}
