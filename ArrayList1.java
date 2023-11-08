//Array List
package Arrays;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> myMusicians =new ArrayList<String>();		
		
		myMusicians.add("James");
		myMusicians.add("Lars");
		myMusicians.add(1, "Kirk"); // Kirk'i 1.index e yazdırdık
		myMusicians.add("Rob");
		
		System.out.println(myMusicians.get(0));
		System.out.println(myMusicians.get(1));
		System.out.println(myMusicians.get(2));
		System.out.println(myMusicians.get(3));
	}

}
