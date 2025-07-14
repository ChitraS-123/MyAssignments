package week2.day1;

public class Library {

	// Method to add a book
    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    // Method to issue a book
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    // Main method to test methods within the same class
    public static void main(String[] args) {
        Library lib = new Library(); // Object creation
        String title = lib.addBook(" Pride and Prejudice"); // Call addBook
        System.out.println("Book Title: " + title); // Optional print
        lib.issueBook(); // Call issueBook
    }
}



