package week3.day1MethodOverriding;

public class Main {
	    public static void main(String[] args) {
	        System.out.println("----Using BasePage----");
	        BasePage base = new BasePage();
	        base.performCommonTasks();

	        System.out.println("\n----Using LoginPage----");
	        LoginPage login = new LoginPage();
	        login.performCommonTasks();
	    }
	}


