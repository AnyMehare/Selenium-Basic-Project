package GetSizeLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VarifyUnPwSizeSame 
{
  public static void main(String[] args) 
{

	  WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//un
	   WebElement rv1= driver.findElement(By.name("username"));
	   Dimension d=rv1.getSize();
	   int w=d.getWidth();
	   int h=d.getHeight();
	    //pwd
	   WebElement rv2=driver.findElement(By.name("pwd"));
	   Dimension d1=rv1.getSize();
	   int w1=d.getWidth();
	   int h1=d.getHeight();
	  
	   if(w==w1 && h==h1) 
	   {
		   System.out.println("Un & Pwd Field size are equal");
	   }
	   else
	   {
		 System.out.println("Un & Pwd Field size are Not equal");
	   }
		   
}
}
