package com.tcs.Smarthome.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestRun extends TestBase {

	@Test(groups="sanity")
	public void checkExcel() throws IOException {
		
		System.out.println(getTestData(2,2));
		
	}	
}
