package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleutil=new ElementUtil(driver);
		
		//1.id: Unique 
		//2.name :can be duplicate
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		//By email=By.name("email");
		//By passsword =By.name("password");
	   // eleutil.dosendkeys(email, "abc@gmail.com");
	    //eleutil.dosendkeys(passsword, "****");
		
		//3.classname :can be duplicate for thedifferent elements
		//By email=By.className("form-control");
		
		//eleutil.dosendkeys(email,"abc@gamil.com");
		
		//4.xpath:not an attribute
		//By email=By.xpath("//*[@id=\"input-email\"]");
		//By passsword =By.xpath("//*[@id=\"input-password\"]");
		//By loginBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		//eleutil.dosendkeys(email, "abc@gmail.com");
		//eleutil.dosendkeys(passsword, "*****");
		//eleutil.doclick(loginBtn);
		
		//5.css selector :not an attribute
		
		//By email=By.cssSelector("#input-email");
		//By passsword =By.cssSelector("#input-password");
		
		//eleutil.dosendkeys(email, "abc@gmail.com");
		//eleutil.dosendkeys(passsword, "*****");
		
		//6.link text:
		//<html tag a>
		//By register=By.linkText("Register");
		
		//eleutil.doclick(register);
		
		//7.partiallinktext
		
		//By ForgottenPasswoprd=By.partialLinkText("Forgotten");
		//eleutil.doclick(ForgottenPasswoprd);
		
		//8.tagname:html tag not the attribute
		//String text=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(text);
		
		By header=By.tagName("h2");
		By register=By.linkText("Register");
		String text=eleutil.dogettext(header);
		System.out.println(text);
		String regtext=eleutil.dogettext(register);
		System.out.println(regtext);
		
		
		
		
		
		
		
		
	    
	    
	    

	}

}
