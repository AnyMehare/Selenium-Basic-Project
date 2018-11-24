package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 String path="C:\\ChromeDriver\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",path);
    Thread.sleep(2000);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
