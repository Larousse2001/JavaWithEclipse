package TP8;

public class Employer implements Comparable{

	private String id;
	private String nom;
	private float salaire;
	
	public Employer(String id, String nom, float salaire) {
		this.id = id;
		this.nom= nom;
		this.salaire= salaire;
	}

	public String getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	public float getSalaire() {
		return salaire;
	}
	
	public String toString() {
		return "Employer [id=" + id + ", nom=" + nom + ", salaire=" + salaire + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return nom.compareTo(((Employer)o).nom);
	}
	
}
