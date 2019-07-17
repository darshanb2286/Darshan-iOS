package com.moofwd.V2Page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class EventPageFactory {
//	AppiumDriver<IOSElement> iosDriver;
	public EventPageFactory(AppiumDriver<IOSElement> iosDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='testApplication']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	public IOSElement ClickOnEventPlaceHolder;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	//XCUIElementTypeApplication[@name='testApplication']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther
	public IOSElement scrollToParticularElement;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='backNavigationWhite']")
	public IOSElement backOnParticularPage;
	
	@iOSFindBy(xpath="(//XCUIElementTypeButton[@name='sideMenuBtnIdentifier'])[1]")
	public IOSElement backOnHomePage;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='andy@gmail.com']") 
	public IOSElement clickOnEventMailId;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='breadcrumb']")
	public IOSElement clickOnBackButtonfromEmailId;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='876855']")
	public IOSElement clickOnEventNumber;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='contextualMenu']")
	public IOSElement clickOnContextualMenu;
	
//	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='sideMenuBtnIdentifier']")
//	public IOSElement clickOnMenuButton;
	
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Share']")
	public IOSElement clickOnContextualMenuShare;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
	public IOSElement clickOnContextualMenuShareCancel;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='More Detail']")
	public IOSElement clickOnContextualMenuMoreDetail;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Add To Calendar\"]")
	public IOSElement clickOnContextualMenuAddToCalendar;
//	@iOSFindBy(id="contextualMenu")
//	public IOSElement clickOnContextualMenu;
//	@iOSFindBy(id="eventRectPlaceholder")
//	public TapOptions ClickOnEventPlaceHolder;

	public void clickOnEventPlaceHolderFunction() throws InterruptedException{
		System.out.println("ClickOnEventPlaceHolder");
		Thread.sleep(9000);
		ClickOnEventPlaceHolder.click();
		System.out.println("After ClickOnEventPlaceHolder");
		}
	public void ScrollToParticularElementFunction(){
		scrollToParticularElement.click();
	}
	public void clickOnBackButtonFunction(){
		backOnParticularPage.click();
	}
	public void clickOnBackButtonToGetBackOnHomePageFunction(){
		backOnHomePage.click();
	}
	public void clickOnEventMailIdFunction(){
		clickOnEventMailId.click();
	}
	public void clickOnBackButtonfromEmailIdFunction(){
		clickOnBackButtonfromEmailId.click();
	}
	public void clickOnEventNumberFunction(){
		clickOnEventNumber.click();
	}
	public void clickOnContextualMenuFunction() throws InterruptedException{
		System.out.println("clickOnContextualMenuFunction ::");
		Thread.sleep(7000);
		clickOnContextualMenu.click();
	}
	
	public void clickOnContextualMenuShareFunction(){
		clickOnContextualMenuShare.click();
	}
	
	public void clickOnContextualMenuShareCancelFunction(){
		clickOnContextualMenuShareCancel.click();
	}
	
	public void clickOnContextualMenuMoreDetailFunction(){
		clickOnContextualMenuMoreDetail.click();
	}
	public void clickOnContextualMenuAddToCalendarFunction(){
		clickOnContextualMenuAddToCalendar.click();
	}
}
