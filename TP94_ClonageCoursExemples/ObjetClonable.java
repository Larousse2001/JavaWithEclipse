package TP94_ClonageCoursExemples;

public class ObjetClonable implements Cloneable {
	private int entierLocal = 1;
	private EntierA entierA = new EntierA();
	private int[] tableau = { 0, 100 };
	private EntierB entierB = new EntierB();

	@Override
	public Object clone() throws CloneNotSupportedException {
		ObjetClonable copie = (ObjetClonable) super.clone();
		copie.entierA = (EntierA) entierA.clone();
		copie.tableau = new int[tableau.length];
		System.arraycopy(tableau, 0, copie.tableau, 0, tableau.length);
		return copie;
	}

	public int getEntierLocal() {
		return entierLocal;
	}

	public void setEntierLocal(int entier) {
		this.entierLocal = entier;
	}

	public int[] getTableau() {
		return tableau;
	}

	public EntierA getEntierA() {
		return entierA;
	}

	public EntierB getEntierB() {
		return entierB;
	}
}
