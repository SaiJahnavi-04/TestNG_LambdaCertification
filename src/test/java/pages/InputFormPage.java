package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage {
	WebDriver driver;
	public InputFormPage(WebDriver sdriver) {
        this.driver= sdriver;
        PageFactory.initElements(sdriver, this);
    }
	
	@FindBy(xpath = "//*[@class='text-black text-size-14 hover:text-lambda-900 leading-relaxed']")   
	List<WebElement> AllElements;
	public List<WebElement> getAllElements() {
		return AllElements;
	}

}
