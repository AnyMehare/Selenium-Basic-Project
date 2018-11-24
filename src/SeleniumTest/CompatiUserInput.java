package SeleniumTest;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import SeleniumPackage.CompatibilyTestingUserSel;

public class CompatiUserInput 
{
WebDriver driver;
 void BrowserHandlingCh(String Name)
 {
	 String path="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
	 
	System.setProperty("webdriver.chrome.driver",path );
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
 }
 void BrowserHandlingIe()
 {
	 String path="C:\\Program Files\\internet explorer\\iexplore.exe";
	 
	System.setProperty("webdriver.ie.driver",path );
	driver=new InternetExplorerDriver();
	driver.get("https://www.facebook.com");
	
 }
 void BrowserHandlingFF()
 {
	 driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com");
	 
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
