package TP0;/**
 * Ce programme sert à montrer la surdéfinition
 * des méthodes lors de l'héritage, en Java
 */


/**
 * Classe de base: A
 */

class A {

    /**
     * pour afficher un message relatif à la classe A.
     * 
     * @param n : un entier bidon ...
     */
    public void affiche(int n) {
        System.out.println("classe A: " + n);
    }
}

/**
 * Classe dérivée : B Héritage à partir de la classe de base : B
 */
class B extends A {

    /**
     * Surdéfinition: même nom, mais signature différente. peu importe le type de
     * retour pour afficher un message relatif à la classe B.
     * 
     * @param z : un double bidon ...
     * @return a <code>boolean</code> pour signifier affichage ok.
     */
    public boolean affiche(double z) {
        System.out.println("classe B: " + z);
        return true;
    }
}

/**
 * classe de test point d'entrée pour la machine virtuelle.
 */

public class hersurd {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        int w = 4;
        double k = 55.9;

        a.affiche(w); // affcihe(int) de A

        // a.affiche(k); // affiche(int) de A => Erreur: impossible de convertir un
        // double vers int
        // b.affiche(w); // affiche(int) de A ou affiche(double) de B => Erreur : les
        // deux possibilités
        // se trouvent au même niveau.

        b.affiche(k); // affiche(double) de B

        System.exit(0);
    }
}