package TP6;

public class TestPort {

	public static void main(String[] args) throws ExisteException,InexistantBarqueException {
		BarqueMoteur B = new BarqueMoteur("Lamya","1590",4);
		BarqueMoteur Bm = new BarqueMoteur("Achraf","0951",10);
		Barque Br = new Barque("Racha","9999");
		Port P = new Port("Kerkenah",15);
		
		Affichable []a = new Affichable[3];
		
		
		P.ajouterBarque(B);
		P.ajouterBarque(Bm);
		P.ajouterBarque(Br);
		P.desajouterBarque(Bm);
		P.desajouterBarque(Bm);
		P.ajouterBarque(B);
		System.out.println("La recette du jour est "+P.recetteJour());
		System.out.println("");
		System.out.println("");
		P.genererEntreesSorties();
		
		P.afficher();
		
		System.out.println("");
		System.out.println("");
		
		
		a[0] = P;
		a[1] = B;
		a[2] = Bm;
		// System.out.println(Arrays.toString(a));
		for(int i = 0 ; i < a.length ; i++) {
			a[i].afficher();
		}
		
		System.out.println("");
		System.out.println("");

		Portt Pr = new Portt("Kerkenah",15);
		
		try{
			Pr.entreeBarque(Br);
		} catch (Exception e) {
			
		}
		try{
			Pr.entreeBarque(B);
		} catch (ArrayIndexOutOfBoundsException | ExisteException e) {
			// System.out.println("Port plain");
			e.printStackTrace();
			e.getMessage();
		}
		P.SortieBarque(Br);
		P.SortieBarque(Br);
		
	}

}
