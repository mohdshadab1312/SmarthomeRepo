package com.tcs.Smarthome.Testcases;

import org.testng.annotations.Test;

public class VApp_ModifyContactsviaDeviceTile extends TestBase {

	@Test(priority = 1, groups= {"sanity", "regression"}, dependsOnMethods="CheckLogin")
	public void checkModifyPCviaDeviceTile() {
		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);

		client.click("NATIVE", FinalHomePage_Title, 0, 1);
		client.click("NATIVE", DeviceDetailsPage_PrimaryDetails, 0, 1);
		client.waitForElement("NATIVE", PrimeContactPage_Title, 0, 10000);
		client.elementSendText("NATIVE", PrimeContactPage_Name, 0, "Shadab");
		client.elementSendText("NATIVE", PrimeContactPage_SurName, 0, "Khan");
		client.elementSendText("NATIVE", PrimeContactPage_Contact, 0, "1735605847");

		client.swipe("Down", 0, 500);
		client.click("NATIVE", PrimeContactPage_SpeichernButton, 0, 1);
	}

	@Test(priority = 2, dependsOnMethods="CheckLogin" )
	public void checkAddTCviaDeviceTile() {

		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);
		client.click("NATIVE", FinalHomePage_Title, 0, 1);

		client.click("NATIVE", DeviceDetailsPage_TrustedDetails, 0, 1);
		client.click("NATIVE", ContactDetailsPage_PlusSign, 0, 1);
		client.click("NATIVE", AddTrustedContactBtn, 0, 1);

		if (client.isElementFound("NATIVE", PermissionPage_YullassenBtn) == true) {
			client.click("NATIVE", PermissionPage_YullassenBtn, 0, 1);
			client.click("NATIVE", PermissionPopUp_Allow, 0, 1);
		}

		client.waitForElement("NATIVE", TrustedContactPage_Title, 0, 10000);
		client.elementSendText("NATIVE", TrustedContactPage_Name, 0, "Shadab");
		client.elementSendText("NATIVE", TrustedContactPage_Contact, 0, "Shadab");
		client.elementSendText("NATIVE", TrustedContactPage_Relation, 0, "Shadab");
		client.click("NATIVE", TrustedContactPage_DeleteBtn, 0, 1);
		client.click("NATIVE", ContactDetailsPage_SaveBtn, 0, 1);

	}

	@Test(priority = 3, dependsOnMethods= {"CheckLogin","checkAddTCviaDeviceTile"})
	public void checkDeleteTCviaDeviceTile() {
		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);
		client.click("NATIVE", FinalHomePage_Title, 0, 1);
		client.click("NATIVE", DeviceDetailsPage_TrustedDetails, 0, 1);

		
		client.click("NATIVE", ContactDetailsPage_1stTrstedContactDetails , 0, 1);
		client.waitForElement("NATIVE", TrustedContactPage_Title, 0, 10000);
		client.click("NATIVE", TrustedContactPage_DeleteBtn, 0, 1);
		client.click("NATIVE", ContactDetailsPage_SaveBtn, 0, 1);
	}
}
