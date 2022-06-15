package TP7;

//Java code to demonstrate Working of Set by
//Accessing the Elements og the Set object

//Importing all utility classes
import java.util.*;

//Main class
class GFE {

	// Main driver method
	public static void main(String[] args) {
		// Creating an object of Set and
		// declaring object of type String
		Set<String> hs = new HashSet<String>();

		// Elements are added using add() method
		// Later onwards we wil show accessing the same

		// Custom input elements
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("A");

		// Print the Set object elements
		System.out.println("Set is " + hs);

		// Declaring a string
		String check = "D";

		// Check if the above string exists in
		// the SortedSet or not
		// using contains() method
		System.out.println("Contains " + check + " " + hs.contains(check));
		
		/*
		 * [A, B, C]
		 */
	}
}
