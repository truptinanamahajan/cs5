package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {
	WebDriver driver;
	@Given("user lanches IE browser And navigates to application url")
	public void user_lanches_IE_browser_And_navigates_to_application_url() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	}

	@When("User enter username as {string} in username field")
	public void user_enter_username_as_in_username_field(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("User enter password as {string} in password field")
	public void user_enter_password_as_in_password_field(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	}

	@When("click Signin")
	public void click_Signin() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("validates Login Success")
	public void validates_Login_Success() {
	   Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	}


}
