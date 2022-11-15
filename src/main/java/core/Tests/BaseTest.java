
package core.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
	public WebDriver driver;
	public HomePage homePage;
	public static final String testDataExcelFileName = "TestCases.xlsx";

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void classLevelSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void methodLevelSetup() {
		homePage = new HomePage(driver);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
