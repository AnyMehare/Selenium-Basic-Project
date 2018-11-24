package GenericMethodInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenshot implements ScreenshotUtility
{
public static void getimage(WebDriver driver,String name) 
{
	TakesScreenshot shot=(TakesScreenshot)driver;
	File src = shot.getScreenshotAs(OutputType.FILE);
	
	File dest = new File(screen_img+name+".png");
	
	

	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	

  

}
}
