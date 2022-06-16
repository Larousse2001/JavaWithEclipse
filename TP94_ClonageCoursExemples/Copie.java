package TP94_ClonageCoursExemples;

class Copie {

	public static void main(String arg[]) {
		int[] tableau = { 1, 2 };
		int[] table;
		table = tableau;
		table[0] = 7;
		System.out.println("tableau contient : " + tableau[0] + ", " + tableau[1]);
	}
}
