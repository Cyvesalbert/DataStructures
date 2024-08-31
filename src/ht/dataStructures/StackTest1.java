package ht.dataStructures;

//Stack generic class test program.
public class StackTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// Create a Stack< Double > and a Stack< Integer >
		Stack< Double > doubleStack = new Stack< Double >( 5 );
		Stack< Integer > integerStack = new Stack< Integer >();
		
		// push elements of doubleelements onto doubleStack
		testPushDouble(doubleStack, doubleElements);
		testPopDouble(doubleStack); // pop from double stack
		
		// push elements of integerElements onto integerStack
		testPushInteger(integerStack, integerElements);
		testPopInteger(integerStack); // pop from integerStack
	}
	
	// test push method with double Stack
	private static void testPushDouble(Stack<Double> stack, double[] values) {
		System.out.println("\npushingn elements onto double stack");
		
		// push elements to Stack
		for(Double value : values) {
			System.out.printf("%.1f ", value);
			stack.push(value); // push onto double Stack
		}
	}
	
	// test pop method with double stack
	private static void testPopDouble(Stack<Double> stack) {
		// pop elements from stack
		try {
			System.out.println("\npopping  elements from double stack");
			double popValue; // store element removed fromm stack
			
			// remove all elements from Stack
			while(true) {
				popValue = stack.pop(); // pop from doubleStack
				System.out.printf("%.1f ", popValue);
			}
			
		}catch(EmptyStackException emptyStackException) {
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
	
	// test push method with integer stack
	private static void testPushInteger(Stack<Integer> stack, int[] values) {
		System.out.println("\nPushing elements onto integerStack");
		
		// push elements to stack
		for(int value : values	) {
			System.out.printf("%d ", values	);
			stack.push(value); //push onto integerStack
		}
	}
	
	// test pop method with integer stack
	private static void testPopInteger(Stack<Integer> stack) {
		// pop elements from stack
		try {
			System.out.println("\npopping elements from integerStack");
			int popValue; // store element removed from stack
			
			// remove all elements from stack
			while(true) {
				popValue = stack.pop(); // pop from intStack
				System.out.printf("%d ", popValue);
			}
		}catch(EmptyStackException emptyStackException) {
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}

}
