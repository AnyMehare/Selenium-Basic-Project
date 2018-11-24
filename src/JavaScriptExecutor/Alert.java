package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert 
{

	public static void main(String[] args) 
	{
		  WebDriver driver=new FirefoxDriver();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
         // js.executeScript("alert()");
         // js.executeScript("alert('DND')"); 
		  String str= "DND";
		  js.executeScript("");
	}

}



