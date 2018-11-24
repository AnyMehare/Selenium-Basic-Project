package GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class ErrorMsgRedColor {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//login
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//Erroemsg
		WebElement we=driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		String str=we.getCssValue("color");
		System.out.println(str);
		String str1=Color.fromString(str).asHex(); //conversion of Hexa code into RGB
		
		System.out.println(str1);
		if(str1.equals("#ce0100")) 
		{
			System.out.println("Error msg dispay in red color");
		}
		else
		{
			System.out.println("Error msg dispay Not in red color");
		}
	}

}

