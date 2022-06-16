package TP94_GenereciteCoursExemples;

class Personne {
	private String nom, prenom;

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Personne(String nom, String prénom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public static void afficheBinomes(PairJoker<? extends Personne> bynomeEleve) {
		Personne premier = bynomeEleve.getPremier();
		Personne deuxieme = bynomeEleve.getDeuxieme();
		System.out.println(premier.getNom() + " et" + deuxieme.getNom() + " sont ensembles.");
		// Ici, nous indiquons que nous pouvons utiliser n'importe quelle classe qui fait
		// partie de l'héritage de Personne, classe de base comprise.
	}
}
