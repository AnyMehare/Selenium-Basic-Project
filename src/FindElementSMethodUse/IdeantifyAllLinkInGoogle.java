package FindElementSMethodUse;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdeantifyAllLinkInGoogle {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	    List<WebElement> rv=driver.findElements(By.xpath("//a"));
	     int ref=rv.size();
	     System.out.println(ref);
	}

}
