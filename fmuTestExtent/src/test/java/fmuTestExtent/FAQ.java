package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.FAQPageFactory;

public class FAQ extends TestBase{
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		faqPage = new FAQPageFactory(iosDriver);
	}
	@Test(priority=11)
	public void click_On_FAQ() throws InterruptedException{
		test = extent.createTest("click_On_FAQ");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_FAQ Started Executing.", ExtentColor.CYAN));
//				try{
//					WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//					System.out.println("wait ::in "+wait);
//					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FAQ_IOS)));
//					this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_FAQ_IOS)).click();
					faqPage.clickOnFAQIosFunction();
					System.out.println("Clicking on FAQ");
//					try{
//						WebDriverWait waitforsendkeys = new WebDriverWait(this.iosDriver,120);
//						waitforsendkeys.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.ENTER_TEXT_IN_TEXTFIELD_IOS)));
//						this.iosDriver.findElement(By.xpath(constantsTest.ENTER_TEXT_IN_TEXTFIELD_IOS)).sendKeys("Test");
						test = extent.createTest("enterTextInTextFieldFAQIos");
						test.log(Status.INFO, MarkupHelper.createLabel("verify enterTextInTextFieldFAQIos Started Executing.", ExtentColor.CYAN));
						faqPage.enterTextInTextFieldFAQIosFunction();
						System.out.println("Entering the Text in the Textfield inside the FAQ");
						Thread.sleep(5000);
//						this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
						test = extent.createTest("clickOnBackButtonIos_FAQ");
						test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_FAQ Started Executing.", ExtentColor.CYAN));
						faqPage.clickOnBackButtonIosFunction();
						System.out.println("Clicking on the back button from th FAQ");
//					}
//					catch(Exception e){
//						System.err.println("Unable to click on FAQ sendkeys");
//						new TakeScreenshot(iosDriver);
//					}
//				}
//				catch(Exception e){
//					System.err.println("Unable to click on click_On_FAQ");
//					new TakeScreenshot(iosDriver);
//				}	
	}
	
}
