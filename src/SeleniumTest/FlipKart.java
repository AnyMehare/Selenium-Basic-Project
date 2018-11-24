package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKart {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.className("LM6RPg")).sendKeys("Mi");
		String str = driver.findElement(By.xpath("//span[contains( text(),'results for')]")).getText();
        System.out.println(str);

	}

}
