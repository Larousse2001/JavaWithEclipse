package TP0;

public class Employe extends Personne {
    protected double salaire;

    public Employe(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public String toString() {
        return super.toString() + " mon salaire est: " + this.salaire;
    }
}
