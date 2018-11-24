package FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCompare 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		  WebDriver driver= new FirefoxDriver();
			driver.get("http://www.Filpkart.com");
			driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
			driver.findElement(By.className("LM6RPg")).sendKeys("Mi");
			driver.findElement(By.className("vh79eN")).click();
			Thread.sleep(200);
			driver.findElement(By.xpath("(//div[text()='Redmi Note 5 Pro (Gold, 64 GB)'])[1]/ancestor::a//span[@class='_1iHA1p']")).click();
			
	  }
}
