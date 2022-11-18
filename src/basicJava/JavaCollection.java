package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JavaCollection {
	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<Integer>();
	    System.out.println(arr.size());
//	    {10,20,30,40,50}
	    arr.add(10);
	    arr.add(20);
	    arr.add(30);
	    arr.add(40);
	    arr.add(50);
	    
	    System.out.println(arr.size());
	    System.out.println(arr.get(3));
	    arr.set(3, 4);
	    System.out.println(arr.get(3));
	}
}
