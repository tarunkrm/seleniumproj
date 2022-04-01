package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Resources.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AddcataloguePage;

public class Login extends Base {
	WebDriver driver;
	AddcataloguePage loginpage;
	
	
	
	    @Given("^Open any Browser$")
	    public void open_any_browser() throws IOException  {
	        
	    driver = initializeDriver();
	    }
	 
	    @And("^Navigate to Login page$")
	    public void navigate_to_login_page() throws InterruptedException  {
	       
	    	driver.get(prop.getProperty("url"));
	    	 loginpage = new AddcataloguePage (driver);
	    	 Thread.sleep(3000);
	    }


	    @When("^User enters itsid as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	    public void user_enters_itsid_as_something_and_password_as_something_into_the_fields(String itsid, String password)  {
	    	 loginpage.ITSID().sendKeys(prop.getProperty("itsid"));
	    	 loginpage.Password().sendKeys(prop.getProperty("password"));
	    	
	    }


	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button()  {
	    	loginpage.LOGIN().click();
	    }

	    @And("^User clicks on Super Admin button$")
	    public void user_clicks_on_super_admin_button() {
	    	loginpage.SuperAdmin().click();
	    }

	    @Then("^Verify user is able to successfully login$")
	    public void verify_user_is_able_to_successfully_login()  {
	       
	    }
	    
	    @After
	    public void closeBrowser() {
	    	driver.close();
	    }

}
