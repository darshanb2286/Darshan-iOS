package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FAQPageFactory {

	AppiumDriver<IOSElement> iosDriver;
	public FAQPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash faq icon']")
	IOSElement clickOnFAQIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeSearchField[@name='o que você está procurando?']")
	IOSElement enterTextInTextFieldFAQIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnFAQIosFunction(){
		clickOnFAQIos.click();
	 }
	public void enterTextInTextFieldFAQIosFunction(){
		enterTextInTextFieldFAQIos.sendKeys("test");
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
