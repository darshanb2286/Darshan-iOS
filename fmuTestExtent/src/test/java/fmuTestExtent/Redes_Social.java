package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.SocialPageFactory;

public class Redes_Social extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		socialPage = new SocialPageFactory(iosDriver);
	}
	@Test(priority=24)
	public void clickOn_redes_social(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_IOS)).click();
			test = extent.createTest("clickOn_redes_social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_redes_social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnResdesSocialIosFunction();
			System.out.println("Clicking on Redes Social");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_redes_social");
//			new TakeScreenshot(iosDriver);
//		}
	
	}
	@Test(priority=25)
	public void Social_Icons() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_FACEBOOK_IOS)));
//			System.out.println("Click on Facebook");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_FACEBOOK_IOS)).click();
			test = extent.createTest("Clicking on Facebook inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Facebook inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnResdesSocialFacebookIosFunction();
			System.out.println("Clicking on Facebook inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Clicking on back button for Facebook inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button for Facebook inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button for Twitter inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_TWITTER_IOS)).click();
			test = extent.createTest("Clicking on Twitter inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Twitter inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnResdesSocialTwitterIosFunction();
			System.out.println("Clicking on Twitter inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Clicking on back button for Twitter inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button for Twitter inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button for Twitter inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_YOUTUBE_IOS)).click();
			test = extent.createTest("Clicking on Youtube inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Youtube inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnResdesSocialYouTubeIosFunction();
			System.out.println("Clicking on Youtube inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Clicking on back button for Youtube inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button for Youtube inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button for Youtube inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_INSTAGRAM_IOS)).click();
			test = extent.createTest("Clicking on Instagram inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Instagram inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnResdesSocialInstagramIosFunction();
			System.out.println("Clicking on Instagram inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Clicking on back button for Instagram inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button for Instagram inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button for LinkedIn inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_LINKEDIN_IOS)).click();
			test = extent.createTest("Clicking on LinkedIn inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on LinkedIn inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnResdesSocialLinkedInIosFunction();
			System.out.println("Clicking on LinkedIn inside Redes Social");
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Clicking on back button for LinkedIn inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button for LinkedIn inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button for LinkedIn inside Redes Social");
			Thread.sleep(5000);
//			iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("To navigate back to Private dashboard from social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify To navigate back to Private dashboard from social Started Executing.", ExtentColor.BROWN));
			socialPage.clickOnBackButtonIosFunction();
			System.out.println("To navigate back to Private dashboard from social");

//		}
//		catch(Exception e){
//			System.err.println("Unable to click on Social_Icons");
//			new TakeScreenshot(iosDriver);
//		}		
	}

}
