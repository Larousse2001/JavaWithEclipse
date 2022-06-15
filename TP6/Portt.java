package TP6;

import java.util.Vector;

public class Portt implements Affichable{
	private String nom;
	private int capacite;
	private Vector<Barque> v;
	private float taxe;
	private int nbb; //nbre des barques
	
	Portt(String n, float M) {
		this.nom = n;
		this.capacite = nmax;
		this.taxe = M;
		v = new Vector<Barque>(nmax);
		nbb = 0;
	}
	
	public int getNbreBarquesAuPort() {
		return nbb;
	}
	
	public void ajouterBarque(Barque B) {
		if(v.contains(B) == true) System.out.println("Erreur d'ajout : Barque existe deja dans le port "+B);
		else if (nbb >= this.capacite) System.out.println("Port plein");
		else {
			v.add(B);
			System.out.println("Ajout de "+B+" au port");
		}
	}
	
	public void desajouterBarque(Barque B) {
		if(this.existe(B) == false) System.out.println("Erreur de suppression : Barque n'existe plus");
		else {
			v.remove(this.Rechercher(B));
			nbb--;
			System.out.println(B+" est sortie");
		}
	}
	
	public void genererEntreesSorties() {
		System.out.println("Les Barques qui entrent au port "+this.nbb);
		System.out.println("Les Barques qui sortent du port "+(this.capacite - this.nbb));
	}
	
	public void entreeBarque(Barque B) throws ExisteException, ArrayIndexOutOfBoundsException{
		/*
		try {
			v.add(B);
			nbb++;
			System.out.println("Ajout de "+B+" au port");
		}
		catch(Exception e) {
			System.out.println("Erreur d'ajout : Barque existe deja dans le port "+B);
		}
		*/
		if(v.contains(B)) throw new ExisteException(B);
		if(nbb >= this.capacite) throw new ArrayIndexOutOfBoundsException("Le port " + this +
				"ne doit pas depasser la capacité");
		v.add(B);
		nbb++;
		System.out.println("Ajout de "+B+" au port");
		
	}
	
	public void SortieBarque(Barque B) throws InexistantBarqueException{
		try {
			if (Rechercher(B) > nbb) {
				throw new InexistantBarqueException(B);
			} else {
				v.remove(this.Rechercher(B));
				nbb--;
				System.out.println(B + " est sortie");
			}
		} catch (InexistantBarqueException e) {
			System.out.println("Erreur de suppression : Barque n'existe plus");
		}
	}
	
	public int Rechercher(Barque B) {
		for(int i = 0 ; i < nbb ; i++) {
			if(v.get(i).getNum().equals(B.getNum())) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean existe(Barque B) {
		boolean trouve = false;
		int i = 0;
		while( (i < nbb) && (trouve == false) ) {
			if(v.get(i).getNum().equals(B.getNum())) trouve = true;
			else i++;
		}
		return trouve;
	}

	public float recetteJour() {
		float recette = 0;
		for(int i = 0 ; i < nbb ; i++) {
			if(v.get(i) instanceof BarqueMoteur) {
				if (((BarqueMoteur)v.get(i)).getPuissance() <= 5) {
					recette += (this.taxe * 20)/100;
				}
				else if (((BarqueMoteur)v.get(i)).getPuissance() > 5){
					recette += (this.taxe * 10)/100;
				}
			}
		}
		return ((this.taxe*nbb)+recette);
		
	}
	
	public String toString() {	
		return "la port de nom "+this.nom+" de capacite "+this.capacite+" de recette "+this.recetteJour()+
				" de Barques :"; //+Arrays.toString(this.P)
	}
	
	public void afficher() {
		System.out.println(this.toString());
		for(int i = 0 ; i < nbb ; i++) {
			System.out.print("\t");
			v.get(i).afficher();
		}
	}
	
}