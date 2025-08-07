package week4.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://leafground.com/waits.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click the button
		driver.findElement(By.xpath("//span[text()='Click']")).click();

		// Check the element is displayed or not
		// Thread.sleep(10000);

		//
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		boolean displayed = until.isDisplayed();
		System.out.println(displayed);

		// boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		// System.out.println(displayed);

		// Click the button
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		Boolean until2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(until2);

	}

}
