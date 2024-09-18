package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import Hooks.Hooks;
import io.cucumber.java.en.*;

public class Agency_Reporting  {
	WebDriver driver;

@When("I click on Agency Reporting button")
public void i_click_on_agency_reporting_button() {
	driver = Hooks.getDriver();
	 driver.findElement(By.xpath("//a[@href='https://shoutab.us/agency_reporting']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("i should be navigated to the Agency reporting page")
public void i_should_be_navigated_to_the_agency_reporting_page() {
	String actualAgencyReporting = driver.findElement(By.xpath("//div[@class='col-md-12']/h2[text()='Agency Reporting']")).getText();
    String expectedAgencyReporting = "Agency Reporting";      
    Assert.assertEquals(actualAgencyReporting, expectedAgencyReporting);
    System.out.println("I am successfully landed on Agency Reporting page ");
   
}
}
