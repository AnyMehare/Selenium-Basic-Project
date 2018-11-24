package GetSizeLocation;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSizeLocation 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//login
	WebElement rv=driver.findElement(By.id("loginButton"));
		Thread.sleep(2000);
		Dimension d=rv.getSize();
		int width=d.getWidth();
		int height=d.getHeight();
		System.out.println(width);
		System.out.println(height);
	 org.openqa.selenium.Point  p=rv.getLocation();
	  System.out.println(p.getX());
	  System.out.println(p.getY());
	  
		      
}
}
