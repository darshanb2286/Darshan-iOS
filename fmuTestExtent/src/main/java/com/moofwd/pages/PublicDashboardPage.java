package com.moofwd.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;


public class PublicDashboardPage{
	
	AppiumDriver<IOSElement> iosDriver;
	public PublicDashboardPage(AppiumDriver<IOSElement> iosDriver) {
//		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@FindBy(xpath="//XCUIElementTypeButton[@name='Coueselist forword arrow']")
	IOSElement clickOnForwardArrowIos;

	@FindBy(xpath="//XCUIElementTypeButton[@name='IR PARA O LOGIN']")
	IOSElement clickOnIrParaLogInIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name='Entrar']/XCUIElementTypeTextField")
	IOSElement enterUserNameIos;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Entrar']/XCUIElementTypeSecureTextField")
	IOSElement enterPasswordIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name='ENTRAR']")
	IOSElement clickOnEntrarIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name='Li e concordo']")
	IOSElement clickOnLiEConcordoIos;
	
	
//	@Step("Clicking on Arrow")
	public void clickOnForwardArrowIosFunction(){
		clickOnForwardArrowIos.click();
		
	 }
//	@Step("Clicking on clickOnIrParaLogInIos")
	public void clickOnIrParaLogInIosFunction(){
		clickOnIrParaLogInIos.click();
	}
//	@Step("Clicking on enterUserNameIos")
	public void enterUserNameIosFunction(){
		enterUserNameIos.click();
		enterUserNameIos.sendKeys("A00015084@fmu.test.laureatelab.net");
		
	}
//	@Step("Clicking on enterPasswordIos")
	public void enterPasswordIosFunction(){
		enterPasswordIos.click();
		enterPasswordIos.sendKeys("E2G2019!!");
	}
//	@Step("Clicking on clickOnEntrarIos")
	public void clickOnEntrarIosFunction() throws InterruptedException{
		clickOnEntrarIos.click();
		Thread.sleep(20000);
	}
//	@Step("Clicking on clickOnLiEConcordoIos")
	public void clickOnLiEConcordoIosFunction(){
		clickOnLiEConcordoIos.click();
		/****** Pass to next class *****/		
	}

	
	
}


