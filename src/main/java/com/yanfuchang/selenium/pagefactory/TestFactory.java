package com.yanfuchang.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;

public class TestFactory {
	
	/*
	 * 实例登陆页面时进行title验证
	 * public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver(); //实例化浏览器驱动
			driver.get("http://petrocoke-web-test.obaymax.com/"); //访问指定的url
			String logintitle = "xxx"; // 定义登陆页面的title
			LoginPage lg = new LoginPage(driver, logintitle); // 初始化登陆页面类,并验证页面title
			lg.login(); // 调用登陆方法,登陆后并验证title
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		System.out.println("测试结束");
		driver.quit();
	}*/
	
	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver(); //实例化浏览器驱动
			driver.get("https://www.baidu.com"); //访问指定的url
			LoginPage lg = new LoginPage(driver); // 初始化登陆页面类
			lg.login(); // 调用登陆方法,登陆后并验证title
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		System.out.println("测试结束");
		driver.quit();
	}
}
