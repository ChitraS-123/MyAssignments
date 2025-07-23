package week3.day2;


	import java.util.*;

	public class ListIntersection {
	    public static void main(String[] args) {
	        // Original arrays
	        Integer[] array1 = {3, 2, 11, 4, 6, 7};
	        Integer[] array2 = {1, 2, 8, 4, 9, 7};

	        // Convert arrays to ArrayLists
	        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
	        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
	        
	        // Create a new list to store intersection
	        List<Integer> intersection = new ArrayList<>();

	        // Iterate and compare elements
	        for (Integer num : list1) {
	            if (list2.contains(num)) {
	                intersection.add(num);
	            }
	        }

	        // Print the intersecting values
	        System.out.println("Intersection of both lists: " + intersection);
	    }
	

	    }

