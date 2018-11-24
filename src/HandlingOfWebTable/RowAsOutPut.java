package HandlingOfWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RowAsOutPut 
{
 public static void main(String[] args) 
 {
	 WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Aniket/Documents/Table.html");
   //second Row as Output 
	  String str = driver.findElement(By.xpath("//tr[2]")).getText();
	          System.out.println(str);
   //   Dispayed complete table as output 
	List<WebElement>ref =driver.findElements(By.xpath("//tr"));
	for(int i=0;i<ref.size();i++) 
	   {
		     WebElement rv = ref.get(i);
		     String Str1 = rv.getText();
		    System.out.println(Str1);
	   }
  }
}