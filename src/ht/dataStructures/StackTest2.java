package ht.dataStructures;

//Passing generic Stack objects to generic methods
public class StackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Integer [] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// Create a Stack< Double > and a Stack< Integer >
		Stack< Double > doubleStack = new Stack< Double >( 5 );
		Stack< Integer > integerStack = new Stack< Integer >();
		
		// push elements of doubleelements onto doubleStack
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack); // pop from double stack
		
		// push elements of integerElements onto integerStack
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack); // pop from integerStack
	}
	
	// generic method testPush pushes elements onto a stack
	public static <T> void testPush(String name, Stack<T> stack, T[] elements) {
		System.out.printf( "\nPushing elements onto %s\n", name );
		
		//push elements onto stack
		for(T element : elements) {
			System.out.printf( "%s ", element );
			stack.push( element ); // push element onto stack
		}
	}
	
	// generic method testPop pops elements from a stack
	public static <T> void testPop(String name, Stack<T> stack) {
		// pop elements from stack
		try {
			System.out.printf( "\nPopping elements from %s\n", name );
			T popValue; // store element removed from stack
			
			//remove all elements from 
			while(true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		}catch(EmptyStackException emptyStackException) {
			System.out.println();
			emptyStackException.printStackTrace();
		}
	}

}
