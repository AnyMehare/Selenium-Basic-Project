package IsSelectedMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookactions {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
        driver.get("https://m.facebook.com/r.php");
		 
        WebElement rv1=driver.findElement(By.xpath("//input[@value='1']"));
        rv1.click();
        WebElement rv2=driver.findElement(By.xpath("//input[@value='2']"));
        
       
         if(rv1.isSelected())
         {
        	 System.out.println("female selected");
         }
         else
         {
        	 System.out.println("female deslected");
         }
          
         rv2.click();
         if(rv2.isSelected())
         {
        	 System.out.println("male selected");
        	 if(rv1.isSelected())
             {
            	 System.out.println("female selected");
             }
             else
             {
            	 System.out.println("female deslected");
             }
         }
         else
         {
        	 System.out.println("male desected");
         }
       
         
	}

}

