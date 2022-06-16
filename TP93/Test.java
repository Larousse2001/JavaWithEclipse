package TP93;

public class Test {

	public static void main(String[] args) {
		Magasin m0 = new Magasin("Salah el mejri");
		Producteur p = new Producteur(m0,"p");
		Consommateur c = new Consommateur(m0,"c");
		
		p.start();
		c.start();

	}

}
