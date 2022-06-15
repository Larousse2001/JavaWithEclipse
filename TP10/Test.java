package TP10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		Set s = new HashSet();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		try {
			for (int i = 0; i < n; i++) {

				String info = scanner.next();
				StringTokenizer st = new StringTokenizer(info, ", ");
				String libelle = st.nextToken();
				String refence = st.nextToken();
				int quantité = Integer.parseInt(st.nextToken());
				Produit p = new Produit(libelle, refence, quantité);
				s.add(p);
			}
		} catch (ChaineVideException e1) {
			System.out.println(e1.getMessage());
		} catch (QuantiteNegativeException e2) {
			System.out.println("Quantite negative!!!!");
		}

	}
}
