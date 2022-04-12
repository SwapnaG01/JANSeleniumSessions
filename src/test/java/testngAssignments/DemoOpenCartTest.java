package testngAssignments;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DemoOpenCartTest extends BaseTest {
	@Test
	public void accountloginTest()
	{
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 String url= driver.getCurrentUrl();
		 Assert.assertTrue(url.contains("account"));
	}
	@Test
	public void logoutTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Logout' and @class='list-group-item']")).isDisplayed());
	
	}
	@Test
	public void myAccountTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed());
	
	}
	@Test
	public void myOrdersTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Orders']")).isDisplayed());
	
	}
	@Test
	public void myAffiliateAccountTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Affiliate Account']")).isDisplayed());
	}
	@Test
	public void newsletterTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Newsletter']")).isDisplayed());
	}
	@Test
	public void itemsTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Assert.assertTrue(driver.findElement(By.xpath("//span[@id='cart-total']")).isDisplayed());
	
	}
	
	
	
	
	
	
	
	
	

}
