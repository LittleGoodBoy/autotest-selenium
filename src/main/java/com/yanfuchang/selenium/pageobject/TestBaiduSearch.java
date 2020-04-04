package com.yanfuchang.selenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * 使用testng框架 运行测试
 */
public class TestBaiduSearch {

	WebDriver drivers;
	UseBrowser browser = new UseBrowser();
	BaiduPage page = new BaiduPage();

	//测试用例
	@Test
	public void test_baidu() throws Exception {
		page.click_Search_Bar(drivers);
		page.input_Search_Box(drivers, "PageObject设计模式");
		Thread.sleep(5000);
		page.click_Search_Button(drivers);
	}
	/**
	 * 整个测试套件执行测试之前初始化浏览器驱动
	 */
	@BeforeSuite
	public void beforeSuite() {
		drivers = browser.setupChrome("http://www.baidu.com/");
	}

	/**
	 * 整个测试套件执行测试之后关闭浏览器
	 */
	@AfterSuite
	public void afterSuite() {
		browser.teardownBrowser();
	}
}
