package TP0;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getSurface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public String toString() {
        return "Cercle ( rayon " + this.rayon + " cm )";
    }
}
