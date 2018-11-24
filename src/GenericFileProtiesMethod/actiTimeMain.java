package GenericFileProtiesMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.PropertiesFile;

public class actiTimeMain 
{
  public static void main(String[] args) 
 {
	WebDriver driver=new FirefoxDriver();
    driver.get(atiTimePropertyFile.getPropertiesValue("url"));
    driver.findElement(By.name(atiTimePropertyFile.getPropertiesValue("un_loc"))).sendKeys(atiTimePropertyFile.getPropertiesValue("user"));
    driver.findElement(By.name(atiTimePropertyFile.getPropertiesValue("pw_loc"))).sendKeys(atiTimePropertyFile.getPropertiesValue("pass"));
    driver.findElement(By.id(atiTimePropertyFile.getPropertiesValue("login"))).click();
}
}
