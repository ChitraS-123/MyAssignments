package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {

	@Given("Launch the Browser")
	public void launch_the_browser() {
	   System.setProperty("webdriver.edge.driver", "C:\\Webdriver\\edgedriver_win64\\msedgedriver.exe");
	   
       driver = new EdgeDriver();
}
    
	@And("Load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	
	@And("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
		System.out.println("Login successful");
	}

	@But("It should error message")
	public void it_should_error_message() {
		System.out.println("It throws the error message");
	}

}
