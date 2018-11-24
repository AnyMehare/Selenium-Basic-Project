package IRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TOllFreeNoChecking 
{
   public static void main(String[] args) 
   {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.irctc.co.in/nget/");
   }
}
