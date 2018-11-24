package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Varify1990OptionAndSelect 
{
	 public static void main(String[] args) 
	 {
		 WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			WebElement rv=driver.findElement(By.id("year"));
			Select s=new Select(rv);
			List<WebElement>ref=s.getOptions();
			int size = ref.size();
	      System.out.println("Options Present in ListBox:"+size);
	      for(int i=0;i<ref.size();i++) 
	      {
	    	    WebElement rv1 = ref.get(i);
	    	    String str = rv1.getText();
	    	    if(str.contains("1990"))
	    	    {
	    	    	s.selectByValue(str);
	    	    }
	    	}
	      
	 }
}
