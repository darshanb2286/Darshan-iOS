package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.EventosPageFactory;

public class Eventos extends TestBase{
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		eventosPage = new EventosPageFactory(iosDriver);
	}
	@Test(priority=9)
	public void click_on_Eventos(){
		test = extent.createTest("click_on_Eventos");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_on_Eventos Started Executing.", ExtentColor.BLUE));
//		try{
			eventosPage.clickOnEventosIosFunction();
			System.out.println("Clicking on Events on Private dashboard ");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_on_Eventos");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=10)
	public void click_On_Antigo(){
		test = extent.createTest("Eventos_click_On_Antigo");
		test.log(Status.INFO, MarkupHelper.createLabel("verify Eventos_click_On_Antigo Started Executing.", ExtentColor.BLUE));
//		try{
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_EVENTOS_ANTIGO_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_EVENTOS_ANTIGO_IOS)).click();
			eventosPage.clickOnEventosAntigoIosFunction();
			System.out.println("Clicking on Antigo inside Events on Private dashboard ");
//			try{
//				WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//				waitforbackbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				test = extent.createTest("clickOnBackButtonIos_After_Clicking_On_Antigo");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_After_Clicking_On_Antigo Started Executing.", ExtentColor.BLUE));
				eventosPage.clickOnBackButtonIosFunction();
				System.out.println("Getting back on Private Dashboard from Antigo tab ");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Antigo");
//			new TakeScreenshot(iosDriver);
//		}
	}

}
