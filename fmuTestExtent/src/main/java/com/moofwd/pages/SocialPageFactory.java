package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SocialPageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public SocialPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash social icon']")
	IOSElement clickOnResdesSocialIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	IOSElement clickOnResdesSocialFacebookIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	IOSElement clickOnResdesSocialTwitterIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
	IOSElement clickOnResdesSocialYouTubeIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
	IOSElement clickOnResdesSocialInstagramIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
	IOSElement clickOnResdesSocialLinkedInIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnResdesSocialIosFunction(){
		clickOnResdesSocialIos.click();
	 }
	public void clickOnResdesSocialFacebookIosFunction(){
		clickOnResdesSocialFacebookIos.click();
	 }
	public void clickOnResdesSocialTwitterIosFunction(){
		clickOnResdesSocialTwitterIos.click();
	 }
	public void clickOnResdesSocialYouTubeIosFunction(){
		clickOnResdesSocialYouTubeIos.click();
	 }
	public void clickOnResdesSocialInstagramIosFunction(){
		clickOnResdesSocialInstagramIos.click();
	 }
	public void clickOnResdesSocialLinkedInIosFunction(){
		clickOnResdesSocialLinkedInIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
