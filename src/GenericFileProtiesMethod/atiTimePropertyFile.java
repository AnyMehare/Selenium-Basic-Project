package GenericFileProtiesMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class atiTimePropertyFile implements actiTimeUtility 
{
   public static String getPropertiesValue(String key) 
   {
	  Properties p=new Properties();
	  try 
	  {
		p.load(new FileInputStream(property_path));
	} 
	  catch (Exception e) 
	  {
		
		e.printStackTrace();
	  }
	  return p.getProperty(key);
	   
   }
}
