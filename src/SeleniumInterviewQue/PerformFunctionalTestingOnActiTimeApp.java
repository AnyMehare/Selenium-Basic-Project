package SeleniumInterviewQue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformFunctionalTestingOnActiTimeApp 
{

	public String[][] logindata()
	{
		
		String[][] str=new String[4][2];
		str[0][0]="admin";
		str[0][1]="manager";
		str[1][0]="admin1";
		str[1][1]="manager";
		str[2][0]="admin";
		str[2][1]="manager1";
		str[3][0]="admin1";
		str[3][1]="manager1";
		return str;
		
	}
	public void acitTimeLogin(String un,String pwd) throws InterruptedException  
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//un
				driver.findElement(By.name("username")).sendKeys(un);
				//pwd
				driver.findElement(By.name("pwd")).sendKeys(pwd);
				
				//login
				driver.findElement(By.id("loginButton")).click();
				String str = driver.getTitle();
				Thread.sleep(2000);
				if(str.contains("Time"))
				{
					System.out.println("Home Page Display");
				}
			   else if(driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).isDisplayed())
					{
						System.out.println("Error msg is Displayed");
					}
					
				else
				{
					System.out.println("Blank page is displayed");
				}
				driver.close();
				
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		PerformFunctionalTestingOnActiTimeApp  p=new PerformFunctionalTestingOnActiTimeApp();
		                         String[][] ref = p.logindata();
		                         for(int i=0; i<ref.length; i++) 
		                         {
		                        	   String un = ref[i][0];
		                        	   String pwd = ref[i][1];
		                        	   p.acitTimeLogin(un, pwd);
		                         }                         
	}

}
