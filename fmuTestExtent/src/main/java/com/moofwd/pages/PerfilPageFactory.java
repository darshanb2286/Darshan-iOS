package com.moofwd.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PerfilPageFactory {

	AppiumDriver<IOSElement> iosDriver;
	public PerfilPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@FindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	IOSElement clickOnPerfilIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name='Profile edit image']")
	IOSElement clickOnEditPerfilIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name='check edition icon']")
	IOSElement clickOnCheckEditionPerfilIconIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnPerfilIosFunction(){
		clickOnPerfilIos.click();
	 }
	public void clickOnEditPerfilIosFunction(){
		clickOnEditPerfilIos.click();
	 }
	public void clickOnCheckEditionPerfilIconIosFunction(){
		clickOnCheckEditionPerfilIconIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
