package com.sspart.utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil extends ResourceUtil {
	public static WebDriver driver =null;
	public void initiateDriver() {
		
		if(driver==null) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		   driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     
		     try {
				initiateLocator();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void quitDriver() {
		driver.quit();
	}

}
