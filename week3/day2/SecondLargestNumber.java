package week3.day2;

//Find the second largest number from the given array
//Assignment Requirements: - Declare an array {3, 2, 11, 4, 6, 7}. - Pick the 2nd element from the last and print it.


	import java.util.*;

	public class SecondLargestNumber {
	    public static void main(String[] args) {
	        // Declare the array
	        Integer[] numbersArray = {3, 2, 11, 4, 6, 7};

	        // Convert array to List
	        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));

	        // Sort the list in ascending order
	        Collections.sort(numbersList);

	        // Get the second largest number (second last element)
	        int secondLargest = numbersList.get(numbersList.size() - 2);

	        //  Print the result
	        System.out.println("Second largest number: " + secondLargest);
	    }
	}


