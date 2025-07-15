package week2.day2;

public class ReverseString {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the string
        String companyName = "TestLeaf";

        // Step 2: Convert the string to a character array
        char[] charArray = companyName.toCharArray();

        // Step 3: Loop through the array from end to start
        System.out.print("Reversed String: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}