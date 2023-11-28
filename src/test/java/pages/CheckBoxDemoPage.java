package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxDemoPage {
	WebDriver driver;
	public CheckBoxDemoPage (WebDriver sdriver) {
        this.driver= sdriver;
        PageFactory.initElements(sdriver, this);
    }
	
	@FindBy(xpath = "//*[contains(text(),'Checkbox Demo')]")   
	WebElement CheckBoxDemo;
	public WebElement getCheckBoxDemo() {
		return CheckBoxDemo;
	}
	
	@FindBy(xpath = "//input[@id='isAgeSelected']")   
	WebElement SingleCheckBoxDemo;
	public WebElement getSingleCheckBoxDemo() {
		return SingleCheckBoxDemo;
	}
}
