package ht.dataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Lists, LinkedLists and ListIterators
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// add colors elements to list1
		String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
		List<String> list1 = new LinkedList<String>();
		
		for(String color : colors)
			list1.add(color);
		
		// add colors2 elements to list2
		String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
		List<String> list2 = new LinkedList<String>();
		
		for(String color : colors2)
			list2.add(color);
		
		list1.addAll(list2); // concatenate lists
		list2 = null; // release ressources
		printList(list1); // print list1 elements
		
		convertToUpperCaseStrings(list1); // convert to upper case String
		printList(list1); // print list1 elements
		
		System.out.print("\ndeleting elements 4 to 6....");
		removeItems(list1, 4, 7); // remove items 4-6 from list
		printList(list1); // print list1 elements
		printReversedList(list1); // print list in reverse order
		
	
	}
	
	// output list contents
	private static void printList(List<String> list) {
		System.out.println("\nList: ");
		
		for(String color : list)
			System.out.printf("%s ", color);
		
		System.out.println();
	}
	
	// locate String objects and convert to uppercase
	private static void convertToUpperCaseStrings(List<String> list) {
		ListIterator<String > iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String color = iterator.next(); // get next item
			iterator.set(color.toUpperCase()); // convert to upper case
		} 
	}
	
	// obtain sublist and use clear method to delete sublist items
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear(); // remove items
	}
	
	// print reversed list
	private static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.println("\nReversed list: ");
		
		// print list in reversed order
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
}
