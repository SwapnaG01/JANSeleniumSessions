package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
     static WebDriver driver;
	public static void main(String[] args) {
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://amazon.com");
	    // ElementUtil eleutil=new ElementUtil(driver);
	  //String hrefval=driver.findElement(By.linkText("Sell")).getAttribute("href");
	  //System.out.println(hrefval);
	   //By links=By.tagName("a");
	   By images=By.tagName("img");
	   
	   //getElementAttributeList(links,"href");
	  System.out.println( getElements(images).size()); 
	   List<String> srcList=getElementAttributeList(images,"src");
	   List<String> altList=getElementAttributeList(images,"alt");
		 
	   System.out.println(srcList.size());
	   System.out.println(altList.size());
	 }
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static List<String> getElementAttributeList(By locator,String attrName)
	{
		List<WebElement> elelist=getElements(locator);
		List<String> eleAttrList =new ArrayList<String>();
		for(WebElement e:elelist)
		{
			String attrval=e.getAttribute(attrName);
			System.out.println(attrval);
			eleAttrList.add(attrval);
		}
		return eleAttrList;
	}

}
