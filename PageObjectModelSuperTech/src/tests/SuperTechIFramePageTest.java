package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import driver.BaseTest;
import pages.SuperTechIFramePage;

public class SuperTechIFramePageTest extends BaseTest {
@Test
public void IFrameHandling() throws InterruptedException {
	SuperTechIFramePage STIF=PageFactory.initElements(driver,SuperTechIFramePage.class);
	STIF.SwitchToLogInForm();
	STIF.SetFirstNameInLogInForm("Atiqur");
	STIF.SetLastNameInLogInForm("Rahman");
	STIF.SetPasswordInLogInForm("1234");
	STIF.SetEmailInLogInForm("atik@yahoo.com");
	STIF.SetPhonNmbrInLogInForm("3478132121");
	STIF.SwitchToMainPage();
	Thread.sleep(2000);
	STIF.SwitchToFrameRuet();
	Thread.sleep(3000);
	STIF.SwitchToLogInForm();
	Thread.sleep(3000);
	STIF.SwitchToMainPage();
}

	
}
