package TP0;

public class Etudiant extends Personne {
    private String cne;

    public Etudiant(String nom, String prenom, String cne) {
        super(nom, prenom);
        this.cne = cne;
    }

    public String toString() {
        return super.toString() + " mon CNE est: " + this.cne;
    }
}
