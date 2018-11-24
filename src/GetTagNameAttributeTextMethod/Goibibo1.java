package GetTagNameAttributeTextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goibibo1
{
  public static void main(String[] args) 
  {
     WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.goibibo.com");
	 WebElement rv=driver.findElement(By.id("gosuggest_inputSrc"));
	 String str=rv.getAttribute("placeholder");
	 if(str.isEmpty())
	 { 
		 System.out.println("Text field contais default text");
	 }
	 else
	 { 
		 System.out.println("Text field Not contais default text");
	 }
  }
}
