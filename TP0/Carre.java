package TP0;

public class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getSurface() {
        return Math.pow(cote, 2);
    }

    public String toString() {
        return "Carré ( coté " + this.cote + " cm )";
    }
}