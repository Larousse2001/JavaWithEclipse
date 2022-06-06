package TP0;
/**
 * Ce programme sert à montrer l'héritage en Java
 * Le cas de la redéfinition de méthodes
 */

/**
 * Classe de base: vehicule
 */

class voiture {

    private double vitesse;
    private int nbre_passagers;

    /**
     * constructeur
     * 
     * @param v  la vitesse du véhicule
     * @param np nbre de passagers dans le véhicule
     */
    public voiture(double v, int np) {
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
class plane extends voiture {

    private int nbre_moteurs;

    /**
     * constructeur
     * 
     * @param nm le nombre de moteurs pour le constructeur de véhicule
     * @param v  la vitesse du véhicule
     * @param np nbre de passagers dans le véhicule
     */

    public plane(int nm, double v, int np) {
        super(v, np); // appel au constructeur de vehicule
        nbre_moteurs = nm;
    }

    /**
     * La méthode affiche de la classe de base sera masquée par la méthode affiche
     * suivante ...
     * 
     * @see Vehicule#affiche
     */
    public void affiche() {
        super.affiche(); // appel à la méthode affiche de la classe de base
        System.out.println("nbre de moteurs: " + nbre_moteurs);
    }
}

/**
 * Classe dérivée : moto Héritage à partir de la classe de base : vehicule
 */

class moto extends voiture {

    public moto(double v, int np) {
        super(v, np);
    }

    private double cylindree;

    /**
     * constructeur
     * 
     * @param cy la cylindrée en cm3. pour le constructeur de véhicule
     * @param v  la vitesse du véhicule
     * @param np nbre de passagers dans le véhicule
     */
    public moto(double cy, double v, int np) {
        super(v, np); // appel au constructeur de vehicule
        cylindree = cy;
    }

    /**
     * La méthode affiche de la classe de base sera masquée par la méthode affiche
     * suivante ...
     * 
     * @see Vehicule#affiche
     */
    public void affiche() {
        super.affiche(); // appel à la méthode affiche de la classe de base
        System.out.println("La cylindrée de la moto: " + cylindree);
    }
}

/**
 * classe de test point d'entrée pour la machine virtuelle.
 */

public class herred {

    public static void main(String[] args) {
        voiture v = new voiture(200., 300);
        v.affiche();
        plane boeing = new plane(4, 200., 300);
        boeing.affiche();
        moto suzuki = new moto(1200., 200., 2);
        suzuki.affiche();
        System.exit(0);
    }
}