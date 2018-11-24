package ActiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeCreateNewUser 
{
  public static void main(String[] args) 
  {
	      WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//un
		driver.findElement(By.name("username")).sendKeys("admin123");
		//pwd
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		
		//login
		driver.findElement(By.id("loginButton")).click();
		
	
	//String str=driver.findElement(By.cssSelector("span[class='errormsg']")).getText();
	   WebElement we=driver.findElement(By.cssSelector("span[class='errormsg']"));
	
	if(we.isDisplayed())
	{
		System.out.println("error msg is Dispayed");
	}
	else
	{
		System.out.println("error msg Not is Dispayed");
	}
		
}
  
}
