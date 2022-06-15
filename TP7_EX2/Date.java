package TP7_EX2;

public class Date implements Convertible {

	int jour;
	int mois;
	int annee;

	public Date(int j, int m, int a) {
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}

	public void afficherDate() {
		System.out.println(this.jour + " , " + this.mois + " , " + this.annee);
	}

	public int toInt() {
		return annee * 10000 + mois * 100 + jour;
	}

}
