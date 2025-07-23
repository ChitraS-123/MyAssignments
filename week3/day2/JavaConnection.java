package week3.day2;


	
	public class JavaConnection implements DatabaseConnection {

	    @Override
	    public void connect() {
	        System.out.println("Connecting to the database...");
	    }

	    @Override
	    public void disconnect() {
	        System.out.println("Disconnecting from the database...");
	    }

	    @Override
	    public void executeUpdate() {
	        System.out.println("Executing update query on the database...");
	    }

	    // Main method to test your implementation
	    public static void main(String[] args) {
	        JavaConnection db = new JavaConnection();
	        db.connect();
	        db.executeUpdate();
	        db.disconnect();
	    }
	}


