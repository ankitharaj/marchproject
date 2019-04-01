package com.sspart.march_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sspart.utils.DriverUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class SeleniumStepDefs extends DriverUtil{

	 
	 
	 @Given("^im in background given$")
		public void im_in_background_given() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("^im in background given$");
		   initiateDriver();
	}
	
	
	@Given("^I am in given step$")
	public void i_am_in_given_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("^I am in given step$");
	    driver.get(props.getProperty("guru99.popoup.url"));
	}

	@When("^I am in when step$")
	public void i_am_in_when_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I am in when step$");
		
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
			

	@And("^I am in and step$")
	public void i_am_in_and_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I am in and step$");
	
		
	}

	@But("^I am in but step$")
	public void i_am_in_but_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("^I am in but step$");
	}




}
