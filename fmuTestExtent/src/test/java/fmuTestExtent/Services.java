package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.ServicesPageFactory;

public class Services extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		servicePage = new ServicesPageFactory(iosDriver);
	}
	@Test(priority=26)
	public void clickOn_Services(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SERVICES_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SERVICES_IOS)).click();
			test = extent.createTest("clickOn_Services");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Services Started Executing.", ExtentColor.PINK));
			servicePage.clickOnServicesIosFunction();
			System.out.println("Clicking on the Services ");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Services ");
//			new TakeScreenshot(iosDriver);
//		}	
	}
	@Test(priority=27)
	public void click_On_OneoftheServices() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_ONEOF_SERVICES_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_ONEOF_SERVICES_IOS)).click();
			Thread.sleep(5000);
			test = extent.createTest("click_On_OneoftheServices");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_OneoftheServices Started Executing.", ExtentColor.PINK));
			servicePage.clickOnOneofServicesIosFunction();
			System.out.println("Clicking on One of the Services from the list ");
//			try{
//				WebDriverWait waittogetback= new WebDriverWait(this.iosDriver,120);
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//				test = extent.createTest("Getting back from one of the detail Service");
//				test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back from one of the detail Service Started Executing.", ExtentColor.PINK));
//				servicePage.clickOnBackButtonIosFunction();
//				System.out.println("Getting back from one of the detail Service ");
////				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//				test = extent.createTest("Getting back from the List of Service on Private Dashboard");
//				test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back from the List of Service on Private Dashboard Started Executing.", ExtentColor.PINK));
//				servicePage.clickOnBackButtonIosFunction();
//				System.out.println("Getting back from the List of Service on Private Dashboard ");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
////				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//				servicePage.clickOnBackButtonIosFunction();
//				
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneoftheServices");
//			new TakeScreenshot(iosDriver);
////			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//			servicePage.clickOnBackButtonIosFunction();
//		}
	}
}
