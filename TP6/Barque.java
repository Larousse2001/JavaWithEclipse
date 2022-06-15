package TP6;

public class Barque implements Affichable{
	private String nom;
	private String numeroAutorisation;
	
	Barque(String nn,String n) {
		this.nom = nn;
		this.numeroAutorisation = n;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getNum() {
		return this.numeroAutorisation;
	}
	
	public String toString() {
		return "la barque de nom "+this.nom+" de numero d'autorisation "+this.numeroAutorisation;
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}
}
