package com.yanfuchang.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage(WebDriver driver, String title) throws TimeoutException {
		super(driver, title);
	}
}
