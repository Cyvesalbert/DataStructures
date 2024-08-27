package ht.dataStructures;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//HashSet used to remove duplicate values from array of strings.
public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create and display a list<String>
		String[] colors = { "red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange" };
		List<String> list  = Arrays.asList(colors);
		System.out.printf("List: %s\n", list);
		
		// eliminate duplicates then print the unique values
		printNonDuplicates(list);
	}

	
	// Create a set from a collection to eliminate duplicates
	private static void printNonDuplicates(Collection<String> values) {
		// create a hashset
		Set<String> set = new HashSet<String>(values);
		
		System.out.print("\nNon duplicates are : ");
		
		for(String value  : set) {
			System.out.printf("%s ", value);
			
		System.out.println();
		}
	}
}
