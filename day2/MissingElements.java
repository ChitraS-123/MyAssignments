package week3.day2;


	import java.util.*;

	public class MissingElements {
	    public static void main(String[] args) {
	       
	        Integer[] array = {1, 2, 3, 4, 10, 6, 8};

	        // Convert array to List
	        List<Integer> numberList = new ArrayList<>(Arrays.asList(array));

	      
	        Collections.sort(numberList);

	        //  Find and print missing elements
	        System.out.println("Missing numbers in the sequence:");
	        for (int i = 0; i < numberList.size() - 1; i++) {
	            int current = numberList.get(i);
	            int next = numberList.get(i + 1);

	            // Check for gaps
	            if (next != current + 1) {
	                for (int missing = current + 1; missing < next; missing++) {
	                    System.out.println(missing);
	                }
	            }
	        }
	    }
	}


