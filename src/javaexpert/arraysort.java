package javaexpert;
import java.util.*;

public class arraysort {

	public static void main(String[] args) {
		/*ArrayList<String> arrlist = new ArrayList();
		arrlist.add("apple");
		arrlist.add("banana");
		arrlist.add("mango");
		arrlist.add("pear");
		System.out.println("the arraylist before sorting");
		  for(String s: arrlist){
	           System.out.println(s);
	           Collections.sort(arrlist, Collections.reverseOrder());
	           System.out.println("ArrayList in descending order:");
	           for(String str: arrlist){
	              System.out.println(str);*/
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Mango");
	    linkedlist.add("Banana"); 
	    linkedlist.add("Pear");
	    linkedlist.add("Apple");
	    linkedlist.add("Orange");
	    // Converting LinkedList to ArrayList
	    List<String> list = new ArrayList(linkedlist);

	    for (String s : list) {
	      System.out.println(s);
	    } 
	  }
	} 

	     
	


	
	
	    

	     
	        
	


