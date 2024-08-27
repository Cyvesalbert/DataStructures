package ht.dataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Using a Comparator object with method sort
public class Sort2 {

	public static void main( String[] args ){
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		// create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); // create list
		System.out.printf("unsorted array elements: %s\n", list);
		
		// sort in ascending order using a comparator
		Collections.sort(list, Collections.reverseOrder()); // sort arraylist
				
		// output list
		System.out.printf("sorted array elements: %s\n", list);
	}
	
}
