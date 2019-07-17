package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AcademicoPage {

	AppiumDriver<IOSElement> iosDriver;
	public AcademicoPage(AppiumDriver<IOSElement> iosDriver){
		this.iosDriver=iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
		
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash comunication btn']")
	public IOSElement clickOnAcademicoIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Academico\"]/XCUIElementTypeButton[@name=\"Disciplinas\"]")
	public IOSElement clickOnDisciplinasIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneOfDisciplinasIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickonBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Course assignments icon']")
	public IOSElement clickOnTarefasIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Course participants icon']")
	public IOSElement clickOnParticipanteIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Course files icon']")
	public IOSElement clickOnArquivosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnNotasCoursesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneofNotasCoursesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneOfFaltasCoursesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeImage[@name='dash_logo']")
	public IOSElement clickOnOutsidePopupCoursesIos;
	
	public void clickOnAcademicoIosFunction(){
		System.out.println("clickOnAcademicoIosFunction ::");
		clickOnAcademicoIos.click();
	}
	public void clickOnOneOfDisciplinasIosFunction(){
		clickOnOneOfDisciplinasIos.click();
	}
	public void clickonBackButtonIosFunction(){
		clickonBackButtonIos.click();
	}
	public void clickOnTarefasIosFunction(){
		clickOnTarefasIos.click();
	}
	public void clickOnParticipanteIosFunction(){
		clickOnParticipanteIos.click();
	}
	public void clickOnArquivosIosFunction(){
		clickOnArquivosIos.click();
	}
	public void clickOnNotasCoursesIosFunction(){
		clickOnNotasCoursesIos.click();
	}
	public void clickOnOneofNotasCoursesIosFunction(){
		clickOnOneofNotasCoursesIos.click();
	}
	public void clickOnOneOfFaltasCoursesIosFunction(){
		clickOnOneOfFaltasCoursesIos.click();
	}
	public void clickOnOutsidePopupCoursesIosFunction(){
		clickOnOutsidePopupCoursesIos.click();
	}
	public void clickOnDisciplinasIosFunction(){
		System.out.println("clickOnDisciplinasIos");
		clickOnDisciplinasIos.click();
	}

}
