package readers;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;

public class Config {
	
	public static String getProperty(String value) {
		
		Properties properties = null;
		InputStream inputStream = null;
		
		try {
			
			inputStream = new FileInputStream("./src/test/resources/properties/config.properties");
			properties = new Properties();
			properties.load(inputStream);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return properties.getProperty(value).trim();		
	}

}
