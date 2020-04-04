package com.yanfuchang.selenium.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;

public class LoginPage extends BasePage {
	/**
	 * 支持两种形式： @FindBy注解支持两种写法
	 * 		@FindBy(id = "foobar") 直接指定使用id 并且指定id定位的值 
	 * 		@FindBy(how = How.ID, using = "foobar") 定位方式和值分开指定
	 * 注解说明：
	 * @FindBy：定义了查找的元素是以什么方式 定位的
	 * 		查找方式：
	 * 			@FindBy(name=”xx”)
	 * 			@FindBy(className=”xx”)
	 * 			@FindBy(xpath=”xxx”)
	 * 			@FindBy(id=”xxx”)
	 * 			@FindBy(tagName=”xxx”)
	 * 			@FindBy(linkText=”xxx”)
	 * 			@FindBy(partialLinkText=”xxx”)
	 * @CacheLookup：意思是说找到元素之后将缓存元素，重复的使用这些元素，将使测试的速度大大加快。
	 */
//	@FindBy(id = "wd")
//	@CacheLookup
	private WebElement wd;

	/**
	 * 当不添加@FindBy和@CacheLookup注解时,初始化页面元素的时候,默认按照变量的名称通过id定位获取元素....
	 * 当需要使用指定的定位方式来获取定位元素,则添加上面注释掉的注解即可
	 */
	
//	@FindBy(id = "su")
//	@CacheLookup
	private WebElement su;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage(WebDriver driver, String title) throws TimeoutException {
		super(driver, title);
	}

	public HomePage login() throws TimeoutException {
		JbClose();
		searchText("pageobject");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		search();
		return new HomePage(driver);
	}
	
	public void searchText(String text) {
		wd.sendKeys(text);
	}

	public void search() {
		su.click();
	}

	public void JbClose() {
		wd.click();
	}
}
