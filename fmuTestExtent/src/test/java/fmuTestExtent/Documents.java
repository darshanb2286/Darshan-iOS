package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.DocumentsPageFactory;

public class Documents extends TestBase{

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		documentsPage = new DocumentsPageFactory(iosDriver);
	}
	@Test(priority=8)
	public void click_On_Documents() throws InterruptedException{
		test = extent.createTest("click_On_Documents");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Documents Started Executing.", ExtentColor.ORANGE));
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_DOCUMENTS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_DOCUMENTS_IOS)).click();
			documentsPage.clickOnDocumentsIosFunction();
			System.out.println("Clicking on the Documents ");
//						try{
//				WebDriverWait waittogetback= new WebDriverWait(this.iosDriver,120);
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
				Thread.sleep(3000);
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				test = extent.createTest("clickOnBackButtonIos_Documents");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_Documents Started Executing.", ExtentColor.ORANGE));
				documentsPage.clickOnBackButtonIosFunction();			
				System.out.println("Getting back on the Private Dashboard from the List of Documents ");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Documents");
//			new TakeScreenshot(iosDriver);
//		}	
	}

}
