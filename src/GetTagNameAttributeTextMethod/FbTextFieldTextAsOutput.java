package GetTagNameAttributeTextMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbTextFieldTextAsOutput 
{
 public static void main(String[] args) 
 {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//id
	    WebElement rv=driver.findElement(By.name("email"));
		rv.sendKeys("Anyaa");
		String str=rv.getAttribute("name");
		System.out.println(str);
	
}
}
