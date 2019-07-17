package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AvisosPageFactory {

	AppiumDriver<IOSElement> iosDriver;
	public AvisosPageFactory(AppiumDriver<IOSElement> iosDriver){
//		this.iosDriver=iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);	
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]")
	public IOSElement clickOnAvisosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneOfAvisosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	
	
	public void clickOnAvisosIosFunction(){
		System.out.println("clickOnAvisosIosFunction :: "+iosDriver);
		clickOnAvisosIos.click();
	}
	public void clickOnOneOfAvisosIosFunction() throws InterruptedException{
		try{
			clickOnOneOfAvisosIos.click();
		}
		catch(Exception e){
			clickOnBackButtonIos.click();
			System.out.println("To get back to the list of Avisos ");
			Thread.sleep(3000);
			clickOnBackButtonIos.click();
			System.out.println("To get back to the Private dashboard from the list of Avisos ");
		}
	}
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}


}
