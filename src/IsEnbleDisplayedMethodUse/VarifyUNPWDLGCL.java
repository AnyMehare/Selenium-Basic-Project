package IsEnbleDisplayedMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VarifyUNPWDLGCL 
{
 public static void main(String[] args)
 {

		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/SeleniumMethodVari.html");
		WebElement UN=driver.findElement(By.id("user"));
		WebElement PWD=driver.findElement(By.id("pass"));
		WebElement LG=driver.findElement(By.xpath("//input[@value='input']"));
		WebElement Cancel=driver.findElement(By.xpath("//input[@value='input']"));
		if(UN.isEnabled()) 
		{
			System.out.println("UN enable");
		}
		else
		{
			System.out.println("UN disable");
		}
		if(PWD.isEnabled()) 
		{
			System.out.println("PWD enable");
		}
		else
		{
			System.out.println("PWD disable");
		}
		if(LG.isDisplayed()) 
		{
			System.out.println("LG dispay");
		}
		else
		{
			System.out.println(" LG not Dispay"); 
		}
		if(Cancel.isDisplayed()) 
		{
			System.out.println("Cancel enable");
		}
		else
		{
			System.out.println("Cancel disable");
		}
		
     }
 }
