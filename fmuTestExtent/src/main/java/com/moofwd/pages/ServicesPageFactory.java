package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ServicesPageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public ServicesPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash services icon']")
	IOSElement clickOnServicesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	IOSElement clickOnOneofServicesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnServicesIosFunction(){
		clickOnServicesIos.click();
	 }
	
	public void clickOnOneofServicesIosFunction(){
		try{
		clickOnOneofServicesIos.click();
		Thread.sleep(5000);
		clickOnBackButtonIos.click();
		Thread.sleep(5000);
		clickOnBackButtonIos.click();
		}
		catch(Exception e){
			clickOnBackButtonIos.click();
		}
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
