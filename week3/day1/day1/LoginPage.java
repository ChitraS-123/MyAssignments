package week3.day1;

public class LoginPage extends BasePage {

    @Override
    public void performCommonTasks() {
        System.out.println("LoginPage: Performing login-specific tasks...");
        findElement("Username");
        enterText("Username", " Chitra");
        findElement("Password");
        enterText("Password Field", "password123");
        clickElement("Login Button");
    }
}
