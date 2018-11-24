package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScollOnSpecificLoactionofPage
{

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new FirefoxDriver();
		    driver.get("http://www.Filpkart.com");
		    
		    driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		    Thread.sleep(200);
			driver.findElement(By.className("LM6RPg")).sendKeys("Mobiles");
			Thread.sleep(200);
			driver.findElement(By.className("vh79eN")).click();//
			WebElement rv=driver.findElement(By.xpath("(//div[@class=\"_1UoZlX\"])[1]"));
			Point p=rv.getLocation();
			int x=p.getX();
			int y=p.getY();
			JavascriptExecutor js=(	JavascriptExecutor)driver;
			js.executeScript("window.scrollTo("+x+","+y+")");

	}

}
