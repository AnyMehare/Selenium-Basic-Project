package KeyStrokePractice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutUsingClickMethod 
{
  public static void main(String[] args) 
  {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//id
		By rv=By.id("email");
		WebElement ref=driver.findElement(rv);
		ref.sendKeys("anyamehare@gmail.com");
		System.out.println();
		By rv1=By.id("pass");
		WebElement ref1=driver.findElement(rv1);
		ref1.sendKeys("aaibaba123");
		//Chk
		Keys key=Keys.SPACE;
		driver.findElement(By.id("loginbutton")).sendKeys(key);
		//login
		driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
		
   }
}
