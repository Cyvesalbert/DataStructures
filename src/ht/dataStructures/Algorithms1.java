package ht.dataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collections methods reverse, fill, copy, max and min.
public class Algorithms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create  and display a List<Character>
		Character[] letters = {'P', 'C', 'M'};
		List<Character> list = Arrays.asList(letters); // get List
		System.out.println("List contains: ");
		output(list);
		
		// reverse and display the List<Character>
		Collections.reverse(list); // reverse order the elements
		System.out.println("\nAfter calling reverse, list contains");
		output(list);
		
		// Create copyList from an array of 3 characters
		Character[] lettersCopy = new Character[3];
		List<Character> copyList = Arrays.asList(lettersCopy);
		
		// copy the contents of list into copyList
		Collections.copy(copyList, list);
		System.out.println("\nafter copying, copylist contains: ");
		output(copyList);
		
		// fill list with Rs
		Collections.fill(list, 'R');
		System.out.println("\nafter calling fill, list contains: ");
		output(list);
				
	}
	
	// output list information
	private static void output(List<Character> listRef) {
		System.out.print("The list is: ");
		
		for(Character element : listRef)
			System.out.printf("%s ", element);
		
		System.out.printf( "\nMax: %s", Collections.max( listRef ));
		System.out.printf( " Min: %s\n", Collections.min( listRef ));
		
	}

}
