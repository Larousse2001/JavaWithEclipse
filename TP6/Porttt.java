package TP6;

public class Porttt implements Affichable {
	private String nom;
	private int capacite;
	private Barque[] Barques;
	private double montant;
	private int nbb;

	// ArrayList<Barque> Barques1 = new ArrayList<Barque>()
	public Porttt(String nom, double montant) {
		this.nom = nom;
		// this.capacite = c;
		this.montant = montant;
		Barques = new Barque[nmax];
		nbb = 0;
	}

	public int NbBarquePort() {
		return nbb;
	}

	public void ajouterBarque(Barque b) {
		if (existe(b)) {
			System.out.println(b + " existe deja dans le port ");
		} else if (nbb == capacite) {
			System.out.println("Port plein");
		} else {
			Barques[nbb++] = b;
			// Barques1.add(b);
			// nbb++;
			System.out.println("Ajout de " + b + " au port");
		}
	}

	public int indice(Barque b) {
		int i = 0;
		while (i <= nbb) {
			if (Barques[i].getNum().equals(b.getNum())) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public boolean existe(Barque b) {
		int i = 0;
		if (nbb == 0)
			return false;
		while (i < nbb) {
			if (b.getNum().equals(Barques[i].getNum()))
				return true;
			i++;
		}
		return false;
	}

	public void supprimerBarque(Barque b) {
		if (indice(b) != -1) {
			Barques[indice(b)] = Barques[--nbb];
			// Barques1.remove(indice(b))
			Barques[nbb] = null;
			System.out.println("la barque " + b + " est supprimer");
		} else {
			System.out.println("erreur de supression");
		}

	}

	public double recette() throws PortException {
		double recette = 0;
		if (nbb == 0)
			throw new PortException("le port est vide ");
		else {
			for (int i = 0; i < nbb; i++) {
				if (Barques[i] instanceof BarqueMoteur) {
					if (((BarqueMoteur) (Barques[i])).getPuissance() < 5) {
						recette += montant * 1.1;
					} else {
						recette += montant * 1.2;
					}
				} else {
					recette += montant;
				}

			}
			return recette;
		}
	}

	public void entreBarque(Barque b) {

		try {
			Barques[nbb] = b;
			nbb++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Port plain");
		}
		try {
			this.Barques[nbb] = b;
			nbb++;
			System.out.println("Ajout de " + b + " au port");
		} catch (Exception e) {
			System.out.println("Erreur d'ajout : Barque existe deja dans le port " + b);
		}
	}

	public int rechercher(Barque b) throws BarqueIntrouvableException {
		int i = 0;
		while ((i < nbb) && !Barques[i].equals(b))
			i++;
		if (i >= nbb)
			throw new BarqueIntrouvableException("Barque " + b + "n'est pas dans le port");
		return i;
	}

	public void sortieBarque(Barque b) throws BarqueIntrouvableException {
		int i = rechercher(b);
		if (i >= 0) {
			Barques[rechercher(b)] = Barques[--nbb];
			// Barques1.remove(indice(b))
			Barques[nbb] = null;
			System.out.println("la barque " + b + " est supprimer");
		} else
			throw new BarqueIntrouvableException("Erreur suppression: " + b + " n'existe pas dans le Port");

	}

	public String toString() {
		String p = "le Port : ";
		for (int i = 0; i < nbb; i++) {

			p += Barques[i] + "\n\t  ";
		}
		/*
		 * for (Barque i : Barques1) { System.out.println(i); }
		 */
		return p;
	}

	public void afficher() {
		System.out.println(toString());
	}
}

