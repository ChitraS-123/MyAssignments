package steps;


	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.edge.EdgeDriver;

     import io.cucumber.java.en.*;
	import org.testng.Assert;

	public class SalesforceLoginStepDefination {
		public EdgeDriver driver;
	
	@Given("Launch the browser")
	public void launchBrowser() {
	    System.setProperty("webdriver.edge.driver", "C:\\Webdriver\\edgedriver_win64\\msedgedriver.exe");
	    driver = new EdgeDriver(); // assign to the class-level driver
	}

	    @Given("I launch the Salesforce login page")
	    public void launchLoginPage() {
	        
	        driver.get("https://login.salesforce.com");
	        driver.manage().window().maximize();
	    }

	    @When("I log in with valid credentials")
	    public void loginToSalesforce() {
	        driver.findElement(By.id("username")).sendKeys("sahchi8-tqfp@force.com");
	        driver.findElement(By.id("password")).sendKeys("1abcdefg");
	        driver.findElement(By.id("Login")).click();
	    }

	    @When("I click the toggle menu button")
	    public void clickToggleMenu() {
	        driver.findElement(By.cssSelector("button.slds-button")).click();
	    }

	    @When("I click view All and select Sales from App Launcher")
	    public void selectSalesApp() {
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    }

	    @When("I click on the Accounts tab")
	    public void clickAccountsTab() {
	        driver.findElement(By.xpath("//a[@title='Accounts']")).click();
	    }

	    @When("I click on the New button")
	    public void clickNewButton() {
	        driver.findElement(By.xpath("//div[@title='New']")).click();
	    }

	    @When("I enter {string} as account name")
	    public void enterAccountName(String name) {
	        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	    }

	    @When("I select Ownership as Public")
	    public void selectOwnership() {
	        WebElement dropdown = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
	        dropdown.click();
	        driver.findElement(By.xpath("//span[text()='Public']")).click();
	    }

	    @Then("I click save and verify the Account name")
	    public void saveAndVerify() {
	        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	        WebElement accountName = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']"));
	        Assert.assertTrue(accountName.getText().contains("Chitra"));
	        driver.quit();
	    }
	}

