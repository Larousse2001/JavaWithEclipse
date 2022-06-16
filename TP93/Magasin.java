package TP93;

public class Magasin {
	private String nom;
	public static final int max = 3;
	public int nbobjet = 0;

	public Magasin(String nom) {
		this.nom = nom;
	}

	public boolean estPlein() {
		return (nbobjet == max);
	}

	public boolean estVide() {
		return (nbobjet == 0);
	}

	public void ajouter() {
		nbobjet++;
	}

	public void retirer() {
		nbobjet--;
	}
	
	public String toString() {
		return "le magasin de nom : "+nom+" de nombres d'objets : "+nbobjet+"\n";
	}
}
