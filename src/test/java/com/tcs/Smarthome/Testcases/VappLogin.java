package com.tcs.Smarthome.Testcases;

import org.testng.annotations.Test;

public class VappLogin extends TestBase{

//	    @BeforeMethod
//	    public void setUp(){
//	        client = new Client(host, port, true);
//	        client.setProjectBaseDirectory(projectBaseDirectory);
//	        client.setReporter("xml", "reports", "Untitled");
//	    }

	    @Test(enabled = true, groups = {"sanity", "regresion"})
	    public void CheckLogin(){
	    	System.out.println(host);
			System.out.println(port);
			System.out.println(usedDeviceName);
	          client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
	          
	   
	        //  client.waitForElement("NATIVE", "loginPageVodafoneIcon", 0, 10000);
	          //Click on login button
	          client.click("NATIVE", vappLoginBtn , 0, 1);
	   
	          //Click on Country-code dropdown list
	          client.click("NATIVE", countryCodeListBtn , 0, 1);
	          
	          //Select DE 
	          client.click("NATIVE", countryCode_DE , 0, 1);
	          
	          //Enter Phone number
	          client.elementSendText("NATIVE", phoneNumberTextBox, 0, "1735605847");
	          
	          //Click on Continue button
	          client.click("NATIVE", continueBtn , 0, 1);
	          
	        //Enter PIN
	          client.elementSendText("NATIVE", enterPINTextBox, 0, "123456");
	          
	          //Click on Login Continue button
	          client.click("NATIVE", loginContinueBtn , 0, 1);
	          
	          //Wait for Homepage
	          client.waitForElement("NATIVE", firstHomePageTitle, 0, 10000);
	          
	          //Click on Plus Icon
	          client.click("NATIVE", firstHomePagePlusSign , 0, 1);
	          
	          
	    }

//	    @AfterMethod
//	    public void tearDown(){
//	        // Generates a report of the test case.
//	        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
//	        client.generateReport(false);
//	        // Releases the client so that other clients can approach the agent in the near future. 
//	        client.releaseClient();
//	    }
	}

	
	
