package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.PerfilPageFactory;

public class Perfil extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		perfilPage = new PerfilPageFactory(iosDriver);
	}
	@Test(priority=21)
	public void click_On_Perfil() {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_PERFIL_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_PERFIL_IOS)).click();
			test = extent.createTest("click_On_Perfil");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Perfil Started Executing.", ExtentColor.PINK));
			perfilPage.clickOnPerfilIosFunction();
			System.out.println("Clicking on Perfil on Private dashboard ");
			
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Avisos");
//			new TakeScreenshot(iosDriver);
//		}

	}
	@Test(priority=22)
	public void click_On_Edit_Perfil() throws InterruptedException {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_EDIT_PERFIL_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_EDIT_PERFIL_IOS)).click();
			Thread.sleep(5000);
			test = extent.createTest("click_On_Edit_Perfil");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Edit_Perfil Started Executing.", ExtentColor.PINK));
			perfilPage.clickOnEditPerfilIosFunction();
			System.out.println("Clicking on Edit Icon of Perfil ");
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Edit_Perfil");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=23)
	public void click_On_Check_Edition() throws InterruptedException {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			System.out.println("wait ::in " + wait);
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CHECK_EDITION_PERFIL_ICON_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_CHECK_EDITION_PERFIL_ICON_IOS)).click();
			test = extent.createTest("Perfil_click_On_Check_Edition");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Perfil_click_On_Check_Edition Started Executing.", ExtentColor.PINK));
			Thread.sleep(5000);
			perfilPage.clickOnCheckEditionPerfilIconIosFunction();
			System.out.println("Clicking on Save Icon i.e Check Edition Perfil Icon on Private dashboard ");
//			try {
//				WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver, 120);
//				waitforbackbutton.until(ExpectedConditions
//						.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				Thread.sleep(12000);
				test = extent.createTest("clickOnBackButtonIos_To get back on Private dashboard After click_On_Check_Edition ");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_To get back on Private dashboard After click_On_Check_Edition Started Executing.", ExtentColor.PINK));
				perfilPage.clickOnBackButtonIosFunction();
				System.out.println("Getting back on Private Dashboard ");
//			} catch (Exception e) {
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Check_Edition");
//			new TakeScreenshot(iosDriver);
//		}
	}
}
