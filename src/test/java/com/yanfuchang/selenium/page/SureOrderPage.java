package com.yanfuchang.selenium.page;

import org.openqa.selenium.WebElement;

import com.yanfuchang.selenium.base.DriverBase;
import com.yanfuchang.selenium.util.GetByLocator;

public class SureOrderPage extends BasePage {

	public SureOrderPage(DriverBase driverBase) {
		super(driverBase);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 获取提交订单按钮
	 * 
	 */
	public WebElement getSureOrderButton() {
		return element(GetByLocator.getLocator("sureOrder"));
	}

}