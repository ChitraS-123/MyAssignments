package week2.day1;

public class Browser {

	public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }

    // Method to load the application URL
    public void loadUrl() {
        System.out.println("Application url loaded successfully");
    }

    // Main method to create object and call methods
    public static void main(String[] args) {
        Browser browser = new Browser(); // Object creation
        String name = browser.launchBrowser("Chrome"); // Call launchBrowser
        System.out.println("Browser name: " + name); // Optional: print returned name
        browser.loadUrl(); // Call loadUrl
    }

}
