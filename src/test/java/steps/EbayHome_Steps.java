package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	
	WebDriver driver;

	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
		//System.out.println("Given pass");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawan\\eclipse-workspaceNew\\cucumber1\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}

	@When("I click on Advance Link")
	public void i_click_on_advance_link() {
		//System.out.println("when pass");
		driver.findElement(By.linkText("Advanced")).click();
		//driver.findElement(By.id("gh-as-a"));
	}

	@Then("I navigate to Advanced Search Page")
	public void i_navigate_to_advanced_search_page() {
		System.out.println("Then pass");
		String expUrl ="https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = driver.getCurrentUrl();
		if(!expUrl.equals(actUrl)) {
			fail("Page dose not navigate to expected page");
		  
	  }
	 driver.close();
	}
	@When("I search for iphone 11")
	public void i_search_for_iphone() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone11");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	    
	}
	@Then("I vlidate 1000 search item peresent")
	public void i_vlidate_search_item_peresent() {
	    String itemcount = driver.findElement(By.cssSelector("div[class='srp-controls__control srp-controls__count'] span:nth-child(1)")).getText();
	    
	    int itemcountInt = Integer.parseInt(itemcount);
	    if(itemcountInt <= 50) {
	    	fail("Less than 50 result shown");
	    }
	    driver.close();
	}
}

