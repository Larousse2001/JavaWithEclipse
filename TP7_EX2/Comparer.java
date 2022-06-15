package TP7_EX2;

public class Comparer {

	static boolean plusGrand(Convertible c1, Convertible c2) {
		return c1.toInt() > c2.toInt();
	}

	static boolean plusPetit(Convertible c1, Convertible c2) {
		return c1.toInt() < c2.toInt();
	}

	static boolean egal(Convertible c1, Convertible c2) {
		return c1.toInt() == c2.toInt();
	}

	// tri par selection sur lestableaux
	static void trier(Convertible[] tab) {
		// Tri
		for (int i = 0; i <= tab.length - 2; i++) {
			// Recherche du min dans [i .. tab.lentgh-1]
			int Im = i;
			for (int j = i + 1; j <= tab.length - 1; j++) {
				if (plusPetit(tab[j], tab[Im])) {
					Im = j;
				}
			}
			// Echange de tab[i] avec le min trouve
			Convertible tampon = tab[i];
			tab[i] = tab[Im];
			tab[Im] = tampon;
		}
	}

	public static void main(String[] args) {
		Convertible c1, c2, c3;
		Convertible[] t = new Convertible[3];
		c1 = new Date(10, 12, 2011);
		c2 = new Date(1, 1, 2014);
		c3 = new Compte(1, "ameni", 1000);
		((Compte) c3).deposer(40000);
		System.out.println(plusPetit(c1, c2));
		System.out.println(plusGrand(c1, c3));
		t[0] = c1;
		t[1] = c2;
		t[2] = c3;
		trier(t);
		System.out.println("Tableau trie: ");
		for (int i = 0; i <= t.length - 1; i++) {
			System.out.println(" ");
			System.out.println("Convertible " + t[i] + ": toInt(): " + t[i].toInt());
		}

	}

}
