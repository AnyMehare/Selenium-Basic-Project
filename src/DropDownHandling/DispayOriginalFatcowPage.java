package DropDownHandling;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DispayOriginalFatcowPage 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.fatcow.com");
		WebElement rv=driver.findElement(By.xpath("//a[text()='Create a Site']"));
		Actions a=new Actions(driver);
		a.moveToElement(rv).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Original FatCow']")).click();
  }
}
