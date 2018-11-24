package HandlingOfWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCountTotalNoofCellInTable 
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/Table.html");
		List<WebElement>ref1 =driver.findElements(By.xpath("//th"));
		//Count Total number of Cell in table
		int TotalCell;
	
		int counHeaderCell=0;
		
		for(int i=0;i<ref1.size();i++) 
		   {
			     WebElement rv = ref1.get(i);
			     if(rv.isDisplayed())
			     {
			    	 counHeaderCell++;
			     }     
		   }
		
		List<WebElement>ref2 =driver.findElements(By.xpath("//td"));
		int CountRemaingCell=0;
		for(int i=0;i<ref2.size();i++) 
		   {
			     WebElement rv1 = ref2.get(i);
			     
			     if(rv1.isDisplayed())
			     {
			    	 CountRemaingCell++;
			     }     
		   }
		
		TotalCell=counHeaderCell+CountRemaingCell;
		System.out.println("Total number of Cells are:-"+TotalCell);
		
  }
}
