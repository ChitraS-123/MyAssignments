package week2.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAutomation {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();;
		
		//Load URL
		driver.get( "https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("tuna@321");
		//Click on the Login button
		driver.findElement(By.className("Login")).click();

	}

}
