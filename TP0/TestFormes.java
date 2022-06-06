package TP0;

import java.text.DecimalFormat;

// pour avoir 2 chiffres après la virgule
public class TestFormes {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".##");
        Forme[] figures = new Forme[3];
        figures[0] = new Carre(3); // Création d'un carré de 2 cm de coté
        figures[1] = new Cercle(4); // Création d'un cercle de 4 cm de rayon
        figures[2] = new Carre(2.4); // Création d'un carré de 2.4 cm de coté
        for (int i = 0; i < figures.length; i++)
            System.out.println(figures[i] + " : surface = " + df.format(figures[i].getSurface()) + " cm2");
    }
}