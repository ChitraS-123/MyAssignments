package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

    public static void main(String[] args) throws InterruptedException {
        
      
        WebDriver driver = new ChromeDriver();

        driver.get("http://leaftaps.com/opentaps/");

       
        driver.manage().window().maximize();

      
        driver.findElement(By.id("username")).sendKeys("democsr");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

       
        driver.findElement(By.linkText("CRM/SFA")).click();

      
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Fill form
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("OpenAI");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Chitra");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sahoo");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("C");

        driver.findElement(By.name("departmentName")).sendKeys("QA Department");
        driver.findElement(By.name("description")).sendKeys("This is a test lead creation.");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("chitra@hotmail.com");

     
        WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select select = new Select(stateDropdown);
        select.selectByVisibleText("New York");

      
        driver.findElement(By.className("smallSubmit")).click();

       
        driver.findElement(By.linkText("Edit")).click();

       
        WebElement description = driver.findElement(By.id("updateLeadForm_description"));
        description.clear();

       
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an important note after edit.");

       
        driver.findElement(By.className("smallSubmit")).click();

        
        String pageTitle = driver.getTitle();
        System.out.println("Page title after update: " + pageTitle);

       
        driver.quit();
    }
}
