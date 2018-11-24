package SeleniumPackage;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class To 
{
public static void main(String[] args) throws InterruptedException 
{
   FirefoxDriver rv= new FirefoxDriver();
   rv.get("https://www.google.com/");
   Thread.sleep(2000);
   Navigation n=rv.navigate();
   rv.get("https://www.facebook.com/");
   Thread.sleep(2000);
   rv.navigate().back();
   Thread.sleep(2000);
   rv.navigate().forward();
   Thread.sleep(2000);
   rv.navigate().refresh();
   Thread.sleep(2000);
   rv.close();
  
}

}
