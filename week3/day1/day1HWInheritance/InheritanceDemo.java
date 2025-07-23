package week3.day1HWInheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Object of subclass
        LoginTestData loginData = new LoginTestData();

        // Call methods
        loginData.enterCredentials();       // Overridden method with super
        loginData.navigateToHomePage();     // Inherited directly
        loginData.enterUsername();          // Subclass method
        loginData.enterPassword();          // Subclass method
    }
}

