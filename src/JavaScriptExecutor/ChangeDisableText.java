package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeDisableText
{
public static void main(String[] args) 
{

	  WebDriver driver=new FirefoxDriver();
	  driver.get("file:///C:/Users/Aniket/Documents/SeleniumMethodVari.html");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('user').value='admin123'");
	
}
}
