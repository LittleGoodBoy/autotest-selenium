package com.yanfuchang.selenium.testCase;

import com.yanfuchang.selenium.base.DriverBase;

public class CaseBase {
	public DriverBase InitDriverBase(String browser) {

		return new DriverBase(browser);
	}
}
