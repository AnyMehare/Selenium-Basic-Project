package GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class goibibo1 
{

	public static void main(String[] args) 
	  {
	     WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.goibibo.com");
		 WebElement rv=driver.findElement(By.id("gosuggest_inputSrc"));
		 String str=rv.getCssValue("font-size");
		 System.out.println(str);
		 String str1=rv.getCssValue("color");
		 System.out.println(str1);
}
	
	}
