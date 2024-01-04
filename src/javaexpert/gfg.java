package javaexpert;
import java.util.*;

public class gfg {

	public static void main(String[] args) {
		 Queue<Integer> pQueue
         = new PriorityQueue<Integer>();

     // Adding items to the pQueue
     // using add()
     pQueue.add(10);
     pQueue.add(20);
     pQueue.add(15);

     // Printing the top element of
     // the PriorityQueue
     System.out.println(pQueue.peek());


	}

}
