package TP7;

//Java program to demonstrate the
//creation of Set object using
//the LinkedHashset class
import java.util.*;

class GFL {

	public static void main(String[] args) {
		Set<String> lh = new LinkedHashSet<String>();

		// Adding elements into the LinkedHashSet
		// using add()
		lh.add("India");
		lh.add("Australia");
		lh.add("South Africa");

		// Adding the duplicate
		// element
		lh.add("India");

		// Displaying the LinkedHashSet
		System.out.println(lh);

		// Removing items from LinkedHashSet
		// using remove()
		lh.remove("Australia");
		System.out.println("Set after removing " + "Australia:" + lh);

		// Iterating over linked hash set items
		System.out.println("Iterating over set:");
		Iterator<String> i = lh.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
		/*
		 * [India, Australia, South Africa]
			Set after removing Australia:[India, South Africa]
			Iterating over set:
			India
			South Africa
		 */
	}
}
