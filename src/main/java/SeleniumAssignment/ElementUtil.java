package SeleniumAssignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
    
	private WebDriver driver;
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	}
    public By getby(String locatorType,String locatorValue)
	{
		By locator=null;
		switch(locatorType.toLowerCase()) {
		case "id":
			locator=By.id(locatorValue);
			break;
		case "name":
			locator=By.name(locatorValue);
			break;
		case "classname":
			locator=By.className(locatorValue);
			break;
		case "xpath":
			locator=By.xpath(locatorValue);
			break;
		case "cssselectior":
			locator=By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator=By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator=By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator=By.tagName(locatorValue);
			break;
			
			
		default:
			break;
		}
		return locator;
	}
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	public  void dosendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	public void doclick(By locator)
	{
		getElement(locator).click();
	}
	public String dogettext(By locator) 
	{
		return getElement(locator).getText();
	}
	public boolean doIsdisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	public boolean doIsenabled(By locator)
	{
		return getElement(locator).isEnabled();
	}
	
	
	public  List<String> getLinksTextLinks(By locator)
	{
	     List<WebElement> eleList=getElements(locator);
	     List<String> eleTextList=new ArrayList<String>();
	     for(WebElement e:eleList)
	 		{
	 		String text=e.getText();
	 		if(!text.isEmpty()) {
	 		eleTextList.add(text);
	 		}
	}
	     return eleTextList;
    }
	
	public  List<String> getElementAttributeList(By locator,String attrName)
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
		//*****************DROPDOWN UTILS*****************//
	 public void doSelectVisibleText(By locator,String text)
     {
  	   Select select=new Select(getElement(locator));
  	   select.selectByVisibleText(text);
     }
     public void doSelectIndex(By locator,int index)
     {
  	   Select select=new Select(getElement(locator));
  	   select.selectByIndex(index);
     }
     public void doSelectValue(By locator,String value)
     {
  	   Select select=new Select(getElement(locator));
  	   select.selectByValue(value);
     }
     
     public List<String> doGetDropDownOptions(By locator) {
 		
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
     public void doSelectDropDownValue(By locator,String value)
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
 	public  void dropDownWithoutSelect(By locator,String value)
 	{
 	
 		 List<WebElement> countryList=getElements(locator);
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
 	public  void printSuggestionList(By locator)
 	 {
 		List<WebElement> suggList=getElements(locator);
 		for(WebElement e:suggList)
 			{
 			    String text=e.getText();
 				System.out.println(text);
 		      }
 	}
}


