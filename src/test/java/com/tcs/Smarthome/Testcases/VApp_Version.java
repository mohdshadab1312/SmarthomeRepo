package com.tcs.Smarthome.Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VApp_Version extends TestBase {

	@Test(groups= {"sanity", "regression"})
	@Parameters("version")
	public void checkVersion(String version) {

		client.launch("com.vodafone.smartlife/.gui.activities.SplashActivity", false, true);
		client.waitForElement("NATIVE", FinalHomePage_Title, 0, 10000);

		client.click("NATIVE", FinalHomepage_MoreoptionsIcon, 0, 1);
		client.click("NATIVE", VAppMenu_VByVodafoneOption, 0, 1);
		client.click("NATIVE", VAppMenu_UserVByVodafone_VersionLink, 0, 1);

		client.waitForElement("NATIVE", VAppMenu_UserVByVodafone_Version, 0, 10000);
		String versionText = client.elementGetText("NATIVE", VAppMenu_UserVByVodafone_Version, 0);
		Assert.assertTrue(versionText.contains(version), "Version is correct");
	}
}
