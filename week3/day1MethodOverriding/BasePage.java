package week3.day1MethodOverriding;

public class BasePage {
	

	    public void findElement(String elementName) {
	        System.out.println("BasePage: Finding element " + elementName);
	    }

	    public void clickElement(String elementName) {
	        System.out.println("BasePage: Clicking element " + elementName);
	    }

	    public void enterText(String elementName, String text) {
	        System.out.println("BasePage: Entering '" + text + "' into element " + elementName);
	    }

	    public void performCommonTasks() {
	        System.out.println("BasePage: Performing common tasks...");
	        findElement("GenericElement");
	        clickElement("GenericButton");
	        enterText("GenericInput", "TestData");
	    }
	}



