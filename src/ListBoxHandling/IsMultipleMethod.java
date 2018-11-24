package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod 
{
	public static void main(String[] args) 
	 {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/ListBoxSubject.html");
		WebElement rv=driver.findElement(By.tagName("select"));
		Select s=new Select(rv);
	   boolean b = s.isMultiple();
	   if(b)
	   {
		   System.out.println("ListBox is MultiSelectable");
	   }
	   else
	   {
		   System.out.println("ListBox is Not MultiSelectable");
	   }	
		 
	 }
}
