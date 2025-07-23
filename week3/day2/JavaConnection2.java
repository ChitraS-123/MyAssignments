package week3.day2;

public class JavaConnection2 {
	public class JavaConnection extends MySqlConnection {

	    @Override
	    public void connect() {
	        System.out.println("Connecting to MySQL database via JavaConnection...");
	    }

	    @Override
	    public void disconnect() {
	        System.out.println("Disconnecting from MySQL database...");
	    }

	    @Override
	    public void executeUpdate() {
	        System.out.println("Executing update on MySQL database...");
	    }

	    @Override
	    public void executeQuery() {
	        System.out.println("Executing query on MySQL database...");
	    }
	    
	}
}

	