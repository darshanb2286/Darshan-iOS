package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ContactUsPageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public ContactUsPageFactory(AppiumDriver<IOSElement> iosDriver) {
//		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash contact icon']")
	IOSElement clickOnContactUsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnContactUsIosFunction(){
		clickOnContactUsIos.click();
	 }
	
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	 }
}
