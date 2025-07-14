package week2.day1;

import java.util.Arrays;

public class PrintDuplicates {

	
		public static void main(String[] args) {
			int[] numbers= {2,5,7,7,5,9,2,3};
			// Sort the array
	        Arrays.sort(numbers);

	        System.out.println("Duplicate values:");

	        // Loop to find duplicates
	        for (int i = 0; i < numbers.length - 1; i++) {
	            if (numbers[i] == numbers[i + 1]) {
	                System.out.println(numbers[i]);
	                // Skip next same value to avoid duplicate printing
	                while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
	                    i++;
	                }
	            }
	        }
	    }

	}

