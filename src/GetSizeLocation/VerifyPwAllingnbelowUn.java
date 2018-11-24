package GetSizeLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPwAllingnbelowUn 
{
 public static void main(String[] args) 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//un
	   WebElement rv1= driver.findElement(By.name("username"));
	  //pwd
	   WebElement rv2=driver.findElement(By.name("pwd"));
	   int y1=rv1.getLocation().getY();
	   System.out.println(y1);
	   int y2=rv2.getLocation().getY();
	   System.out.println(y2);
	   int space=15;
	   if(y2>y1+space) 
	   {
		   System.out.println("Pw field allign below UN");
	   }
	   else
	   {
		   System.out.println("Pw field allign Not below UN");
	   }
	   
  }
}
