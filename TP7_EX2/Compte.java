package TP7_EX2;

public class Compte implements Convertible {

	int solde;
	int numero;
	String titulaire;

	public Compte(int numero, String titulaire, int solde) {
		this.titulaire = titulaire;
		this.numero = numero;
		this.solde = solde;

	}

	void deposer(int montant) {
		this.solde = this.solde + montant;
	}

	void retirer(int montant) {
		this.solde = this.solde - montant;
	}

	public int toInt() {
		return solde;
	}

	public void consulter() {
		System.out.println("numéro = " + numero + " date = " + titulaire + " montant = " + solde);
	}

}