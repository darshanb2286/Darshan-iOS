package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.FinancePageFactory;

public class Finance extends TestBase {
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		financePage = new FinancePageFactory(iosDriver);
	}
	@Test(priority=12)
	public void clickOn_Finance(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FINANCE_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_FINANCE_IOS)).click();
		test = extent.createTest("clickOn_Finance");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Finance Started Executing.", ExtentColor.GREEN));
			financePage.clickOnFinanceIosFunction();
			System.out.println("Clicking on Finance");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Finance");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=13)
	public void clickOn_Download_Receipt(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FINANCE_DOWNLOAD_RECEIPT_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_FINANCE_DOWNLOAD_RECEIPT_IOS)).click();
			test = extent.createTest("Finance_clickOn_Download_Receipt");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Finance_clickOn_Download_Receipt Started Executing.", ExtentColor.GREEN));
			financePage.ClickOnFinanceDownloadReceiptIosFunction();
			System.out.println("CLicking on Download Receipt inside Finance");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Download_Receipt");
//			new TakeScreenshot(iosDriver);
//		}
		
	}
	@Test(priority=14)
	public void clickOn_Close_PopUp_Finance(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CLOSE_POPUP_FINANCE_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_CLOSE_POPUP_FINANCE_IOS)).click();
			test = extent.createTest("clickOn_Close_PopUp_Finance");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Close_PopUp_Finance Started Executing.", ExtentColor.GREEN));
			financePage.ClickOnClosePopUpFinanceIosFunction();
			System.out.println("Clicking on Close button of PopUp inside Finance");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Close_PopUp_Finance");
//			new TakeScreenshot(iosDriver);
//		}
	}
//	public void Scroll_To_Particular_Element(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(constantsTest.SCROLL_TO_PARTICULAR_ELEMENT_FINANCE_IOS)));
//			this.iosDriver.findElement(By.name(constantsTest.SCROLL_TO_PARTICULAR_ELEMENT_FINANCE_IOS)).click();
//			WebElement element = (WebElement)iosDriver. findElement(By.name(constantsTest.SCROLL_TO_PARTICULAR_ELEMENT_FINANCE_IOS));
//			String elementID = ((RemoteWebElement) element).getId();
//			HashMap<String, String> scrollObject = new HashMap<String, String>();
//			scrollObject.put("element", elementID);
//			scrollObject.put("toVisible", "not an empty string");
//			iosDriver.executeScript("mobile:scroll", scrollObject);
//			System.out.println("Scrolling to the particular element in the finance");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on Scroll_To_Particular_Element");
//			new TakeScreenshot(iosDriver);
//		}
//	}
	@Test(priority=15)
	public void clickOn_Paid() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FINANCE_PAID_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_FINANCE_PAID_IOS)).click();
			Thread.sleep(3000);
			test = extent.createTest("Finance_clickOn_Paid");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Paid Started Executing.", ExtentColor.GREEN));
			financePage.ClickOnFinancePaidIosFunction();
			System.out.println("Clicking on paid tab in Finance");
//			try{
//				WebDriverWait waittogetback= new WebDriverWait(this.iosDriver,120);
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				Thread.sleep(8000);
				test = extent.createTest("clickOnBackButtonIos_Finance");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_Finance Started Executing.", ExtentColor.GREEN));
				financePage.clickOnBackButtonIosFunction();
				System.out.println("Clicking on back button after clickng on paid tab inside Finance");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Paid");
//			new TakeScreenshot(iosDriver);
//				test = extent.createTest("clickOnBackButtonIos_Finance_Again");
//				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_Finance_Again Started Executing.", ExtentColor.GREEN));
//				financePage.clickOnBackButtonIosFunction();
//		}
	}
}
