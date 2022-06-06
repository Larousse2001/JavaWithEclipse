package TP1_2_3;

/**
 * @author Achraf
 */
public class Cercle {
    private Point c;
    private float r;
    final float pi = 3.14f;

    /**
     * 
     * @param cc c'est le centre du cercle
     * @param rr c'est le rayon du cercle
     */
    Cercle(Point cc, float rr) {
        this.c = cc;
        this.r = rr;
    }

    /**
     * 
     * @param x  c'est l'abscisse du point centre
     * @param y  c'est l'ordonne du point du centre
     * @param rr c'est le rayon du cercle
     */
    Cercle(float x, float y, float rr) {
        Point cc = new Point();
        cc.setAbscisse(x);
        cc.setOrdonnee(y);
        this.c = cc;
        this.r = rr;
    }

    /**
     * 
     * @param cc c'est le centre du cercle
     * @param p  c'est le point qui appartient au cercle
     */
    Cercle(Point cc, Point p) {
        this.c = cc;
        this.r = cc.distance(p);
    }

    /**
     * 
     * @return cette fonction retourne le centre
     */
    public Point getCentre() {
        return c;
    }

    /**
     * 
     * @return cette fonction retourne le rayon
     */
    public float getRayon() {
        return r;
    }

    /**
     * 
     * @param newr c'est la nouvelle valeur du cercle
     */
    public void setRayon(float newr) {
        if (newr > 0) {
            this.r = newr;
        }
    }

    /**
     * 
     * @param newx c'est la nouvelle valeur de l'abscisse du centre du cercle
     * @param newy c'est la nouvelle valeur de l'ordonnee du centre du cercle
     */
    public void setCentre(float newx, float newy) {
        this.c.deplacer(newx, newy);
    }

    /**
     * 
     * @return cette fonction retourne la surface du cercle
     */
    public float surface() {
        return (float) (pi * Math.pow(r, 2));
    }

    /**
     * 
     * @return cette fonction retourne le perimetre du cercle
     */
    public float perimetre() {
        return (float) (pi * (2 * r));
    }

    /**
     * 
     * @param p c'est le point donnée
     * @return cette fonction retourne true si un point appartient au cercle snn
     *         false
     */
    public Boolean Verif(Point p) {
        if (this.c.distance(p) <= this.r) {
            return true;
        } else
            return false;
    }

    /**
     * 
     * @return cette fonction retourne toutes les caracteristiques du cercle
     */
    public String showCaracterists() {
        return ("Le cercle du centre " + getCentre() + " de rayon " + getRayon() + " de surface " + surface()
                + " de perimetre " + perimetre());
    }
    
    public String toString() {
    	return "Le cercle de centre " + this.c + " et de rayon " + this.r ;
    }
    
    public boolean equalss(Cercle cc) {
        return ((this.c.equals(cc.c)) && (this.r == cc.r));
    }
}
