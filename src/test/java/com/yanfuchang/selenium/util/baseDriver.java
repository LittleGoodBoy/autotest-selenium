package com.yanfuchang.selenium.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseDriver {
	WebDriver driver;

	public baseDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver-32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.imooc.com");
		// 窗口最大化
		driver.manage().window().maximize();
	}

	/*
	 * 截图方法
	 */
	public void takeScreenShot() {
		// 获取截图时间
		long date = System.currentTimeMillis();
		// 转换成字符串形式
		String path = String.valueOf(date);
		String curPath = System.getProperty("user.dir");
		path = path + ".png";
		String screenPath = curPath + "/" + path;
		// 进行截图操作
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File(screenPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
