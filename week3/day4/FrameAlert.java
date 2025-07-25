package week3.day4;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.Alert;
	import java.time.Duration;

	public class FrameAlert {
	    public static void main(String[] args) {
	        
	        WebDriver driver = new ChromeDriver();

	        try {
	            
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

	            // Switch to the iframe containing the Try It button
	            driver.switchTo().frame("iframeResult");

	            // Click the "Try it" button
	            WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
	            tryItButton.click();

	            // Handle the prompt alert
	            Alert promptAlert = driver.switchTo().alert();
	            String name = "Chitra"; 
	            promptAlert.sendKeys(name);
	            promptAlert.accept(); 

	          
	            WebElement resultText = driver.findElement(By.id("demo"));
	            String actualText = resultText.getText();

	            if (actualText.contains(name)) {
	                System.out.println(" Alert accepted. Text verified: " + actualText);
	            } else if (actualText.contains("User cancelled the prompt.")) {
	                System.out.println(" Alert dismissed. Cancel message displayed: " + actualText);
	            } else {
	                System.out.println(" Unexpected output: " + actualText);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	         
	            driver.quit();
	        }
	    }
	}



