package run;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import readers.Config;
import utils.WebDriverFactory;

public class Hooks {
	
	WebDriverFactory wdf = new WebDriverFactory();
	
	@Before("@GoogleChrome")
	public void setGoogleChromeDriver() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", Config.getProperty("driver"));
		wdf.setNavegador(new ChromeDriver());
	}
	
	@After
	public void finalizaDrivers() {
		
		wdf.quitDriver();
	}

}
