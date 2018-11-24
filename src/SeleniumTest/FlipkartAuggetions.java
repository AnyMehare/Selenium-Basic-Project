package SeleniumTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartAuggetions 
{
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
    driver.get("https://www.flipkart.com");
    driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
    driver.findElement(By.xpath("//input[@class=\"LM6RPg\"]")).sendKeys("mi");
	List<WebElement> rv=driver.findElements(By.xpath("//a[@class=\"_2ja22P\"]"));
	 int size=rv.size();
 	 System.out.println(size);
 	 driver.close();
	 
}
}
