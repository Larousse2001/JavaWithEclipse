package TP0;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    private static int count;

    public Personne(String nom, String prenom) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString() {
        return "Je suis " + this.nom + " " + this.prenom + "";
    }
}