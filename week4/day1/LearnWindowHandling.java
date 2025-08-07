package week4.day1;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://leafground.com/window.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click Open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		// To get the address of current window
		String parentAddress = driver.getWindowHandle();
		System.out.println(parentAddress);
	
         // Step1:
		// To get addresses of all the opened window
		Set<String> allAddres = driver.getWindowHandles();
		System.out.println(allAddres);
		
        // Step2: Convert the Set into list
		List<String> address = new ArrayList<String>(allAddres);
		String string = address.get(1);

		String titleBefore = driver.getTitle();
		System.out.println(titleBefore);

		// step3:
		// Transfer the focus
		driver.switchTo().window(string);

		String titleAfter = driver.getTitle();
		System.out.println(titleAfter);

		// close
		driver.close();
		// driver.quit();

		driver.switchTo().window(address.get(0));

		String title = driver.getTitle();
		System.out.println(title);

	}

}
