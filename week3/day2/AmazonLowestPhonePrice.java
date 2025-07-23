package week3.day2;

	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class AmazonLowestPhonePrice {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        
      // Search for mobile phones
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        //  Locate all price elements
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        //  Extract text and convert to integers
        List<Integer> prices = new ArrayList<>();
        for (WebElement priceEl : priceElements) {
            try {
                String priceText = priceEl.getText().replace(",", "").trim();
                int price = Integer.parseInt(priceText);
                prices.add(price);
            } catch (NumberFormatException e) {
                // Skip elements that don't contain valid numbers
                continue;
            }
        }

        // Sort and retrieve lowest price
        Collections.sort(prices);
       if (!prices.isEmpty()) {
            System.out.println("Lowest phone price on Amazon: ₹" + prices.get(0));
       } else {
            System.out.println("No prices found.");
        }

      
       driver.quit();
    }
}