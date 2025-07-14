package week2.day1;

public class LibraryManagement {
	

	    public static void main(String[] args) {
	        Library lib = new Library(); // Object of Library class
	        String title = lib.addBook(" The Lord of the Rings");
	        System.out.println("Book Title: " + title); 
	        lib.issueBook();
	    }
	}


