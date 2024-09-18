package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Hooks.Hooks;
import io.cucumber.java.en.*;

public class Home  {
	 WebDriver driver;
	@Given("I am on the login page of ShoutAboutUS")
	public void i_am_on_the_login_page_of_shout_about_us() {
		driver = Hooks.getDriver();
        driver.get("https://shoutab.us/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("I enter the username  and password")
	public void i_enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("orm_admin@online-review-manager.com");
	    driver.findElement(By.id("password")).sendKeys("6Io5Sg12Gykb2jx");
	}

	@And("I accept the terms and conditions")
	public void i_accept_the_terms_and_conditions() {
		driver.findElement(By.xpath("//input[@id='accept_terms_and_conditions']")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@And("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I should be navigated to the home page of SuperAdmin")
	public void i_should_be_navigated_to_the_home_page_of_super_admin() throws InterruptedException {
		 String expectedUrl="https://shoutab.us/login";
		 String actualUrl=driver.getCurrentUrl();
		 Assert.assertEquals(actualUrl, expectedUrl);
		 Thread.sleep(15000);
		 System.out.println("I am Successfullly landed on Superadmin page");
	}

	@And("I select the ResponseScribe option from the dropdown menu")
	public void i_select_the_response_scribe_option_from_the_dropdown_menu() {
		 driver.findElement(By.xpath("//span[@id='select2-companyss-container']")).click();
	        driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']//input[@class='select2-search__field']")).sendKeys("ResponseScribe - Agency");
	        driver.findElement(By.xpath("//li[text()='ResponseScribe - Agency']")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I should be navigated to the Welcome page Dashboard of Agency ResponseScribe")
	public void i_should_be_navigated_to_the_welcome_page_dashboard_of_agency_response_scribe() {
		String expectedUrl = "https://shoutab.us/new_welcome";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}


	
}
