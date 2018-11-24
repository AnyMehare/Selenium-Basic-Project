package HandlingOfWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalNoofcellInGivenSingleRow {

	public static void main(String[] args) 
	{
		 WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/Aniket/Documents/Table.html");
			List<WebElement>ref1 =driver.findElements(By.xpath("//tr[1]/th"));
			//Count Total number of Cell in table
			
			 int counCell=0;
			
			
			for(int i=0;i<ref1.size();i++) 
			   {
				     WebElement rv = ref1.get(i);
				     if(rv.isDisplayed())
				     {
				    	
						counCell++;
				     }
				     
			   }
			System.out.println( counCell);
			
	}

}
