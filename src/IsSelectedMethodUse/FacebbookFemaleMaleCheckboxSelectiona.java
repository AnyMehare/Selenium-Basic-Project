package IsSelectedMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebbookFemaleMaleCheckboxSelectiona 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 WebElement rv1=driver.findElement(By.id("u_0_9"));
	 rv1.click();
	boolean b1= rv1.isSelected();
	System.out.println("CheckBox status for female is:"+b1);
	if(b1)
	{
		Thread.sleep(2000);
		System.out.println("Female Selected");
	}
	else{
		Thread.sleep(2000);
		System.out.println("Female Not Selected");
		}
	WebElement rv2=driver.findElement(By.id("u_0_a"));
	rv2.click();
	boolean b2= rv2.isSelected();
	
	System.out.println("CheckBox status for Male is:"+b2);
	if(b2)
	{	Thread.sleep(2000);
		System.out.println("male Selected");
	if(b1==!b2)
	{
		Thread.sleep(2000);
		System.out.println("Female Selected");}
	
	else{System.out.println("Female Not Selected");}
	}
	else {
		Thread.sleep(2000);
		{System.out.println("Male not Selected");}
	
 }
}
 }
