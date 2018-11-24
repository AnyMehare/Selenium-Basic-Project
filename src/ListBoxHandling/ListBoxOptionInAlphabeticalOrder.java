package ListBoxHandling;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxOptionInAlphabeticalOrder 
{
	 
	   public static void main(String[] args) 
	     {
		    WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			WebElement rv=driver.findElement(By.id("month"));
			Select s=new Select(rv);
			List<WebElement>ref=s.getOptions();
			List<String>ref1=new ArrayList<String>();
		    for(int i=0;i<ref.size();i++) 
	      {
	    	    WebElement rv1 = ref.get(i);
	    	    String str = rv1.getText();
	            ref1.add(str);
	    
	      }
		    	   
		    Collections.sort(ref1);
		    
		    for(int i=0;i<ref1.size();i++) 
		    {
		    	    String str1 = ref1.get(i);
		    	    System.out.println(str1);
		    }
		
		    
	 }
}
