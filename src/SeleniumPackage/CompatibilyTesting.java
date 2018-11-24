package SeleniumPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import SeleniumInterviewQue.PerformFunctionalTestingOnActiTimeApp;



public class CompatibilyTesting implements Constant 
{
    WebDriver driver;
    public void BrowserSelection(String Name) throws InterruptedException
    {
    	if(Name.equals("Firfox"))
    	{
    		driver=new FirefoxDriver();
    		 
    	}
    	else if(Name.equals("Chrome"))
    	{
    		System.setProperty(Chrome_Pro,Chrome_ExPath);
    		driver=new ChromeDriver();
    	}
    	else
    	{
    		System.setProperty(Ie_Pro,Ie_ExPath);
    		driver=new InternetExplorerDriver();
    	}
    	driver.get("");
    }
    public static void main(String[] args) throws InterruptedException
    {
    	CompatibilyTesting c=new CompatibilyTesting();
    	c.BrowserSelection("");
	}
	

}
