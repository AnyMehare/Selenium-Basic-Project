package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOBListBox 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
   
    //Approach-01
	WebElement rv=driver.findElement(By.id("day"));
    Thread.sleep(2000);
    rv.click();
    Thread.sleep(2000);
    rv.sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(2000);
    rv.sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(2000);
    rv.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    //Approach-02
    WebElement rv1=driver.findElement(By.id("month"));
    rv1.click();
    Thread.sleep(2000);
    rv1.sendKeys("Mar");
   /* Thread.sleep(2000);
    rv1.sendKeys("m");
    Thread.sleep(2000);*/
    rv1.sendKeys(Keys.ENTER);
    //Approach-03
   WebElement rv2=driver.findElement(By.id("year"));
   //step-01
   Select s=new Select(rv2);
    //s.selectByIndex(10);
   //s.selectByValue("1990");
    s.selectByVisibleText("1970");
    
 }
}
