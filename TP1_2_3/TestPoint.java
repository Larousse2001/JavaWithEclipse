package TP1_2_3;

public class TestPoint {
    public static void main(String[] args) {
    	Point p1 = new Point(1, 2.3f);
        Point p2 = new Point();
        p1.deplacer(-0.5f, 0.7f);

        p2.setAbscisse(p1.getAbscisse());
        p2.setOrdonnee(p1.getOrdonnee());

        if (p1 == p2) {
            System.out.println("2 points egaux");
        } else {
            System.out.println("2 points non egaux");
        }

        if (p1.equals(p2) == true) {
            System.out.println("2 points egaux");
        } else {
            System.out.println("2 points non egaux");
        }

        if (Point.equalss(p1, p2) == true) {
            System.out.println("2 points egaux");
        } else {
            System.out.println("2 points non egaux");
        }

        System.out.println(p1);
        System.out.println(p2.toString());
        // p1.afficher();

        System.out.println(p1.distance(p2));
    }
}
