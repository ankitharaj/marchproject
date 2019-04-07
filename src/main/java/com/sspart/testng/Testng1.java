package com.sspart.testng;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.sspart.utils.DriverUtil;

public class Testng1 extends DriverUtil {
	
	@Test
	public void testcase01() throws MalformedURLException, InterruptedException {
		
		initiateMobileDriver();
		
		mobileDriver.findElementById(props.getProperty("Calculator.5.Button")).click();
		mobileDriver.findElementById(props.getProperty("Calculator.add.Button")).click();
		mobileDriver.findElementById(props.getProperty("Calculator.7.Button")).click();
		mobileDriver.findElementById(props.getProperty("Calculator.equal.Button")).click();
		
		Thread.sleep(5000);
		
		quitMobileDriver();
		
	}

}
