package Marathon;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String element = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]")).getText();
		
		System.out.println("The text is "+ element + " "+text2);
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='filter-p_123']//li[@aria-labelledby='-title']//div"));
		
		System.out.println(elements.size());
		
		for (int i = 0; i < 2 && i <elements.size(); i++) {
			
			List<WebElement> elements1 = driver.findElements(By.xpath("//ul[@id='filter-p_123']//li[@aria-labelledby='-title']//div"));
			
			elements1.get(i).click();
			
			Thread.sleep(3000);
				
		
		}
		
        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        
        String element1 = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		
		String text3 = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]")).getText();
		
		System.out.println("The text is "+ element1 + " "+text3);
		
		WebElement element2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal']//span)[1]"));
		
		String text = element2.getText();
		
		System.out.println(text);
		
		String element3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		System.out.println(element3);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
	}

}