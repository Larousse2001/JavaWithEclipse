package TP10;

public class Produit implements Comparable {
	private String libelle;
	private String ref;
	private int quantite;

	public Produit(String libelle, String ref, int quantite) throws ChaineVideException, QuantiteNegativeException {
		if (libelle.length() == 0 || ref.length() == 0 || libelle == null || ref == null) {
			throw new ChaineVideException("chaine vide");
		}
		if (quantite < 0) {
			throw new QuantiteNegativeException("il n'ya pas de quantité");
		}
		this.libelle = libelle;
		this.ref = ref;
		this.quantite = quantite;
	}

	public int hashCode() {
		int h = 1;
		h = 31 * h + ref.hashCode();
		h = 31 * h + libelle.hashCode();
		h = 31 * h + quantite;
		return h;
	}

	public boolean equals(Object op) {
		Produit p = (Produit) op;
		return (p instanceof Produit) && p.getLibelle().equals(libelle) && p.getRef().equals(ref)
				&& p.getQuantite() == quantite;
	}

	public int compareTo(Object o) {
		Produit p = (Produit) o;
		if (p.equals(this)) {
			return 0;
		} else if (p.getQuantite() > quantite) {
			return -1;
		} else
			return 1;
	}

	public String toString() {
		return "Produit[" + getLibelle() + ", " + getRef() + ", " + getQuantite() + "]";
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
