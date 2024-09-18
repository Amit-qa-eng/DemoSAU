package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Hooks.Hooks;
import io.cucumber.java.en.*;

public class Agency  {
	WebDriver driver;

@When("I click on the manage account link")
public void i_click_on_the_manage_account_link() {
	driver = Hooks.getDriver();
	driver.findElement(By.xpath("//div[@class='panel panel-primary']//i[@class='fa fa-arrow-circle-right']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}

@Then("I should be navigated to the Account Management page")
public void i_should_be_navigated_to_the_account_management_page() {
	  String actualAccountManagement = driver.findElement(By.xpath("//div[@class='col-md-12']//h2[text()='Account Management']")).getText();
		
			String expectedAccountManagement = "Account Management";
			Assert.assertEquals(actualAccountManagement, expectedAccountManagement );
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 System.out.println("I am successfully landed on Account Management page ");
			
}

@When("I click on the Manage Location link")
public void i_click_on_the_manage_location_link() {
	driver = Hooks.getDriver();
	driver.findElement(By.xpath("//div[@class='panel panel-green']//a[@href='https://shoutab.us/locations']//i[@class='fa fa-arrow-circle-right']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("I should be navigated to the Location Management page")
public void i_should_be_navigated_to_the_location_management_page() {
	String  actualLocationManagemnt=driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/h2[text()='Location Management']")).getText();
    String expectedLocationManagemnt="Location Management";
    Assert.assertEquals(actualLocationManagemnt, expectedLocationManagemnt);
    System.out.println("I am successfully landed on Location Management page ");
   
}

@When("I click on the Manage Users link")
public void i_click_on_the_manage_users_link() {
	driver = Hooks.getDriver();
	driver.findElement(By.xpath("//a[@href='https://shoutab.us/usermanagement']//span[@class='pull-right']/i[@class='fa fa-arrow-circle-right']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("I should be navigated to the User Management page")
public void i_should_be_navigated_to_the_user_management_page() {
	
	String actualUserManagemnt =driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-12']//h2[text()='User Management']")).getText();
	String expectedUserManagemnt= "User Management";
	Assert.assertEquals(actualUserManagemnt, expectedUserManagemnt);
	 System.out.println("I am successfully landed on User Management page ");
	
}

@When("I click on the Manage Account2 link")
public void i_click_on_the_manage_account2_link() {
	driver = Hooks.getDriver();
	driver.findElement(By.xpath("//div[@class='panel panel-green']//a[@href='https://shoutab.us/accounts']//i[@class='fa fa-arrow-circle-right']")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("I should be navigated to the Account Management page again")
public void i_should_be_navigated_to_the_account_management_page_again() {
	String actualAccountManagemnt2=driver.findElement(By.xpath("//div[@class='col-md-12']//h2[text()='Account Management']")).getText();
    String  expectedAccountManagemnt2="Account Management";
    Assert.assertEquals(actualAccountManagemnt2, expectedAccountManagemnt2);
    System.out.println("I am successfully landed on Account  Management page again ");
   
}

@When("I click on click here of addNewAccount link")
public void i_click_on_click_here_of_add_new_account_link() {
	driver = Hooks.getDriver();
	driver.findElement(By.xpath("//a[@href='https://shoutab.us/accounts/create_brand']/i[@class='fa fa-suitcase']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("I should be navigated to the Create ResponseScribe Account page")
public void i_should_be_navigated_to_the_create_response_scribe_account_page() {
	 String  actualCreateResponceAccount= driver.findElement(By.xpath("//h2[text()='Create ResponseScribe Account']")).getText();
     String expectedCreateResponceAccount ="Create ResponseScribe Account";
     Assert.assertEquals(actualCreateResponceAccount, expectedCreateResponceAccount );
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     System.out.println("I am successfully landed on Create ResponsiveScribe Account page ");
   
}

@When("I click on click here of addAgency link")
public void i_click_on_click_here_of_add_agency_link() {
	driver = Hooks.getDriver();
	driver.findElement(By.xpath("//a[@href='https://shoutab.us/accounts/create_agency']/i[@class='fa fa-suitcase']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("I should be navigated to the Create Agency Account page")
public void i_should_be_navigated_to_the_create_agency_account_page() {
	 String actualCreateAgencyAccount = driver.findElement(By.xpath("//div[@class='col-md-12']/div[@class='col-md-9 col-sm-12']")).getText();
     String expectedCreateAgencyAccount= "Create Agency Account";
     Assert.assertEquals(actualCreateAgencyAccount, expectedCreateAgencyAccount);
     System.out.println("I am successfully landed on Create Agency Account page ");
  }
}

