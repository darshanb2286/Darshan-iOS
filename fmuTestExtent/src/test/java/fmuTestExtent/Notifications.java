package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.NotificationsPageFactory;

public class Notifications extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		notificationPage = new NotificationsPageFactory(iosDriver);
	}
	@Test(priority=19)
	public void click_On_notifications(){
//		try{
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			System.out.println("wait ::in "+wait);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_IOS)).click();
			test = extent.createTest("click_On_notifications");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_notifications Started Executing.", ExtentColor.PINK));
			notificationPage.clickOnNotificationsIosFunction();
			System.out.println("Clicking on Notifications");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_notifications");
//			new TakeScreenshot(iosDriver);
//		}	
	}
	@Test(priority=20)
	public void click_On_Notifications_settings(){
//		try{
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			System.out.println("wait ::in "+wait);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SETTINGS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SETTINGS_IOS)).click();
			test = extent.createTest("click_On_Notifications_settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Notifications_settings Started Executing.", ExtentColor.PINK));
			notificationPage.clickOnNotificationsSettingsIosFunction();
			System.out.println("Clicking on Settings Icon inside Notifications");
//			try{
//				WebDriverWait waitforsave = new WebDriverWait(this.iosDriver, 120);
//				System.out.println("wait ::in "+wait);
//				waitforsave.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SAVE_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SAVE_IOS)).click();
				test = extent.createTest("clickOnNotificationsSaveIos");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnNotificationsSaveIos Started Executing.", ExtentColor.PINK));
				notificationPage.clickOnNotificationsSaveIosFunction();
				System.out.println("Clicking on Save Icon inside Notifications");
//				try{
//					WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//					waitforbackbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//					this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
					test = extent.createTest("Clicking on the back button to getting back on Notifications list page");
					test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on the back button to getting back on Notifications list page Started Executing.", ExtentColor.PINK));
					notificationPage.clickOnBackButtonIosFunction();
					System.out.println("Clicking on the back button to getting back on Notifications list page");
//					this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
					test = extent.createTest("Clicking on the back button to getting back on the Private dashboard");
					test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on the back button to getting back on the Private dashboard Started Executing.", ExtentColor.PINK));
					notificationPage.clickOnBackButtonIosFunction();
					System.out.println("Clicking on the back button to getting back on the Private dashboard");
//				}
//				catch(Exception e){
//					System.err.println("Unable to click on back button");
//					new TakeScreenshot(iosDriver);
//				}
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on click_OnNotifications_Settings_Save");
//				new TakeScreenshot(iosDriver);
//			}
//		
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Notifications_settings"+e.getMessage());
//			new TakeScreenshot(iosDriver);
//		}	
	}
	
}
