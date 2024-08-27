package ht.dataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collections method sort
public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		// create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); // create list
		System.out.printf("unsorted array elements: %s\n", list);
		
		Collections.sort(list); // sort arraylist
		
		// output list
		System.out.printf("sorted array elements: %s\n", list);
	}

}
