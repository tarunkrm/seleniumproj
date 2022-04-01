package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDepartmentPage {
	
	WebDriver driver;
	
	public AddDepartmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	   @FindBy(xpath="//button[@type='button'][@class='add_department']")
	WebElement AddDepartmentButton;
   
   @FindBy(xpath="//input[@formcontrolname='departmentName']")
   WebElement AddDepartmentName;
   
   @FindBy(xpath="//input[@formcontrolname='description']")
   WebElement AddDescription;
   
   @FindBy(xpath="//input[@formcontrolname='emailId']")
   WebElement emailId;
   
   @FindBy(xpath=".//input[@formcontrolname='phoneNumber']")
   WebElement AddNumber;
   
   @FindBy(xpath="//mat-select[@formcontrolname='userStatus']")
   WebElement selectStatus;
   
   @FindBy(xpath="//div/mat-option[1]")
   WebElement StatusActive;
   
   @FindBy(xpath="//mat-select[@formcontrolname='umoorId']")
   WebElement SelectUmoor;
   
   @FindBy(xpath="//div[@role='listbox']/mat-option[2]")
   WebElement SelectedUmoor;
   
   @FindBy(xpath="//p[@class='imageuploadc']")
   WebElement ImageUpload;
   
   
   
	
   public WebElement AddDepartmentButton() {
	   return AddDepartmentButton;
   }
   
   public WebElement AddDepartmentName() {
	   return AddDepartmentName;
   }
   
   public WebElement AddDescription() {
	   return AddDescription;
   }
   
   public WebElement emailId() {
	   return emailId;
   }
   
   public WebElement AddNumber() {
	   return AddNumber;
   }
   
   public WebElement selectStatus() {
	   return selectStatus;
   }
   
   public WebElement StatusActive() {
	   return StatusActive;
   }
   
   public WebElement Selectumoor() {
	   return SelectUmoor;
   }
   
   public WebElement SelectedUmoor() {
	   return SelectedUmoor;
   }
   public WebElement ImageUpload() {
	   return ImageUpload;
   }
}
