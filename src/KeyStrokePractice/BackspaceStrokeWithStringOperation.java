package KeyStrokePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackspaceStrokeWithStringOperation 
{
 public static void main(String[] args) throws InterruptedException 
 {

	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	 String str="Anyaa";
	 WebElement rv= driver.findElement(By.id("email"));
	 rv.sendKeys(str);
	 for(int i=0;i<=str.length();i++) 
	 {
		Thread.sleep(3000);
		rv.sendKeys(Keys.BACK_SPACE);
	 }
}
}
