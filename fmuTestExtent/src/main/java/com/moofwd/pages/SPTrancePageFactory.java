package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SPTrancePageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public SPTrancePageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash sptrans icon']")
	IOSElement clickOnSPTranceIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Carteirinha']")
	IOSElement clickOnSPTranceCarteiRinhaIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnSPTranceIosFunction(){
		clickOnSPTranceIos.click();
	 }
	public void clickOnSPTranceCarteiRinhaIosFunction(){
		clickOnSPTranceCarteiRinhaIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
