package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SuperTechHomePage{

	WebDriver driver;
	public SuperTechHomePage(WebDriver driver) { //create a constractor
		this.driver=driver;
	}
	@FindBy (how =How.XPATH,using ="//*[@id=\"linkForm\"]/header/marquee/font")WebElement GtText;
	@FindBy (how=How.ID, using ="btnConfirm")WebElement ShConBoxAlert;
	@FindBy (how=How.ID, using ="btnAlert")WebElement ShAlert;
	@FindBy (how=How.ID, using ="btnPrompt")WebElement ShPrmptAlert;
	@FindBy (how=How.NAME,using ="firstname")WebElement FNameTxBox;
	@FindBy (how=How.NAME,using ="lastname")WebElement LNameTxBox;
	@FindBy (how=How.XPATH,using ="//*[@id=\"form2\"]/input[3]")WebElement SubButton;
	@FindBy (how=How.NAME, using ="item0[]")WebElement RmbrUsrNameChkBox;
	@FindBy (how=How.NAME, using ="item1[]")WebElement RmbrPassChBox;
	@FindBy (how=How.NAME, using ="item2")WebElement RmbrUsrPassChBox;
	@FindBy (how=How.NAME, using ="sex")WebElement SxMale;
	@FindBy (how=How.NAME, using ="sex")WebElement SxFemale;
	@FindBy (how=How.NAME, using ="sex")WebElement SxNone;
	@FindBy (how=How.XPATH, using ="//*[@id=\"form5\"]/select[1]")WebElement DpDwnFruit;
	@FindBy (how=How.XPATH, using ="//*[@id=\"form5\"]/select[2]")WebElement DpDwnMonth;
	@FindBy (how=How.XPATH, using ="//*[@id=\"form5\"]/select[3]")WebElement DpDwnDay;
	@FindBy (how=How.XPATH, using ="//*[@id=\"fullbody\"]/button[1]")WebElement DblClick;
	@FindBy (how=How.ID, using ="hide")WebElement Hide;
	@FindBy (how=How.ID, using ="show")WebElement Show;
	@FindBy (how=How.ID, using="recaptcha_response_field")WebElement RCapcha;
	@FindBy (how=How.NAME, using ="fileField")WebElement FileUp;
	@FindBy (how=How.XPATH, using ="//*[@id=\"fullbody\"]/div[4]/form[2]/a[1]")WebElement FileDwnExl;
	@FindBy (how=How.XPATH, using ="//*[@id=\"fullbody\"]/div[4]/form[2]/a[2]")WebElement FileDwnPdf;
	@FindBy (how=How.XPATH, using ="@FindBy (how=How.NAME, using =\"\")WebElement")WebElement VdAgile;
	@FindBy (how=How.XPATH, using ="//*[@id=\"fullbody\"]/div[5]/video[2]")WebElement VdDlyStandUp ;

	public void GetTitle() {
		String title =driver.getTitle();
		System.out.println("Title is :"+title);
	}
	public void GetText() {
		String txt = GtText.getText();		
		System.out.println("Text is :"+txt);
	}
	public void GetPageSource() {
		String PgSrc=driver.getPageSource();
		System.out.println("Page source is: "+PgSrc);
	}
	public void GetBrowserNameAndVersion() {
		Capabilities cap =((RemoteWebDriver)driver).getCapabilities();
	String BrwName=cap.getBrowserName().toUpperCase();
	System.out.println("BrowserName is :"+BrwName);
	String BrwVrsn=cap.getVersion().toString();
	System.out.println("Browser version Is :"+ BrwVrsn);
	}
	public void CheckOperatingSystem() {
		String OS =System.getProperty("os.name").toUpperCase();
		System.out.println("Operating system is :"+OS);
	}
	public void ShowConfirmBoxAlertHandle() {
		ShConBoxAlert.click();
		Alert alt1= driver.switchTo().alert(); 
		alt1.accept();
	}
	public void ShowAlertHandle() {
		ShAlert.click();
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
	}
	public void ShowPromptAlertHandle() {
		ShPrmptAlert.click();
		Alert alt3 = driver.switchTo().alert();
		alt3.accept();
	}
	public void FirstNameTxtBox(String MainFN) {
		FNameTxBox.sendKeys(MainFN);
	}
	public void LastNameTxtBox(String MainLN) {
		LNameTxBox.sendKeys(MainLN);
	}
	public void ClickSubmitButton() {
		SubButton.click();
	}
	public void RememberUserNameChBox() {
		RmbrUsrNameChkBox.click();
	}
	public void RememberPasswordChBox() {
		RmbrPassChBox.click();
	}
	public void RememberUserPasswordChBox() {
		RmbrUsrPassChBox.click();
	}
	public void SelectMainPageSex(String MainPgSex ) {
		if(MainPgSex.equalsIgnoreCase("Male")) {
			SxMale.click();
		}
		else if (MainPgSex.equalsIgnoreCase("Female")) {
			SxFemale.click();
		}
		else if (MainPgSex.equalsIgnoreCase("None")){
			SxNone.click();
		}
	}


	public void SelectFruitName(String FruitNm) {
		Select Fselect =new Select(DpDwnFruit);
		Fselect.selectByVisibleText(FruitNm);
	}
	public void SelectMonthName(String MnthNm ) {
		Select MnthSelect = new Select(DpDwnMonth);
		MnthSelect.selectByVisibleText(MnthNm);
	}
	public void SelectDayName(String DayNm) {
		Select DySelect = new Select(DpDwnDay);
		DySelect.selectByVisibleText(DayNm);
	}
	public void ClickDoubleClickButton() {
		Actions actDbl= new Actions (driver);
		actDbl.doubleClick(DblClick).build().perform();
	}
	public void ClickHideButton() {
		Hide.click();
	}
	public void ClickShowButton() {
		Show.click();
	}
	public void ReCapchaHandling() {
		
	}
	public void FileUpload(String PathOfFile) {
		FileUp.sendKeys(PathOfFile);
	}
	public void FileDownloadExcel() {
		FileDwnExl.click();
	}
	public void FileDownloadPdf() {
		FileDwnPdf.click();
	}
	public void VedioOnAgile() {
		VdAgile.click();// On
		VdAgile.click();//Off
	}
	public void VedioOnDailyStndUp() {
		VdDlyStandUp.click();//On
		VdDlyStandUp.click();//Off
}
}
