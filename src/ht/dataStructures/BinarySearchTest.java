package ht.dataStructures;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//Collections method binarySearch
public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create ArrayList<String from the contents of colors array
		String[] colors = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };
		List< String > list = new ArrayList< String >( Arrays.asList( colors ) );
		
		Collections.sort(list); // sort the ArrayList
		System.out.printf("sorted ArrayList: %s\n", list);
		
		// search list for various values
		printSearchResults(list, colors[3]); // first item
		printSearchResults(list, colors[0]); // middle item
		printSearchResults(list, colors[7]); // last item
		printSearchResults(list, "agua"); // below lowest
		printSearchResults(list, "gray"); // does not exist
		printSearchResults(list, "teal"); // does not exist
		
	
	}
	
	// perform search and display result
	private static void printSearchResults(List<String> list, String key) {
		int result = 0;
		
		System.out.printf("\nSearching for: %s\n", key);
		result = Collections.binarySearch(list, key);
		
		if(result >= 0) {
			System.out.printf("Found at index %d\n", result);
		}else {
			System.out.printf("Not found (%d)\n", result);
		}
	}

}
