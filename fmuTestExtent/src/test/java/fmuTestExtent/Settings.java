package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.SettingsPageFactory;

public class Settings extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		settingsPage = new SettingsPageFactory(iosDriver);
	}
	@Test(priority=30)
	public void click_on_Settings() {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SETTINGS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_IOS)).click();
			test = extent.createTest("click_on_Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_on_Settings Started Executing.", ExtentColor.PINK));
			settingsPage.clickOnSettingsIosFunction();
			System.out.println("Clicking on Settings on Private dashboard ");
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_on_Settings");
//			new TakeScreenshot(iosDriver);
//		}

	}
	@Test(priority=31)
	public void click_On_Notifications() throws InterruptedException {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_IOS)).click();
			test = extent.createTest("click_On_Notifications inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Notifications inside Settings Started Executing.", ExtentColor.PINK));
			settingsPage.clickOnSettingsNotificationIosFunction();
			System.out.println("Clicking on Notifications of Settings ");
//			try {
//				WebDriverWait waitAvisos = new WebDriverWait(this.iosDriver, 60);
//				waitAvisos.until(ExpectedConditions.visibilityOfElementLocated(
//						By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_AVISOS_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_AVISOS_IOS)).click();
				Thread.sleep(3000);
				test = extent.createTest("clickOnSettingsNotificationAvisosIosFunction inside Settings");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationAvisosIosFunction inside Settings Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnSettingsNotificationAvisosIosFunction();
				System.out.println("Clicking on Notifications of Settings for Avisos ");
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_EVENTOS_IOS)).click();
				test = extent.createTest("clickOnSettingsNotificationEventosIosFunction inside Settings");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationEventosIosFunction inside Settings Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnSettingsNotificationEventosIosFunction();
				System.out.println("Clicking on Notifications of Settings for Eventos ");
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_MENSAGENS_IOS))
//						.click();
				test = extent.createTest("clickOnSettingsNotificationMensajensIosFunction inside Settings");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationMensajensIosFunction inside Settings Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnSettingsNotificationMensajensIosFunction();
				System.out.println("Clicking on Notifications of Settings for Messages ");
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_SURVEYS_IOS)).click();
				test = extent.createTest("clickOnSettingsNotificationSurveysIosFunction inside Settings");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationSurveysIosFunction inside Settings Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnSettingsNotificationSurveysIosFunction();
				System.out.println("Clicking on Notifications of Settings for Surveys ");
				
				
//			} catch (Exception e) {
//				System.err.println("Unable to click on click_On_Avisos, Eventos, Mensagens, Surveys ");
//				new TakeScreenshot(iosDriver);
////				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//				settingsPage.clickOnBackButtonIosFunction();
//			}
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Notifications");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=32)
	public void click_On_Salve() throws InterruptedException {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_SALVE_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_SALVE_IOS)).click();
			test = extent.createTest("clickOnSettingsNotificationSalveIosFunction inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationSalveIosFunction inside Settings Started Executing.", ExtentColor.PINK));
			settingsPage.clickOnSettingsNotificationSalveIosFunction();
			System.out.println("Clicking on Notifications of Settings for clicking on Salve i.e Save ");
//			try {
				Thread.sleep(5000);
//				WebDriverWait waittogetback = new WebDriverWait(this.iosDriver, 120);
//				waittogetback.until(ExpectedConditions
//						.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				Thread.sleep(5000);
				test = extent.createTest("Getting back on notifications of Settings");
				test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back on notifications of Settings Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnBackButtonIosFunction();
				System.out.println("Getting back on notifications of Settings ");

//			} catch (Exception e) {
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Salve");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=33)
	public void clickOn_Sobre_Nos() {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 120);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SOBRE_NOS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_SOBRE_NOS_IOS)).click();
			test = extent.createTest("clickOn_Sobre_Nos inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Sobre_Nos inside Settings Started Executing.", ExtentColor.PINK));
			settingsPage.clickOnSobreNosIosFunction();
			System.out.println("Clicking on Sobre Nos of Settings ");
//			try {
//				WebDriverWait waittogetback = new WebDriverWait(this.iosDriver, 120);
//				waittogetback.until(ExpectedConditions
//						.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				test = extent.createTest("Getting back on Settings page from Sobre Nos");
				test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back on Settings page from Sobre Nos Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnBackButtonIosFunction();
				System.out.println("Getting back on Settings page from Sobre Nos");
//			} catch (Exception e) {
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		} catch (Exception e) {
//			System.err.println("Unable to click on clickOn_Sobre_Nos");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=34)
	public void clickOn_PoliticaDe_Privacidad() throws InterruptedException {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_POLITICA_DE_PRIVACIDAD_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_POLITICA_DE_PRIVACIDAD_IOS)).click();
			test = extent.createTest("clickOn_PoliticaDe_Privacidad inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_PoliticaDe_Privacidad inside Settings Started Executing.", ExtentColor.PINK));
			settingsPage.clickOnPoliticaDePrivacidadIosFunction();
			System.out.println("Clicking on Politica De Privacidad of Settings ");
//			try {
//				WebDriverWait waittogetback = new WebDriverWait(this.iosDriver, 120);
//				waittogetback.until(ExpectedConditions
//						.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)));
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
				Thread.sleep(5000);
				test = extent.createTest("Getting back on Settings page from Politica de Privacidad");
				test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back on Settings page from Politica de Privacidad Started Executing.", ExtentColor.PINK));
				settingsPage.clickOnBackButtonIosFunction();
				System.out.println("Getting back on Settings page from Politica de Privacidad");
//				this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//				test = extent.createTest("Getting back on Private Dashboard from Settings page");
//				test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back on Private Dashboard from Settings page Started Executing.", ExtentColor.PINK));
//				settingsPage.clickOnBackButtonIosFunction();
//				System.out.println("Getting back on Private Dashboard from Settings page");
//			} catch (Exception e) {
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		} catch (Exception e) {
//			System.err.println("Unable to click on clickOn_Sobre_Nos");
//			new TakeScreenshot(iosDriver);
//		}

	}
	@Test(priority=35)
	public void settings_click_LogOut(){
		test = extent.createTest("settings_click_LogOut inside Settings");
		test.log(Status.INFO, MarkupHelper.createLabel("verify settings_click_LogOut inside Settings Started Executing.", ExtentColor.PINK));
		settingsPage.clickOnSettingsLogOutIosFunction();
		System.out.println("Clicking on LogOut for Settings logout");
	
	}

}
