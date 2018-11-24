package HandlingOfWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmtyCellCount 
{
 public static void main(String[] args) 
 {
	 WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/Table.html");
		String str=driver.findElement(By.xpath("//tr[6]/td[1]")).getText();
		//Specific cell is epmty or not 
		if(str.isEmpty())
		{
			System.out.println(" cell is empty");
		}
		else
		{
			System.out.println(" cell is Not empty");
		}		
		
 }
}
