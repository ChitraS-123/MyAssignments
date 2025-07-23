package week3.day3;

import java.util.Set;
import java.util.LinkedHashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        String companyName = "google";

        // Create a LinkedHashSet to maintain insertion order
        Set<Character> uniqueChars = new LinkedHashSet<>();

        // Iterate through each character and add to the set
        for (char ch : companyName.toCharArray()) {
            uniqueChars.add(ch);
        }

        for (char ch : uniqueChars) {
            System.out.print(ch);
        }
    }
}