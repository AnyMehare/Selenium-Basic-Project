package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbUnPwJSE 
{
	
	public static void main(String[] args) 
	{
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.facebook.com");
		  JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("document.getElementById('email').value='Aniket'");
         js.executeScript("document.getElementById('pass').value='Aniket'");
         js.executeScript("document.getElementById('loginbutton').click()");
         
	}

}
