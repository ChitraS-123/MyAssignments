package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.Iterator;
import java.time.Duration;

public class IRCTCWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        
   
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load the IRCTC website
        driver.get("https://www.irctc.co.in/");
        
      //close the alert
      		driver.findElement(By.xpath("//button[text()='OK']")).click();
      		Thread.sleep(5000);

        // Store the parent window handle
        String parentWindow = driver.getWindowHandle();

        // Click on "FLIGHTS" link
        driver.findElement(By.linkText("FLIGHTS")).click();

        // Wait briefly for the new window to load
        Thread.sleep(3000); // Use WebDriverWait in real-world scenarios

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();

        String childWindow = null;

        // Identify the child window (flights)
        while (it.hasNext()) {
            String handle = it.next();
            if (!handle.equals(parentWindow)) {
                childWindow = handle;
            }
        }

        // Switch to the child window
        driver.switchTo().window(childWindow);

        // Capture and print the title of the new window
        System.out.println("Child window title: " + driver.getTitle());

        // Close only the parent window
        driver.switchTo().window(parentWindow);
        driver.close();

        // Switch back to child window 
        driver.switchTo().window(childWindow);
        
       

     
        driver.quit();
    }
}
