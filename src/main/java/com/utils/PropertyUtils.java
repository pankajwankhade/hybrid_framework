package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils {
	
	public static String readProperties(String key) throws Exception {
		
		Properties prop = new Properties();
		
	   String path=System.getProperty("user.dir") + "/src/main/resources/config.properties";
	
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}
	

}
