package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateFacebookAccount 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("u_0_j")).sendKeys("Aniket");
	driver.findElement(By.id("u_0_l")).sendKeys("Mehare");
	driver.findElement(By.id("u_0_o")).sendKeys("anyameahre@gmail.com");
	driver.findElement(By.id("u_0_v")).sendKeys("any123");
	driver.findElement(By.id("u_0_a")).click();
	driver.findElement(By.id("u_0_11")).click();
}
}
