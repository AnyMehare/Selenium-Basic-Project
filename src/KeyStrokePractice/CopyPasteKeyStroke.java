package KeyStrokePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyPasteKeyStroke
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//id
		By rv=By.id("email");
		WebElement un=driver.findElement(rv);
		Thread.sleep(2000);
		un.sendKeys("anya");
		Thread.sleep(2000);
		un.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		un.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		//pwd
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"v");
		
  }
}
