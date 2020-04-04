package com.yanfuchang.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *	基础页面，以后任何页面都继承该页面，因为判断UI层次的页面标题
 */
public class BasePage {
	WebDriver driver;
	private final int TIMEOUT = 3; //超时时间

	//初始化
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	//初始化并设置超时验证title
	public BasePage(WebDriver driver, final String title) throws TimeoutException {
		this.driver = driver;
		new WebDriverWait(driver, TIMEOUT).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver arg0) {
				String acttitle = arg0.getTitle();
				return acttitle.equals(title);
			}
		});
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}
}
