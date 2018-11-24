package HandlingOfWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareMarks 
{
  private static final int Interger = 0;

public static void main(String[] args) throws InterruptedException 
  {

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/Table.html");
      
	   List<WebElement>ref =driver.findElements(By.xpath("//td[3]"));
	 //To compare Total no. of Marks and sum of marks is same or Not with given marks
	   int TotalM1 = 0;
	   for(int i=0;i<ref.size()-1;i++) 
	   {
		     WebElement rv = ref.get(i);
		     String Str = rv.getText();
		     int j=Integer.parseInt(Str);
		     TotalM1=TotalM1+j;
	   }
	   System.out.println("Sum of Tatal Mark:"+TotalM1);
	   Thread.sleep(2000);
	    String str = driver.findElement(By.xpath("(//td[3])[last()]")).getText();
	    int TotalTableM=Integer.parseInt(str);
	    System.out.println("Sum of Tatal Mark:"+TotalTableM);
	    Thread.sleep(2000);
	    if(TotalM1==TotalTableM)
	    {
	    	System.out.println("Dispayed marks are same");
	    }
	    else
	    
	   {
		    	System.out.println("Dispayed marks are Not same");
	   }
	    
 }
}
