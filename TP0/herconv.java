package TP0;/**
 * Ce programme sert à montrer la convertion de type avec héritage en Java
 */


/**
 * Classe de base: vehicule
 */

class vehicule {

    public double vitesse;
    public int nbre_passagers;

    /**
     * constructeur
     * 
     * @param v  la vitesse du véhicule
     * @param np nbre de passagers dans le véhicule
     */
    public vehicule(double v, int np) {
        vitesse = v;
        nbre_passagers = np;
    }

    /**
     * pour afficher les membres private.
     */
    public void affiche() {
        System.out.println("vitesse: " + vitesse + " ; nbre_passagers: " + nbre_passagers);
    }
}

/**
 * Classe dérivée : avion Héritage à partir de la classe de base : vehicule
 */
class avion extends vehicule {

    public int nbre_moteurs;

    /**
     * constructeur
     * 
     * @param nm le nombre de moteurs
     */

    public avion(int nm, double v, int np) {
        super(v, np); // appel au constructeur de vehicule
        nbre_moteurs = nm;
    }

    /**
     * pour afficher les membres private.
     */
    public void affiche() {
        super.affiche(); // appel à la méthode affiche de la classe de base
        System.out.println("nbre de moteurs: " + nbre_moteurs);
    }
}

public class herconv {

    public static void main(String[] args) {
        vehicule v = new vehicule(200., 300);
        v.affiche();
        avion boeing = new avion(4, 200., 300);
        boeing.affiche();

        v = boeing;

        v.vitesse = 500.6; // Erreur car champ nbre_moteur ne fait pas partie de vehicule

        // v.nbre_moteur = 5; // Erreur car champ nbre_moteur ne fait pas partie de
        // vehicule

        v.affiche();
        v = new vehicule(800., 500);

        // boeing = v; // Erreur! Un vehicule n'est pas forcémment un avion

        // boeing = (avion) v; // ok à la compilation, mais exécution, le programme
        // plante.

        System.exit(0);
    }
}