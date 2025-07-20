package week2.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DeleteLead {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Setup explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("democsr");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();

        // Enter a phone number that returns a result
        driver.findElement(By.name("phoneNumber")).sendKeys("999-999-9999");

        // Click "Find Leads"
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        try {
            // Wait for and capture the first lead ID
            WebElement firstLead = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));

            String leadID = firstLead.getText();
            System.out.println("Captured Lead ID: " + leadID);

            firstLead.click();
            driver.findElement(By.linkText("Delete")).click();

            // Search by captured ID
            driver.findElement(By.linkText("Find Leads")).click();
            driver.findElement(By.name("id")).sendKeys(leadID);
            driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

            // Wait for and verify deletion message
            WebElement message = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.className("x-paging-info")));

            if (message.getText().equals("No records to display")) {
                System.out.println("Lead deleted successfully.");
            } else {
                System.out.println("Lead deletion failed.");
            }

        } catch (Exception e) {
            System.out.println("No results found or element not loaded. Try a different phone number.");
        }

        driver.quit();
    }
}
