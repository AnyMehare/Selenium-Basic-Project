package SeleniumPackage;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome 
{
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.get("https://www.facebook.com/");
	String str=driver.getCurrentUrl();
	System.out.println(str);
	Navigation n=driver.navigate();
	n.to("https://www.google.com/");
	driver.navigate().back();
	driver.get("https://www.google.com/");
	String str1=driver.getCurrentUrl();
	System.out.println(str1);
	driver.navigate().forward();
	Options opt=driver.manage();
	org.openqa.selenium.WebDriver.Window w=opt.window();
	Dimension d=new Dimension(150,200);
	Point p=new Point(100,150);
	driver.manage().window().setPosition(p);
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.close();
	
	
	
	
	
}


}
