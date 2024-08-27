package ht.dataStructures;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

//Using SortedSets and TreeSets.
public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create treeset from array colors
		String[] colors = { "yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green" };
		SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colors));
		
		
		System.out.print("sorted set: ");
		printSet(tree); // output content of tree
		
		// get headset based on orange
		System.out.print("headset (\"orange\"): ");
		printSet(tree.headSet("orange"));
		
		// get tailset based upon orange
		System.out.print("tailset (\"orange\"): ");
		printSet(tree.tailSet("orange"));
		
		// get first and last elements
		System.out.printf("first: %s\n", tree.first());
		System.out.printf("last: %s\n", tree.last());
		
	
	}
	
	// output sortedset using enhanced for statement
	private static void printSet(SortedSet<String> set) {
		for(String s : set)
			System.out.printf("%s ", s);
		
		System.out.println();
	}

}
