package FindElementSMethodUse;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeActions 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//un
		driver.findElement(By.name("username")).sendKeys("admin");
		//pwd
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("keepLoggedInCheckBox")).click();
		//login
		driver.findElement(By.id("loginButton")).click();
		//Task
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		//Click
		List<WebElement> rv=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size=rv.size();
		System.out.println(size);
		// 1>Select all boxes in forword.
		for(int i = 0; i<rv.size(); i++) 
		{
			WebElement ref=rv.get(i);
			ref.click();
			Thread.sleep(500);
			
		}
		// 2>Deselect  all boxes in reverse order.
		Collections.reverse(rv);
		for(int i = 0; i<rv.size(); i++) 
		{
			WebElement ref=rv.get(i);
			ref.click();
			Thread.sleep(500);
		}	
		// 3>Select first and last check box using findElements method.
		for(int i = 0; i<rv.size(); i++) 
		
		{
			if(i==0) 
			{
			WebElement ref=rv.get(i);
			ref.click();
			Thread.sleep(2000);
		    }
			if(i==rv.size()-1) 
			{
			WebElement ref=rv.get(i);
			ref.click();
			Thread.sleep(2000);
			}
		}
		
		//4>Deselect First and last CheckBox using findElements Methods.
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	
		driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]")).click();
		
		driver.close();
  }
  
}
