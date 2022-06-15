package TP5;

public class Carre extends Rectangle
{
	Carre (String nom , float d1 )
	{
		super(nom,d1,d1);
	}
	
	public void affiche_forme() {
		System.out.println("Je suis un carre "+toString());
	}

}
