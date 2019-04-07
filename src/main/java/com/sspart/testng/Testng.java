package com.sspart.testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sspart.utils.DriverUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Testng extends DriverUtil {
	
WebDriver driver = null;
	
	@BeforeTest 
	public void beforethetest() {
		System.out.println("im in before step");
		  if(driver==null) {
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		       driver = new ChromeDriver();
		       initiateDriver();
		}	
	}
	
//	@BeforeMethod
	//public void beforethemethod() {
		//System.out.println("i am in beforemethod");
		//driver.get("http://demo.guru99.com/popup.php");
	//}
	
	@Test
	public void testcase01() {
		driver.get(props.getProperty("guru99.popoup.url"));
	}
    
	@Test
	public void testcase02() {
		
			 
			String currentwindowHandle =driver.getWindowHandle();
			driver.findElement(By.linkText(props.getProperty("guru99.clickhere"))).click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Set<String>windowHandles=driver.getWindowHandles();
			for(String eachHandle:windowHandles) {
				driver.switchTo().window(eachHandle);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				boolean bool= false;
				try {
					bool=driver.findElement(By.xpath(props.getProperty("guru99.emailid"))).isDisplayed();
				}catch(Exception  ignore) {
					
				if(bool) 
					
					driver.close();
				}
			}
			driver.switchTo().window(currentwindowHandle);

			
			//driver.close();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				
				
			}
		
       @Test
       public void testcase03() {
    	   String currentwindowHandle =driver.getWindowHandle();
   		driver.findElement(By.linkText(props.getProperty("guru99.clickhere"))).click();
   		
   		try {
   			Thread.sleep(5000);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
   		Set<String>windowHandles=driver.getWindowHandles();
   		for(String eachHandle:windowHandles) {
   			driver.switchTo().window(eachHandle);
   			
   			try {
   				Thread.sleep(5000);
   			} catch (InterruptedException e) {
   				// TODO Auto-generated catch block
   				e.printStackTrace();
   			}
   			boolean bool= true;
   			try {
   				bool=driver.findElement(By.xpath(props.getProperty("guru99.emailid"))).isDisplayed();
   			}catch(Exception  ignore) {
   				
   			if(bool) 
   				driver.close();
   			}
   		}
   		driver.switchTo().window(currentwindowHandle);

   		
   		//driver.close();
   		try {
   			Thread.sleep(5000);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
   
		

	

	}

	}
