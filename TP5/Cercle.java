package TP5;

public class Cercle extends Ellipse
{
	Cercle(String nom , float d1 )
	{
		super(nom,d1,d1);
	}
	
	public void affiche_forme() {
		System.out.println("Je suis un cercle "+toString());
	}
	
}
