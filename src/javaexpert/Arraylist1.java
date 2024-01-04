package javaexpert;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		list.add("grapes");
		System.out.println(list);
		list.add("pineapple");
		System.out.println(list);
		list.add(1,"jack");
		System.out.println(list);
		list.remove("apple");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add("mango");
		System.out.println(list);
		list.remove("mango");
		System.out.println(list);
		list.addFirst("apple");
		System.out.println( "the original list:" +list);
		//String element = list.get(4); 
		 //  System.out.println("The element at index 4 is " + element);
		  // System.out.println(list);
		  //String  elements = list.set(1, "guvava");
		  //System.out.println(list);
		  list.add("cheery");
		  System.out.println(list);
	     System.out.println(" the size of Arraylist Size = " + list.size());
		// System.out.println("the size of arratlist =" +list.size());
		 //String element = list.set(1, "banana1");                  // SET VALUES AT SPECIFIC POSITION
		// System.out.println(list);
		// String elements = list.get(3);
		// System.out.println( "the element of 3 position =" + elements);*/
		//      System.out.println("Arraylist Size = " + arrayList.size());

		//System.out.println(list);
	//	Collections.sort(list);
	//	System.out.println("after sorting" + list);
		//Collections.reverse(list);
	//	System.out.println("the array list after reverse order:" + list);
	//	String elements = list.set(3, "graps");
	//	System.out.println(list);
	//	String  element = list.get(3);
	//	System.out.println( " the element 3 :"+ element);*/
		 // create ArrayList
     //   ArrayList<String> Arr1
       //     = new ArrayList<String>();
 
        // Insert elements in ArrayList
     /*   Arr1.add("Mukul");
        Arr1.add("Rahul");          //addition of two arraylist
        Arr1.add("Suraj");
        Arr1.add("Mayank");
 
        // print ArrayList1
        System.out.println("arraylist1" +Arr1);
        
        
        ArrayList<String> Arr2
        = new ArrayList<String>();
        Arr2.add("apple");
        Arr2.add("canana");
        Arr2.add("bgeey");
        System.out.println("arraylist2" + Arr2);
        Arr1.addAll(Arr2);
        System.out.println("the addition of two  arraylist is :" + Arr1);
        Collections.sort(Arr1);
        System.out.println("the arraylist after sorting:"  + Arr1);*/
        
        
        //clone arraylist
        
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		list.add("grapes");
		System.out.println( "the orignal arraylist:" +list);
		
		ArrayList<String> list2 = (ArrayList)list.clone();
		System.out.println("clone arraylist:" + list2);
		

                         
 
    }
}

		
	 
