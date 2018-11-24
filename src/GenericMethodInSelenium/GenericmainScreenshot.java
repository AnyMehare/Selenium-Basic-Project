package GenericMethodInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericmainScreenshot {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		GenericScreenshot.getimage(driver,"Facebook");

	}

}
