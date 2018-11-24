package SeleniumPackage;

import java.awt.Dimension;
import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window 
{
  public static void main(String[] args) throws InterruptedException 
  {
	FirefoxDriver rv=new FirefoxDriver();
	rv.get("https://www.google.com/");
	Thread.sleep(2000);
	Options opt=rv.manage();
	org.openqa.selenium.WebDriver.Window w=opt.window();
	Dimension d=new Dimension(150,200);
	Point p=new Point(100,150);
	rv.manage().window().setPosition(p);
	
	Thread.sleep(4000);
	rv.manage().window().maximize();
	rv.close();
}
}
