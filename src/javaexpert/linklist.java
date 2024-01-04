package javaexpert;
import java.util.LinkedList;
public class linklist {

	public static void main(String[] args) {
	    LinkedList<String> cars = new LinkedList<String>();
        cars.add("bmw");
     	cars.add("tata");
	   cars.add("fortuner");
			System.out.println(cars);
			cars.addFirst("safari");
			System.out.println(cars);
			cars.addLast("nexon");
			System.out.println(cars.getFirst());
			System.out.println(cars.getLast());
			System.out.println(cars);
			cars.removeFirst();
			System.out.println(cars);
			cars.removeLast();
			System.out.println(cars);
			cars.addFirst("scorpio");
			System.out.println(cars);
			cars.addFirst("verna");
			System.out.println(cars);
			cars.removeFirst();
			System.out.println(cars);
			cars.removeLast();
			System.out.println(cars);
	}
}
	

