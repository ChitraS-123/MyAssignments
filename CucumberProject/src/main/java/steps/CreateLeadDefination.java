package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class CreateLeadDefination extends BaseClass {
	
	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click on the Leads Link")
	public void click_on_the_leads_link() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads"))).click();

		//driver.findElement(By.xpath("//div[@id='ext-gen607']//a[contains(text(),'Lead')]")).click();
		driver.findElement(By.partialLinkText("Leads")).click();


		//driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click on the CreateLead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the companyname as (.*)$")
	public void enter_the_companyname_as_test_leaf(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@And("Enter the firstname as (.*)$")
	public void enter_the_firstname_as_Chitra(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_S(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@When("Click on the CreateLead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	    System.out.println("CreateLead successful");
	}

}
