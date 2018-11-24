package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLoginpageSignup 
{
public static void main(String[] args) throws InterruptedException 
{
	FirefoxDriver rv=new FirefoxDriver();
	rv.get("https://www.google.com");
	//Browser handing 
	String str = rv.getCurrentUrl();
	System.out.println(str);
	Navigation n=rv.navigate();
	String str1 = rv.getTitle();
	System.out.println(str1);
	n.to("https://www.facebook.com");
	Thread.sleep(2000);
	rv.navigate().back();
	Thread.sleep(2000);
	rv.navigate().refresh();
	Thread.sleep(2000);
	rv.navigate().forward();
	Options opt = rv.manage();
    Window w = opt.window();
    //Size of Browser
    Dimension d=new Dimension(150, 200);
    w.setSize(d);
    Thread.sleep(2000);
    //Possition of Browser
    Point p=new Point(100,150);
    rv.manage().window().setPosition(p);
    Thread.sleep(2000);
    //Maximise the Browser
    rv.manage().window().maximize();
    Thread.sleep(2000);
    rv.close();
    
    
    
	
	
	
	
	
	
    
    
  
    
}
}
