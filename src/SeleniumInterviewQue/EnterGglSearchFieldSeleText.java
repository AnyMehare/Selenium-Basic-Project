package SeleniumInterviewQue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterGglSearchFieldSeleText 
{
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("selenium");
}

}
