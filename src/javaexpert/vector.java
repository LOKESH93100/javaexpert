package javaexpert;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("tiger");
		vec.add("dog");
		vec.add("lion");
		vec.add("elephant");
		vec.add("deer");
		System.out.println(vec);
		vec.add("rat");
		vec.add("mouse");
		System.out.println(vec);
		 System.out.println("Size is: "+vec.size());
		 System.out.println("the orignal vector:"+ vec);
		// System.out.println("the clone vector :"+vec.clone());
		// System.out.println("the element:" + vec.get());
		// System.out.println("Index of element is: " +in.indexOf(lion));
		// System.out.println("the index of element is:" +vec.indexOf("lion"));
		// vec.set(4,"deer");
		 vec.removeElementAt(1);
		 System.out.println("Size is: "+vec.size());
		 System.out.println(vec);
	}

}
