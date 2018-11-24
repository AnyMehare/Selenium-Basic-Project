package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookIDPWD 
{
  public static void main(String[] args) 
 {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//id
	By rv=By.id("email");
	WebElement ref=driver.findElement(rv);
	ref.sendKeys("anyamehare@gmail.com");
	System.out.println();
	//pWd
	By rv1=By.id("pass");
	WebElement ref1=driver.findElement(rv1);
	ref1.sendKeys("aaiba");
	//login
     By rv2=By.id("loginbutton");
	WebElement ref2=driver.findElement(rv2);
	ref2.click();
	
	
 }
  
}
