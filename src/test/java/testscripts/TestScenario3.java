package testscripts;

import testbase.BaseClass;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestScenario3 extends BaseClass{
	@Test
	public void Test() throws InterruptedException {
		javascriptalertspage.getJavaScriptAlertLink().click();
		Thread.sleep(2000);
		javascriptalertspage.getJavaScriptAlertClickMe().click();
		Thread.sleep(2000);
		Alert Alert = driver.switchTo().alert();
		String AlertMsg = Alert.getText();
		if(AlertMsg.equals("I am an alert box!")) {
			System.out.println("Alert Message is Correct: "+AlertMsg);
		}
		else {
			System.out.println("Alert Message is not Correct");
		}
		Thread.sleep(2000);
		Alert.accept();
	}
}
