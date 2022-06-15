package TP7;

//Java program Illustrating Set Interface

//Importing utility classes
import java.util.*;

//Main class
public class GFD {

	// Main driver method
	public static void main(String[] args) {
		// Demonstrating Set using HashSet
		// Declaring object of type String
		Set<String> hash_Set = new HashSet<String>();

		// Adding elements to the Set
		// using add() method
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");

		// Printing elements of HashSet object
		System.out.println(hash_Set);
		
		/*
		 *  Union of the two Set[0, 1, 2, 3, 4, 5, 7, 8, 9]
			Intersection of the two Set[0, 1, 3, 4]
			Difference of the two Set[2, 8, 9]
		 */
	}
}
