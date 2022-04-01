package Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.Base;

public class SecondTest extends Base {
	Logger log;
	public WebDriver driver;
	
	@Test
	public void Testtwo() throws IOException {
		
		log = LogManager.getLogger(SecondTest.class.getName());
		System.out.println("Browser Launch");
		driver = initializeDriver();
		log.debug("Browser got Launched");
		driver.get("https://www.google.co.in/");
		
	}

	@Test
	public void Login() {
		System.out.println("Login got Passed");
		
		//Assert.assertTrue(false);
	}
	
	
}
