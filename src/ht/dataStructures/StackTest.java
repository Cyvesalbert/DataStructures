package ht.dataStructures;
import java.util.EmptyStackException;
import java.util.Stack;
// Stack class of package java.util.
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Number> stack = new Stack<Number>(); // create stack
		
		// use push method
		stack.push(12L); // push long value 12L
		System.out.println("pushed 12L");
		printStack(stack);
		stack.push(34567); // push int value 34567
		System.out.println("pushed 34567");
		printStack(stack);
		stack.push(1.0F); // push float value 1.0F
		System.out.println("pushed 1.0F");
		printStack(stack);
		stack.push(1234.5678); // push double value 1234.5678
		System.out.println("pushed 1234.5678");
		printStack(stack);



		// remove items from stack
		try {
			Number removeObject = null;
			
			// pop elements from stack
			while(true) {
				removeObject = stack.pop(); // use pop method
				System.out.printf("Popped %s\n", removeObject);
				printStack(stack);
			}
		}catch(EmptyStackException emptyStackException) {
			emptyStackException.printStackTrace();
		}

	}

	
	// display stack contents
	private static void printStack(Stack<Number> stack) {
		if(stack.isEmpty())
			System.out.println("stack is  empty\n"); // the stack is empty
		else // stack is not empty
			System.out.printf("stack contains: %s (top)\n", stack);
	}
}
