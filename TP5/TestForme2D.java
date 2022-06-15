package TP5;

public class TestForme2D 
{
	public static void main (String [] args ) 
	{
		Forme2D r1 = new Rectangle("Kerkennah",5,6);
		Forme2D c1 = new Carre("Sfax",2) ;
		Forme2D e1 = new Ellipse("Sousse",2,4) ;
		Forme2D ce1 = new Cercle("Tunis",3) ;
		
		
		Forme2D F[] = new Forme2D[4];
		F[0] = r1;
		F[1] = c1;
		F[2] = e1;
		F[3] = ce1;
		
		for(int i = 0 ; i < F.length ; i++) {
			F[i].affiche_forme();
		}
		
	}
}
