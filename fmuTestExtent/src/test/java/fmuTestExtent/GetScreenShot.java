package fmuTestExtent;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;

public class GetScreenShot {
	public static String capture( AppiumDriver<IOSElement> iosDriver, String screenShotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) iosDriver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenShotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
//		String dest = System.getProperty("user.dir") + "/ErrorScreenshots/" + screenShotName + ".png";
//		File destination = new File(dest);
//		FileUtils.copyFile(source, destination);
		return destination;
	}
}
