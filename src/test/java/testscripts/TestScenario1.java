package testscripts;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.BaseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario1 extends BaseClass{
	@Test
	void Test() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(inputformpage.getAllElements()));
        SoftAssert softAssert= new SoftAssert();
		String expectedValue = "LambdaTest";
		String PageTitle = driver.getTitle();
		softAssert.assertEquals(PageTitle,expectedValue,"Page title does not match.");
		System.out.println(PageTitle);
		softAssert.assertAll();	
	}
}
