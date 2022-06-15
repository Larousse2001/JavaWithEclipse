package TP10;

public class Machine {
	Produit[] tabProduit;
	String reference, role;
	int nb;

	public Machine(String ref, String role, int capacit�) {
		tabProduit = new Produit[capacit�];
		nb = 0;
		this.reference = ref;
		this.role = role;
	}

	public void ajoutproduit(Produit p) throws ChaineVideException, QuantiteNegativeException {
		tabProduit[nb] = new Produit(p.getLibelle(), p.getRef(), p.getQuantite());
		nb++;
	}

}
