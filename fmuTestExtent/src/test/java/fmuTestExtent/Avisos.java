package fmuTestExtent;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.gson.Gson;
import com.moofwd.base.TestBase;
import com.moofwd.pages.AvisosPageFactory;

public class Avisos extends TestBase{

	WebDriverWait wait;
//	Gson gson = new Gson();
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
//		System.out.println("setUp :: "+iosDriver);
		avisosPage = new AvisosPageFactory(iosDriver);
	}

	@Test(priority=5)
	public void click_On_Avisos() throws InterruptedException {
//		try {
			Thread.sleep(5000);
			test = extent.createTest("click_On_Avisos","TEST DESC");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Avisos Started Executing.", ExtentColor.CYAN));
			avisosPage.clickOnAvisosIosFunction();
			System.out.println("Clicking on Avisos Icon");
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Avisos");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=6)
	public void click_On_OneOf_Avisos() throws InterruptedException{
//		try{
			test = extent.createTest("click_On_OneOf_Avisos");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Avisos Started Executing.", ExtentColor.CYAN));
			avisosPage.clickOnOneOfAvisosIosFunction();
			System.out.println("Clicking one of the Avisos from the list of Avisos ");
//			try{
				avisosPage.clickOnBackButtonIosFunction();
				System.out.println("To get back to the list of Avisos ");
				Thread.sleep(3000);
				avisosPage.clickOnBackButtonIosFunction();
				System.out.println("To get back to the Private dashboard from the list of Avisos ");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneOf_Avisos");
//			new TakeScreenshot(iosDriver);
//			avisosPage.clickOnBackButtonIosFunction();
//			}
		}


}
