package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.SPTrancePageFactory;

public class SPTrance extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		sptrancePage = new SPTrancePageFactory(iosDriver);
	}
	@Test(priority=28)
public void click_On_SPTrance(){
//	try{
//		WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SPTRANCE_IOS)));
//		this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SPTRANCE_IOS)).click();
		test = extent.createTest("click_On_SPTrance");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_SPTrance Started Executing.", ExtentColor.PINK));
		sptrancePage.clickOnSPTranceIosFunction();
		System.out.println("Clicking on SPTrance ");
//	}
//	catch(Exception e){
//		System.err.println("Unable to click on click_On_SPTrance");
//		new TakeScreenshot(iosDriver);
//	}	

}
	@Test(priority=29)
public void click_On_Carteirinha() throws InterruptedException{

//	try{
//		WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CARTEIRINHA_IOS)));
//		this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_CARTEIRINHA_IOS)).click();
		test = extent.createTest("click_On_Carteirinha");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Carteirinha Started Executing.", ExtentColor.PINK));
		sptrancePage.clickOnSPTranceCarteiRinhaIosFunction();
		System.out.println("Clicking on Carteirinha inside SPTrance");
//		try{
//			WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//			waitforbackbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			Thread.sleep(5000);
			test = extent.createTest("Clicking on back button from Carteirinha inside SPTrance ");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button from Carteirinha inside SPTrance get back on Private dashboard After click_On_Check_Edition Started Executing.", ExtentColor.PINK));
			sptrancePage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button from Carteirinha inside SPTrance");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on back button");
//			new TakeScreenshot(iosDriver);
//		}
//	}
//	catch(Exception e){
//		System.err.println("Unable to click on click_On_Carteirinha");
//		new TakeScreenshot(iosDriver);
//	}	


}

}
