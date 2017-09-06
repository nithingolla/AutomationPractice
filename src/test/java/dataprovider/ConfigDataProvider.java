package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
Properties pro;
	
	public ConfigDataProvider(){
		
	File src=new File("C:\\Users\\Vasudeva\\workspace\\New folder\\com.demostore.hybrid\\Configuration\\config.properties");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		
		 pro=new Properties();
		
		pro.load(fis);			
	
	} catch (Exception e)
	{
		System.out.println("Exception is"+e.getMessage());
	}
	
	}
	public String getChromePath()
	{
		String url=pro.getProperty("chromePath");
		
		return url;
	}
	public String getFirefoxPath()
	{
        String url=pro.getProperty("firefoxPath");
		
		return url;
	}
	public String getIEPath()
	{
        String url=pro.getProperty("IEPath");
		
		return url;
	}
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		
		return url;
	}
	
	
	
	
	

}
