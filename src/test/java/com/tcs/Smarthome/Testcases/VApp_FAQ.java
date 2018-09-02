package com.tcs.Smarthome.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VApp_FAQ extends TestBase {

	@Test(groups="sanity")
	public void CheckFAQ() throws InterruptedException {
		
		System.out.println(usedDeviceName);

		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);

		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);
		client.click("NATIVE", HelpnSupportBtn, 0, 1);

		Thread.sleep(2000);
		client.swipe("Down", 0, 500);

		client.click("NATIVE", FAQ_VHomeLink, 0, 1);
		client.click("NATIVE", FAQ_VHomeArticleLink, 0, 1);

		Assert.assertTrue(client.isElementFound("NATIVE", FAQ_VHomeArticleContent), "The VHome article is present");
	}
}
