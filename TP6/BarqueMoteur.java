package TP6;

public class BarqueMoteur extends Barque implements Affichable{
	private long puissance;
	
	BarqueMoteur(String nn, String n, int p) {
		super(nn,n);
		this.puissance = p;
	}
	
	public long getPuissance() {
		return this.puissance;
	}
	
	public String toString() {
		return "la barque de nom "+this.getNom()+" de numero d'autorisation "+this.getNum()+" de puissance "+this.getPuissance();
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}
}
