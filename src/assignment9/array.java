package assignment9;



import java.util.Collections;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {

		hdtv hdtv1 = new hdtv("AZUZ", 40);//object 1 of HDTV
		hdtv hdtv2 = new hdtv("Apple", 50);
		hdtv hdtv3 = new hdtv("HP", 42);
		java.util.ArrayList<hdtv> list = new java.util.ArrayList<hdtv>(); //Creating an arraylist to store the objects of HDTV class
		list.add(hdtv1);//Appends the specified element to the end of this list
		list.add(hdtv2);
		list.add(hdtv3);
		Collections.sort(list, new comporator());//Sorting object using comparator
		System.out.println("HDTV size");
		Iterator iterator = list.iterator(); //Iterator to iterate the elements in the ist
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}