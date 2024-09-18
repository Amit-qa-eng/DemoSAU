package Hooks;



import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	 private static WebDriver driver;
	   // private static Set<Cookie> cookies;
	    @Before
	    public void setUp() {
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://uat.ereduscri.org/");
	            

	    }
	    public static WebDriver getDriver() {
	        return driver;
	    }
	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit(); // Quit the driver and close all associated windows
	        }
	    }
}
