package com.adactin.help;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	
	public ConfigurationReader() throws IOException 
		
	{
	File f= new File("src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
	
	FileInputStream fin=  new FileInputStream(f);
	ps= new Properties();
	ps.load(fin);
	}
	
	
	public static String getBrowser() {
		String browserName = ps.getProperty("browser");
		return browserName;
	}
	
	public static String getUrl() {
		String UrlName=  ps.getProperty("Url");
		return UrlName;
	}
}
