package arrays303;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		 String[] names = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
         
	        // Please implement a Binary search that will display what index
	        // Mary is at
		 int index = Arrays.binarySearch(names,"Mary");
		 System.out.println("Mary is at the index " +index);
	}

	}


