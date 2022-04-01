package Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.Base;
import pageobjects.AddcataloguePage;

public class LoginTest extends Base {
		public WebDriver driver;
		Logger log;
		
		@Test
		public void login() throws IOException, InterruptedException {
			
		    AddcataloguePage loginpage = new AddcataloguePage (driver);
		    loginpage.ITSID().sendKeys(prop.getProperty("itsid"));
			//log.debug("ITSID got entered");
			loginpage.Password().sendKeys(prop.getProperty("password"));
			loginpage.LOGIN().click();
			Thread.sleep(3000);
			loginpage.SuperAdmin().click();
		//	log.debug("Clicked on Super Admin");	
	}
		
		
		 @BeforeMethod
			
			public void openApplication() throws IOException {
			 System.out.println("Browser got Launched");
			// Logger log = LogManager.getLogger(AddCatalogueTest.class.getName());
				driver = initializeDriver(); 
				//log.debug("Browser got launched");
				driver.get(prop.getProperty("url"));
				//log.debug("Navigated to application URL");
			}
		 
		 
		 @AfterTest
			public void closure() throws InterruptedException {
				Thread.sleep(5000);
				driver.close();
				//log.debug("Browser got closed");
		 
		 }
		 
		 
}
