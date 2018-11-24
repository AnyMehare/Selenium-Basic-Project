package FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebsite 
{

	public static void main(String[] args) 
	{
	   WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.seleniumhq.org/");
	  driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
	  driver.findElement(By.xpath("//a[@id='close']")).click();
	  driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();

	}

}
