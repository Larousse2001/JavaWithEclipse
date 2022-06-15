package TP6;

// import java.util.Arrays;

public class Port implements Affichable {
	private String nom;
	private int capacite;
	private Barque[] P;
	private float taxe;
	private int nbb; // nbre des barques

	Port(String n, float M) {
		this.nom = n;
		this.capacite = nmax;
		this.taxe = M;
		P = new Barque[nmax];
		nbb = 0;
	}

	public int getNbreBarquesAuPort() {
		return nbb;
	}

	public void ajouterBarque(Barque B) {
		if (this.existe(B) == true)
			System.out.println("Erreur d'ajout : Barque existe deja dans le port " + B);
		else if (nbb >= this.capacite)
			System.out.println("Port plein");
		else {
			this.P[nbb++] = B;
			System.out.println("Ajout de " + B + " au port");
		}
	}

	public void desajouterBarque(Barque B) {
		if (this.existe(B) == false)
			System.out.println("Erreur de suppression : Barque n'existe plus");
		else {
			this.P[this.Rechercher(B)] = this.P[nbb - 1];
			this.P[nbb - 1] = null;
			nbb--;
			System.out.println(B + " est sortie");
		}
	}

	public void genererEntreesSorties() {
		System.out.println("Les Barques qui entrent au port " + this.nbb);
		System.out.println("Les Barques qui sortent du port " + (this.capacite - this.nbb));
	}

	public void entreeBarque(Barque B) {
		/*
		 * try { nbb < this.capacite; } catch(Exception e) {
		 * System.out.println("Port plein"); }
		 */
		try {
			this.P[nbb] = B;
			nbb++;
			System.out.println("Ajout de " + B + " au port");
		} catch (Exception e) {
			System.out.println("Erreur d'ajout : Barque existe deja dans le port " + B);
		}

	}

	public void SortieBarque(Barque B) {
		try {
			this.P[this.Rechercher(B)] = this.P[nbb - 1];
			this.P[nbb - 1] = null;
			nbb--;
			System.out.println(B + " est sortie");
		} catch (Exception e) {
			System.out.println("Erreur de suppression : Barque n'existe plus");
		}
	}

	public int Rechercher(Barque B) {
		for (int i = 0; i < nbb; i++) {
			if (P[i].getNum().equals(B.getNum())) {
				return i;
			}
		}
		return -1;
	}

	public boolean existe(Barque B) {
		boolean trouve = false;
		int i = 0;
		while ((i < nbb) && (trouve == false)) {
			if (P[i].getNum().equals(B.getNum()))
				trouve = true;
			else
				i++;
		}
		return trouve;
	}

	public float recetteJour() {
		float recette = 0;
		for (int i = 0; i < nbb; i++) {
			if (P[i] instanceof BarqueMoteur) {
				if (((BarqueMoteur) P[i]).getPuissance() <= 5) {
					recette += (this.taxe * 20) / 100;
				} else if (((BarqueMoteur) P[i]).getPuissance() > 5) {
					recette += (this.taxe * 10) / 100;
				}
			}
		}
		return ((this.taxe * nbb) + recette);

	}

	public String toString() {
		return "la port de nom " + this.nom + " de capacite " + this.capacite + " de recette " + this.recetteJour()
				+ " de Barques :"; // +Arrays.toString(this.P)
	}

	public void afficher() {
		System.out.println(this.toString());
		for (int i = 0; i < nbb; i++) {
			System.out.print("\t");
			P[i].afficher();
		}
	}

}
