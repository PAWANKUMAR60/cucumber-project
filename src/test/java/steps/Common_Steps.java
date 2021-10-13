package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {
	
	private WebDriver driver;
	@Before
	public void setUP() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawan\\eclipse-workspaceNew\\cucumber1\\webdrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	@After
	public void tesrDown() throws Exception {
		driver.quit();
		Thread.sleep(1000);
		
	}
	public WebDriver getDriver() {
		return driver;
		
	}

}
