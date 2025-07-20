package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");

         driver.manage().window().maximize();
         WebElement username = driver.findElement(By.id("username"));
         username.sendKeys("democsr");

         WebElement password = driver.findElement(By.id("password"));
         password.sendKeys("crmsfa");

         
         WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
         loginBtn.click();

         WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
         crmSfaLink.click();
         WebElement accountsTab = driver.findElement(By.linkText("Accounts"));
         accountsTab.click();

         // Click "Create Account"
         WebElement createAccountBtn = driver.findElement(By.linkText("Create Account"));
         createAccountBtn.click();
         
         WebElement accountName = driver.findElement(By.id("accountName"));
         accountName.sendKeys("Chitra Sahoo");
         
         WebElement description = driver.findElement(By.name("description"));
         description.sendKeys("Selenium Automation Tester");
         
         WebElement siteName = driver.findElement(By.id("officeSiteName"));
         siteName.sendKeys("LeafTaps");
         
         WebElement numberOfEmployees = driver.findElement(By.id("numberEmployees"));
         numberOfEmployees.sendKeys("12");
         
         WebElement createBtn = driver.findElement(By.className("smallSubmit"));
         createBtn.click();
         
      
    
         driver.getTitle();
         System.out.println("Title Verified");
     }
 
}
         
		
	
	
	
