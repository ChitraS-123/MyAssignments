package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		// Launch the Browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url - get
				driver.get("https://jqueryui.com/droppable/");

				// Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.switchTo().frame(0);
				
				
				Actions act=new Actions(driver);
				
				//Source
				WebElement sourceEle = driver.findElement(By.id("draggable"));
				
				//Target
				WebElement targetEle = driver.findElement(By.id("droppable"));
				
				act.dragAndDrop(sourceEle, targetEle).perform();

	}

}