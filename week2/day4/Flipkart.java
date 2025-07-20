package week2.day4;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	

	public class Flipkart {

		public static void main(String[] args) throws InterruptedException {
			
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Women's watches");
        searchBox.submit();

	
		Thread.sleep(5000);
		driver.close();
		}

	}


