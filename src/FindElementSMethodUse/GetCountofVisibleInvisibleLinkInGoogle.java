package FindElementSMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCountofVisibleInvisibleLinkInGoogle {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	    List<WebElement> rv=driver.findElements(By.xpath("//a"));
	     int size=rv.size();
	     System.out.println("Total no of Link are:"+size);
	     int visible=0;
	     int invisible=0;
	     //Using for Loop
	     for(int i=0; i<rv.size(); i++) 
	     {
	    	 WebElement ref=rv.get(i);
	    	if(ref.isDisplayed()) 
	    	{
	    	 visible++;
	    	}
	    	else
	    	{
	    		invisible++;
	    	}

	     }
         System.out.println("Total No of visible Link are:"+visible);
	     System.out.println("Total No of visible Link are:"+invisible);

	}

}
