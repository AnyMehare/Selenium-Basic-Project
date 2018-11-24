package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		String path="C:\\Program Files\\internet explorer\\iexplore.exe";
	    System.setProperty("webdriver.ie.driver",path);
	    Thread.sleep(2000);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
	}

}
