package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods to initialize and read data from properties file
 * @author sweth
 */
public class PropertiesUtility {

	private Properties property;
	
	/**
	 * this method is used to initialize properties file
	 * @param filePath
	 */
	public void propertiesInit(String filePath)
	{
		FileInputStream f=null;
		try {
			
		
		f=new FileInputStream(filePath);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		property =new Properties();
		try
		{
			property.load(f);
			
		}catch(IOException e)
		{
			e.printStackTrace();
	}
		
	}
	/**
	 * this method fetches data from properties file based on the key passed as an argument
	 * @param key
	 * @return
	 */
	
	public String readFromProperties(String key)
	{
		return property.getProperty(key);
	}
}
