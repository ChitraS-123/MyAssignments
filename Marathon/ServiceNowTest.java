package Marathon;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.sukgu.Shadow;

public class ServiceNowTest {

    private static ChromeDriver driver;
    private static Shadow shadow;

    public static void main(String[] args) throws IOException, InterruptedException {
        driver = new ChromeDriver();
    
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://dev209663.service-now.com/");

            login("admin", "qy/Q6A=vOM3x");
            navigateToServiceCatalog();

            switchToMainFrame();

            placeMobileOrder();

            takeScreenshot("./Data/orderstatus.png");

       }
    

    //  Login method
    private static void login(String username, String password) {
        System.out.println(" Logging in...");
        driver.findElement(By.id("user_name")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.id("sysverb_login")).click();
        System.out.println(" Login successful.");
    }

    //  Navigate to Service Catalog using Shadow DOM
    private static void navigateToServiceCatalog() throws InterruptedException {
        System.out.println(" Navigating to Service Catalog...");
        shadow = new Shadow(driver);
        shadow.setImplicitWait(30);

        clickShadowElement("//div[text()='All']");
        clickShadowElement("//span[text()='Service Catalog']");
        System.out.println(" Service Catalog opened.");
    }
    

    //  Helper to click Shadow DOM element with wait
    private static void clickShadowElement(String xpath) throws InterruptedException {
        WebElement element = shadow.findElementByXPath(xpath);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000); 
        element.click();
    }

    //  Switch to main iframe
    private static void switchToMainFrame() {
        WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frame);
    }

    // Place mobile order
    private static void placeMobileOrder() {
        System.out.println(" Placing mobile order...");
        driver.findElement(By.linkText("Mobiles")).click();
        driver.findElement(By.linkText("Apple iPhone 13 pro")).click();
        driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
        driver.findElement(By.id("IO:4afecf4e9747011021983d1e6253af34")).sendKeys("99");

        WebElement dataDropdown = driver.findElement(By.id("IO:ff1f478e9747011021983d1e6253af68"));
        new Select(dataDropdown).selectByVisibleText("Unlimited [add $4.00]");

        driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click(); // Sierra Blue
        driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click(); // 512GB

        driver.findElement(By.id("oi_order_now_button")).click();

        WebElement confirmationMsg = driver.findElement(By.xpath("(//div[@class='notification notification-success'])//span[2]"));
        String msg = confirmationMsg.getText();
        System.out.println(" Confirmation: " + msg);

        if (msg.toLowerCase().contains("your request") && msg.toLowerCase().contains("submitted")) {
            System.out.println(" Order successfully placed.");
        } else {
            System.out.println(" Order not placed.");
        }

        WebElement reqElement = driver.findElement(By.xpath("//a[@id='requesturl']/b"));
        String requestNumber = reqElement.getText();
        System.out.println(" Request Number: " + requestNumber);
    }

    //  Screenshot method
    private static void takeScreenshot(String path) throws IOException {
        File source = driver.getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        FileUtils.copyFile(source, destination);
        System.out.println(" Screenshot saved to: " + path);
    }
}