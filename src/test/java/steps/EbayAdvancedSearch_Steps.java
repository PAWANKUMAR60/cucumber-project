package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
	WebDriver driver;
	@Given("I am on Ebay Advanced Search Page")
	public void i_am_on_ebay_advanced_search_page() {
		System.out.println("Given pass");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawan\\eclipse-workspaceNew\\cucumber1\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
	}
	@When("I Click on Ebay logo")
	public void i_click_on_ebay_logo() {
		System.out.println("When pass");
		//driver.findElement(By.id("gh-logo")).click();
		//driver.findElement(By.cssSelector("#gh-logo")).click();
		driver.findElement(By.xpath("//a[@id='gh-la']")).click();
	}
	@Then("I am navigated to Ebay Home Page")
	public void i_am_navigated_to_ebay_home_page() {
	 System.out.println("Then pass");
	 String expUrl = "https://www.ebay.com/";
	 String actUrl = driver.getCurrentUrl();
	 if(!expUrl.equals(actUrl)) {
		 fail("Page dose not navigate to Home Page");
		 
	 }
	 driver.close();
	}

}
