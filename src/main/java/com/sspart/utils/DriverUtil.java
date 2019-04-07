package com.sspart.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverUtil extends ResourceUtil {
	public static WebDriver driver =null;
	public static AppiumDriver<WebElement> mobileDriver=null;
	
	public void initiateMobileDriver() throws MalformedURLException {
		
		if(mobileDriver==null) {
			
			DesiredCapabilities desiredCapabilities =new DesiredCapabilities();
			desiredCapabilities.setCapability("deviceName", "pixel");
			desiredCapabilities.setCapability("platformName", "Android");
			desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
			desiredCapabilities.setCapability( "appActivity", "com.android.calculator2.Calculator");
			desiredCapabilities.setCapability( "noReset","true" );
			
		mobileDriver=new AndroidDriver<WebElement>(new URL(" http://localhost:4723/wd/hub"), desiredCapabilities);
			
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
	
	public void quitMobileDriver() {
		mobileDriver.quit();
	}
	
	
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
