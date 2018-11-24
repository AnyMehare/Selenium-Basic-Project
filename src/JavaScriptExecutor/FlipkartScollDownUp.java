package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartScollDownUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver=new FirefoxDriver();
		    driver.get("http://www.Filpkart.com");
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		    Thread.sleep(200);
			driver.findElement(By.className("LM6RPg")).sendKeys("Mobile");
			Thread.sleep(200);
			driver.findElement(By.className("vh79eN")).click();
			Thread.sleep(200);
			for(int i=1; i<10;i++)
			{
				js.executeScript("window.scrollBy(0,800)"); //Step by step Scrolling page downword
				Thread.sleep(2000);
			}
			for(int i=1; i<10;i++)
			{
				js.executeScript("window.scrollBy(0,-800)"); //Step by step Scrolling page upword
				Thread.sleep(2000);
			}
			js.executeScript("window.scrollBy(0,document.body.scrollHeight())"); //To Scroll direct bottom of the page
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollTop())"); //To Scroll Diect Top of the page
			
         
	}
}
