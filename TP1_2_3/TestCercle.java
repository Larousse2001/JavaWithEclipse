package TP1_2_3;

public class TestCercle {
    public static void main(String[] args) {
        //Point p1 = new Point(0, 1);
        //Point p2 = new Point(3, 3);
        //Cercle c = new Cercle(1, 2.3f, 4);
        //System.out.println(c.showCaracterists());
        //c.setCentre(-1, -2.3f);
        //c.setRayon(1);

        //System.out.println(c.showCaracterists());

        //if (c.Verif(p1) == true) {
        //    System.out.println("le point "+ p1.toString()+" appartient au cercle");
        //} else { 
        //    System.out.println("le point "+ p1.toString()+" n'appartient pas au cercle");
        //}

        //if (c.Verif(p2) == true) {
        //    System.out.println("le point "+ p2.toString()+" appartient au cercle");
        //} else {
        //    System.out.println("le point "+ p2.toString()+" n'appartient pas au cercle");
        //}
    	
    	
    	//Point p = new Point(1,1);
    	//Cercle c1 = new Cercle(p,10);
    	//Cercle c2 = new Cercle(p,20);
    	
    	//System.out.println(c2.toString());
    	//c2.setCentre(10, 10);
    	
    	//System.out.println(c2.toString());
    	
    	
    	//Cercle c1,c2;
    	//c1=new Cercle(new Point(100,100),new Point(200,200));
    	//c2=new Cercle(new Point(130,100),40);
    	//System.out.println("le perimetre de Cercle1 est "+c1.perimetre()+" de rayon "+c1.getRayon());
    	//System.out.println("le perimetre de Cercle2 est "+c2.perimetre()+" de rayon "+c2.getRayon());
    	//Point p=new Point(120,100);
    	//if (c1.Verif(p) && c2.Verif(p))
    	//System.out.println("oui cette point appartien a l'intersection de deux cercles");

    	//else
    	//System.out.println("non cette point n'appartien pas a l'intersection de deux cercles");
    	//}
    	
    	//Cercle p,q;
    	//p = new Cercle(new Point(100,100),10);
    	//q = new Cercle(new Point(100,100),10);
    	//if (p == q) {
        //    System.out.println("2 cercles confondus");
        //} else {
        //    System.out.println("2 cercles non confondus");
        //}

        //if (p.equals(q) == true) {
        //    System.out.println("2 cercles confondus");
        //} else {
        //    System.out.println("2 cercles non confondus");
        //}

        //if (p.equalss(q) == true) {
        //    System.out.println("2 cercles confondus");
        //} else {
        //    System.out.println("2 cercles non confondus");
        //}
    	
    	
    	Cercle c = new Cercle(new Point(10,10),1);
    	System.out.println(c.showCaracterists());
    	
    	c.setRayon(2*c.getRayon());
    	System.out.println(c.showCaracterists());
    	
    	c.setCentre(-10, -10);
    	
    	Cercle c1 = new Cercle(new Point(0,0),2);
    	if (c.equalss(c1) == true) {
              System.out.println("2 cercles confondus");
        } else {
              System.out.println("2 cercles non confondus");
        }
    	
    	Cercle c2 = new Cercle(new Point(0,0),1);
    	if (c.equalss(c2) == true) {
              System.out.println("2 cercles confondus");
        } else {
              System.out.println("2 cercles non confondus");
        }
    }
}
