package week2.day3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAutomation {
    public static void main(String[] args) {
        //
        WebDriver driver = new ChromeDriver();

        
            driver.get("http://leaftaps.com/opentaps/");

            
            driver.manage().window().maximize();

           
            driver.findElement(By.id("username")).sendKeys("democsr");
            driver.findElement(By.id("password")).sendKeys("crmsfa");
            driver.findElement(By.className("decorativeSubmit")).click();

            
            driver.findElement(By.linkText("CRM/SFA")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
            driver.findElement(By.linkText("Leads")).click();


          
            driver.findElement(By.linkText("Leads")).click();
            driver.findElement(By.linkText("Create Lead")).click();


          
            driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
            driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chitra");
            driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sahoo");
            driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Analyst Lead");

            
            driver.findElement(By.className("smallSubmit")).click();

           
            driver.getTitle();
            System.out.println("Title Verified");
            driver.close();
        
            
        }
    }



	
