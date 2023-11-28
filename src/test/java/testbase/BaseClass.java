package testbase;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pages.CheckBoxDemoPage;
import pages.InputFormPage;
import pages.JavaScriptAlertsPage;

public class BaseClass {
	public WebDriver driver;
	public InputFormPage inputformpage;
	public CheckBoxDemoPage checkboxdemopage;
	public JavaScriptAlertsPage javascriptalertspage;

	@Parameters({"Browser", "Url"})
	@BeforeClass
	public void setUp(String Browser, String Url) throws IOException {

		if(Browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("88.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "saijahnavithummala");
			ltOptions.put("accessKey", "d9wR3G0utBwPB4Xqgmj75OlWJFICMZIQkmHv78UMT0v6TjEzRL");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "TestNG");
			ltOptions.put("project", "TestNg");
			ltOptions.put("selenium_version", "4.0.0");
			ltOptions.put("w3c", true);

			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
			driver.manage().window().maximize();
			driver.get(Url);
		}
		if(Browser.equalsIgnoreCase("Edge")) {
			EdgeOptions browserOptions = new EdgeOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("87.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "saijahnavithummala");
			ltOptions.put("accessKey", "d9wR3G0utBwPB4Xqgmj75OlWJFICMZIQkmHv78UMT0v6TjEzRL");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "TestNG");
			ltOptions.put("project", "TestNg");
			ltOptions.put("selenium_version", "4.0.0");
			ltOptions.put("w3c", true);


			browserOptions.setCapability("LT:Options", ltOptions);
			driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
			driver.manage().window().maximize();
			driver.get(Url);
		}
		
	if(Browser.equalsIgnoreCase("FireFox")) {
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Windows 7");
		browserOptions.setBrowserVersion("82.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "saijahnavithummala");
		ltOptions.put("accessKey", "d9wR3G0utBwPB4Xqgmj75OlWJFICMZIQkmHv78UMT0v6TjEzRL");
		ltOptions.put("visual", true);
		ltOptions.put("video", true);
		ltOptions.put("network", true);
		ltOptions.put("build", "TestNG");
		ltOptions.put("project", "TestNg");
		ltOptions.put("selenium_version", "4.0.0");
		ltOptions.put("w3c", true);


		browserOptions.setCapability("LT:Options", ltOptions);
		driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);;
		driver.manage().window().maximize();
		driver.get(Url);
	}
	
if(Browser.equalsIgnoreCase("InternetExplorer")) {
	InternetExplorerOptions browserOptions = new InternetExplorerOptions();
	browserOptions.setPlatformName("Windows 10");
	browserOptions.setBrowserVersion("11.0");
	HashMap<String, Object> ltOptions = new HashMap<String, Object>();
	ltOptions.put("username", "saijahnavithummala");
	ltOptions.put("accessKey", "d9wR3G0utBwPB4Xqgmj75OlWJFICMZIQkmHv78UMT0v6TjEzRL");
	ltOptions.put("visual", true);
	ltOptions.put("video", true);
	ltOptions.put("network", true);
	ltOptions.put("build", "TestNG");
	ltOptions.put("project", "TestNg");
	ltOptions.put("selenium_version", "4.0.0");
	ltOptions.put("w3c", true);


	browserOptions.setCapability("LT:Options", ltOptions);
	driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
	driver.manage().window().maximize();
	driver.get(Url);
}

inputformpage = new InputFormPage(driver);
checkboxdemopage = new CheckBoxDemoPage(driver);
javascriptalertspage = new JavaScriptAlertsPage(driver);
}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
