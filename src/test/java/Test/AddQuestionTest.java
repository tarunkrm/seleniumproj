package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjects.NiyatQuestionPage;

public class AddQuestionTest extends Base{

	WebDriver driver;
	
	@Test
	public void addCatalogue() {
		NiyatQuestionPage niyat = new NiyatQuestionPage(driver);
		niyat.ITSID().sendKeys(prop.getProperty("itsid"));
		niyat.Password().sendKeys(prop.getProperty("password"));
		niyat.LOGIN().click();
		niyat.SuperAdmin().click();
		niyat.clickOnNiyatQuestionTab().click();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		driver=initializeDriver();
			driver.get(prop.getProperty("url"));
		System.out.println("URL launch");
			
	}
	
	@AfterTest
	public void browserclose() {
		System.out.println("Driver got closed");
		driver.close();
		driver.quit();
	
	}
}
