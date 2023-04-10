package com.peonny23a.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	public String getvalue(String filepath, String key) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			System.err.println("File not found:" + filepath);
		}

		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.err.println("unable to load properties file:" + filepath);
		}
		return prop.getProperty(key);
	}
	
	public String getLocater(String key) throws IOException {
		String baseDir=System.getProperty("user.dir");
		return getvalue(baseDir+"src/main/resources/OR.properties", key);
		
	}
}