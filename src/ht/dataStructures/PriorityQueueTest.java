package ht.dataStructures;

import java.util.PriorityQueue;

//  PriorityQueue test program
public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// queue of capacity 11
		PriorityQueue<Double> queue = new PriorityQueue<Double>();
		
		// insert elements to  queue
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		
		System.out.print("polling from queue: ");
		
		// display elements in queue
		while(queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek()); // view top element
			queue.poll(); // remove top element
		}
		
		
	}

}
