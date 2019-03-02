package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuperTechIFramePage {
	//Create Constrator
WebDriver driver;
public SuperTechIFramePage(WebDriver driver) {
this.driver=driver;
}
@FindBy (how=How.NAME,using="LogInForm")WebElement Frame1;
@FindBy (how=How.NAME,using="first_name")WebElement Frm1FN;
@FindBy (how=How.NAME,using="last_name")WebElement Frm1LN;
@FindBy (how=How.NAME,using="pass")WebElement Frm1Pass;
@FindBy (how=How.NAME,using="email")WebElement Frm1EM;
@FindBy (how=How.NAME,using="phone")WebElement Frm1TlePhn;
@FindBy (how=How.NAME,using="comments")WebElement Frm1Cmnt;
@FindBy (how=How.XPATH,using="/html/body/center/form/table/tbody/tr[7]/td/input")WebElement Frm1Sbutton;
@FindBy (how=How.NAME,using="Selenium")WebElement Frame2;
@FindBy (how=How.NAME,using="ruet")WebElement Frame3;
//@FindBy (how=How.NAME,using="")WebElement a;

public void SwitchToLogInForm() {
	driver.switchTo().frame(Frame1);
}
public void SwitchToMainPage() {
	driver.switchTo().defaultContent();
}
public void SwitchToFrameSelenium() {
	driver.switchTo().frame(Frame2);
}
public void SwitchToFrameRuet() {
	driver.switchTo().frame(Frame3);
}
public void SetFirstNameInLogInForm(String LogInFN) {
	Frm1FN.sendKeys(LogInFN);
}
public void SetLastNameInLogInForm(String LogInLN) {
	Frm1LN.sendKeys(LogInLN);
}
public void SetPasswordInLogInForm(String LogInPw) {
	Frm1Pass.sendKeys(LogInPw);
}	
public void SetEmailInLogInForm(String LogInEm) {
	Frm1EM.sendKeys(LogInEm);
}
public void SetPhonNmbrInLogInForm(String LogInPhn) {
	Frm1TlePhn.sendKeys(LogInPhn);
}	
public void SetCommentInLogInForm(String LogInCmmnt) {
	Frm1Cmnt.sendKeys(LogInCmmnt);
}	
public void ClickSubButtonLogInForm() {
	Frm1Sbutton.click();
}
public void CountDrpDwnBoxFruitName() {
	List<WebElement> list1=driver.findElement(By.xpath("")).findElements(By.tagName(""));
	int totalFruit = list1.size()-1;
	System.out.println("Total Fruit Name: "+totalFruit);
	for (int i =1;i>totalFruit; i++) {
		System.out.println(list1.get(i).getText());
	}
}


}
