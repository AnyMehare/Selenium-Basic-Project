package GetSizeLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPwAllingnbelowUnFb 

{
	public static void main(String[] args) 
	  {
		  WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			//un
		   WebElement rv1= driver.findElement(By.id("email"));
		  //pwd
		   WebElement rv2=driver.findElement(By.id("pass"));
		   int x1=rv1.getLocation().getX();
		   System.out.println(x1);
		   int x2=rv2.getLocation().getX();
		   System.out.println(x1);
		   int space=15;
		   if(x2>x1+space) 
		   {
			   System.out.println("Pw field allign Right UN");
		   }
		   else
		   {
			   System.out.println("Pw field allign Not Right UN");
		   }
		   
	  }

	
}
