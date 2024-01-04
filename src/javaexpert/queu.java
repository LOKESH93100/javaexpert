package javaexpert;
import java.util.LinkedList;
import java.util.Queue;

 public class queu {

	public static void main(String[] args) {
		 Queue<String> queue = new LinkedList<>();
		 
	       // add elements to the queue
	        queue.add("apple");
	        queue.add("banana");
	        queue.add("cherry");
	        System.out.println(queue);
	        queue.add("banana1");
	        queue.add("pineapple");
	        System.out.println(queue);
	        queue.remove("banana1");
	        System.out.println(queue);
	        System.out.println("Poll Method " + queue.poll());
	        System.out.println(queue);

	}
 }
          
            
		 
	 



}
