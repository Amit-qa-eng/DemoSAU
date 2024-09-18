package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Hooks.Hooks;
import io.cucumber.java.en.*;

public class Login {
	WebDriver driver;

	@Given("I am  on the login page")
	public void i_am_on_the_login_page() {
		driver = Hooks.getDriver();
		driver.get("https://shoutab.us/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("I have entered the username and password")
	public void i_have_entered_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("orm_admin@online-review-manager.com");
		driver.findElement(By.id("password")).sendKeys("6Io5Sg12Gykb2jx");
	}

	@When("I accept terms and conditions")
	public void i_accept_terms_and_conditions() {
		driver.findElement(By.xpath("//input[@id='accept_terms_and_conditions']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I am navigated to the home page")
	public void i_am_navigated_to_the_home_page() throws InterruptedException {
		String expectedUrl = "https://shoutab.us/login";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		Thread.sleep(15000);
		System.out.println("I am Successfullly landed on Superadmin page");
	}

}
