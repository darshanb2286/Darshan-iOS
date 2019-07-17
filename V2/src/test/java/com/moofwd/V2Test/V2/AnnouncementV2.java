package com.moofwd.V2Test.V2;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.moofwd.V2Base.TestBase;
import com.moofwd.V2Page.AnnouncementPageFactory;

import io.appium.java_client.MobileElement;

public class AnnouncementV2 extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp AvisosAndroid::");
		announcementPage = new AnnouncementPageFactory(iosDriver);
	}
	
	@Test(priority=16)
	public void clickOnAnnouncementMenu() throws InterruptedException{
		Thread.sleep(3000);
		announcementPage.clickOnAnnouncementMenuFunction();
	}
	@Test(priority=17)
	public void enterAnnouncementNameInTextField(){
		announcementPage.enterAnnouncementNameInTextFieldFunction();
	}
	@Test(priority=18)
	public void clickOnOneOfAnnouncementInList() throws InterruptedException{
		Thread.sleep(3000);
		announcementPage.clickOnOneOfAnnouncementInListFunction();
	}
	@Test(priority=19)
	public void clickOnBackButtonAnnouncement() throws InterruptedException{
		announcementPage.clickOnBackButtonAnnouncementFunction();
	}
	@Test(priority=20)
	public void clickOnHomeMenuIcon() throws InterruptedException{
		announcementPage.clickOnMenuButtonFunction();
		Thread.sleep(3000);
		announcementPage.clickOnHomeMenuIconFunction();
	}
	@Test(priority=21)
	public void slideOfAnnouncement() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("Inside Slider");
		MobileElement slider = iosDriver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther"));
        Point source = slider.getLocation();
        System.out.println("source "+source);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        System.out.println("finger"+finger);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x+400, source.y));
        System.out.println("PointerInput.Origin.viewport() "+PointerInput.Origin.viewport());
        System.out.println("source.x "+ source.x +"source.y "+ source.y);
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        dragNDrop.addAction(new Pause(finger, Duration.ofMillis(600)));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(),
                source.x , source.y));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        iosDriver.perform(Arrays.asList(dragNDrop));
	}
}
