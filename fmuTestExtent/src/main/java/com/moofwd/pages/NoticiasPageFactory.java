package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NoticiasPageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public NoticiasPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash news icon']")
	IOSElement clickOnNoticiasIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	IOSElement clickOnOneOfNoticiasInListIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headSurveyInfoBtn']")
	IOSElement clickOnNoticiasLinkIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnNoticiasIosFunction(){
		clickOnNoticiasIos.click();
	 }
	public void clickOnOneOfNoticiasInListFunction(){
		clickOnOneOfNoticiasInListIos.click();
	 }
	public void clickOnNoticiasLinkIosFunction(){
		clickOnNoticiasLinkIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
