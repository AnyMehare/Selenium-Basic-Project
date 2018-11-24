package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToActiTimeApp 
{

	public static void main(String[] args) 
	{

	      WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//un
		WebElement rv1=driver.findElement(By.name("username"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].value='admin'", rv1);
		//pwd
		WebElement rv2=driver.findElement(By.name("pwd"));
		js.executeScript("argument[0].value='manager'", rv2);
		//driver.findElement(By.id("keepLoggedInCheckBox")).click();
		//login
		//js.executeScript("document.getElementById('loginButton').click()");

	}

}
