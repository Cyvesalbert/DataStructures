package ht.dataStructures;

import java.util.ArrayList;

//Totaling the numbers in an ArrayList<Number>.
public class TotalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create, initialize and output ArrayList of Numbers containing
		// both Integers and Doubles, then display total of the elements
		Number[] numbers = {1, 2.4, 3, 4.1}; // integers and doubles
		ArrayList<Number> numberList = new ArrayList<Number>();
		
		for(Number element : numbers)
			numberList.add(element);
		
		System.out.printf("numberList contains : %s\n", numberList);
		System.out.printf("Total of the elements in numberList: %.1f\n", sum(numberList));
		
	}
	
	// calculate total of arrayList elements
	public static double sum(ArrayList<Number> list) {
		double total = 0; // initialize total
		
		// calculate sum
		for(Number element : list)
			total += element.doubleValue();
		
		return total;
	}

}
