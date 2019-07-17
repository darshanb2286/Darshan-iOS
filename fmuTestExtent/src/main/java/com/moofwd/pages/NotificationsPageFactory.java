package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NotificationsPageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public NotificationsPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash notifications icon']")
	IOSElement clickOnNotificationsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='setting icon']")
	IOSElement clickOnNotificationsSettingsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Salvar']")
	IOSElement clickOnNotificationsSaveIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnNotificationsIosFunction(){
		clickOnNotificationsIos.click();
	 }
	public void clickOnNotificationsSettingsIosFunction(){
		clickOnNotificationsSettingsIos.click();
	 }
	public void clickOnNotificationsSaveIosFunction(){
		clickOnNotificationsSaveIos.click();
	}
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	
}
