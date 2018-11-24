package GetSizeLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VarifyUnPwSizeSameFb 
{
public static void main(String[] args) 
{

	  WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//un
	   WebElement rv1= driver.findElement(By.id("email"));
	   Dimension d=rv1.getSize();
	   int w=d.getWidth();
	   //System.out.println(w);
	   int h=d.getHeight();
	   //System.out.println(h);
	    //pwd
	   WebElement rv2=driver.findElement(By.id("pass"));
	   Dimension d1=rv1.getSize();
	   int w1=d.getWidth();
	   //System.out.println(w1);
	   int h1=d.getHeight();
	   //System.out.println(h1);
	  
	   if(w==w1 && h==h1) 
	   {
		   System.out.println("Email & PWd Field size are equal");
	   }
	   else
	   {
		 System.out.println("Email & PWd Field size are Not equal");
	   }
}
}
