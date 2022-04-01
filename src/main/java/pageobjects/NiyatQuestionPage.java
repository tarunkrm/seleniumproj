package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NiyatQuestionPage {
	
	WebDriver driver;
	
	public NiyatQuestionPage(WebDriver driver) {
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

	@FindBy(xpath="//li[9]/a")
	WebElement clickOnNiyatQuestionTab;
	
	@FindBy(xpath="//button[@class='add_department']")
	WebElement addnewQuestion;
	
	@FindBy(xpath="//input[@formcontrolname='questionenglish']")
	WebElement questionInEnglish;
	
	@FindBy(xpath="//input[@formcontrolname='questionarabic']")
	WebElement questioninarabic;
	
	@FindBy(xpath="//mat-select[@formcontrolname='niyatTypeId']")
	WebElement niyattype;
	
	@FindBy(xpath="//div/mat-option[3]")
	WebElement dropdown;
	
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
	
	public WebElement clickOnNiyatQuestionTab() {
		return clickOnNiyatQuestionTab;
		
	}
	
	public WebElement addnewQuestion() {
		return addnewQuestion;
	}
	
	public WebElement questionInEnglish() {
		return questionInEnglish;
		
	}
	public WebElement questioninarabic() {
		return questioninarabic;
		
	}
	public WebElement niyattype() {
		return niyattype;
	}
	public WebElement dropdown() {
		return dropdown;
}
}
