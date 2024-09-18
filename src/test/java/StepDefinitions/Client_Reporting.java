package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Hooks.Hooks;
import io.cucumber.java.en.*;

public class Client_Reporting  {
WebDriver driver;
	@When("I click on Client Reporting button")
	public void i_click_on_client_reporting_button() {
		driver = Hooks.getDriver();
		 driver.findElement(By.xpath("//a[@href='https://shoutab.us/client_reporting']")).click();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("I should be navigated to the clinet reporting page")
	public void i_should_be_navigated_to_the_clinet_reporting_page() {
		String actualClientReporting = driver.findElement(By.xpath("//div[@class='col-md-12']/h2[text()='Client Reporting']")).getText();
	    String expectedClientReporting = "Client Reporting";      
	    Assert.assertEquals(actualClientReporting, expectedClientReporting);
	    System.out.println("I am successfully landed on Client Reporting page ");
	    
	}
	
	
}
