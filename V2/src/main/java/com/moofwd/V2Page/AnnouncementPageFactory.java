package com.moofwd.V2Page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AnnouncementPageFactory {
	public AnnouncementPageFactory(AppiumDriver<IOSElement> iosDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Announcements\"]")
	public IOSElement clickOnAnnouncementMenu;
	
	@iOSFindBy(xpath="/XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	public IOSElement enterAnnouncementNameInTextField;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneOfAnnouncementInList;
	
	@iOSFindBy(xpath="(//XCUIElementTypeButton[@name='sideMenuBtnIdentifier'])[1]")
	public IOSElement clickOnBackButtonAnnouncement;
	
	@iOSFindBy(xpath="//XCUIElementTypeImage[@name=\"homeImageViewIdentifier\"]")
	public IOSElement clickOnHomeMenuIcon;
	
	@iOSFindBy(id="sideMenuBtnIdentifier")
	public IOSElement clickOnMenuButton;
	
	public void clickOnAnnouncementMenuFunction(){
		clickOnAnnouncementMenu.click();
	}
	public void enterAnnouncementNameInTextFieldFunction(){
		enterAnnouncementNameInTextField.sendKeys("Pocket");
	}
	public void clickOnOneOfAnnouncementInListFunction(){
		clickOnOneOfAnnouncementInList.click();
	}
	public void clickOnBackButtonAnnouncementFunction(){
		clickOnBackButtonAnnouncement.click();
	}
	public void clickOnHomeMenuIconFunction(){
		clickOnHomeMenuIcon.click();
	}
	public void clickOnMenuButtonFunction(){
		clickOnMenuButton.click();
	}
}
