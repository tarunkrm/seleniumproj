package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import Resources.Base;
import pageobjects.AddcataloguePage;

public class AddCatalogueTest extends Base {
	Logger log;
	public WebDriver driver;
	
	
	@Test
	public void addcatalogue() throws IOException, InterruptedException {
		
	    AddcataloguePage loginpage = new AddcataloguePage (driver);
	    loginpage.ITSID().sendKeys(prop.getProperty("itsid"));
		log.debug("ITSID got entered");
		loginpage.Password().sendKeys(prop.getProperty("password"));
		loginpage.LOGIN().click();
		log.debug("Clicked on Login Button");
		loginpage.SuperAdmin().click();
		log.debug("Clicked on Super Admin");
	    //loginpage.CatalogueTab().click();
		log.debug("Catalogue tab clicked");
	    loginpage.addCatalogue().click();
	    log.debug("Add new Catalogue Button clicked");
	    loginpage.ItemTitle().sendKeys(prop.getProperty("title"));
	    log.debug("text Entered");
	    loginpage.Trophies().sendKeys(prop.getProperty("trophy"));
	    log.debug("Trophy count Entered");
	    loginpage.Description().sendKeys(prop.getProperty("description"));
	    log.debug("Description Entered");
	    loginpage.CatalogueStatus().click();
	    log.debug("Status Active");
	    loginpage.Submit().click();
	    log.debug("submit");
	    
	    
	
	}
		
		
		
 	
 @BeforeMethod
	
	public void openApplication() throws IOException {
	 System.out.println("Browser got Launched");
	 log = LogManager.getLogger(AddCatalogueTest.class.getName());
		driver = initializeDriver(); 
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
	}

	
	@AfterTest
	public void closure() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		log.debug("Browser got closed");
		
	}
	
	/*@DataProvider
	
	public Object[][]getLoginData(){
		Object[][] data = {{"12341234","test","Successful"},{"12343334","test","test","failure"}};
		return data;
	}*/
	

}
