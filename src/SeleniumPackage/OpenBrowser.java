package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser 
{
  public static void main(String[] args) {
	
	  FirefoxDriver rv=new FirefoxDriver();
	  rv.get("https://www.google.com/");
	String str=rv.getTitle();
	System.out.println(str);
	String str1=rv.getCurrentUrl();
	System.out.println(str1);
	rv.close();
	  
	
	  
	  
  }
  }


