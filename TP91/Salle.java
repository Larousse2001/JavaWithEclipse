package TP91;

public class Salle {
	private static int id;
	private String libelle;
	private String code;
	
	public Salle(int id, String libelle, String code) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Salle.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Salle [libelle=" + libelle + ", code=" + code + "]";
	}
	
	
}


/*
 * L1 est un arraylist de type derivé 
 * L2 est un arraylist de type base
 * il faut affiche "base" il est aussi saisi dans toString dans la classe "base" car il est pointé
 * à la meme case memoire d'un arraylist L1 et L2 donc il va afficher "base"
 * 
 * 
 * Erreur syntaxique car les deuc arraylists ne sont pas compatibles selon le type 
 * Java, il se passe que arraylist "base" et arraylist "derivé" autre classe
*/
