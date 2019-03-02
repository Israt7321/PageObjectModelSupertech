package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import driver.BaseTest;
import pages.SuperTechHomePage;

public class SuperTechHomePageTest extends BaseTest {
	@Test(priority=1)
	public void SpTchHomePgTest1() throws InterruptedException {  //create a constractor of the class  
		SuperTechHomePage STMP=PageFactory.initElements(driver,SuperTechHomePage.class);
		STMP.GetTitle();
		STMP.GetText();
		STMP.CheckOperatingSystem();
		STMP.GetBrowserNameAndVersion();
		STMP.GetPageSource();
		STMP.ShowConfirmBoxAlertHandle();
		STMP.ShowAlertHandle();
		STMP.ShowPromptAlertHandle();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void SpTchHomePgTest2() throws InterruptedException {
		SuperTechHomePage STMP=PageFactory.initElements(driver,SuperTechHomePage.class);
		STMP.FirstNameTxtBox("Israt");
		STMP.LastNameTxtBox("Jahan");
		STMP.ClickSubmitButton();
		Thread.sleep(3000);
		STMP.SelectMainPageSex("Female");
		STMP.SelectFruitName("Apple");
		STMP.SelectMonthName("January");
		STMP.SelectDayName("Monday");
		Thread.sleep(3000); 
		STMP.ClickDoubleClickButton();
		STMP.ClickHideButton();
		STMP.ClickShowButton();
		Thread.sleep(3000);
		STMP.RememberUserNameChBox();
		STMP.RememberPasswordChBox();
		STMP.RememberUserPasswordChBox();
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void SpTchHomePgTest3() throws InterruptedException {
		SuperTechHomePage STMP=PageFactory.initElements(driver,SuperTechHomePage.class);
		STMP.FileUpload("");
		STMP.FileDownloadExcel();
		STMP.FileDownloadPdf();
		STMP.VedioOnAgile();
		STMP.VedioOnDailyStndUp();

	}
}
