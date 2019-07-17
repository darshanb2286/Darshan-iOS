package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.ContactUsPageFactory;

public class ContactUS extends TestBase{

@BeforeMethod
public void setUp() throws MalformedURLException {
	contactUsPage= new ContactUsPageFactory(iosDriver);
}
@Test(priority=7)
public void clickOn_ContactUs(){
	test = extent.createTest("clickOn_ContactUs");
	test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_ContactUs Started Executing.", ExtentColor.GREEN));
//	try{
//		WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CONTACT_US_IOS)));
//		this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_CONTACT_US_IOS)).click();
		contactUsPage.clickOnContactUsIosFunction();
		System.out.println("Clicking on Contact_Us");
//		try{
//			WebDriverWait waittogetback= new WebDriverWait(this.iosDriver,120);
//			waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//			Thread.sleep(5000);
//			System.out.println("Testing");
			test = extent.createTest("clickOnBackButtonIos_ContactUs");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_ContactUs Started Executing.", ExtentColor.GREEN));
			contactUsPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button inside contact us to get back on Private dashboard");
		}
//		catch(Exception e){
//			System.err.println("Unable to click on back button");
//			new TakeScreenshot(iosDriver);
//		}
//	}
//	catch(Exception e){
//		System.err.println("Unable to click on clickOn_ContactUs");
//		new TakeScreenshot(iosDriver);
//	}

//	} 

}
