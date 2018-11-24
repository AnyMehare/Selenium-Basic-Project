package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FatCowCountrySelection 
{
	
public static void main(String[] args) 
 {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.fatcow.com");
	WebElement rv=driver.findElement(By.id("countrySelect"));
	 Select s=new Select(rv);
	 s.selectByValue("GBP");
	 
 }
}
