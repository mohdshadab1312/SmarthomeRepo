package com.tcs.Smarthome.Testcases;

import org.testng.annotations.Test;

public class VApp_Logout extends TestBase{

	@Test(groups= {"sanity", "regression"}, dependsOnMethods="CheckLogin")
	public void logoutCheck() {
		
		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
		
		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);
		
		client.click("NATIVE", FinalHomepage_MoreoptionsIcon , 0, 1);
		client.click("NATIVE", HomePageMoreoptions_MyAccountOption, 0, 1);
		client.waitForElement("NATIVE", HomepageMoreoptionsPage_LogoutBtn, 0, 10000);
		
		client.click("NATIVE", HomepageMoreoptionsPage_LogoutBtn, 0, 1);
		client.click("NATIVE", LogoutConfirmBtn, 0, 1);
		client.waitForElement("NATIVE", vappLoginBtn , 0, 10000);
	}
	
	
}
