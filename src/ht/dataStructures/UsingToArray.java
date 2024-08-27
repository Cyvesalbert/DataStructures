package ht.dataStructures;

import java.util.Arrays;
import java.util.LinkedList;

//Viewing arrays as Lists and converting Lists to arrays.
public class UsingToArray {
	
	// create a linked list, adds elements and converts to array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors =  { "black", "blue", "yellow" };
		
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
		
		links.addLast("red"); // add as last item
		links.add("pink"); // add to the end
		links.add(3, "green"); // add at 3rd index
		links.addFirst("cyan"); // add as first item
		
		// get linkedList elements as an array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");

		for(String color : colors)
			System.out.println(color);
		
	}

}
