package com.moofwd.V2Test.V2;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Log;
import com.moofwd.V2Base.TestBase;
import com.moofwd.V2Page.EventPageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class EventV2 extends TestBase {
	WebElement ele;
	WebDriverWait wait;
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp AvisosAndroid::");
		eventPage = new EventPageFactory(iosDriver);
	}
	@Test(priority=1)
	public void clickOnEventPlaceHolder() throws Exception{
		test = extent.createTest("clickOnEventPlaceHolder");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Avisos Started Executing.", ExtentColor.CYAN));
		System.out.println("clickOnEventPlaceHolderFunction :: ");
		eventPage.clickOnEventPlaceHolderFunction();
		System.out.println("After clickOnEventPlaceHolderFunction :: ");
//		swipeScreen();
//		Thread.sleep(5000);
//		eventPage.ScrollToParticularElementFunction();
//		ZoomInPicture();
//		eventPage.clickOnBackButtonFunction();
//		eventPage.clickOnBackButtonToGetBackOnHomePageFunction();
//		slider();
		
	}
	
	public void swipeScreen(){	
//		RemoteWebElement element = (RemoteWebElement)iosDriver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Gallery']"));
		//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeImage[1]
		//XCUIElementTypeApplication[@name=\"testApplication\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeImage[1]
		//XCUIElementTypeApplication[@name="testApplication"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeImage[2]
		RemoteWebElement element = (RemoteWebElement)iosDriver.findElement(By.xpath("//XCUIElementTypeApplication[@name='testApplication']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther"));
		System.out.println("RemoteWebElement ::"+ element);
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID); // Only for ‘scroll in element’
		scrollObject.put("direction", "down");
		iosDriver.executeScript("mobile:scroll", scrollObject);
	}
	
	public void swipeScreenUp() throws InterruptedException{
		RemoteWebElement element = (RemoteWebElement)iosDriver.findElement(By.xpath("//XCUIElementTypeApplication[@name='testApplication']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]"));
		System.out.println("RemoteWebElement ::"+ element);
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID); // Only for ‘scroll in element’
		scrollObject.put("direction", "up");
		iosDriver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(7000);
	}
	
	public void ZoomInPicture() throws InterruptedException{
		Thread.sleep(5000);
        iosDriver.findElement(By.xpath("//XCUIElementTypeApplication[@name='testApplication']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeImage[2]")).click();
        Thread.sleep(3000);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

        Dimension size = iosDriver.manage().window().getSize();
        Point source = new Point(size.getWidth(), size.getHeight());

        Sequence pinchAndZoom1 = new Sequence(finger, 0);
        pinchAndZoom1.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x / 2, source.y / 2));
        pinchAndZoom1.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        pinchAndZoom1.addAction(new Pause(finger, Duration.ofMillis(100)));
        pinchAndZoom1.addAction(finger.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(), source.x / 3, source.y / 3));
        pinchAndZoom1.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));


        Sequence pinchAndZoom2 = new Sequence(finger2, 0);
        pinchAndZoom2.addAction(finger2.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x / 2, source.y / 2));
        pinchAndZoom2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        pinchAndZoom2.addAction(new Pause(finger, Duration.ofMillis(100)));
        pinchAndZoom2.addAction(finger2.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(), source.x * 3 / 4, source.y * 3 / 4));
        pinchAndZoom2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        iosDriver.perform(Arrays.asList(pinchAndZoom1,pinchAndZoom2));
	}
	
	public void slider() throws Exception{
		Thread.sleep(5000);
		System.out.println("Inside Slider");
		MobileElement slider = iosDriver.findElement(By.xpath("//XCUIElementTypeApplication[@name='testApplication']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[2]"));

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
	
//	@Test(priority=7)
//	public void clickOnEventMailId() throws InterruptedException{
//		swipeScreen();
//		eventPage.clickOnEventMailIdFunction();
//		Thread.sleep(3000);
//		eventPage.clickOnBackButtonfromEmailIdFunction();
//	}
	
	@Test(priority=8)
	public void clickOnNumber() throws InterruptedException{
		swipeScreen();
		eventPage.clickOnEventNumberFunction();
		Thread.sleep(3000);
		Alert alert = iosDriver.switchTo().alert();
		alert.dismiss();
	}
	
	@Test(priority=10)
	public void clickOnGalleryImageForZoomIn() throws InterruptedException{
//		eventPage.ScrollToParticularElementFunction();
		ZoomInPicture();
		eventPage.clickOnBackButtonFunction();
		eventPage.clickOnBackButtonToGetBackOnHomePageFunction();
	}
	
	@Test(priority=9)
	public void getOrientationForDevice() throws InterruptedException{
			eventPage.ScrollToParticularElementFunction();
	        iosDriver.rotate(ScreenOrientation.LANDSCAPE);
	        Thread.sleep(3000);
	        iosDriver.rotate(ScreenOrientation.PORTRAIT);
	        Thread.sleep(3000);	   
	}
	
//	@Test(priority=4)
//	public void swipescreen() throws InterruptedException{
//		swipeScreenUp();
//		Thread.sleep(7000);
//	}
	@Test(priority=2)
	public void clickOncontextualMenu() throws InterruptedException{
//		swipeScreenUp();
//		WebDriverWait wait =new WebDriverWait(iosDriver, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"contextualMenu\"]")));
//		Thread.sleep(10000);
		eventPage.clickOnContextualMenuFunction();
	}
	
	
	@Test(priority=3)
	public void clickOnContextualMenuShare(){
		eventPage.clickOnContextualMenuShareFunction();
	}
	
	@Test(priority=4)
	public void clickOnContextualMenuShareCancel() throws InterruptedException{
		eventPage.clickOnContextualMenuShareCancelFunction();
		clickOncontextualMenu();
	}
	
//	@Test(priority=5)
//	public void clickOnContextualMenuMoreDetail() throws InterruptedException{
//		eventPage.clickOnContextualMenuMoreDetailFunction();
//		Thread.sleep(3000);
//		eventPage.clickOnBackButtonfromEmailIdFunction();
//		clickOncontextualMenu();
//	}
	
	@Test(priority=6)
	public void clickOnContextualMenuAddToCalendar() throws InterruptedException{
//		clickOncontextualMenu();
		Thread.sleep(3000);
		eventPage.clickOnContextualMenuAddToCalendarFunction();
	}
	
}
