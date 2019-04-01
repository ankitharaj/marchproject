package com.sspart.march_class;

import java.util.Set;

import org.openqa.selenium.By;

import com.sspart.utils.DriverUtil;

import cucumber.api.java.en.Then;

public class Selenium1stepDefs extends DriverUtil {
	
	@Then("^I am in then step$")
	public void i_am_in_then_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I am in given step$");
		 
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

	

}
