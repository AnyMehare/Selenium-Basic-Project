package GetTagNameAttributeTextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actiTimegetTAT1 
{
public static void main(String[] args) 
{
	

    WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	WebElement rv=driver.findElement(By.id("keepLoggedInCheckBox"));
	String str1=rv.getTagName();
	System.out.println("Element tagName is :"+str1);
	String str2=rv.getAttribute("style");
	System.out.println("Element tagName is :"+str2);
	String str3=rv.getText();
	System.out.println("Element tagName is :"+str3);
	
}
}
