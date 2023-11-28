package testscripts;

import org.testng.annotations.Test;
import testbase.BaseClass;

public class TestScenario2 extends BaseClass{
	@Test
	void Test() throws InterruptedException {
		//Step1
		checkboxdemopage.getCheckBoxDemo().click();
		Thread.sleep(2000);
		
		//step2
		checkboxdemopage.getSingleCheckBoxDemo().click();
		Thread.sleep(2000);
		
		//step3
		if(checkboxdemopage.getSingleCheckBoxDemo().isSelected()) {
			System.out.println("Single CheckBox Demo is Selected");
		}
		else {
			System.out.println("Single CheckBox Demo is not Selected");
		}
		
		//step4
		checkboxdemopage.getSingleCheckBoxDemo().click();
		if(checkboxdemopage.getSingleCheckBoxDemo().isSelected()) {
			System.out.println("Single CheckBox Demo is not Unselected");
		}
		else {
			System.out.println("Single CheckBox Demo is Unselected");
		}
	}
}
