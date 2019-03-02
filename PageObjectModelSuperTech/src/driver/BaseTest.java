package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
public static WebDriver driver;
@BeforeSuite
public void initialize() {
	//As we kept all the browser driver inside driver package("user.dir")
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+("\\src\\driver\\chromedriver.exe"));
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("file:///C:/WebSite/SuperTech.html");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	WebDriverWait wait =new WebDriverWait(driver,20);
	
			}
@AfterSuite
public void TearDown() {
	driver.quit();
}
}
