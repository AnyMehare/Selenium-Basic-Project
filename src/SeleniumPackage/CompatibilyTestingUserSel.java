package SeleniumPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CompatibilyTestingUserSel 
{
	
	WebDriver driver;
	public void BrowserCSelection() throws InterruptedException 
	{
		
		String path="C:\\ChromeDriver\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",path);
	     driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.get("http://www.facebook.com");
		
	}
	public void BrowserIESelection() throws InterruptedException 
	{
		
		String path="C:\\Program Files\\internet explorer\\iexplore.exe";
	    System.setProperty("webdriver.ie.driver",path);
	    Thread.sleep(2000);
		 driver=new InternetExplorerDriver();
	    Thread.sleep(2000);
	    driver.get("http://www.facebook.com");
		
	}
	public void BrowserFFSelection()  
	{
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Compatibilty Testing!!!!");
		 Thread.sleep(2000);
		System.out.println("Press 1 for Chrome");
		 Thread.sleep(2000);
		System.out.println("Press 2 for Ie");
		 Thread.sleep(2000);
		System.out.println("Press 3 for Firefox");
		 Thread.sleep(2000);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("Enter your Choice:");
		int choice=sc.nextInt();
		CompatibilyTestingUserSel s=new CompatibilyTestingUserSel() ;
		switch(choice) 
		{
		case 1:
		s.BrowserCSelection();
		break;
		case 2:
		s.BrowserIESelection();
		break;
		case 3:
		s.BrowserFFSelection();
		break;
		default:
		System.out.println("Invalid Choice");
		}
	}
	


}