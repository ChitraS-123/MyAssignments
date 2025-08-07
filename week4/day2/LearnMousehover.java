package week4.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://www.pvrcinemas.com/");

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Step1: Create Object for Actions Class
		Actions act=new Actions(driver);
		
		//Step2: find the element
		WebElement mouseHoverEle = driver.findElement(By.xpath("//span[text()='More']"));
		
		//Step3: Use the method to complete th action
          act.moveToElement(mouseHoverEle).perform();
	}

}