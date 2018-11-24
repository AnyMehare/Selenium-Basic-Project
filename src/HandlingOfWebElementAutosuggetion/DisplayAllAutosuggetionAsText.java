package HandlingOfWebElementAutosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayAllAutosuggetionAsText 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
  	  driver.get("http://www.google.com");
  	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
  	 Thread.sleep(2000);
  	  List<WebElement>ref=driver.findElements(By.xpath("//div[contains(text(),'selenium')]"));
  	  int size=ref.size();
  	  System.out.println("Total no. of Autosuggetions are:"+size);
  	  
  	  for(int i=0; i<=ref.size();i++) 
  	  {
  		  WebElement rv=ref.get(i);
  		  String str = rv.getText();
  		  System.out.println(str);
  	  }
  	driver.close();
  }
}
