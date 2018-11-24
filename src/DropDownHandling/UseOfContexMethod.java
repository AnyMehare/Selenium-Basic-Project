package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfContexMethod 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	WebElement rv=driver.findElement(By.xpath("(//img[@class=\"img\"])[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(rv).perform();
	Thread.sleep(4000);
	a.contextClick().perform();
	
	/*a.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(4000);
	a.sendKeys(Keys.ENTER).perform();*/
	a.sendKeys("i").perform();// ShortCut underline letter are also send in sendkeys.
}
}
