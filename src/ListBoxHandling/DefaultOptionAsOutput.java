package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultOptionAsOutput 
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement rv=driver.findElement(By.id("month"));
		Select s=new Select(rv);
		s.selectByIndex(3);
		WebElement rv1=s.getFirstSelectedOption();
		System.out.println(rv1.getText());
		WebElement rv2=driver.findElement(By.id("year"));
		Select s1=new Select(rv2);
		WebElement rv3=s1.getFirstSelectedOption();
		System.out.println(rv3.getText());	
		
 }
}
