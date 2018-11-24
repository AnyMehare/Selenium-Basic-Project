package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitChingBetTabs 
{
public static void main(String[] args) throws InterruptedException 
{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement rv=driver.findElement(By.xpath("//a[@id=\"terms-link\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(rv).perform();
		Thread.sleep(4000);
		a.contextClick().perform();
		Thread.sleep(4000);
		a.sendKeys("t").perform();
		Thread.sleep(4000);
		a.sendKeys(Keys.CONTROL+""+Keys.TAB).perform();
		
		
		
	  
  }
}
