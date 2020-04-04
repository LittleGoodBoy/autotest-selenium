package com.yanfuchang.selenium.pageobject;

import org.openqa.selenium.WebDriver;

/**
 *	使用main方式运行测试
 */
public class Test {
	public static void main(String[] args) throws Exception {
		WebDriver drivers;
		UseBrowser browser = new UseBrowser();
		BaiduPage page = new BaiduPage();

		drivers = browser.setupChrome("http://www.baidu.com/");
		page.click_Search_Bar(drivers);
		page.input_Search_Box(drivers, "PageObject设计模式");
		page.click_Search_Button(drivers);
		Thread.sleep(5000);
		browser.teardownBrowser();
	}
}
