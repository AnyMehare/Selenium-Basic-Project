package FindElementSMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DispalyTextAllLinkInGoogle {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	    List<WebElement> rv=driver.findElements(By.xpath("//a"));
	     int size=rv.size();
	     System.out.println("Total no of Link are:"+size);
	     //Using for Loop
	     for(int i=0; i<rv.size(); i++) 
	     {
	    	 WebElement ref=rv.get(i);
	    	 String str = ref.getText();
	    	 System.out.println(str);
	     }
	     /*For Each Lop
	     for(WebElement ref :rv) 
	     {
	    	 String str=ref.getText();
	    	 System.out.println(str);
	     }*/

	}

}
