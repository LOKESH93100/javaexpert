package javaexpert;
import java.util.LinkedList;
import java.util.Queue;
 
public class queueex {

	public static void main(String[] args) {
		 Queue<String> queue = new LinkedList<>();
		 queue.add("apple");
		 queue.add("banana");       //ADD elements
		 queue.add("mango");
		 queue.add("apple");
		 System.out.println(queue);
		 queue.remove("apple");  //Remove apple
		 System.out.println(queue);
		 queue.add("pineapple");
		 System.out.println(queue);
		 String peeked = queue.peek();
	        System.out.println("Peeked element: " + peeked);
	       System.out.println(queue);
	       queue.poll();
	       System.out.println(queue);
	       queue.add("chery");
	       System.out.println(queue);
	       
	
	       
	   	
	       
		 
		 

	}

}
