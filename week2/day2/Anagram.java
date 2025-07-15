package week2.day2;

import java.util.Arrays;
	
public class Anagram {
    public static void main(String[] args) {
        // Step 1: Define the input strings
        String text1 = "stops";
        String text2 = "potss";

        // Step 2: Check if lengths match
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
            return; // Exit the program
        }

        // Step 3: Convert both strings to character arrays
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();

        // Step 4: Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Step 5: Compare the sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
    }
}
	        
	    
	


