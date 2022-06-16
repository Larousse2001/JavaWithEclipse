package TP94_GenereciteCoursExemples;

public class Main {
	public static void main(String[] args) {
		Personne personne1 = new Personne("Lagafe", "Gaston");
		Personne personne2 = new Personne("Talon", "Achile");
		Paire<Personne> bynomePersonne = new Paire<Personne>(personne1, personne2);
		Eleve eleve1 = new Eleve("Guillemet", "Virgule");
		Eleve eleve2 = new Eleve("Mouse", "Mickey");
		Paire<Eleve> bynomeEleve = new Paire<Eleve>(eleve1, eleve2);
		// Personne.afficheBinomes(bynomePersonne);
		// Personne.afficheBinomes(bynomeEleve);
	}
}
