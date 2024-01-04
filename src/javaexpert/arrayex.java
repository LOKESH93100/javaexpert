package javaexpert;
import java.util.*;

  public class arrayex {
	public static void main(String[] args) {
		/* ArrayList<String> 
         list1 = new ArrayList<String>();
		 list1.add("ram");
		 list1.add("shyam");
		 list1.add("anshul");
		 System.out.println( "arraylist1:"+list1);
		 
		 
		 ArrayList<String> list2  = new ArrayList<String>();
		 list2.add("rahul");
		 list2.add("pinto");
		 list2.add("amit");
		 System.out.println("arraylist2:"+ list2);
		 list1.addAll(list2);
		 System.out.println("joinned a arraylist: " + list1);
		 Collections.sort(list1);
		 System.out.println("After sorting: " + list1);*/
       // List<Integer> numbers = new ArrayList<>();
        //numbers.add(13);
        //numbers.add(7);
       // numbers.add(18);
       // numbers.add(5);
       // numbers.add(2);

       // System.out.println("arraylist 1: " + numbers);

        // Sorting an ArrayList using Collections.sort() method
     //   Collections.sort(numbers);

     //   System.out.println("After : " + numbers);
        
        
        
    /*    List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(70);
        numbers2.add(180);
        numbers2.add(50);
        numbers2.add(290);

        System.out.println("arraylist  2: " + numbers2);

        // Sorting an ArrayList using Collections.sort() method
        //Collections.sort(numbers);

       // System.out.println("After : " + numbers);
        numbers.addAll(numbers2);
        System.out.println("  after joining    :"+ numbers);
        Collections.sort(numbers);
        System.out.println(numbers);*/
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Apple");
        arrList.add("Banana");
        arrList.add("Pear");
        arrList.add("Mango");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("ArrayList Before Sorting:");
        for(String s: arrList){
           System.out.println(s);
        }

        /* Sorting in decreasing (descending) order*/
        Collections.sort(arrList, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(String str: arrList){
           System.out.println(str);
        }
	}


   
        

		 
		 
		 
		 
		 
	}

}
