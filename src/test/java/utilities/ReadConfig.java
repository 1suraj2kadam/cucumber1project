package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ReadConfig {
	public Properties properties;
	String path="config.properties";
	
	public ReadConfig() {
		try {
			properties=new Properties();
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String get_Browser() {
		String value=properties.getProperty("browser");
		if (value!=null) 
			return value;
		
		else 
			throw new RuntimeException("error");
		
	}

}
