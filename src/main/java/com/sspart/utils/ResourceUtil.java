package com.sspart.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResourceUtil {
	
	public static Properties props = null;
	public void initiateLocator() throws FileNotFoundException, IOException  {
		
		props= new Properties();
		File file= new File("src/main/resources/locators/MyLocator.aaa");
		
		props.load(new FileInputStream(file));
	}

}
