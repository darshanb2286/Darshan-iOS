package fmuTestExtent;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.moofwd.base.TestBase;
import com.moofwd.pages.AcademicoPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Academico extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		academicoPage = new AcademicoPage(iosDriver);
	}

	@Test(priority=5)
	public void click_On_Academico(){
//		try{
			System.out.println("click_On_Academico ::"+iosDriver);
//			academicoPage = new AcademicoPage(iosDriver);
			academicoPage.clickOnAcademicoIosFunction();
			System.out.println("Clicking on Academico i.e.Courses");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Academico");
//			new TakeScreenshot(iosDriver);
//		}
	}	
	@Test(priority=6)
	public void click_On_Disciplinas() throws InterruptedException{
//		try{
		Thread.sleep(5000);
//		academicoPage = new AcademicoPage(this.iosDriver);
		System.out.println("touchAction :: "+iosDriver);
//		TouchAction touchAction = new TouchAction(iosDriver);
		academicoPage.clickOnDisciplinasIosFunction();
		//touchAction.press(108,278).perform();
//		touchAction.tap(PointOption.point(108,278)).perform();
//		TouchAction(iosDriver).tap(108, 278, 1).perform();
//		TouchAction action= new TouchAction(iosDriver);
//		action.tap(PointOption.point(108, 278)).release().perform();
//		System.out.println("touchAction "+ action);
		
//		new TouchAction(iosDriver).tap(point(108, 278)).perform();
//		TouchAction touchAction =new TouchAction(iosDriver)
//	    .tap(point(x,y))
//	    .waitAction(waitOptions(Duration.ofMillis(250))).perform();
		System.out.println("Clicking on Disciplinas");
//		}catch(Exception e){
//			System.err.println("Unable to click on click_On_Disciplinas");
//			new TakeScreenshot(iosDriver);
//		}
	}

	@Test(priority=7)
	public void click_On_OneofDisciplinas(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnOneOfDisciplinasIos));
			academicoPage.clickOnOneOfDisciplinasIosFunction();
//			academicoPage.clickOnOneOfDisciplinasIos.click();
			System.out.println("Clicking On One of the Disciplinas from the list");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneofDisciplinas");
//			new TakeScreenshot(iosDriver);
//			academicoPage.clickonBackButtonIosFunction();
//		}
	}
	@Test(priority=8)
	public void click_On_Tarefas() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnTarefasIos));
			academicoPage.clickOnTarefasIosFunction();
//			academicoPage.clickOnTarefasIos.click();
			System.out.println("Clicking on Tarefas inside the Disciplinas");
//			try{
				Thread.sleep(5000);
//				WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//				waitforbackbutton.until(ExpectedConditions.elementToBeClickable(academicoPage.clickonBackButtonIos));
//				academicoPage.clickonBackButtonIos.click();
				academicoPage.clickonBackButtonIosFunction();
				System.out.println("Clicking on Back button of Tarefas Page");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Tarefas");
//			new TakeScreenshot(iosDriver);
//		}

	}
	@Test(priority=9)
	public void click_On_Participants(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnParticipanteIos));
//			academicoPage.clickOnParticipanteIos.click();
			academicoPage.clickOnParticipanteIosFunction();
			System.out.println("Clicking on Participants inside Disciplinas");
//			try{
//				WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//				waitforbackbutton.until(ExpectedConditions.elementToBeClickable(academicoPage.clickonBackButtonIos));
//				academicoPage.clickonBackButtonIos.click();
				academicoPage.clickonBackButtonIosFunction();
				System.out.println("Clicking on Back button of Participants Page");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Participants");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=10)
	public void click_On_Arquivos(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnArquivosIos));
//			academicoPage.clickOnArquivosIos.click();
			academicoPage.clickOnArquivosIosFunction();
			System.out.println("Clicking on Arquivos inside Disciplinas");
//			try{
//				WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//				waitforbackbutton.until(ExpectedConditions.elementToBeClickable(academicoPage.clickonBackButtonIos));
//				academicoPage.clickonBackButtonIos.click();
				academicoPage.clickonBackButtonIosFunction();
				System.out.println("Clicking on Back button of Arquivos inside Diciplinas");
//				academicoPage.clickonBackButtonIos.click();
				academicoPage.clickonBackButtonIosFunction();
				System.out.println("Clicking on Back button of Detail Disciplinas i.e. Courses inside Disciplinas");
//				academicoPage.clickOnArquivosIos.click();
				academicoPage.clickonBackButtonIosFunction();
				System.out.println("Clicking on Back button of List of Disciplinas");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button");
//				new TakeScreenshot(iosDriver);
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Arquivos");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=11)
	public void click_On_Notas_Courses() throws InterruptedException{
//		try{
		Thread.sleep(5000);
		TouchAction touchAction = new TouchAction(this.iosDriver);
		touchAction.tap(PointOption.point(184, 278)).perform();
		System.out.println("Clicking on Notas inside Disciplinas");
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnNotasCoursesIos));
//			academicoPage.clickOnNotasCoursesIos.click();
			academicoPage.clickOnNotasCoursesIosFunction();
			System.out.println("Clicking on one of the Notas inside Disciplinas");
//			academicoPage.clickonBackButtonIos.click();
			academicoPage.clickonBackButtonIosFunction();
			System.out.println("Clicking on Back button of Notas Page");
//			academicoPage.clickonBackButtonIos.click();
			academicoPage.clickonBackButtonIosFunction();
			System.out.println("Clicking on Back button of Disciplinas Page");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneofDisciplinas");
//			new TakeScreenshot(iosDriver);
////			academicoPage.clickonBackButtonIos.click();
//			academicoPage.clickonBackButtonIosFunction();
//			System.out.println("As there is no element in the list getting back on Private dashboard");
//		}
//		}catch(Exception e){
//			System.err.println("Unable to click on click_On_Disciplinas");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=12)
	public void click_On_OneofNotas(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnOneofNotasCoursesIos));
//			academicoPage.clickOnOneofNotasCoursesIos.click();
			academicoPage.clickOnOneofNotasCoursesIosFunction();
			System.out.println("Clicking on One of the Notas from the list");
			academicoPage.clickonBackButtonIosFunction();
			academicoPage.clickonBackButtonIosFunction();
//			academicoPage.clickonBackButtonIos.click();
//			academicoPage.clickonBackButtonIos.click();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneofDisciplinas");
//			new TakeScreenshot(iosDriver);
////			academicoPage.clickonBackButtonIos.click();
//			academicoPage.clickonBackButtonIosFunction();
//		}
	}
	@Test(priority=13)
	public void click_On_Historica_Courses() throws InterruptedException{
//		try{
		Thread.sleep(5000);
		TouchAction touchAction = new TouchAction(this.iosDriver);
		touchAction.tap(PointOption.point(269, 278)).perform();
//		try{
//			WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//			waitforbackbutton.until(ExpectedConditions.elementToBeClickable(academicoPage.clickonBackButtonIos));
//			academicoPage.clickonBackButtonIos.click();
			academicoPage.clickonBackButtonIosFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on back button");
//			Thread.sleep(3000);
//			new TakeScreenshot(iosDriver);
//		}
//		}catch(Exception e){
//			System.err.println("Unable to click on click_On_Historica_Courses");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=14)
	public void click_On_Aulas_Courses() throws InterruptedException{
//		try{
		Thread.sleep(5000);
		TouchAction touchAction = new TouchAction(this.iosDriver);
		touchAction.tap(PointOption.point(108, 348)).perform();
//		try{
//			WebDriverWait waitforbackbutton = new WebDriverWait(this.iosDriver,120);
//			waitforbackbutton.until(ExpectedConditions.elementToBeClickable(academicoPage.clickonBackButtonIos));
//			academicoPage.clickonBackButtonIos.click();
			academicoPage.clickonBackButtonIosFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on back button");
//			new TakeScreenshot(iosDriver);
//		}
//		}catch(Exception e){
//			System.err.println("Unable to click on click_On_Disciplinas");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=15)
	public void click_On_Faltas_Courses() throws InterruptedException{
//		try{
		Thread.sleep(5000);
		TouchAction touchAction = new TouchAction(this.iosDriver);
		touchAction.tap(PointOption.point(184, 348)).perform();
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 120);
//			wait.until(ExpectedConditions.elementToBeClickable(academicoPage.clickOnOneOfFaltasCoursesIos));
//			academicoPage.clickOnOneOfFaltasCoursesIos.click();
			academicoPage.clickOnOneOfFaltasCoursesIosFunction();
			Thread.sleep(5000);
//			academicoPage.clickonBackButtonIos.click();
			academicoPage.clickonBackButtonIosFunction();
			Thread.sleep(5000);
//			academicoPage.clickonBackButtonIos.click();
			academicoPage.clickonBackButtonIosFunction();
			academicoPage.clickOnOutsidePopupCoursesIosFunction();
//			academicoPage.clickOnOutsidePopupCoursesIos.click();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneofDisciplinas");
//			new TakeScreenshot(iosDriver);
//			academicoPage.clickonBackButtonIosFunction();
////			academicoPage.clickonBackButtonIos.click();
//		}
//		}catch(Exception e){
//			System.err.println("Unable to click on click_On_Disciplinas");
//			new TakeScreenshot(iosDriver);
//		}

	}

}
