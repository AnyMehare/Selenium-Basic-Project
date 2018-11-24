package FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RatingNReviewsAsOutPut {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.Filpkart.com");
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.className("LM6RPg")).sendKeys("Mi");
		driver.findElement(By.className("vh79eN")).click();
		String str="(//div[text()='Redmi Note 5 Pro (Gold, 64 GB)'])[1]/..//span[@class=\"_38sUEc\"]";
		String str1=driver.findElement(By.xpath(str)).getText();
		System.out.println(str1);		
		
		
		
		
		
	}

	
}
