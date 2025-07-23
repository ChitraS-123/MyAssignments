package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//A web page that contains various buttons. Your task is to automate interactions with these buttons using Selenium
//WebDriver.
//Precondition:
//- Initialize the WebDriver (ChromeDriver).
//- Load the URL https://leafground.com/button.xhtml .
//- Maximize the browser window.
//Requirements:
//- Click on the button with the text ‘Click and Confirm title.’
//- Verify that the title of the page is ‘dashboard.’
//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
//- Find and print the position of the button with the text ‘Submit.’
//- Find and print the background color of the button with the text ‘Find the Save button color.’
//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
//- Close the browser window.
//Hints to Solve:
//- Use Selenium WebDriver methods such as navigate(), manage(), findElement(), getTitle(), isEnabled(),
//getLocation(), getCssValue(), getSize(), and close() to perform the required actions.
//- To go back to the previous page from the current page use navigate().back()

public class LeafgroundButtonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();

     
        Thread.sleep(2000);

        //  1. Click on the button with text ‘Click and Confirm title.’
        WebElement confirmTitleButton = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button"));
        confirmTitleButton.click();

        // 2. Verify that the title of the page is ‘dashboard’
        Thread.sleep(1000); // wait for navigation
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification passed: " + actualTitle);
        } else {
            System.out.println("Title verification failed. Found: " + actualTitle);
        }

        //  3. Navigate back
        driver.navigate().back();
        Thread.sleep(1000);

     // 4. Check if the button ‘Confirm if the button is disabled’ is disabled
        WebElement disabledButton = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']"));
        boolean isEnabled = disabledButton.isEnabled();
        System.out.println("Confirm if the button is disabled? " + isEnabled);


        //  5. Find and print the position of the ‘Submit’ button
        WebElement submitButton = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
      
        int x = submitButton.getLocation().getX();
        int y = submitButton.getLocation().getY();
        System.out.println("Submit button position - X: " + x + ", Y: " + y);

        //  6. Find and print the background color of the ‘Find the Save button color’ button
        WebElement saveColorButton = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
        String bgColor = saveColorButton.getCssValue("background-color");
        System.out.println("Save button background color: " + bgColor);

        //  7. Find and print the height and width of the ‘Find the height and width of this button’ button
        WebElement sizeButton = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button"));
        int height = sizeButton.getSize().getHeight();
        int width = sizeButton.getSize().getWidth();
        System.out.println("Button size - Height: " + height + ", Width: " + width);

     
        driver.close();
    }
}