package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenOfFacebookAlongWithDate {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Aniket\\Pictures\\Screenshots\\Demo.png";
		Date d=new Date();
		String str = d.toString();
		String str1=str.replaceAll(":","/");
		File dest = new File(path+"Demo"+str1+".png");
		FileUtils.copyFile(src, dest);

	}

}
