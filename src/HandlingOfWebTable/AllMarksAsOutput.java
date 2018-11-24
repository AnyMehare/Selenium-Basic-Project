package HandlingOfWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllMarksAsOutput 
{

	
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/Table.html");
        //All Marks As Output
	   List<WebElement>ref =driver.findElements(By.xpath("//td[3]"));
	   for(int i=0;i<ref.size();i++) 
	   {
		     WebElement rv = ref.get(i);
		     String Str = rv.getText();
		     System.out.println(Str);
	   }
	 //WebTable Marks
	   int TotalM = 0;
	   for(int i=0;i<ref.size()-1;i++)
	   {
		     WebElement rv = ref.get(i);
		     String Str = rv.getText();
		     int j=Integer.parseInt(Str);//To convert String Value into the integer Value
		     TotalM=TotalM+j;
	   }
	   System.out.println(TotalM);
	        
	}
	   

}
	
