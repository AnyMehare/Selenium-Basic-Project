package SeleniumInterviewQue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.reporters.jq.Main;

import SeleniumPackage.Constant;

public class FTonActiTimewithmultileBrowser  implements Constant 


{
	
    
    public void BrowserSelection(String Name) throws InterruptedException
    {
    	FirefoxDriver driver0;
    	ChromeDriver driver1;
    	InternetExplorerDriver driver2;
		if(Name.equals("Firfox"))
    	{
			driver0=new FirefoxDriver();

    		PerformFunctionalTestingOnActiTimeAppMB  p=new PerformFunctionalTestingOnActiTimeAppMB();
    		                         String[][] ref = p.logindata();
    		                         for(int i=0; i<ref.length; i++) 
    		                         {
    		                        	   String un = ref[i][0];
    		                        	   String pwd = ref[i][1];
    		                        	   p.acitTimeLogin(un, pwd);
    		                         } 
    		
    	}
    	else if(Name.equals("Chrome"))
    	{
    		System.setProperty(Chrome_Pro,Chrome_ExPath);
    		driver1=new ChromeDriver();
    		driver1.get("http://localhost/login.do");
    		
    		
    	}
    	else
    	{
    		System.setProperty(Ie_Pro,Ie_ExPath);
    		driver2 = new InternetExplorerDriver();
    		driver2.get("http://localhost/login.do");
    	}
		
	       
    }

}
