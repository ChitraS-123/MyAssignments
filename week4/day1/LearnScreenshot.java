package week4.day1;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		WebElement usernameField = driver.findElement(By.id("username"));

		// Step1: Taking the Screenshot
		File source = usernameField.getScreenshotAs(OutputType.FILE);

		// Step2: Setup the destination
		File destination = new File("./Data/usernamefield.png");

		// Step3: Store the screenshot file in the destination
		FileUtils.copyFile(source, destination);

	}

}