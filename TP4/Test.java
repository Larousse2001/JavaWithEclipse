package TP4;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Repertoire R = new Repertoire(4);
		Contact C1 = new Contact("LAMIA" , new long[] {1526285,151555} );
		Contact C2 = new Contact("ACHraf" , new long[] {2651515});
		Contact C3 = new Contact("mahmoud" , new long[] {15249885,1510000});
		Contact C4 = new Contact("fawz" , new long[] {26777515});

		R.ajouterContact(C1);
		R.ajouterContact(C2);
		R.ajouterContact(C3);
		R.ajouterContact(C4);
		System.out.println(R.toString());
		System.out.println();
		System.out.println();
		R.supprimer(2);
		System.out.println(R.toString());
		System.out.println();
		System.out.println();
		
		Contact[] repTri = R.getContactsTries();
		System.out.println(Arrays.toString(repTri));
		
		System.out.println();
		System.out.println();
		System.out.println(R.Rechercher("salah"));
		System.out.println(R.Rechercher("Achraf"));
		
		
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(R.gettels("Achraf")));
		

	}

}
