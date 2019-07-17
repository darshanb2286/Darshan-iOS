package com.moofwd.V2Page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MenuPageFactory {
	public MenuPageFactory(AppiumDriver<IOSElement> iosDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(id="sideMenuBtnIdentifier")
	public IOSElement clickOnMenuButton;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[5]")
	public IOSElement clickOnMenuEvents;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	public IOSElement enterEventNameInTextField;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneofEventInList;
	
	@iOSFindBy(xpath="(//XCUIElementTypeButton[@name='sideMenuBtnIdentifier'])[1]")
	public IOSElement backOnHomePage;
	
	public void clickOnMenuButtonFunction(){
		clickOnMenuButton.click();
	}
	public void clickOnMenuEventsFunction(){
		clickOnMenuEvents.click();
	}
	public void enterEventNameInTextFieldFunction(){
		enterEventNameInTextField.sendKeys("Pocket");
	}
	public void clickOnOneofEventInListFunction(){
		clickOnOneofEventInList.click();
	}
	public void clickOnBackButtonFunction(){
		backOnHomePage.click();
	}
}
