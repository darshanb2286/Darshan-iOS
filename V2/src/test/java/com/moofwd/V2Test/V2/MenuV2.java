package com.moofwd.V2Test.V2;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.moofwd.V2Base.TestBase;
import com.moofwd.V2Page.EventPageFactory;
import com.moofwd.V2Page.MenuPageFactory;

public class MenuV2 extends TestBase {
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp AvisosAndroid::");
		menuPage = new MenuPageFactory(iosDriver);
	}
	@Test(priority=11)
	public void clickOnMenuButton() throws InterruptedException{
		Thread.sleep(8000);	
		menuPage.clickOnMenuButtonFunction();
	}
	@Test(priority=12)
	public void clickOnMenuEvents() throws InterruptedException{	
		menuPage.clickOnMenuEventsFunction();
	}
	@Test(priority=13)
	public void enterEventNameInTextField() throws InterruptedException{	
		menuPage.enterEventNameInTextFieldFunction();
	}
	@Test(priority=14)
	public void clickOnOneofEventInList() throws InterruptedException{	
		menuPage.clickOnOneofEventInListFunction();
	}
	@Test(priority=15)
	public void backOnParticularPage() throws InterruptedException{	
		menuPage.clickOnBackButtonFunction();
		Thread.sleep(3000);
		menuPage.clickOnMenuButtonFunction();
	}
}
