package week4.day2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AmazonAutomation {
    public static void main(String[] args) throws IOException, InterruptedException {
       
        WebDriver driver = new ChromeDriver();

       
            // Precondition Setup
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.amazon.in/");

            Actions actions = new Actions(driver);

            //  Search for "oneplus 9 pro"
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            actions.moveToElement(searchBox).click().sendKeys("oneplus 9 pro").sendKeys(Keys.ENTER).perform();

            //  Get the price of the first product
            WebElement firstPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
            System.out.println("Price of first product: ₹" + firstPrice.getText());

            //  Print the number of customer ratings for the first product
            WebElement rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
            System.out.println("Number of customer ratings: " + rating.getText());

            //  Click the first text link of the first image
            WebElement firstLink = driver.findElement(By.linkText("VIVO X200 FE 5G (Amber Yellow, 12GB RAM, 256GB Storage) with No Cost EMI/Additional Exchange Offers"));
            actions.moveToElement(firstLink).click().perform();
            System.out.println(firstLink);
            
            String parentWindow = driver.getWindowHandle();
            Set<String> handles = driver.getWindowHandles();
            for (String handle : handles) {
                if (!handle.equals(parentWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            // Wait for product title to load
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));

            //  Take a screenshot of the product page
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("product_screenshot.png"));
            System.out.println("Screenshot taken: product_screenshot.png");
            
            WebElement addToCart = driver.findElement(By.id("a-autoid-1-announce"));
            addToCart.click();
            
            WebElement cart = driver.findElement(By.id("nav-cart"));
            cart.click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement subtotal = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'sc-subtotal')]/span[@id='sc-subtotal-amount-buybox']/span")
            ));

            System.out.println("Subtotal: " + subtotal.getText());
            
           

            driver.quit();
        }
    
            
        }
    
   


