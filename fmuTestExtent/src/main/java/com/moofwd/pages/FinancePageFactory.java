package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FinancePageFactory {
	AppiumDriver<IOSElement> iosDriver;
	public FinancePageFactory(AppiumDriver<IOSElement> iosDriver) {
	this.iosDriver = iosDriver;
	PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash Finanzas icon']")
	IOSElement clickOnFinanceIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='DOWNLOAD RECEIPT'])[1]")
	IOSElement ClickOnFinanceDownloadReceiptIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='X']")
	IOSElement ClickOnClosePopUpFinanceIos;
	
	@iOSFindBy(xpath="1276")
	IOSElement ScrollToParticularElementFinanceIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Pagos']")
	IOSElement ClickOnFinancePaidIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	public void clickOnFinanceIosFunction(){
		clickOnFinanceIos.click();
	 }
	public void ClickOnFinanceDownloadReceiptIosFunction(){
		ClickOnFinanceDownloadReceiptIos.click();
	 }
	public void ClickOnClosePopUpFinanceIosFunction(){
		ClickOnClosePopUpFinanceIos.click();
	 }
	public void ScrollToParticularElementFinanceIosFunction(){
		ScrollToParticularElementFinanceIos.click();
	 }
	public void ClickOnFinancePaidIosFunction(){
		ClickOnFinancePaidIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
}
