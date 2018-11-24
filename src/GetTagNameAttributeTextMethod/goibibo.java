package GetTagNameAttributeTextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class goibibo 
{
  public static void main(String[] args) 
  {

      WebDriver driver=new FirefoxDriver();
	driver.get("https://www.goibibo.com");
	WebElement rv=driver.findElement(By.id("gosuggest_inputSrc"));
	rv.sendKeys("Pune");
	String str=rv.getAttribute("value");
	System.out.println(str);
	
}
}
