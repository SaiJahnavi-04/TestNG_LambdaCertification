package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPage {
	WebDriver driver;
	public JavaScriptAlertsPage (WebDriver sdriver) {
        this.driver= sdriver;
        PageFactory.initElements(sdriver, this);
    }
	
	@FindBy(xpath = "//*[contains(text(),'Javascript Alerts')]")   
	WebElement JavaScriptAlertLink;
	public WebElement getJavaScriptAlertLink() {
		return JavaScriptAlertLink;
	}
	
	@FindBy(xpath = "//*[@class='btn btn-dark my-30 mx-10 hover:bg-lambda-900 hover:border-lambda-900']")   
	WebElement JavaScriptAlertClickMe;
	public WebElement getJavaScriptAlertClickMe() {
		return JavaScriptAlertClickMe;
	}
	
	

}
