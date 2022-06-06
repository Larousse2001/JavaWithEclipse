package TP1_2_3;

public class Point {
    private float abscisse;
    private float ordonnee;

    Point(float x, float y) {
        this.abscisse = x;
        this.ordonnee = y;
    }

    Point() {

    }

    public float getAbscisse() {
        return abscisse;
    }

    public float getOrdonnee() {
        return ordonnee;
    }

    public void setAbscisse(float newAbscisse) {
        abscisse = newAbscisse;
    }

    public void setOrdonnee(float newOrdonnee) {
        ordonnee = newOrdonnee;
    }

    public String toString() {
        return ("le point d'abscisse " + getAbscisse() + " et d'ordonnee " + getOrdonnee());
    }

    public boolean equals(Point p) {
        return ((this.abscisse == p.abscisse) && (this.ordonnee == p.ordonnee));
    }

    public static boolean equalss(Point p1, Point p2) {
        return ((p1.abscisse == p2.abscisse) && (p1.ordonnee == p2.ordonnee));
    }   

    public float distance(Point p) {
        return (float) (Math
                .sqrt(Math.pow(((this.abscisse) + (p.abscisse)), 2) + Math.pow(((this.ordonnee) + (p.ordonnee)), 2)));
    }

    public void afficher() {
        System.out.println("le point d'abscisse " + abscisse + " et d'ordonnée " + ordonnee);
    }

    public void deplacer(float dx, float dy) {
        abscisse = abscisse + dx;
        ordonnee = ordonnee + dy;
    }
}
