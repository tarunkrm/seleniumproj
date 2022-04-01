package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcataloguePage {
	WebDriver driver;
	
	public AddcataloguePage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver,this);
			
	}
	
    @FindBy(xpath="//input[@type='search']")
    WebElement ITSID;
    
    @FindBy(xpath="//input[@type='password']")
    WebElement Password;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement LOGIN;
    
    @FindBy(xpath="//li[text()=' Super Admin ']")
    WebElement SuperAdmin;
    
    @FindBy(xpath="//li[5]/a")
	WebElement CatalogueTab;
	
	
	@FindBy(xpath="//button[@class='add_department']")
	WebElement addCatalogue;
	
	@FindBy(xpath="//input[@formcontrolname='itemTitle']")
	WebElement ItemTitle;
	
	@FindBy(xpath="//input[@formcontrolname='trophies']")
	WebElement Trophies;
	
	@FindBy(xpath="//input[@formcontrolname='description']")
	WebElement Description;
	
	@FindBy(xpath="//mat-select[@formcontrolname='status']")
	WebElement CatalogueStatus;
	
	@FindBy(xpath="//button[@class='submit_button']")
	WebElement Submit;
	
    public WebElement ITSID() {
    	return ITSID;
    	
    }
    
    public WebElement Password() {
    	return Password;
    }
    
    public WebElement LOGIN() {
    	return LOGIN;
    	
    }
    public WebElement SuperAdmin() {
    	return SuperAdmin;
    }
    
    public WebElement CatalogueTab() {
  	  return CatalogueTab;
    }

    public WebElement addCatalogue() {
  	  return addCatalogue;
    }
    
    public WebElement ItemTitle() {
  	  return ItemTitle;
    }
    
    public WebElement Trophies() {
  	  return Trophies;
    }
    
    public WebElement Description() {
  	  return Description;
    }
    
    public WebElement CatalogueStatus() {
  	  return CatalogueStatus;
    }
      
    public WebElement Submit() {
  	  return Submit;
    }
}




