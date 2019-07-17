package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class EventosPageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public EventosPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	IOSElement clickOnEventosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Antigos']")
	IOSElement clickOnEventosAntigoIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnEventosIosFunction(){
		clickOnEventosIos.click();
	 }
	public void clickOnEventosAntigoIosFunction(){
		clickOnEventosAntigoIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
