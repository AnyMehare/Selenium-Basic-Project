package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOptions 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/ListBoxSubject.html");
		WebElement rv=driver.findElement(By.tagName("select"));
		Select s=new Select(rv);
		List<WebElement>ref=s.getOptions();
		for(int i=0;i<ref.size();i++) 
		{
		    s.selectByIndex(i);
		}
		WebElement rv1 = s.getFirstSelectedOption();
		System.out.println(rv1.getText());
   }
}
