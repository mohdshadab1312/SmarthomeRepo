package com.tcs.Smarthome.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VApp_GotoSmartthings extends TestBase {

	@Test(groups= {"regression"}, dependsOnMethods="CheckLogin")
	public void goToSmartthingsApp() {

		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);

		client.click("NATIVE", FinalHomePage_AddedDeviceIcon, 0, 1);
		client.click("NATIVE", DeviceDetailsPage_SmartthingsLink, 0, 1);
		client.waitForElement("NATIVE", SmartThingsWifiPopUp_Title, 0, 10000);

		Assert.assertTrue(client.isElementFound("NATIVE", SmartThingsHomePage_Title),
				"Smartthings application is shown");

	}
}
