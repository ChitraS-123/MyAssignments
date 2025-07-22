package week3.day1;

public class Reporter {
	

	    // Overloaded method 1: Two parameters
	    public void reportStep(String msg, String status) {
	        System.out.println("Message: " + msg);
	        System.out.println("Status: " + status);
	        System.out.println("Snapshot: Not required\n");
	    }

	    // Overloaded method 2: Three parameters (with snapshot flag)
	    public void reportStep(String msg, String status, boolean snap) {
	        System.out.println("Message: " + msg);
	        System.out.println("Status: " + status);
	        if (snap) {
	            System.out.println("Snapshot: Captured\n");
	        } else {
	            System.out.println("Snapshot: Not captured\n");
	        }
	    }

	    // Main method to test the overloaded methods
	    public static void main(String[] args) {
	        Reporter reporter = new Reporter();

	        // Call the method with 2 arguments
	        reporter.reportStep("Login functionality working", "PASS");

	        // Call the method with 3 arguments
	        reporter.reportStep("Logout functionality failed", "FAIL", true);
	    }
	}



